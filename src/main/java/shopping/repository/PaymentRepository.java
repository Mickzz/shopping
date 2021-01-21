package shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopping.db.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity,String> {
    PaymentEntity findByusername(String payment);
}
