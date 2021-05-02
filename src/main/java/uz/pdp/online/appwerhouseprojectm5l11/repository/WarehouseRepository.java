package uz.pdp.online.appwerhouseprojectm5l11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Warehouse;
import uz.pdp.online.appwerhouseprojectm5l11.projection.CustomWarehouse;


import java.util.List;
import java.util.Set;

@RepositoryRestResource(path = "warehouse",collectionResourceRel = "list",excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {

    boolean existsByName(String name);

    //for users
    List<Warehouse> findAllById(Iterable<Integer> iterable);

}
