package phm.chassiplataforma.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import phm.chassiplataforma.entities.enums.StatusPayment;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ads implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID uuid;
    private String url;
    private String title;
    private String description;
    private String socialMedia;
    private String adsGoals;
    private Double investment;
    private Double dailyInvestment;
    private StatusPayment status;

}
