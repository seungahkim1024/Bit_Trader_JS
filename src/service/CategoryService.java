package service;

import java.util.List;

import domain.CategoryDTO;
import proxy.Proxy;

public interface CategoryService {

	public void registCategory(CategoryDTO pro);
	public List<CategoryDTO> bringAllCategoryList(Proxy pxy);
	public List<CategoryDTO> retrieveSomeCategories(Proxy pxy);
	public CategoryDTO retrieveCategory(CategoryDTO pro);
	public int countCategory(Proxy pxy);
	public boolean existsCategory(CategoryDTO pro);
	public void modifyCategory(CategoryDTO pro);
	public void removeCategory(CategoryDTO pro);
}
