package kg.mega.rent.services;

import kg.mega.rent.dto.ProductDto;
import kg.mega.rent.mapper.ProductMapper;
import kg.mega.rent.models.Product;
import kg.mega.rent.services.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductDtoService {
    @Autowired
    ProductServiceImpl productService;
    @Autowired
    ProductMapper productMapper;
    public List<ProductDto> productDtos(double price){
        List<Product> products = productService.findProductsByPrice(price);

            List dtos = products
                    .stream()
                    .map(dto -> productMapper.getProductDto(dto))
                    .collect(Collectors.toList());

            return dtos;
        }
    }

