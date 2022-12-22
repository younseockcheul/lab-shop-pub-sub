package labshoppubsub.domain;

import labshoppubsub.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="devliveries", path="devliveries")
public interface DevliveryRepository extends PagingAndSortingRepository<Devlivery, Long>{

}
