package com.OrderMgmtSys.Service;

import com.OrderMgmtSys.Model.CustomerModel;
import com.OrderMgmtSys.Model.OrderModel;
import com.OrderMgmtSys.Object.OrderObject;
import com.OrderMgmtSys.Repository.CustomerModelRepository;
import com.OrderMgmtSys.Repository.OrderModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderModelRepository orderModelRepository;

    @Autowired
    CustomerModelRepository customerModelRepository;

    public OrderObject createOrder(OrderObject orderObject){

        OrderModel orderModel= new OrderModel();
        orderModel.setCategories(orderObject.getCategories());
        orderModel.setDiscount(orderObject.getDiscount());
        orderModel.setPrice(orderObject.getPrice());
        orderModel.setQuantity(orderObject.getQuantity());
        orderModel.setProduct(orderObject.getProduct());
        orderModel.setCustomerModel(customerModelRepository.findById(orderObject.getCustId()).get());
        orderModelRepository.save(orderModel);
        return orderObject;
    }

}
