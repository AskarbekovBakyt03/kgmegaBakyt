package kg.mega.rent.services;

import kg.mega.rent.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> findProductsByPrice (double price);

}
