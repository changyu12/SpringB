<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <!-- ===============================================-->
    <!--    Stylesheets-->
    <!-- ===============================================-->
    <link href="../../../vendors/prism/prism-okaidia.css" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin="">
    <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&amp;display=swap" rel="stylesheet">
    <link href="../../../vendors/simplebar/simplebar.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.8/css/line.css">
    <link href="../../../assets/css/theme-rtl.min.css" type="text/css" rel="stylesheet" id="style-rtl">
    <link href="../../../assets/css/theme.min.css" type="text/css" rel="stylesheet" id="style-default">
    <link href="../../../assets/css/user-rtl.min.css" type="text/css" rel="stylesheet" id="user-style-rtl">
    <link href="../../../assets/css/user.min.css" type="text/css" rel="stylesheet" id="user-style-default">
    <script>
      var phoenixIsRTL = window.config.config.phoenixIsRTL;
      if (phoenixIsRTL) {
        var linkDefault = document.getElementById('style-default');
        var userLinkDefault = document.getElementById('user-style-default');
        linkDefault.setAttribute('disabled', true);
        userLinkDefault.setAttribute('disabled', true);
        document.querySelector('html').setAttribute('dir', 'rtl');
      } else {
        var linkRTL = document.getElementById('style-rtl');
        var userLinkRTL = document.getElementById('user-style-rtl');
        linkRTL.setAttribute('disabled', true);
        userLinkRTL.setAttribute('disabled', true);
      }
    </script>
</head>
<body>


	<nav class="navbar navbar-expand-lg bg-dark navbar-dark light">
		<div class="container-fluid">
			<a class="navbar-brand text-white" href="/">홈</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSuccessExample"
				aria-controls="navbarSuccessExample" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSuccessExample">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0 text-white">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="/board/create">게시물등록</a></li>
						
					<li class="nav-item"><a class="nav-link" href="/board/readlist">게시물목록</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" id="navbarSuccessExampleDropdown"
						href="#" role="button" data-bs-toggle="dropdown"
						aria-expanded="false">회원관리</a>
						<div class="dropdown-menu py-0" aria-labelledby="navbarSuccessExampleDropdown">
							<div class="bg-white dark__bg-1000 py-2 rounded-3">
								<a class="dropdown-item" href="/customer/readlist">회원</a>
								<hr class="dropdown-divider">
								
								<a class="dropdown-item" href="/customer/create">회원 등록</a>
								<a class="dropdown-item" href="/login">로그인</a>
								
								
								<a class="dropdown-item" href="/logout">로그아웃</a>
								<a class="dropdown-item" href="/customer/delete">회원 탈퇴</a>
								
							</div>
						</div>
						</li>
					
				</ul>
			
			
			
			</div>
			<sec:authentication property="principal" var="customer" />
	<sec:authorize access="isAuthenticated()">
		<div class="badge badge-phoenix badge-phoenix-danger"  id="username" >[ ${customer.username} ]님 로그인 중입니다.</div>
		</sec:authorize>
		
<sec:authorize access="isAnonymous()">
		로그인 상태가 아닙니다. 
		</sec:authorize>
		</div>
	
	</nav>



    <!-- ===============================================-->
    <!--    JavaScripts-->
    <!-- ===============================================-->
    <script src="../../../vendors/popper/popper.min.js"></script>
    <script src="../../../vendors/bootstrap/bootstrap.min.js"></script>
    <script src="../../../vendors/anchorjs/anchor.min.js"></script>
    <script src="../../../vendors/is/is.min.js"></script>
    <script src="../../../vendors/fontawesome/all.min.js"></script>
    <script src="../../../vendors/lodash/lodash.min.js"></script>
    <script src="https://polyfill.io/v3/polyfill.min.js?features=window.scroll"></script>
    <script src="../../../vendors/list.js/list.min.js"></script>
    <script src="../../../vendors/feather-icons/feather.min.js"></script>
    <script src="../../../vendors/dayjs/dayjs.min.js"></script>
    <script src="../../../vendors/prism/prism.js"></script>
    <script src="../../../assets/js/phoenix.js"></script>
</body>
</html>