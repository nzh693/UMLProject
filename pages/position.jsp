<%@ page import="java.util.List" %>
<%@ page import="entitys.Position" %>
<%@ page import="entitys.TradeField" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<!DOCTYPE html>
<% String path = request.getContextPath();%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="<%=path%>/pages/css/position.css" rel="stylesheet"  type="text/css">

    <title>职位详情</title>
    <link rel="stylesheet" type="text/css" href="<%=path%>/pages/css/xcConfirm.css"/>
    <script src="<%=path%>/pages/js/jquery-1.9.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="<%=path%>/pages/js/xcConfirm.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript">
        $(function(){
            $("#popWindow").click(function(){
                var box=document.getElementById("choice-box");
                var form=document.getElementById("form");
                if(box.style.display=="block"){
                    $('#choice-box').css("display","none");
                }else {
                    $('#choice-box').css("display","block");
                }
            });

            $('#bt_ok').click(function () {
                //  selectvalue为radio中选中的值
                var radio=document.getElementsByName("radio");
                var selectvalue=null;
                for(var i=0;i<radio.length;i++){
                    if(radio[i].checked==true) {
                        selectvalue=radio[i].value;
                        break;
                    }
                }
                //发送请求
                $.post(
                    "../seeker/sendResume",
                    {
                        userId:${sessionScope.id},//从session中获取该用户id
                        resumeChoice:selectvalue,//简历选择
                        positionId:${requestScope.position.id},//从本页面获取职位id
                    },
                    function(data){
                         alert(data);
                    });
                $('#choice-box').css("display","none");
            });

            $('#bt_not').click(function () {
                $('#choice-box').css("display","none");
            })

        });
    </script>

</head>

<body>
   <%
    Position position=(Position) request.getAttribute("position");
    List<String> limits=(List<String>)request.getAttribute("limits");
    List<String> lables=(List<String>)request.getAttribute("lables");
   %>



       <%--导航栏--%>
       <div style="margin-bottom:30px;">
           <jsp:include page="toper.jsp"></jsp:include>
       </div>
       <%--弹出框--%>
       <div id="choice-box">
               <div id="box_header">
                   <div style="margin-left: 25px;font-size: 18px; padding-top: 20px">
                       <span>投递确认</span>
                   </div>

               </div>
               <div id="box_selection">

                   <div   id="form"  style="width: 100%;height: 100%; margin: 0px auto">
                       <div id="box_itemOne">
                           <div class="radio">
                               <input id="radio-1" name="radio" type="radio" value="0" checked>
                               <label for="radio-1" class="radio-label" style="color: #303a40">系统简历</label>
                           </div>
                           <div class="radio">
                               <input id="radio-2" name="radio" type="radio" value="1">
                               <label  for="radio-2" class="radio-label" style="color: #303a40">个人简历</label>
                           </div>
                       </div>
                       <div id="box_itemsTwo">
                           <div id="box_bt_div">
                               <button id="bt_ok" ><span style="color: white">确认</span></button>
                               <button id="bt_not"><span style="color: white">取消</span></button>
                           </div>
                       </div>
                   </div>


               </div>

           </div>

       <div class="wrap">
           <div class="main">
               <div class="mainLeft">
                   <div class="positionName">

                       <div style="margin-bottom: 15px">
                           <h1><p style="color: white"><%=position.getName()%></p></h1>
                       </div>

                       <h3><p style="color: white"><%=position.getCompany().getCo_name()%></p></h3>

                   </div>
                   <%--职位概况--%>
                   <div class="positionInfo">
                       <%--薪资水平--%>
                       <div class="infoOne">
                           <div class="salary">
                               <h1 style="font-size: 40px;color: #ff7f00"><%=position.getSalary()%></h1>
                           </div>
                           <a href="#">
                               <div class="sendResume"  id="popWindow">
                                   <span  style="color: white;font-size: 20px">应聘职位</span>
                               </div>
                           </a>

                       </div>
                       <%--限制要求--%>
                       <div class="infoTwo">
                           <ul>
                               <%
                                   for(String l:limits){
                               %>
                               <li style="margin-right: 15px;font-size: 23px"><span><%=l%>/</span></li>
                               <%
                                   }
                               %>
                           </ul>
                       </div>
                       <%--标签--%>
                       <div class="infoThree">
                           <ul>
                               <%
                                   for(String la:lables){
                               %>
                               <li style="margin-right: 15px;font-size: 16px"><%=la%></li>
                               <%
                                   }
                               %>
                           </ul>
                       </div>
                       <%--长传时间--%>
                       <div class="infoFour">
                           <span><%=position.getUpTime()%></span>
                       </div>
                   </div>
                   <%--职位职责及描述--%>
                   <div class="positionDesc">
                       <%--职位描述--%>
                       <div class="positionDescOne">
                           <article>
                               <header>
                                   <h3 style="border-left: #127fb6 solid 3px;padding-left: 5px;">岗位职责：</h3>
                               </header>
                               <div class="detailDescOne">
                                   <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=position.getDesc()%></span>
                               </div>

                           </article>
                       </div>
                       <%--任职要求--%>
                       <div class="positionDescTwo">
                           <article>
                               <header>
                                   <h3 style="border-left: #127fb6 solid 3px;padding-left: 5px;">任职资格：</h3>
                               </header>

                               <div class="detailDescTwo">
                                   <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=position.getStatus()%></span>
                               </div>

                           </article>
                       </div>
                   </div>
                   <%--职位匹配度--%>
                   <div class="positionMatch">

                       <div class="positionMatchTile">
                           <h3 style="border-left: #127fb6 solid 3px;padding-left: 5px;">职位匹配度</h3>
                       </div>
                   </div>
                   <%--职位推荐--%>
                   <div class="positionRecommend">
                       <div class="positionRecommendOne">
                           <h3 style="border-left: #127fb6 solid 3px;padding-left: 5px;">职位推荐</h3>
                       </div>
                   </div>

               </div>


               <div class="mainRight">

                   <div class="companyInfo">
                       <div class="companyImageAndName">


                       </div>

                       <div class="companyMap">
                           地图
                       </div>

                       <div class="companyBoss">
                           职位发布人
                       </div>
                   </div>

                   <div class="system_ad3">
                       系统广告
                   </div>

                   <div class="companyRecommend">
                       公司推荐
                   </div>
               </div>

           </div>
       </div>


</body>
</html>