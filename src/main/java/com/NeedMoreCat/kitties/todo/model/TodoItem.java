package com.NeedMoreCat.kitties.todo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity //jpa entity로 선언
@Table(name = "todos") //table 정보
@Getter @Setter //getter, setter 메소드
@NoArgsConstructor //인자 없는 기본 생성자
@AllArgsConstructor //모든 인자 가지는 생성자
@Builder //빌더 패턴으로 생성
public class TodoItem {
    @Id // pk필드, 반드시 필요
    @Column(name = "id", nullable = false) //테이블 컬럼과 매핑
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title", nullable = false, length = 100)
    private String title;
    @Column(name = "done", nullable = false)
    private boolean done;
}
