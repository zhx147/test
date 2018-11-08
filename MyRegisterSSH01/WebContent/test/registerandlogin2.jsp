<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
        .chenjirong{
            margin-top: 265px;
        }

    </style>
<title>register</title>
<script src="./jquery-3.2.1.js"></script>
</head>
<body>
<div class="zhx" align="center">
<table align="center" border="15" BorderColor="#FF5800">
    <tr>
        <th>
     <form action="" id="myform01">
                    输入用户名:<input type="text"  name="oneuser.myusername" id="myusername">
                <br>
                  输入密码:<input  type="password"  name="oneuser.mypassword" id="mypassword">
                <br>
     </form>   
        <button  type="button"  onclick="myregister()">注册</button>
        <button  type="button"  onclick="mylogin()">登录</button>
        </th>
    </tr>
</table>
<span id="myshow"></span>
</div>
<script>
   function  myregister(){
   var  x=$("#myform01").serializeArray();
   $("#myshow").load("register.action", x);
   }

   function  mylogin(){
	   var  x=$("#myform01").serializeArray();
	   $("#myshow").load("login.action", x);
   }
   
</script>
</body>
</html>