# Web

* 클라이언트 <br>
  - 사용자가 웹 사이트에 접근할 때 사용하는 기기 <br><br>
  
* 서버 <br>
  - 인터넷에 연결된 컴퓨터 <br>
  - 웹 요소와 여러 정보가 저장 <br><br>
  
* 프런트 엔드<br>
  - 웹 브라우저 화면에 보이는 부분 -> 웹 사이트 제작 <br>
  - HTML, CSS, Javascript<br>
  - 프레임 워크 : 리액트, 앵귤러, 뷰<br><br>
  
* 백엔드<br>
  - 사용자 뒤에서 보이지 않는 영역 -> 서버<br>
  - 데이터베이스를 설계하거나 데이터 처리<br>
  - Java, PHP, Python 등 프로그래밍 언어 사용 <br>
  - 프레임 워크 : Node.js, Spring, Django, CodeIgniter<br><br>
  
## 1. HTML
  
  <details>
  <summary>HTML 기본 구조</summary>
   <div>
   <br>
    :black_small_square: <b>!DOCTYPE html</b> : 이제부터 처리할 문서는 HTML 문서 <br><br>
    :black_small_square: <b>head 태그</b> : 문서 관련 정보 입력, 웹 브라우저 화면에는 보이지 않음, 문서에서 사용할 외부 파일 링크<br><br>
    :black_small_square: <b>meta 태그</b> : 문서 정보가 들어 있음, 한글로 된 내용을 표시하기 위해 UTF-8 사용, 다양한 문서 정보를 지정<br><br>
    :black_small_square: <b>title 태그</b> : 문서 제목을 나태냄<br><br>
    :black_small_square: <b>body 태그</b> : 실제 브라우저에 표시될 내용 입력<br><br>
   </div>
  </details>
 
 <details>
  <summary>시맨틱 태그</summary>
   <div>
   <br>
     :black_small_square: <b>header 태그</b> : 사이트 전체의 헤더 or 특정 영역의 헤더, 검색 창이나 사이트 메뉴 삽입<br><br>
     :black_small_square: <b>nav 태그</b> : 웹 문서 위치에 영향을 받지 않음, 문서 안에 여러개 만들 수 있음(id로 구분)<br><br>
     :black_small_square: <b>main 태그</b> : 웹 문서의 핵심, 웹 문서마다 다르게 보여주는 내용으로 구성, 웹 문서에서 한 번만 사용<br><br>
     :black_small_square: <b>article 태그</b> : 독립된 웹 콘텐츠 항목(따로 떼어도 콘텐츠가 되는 내용), section 태그를 포함할 수 있음<br><br>
     :black_small_square: <b>section 태그</b> : 콘텐츠 영역, 몇 개의 콘텐츠를 묶는 용도, CSS적용을 위해 묶는 용도로 쓰지 말 것<br><br>
     :black_small_square: <b>aside 태그</b> : 사이드 바 영역, 필수 요소가 아니므로 필요할 경우에만 사용<br><br>
     :black_small_square: <b>footer 태그</b> : 사이트 제작 정보나 저작권 정보, 연락처 등, 다른 시맨틱 태그를 사용해 다양한 정보 포함<br><br>
     :black_small_square: <b>div 태그</b> : 소스를 묶는 용도, 영역을 구별하거나 css 적용을 위해<br><br>
   </div>
 </details>

 <details>
  <summary>텍스트 태그</summary>
   <div>
   <br>
     :black_small_square: <b>h 태그</b> : 제목을 표시할 때, 크기- h1 > h2 > h3 > h4 > h5 > h6<br><br>
     :black_small_square: <b>p 태그</b> : 입력한 내용 앞뒤로 빈 줄이 생기면서 텍스트 단락이 만들어짐<br><br>
     :black_small_square: <b>br 태그</b> : 줄 바꾸기, 닫는 태그가 없음<br><br>
     :black_small_square: <b>blockquote 태그</b> : 다른 텍스트보다 안으로 들여 써짐<br><br>
     :black_small_square: <b>strong, b 태그</b> : 강조태그, strong - 중요한 내용 강조, b - 단순히 굵게 표시<br><br>
     :black_small_square: <b>em, i 태그</b> : 기울기태그, em - 흐름상 특정 부분을 강조하고 싶을때, i - 단순히 이탤릭체로 표시<br><br>
   </div>
 </details>
 
 <details>
  <summary>목록 태그</summary>
   <div>
   <br>
     :black_small_square: <b>ol, li 태그</b> : 각 항목 앞에 숫자, type 속성 : 순서 목록의 숫자 조정, start 속성 : 목록의 시작 번호 수정<br><br>
     :black_small_square: <b>ul, li</b> : 각 항목 앞에 불릿이 붙여짐<br><br>
     :black_small_square: <b>dl, dt, dd 태그</b> : 이름과 값 형태, dt : 제목 지정, dd : 값 지정, 하나의 dt에 여러 개의 dd값 가능<br><br>
   </div>
 </details>
 
 <details>
  <summary>표 태그</summary>
   <div>
   <br>
     :black_small_square: <b>table 태그</b> : 표 전체<br><br>
     :black_small_square: <b>caption 태그</b> : 표 제목<br><br>
     :black_small_square: <b>tr, td, th 태그</b> : tr - 행, td - 열, th - 제목 셀<br><br>
     :black_small_square: <b>rowspan, colspan 속성</b> : rowspan - 밑으로 합침, colspan - 오른쪽으로 합침<br><br>
   </div>
 </details>
 
 <details>
  <summary>이미지 태그</summary>
   <div>
   <br>
     :black_small_square: <b>img 태그</b> : 웹 문서에 이미지를 삽입할 때 사용<br><br>
     :black_small_square: <b>src 속성</b> : 이미지의 경로 지정, 같은 폴더일 경우 파일 이름만 적음, 하위 폴더에 있다면 하위 폴더까지<br><br>
     :black_small_square: <b>alt 속성</b> : 이미지를 설명하는 대체 텍스트<br><br>
     :black_small_square: <b>width, height 속성</b> : 이미지 크기 조정, 둘 중 1개만 지정해도 나머지 속성은 자동으로 지율 계산<br><br>
     :black_small_square: <b>GIF 파일 형식</b> : 다른 이미지 파일 형식에 비해 크기가 작아서 아이콘이나 불릿 등 작은 이미지에 주로 사용<br><br>
     :black_small_square: <b>JPG, JPEG 파일 형식</b> : GIF보다 다양하게 표현 가능, 수정하고 저장하는 작업을 반복할 경우 화질 저하 가능성<br><br>
     :black_small_square: <b>PNG 파일 형식</b> : 다양한 색상 표현으로 가장 많이 사용, 네트워크용으로 개발된 파일 형식<br><br>
   </div>
 </details>
 
 <details>
  <summary>오디오와 비디오 태그</summary>
   <div>
   <br>
     :black_small_square: <b>object 태그</b> : 음악 파일 뿐만 아니라 동영상이나 자바 애플릿, PDF 파일 등 다양한 개체 삽입<br><br>
     :black_small_square: <b>data, width, height 속성</b> : data - 재생할 파일 지정, width/height - 화면 크기 지정<br><br>
     :black_small_square: <b>embed 태그</b> : object/audio/videa 태그를 지원하는 브라우저에서 멀티미디어 삽입할 때 사용, 닫는 태그 없음<br><br>
     :black_small_square: <b>src, width, height 속성</b> : src - 멀티미디어 파일 경로<br><br>
     :black_small_square: <b>audio, video 태그의 속성_1</b> : controls - 컨트롤 바, autoplay - 자동 실행, loop - 반복 재생, mute - 소리 제거<br><br>
     :black_small_square: <b>audio, video 태그의 속성_2</b> : preload - 로딩 방법(사용값 : auto or metadata or none / 기본 적으로 auto 사용)<br><br>
     :black_small_square: <b>audio, video 태그의 속성_3</b> : width, height - 크기 지정, poster - video 태그에서 사용(비디오가 재생되기 전 포스터)<br><br>
   </div>
 </details>
 
 <details>
  <summary>하이퍼링크</summary>
   <div>
   <br>
     :black_small_square: <b>a 태그</b> : 다른 문서, 혹은 다른 사이트로 바로 연결해 주는 기능<br><br>
     :black_small_square: <b>target 속성</b> : target="blank"로 지정하면 연결된 문서가 새 탭으로 열림<br><br>
     :black_small_square: <b>href</b> : href="링크할 주소"<br><br>
   </div>
 </details>
 <details>
  <summary>폼 태그</summary>
   <div>
   <br>
     :black_small_square: <b>form이란_1</b> : 사용자가 정보를 보낼 수 있는 요소, 정보 저장/검색/수정, 데이터베이스 기반 <br><br>
     :black_small_square: <b>form이란_2</b> : 텍스트 필드나 버튼 같은 폼 형태(HTML태그), 입력한 사용자 정보를 처리하는 것 (서버 프로그래밍) <br><br>
     :black_small_square: <b>method 속성_get</b> : 256~4096byte 길이 제한이 있고, 사용자가 입력한 내용이 그래로 들어남<br><br>
     :black_small_square: <b>method 속성_post</b> : 길이 제한이 없고, 내용이 드러나지 않음<br><br>
     :black_small_square: <b>name 속성</b> : 자바스크립트로 폼을 제어할 때 사용할 폼의 이름을 지정<br><br>
     :black_small_square: <b>action 속성</b> : form 태그 안의 내용을 처리해 줄 서버 프로그램을 지정<br><br>
     :black_small_square: <b>target 속성</b> : action 속성에서 지정한 스크립트 파일을 현재 창이 아닌 다른 위치에서 열도록 함<br><br>
     :black_small_square: <b>fieldset 태그</b> : 폼 요소를 그룹으로 묶는 태그<br><br>
     :black_small_square: <b>legend 태그</b> : 그룹으로 묶은 구역에 제목을 붙이는 태그<br><br>
     :black_small_square: <b>label 태그</b> : input태그와 같은 폼 요소에 레이블을 붙일 때 사용<br><br>
     :black_small_square: <b>fieldset 태그</b> : 폼 요소를 그룹으로 묶는 태그<br><br>
 
   <table>
    <caption>:black_small_square:<b>input 태그 type 속성</b></caption>
      <thead>
        <tr>
          <th>종류</th>
          <th>설명</th>
          <th>필드 속성</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>text</td>
          <td>한 줄짜리 텍스트 필드, 주로 아이디나 이름, 주소 등</td>
          <td rowspan="2">size - 길이 필드 <br> maxlength - 최대 문자 수 지정 <br> value(text속성만) - 화면에 표시될 때 텍스트 필드 부분에 보여주는 내용</td>
        </tr>
        <tr>
          <td>password</td>
          <td>비밀번호 입력 필드</td>
        </tr>
        <tr>
          <td>search</td>
          <td>검색 필드, 검색 창에 x표시가 되어 검색어 삭제 쉬움</td>
          <td>-</td>
        </tr>
        <tr>
          <td>url</td>
          <td>웹 주소 필드</td>
          <td>-</td>
        </tr>
        <tr>
          <td>email</td>
          <td>메일 주소 입력 필드, 메일 주소 형식 자동 체크</td>
          <td>-</td>
        </tr>
        <tr>
          <td>tel</td>
          <td>전화번호 입력 필드, 사용자 입력을 체크하지는 않음</td>
          <td>-</td>
        </tr>
        <tr>
          <td>radio</td>
          <td>여러 항목 중 하나만 선택</td>
          <td rowspan="2">name - 여러 개 있을 경우 구분을 위해 이름 지정<br> value - 서버에 넘길 값을 지정(필수 속성) <br> checked - 기본으로 선택해 놓을 항목이 있을 때 사용</td>
        </tr>
        <tr>
          <td>checkbox</td>
          <td>여러 항복 중 둘 이상을 선택</td>
        </tr>
        <tr>
          <td>number</td>
          <td>숫자 입력 필드, 브라우저에 따라 스핀 박스로 표시</td>
          <td rowspan="2">min - 최솟값 지정 (기본 최솟값 = 0) <br> max - 최댓값 지정 (기본 최댓값 = 100) <br> step - 숫자 간격을 지정 (기본값 = 1) <br> value - 필드에 표시할 초깃값</td>
        </tr>
        <tr>
          <td>range</td>
          <td>숫자 입력 필드, 슬라이드 막대를 이용해 숫자 입력</td>
        </tr>
        <tr>
          <td>date, month, week</td>
          <td>date - yyyy/mm/dd <br> month - yyyy/mm <br> week - 1월 첫째 주 기준 몇 번째 주인지 표시</td>
          <td>-</td>
        </tr>
        <tr>
          <td>time, datetime, datetime-local</td>
          <td>time - 폼에서 시간을 입력 <br> datetime, datetime-local - 지역에 맞는 날짜와 시간을 함께 입력 가능</td>
          <td>-</td>
        </tr>
        <tr>
          <td>submit, reset, button</td>
          <td>submit - 사용자 입력 내용을 서버로 전송 <br> reset - 사용자 입력 내용 전부 삭제 <br> button - 주로 javascript 실행할 때 사용</td>
          <td>value - 버튼 표시 내용 지정</td>
        </tr>
        <tr>
          <td>img</td>
          <td>submit 버튼 대신 이미지 삽입</td>
          <td>src - 이미지 경로 <br> alt - 대체 텍스트</td>
        </tr>
        <tr>
          <td>file</td>
          <td>파일 첨부/파일 선택 이나 찾아보기 버튼으로 표시됨</td>
          <td>-</td>
        </tr>
        <tr>
          <td>hidden</td>
          <td>화면 상의 폼에는 보이지 않음 <br> 폼에 서버로 전송할 때 서버로 함께 전송되는 요소</td>
          <td>-</td>
        </tr>
      </tbody>
   </table>
   
   <table>
    <caption>:black_small_square:<b>input 태그 속성</b></caption>
      <thead>
        <tr>
          <th>종류</th>
          <th>설명</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>autofocus</td>
          <td>페이지를 불러오자마자 원하는 폼 요소에 마우스 커서 표시</td>
        </tr>
        <tr>
          <td>placeholder</td>
          <td>입력란에 표시하는 힌트로, 필드를 클릭하면 사라짐</td>
        </tr>
        <tr>
          <td>readonly</td>
          <td>내용을 보기만 하고 입력하지 못하게 함</td>
        </tr>
        <tr>
          <td>required</td>
          <td>필수 필드 체크 <br>필수 필드는 브라우저에서 직접 체크하는 것이므로 오류 메시지 내용은 브라우저마다 다름</td>
        </tr>
      </tbody>
   </table>
  </div>
 </details>
<br>

## 2. CSS




###### HTML <태그명 속성="값" 속성="값" 속성="값"></태그명>
###### CSS 선택자{속성:값, 속성:값, 속성:값}

## 3. Javascript
  <details>
    <summary>Javascript란</summary>
     <div>
     <br>
       :black_small_square: 웹 요소 제어
       :black_small_square: 다양한 라이브러리 사용
       :black_small_square: 웹 애플리케이션 제작
       :black_small_square: 서버를 구성하고 서버용 프로그램 제작
     </div>
 </details>
