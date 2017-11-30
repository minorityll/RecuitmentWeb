<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <title><tiles:getAsString name="title" /></title>
	<!-- Script Define Here -->
	 	<tiles:insertAttribute name="script" />
	<!-- End Script  -->
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
  <!-- Header Navigation-->
  	 <tiles:insertAttribute name="header" />
  <!-- End Navigation-->
  
  <!--  Body   -->
  <div class="content-wrapper">
    <div class="container-fluid">
     <tiles:insertAttribute name="body" />
      <!-- Breadcrumbs-->
<!--       <ol class="breadcrumb"> -->
<!--         <li class="breadcrumb-item"> -->
<!--           <a href="index.html">Dashboard</a> -->
<!--         </li> -->
<!--         <li class="breadcrumb-item active">Blank Page</li> -->
<!--       </ol> -->
<!--       <div class="row"> -->
<!--         <div class="col-12"> -->
<!--           <h1>Blank</h1> -->
<!--           <p>This is an example of a blank page that you can use as a starting point for creating new ones.</p> -->
<!--         </div> -->
<!--       </div> -->
    </div>
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->
    <!-- End Body   -->
    
    <!--  Footer Here -->
     <tiles:insertAttribute name="footer" />
    <!-- End Footer  -->
    
    <!-- Logout Modal-->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
          <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/logout">Logout</a>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>

</html>
