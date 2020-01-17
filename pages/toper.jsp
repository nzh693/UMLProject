<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% String path = request.getContextPath();%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
      <link rel="stylesheet" type="text/css" href="<%=path%>/pages/css/toper.css">
</head>
<body>
<div class="nav">
    <div class="nav_top">
        <div class="top_main">
            <div class="logo">
                <a href="#">
                    <img class="image_logo" src="<%=path%>/pages/img/logo.png" style="width: 35px;height: 35px;margin-right:8px;margin-top: 20px;"/>
                </a>
            </div>
            <div style="width: 50%; float: left;margin-top: 18px;">
                <a href="#" class="logo_a" style="text-decoration: none;color: white; font-size: 32px">职来职网</a>
            </div>

            <div class="menu" >
                <a href="#"><img src="<%=path%>/pages/img/centre.png" style="width: 35px;height: 35px;margin-right:8px;margin-top: 20px;"/></a>
            </div>
        </div>

    </div>

    <div class="nav_content">
              <div class="middle_ul">
                  <ul>
                      <li><a href="#">首页</a></li>
                      <li><a href="#">行业</a></li>
                      <li><a href="#">职位</a></li>
                      <li><a href="#">简历</a></li>
                      <li><a href="#">海外</a></li>
                      <li><a href="#">下载APP</a></li>
                  </ul>
              </div>
    </div>
</div>



</body>
</html>