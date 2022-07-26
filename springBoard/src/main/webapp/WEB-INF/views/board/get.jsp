<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script>
	$(function(){
		replySelect();
		
		function replySelect(){
			let url = "/mvc/reply/${bno}";
			$.ajax({
				url: url
			}).done(function(objs){
				for(obj of objs){
					let node = `<div data-rno="\${obj.rno}">
						<span class="reWriter">\${obj.replyer}</span>
						<span class="reContent">\${obj.reply}</span>
						<span class="reDate">작성일시</span>
						<span class="btnReUpd"><button>수정</button></span>
						<span class="btnReDel"><button>삭제</button></span>
					</div>`
					$("#replyList").append(node);
				}
			})
		}
	})
</script>
</head>
<body>
<!-- 상세보기 -->
<h3>게시글 상세보기</h3>
		제 목 : <input name="title" value="${board.title}" readonly><br>
		작성자: <input name="writer" value="${board.writer}" readonly><br> 
		내 용 : <textarea name="content">${board.content}</textarea><br>
		
<form>
	<input name="" id="">작성자
	<input name="" id="">내용
	<button type="button" id="btnReAdd">댓글등록</button>
</form>
<h3>댓글 리스트</h3>
<div id="replyList">
	<div data-rno="1">
		<span class="reWriter">댓글 작성자</span>
		<span class="reContent">내용</span>
		<span class="reDate">작성일시</span>
		<span class="btnReUpd"><button>수정</button></span>
		<span class="btnReDel"><button>삭제</button></span>
	</div>
</div>
</body>
</html>