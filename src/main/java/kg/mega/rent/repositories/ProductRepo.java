package kg.mega.rent.repositories;

import kg.mega.rent.models.Product;
import org.hibernate.cfg.JpaComplianceSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {

    @Query(value = """
            SELECT id, name, price_per_day from  products WHERE products.price_per_day=:pricePerDay
            """, nativeQuery = true)
   List<Product> findProductsByPrice(@Param("pricePerDay") double pricePerDay);
}