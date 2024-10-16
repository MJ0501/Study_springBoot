package me.mj.springbootdeveloper;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본생성자
@AllArgsConstructor
@Getter
@Entity // entity 지정 -> 지정한 게 없으므로 class 이름인 Member테이블과 매칭됨!
public class Member {
    @Id // id 를 PK로
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK를 자동으로 +1 = AUTO_INCREMENT
    // 그 외 : AUTO - 선택한 DB dialect에 따라 방식 자동선택(default)
    //        SEQUENCE - DB SEQUENCE 이용해 PK할당 (주로 ORACLE)
    //        TABLE - key 생성 TABLE 이용
    private Long id;
    @Column(name="name", nullable = false) // name 은 Not Null
    // 그 외 : unique - 설정하지 않음 false
    //        columnDefinition - 컬럼 정보 설정
    private String name;
    public void changeName(String name){
        this.name=name;
    }
}
