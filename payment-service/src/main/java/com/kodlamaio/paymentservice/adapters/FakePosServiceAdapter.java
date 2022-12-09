package com.kodlamaio.paymentservice.adapters;

import com.kodlamaio.common.constants.Messages;
import com.kodlamaio.common.util.exceptions.BusinessException;
import com.kodlamaio.paymentservice.business.abstracts.PosService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class FakePosServiceAdapter implements PosService {
    @Override
    public void pay() {
        boolean randomValue = new Random().nextBoolean();
        if(randomValue == false) {
            throw new BusinessException(Messages.Payment.Failed);
        }       					
    }
}
