package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import domain.ProductDTO;
import enums.Action;
import proxy.PageProxy;
import proxy.Pagination;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CategoryServiceImpl;
import service.CustomerServiceImpl;
import service.ProductServiceImpl;

public class ListCommand extends Command{
	// ?cmd=list&page=list&page_num=2&page_size=5
	public ListCommand(Map<String,Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy)pxy.get("req");
		HttpServletRequest request = req.getRequest();
		System.out.println("list커멘드 진입!");
		PageProxy pagePxy = new PageProxy();
		Pagination page = new Pagination();
		page.carryOut(request);
		pagePxy.carryOut(page);
		String flag = request.getParameter("cmd").toUpperCase();
		
		List<?> list = new ArrayList<>(); //지네릭스 방식. ?는 와일드카드
		switch(Action.valueOf(flag)){
		case CUS_LIST: 
			list = CustomerServiceImpl
				.getInstance()
				.bringCustomerList
				(pagePxy);
		break;
		case CATE_LIST:
			list = CategoryServiceImpl
			.getInstance()
			.bringAllCategoryList(pagePxy);
		break;
		
		default:
			break; 
		}
		request.setAttribute("list", list);
		request.setAttribute("pagination", page);
		
	}
}
