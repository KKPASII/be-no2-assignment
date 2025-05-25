use schedule;

create table schedule
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '일정 식별자',
    writer VARCHAR(100) NOT NULL COMMENT '작성자명',
    title VARCHAR(255) NOT NULL COMMENT '일정 제목',
    content TEXT COMMENT '일정 내용',
    password VARCHAR(255) NOT NULL COMMENT '비밀번호',
    created_time DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '작성 날짜',
    updated_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL COMMENT '수정 날짜'
);