package com.harshit.resteasy.service;

import com.harshit.resteasy.dto.Purchase;
import com.harshit.resteasy.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

}
