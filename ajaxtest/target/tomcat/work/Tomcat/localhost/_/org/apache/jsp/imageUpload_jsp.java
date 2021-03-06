/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-06-24 13:19:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class imageUpload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/js/webuploader/webuploader.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"page-header\">\r\n");
      out.write("        <h3>Ajax图片上传</h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"picker\">选择文件</div>\r\n");
      out.write("    <h3>图片预览</h3>\r\n");
      out.write("    <ul id=\"fileList\" class=\"list-unstyled list-inline\">\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("    <button id=\"btn\" class=\"btn btn-success\">开始上传</button>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"/static/js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("<script src=\"/static/js/webuploader/webuploader.min.js\"></script>\r\n");
      out.write("<script type=\"myTemplate\" id=\"progressTemplate\">\r\n");
      out.write("    <div class=\"progress\" style=\"padding: 0;height: 5px\" >\r\n");
      out.write("        <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" style=\"width: 0%\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("        var uploader = WebUploader.create({\r\n");
      out.write("            sef:\"/static/js/webuploader/Uploader.swf\",\r\n");
      out.write("            server:\"/upload\",\r\n");
      out.write("            pick:\"#picker\",\r\n");
      out.write("            fileVal:\"file\",\r\n");
      out.write("            accept:{\r\n");
      out.write("                title: 'Images',\r\n");
      out.write("                extensions: 'gif,jpg,jpeg,bmp,png',\r\n");
      out.write("                mimeTypes: 'image/*'\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        uploader.on(\"fileQueued\",function(file){\r\n");
      out.write("            var html = '<li id=\"'+file.id+'\"><img class=\"img-thumbnail\"></li>';\r\n");
      out.write("            $(\"#fileList\").append(html);\r\n");
      out.write("            uploader.makeThumb(file,function(error,src){\r\n");
      out.write("                if(error){\r\n");
      out.write("                    return;\r\n");
      out.write("                }\r\n");
      out.write("                $(\"#\"+file.id).find(\"img\").attr('src',src);\r\n");
      out.write("            },100,100);\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        uploader.on(\"uploadProgress\",function(file,percentage){\r\n");
      out.write("            percentage = parseInt(percentage*100);\r\n");
      out.write("            var $li = $(\"#\"+file.id);\r\n");
      out.write("            if ($li.find(\".progress\").length){\r\n");
      out.write("                $li.find(\".progress .progress-bar\").css(\"width\",percentage+\"%\");\r\n");
      out.write("            }else {\r\n");
      out.write("                var template = $(\"#progressTemplate\").html();\r\n");
      out.write("                $li.append(template);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        //当文件上传成功\r\n");
      out.write("        uploader.on(\"uploadSuccess\",function(file){\r\n");
      out.write("            $(\"#\"+file.id).css(\"color\",\"#ccc\");\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //当文件上传失败\r\n");
      out.write("        uploader.on(\"uploadError\",function(file){\r\n");
      out.write("            $(\"#\"+file.id).css(\"color\",\"darkred\");\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //无论文件上传成功或失败\r\n");
      out.write("        uploader.on(\"uploadComplete\",function(file){\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //手动开启上传\r\n");
      out.write("        $(\"#btn\").click(function(){\r\n");
      out.write("            uploader.upload();\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
