package com.OrderMgmtSys.Repository;

import com.OrderMgmtSys.Model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderModelRepository extends JpaRepository < OrderModel, Long > {
}