package labshoppubsub.domain;

import labshoppubsub.domain.DeliveryStarted;
import labshoppubsub.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Devlivery_table")
@Data

public class Devlivery  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String customId;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String address;

    @PostPersist
    public void onPostPersist(){


        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();

    }

    public static DevliveryRepository repository(){
        DevliveryRepository devliveryRepository = DeliveryApplication.applicationContext.getBean(DevliveryRepository.class);
        return devliveryRepository;
    }




    public static void startDelivery(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        Devlivery devlivery = new Devlivery();
        repository().save(devlivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(devlivery->{
            
            devlivery // do something
            repository().save(devlivery);


         });
        */

        
    }


}
