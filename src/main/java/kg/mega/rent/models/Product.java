package kg.mega.rent.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "products")
@FieldDefaults( level = AccessLevel.PRIVATE)
@Getter


public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    double pricePerDay;

}
