package kokyuu.yui.springcloud.service;

import kokyuu.yui.springcloud.entites.Payment;
import org.springframework.stereotype.Service;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
