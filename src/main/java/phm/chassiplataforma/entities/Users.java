package phm.chassiplataforma.entities;

import jakarta.persistence.*;

import lombok.*;
import phm.chassiplataforma.entities.enums.StatusUser;


import java.io.Serializable;
import java.util.List;
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
    @Column(length = 50)
    private String mail;
    private String document;
    private String password;
    private StatusUser status;
    private String cellPhone;
    @OneToMany
    @JoinColumn(name = "user_id")
    @Column(nullable = false)
    private List<Company> companyes;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
