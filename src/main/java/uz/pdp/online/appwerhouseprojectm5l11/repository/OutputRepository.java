package uz.pdp.online.appwerhouseprojectm5l11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Output;
import uz.pdp.online.appwerhouseprojectm5l11.projection.CustomOutput;

@RepositoryRestResource(path = "output",excerptProjection = CustomOutput.class,collectionResourceRel = "list")
public interface OutputRepository extends JpaRepository<Output,Integer> {

}
