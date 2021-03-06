/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.5
 */
package com.ecommerce.Checkoutmicroservice.repository;

import com.ecommerce.Checkoutmicroservice.model.Orders;
import com.ecommerce.Checkoutmicroservice.model.Shipment;
import org.springframework.data.repository.CrudRepository;

public interface ShipmentRepository extends CrudRepository<Shipment, String> {

}
