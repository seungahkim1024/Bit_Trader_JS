package service;

import java.util.List;

import dao.CategoryDAOImpl;
import domain.CategoryDTO;
import proxy.Proxy;

public class CategoryServiceImpl implements CategoryService{
	private static CategoryServiceImpl instance = new CategoryServiceImpl();
	CategoryDAOImpl dao;
	private CategoryServiceImpl() {dao = CategoryDAOImpl.getInstance();}
	public static CategoryServiceImpl getInstance() {
		return instance;
	}

	@Override
	public void registCategory(CategoryDTO pro) {
		dao.insertCategory(pro);
		
	}
	@Override
	public List<CategoryDTO> bringAllCategoryList(Proxy pxy) {
		
		return dao.selectAllCategoryList(pxy);
	}
	@Override
	public List<CategoryDTO> retrieveSomeCategories(Proxy pxy) {
		
		return dao.selectCategories(pxy);
	}
	@Override
	public CategoryDTO retrieveCategory(CategoryDTO pro) {
		
		return dao.selectCategory(pro);
	}
	@Override
	public int countCategory(Proxy pxy) {
		
		return dao.countCategory(pxy);
	}
	@Override
	public boolean existsCategory(CategoryDTO pro) {
		
		return dao.existCategory(pro);
	}
	@Override
	public void modifyCategory(CategoryDTO pro) {
		dao.updateCategory(pro);
		
	}
	@Override
	public void removeCategory(CategoryDTO pro) {
		dao.deleteCategory(pro);
		
	}
	
}
