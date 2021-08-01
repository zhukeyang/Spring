package Servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class UploadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.先判断上传得数据是否多段数据（只有多段的数据，才是文件上传的）
        if(ServletFileUpload.isMultipartContent(req))
        {
            //创建工厂实现类
            FileItemFactory fileItemFactory =new DiskFileItemFactory();

            //用于解析上传数据的工具类ServletFileUpload类
            ServletFileUpload servletFileUpload= new ServletFileUpload(fileItemFactory);
            try {
                List<FileItem> list =servletFileUpload.parseRequest(req);

                for (FileItem fileItem : list) {
                    if(fileItem.isFormField())
                    {
                        System.out.println("表单项的name属性值"+fileItem.getFieldName());
                        //参数UTF-8解决乱码问题
                        System.out.println("表单项的value属性值"+fileItem.getString("UTF-8"));
                    }
                    else
                    {
                        System.out.println("表单项的name属性值"+fileItem.getFieldName());
                        System.out.println("上传的文件名"+fileItem.getName());

                        fileItem.write(new File("E:/"+fileItem.getName()));

                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        System.out.println("文件上传过来");
//        ServletInputStream servletInputStream =req.getInputStream();
//        byte[] buffer = new byte[1024000];
//        System.out.println(servletInputStream.read(buffer));
//        System.out.println(new String(buffer,0,servletInputStream.read()));
    }
}
