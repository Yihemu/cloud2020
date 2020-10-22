package kokyuu.yui.springcloud.service.Impl;

import kokyuu.yui.springcloud.dao.PaymentDao;
import kokyuu.yui.springcloud.entities.Payment;
import kokyuu.yui.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
