package com.OrderMgmtSys.Repository;

import com.OrderMgmtSys.Model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerModelRepository extends JpaRepository < CustomerModel, Long > {



}