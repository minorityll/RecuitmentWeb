<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>SB Admin - Start Bootstrap Template</title>
  <!-- Bootstrap core CSS-->
  <link href="${pageContext.request.contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="${pageContext.request.contextPath}/resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="${pageContext.request.contextPath}/resources/css/sb-admin.css" rel="stylesheet">
  
  <!-- Bootstrap core JavaScript-->
  <script src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/bootstrap-notify.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="${pageContext.request.contextPath}/resources/vendor/jquery-easing/jquery.easing.min.js"></script>
  
  <c:if test="${param.error != null }">
  		<script>
  		var msg = '${LAST_EXCEPTION}';
  		$(()=>{
  			$.notify({
  				// options
  				message: msg 
  			},{
  				// settings
  				type: 'danger',
  				delay: 5000,
  	  			timer: 1000
  			}
  			
  			);	
  		});
  			
  		</script>
  </c:if>
  
</head>



<body class="bg-dark">
  <div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Login</div>
      <div class="card-body">
        <form action="${pageContext.request.contextPath}/j_spring_security" method="post">
          <div class="form-group">
            <label for="exampleInputEmail1">Username</label>
            <input class="form-control" id="username" name="j_username" type="text" aria-describedby="emailHelp" placeholder="Enter Username">
          </div>
          <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input class="form-control" id="password" name="j_password" type="password" placeholder="Password">
          </div>
<!--           <div class="form-group"> -->
<!--             <div class="form-check"> -->
<!--               <label class="form-check-label"> -->
<!--                 <input class="form-check-input" type="checkbox"> Remember Password</label> -->
<!--             </div> -->
<!--           </div> -->
          <button class="btn btn-primary btn-block" type="submit"> Login</button>
<%--           <a class="btn btn-primary btn-block" href="${pageContext.request.contextPath}/resources/index.html">Login</a> --%>
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="${pageContext.request.contextPath}/resources/register.html">Register an Account</a>
          <a class="d-block small" href="${pageContext.request.contextPath}/resources/forgot-password.html">Forgot Password?</a>
        </div>
      </div>
    </div>
  </div>
  
</body>

</html>
