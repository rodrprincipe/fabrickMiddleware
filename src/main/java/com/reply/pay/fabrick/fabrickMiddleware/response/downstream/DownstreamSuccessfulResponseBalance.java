package com.reply.pay.fabrick.fabrickMiddleware.response.downstream;

import com.reply.pay.fabrick.fabrickMiddleware.payload.Balance;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@JsonIgnoreProperties(ignoreUnknown = true)
public class DownstreamSuccessfulResponseBalance extends DownstreamSuccessfulResponse {
    private Balance payload;

}