package org.example.repository;

import org.example.model.TodoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoModel, Long> {
    // 저장소.
    // but, 실제 데이터를 저장하고 있는 클래스가 아닌 데이터를 주고 받는 방식인 인터페이스 방식임을 인지.
}
