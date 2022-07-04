package com.dq.miscellaneous.repository;

import com.dq.miscellaneous.entity.JshopOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JshopOrderRepository extends JpaRepository<JshopOrder, String> {

}
