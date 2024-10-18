package kr.co.aristatait.springbootjpa1.domain.item;

import jakarta.persistence.*;
import kr.co.aristatait.springbootjpa1.domain.Category;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
public class Item {

    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;

    private int price;

    private int stockQuantity;

    // 예제 샘플로 만들었지만, 실무에서는 거의 사용 안함
    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();

}
