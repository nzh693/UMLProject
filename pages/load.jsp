<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"  isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html >
<head>
    <title>登录注册</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/pages/css/styles.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/jquery-1.11.1.min.js"></script>

    <script type="text/javascript" >


    </script >
</head>
<body>

<div class="jq22-container" style="padding-top:100px">
    <div class="login-wrap">
        <div class="login-html">
            <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
            <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
            <div class="login-form">
                <div class="sign-in-htm">
                    <form method="post" action="../seeker/load">
                        <%--名称--%>
                        <div class="group">
                            <label  class="label">Username</label>
                            <input name="userName" type="text" class="input">
                        </div>
                        <%--密码--%>
                        <div class="group">
                            <label class="label">Password</label>
                            <input  name="userPassword" type="password" class="input" >
                        </div>

                        <div class="group">
                            <input id="check" type="checkbox" class="check" checked>
                            <label for="check"><span class="icon"></span> Keep me Signed in</label>
                        </div>
                        <div class="group">
                            <input type="submit" class="button" value="Sign In" id="signIn">
                        </div>

                        <div class="hr"></div>
                        <div class="foot-lnk">
                            <a href="#forgot">Forgot Password?</a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>