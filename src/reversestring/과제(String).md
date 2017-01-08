# String, StringBuffer, StringBuilder

---

1. String 객체는 immutable 이다. 즉, 불변하다
2. StringBuffer와 StringBuilder의 차이는 동기화에 있다.

---

1번에 대해 설명하자면, String 객체가 한개 선언 되면 그 문자열에 대해서는 수정이 불가능하다는 뜻,
예를 들어 쉽게 사용하는 string + "ABC" 의 경우에 기존 string에 ABC가 붙는 것이 아니라 새로운 String 객체를 생성하고 String 형태의 변수가 새로운 string을 가르키게 되는 것이다.

String 객체는 Imuutable하기 때문에 간단하게 사용가능하고, 동기화에 대해 신경쓰지 않아도 되기 때문에(Thread-Safe), 내부 데이터를 자유롭게 공유할 수 있다.

그렇지만 매번 string 객체를 생성하기 때문에 성능상 문제가 발생할 수 있다.



# 해결방법

---
### StringBuilder와 StringBuffer를 사용하라.

---
StringBuilder와 StringBuffer는 String 과 다르게 동작한다. 문자열 연산 등으로 기존 객체에 공간이 부족하게 되는 경우, 기존의 버퍼 크기를 늘리며 유연하게 동작한다.

StringBuffer와 StringBuilder 클래스가 제공하는 메서드는 서로 동일한데, 두 클래스의 차이점은 동기화 여부이다.

StringBuffer는 각 메서드 별로 Synchronized Keyword 가 존재하여, 멀티스레드 환경에서도 동기화를 지원하는 반면에 StringBuilder는 동기화를 보장하지 않는다.

그렇기 때문에 멀티스레드 환경이라면 값 동기화 보장을 위해 StringBuffer를 사용하고, 단일스레드 환경이라면 StringBuilder를 사용하는 것이 좋다. 

단일스레드환경에서 StringBuffer를 사용한다고 문제가 되는 것은 아니지만, 동기화 관련 처리로 인해 StringBuilder에 비해 성능이 좋지 않다.

이외에...

---

사실 JDK 1.5 버전 이전에서는 이전에서는 문자열 연산(+, concat)을 할 때에는 조합된 문자열을 새로운 메모리에 할당하여 참조함으로 인해서 성능상의 이슈가 있었습니다(위에서 설명한 String 클래스 동작 방식에 의한 이유). 그러나 JDK 1.5 버전 이후에는 컴파일 단계에서 String 객체를 사용하더라도 StringBuilder로 컴파일 되도록 변경되었습니다. 그리하여 JDK 1.5 이후 버전에서는 String 클래스를 활용해도 StringBuilder와 성능상으로 차이가 없어졌습니다.

---
라는 정보를 확인했는데, 박사님께서 보여주신 예시에서는 성능상 차이를 보였다. 그이유는 무엇일까 검색하다가 찾게 되었는데,

http://fowler.egloos.com/1243664

페이지를 참고해보면 실행시에 결정될때와 컴파일시에 결정될때에 대한 예시가 자세히 나와있음, 경우에 따라 사용하면 될 듯하다.

