<html lang="zh-CN">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<head>
    <title>
        <!-- 新 Bootstrap 核心 CSS 文件 -->
        <link rel="stylesheet" href="${request.contextPath}/css/bootstrap.min.css">
        <!-- 可选的Bootstrap主题文件（一般不用引入） -->
        <link rel="stylesheet" href="${request.contextPath}/css/bootstrap-theme.min.css">
        <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
        <script src="${request.contextPath}/js/jquery.min.js"></script>
        <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
        <script src="${request.contextPath}/js/bootstrap.min.js"></script>
    </title>

<body>

<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <table  class="table table-striped table-condensed table-hover">
                <thead>
                <tr class="bg-primary">
                    <th>
                        编号
                    </th>
                    <th>
                        产品
                    </th>
                    <th>
                        交付时间
                    </th>
                    <th>
                        状态
                    </th>
                </tr>
                </thead>
                <tbody>
                <#list list as twitter>
                <tr>
                    <td style="width: 180px">
                        <img style="width: 50px;" src="${twitter.bigimg}" alt="${twitter.desc}" class="img-rounded">
                    </td>
                    <td>
                        ${twitter.desc}
                    </td>
                    <td>
                        ${twitter.desc}
                    </td>
                </tr>
                </#list>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>