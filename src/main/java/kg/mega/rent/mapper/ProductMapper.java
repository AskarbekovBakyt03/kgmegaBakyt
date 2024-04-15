package kg.mega.rent.mapper;


import kg.mega.rent.dto.ProductDto;
import kg.mega.rent.models.Product;
import org.springframework.stereotype.Service;

@Service
    public class ProductMapper {
        public ProductDto getProductDto(Product product){
            return ProductDto.builder()
                    .name(product.getName())
                    .pricePerDay(product.getPricePerDay())
                    .build();
        }
    }

