# subs-cms

호스피탈리티 CMS 백엔드

## 🛠️ 기술 스택
- Java 17 (최신 LTS)
- Spring Boot
- Spring Cloud
- JPA, QueryDSL
- Spring Security, JWT
- MySQL
- Redis
- Kafka
- Gradle
- Docker, Kubernetes

## 📁 프로젝트 구조
subs-cms/
├── src/main/java/com/songjunsub/subscms
│   └── ... (도메인별 패키지)
├── src/main/resources
│   └── application.properties
├── build.gradle
└── ...

## 🚀 주요 기능(예정)
- 객실/예약/고객 CRUD API
- OTA 연동(Booking.com, Agoda 등)
- 인증/인가(JWT, Spring Security)
- Kafka 기반 이벤트 처리
- Redis 캐시 활용
- 마이크로서비스/클라우드 환경 대응

## ⚙️ 개발 및 실행 방법
[main 2f8ae12] ci: 기본 CI 파이프라인(GitHub Actions) 추가
 1 file changed, 25 insertions(+)
 create mode 100644 .github/workflows/ci.yml
[main a119542] ci: 잔디밭 관리를 위한 자동 커밋 워크플로우 추가
 1 file changed, 21 insertions(+)
 create mode 100644 .github/workflows/daily-commit.yml
[main 3886456] feat: Room 엔티티(샘플) 추가
 1 file changed, 16 insertions(+)
 create mode 100644 src/main/java/com/songjunsub/subscms/domain/Room.java
Downloading https://services.gradle.org/distributions/gradle-8.14.2-bin.zip
.............10%.............20%.............30%.............40%.............50%.............60%.............70%.............80%.............90%..............100%

Welcome to Gradle 8.14.2!

Here are the highlights of this release:
 - Java 24 support
 - GraalVM Native Image toolchain selection
 - Enhancements to test reporting
 - Build Authoring improvements

For more details see https://docs.gradle.org/8.14.2/release-notes.html

Starting a Gradle Daemon (subsequent builds will be faster)

> Task :compileJava FAILED

[Incubating] Problems report is available at: file:///Users/anb-28/subs-cms/build/reports/problems/problems-report.html
1 actionable task: 1 executed

> Task :compileJava FAILED

[Incubating] Problems report is available at: file:///Users/anb-28/subs-cms/build/reports/problems/problems-report.html
1 actionable task: 1 executed

## 🧑‍💻 기여 가이드
- PR/이슈 등록 전 README, 코드 컨벤션 참고
- 커밋 메시지: [타입] 메시지 (예: feat: 기능 추가)
- 코드 리뷰 필수

## 📝 라이선스
MIT License

---

> 본 프로젝트는 호스피탈리티 산업의 생산성 향상과 자동화를 목표로 합니다.
