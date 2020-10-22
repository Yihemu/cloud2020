package kokyuu.yui.springcloud.controller;

import kokyuu.yui.springcloud.entities.CommonResult;
import kokyuu.yui.springcloud.entities.Payment;
import kokyuu.yui.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @PostMapping("/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("查询结果：" + result);
        if(result > 0){
            return new CommonResult(200, "插入数据库成功 port:" + port, result);
        }else{
            return new CommonResult(404, "插入数据库失败", null);
        }
    }
    @GetMapping("/payment/get/{id}")
    public  CommonResult<Payment> getPaymentById(@PathVariable Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果:" + payment);
        if(payment != null){
            return new CommonResult(200, "查询成功 port:" + port, payment);
        }else{
            return new CommonResult(404, "查询失败，查询id：" + id, null);
        }
    }
}
