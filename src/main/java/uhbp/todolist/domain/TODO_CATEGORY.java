package uhbp.todolist.domain;


import lombok.*;

import javax.persistence.*;

@Table(name = "TODO_CATEGORY")
@Entity
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TODO_CATEGORY {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_INDEX")
    private Long categoryIndex;

    @Column(name = "CATEGORY_NAME", nullable = false)
    private String categoryName;

//    categoryFactory에 사용되는 생성자
    private TODO_CATEGORY(String categoryName){
        this.categoryName = categoryName;
    }

//    cateogry Entity를 생성하기 위한 정적 팩토리
    public static TODO_CATEGORY todoCategoryategoryFactory(String categoryName) {
        return new TODO_CATEGORY(categoryName);
    }
}


