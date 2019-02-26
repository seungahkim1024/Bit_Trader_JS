package dao;

import java.util.List;

import domain.CategoryDTO;
import proxy.Proxy;

public interface CategoryDAO {

	public void insertCategory(CategoryDTO pro);
	public List<CategoryDTO> selectAllCategoryList(Proxy pxy);
	public List<CategoryDTO> selectCategories(Proxy pxy);
	public CategoryDTO selectCategory(CategoryDTO pro);
	public int countCategory(Proxy pxy);
	public boolean existCategory(CategoryDTO pro);
	public void updateCategory(CategoryDTO pro);
	public void deleteCategory(CategoryDTO pro);
}
