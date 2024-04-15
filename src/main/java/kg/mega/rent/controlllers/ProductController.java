package kg.mega.rent.controlllers;

import kg.mega.rent.dto.ProductDto;
import kg.mega.rent.services.ProductDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductDtoService productDtoService;
    @GetMapping ("/product/{price}")
    List<ProductDto> getProductByPrice (@PathVariable (name = "price") double price){

        return productDtoService.productDtos(price);
    }

}
