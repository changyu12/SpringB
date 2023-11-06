<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="menu.jsp" %>
 <div class="row gx-lg-9">
            <div class="col-xl-8 border-end-xl border-300">
              <div class="card mb-9">
                <div class="card-body">
                  <h1 class="lh-sm fs-2 fs-xxl-4 mb-2">${board.btitle}</h1>
                  <p class="fs-0 mb-4 text-600">${board.bdate}</p>
                  <div class="card mb-5 mb-xxl-7">
                    <div class="card-body">
                      <div class="row gy-5">
                        <div class="col-md-6 d-flex justify-content-between">
                          <div>
                            <div class="mb-3">
                              <div class="d-flex align-items-center">
                                <div class="px-2 py-1 bg-info-100 rounded"><span class="text-info" data-feather="map-pin"></span></div>
                                <h5 class="ms-2 text-1100 mb-0">${board.bcontent}</h5>
                              </div>
                            </div>
                            <p class="lh-sm mb-0 text-700">${board.bwriter} </p>
                          </div>
                          <div class="my-4 mx-3 border-start d-none d-md-block"></div>
                        </div>
                        <div class="col-md-6">
                          <div class="mb-3">
                            <div class="d-flex align-items-center">
                              <div class="px-2 py-1 bg-primary-100 rounded"><span class="text-primary" data-feather="clock"></span></div>
                              <h5 class="ms-2 mb-0">작성자</h5>
                            </div>
                          </div>
                          <p class="lh-sm mb-0 text-700">${board.bwriter}</p>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="row g-2">
                    <div class="col-12 col-md-auto flex-md-grow-1">
                      
                    </div>
                   <div class="col-12 col-sm-auto flex-sm-grow-1 flex-md-grow-0">
                      <a href="/readlist" class="btn btn-phoenix-success w-100"><span class="fa-regular fa-calendar-plus me-2"></span>목록</a>
                    </div>
                    <div class="col-6 col-sm-auto">
                      <a href="/update?bno=${board.bno}" class="btn btn-phoenix-primary w-100"><span class="fa-solid fa-heart me-2"></span>수정</a>
                    
                    </div>
                    <div class="col-6 col-sm-auto">
                      <a href="/delete?bno=${board.bno}" class="btn btn-phoenix-danger w-100"><span class="fa-solid fa-share-nodes me-2"></span>삭제</a>
                    
                    </div>
                  </div>
                </div>
              </div>
              </div>
              </div>
              
</body>
</html>