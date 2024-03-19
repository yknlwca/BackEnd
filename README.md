## 웹 프로그래밍 용어

## URI(Uniform Resource Identifier)

- 통합 자원 식별자
- URL과 URN을 포함하는 상위 개념

### URL(Uniform Resource Locator)

- 통합 자원 위치
- 자원의 위치를 나타내는 사용

### URN(Uniform Resource Name)

- 통합 자원 이름
- 자원에 대한 고유한 이름을 제공

| 구성요소 | 설명 |
| --- | --- |
| 프로토콜 | 절차를 포함한 통신 규약 |
| 서버 | 웹 페이지를 요청할 서버의 주소, 실제 IP 주소나 도메인을 입력할 수 있다. |
| 경로 | 서버 내의 상세 경로 |
| 쿼리 스트링 | 추가로 서버로 데이터를 전송하기 위해서 사용 ’?’ |

### JSP

- Servlet 표준을 기반으로 작성된 웹 애플리케이션 개발 언어
- HTML 내에 Java를 작성하여 동적으로 웹페이지를 생성하여 브라우저에게 돌려주는 페이지
- 실행 시 Servlet으로 변환된 후 실행

### JSP 구성요소

- 지시자 (Directive)
    - JSP 페이지에 대한 설정 정보를 지정하기 위해 사용
- 스크립트 요소 :  스크립트릿(Scriptlet), 표현식(Expression), 선언부(Declaration) JSP에서 문서의 내용을 동적으로 생성하기 위해 사용
- JSP 기본 객체
    - 요청 및 응답 관련 정보를 얻거나, 응답 결과를 만들기 위해 사용
- 표현 언어 (Expression Language)
    - JSP를 좀 더 간결하게 작성하기 위해 사용
- Action Tag / JSTL
    - 자주 사용하는 기능을 모아 미리 정의하여 Tag 형태로 작성
    - JSP에서 자바코드를 쉽게 작성할 수 있도록 사용
    
    | 종류 | 사용용도 | 형식 |
    | --- | --- | --- |
    | 스크립트릿(scriptlet) | 자바코드 작성 | <% %> |
    | 선언(declaration) | 변수와 메소드 선언 | <%! %> |
    | 표현식(expression) | 결과를 문자열 형태로 출력 | <%= %> |
    | 주석(comment) | 주석 작성 | <%— —%> |
    | 지시자(directive) | 페이지 속성 지정 | <%@ %> |

### Forward

- 클라이언트의 요청에 대해 서버가 전달받아 이를 서버 내에 전달하는 방식
- 클라이언트는 서버로 데이터만 전송할 뿐, 서버 내에 이루어지는 상황을 알 수 없습니다.
- 서버 내부에서 데이터를 전달하기 때문에 request 객체를 그대로 전달하여 사용할 수 있습니다.
- URL 변경 일어나지 않음

### Redirect

- 클라이언트의 요청에 대해 서버가 전달받은 후 Redirect가 발생하면 클라이언트에게 응답을 전송함
- 클라이언트는 서버에서 전달받은  요청에 대해 다시 서버로 요청을 전송
- Forward와 반대로 URL 변경, request 객체가 초기화

# Cookie & Session

> HTTP프로토콜을 보완하기 위해 사용되는 기술
> 

### HTTP (HyperText Transfer Protocol)

- 인터넷 프로토콜
    - 인터넷에서 데이터 통신을 위한 표준화된 규약이나 규칙
    - TCP (Transmission control Protocol)
    - UDP (User Datagram Protocol)
- 클라이언트 - 서버 구조
- 보안 버전 HTTPS (HyperText Transfer Protocol Secure) (Port : 443)
- Port : 80

### HTTP 특징

- 비연결지향 (Connectionless)
    - 자원 낭비 방지를 위해 연결 해제
    - 서버의 자원을 효율적 사용
- 무 상태 (Stateless)
    - 서버가 클라이언트의 상태를 저장하지 않음
    - 응답 서버를 쉽게 바꿀 수 있음
    - 상태 유지

### HTTP 상태 코드

- 1XX : Informational respose
- 2XX : Successful response
- 3XX : Redirection messages
- 4XX : Client error responses
- 5XX : Server error responses

### Cookie

- 웹 서버가 클라이언트의 웹 브라우저에 저장하는 작은 데이터 조각
- 요청(request)시 서버로 같이 전송
- Key : Value 형태 문자열
- 웹 브라우저(클라이언트) 별로 별도의 쿠키 생성
    - 브라우저가 다르다면 다른 사용자

### Cookie 사용 목적

- 세션 관리 ( 사용자 아이디, 장바구니 등 )
- 사용자의 설정 환경 기억
- 사용자의 행동, 패턴 분석

### 주요 메서드

- void setComment - 설명 설정
- void setDomain - 유효한 도메인 설정
- void setMaxAge - 유효기간
    
    


# EL & JSTL

## EL (Expression Language)

- JavaBeas
    - 재사용 가능한 소프트웨어 컴포넌트
        - 클래스는 직력화
        - 기본 생성자
    - EL 표현식을 이용해 접근 가능
- 연산자 (Operator)
    - EL식은 연산자를 포함할 수 있다
    - 산술 연산, 조건 연산, 논리 연산, 관계 연산

## JSTL (JSP Standard Tag Library)

# DB
### 데이터베이스(Database)

- 여러 사람이 공유하고 사용할 목적으로 통합 관리되는 정보의 집합
- 논리적으로 연관된 하나 이상의 자료의 모음
- 데이터들을 고도로 구조화 함으로써 검색과 갱신의 효율화를 꾀한 것
- 몇 개의 자료 파일을 조직적으로 통합하여 중복을 없애고 자료를 구조화 시킨 자료의 집합

### 통합된 데이터 (Integrated Data)

- 각자 사용하던 데이터를 모아서 중복을 최소화 하고 데이터 불일치 제거

### 저장된 데이터 (Stored Data)

- 문서 형태로 보관되는 것이 아니라 저장장치에 저장됨

### 운영데이터 (Operational Data)

- 조직의 목적을 위해서 사용되는 데이터

### 공용데이터 (Shared Data)

- 여러 사람이 각각 다른 목적의 업무를 위해 공통으로 사용되는 데이터

# 관계형 데이터 베이스 (Relational DB)

- 테이블(Table) 기반의 Database
    - 실제 데이터가 저장되는 곳
    - 행과 열의 2차원 구조를 가진 저장 장소
- 하나의 데이터는 여러 속성(Attribute)을 가짐
- 데이터 중복 최소화
- 테이블 간의 관계를 이용 → 필요한 데이터 검색

### 스키마(Schema)

- 자료 구조, 표현 방법, 관계 등 전반적인 명세를 기술
    
    
    | 속성 | 속성 설명 | … |
    | --- | --- | --- |
    | Id | 아이디 | … |
    | Name | 이름 | … |
    | Password | 비밀번호 | … |

## 관계형 데이터 베이스 테이블 구조

- 열 (Column) 또는 속성 (Attribute) : 고유한 데이터 형식 (자료형) 지정
- 행 (Row) 또는 레코드 (Record) : 실제 데이터 저장되는 형태
- 기본 키 (Primary key) : 각 행의 고유 값
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/acb4bbd9-5e7a-4411-b76d-2d71e461f3cd/5cd26959-85c4-49f2-88cd-fb5a0cd32529/Untitled.png)
    

# SQL (Structed Query Language)

- 관계형 데이터 베이스에서 데이터 조작과 데이터 정의를 위해 사용하는 언어
    - 데이터 조회
    - 데이터 삽입, 삭제, 수정
    - DB Object 생성 및 변경, 삭제
    - DB 사용자 생성 및 삭제, 권한 제어
- 표준 SQL은 모든 DBMS에서 사용 가능

## DML (Data Manipulation Language) 데이터 조작 언어

- 데이터 조작 조회 사용
- CRUD ( Create, Read, Update, Delete)

## DDL (Data Definition Language) 데이터 정의 언어

- DB 객체 (table, view, user, index ….)의 구조를 정의

## DCL (Data Control Language) 데이터 제어 언어

- Database, Table 접근 권한이나 CRUD권한 정의

## TCL (Transaction Control Language) 트랙잭션 제어 언어

- 트랜잭션 단위로 실행한 명령문 적용 or 취소
