package phm.chassiplataforma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import phm.chassiplataforma.entities.Ads;

public interface AdsRepository extends JpaRepository<Ads,Long> {
}
