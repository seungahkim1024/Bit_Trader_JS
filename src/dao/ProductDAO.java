package dao;

import java.util.List;

import domain.ProductDTO;
import proxy.Proxy;

public interface ProductDAO {

	public void insertProduct(ProductDTO pro);
	public List<ProductDTO> selectAllProductList(Proxy pxy);
	public List<ProductDTO> selectProducts(Proxy pxy);
	public ProductDTO selectProduct(ProductDTO pro);
	public int countProduct(Proxy pxy);
	public boolean existProduct(ProductDTO pro);
	public void updateProduct(ProductDTO pro);
	public void deleteProduct(ProductDTO pro);
}
