package kr.co.aristatait.springbootjpa1.repository;

import jakarta.persistence.EntityManager;
import kr.co.aristatait.springbootjpa1.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    /**
     * 주문 저장
     */
    public void save(Order order) {
        em.persist(order);
    }

    /**
     * 주문 단건 조회
     */
    public Order findOne(Long id) {
        return em.find(Order.class, id);
    }

    /**
     * 주문 목록 조회
     * - 필터 포함
     *   - 주문자 명
     *   - 주문 상태
     */
    // public List<Order> findAll(OrderSearch orderSearch) {}
}
