package com.limos4.integration.dto.request.bookingrequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LimosVQRequest {
    private String dateScheduled;
    private LimosServiceType serviceType;
    private String desiredVehicleType;
    private short passengerCount;
    private short luggageCount;
    private LimosRoute route;

}
