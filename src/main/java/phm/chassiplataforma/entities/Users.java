package phm.chassiplataforma.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


import java.io.Serializable;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Users implements Serializable {

    private UUID uuid;
    private String name;
    private String mail;
    private String password;
    private Boolean status;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
