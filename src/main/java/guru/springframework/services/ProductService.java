package guru.springframework.services;


import guru.springframework.domain.liliaceae;

public interface ProductService {
    Iterable<liliaceae> listAllProducts();

    liliaceae getProductById(Integer id);

    liliaceae saveProduct(liliaceae product);
}
