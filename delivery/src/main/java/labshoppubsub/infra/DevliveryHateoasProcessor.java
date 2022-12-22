package labshoppubsub.infra;
import labshoppubsub.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class DevliveryHateoasProcessor implements RepresentationModelProcessor<EntityModel<Devlivery>>  {

    @Override
    public EntityModel<Devlivery> process(EntityModel<Devlivery> model) {

        
        return model;
    }
    
}
