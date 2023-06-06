package phm.chassiplataforma.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Company {

    @Id
    private Long id;
    private UUID uuid;
    private String name;
    private String document;
    private String url;
    private String category;
    private String cep;
    private String street;
    private String district;
    private String city;
    private String state;
    private String complement;
    private String logo;
    private Boolean status;
    @OneToMany
    @JoinColumn(name = "company_id")
    private List<Ads> adsList;
}
