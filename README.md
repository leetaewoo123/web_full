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


## 2. CSS

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
     :black_small_square: <b>colspan, rowspan 속성</b> : colspan - 밑으로 합침, rowspan - 오른쪽으로 합침<br><br>
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
     :black_small_square: <b>href</b> : href="링크할 주소"
   </div>
 </details>


###### HTML <태그명 속성="값" 속성="값" 속성="값"></태그명>
###### CSS 선택자{속성:값, 속성:값, 속성:값}
