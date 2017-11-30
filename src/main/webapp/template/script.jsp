<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <link href="${pageContext.request.contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <link href="${pageContext.request.contextPath}/resources/css/sb-admin.css" rel="stylesheet">
      <!-- Bootstrap core JavaScript-->
  <script src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery.blockUI.js"></script>
  <script src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="${pageContext.request.contextPath}/resources/vendor/jquery-easing/jquery.easing.min.js"></script>
  <!-- Custom scripts for all pages-->
  <script src="${pageContext.request.contextPath}/resources/js/sb-admin.min.js"></script>
  <script>
  var fn ={};
  
  fn.blockScreen = () =>{
  	 $.blockUI({ css: { 
            border: 'none', 
            padding: '15px', 
            backgroundColor: '#000', 
            '-webkit-border-radius': '10px', 
            '-moz-border-radius': '10px', 
            baseZ :999999,
            opacity: .5, 
            color: '#fff' 
        } }); 
  }
  
  $(()=>{
	  $('a').click( function(e) {
		  /*your_code_here;*/ 
			  if($(this).attr("href").indexOf('#')!=-1 || $(this).attr("href")==null){
				  e.preventDefault();
			  }else{
				  fn.blockScreen();
				  return true; 
			  }
		  } 
	  ); 
  });
  </script>