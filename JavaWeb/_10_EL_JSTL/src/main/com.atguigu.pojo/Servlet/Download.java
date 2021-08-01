package Servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Download extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取下载的文件名
        String downloadFileanem="1.jpg";

        //2.读取要下载的文件内容（通过ServletContext对象可以读取）

        ServletContext servletContext= getServletContext();
       //获取要下载的文件类型
        String mimetype= servletContext.getMimeType("/file/"+downloadFileanem);
        System.out.println("下载的文件类型"+mimetype);
        resp.setContentType(mimetype);
        //Content-Disposition响应头，表示收到的数据怎么处理
        //attachment表示附件,表示下载使用
        //filename表示制定下载的文件名
        resp.setHeader("Content-Disposition","attachment;filename"+downloadFileanem);
        InputStream resourceAsStream= servletContext.getResourceAsStream("/file/"+downloadFileanem);
        OutputStream outputStream=resp.getOutputStream();
        //读取输入流中全部的数据，复制给输出流，输出给客户端

        //3.把下载的文件内容回传到客户端
        IOUtils.copy(resourceAsStream,outputStream);
        //4.在回传前，通过响应头告诉客户端返回的数据类型
        resp.setContentType("");
        //5.还要告诉客户端收到的数据是用于下载使用（还是响应头）

    }
}
