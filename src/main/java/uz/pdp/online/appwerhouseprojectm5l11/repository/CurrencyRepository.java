package uz.pdp.online.appwerhouseprojectm5l11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Currency;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Input;
import uz.pdp.online.appwerhouseprojectm5l11.projection.CustomCurrency;

import java.util.Optional;
@RepositoryRestResource(path = "currency",collectionResourceRel = "list",excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
    boolean existsByName(String name);


}
