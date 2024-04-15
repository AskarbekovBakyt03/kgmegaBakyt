package kg.mega.rent.services.impl;

import kg.mega.rent.models.Product;
import kg.mega.rent.repositories.ProductRepo;
import kg.mega.rent.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
@Autowired
    ProductRepo productRepo;


    @Override
    public List<Product> findProductsByPrice(double price) {


        return productRepo.findProductsByPrice(price);
    }
}
