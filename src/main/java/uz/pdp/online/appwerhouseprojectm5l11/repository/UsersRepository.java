package uz.pdp.online.appwerhouseprojectm5l11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Users;
import uz.pdp.online.appwerhouseprojectm5l11.projection.CustomUser;

@RepositoryRestResource(path = "user",collectionResourceRel = "list",excerptProjection = CustomUser.class)
public interface UsersRepository extends JpaRepository<Users,Integer> {

    boolean existsByPhoneNumber(String phoneNumber);




}
