package kg.mega.rent.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.security.PrivateKey;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table (name = "addresses")
@FieldDefaults( level = AccessLevel.PRIVATE)

public class Address   {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String street;
    String house;
    Integer flat;
    Integer floor;

    @OneToMany (mappedBy = "address")
    List<Client> clients;
}

