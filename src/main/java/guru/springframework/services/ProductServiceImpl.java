package guru.springframework.services;

import guru.springframework.domain.liliaceae;
import guru.springframework.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<liliaceae> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public liliaceae getProductById(Integer id) {
        return productRepository.findOne(id);
    }

    @Override
    public liliaceae saveProduct(liliaceae product) {
        return productRepository.save(product);
    }
}
