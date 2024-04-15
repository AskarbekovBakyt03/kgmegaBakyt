package kg.mega.rent.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table (name = "clients")
@FieldDefaults( level = AccessLevel.PRIVATE)

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    String lastName;
    String patronymic;

    @ManyToOne
    @JoinColumn(name = "id_addresses")
    Address address;

}
