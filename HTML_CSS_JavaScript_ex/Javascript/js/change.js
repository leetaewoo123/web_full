var heading = document.querySelector("#heading2");
heading.onclick = function(){
    var reply = confirm("글자색을 파란색으로 바꾸시겠습니까?")
    
    if (reply==true){
        console.log(reply);
        heading.style.color = "blue" 
    }
}