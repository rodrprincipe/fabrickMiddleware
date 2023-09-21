package com.reply.pay.fabrick.fabrickMiddleware.response.downstream;

import com.reply.pay.fabrick.fabrickMiddleware.payload.PayloadMoneyTransfer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@JsonIgnoreProperties(ignoreUnknown = true)
public class DownstreamSuccessfulResponseMoneyTransfer extends DownstreamSuccessfulResponse {
    private PayloadMoneyTransfer payload;

}