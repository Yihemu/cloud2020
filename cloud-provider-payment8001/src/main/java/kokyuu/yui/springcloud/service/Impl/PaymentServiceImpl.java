package kokyuu.yui.springcloud.service.Impl;

import kokyuu.yui.springcloud.dao.PaymentDao;
import kokyuu.yui.springcloud.entites.Payment;
import kokyuu.yui.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
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
