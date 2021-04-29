package com.communityhub.springbootproject.service;

import com.communityhub.springbootproject.dto.Purchase;
import com.communityhub.springbootproject.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
