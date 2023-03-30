# Web

* 클라이언트 <br/>
  - 사용자가 웹 사이트에 접근할 때 사용하는 기기 <br/><br/>
  
* 서버 <br/>
  - 인터넷에 연결된 컴퓨터 <br/>
  - 웹 요소와 여러 정보가 저장 <br/><br/>
  
* 프런트 엔드<br/>
  - 웹 브라우저 화면에 보이는 부분 -> 웹 사이트 제작 <br/>
  - HTML, CSS, Javascript<br/>
  - 프레임 워크 : 리액트, 앵귤러, 뷰<br/><br/>
  
* 백엔드<br/>
  - 사용자 뒤에서 보이지 않는 영역 -> 서버<br/>
  - 데이터베이스를 설계하거나 데이터 처리<br/>
  - Java, PHP, Python 등 프로그래밍 언어 사용 <br/>
  - 프레임 워크 : Node.js, Spring, Django, CodeIgniter<br/>
  
  
## 1. HTML
  
  <details>
  <summary>HTML 기본 구조</summary>
   <div>
   <br>
    :black_small_square: !DOCTYPE html : 이제부터 처리할 문서는 HTML 문서 <br>
    :black_small_square: head 태그 : 문서 관련 정보 입력, 웹 브라우저 화면에는 보이지 않음, 문서에서 사용할 외부 파일 링크<br>
    :black_small_square: meta 태그 : 문자 세트 등 문서 정보가 들어 있음, 한글로 된 내용을 표시하기 위해 UTF-8 사용, 다양한 문서 정보를 지정<br>
    :black_small_square: title 태그 : 문서 제목을 나태냄<br>
    :black_small_square: body 태그 : 실제 브라우저에 표시될 내용 입력<br>
   </div>
  </details>
 <details>
  <summary>시맨틱 태그</summary>
   <div>
   <br>
     :black_small_square: header 태그 : 헤더 영역, 사이트 전체의 헤더 or 특정 영역의 헤더, 검색 창이나 사이트 메뉴 삽입<br>
     :black_small_square: nav 태그 : 내비게이션 영역, 웹 문서 위치에 영향을 받지 않음, 문서 안에 여러개 만들 수 있음(id로 구분)<br>
     :black_small_square: main 태그 : 웹 문서의 핵심, 웹 문서마다 다르게 보여주는 내용으로 구성, 웹 문서에서 한 번만 사용<br>
     :black_small_square: article 태그 : 독립된 웹 콘텐츠 항목(따로 떼어도 콘텐츠가 되는 내용), section 태그를 포함할 수 있음<br>
     :black_small_square: section 태그 : 콘텐츠 영역, 몇 개의 콘텐츠를 묶는 용도, CSS적용을 위해 묶는 용도로 쓰지 말 것<br>
   </div>
 </details>


## 2. CSS

###### HTML <태그명 속성="값" 속성="값" 속성="값"></태그명>
###### CSS 선택자{속성:값, 속성:값, 속성:값}
