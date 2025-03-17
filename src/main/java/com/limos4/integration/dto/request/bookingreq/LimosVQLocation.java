package com.limos4.integration.dto.request.bookingreq;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LimosVQLocation {
    private LimosVQAddress address;
    private LimosVQPosition position;
}
