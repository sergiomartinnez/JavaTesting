package testingjava.javatest.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
