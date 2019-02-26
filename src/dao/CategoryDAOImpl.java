package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.CategoryDTO;
import enums.CategorySQL;
import enums.Vendor;
import factory.DatabaseFactory;
import proxy.Proxy;

public class CategoryDAOImpl implements CategoryDAO{
	private static CategoryDAOImpl instance = new CategoryDAOImpl();
	Connection conn;
	private CategoryDAOImpl() {
		conn = DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection();
	}
	public static CategoryDAOImpl getInstance() {
		return new CategoryDAOImpl();
	}
	
	@Override
	public void insertCategory(CategoryDTO pro) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<CategoryDTO> selectAllCategoryList(Proxy pxy) {
		List<CategoryDTO> list = new ArrayList<>();
		try {
			String sql = CategorySQL.ALL_CATE_LIST.toString();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			CategoryDTO cate = null;
			while(rs.next()){
				cate = new CategoryDTO();
				cate.setCategoryId(rs.getString("CATEGORY_ID"));
				cate.setCategoryName(rs.getString("CATEGORY_NAME"));
				cate.setDescription(rs.getString("DESCRIPTION"));
				list.add(cate);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public List<CategoryDTO> selectCategories(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CategoryDTO selectCategory(CategoryDTO pro) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countCategory(Proxy pxy) {
		int count = 0;
		try {
			String sql = CategorySQL.COUNT.toString();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				count = rs.getInt("COUNT");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("카테고리 카운트==="+count);
		return count;
	}
	@Override
	public boolean existCategory(CategoryDTO pro) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void updateCategory(CategoryDTO pro) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteCategory(CategoryDTO pro) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
