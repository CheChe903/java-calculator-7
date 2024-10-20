## java-calculator-precourse

## 진행 후, 구현 기능 목록 수정

### 1. 문자열 분리하기

- 기본 구분자는 쉼표(,) 또는 콜론(:)이다. 커스텀 구분자가 없다면, 해당 구분자로 문자열을 분리한다.
- 문자열이 "//" 으로 시작한다면, 커스텀 구분자를 "//" 와 "\n" 사이의 문자로 커스텀 구분자를 지정하며 이것으로만 문자열을 분리한다.
- 양수를 구분해야하기 때문에, 커스텀 구분자로 "."이 들어올 수 없다.

### 2. 문자를 양수로 변환하기

- 문자열을 숫자로 변환한다.
- 구분자 사이 빈 문자열, 또는 첫 입력이 빈 문자열은 0으로 취급한다.

### 3. 예외 처리

- 커스텀 구분자가 2개 이상 들어온다면, IllegalArgumentException을 발생시키고 종료한다.
- 커스텀 구분자를 지정하는 형식이 잘못됐다면, IllegalArgumentException을 발생시키고 종료한다.
- 커스텀 구분자가 "." 이라면, IllegalArgumentException을 발생시키고 종료한다.
- 커스텀 구분자가 숫자라면, IllegalArgumentException을 발생시키고 종료한다.
- 구분자로 나눈 문자에서 숫자가 아닌 값이 포함된다면 IllegalArgumentException을 발생시키고 종료한다.
- 구분자로 나눈 문자에서 음수가 포함된다면 IllegalArgumentException을 발생시키고 종료한다.

## 초기 구현 기능 목록

### 1. 문자열 분리하기

- 커스텀 구분자가 없다면, 쉼표 또는 콜론으로 문자열 분리, 있다면 그 구분자로 문자열 분리한다.
- 커스텀 문자는 "//" 와 "\n" 사이의 한 글자로 제공한다.
- 잘못된 커스텀 구분자 형식이 들어올 경우 IllegalArgumentException을 발생시키고 종료한다.

### 2. 문자열 더하기

- 분리된 문자열을 숫자로 바꾸며 더하고, 출력한다.
- 양의 정수만 허용하며, 숫자가 아닌 값이나 음수가 포함된다면 IllegalArgumentException을 발생시키고 종료한다.