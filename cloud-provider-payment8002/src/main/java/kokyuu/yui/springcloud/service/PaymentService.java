package kokyuu.yui.springcloud.service;

import kokyuu.yui.springcloud.entities.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
