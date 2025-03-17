package com.limos4.integration.dto.request.bookingrequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LimosRoute {
    private LimosLocation origin;
    private LimosLocation destination;


}
