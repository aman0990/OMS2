package com.OrderMgmtSys.Service;

import com.OrderMgmtSys.Model.CustomerModel;
import com.OrderMgmtSys.Object.CustomerObject;
import com.OrderMgmtSys.Repository.CustomerModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerModelRepository customerModelRepository;

    public CustomerObject createUser(CustomerObject customerObject){

        CustomerModel customerModel= new CustomerModel();
        customerModel.setAddress(customerObject.getAddress());
        customerModel.setEmail(customerObject.getEmail());
        customerModel.setName(customerObject.getName());
        customerModel.setMobno(customerObject.getMobno());
        customerModel.setStatus(customerObject.getStatus());
        customerModelRepository.save(customerModel);

        return customerObject;
    }

}
