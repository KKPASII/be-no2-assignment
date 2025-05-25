### API 명세서

1.일정 등록
- POST /api/schedules
- request: 요청 body
  - {
    "writer": "ham",
    "title": "과제2",
    "content": "일정 관리 애플리케이션 만들기",
    "password": "1234"
    }
- response: 등록 정보
  - {
    "id": 1,
    "writer": "ham",
    "title": "과제2",
    "content": "일정 관리 애플리케이션 만들기",
    "createdTime": "2025-05-25T10:00:00.123456",
    "updatedTime": "2025-05-25T10:00:00.123456"
    }
- 상태코드
  - 200: 등록 성공

2.선택 일정 조회
- GET /api/schedules/{id}
- request: 요청 param
  - /api/schedules/1
- response:  응답 정보
  - {
    "id": 1,
    "writer": "ham",
     "title": "과제2",
    "content": "일정 관리 애플리케이션 만들기",
    "createdTime": "2025-05-25T10:00:00.123456",
    "updatedTime": "2025-05-25T10:00:00.123456"
    }
- 상태코드
  - 200: 조회 성공

3.전체 일정 조회
- GET /api/schedules
- request: 요청 param
  - /api/schedules
- response: 다건 응답 정보
  - [
    {
        "id": 4,
        "writer": "seo",
        "title": "밥 먹기",
        "content": "닭찌, 쌀국수, 바나나",
        "createdTime": "2025-05-25T09:11:16",
        "updatedTime": "2025-05-25T09:11:43"
    },
    {
        "id": 2,
        "writer": "ham",
        "title": "오늘의 운동",
        "content": "스트레칭 하자",
        "createdTime": "2025-05-25T08:33:20",
        "updatedTime": "2025-05-25T08:33:20"
    }
    ]
- 상태코드
  - 200: 조회 성공

4.일정 수정
- PUT /api/schedules/{id}
- request: 요청 body
  - {
    "id": 3,
    "writer": "ham",
    "title": "오늘의 청소",
    "content": "화장실 청소, 바닥 청소",
    "createdTime": "2025-05-25T08:47:02",
    "updatedTime": "2025-05-25T08:47:02"
  }
- response: 수정 정보
  - {
    "id": 3,
    "writer": "ham",
    "title": "오늘의 청소",
    "content": "화장실 청소, 바닥 청소",
    "password": "1234",
    "createdTime": "2025-05-25T08:47:02",
    "updatedTime": "2025-05-25T09:23:43"
  } 
- 상태코드
  - 200: 수정 성공

5.일정 삭제
- DELETE /api/schedules/{id}
- request: 요청 body
  - {
    "password": "1234"
    }
- response: (없음)
- 상태코드
  - 200: 삭제 성공

### ERD

[일정 관리 ERD v1]
![일정 관리 ERD](./일정관리_ERD_V1.png "일정 관리 애플리케이션 ERD")
