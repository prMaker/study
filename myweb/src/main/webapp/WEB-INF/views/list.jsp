<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible"content="IE=9; IE=8; IE=7; IE=EDGE" />
    <title>内容列表页面</title>
    <link href="/static/css/all.css" rel="stylesheet" type="text/css" />
</head>
<body style="background: #e1e9eb;">
<form action="" id="mainForm" method="post">
    <div class="right">
        <div class="current">当前位置：<a href="javascript:void(0)" style="color:#6E6E6E;">内容管理</a> &gt; 内容列表</div>
        <div class="rightCont">
            <p class="g_title fix">内容列表 <a class="btn03" href="/add">新 增</a>&nbsp;&nbsp;&nbsp;&nbsp;</p>
            <table class="tab1">
                <tbody>
                <tr>
                    <td width="90" align="right">指令名称：</td>
                    <td>
                        <input type="text" class="allInput" value=""/>
                    </td>
                    <td width="90" align="right">描述：</td>
                    <td>
                        <input type="text" class="allInput" value=""/>
                    </td>
                    <td width="85" align="right"><input type="submit" class="tabSub" value="查 询" /></td>
                </tr>
                </tbody>
            </table>
            <div class="zixun fix">
                <table class="tab2" width="100%">
                    <tbody>
                    <tr>
                        <th><input type="checkbox" id="all" onclick=""/></th>
                        <th>序号</th>
                        <th>指令名称</th>
                        <th>描述</th>
                        <th>操作</th>
                    </tr>
                    <c:forEach items="${messageList}" var="msg" varStatus="status">
                        <tr <c:if test="${status.index%2!=0}">style="background-color:#ECF6EE;" </c:if>>
                        <td><input type="checkbox" /></td>
                        <td>${status.index+1}</td>
                        <td>${msg.description}</td>
                        <td>${msg.command}</td>
                        <td>
                            <button id="edit">修改</a>&nbsp;&nbsp;&nbsp;</button>
                            <button id="del" data="${msg.command}">删除</button>
                        </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <div class='page fix'>
                    共 <b>4</b> 条
                    <a href='###' class='first'>首页</a>
                    <a href='###' class='pre'>上一页</a>
                    当前第<span>1/1</span>页
                    <a href='###' class='next'>下一页</a>
                    <a href='###' class='last'>末页</a>
                    跳至&nbsp;<input type='text' value='1' class='allInput w28' />&nbsp;页&nbsp;
                    <a href='###' class='go'>GO</a>
                </div>
            </div>
        </div>
    </div>
</form>
<script src="/static/js/jquery-1.11.3.min.js"></script>
<script>
    $(function(){
        $("td>button#del").click(function(){
            if (confirm("确认要删除吗？")) {
                var command = $(this).attr("data");
                location.href = "/del?command=" + command;
            }
        });
    });
</script>
</body>
</html>
