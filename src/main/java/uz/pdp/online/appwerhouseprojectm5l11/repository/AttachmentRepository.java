package uz.pdp.online.appwerhouseprojectm5l11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Attachment;


public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {

}
