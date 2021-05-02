package uz.pdp.online.appwerhouseprojectm5l11.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.appwerhouseprojectm5l11.entity.OutputProduct;
import uz.pdp.online.appwerhouseprojectm5l11.projection.CustomOutputProduct;

@RepositoryRestResource(path = "outputProduct",collectionResourceRel = "list", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {

    Page<OutputProduct>findAllByOutputId(Integer output_id, Pageable pageable);

}
