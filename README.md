# 지하철 노선도 미션
[ATDD 강의](https://edu.nextstep.camp/c/R89PYi5H) 실습을 위한 지하철 노선도 애플리케이션

## 학습 계기
- 동료의 의견에 따르면, 알고리즘 문제를 TDD 방법론으로 풀고 있었음.
- TDD 방법론을 배워 의식적으로 사용하길 희망함.

## 목표
- TDD 개발 방법론을 학습 & 경험
- 코드 리뷰어와 한 팀이 되어 작업하는 경험


## 🥊 나만의 TDD 사이클 단계

### 전체 사이클
인수 테스트 -> (선택)서비스 테스트 -> 도메인 테스트

### 개별 사이클

```
1. 문제 정의 후, 요구 사항 분석
    - 📋 문제 정의: 필요한 기능을 한 문장으로 요약하기
    - 📋 요구 사항 분석: given/when/then 프레임 사용
2. 테스트 조건(해피 케이스) 주석으로 정의
    - 예외 케이스 생각나면 그때 그때 정리
3. 테스트 작성
4. 테스트 통과하는 로직 작성
    - (유연) TDD 사이클 대로라면 1~3 반복 후 최소 단위 모듈에서 4번을 시작해야함.
    - ✅ 비즈니스적인 의미 & 테스트 유용성을 고려하여 특정 레이어의 모듈은 1~3 skip
    - '내가 아는 것' -> '모르는 것' 방향으로 진행.
      - ❗ 내가 아는 것: 객체의 책임과 역할 등
      - ❓ 내가 모르는 것: 구현 방식 등
5. 리팩토링 진행
    - 우선순위: (1)재사용성, (2)가독성
    - 가독성
      - 💥 기능을 '명세'하는 역할을 하는가
      - 💥 읽는 사람을 고려하여 작성했는가(ex. 기획자, 개발자 등)
6. 예외 케이스 고려
    - 1~5번 반복
    - 🌟 예외 상황
      - request 데이터 누락(인증 정보)
      - 논리적 오류 check(비즈니스 규칙에 근거)
      - 시스템 오류 check(서버 down, memory 이슈 등)
7. 성능 고려
    - 1~6번 반복
    - ⏰ 데이터를 효율적으로 읽는가
    - ⏰ 데이터를 효율적으로 쓰는가
```

_* '5. 시스템 오류 check'와 '7. 성능 고려'는 개발 경험이 쌓임에 따라 1번에서 진행되도 함._

<br>

# 학습 기록
## 💛1주차: 인수테스트란
#### **기간**
- ```2023-06-29 - 2023-07-05```

#### Bullet point
**1. 사용자 관점**
   - 인수 테스트(Acceptance Test)는 사용자의 관점에서 올바르게 작동하는지 테스트

**2. Black Box 테스트**
   - 세부 구현에 영향 받지 않음
   - 구현이 아닌 의도&요구사항에 중점 

**3. 다양한 업무 참여자**
   - 업무 분석가, QA와 개발자 등 다양한 직군 참여
   - 다양한 직군이 이해 할 수 있는 언어로 작성 필요

#### 진행 미션
|Mission|Repository|Pull Request|
|------|---|---|
|지하철역 인수테스트 작성|[michaelkimm/atdd-subway-map](https://github.com/michaelkimm/atdd-subway-map)|[pull request](https://github.com/next-step/atdd-subway-map/pull/853)|
|지하철 노선 관리|[michaelkimm/atdd-subway-map](https://github.com/michaelkimm/atdd-subway-map)|[pull request](https://github.com/next-step/atdd-subway-map/pull/885)|
|지하철 구간 관리|[michaelkimm/atdd-subway-map](https://github.com/michaelkimm/atdd-subway-map)|[pull request](https://github.com/next-step/atdd-subway-map/pull/945)|


#### 블로그 포스팅
- [ATDD 1주차 - 인수테스트란](https://excellent-snowshoe-c4c.notion.site/nextstep-ATDD-1-1e57b40067a84f459e57002e7ebe68eb?pvs=4)
- [인수테스트 격리 방법](https://excellent-snowshoe-c4c.notion.site/d8ff59f41eaa4f7c90b8c2c527d91ab6?pvs=4)
