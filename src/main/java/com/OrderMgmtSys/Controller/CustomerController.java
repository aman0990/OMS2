package com.OrderMgmtSys.Controller;

import com.OrderMgmtSys.Object.CustomerObject;
import com.OrderMgmtSys.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

   @Autowired
   CustomerService customerService;

    @PostMapping("/createUser")
    public String createUser(@RequestBody CustomerObject customerObject){
       // CustomerService customerService= new CustomerService();
        customerObject= customerService.createUser(customerObject);
        return "User Created with Id: "+customerObject.getEmail();
    }

}
