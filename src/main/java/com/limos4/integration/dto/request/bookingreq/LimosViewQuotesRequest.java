package com.limos4.integration.dto.request.bookingreq;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LimosViewQuotesRequest {
    private String dateScheduled;
    private LimosServiceType serviceType;
    private String desiredVehicleClass;
    private short passengerCount;
    private short luggageCount;
    private LimosVQRoute route;
    private LimosExtras extras;

}
