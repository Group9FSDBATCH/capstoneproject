package com.harshit.resteasy.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Data
public class PurchaseResponse {

    private final String orderTrackingNumber;
}
