
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/js/webuploader/webuploader.css">
</head>
<body>
    <div class="container">
        <div class="page-header">
            <h3>Ajax文件上传</h3>
        </div>
        <div id="picker">选择文件</div>
        <h3>文件上传队列：</h3>
        <ul id="fileList">

        </ul>
        <button id="btn" class="btn btn-success">开始上传</button>
    </div>

    <script src="/static/js/jquery-1.11.3.min.js"></script>
    <script src="/static/js/webuploader/webuploader.min.js"></script>

    <script type="myTemplate" id="progressTemplate">
        <div class="progress col-xs-1" style="padding: 0;height: 5px" >
            <div class="progress-bar progress-bar-success" role="progressbar" style="width: 0%"></div>
        </div>
    </script>

    <script>
        $(function(){
            var uploader = WebUploader.create({
                swf:"/static/js/webuploader/Uploader.swf",
                server:"/upload",
                pick:"#picker",
                fileVal:"file"
            });


            uploader.on("uploadProgress",function(file,percentage){
                percentage = parseInt(percentage*100);
                var $li = $("#"+file.id);
                if ($li.find(".progress").length){
                    $li.find(".progress .progress-bar").css("width",percentage+"%");
                }else {
                    var template = $("#progressTemplate").html();
                    $li.append(template);

                }
            });

            uploader.on("fileQueued",function(file){
                console.log(file.id+"->"+file.name);
                var html = "<li id='"+file.id+"'>"+file.name+"</li>";
                $("#fileList").append(html);
            });

            uploader.on("uploadSuccess",function(file){
                $("#"+file.id).css("color","#ccc");

            });
            uploader.on("uploadError",function(file){
                $("#"+file.id).css("color","red");

            });
            uploader.on("uploadComplete",function(){

            });

            $("#btn").click(function(){
                uploader.upload();
            });

        });
    </script>
</body>
</html>
