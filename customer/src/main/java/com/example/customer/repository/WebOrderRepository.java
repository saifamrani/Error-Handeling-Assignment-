package com.example.customer.repository;

import com.example.customer.model.WebOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebOrderRepository extends CrudRepository<WebOrder,Integer> {
}
