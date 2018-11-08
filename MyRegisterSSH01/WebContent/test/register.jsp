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
</head>
<body>
<div class="chenjirong" align="center">
<table align="center" border="15" BorderColor="#FF5800">
    <tr>
        <th>
     <form action="register.action" method="post">
                    输入 用户名:<input type="text"  name="oneuser.myusername">
                <br>
                  输入密码:<input  type="password"  name="oneuser.mypassword">
                <br>
         <input type="submit" value="注册">
     </form>   
        </th>
    </tr>
</table>
</div>
</body>
</html>