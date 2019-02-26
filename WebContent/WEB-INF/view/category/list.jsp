<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" 
	href="${css}/customer/list.css" />
<div class="grid-item" id="nav">
	<jsp:include page="../employee/nav.jsp"/>
</div>
<div class="grid-item" id="side_menu">
<div class="container" style="width: 200px">
  <ul class="list-group" id="cate_side_menu">
    <li class="list-group-item" id="cate_list" style="background-color: #a6d8a3">카테고리 목록</li>
    <li class="list-group-item" id="cate_register">카테고리 등록</li>
    <li class="list-group-item" id="cate_search">카테고리 조회</li>
    <li class="list-group-item" id="cate_update">카테고리 수정</li>
    <li class="list-group-item" id="cate_delete">카테고리 삭제</li>
  </ul>
</div>
</div>
<div class="grid-item" id="content">
	<table id="cust_tab">
	  <tr>
	    <th>No.</th>
	    <th>카테고리명</th>
	    <th>카테고리 설명</th>
	  </tr>
	  <c:forEach items="${list}" var="category">
	  <tr>
	    <td>${category.categoryId}</td>
	    <td>${category.categoryName}</td>
	    <td><a href="#">${category.description}</a></td>
	  </tr>
	  </c:forEach>
	  
	</table>
	<div style="height: 50px"></div>    
<%-- 	<div class="center">
	  <div class="pagination" >
	  <c:if test="${pagination.existPrev}">
		  <a href='${ctx}/customer.do?cmd=cus_list&page=list&page_num=${pagination.prevBlock}'>&laquo;</a>
	  </c:if>
	  <c:forEach begin="${pagination.startPage}" end="${pagination.endPage}" varStatus="status">
	  <c:choose>
	  	<c:when test="${pagination.pageNum eq status.index}">
	  		<a href="#" class="page active">${status.index}</a>	
	  	</c:when>
	  	<c:otherwise>
	  		<a href="#" class="page">${status.index}</a>
	  	</c:otherwise>
	  </c:choose>
	  
	  </c:forEach>
	  <c:if test="${pagination.existNext}">
		  <a href="${ctx}/customer.do?cmd=cus_list&page=list&page_num=${pagination.nextBlock}">&raquo;</a>
	  </c:if>
	  </div>
	</div> --%>
</div>

<jsp:include page="../home/bottom.jsp"/>

<script src="${js}/employee.js">

</script>