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

<title>首页</title>
    <link rel="stylesheet" type="text/css" href="<%=path%>/pages/css/main.css">
</head>

<body>

<%//获取首页职位数据
    List<Position> positions=(List<Position>)request.getAttribute("positions");
%>

<div style="margin-bottom:30px;">
    <jsp:include page="toper.jsp"></jsp:include>
</div>

<div class="main" >
    <div class="system_ad1" >

    </div>

    <div class="content">
        <div class="contentLeft">
            <div class="search">
                <!--居中-->
                <div class="searchMian">
                    <div class="input">
                        <input type="text" class="searchInput" placeholder="Java工程师"  />
                    </div>
                    <div class="startSearch">
                        <img src="<%=path%>/pages/img/search.png"  style="width: 100%;height: 100%;"/>
                    </div>
                    <div class="hotSearch">

                        <ul>
                            <li style="color: #999;">热门搜索:</li>
                            <li>运营</li>
                            <li>产品经理</li>
                            <li>销售</li>
                            <li>UI设计</li>
                            <li>人力资源</li>
                            <li>市场</li>
                            <li>城市经理</li>
                            <li>人力资源</li>
                        </ul>
                    </div>
                </div>

            </div>

            <div class="selection">
                <div class="menu_content">
                    <a href="#">推荐职位</a>
                    <a href="#">今日精选</a>
                </div>
            </div>


            <%
                for(Position position:positions){
            %>

              <div class="showPosition">
                <%--职位信息--%>
                  <a href="../PositionControl/getPositionDetail?id=<%=position.getId()%>">
                      <div class="positionInfo">
                          <div class="positonName">
                              <span><%=position.getName()%></span>
                          </div>
                          <div class="positonDetail">
                              <div class="positonDetail_ul">
                                  <ul>
                                      <li style="color: #ff6600;font-size: 16px;"><%=position.getSalary()%></li>|
                                      <li><%=position.getWorkPlace()%></li>|
                                      <li><%=position.getLimits()%></li>|
                                  </ul>
                              </div>

                          </div>
                          <div class="positonTime">
                              <span><%=position.getUpTime()%></span>
                          </div>
                      </div>
                <%--公司信息--%>
                      <div class="companyInfo">
                          <div class="companyInfoChild">
                              <div class="companyName">
                                  <span><%=position.getCompany().getCo_name()%></span>
                              </div>
                              <%--公司领域--%>
                              <div class="companyField">
                                  <ul>
                                      <%
                                          for (TradeField t:position.getCompany().getTradeFields()){
                                      %>
                                      <li><%=t.getTf_name()%></li>/
                                      <%
                                          }
                                      %>

                                  </ul>
                              </div>
                              <div class="companyLable">
                                  <ul>
                                      <%
                                         for(String warefare:position.getWareFares()){
                                      %>
                                      <li><%=warefare%></li>
                                      <%
                                         }
                                      %>
                                  </ul>
                              </div>
                          </div>
                      </div>
                  </a>

              </div>
                <%
                    }
                %>
        </div>

        <div class="contentRight">
            <div class="basicInfo">个人基本信息</div>
            <div class="system_ad2">系统广告</div>
            <div class="powerlimit">隐私权限设置</div>
            <div class="systemStatistic">系统数据统计</div>
            <div class="systemService">系统服务</div>
        </div>
    </div>
</div>
</body>
</html>