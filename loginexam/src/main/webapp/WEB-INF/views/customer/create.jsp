<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원등록</title>



</head>
<body>
<%@include file="../menu.jsp" %>
<div class="container">

  <!-- ===============================================-->
    <!--    Main Content-->
    <!-- ===============================================-->
    <main class="main" id="top">
      <div class="container">
        <div class="row flex-center min-vh-100 py-5">
          <div class="col-sm-10 col-md-8 col-lg-5 col-xl-5 col-xxl-3"><a class="d-flex flex-center text-decoration-none mb-4" href="../../../index.html">
              <div class="d-flex align-items-center fw-bolder fs-5 d-inline-block"><img src="../../../assets/img/icons/logo.png" alt="phoenix" width="58" />
              </div>
            </a>
            <div class="text-center mb-7">
              <h3 class="text-1000">회원등록</h3>
              <p class="text-700">회원가입 하세요.</p>
            </div>
            <div class="position-relative">
              <hr class="bg-200 mt-5 mb-4" />
              
              <form action="/customer/create" method="POST" enctype="multipart/form-data">
            <div class="mb-3 text-start">
              <label class="form-label" for="email">아이디</label>
              <div class="form-icon-container">
                <input class="form-control form-icon-input" name="username" type="email" placeholder="name@example.com" /><span class="fas fa-user text-900 fs--1 form-icon"></span>
              </div>
            </div>
            <div class="mb-3 text-start">
              <label class="form-label" for="password">비밀번호</label>
              <div class="form-icon-container">
                <input class="form-control form-icon-input" name="password" type="password" placeholder="Password" /><span class="fas fa-key text-900 fs--1 form-icon"></span>
              </div>
            </div>
            
            <div class="mb-3 text-start">
              <label class="form-label" for="cname">닉네임</label>
              <div class="form-icon-container">
                <input class="form-control form-icon-input" name="cname" type="text" placeholder="닉네임을 입력하세요" /><span class="fas fa-key text-900 fs--1 form-icon"></span>
              </div>
            </div>
            
           
            
            <div class="mb-3 text-start">
              <label class="form-label" for="tel">전화번호</label>
              <div class="form-icon-container">
                <input class="form-control form-icon-input" name="ctel" type="tel" placeholder="전화번호" /><span class="fas fa-key text-900 fs--1 form-icon"></span>
              </div>
            </div>
            
            <div class="mb-3 text-start">
              <label class="form-label" for="image">사진</label>
              <div class="form-icon-container">
                <input class="form-control form-icon-input" name="cimg" type="file" placeholder="cimg" /><span class="fas fa-key text-900 fs--1 form-icon"></span>
              </div>
            </div>
            <input type="submit" value="등록">
            </form>
            
            
            
            
            
            <div class="row flex-between-center mb-7">  
            </div>
  
          </div>
        </div>
      </div>
     
    </div>
   
    </main>
    



</div>



                      
                      
                    


 
</body>
</html>