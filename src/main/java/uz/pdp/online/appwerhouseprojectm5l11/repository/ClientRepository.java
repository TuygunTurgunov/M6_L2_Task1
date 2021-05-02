package uz.pdp.online.appwerhouseprojectm5l11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Client;
import uz.pdp.online.appwerhouseprojectm5l11.projection.CustomClient;

@RepositoryRestResource(path = "client",collectionResourceRel = "list",excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {

    boolean existsByPhoneNumber(String phoneNumber);

}
