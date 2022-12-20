package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class TodoEntity {
//    모델 레이어를 구분함으로써 모델 레이어에서는 모델 역할만 하고, 컨트롤러 레이어에서는 컨트롤러 역할만, 서비스 레이어에서는 서비스 역할만
//    각각의 레이어에서 자신의 역할만 담당하기 때문에 코드가 복잡하게 꼬이는 것을 방지할 수 있고, 컴포넌트들을 잘 구분해서 작성한 코드는 어느 한
//    부분을 수정했을 때 다른 레이어에 주는 영향을 최소화하기 때문에 유지보수 관점에서도 코드를 관리하고 수정하는데에 훨씬 유리함
//    * 모델
//    각각의 오브젝트들의 모임.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(name = "todoOrder", nullable = false)
    private Long order;

    @Column(nullable = false)
    private Boolean completed;
}