<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목록 보기</title>
</head>
<body>
	<%@include file="menu.jsp" %>
<div class="container">	
  <h2 class="text-bold text-1100 mt-5">게시판</h2>
        <div id="members" data-list='{"valueNames":["bno","btitle","bwriter","bdate"],"page":5,"pagination":true}'>
          <div class="row align-items-center justify-content-between g-3 mb-4">
            <div class="col col-auto">
              <div class="search-box">
                <form class="position-relative" data-bs-toggle="search" data-bs-display="static">
                  <input class="form-control search-input search" type="search" placeholder="Search members" aria-label="Search" />
                  <span class="fas fa-search search-box-icon"></span>

                </form>
              </div>
            </div>
            <div class="col-auto">
              <div class="d-flex align-items-center">
                <button class="btn btn-link text-900 me-4 px-0"><span class="fa-solid fa-file-export fs--1 me-2"></span>Export</button>
                
              	<a href="/create" class="btn btn-primary"><span class="fas fa-plus me-2"></span>게시물 등록</a>
              </div>
            </div>
          </div>
          <div class="mx-n4 mx-lg-n6 px-4 px-lg-6 mb-9 bg-white border-y border-300 mt-2 position-relative top-1">
            <div class="table-responsive scrollbar ms-n1 ps-1">
              <table class="table table-sm fs--1 mb-0">
                <thead>
                  <tr>
                    <th class="white-space-nowrap fs--1 align-middle ps-0">
                       <div class="form-check mb-0 fs-0">
                        <input class="form-check-input" id="checkbox-bulk-members-select" type="checkbox" data-bulk-select='{"body":"members-table-body"}' />
                      </div>
                    </th>
                    <th class="sort align-middle" scope="col" data-sort="customer" style="width:20%; min-width:200px;">번호</th>
                    <th class="sort align-middle" scope="col" data-sort="email" style="width:40%; min-width:200px;">제목</th>
                    <th class="sort align-middle pe-3" scope="col" data-sort="mobile_number" style="width:20%; min-width:200px;">작성자</th>
                    <th class="sort align-middle" scope="col" data-sort="city" style="width:20%;">날짜</th>
                 
                  </tr>
                </thead>
                <tbody class="list" id="members-table-body">
                
                <c:forEach items="${board}" var="board">
                  <tr class="hover-actions-trigger btn-reveal-trigger position-static">
                    <td class="fs--1 align-middle ps-0 py-3">
                     <div class="form-check mb-0 fs-0">
                        <input class="form-check-input" type="checkbox" data-bulk-select-row='{"customer":{"bno","btitle","bwriter","bdate"}' />
                      </div>
                    </td>
                    <td class="customer align-middle white-space-nowrap"><a class="d-flex align-items-center text-900 text-hover-1000" href="#!">
                        <div class="avatar avatar-m"><img class="rounded-circle" src="../assets/img/team/32.webp" alt="" />
                        </div>
                        <h6 class="mb-0 ms-3 fw-semi-bold">${board.bno}</h6>
                      </a></td>
                    <td class="email align-middle white-space-nowrap"><a class="fw-semi-bold" href="/readdetail?bno=${board.bno}">${board.btitle}</a></td>
                    <td class="mobile_number align-middle white-space-nowrap"><a class="fw-bold text-1100" href="tel:+912346578">${board.bwriter}</a></td>
                    <td class="city align-middle white-space-nowrap text-900">${board.bdate}</td>
                   
                    
                  </tr>
				</c:forEach>
	
	</tbody>
	</table>
	</div>
	</div>
	</div>
	</div>
</body>
</html>