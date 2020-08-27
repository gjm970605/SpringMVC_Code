<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>

    <a href="account/findAll">测试</a>


    <form action="account/saveAccount" method="post">
        账户名称：<input type="text" name="name"/><br/>
        账户金额：<input type="text" name="money"><br/>
        <input type="submit" value="保存"/>
    </form>

    <h2>版本2.0</h2>

</body>
</html>
