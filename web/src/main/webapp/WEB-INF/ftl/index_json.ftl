<html lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>waterfall demo</title>
    <link rel="stylesheet" href="${request.contextPath}/css/waterfall.min.css">
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${request.contextPath}/css/bootstrap.min.css">
    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="${request.contextPath}/css/bootstrap-theme.min.css">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="${request.contextPath}/js/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="${request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">拾家</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">家居 <span class="sr-only">(current)</span></a></li>
                <li><a href="#">生活</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">工作 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">云总</a></li>
                        <li><a href="#">九如</a></li>
                        <li><a href="#">傻丸</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">小苹果</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">马云</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">马化腾</a></li>
                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search">
                </div>
                <button type="submit" class="btn btn-default">直击心门</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">咻一咻</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">联系我们 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">云总电话</a></li>
                        <li><a href="#">马云电话</a></li>
                        <li><a href="#">马化腾电话</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

<div id="waterfall-wrap" class="waterfall"></div>

<script type="text/javascript" src="${request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${request.contextPath}/js/waterfall.min.js"></script>
<script type="text/javascript">

    var curPage = 1,
    perPageCount = 20;

    function callData(callback) {
        $.ajax({
            url: 'http://platform.sina.com.cn/slide/album_tech',
            dataType: 'jsonp',   //这里使用了新浪新闻的 jsonp 接口，大家可以直接看数据， 如： http://platform.sina.com.cn/slide/album_tech?jsoncallback=func&app_key=1271687855&num=3&page=4
            jsonp:"jsoncallback",
            data: {
                app_key: '1271687855',
                num: perPageCount,
                page: curPage
            }
        }).done(function(ret){
            if(ret && ret.status && ret.status.code === "0"){
                callback(ret.data);
                curPage++;
            }else{
                console.log('get error data');
            }
        });
    }

    function getRandomInt(min, max) {
        return Math.floor(Math.random() * (max - min + 0.99)) + min;
    }

    function getData(){
        var data = []
        lastRandomInt = 0,
                randomInt = 0;
        for (var i = 0; i < 10; i++) {
            randomInt = getRandomInt(1, 9);
            while (randomInt === lastRandomInt) {
                randomInt = getRandomInt(1, 9);
            }
            lastRandomInt = randomInt;
            data.push({
                "img": "http://7xrunf.com1.z0.glb.clouddn.com/rcong-pic" + randomInt + ".jpeg",
                "description": "我是二次元少年中二未毕业"
            });
        }
        return data;
    }

    waterfall.init($('#waterfall-wrap'));
    //mock数据
    waterfall.render({
        data: getData(),
        content: 'img',
        desc: 'description'
    });
    //真实数据
//     callData(function(data){
//         waterfall.render({
//             data: data,
//             content: 'img_url',
//             desc: 'name'
//         });
//     });
//    waterfall.touchBottom(function () {
        //mock数据
//        waterfall.render({
//            data: getData(),
//            content: 'img',
//            desc: 'description'
//        });
//        真实数据
    waterfall.touchBottom(function () {
         callData(function(data){
             waterfall.render({
                 data: data,
                 content: 'img_url',
                 desc: 'name'
             });
         });
    });

</script>
</body>
</html>
