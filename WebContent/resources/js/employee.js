var ctx = "${ctx}";

$('.page').click(()=>{ //$옆엔 id를 줄 수 없다. 이유는 요소들이 여러가지여야하는데 아이디는 유니크하니까.
	location.assign(ctx+'/customer.do?cmd=cus_list&page=list&page_num='+$(this).text());
}); 
$('#cate_register').click(()=>{
	$('#cate_side_menu > li').attr('style','background-color: white');
	$('#cate_register').attr('style','background-color: #a6d8a3');
	$('#content').html('<form id="form">'
			      +'<div class="form-group">'
			      +'<label for="text">카테고리 이름 :</label>'
			      +'<input type="text" class="form-control" name="name">'
			      +'</div>'
			      +'<div class="form-group">'
			      +'<label for="text">상세설명 :</label>'
			      +'<textarea rows="4" cols="50" class="form-control" name="description"></textarea>'
			      +'</div>'
			      +'<button type="submit" class="btn btn-default">Submit</button>'
			  	  +'</form>');
});
$('#cate_search').click(()=>{
	$('#cate_side_menu > li').attr('style','background-color: white');
	$('#cate_search').attr('style','background-color: #a6d8a3');
	$('#content').html('<form id="form">'
			    +'<div class="form-group">'
			      +'<label for="text">카테고리 검색 :</label>'
			      +'<select>'
			      +'<option name="cate_id" value="1000">스마트폰</option>'
			      +'<option name="cate_id" value="1001">노트북</option>'
			      +'<option name="cate_id" value="1002">데스크탑</option>'
			      +'</select>'
			   	  +'</div>'
 			      +'<button type="submit" class="btn btn-default">Submit</button>'
			  	  +'</form>');
}); 
$('#cate_delete').click(()=>{
	$('#cate_side_menu > li').attr('style','background-color: white');
	$('#cate_delete').attr('style','background-color: #a6d8a3');
	$('#content').html('<h1>삭제할 카테고리</h1>'
				+'<form action="/action_page.php">'
				+'<input type="checkbox" name="vehicle1" value="Bike">스마트폰<br>'
				+'<input type="checkbox" name="vehicle2" value="Car">노트북<br>'
				+'<input type="checkbox" name="vehicle3" value="Boat" checked>데스크탑<br><br>'
				+'<input type="submit" value="Submit">'
				+'</form>');
});


$('#cate_update').click(()=>{
    $('#cate_side_menu > li').attr('style','background-color: white');
    $('#cate_update').attr('style','background-color: #5bc0de96');
    $('#content').html('<form id="form">'
    +'    <div class="container">'
    +'    <input type="radio" name="cate_id" value="1000"> 스마트폰<br>'
    +'    <input type="radio" name="cate_id" value="1001"> 데스크탑<br>'
    +'    <input type="radio" name="cate_id" value="1002"> 노트북<br>'
    +'   <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">수정</button>'
    +'     <div class="modal fade" id="myModal" role="dialog">'
    +'     <div class="modal-dialog"> '
    +'      <div class="modal-content">'
    +'     <div class="modal-header"> '
    +'      <button type="button" class="close" data-dismiss="modal">&times;</button>'
    +'   <h4 class="modal-title">수정할내용</h4>'
    +'   </div>'
    +'   <div class="modal-body">'
    +'   </div>'
    +'   <div class="modal-footer">'
    +'   <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>'
    +'   </div>'
    +'   </div>'
    +'   </div>'
    +'     </div>'
    +'     </div>'
    +' </form>');
});