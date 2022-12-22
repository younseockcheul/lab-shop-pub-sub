package labshoppubsub.domain;

import labshoppubsub.domain.*;
import labshoppubsub.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String customId;
    private Integer qty;
    private String address;

    public DeliveryStarted(Devlivery aggregate){
        super(aggregate);
    }
    public DeliveryStarted(){
        super();
    }
}
