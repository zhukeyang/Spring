package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.ModelAndView;
import vo.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {
    //定义方法处理请求.
    //RequestMapping请求映射的注解 属性
    /*
     *   1.属性 value
     *       唯一值，以"/"开头
     *       位置 1.在方法的上面（）2.在类定义的上面(可选)
     *       作用：把指定的请求，交给指定的方法处理
     *   2.属性 method 请求的方式，使用RequestMethod类的枚举值
     *       例如get方式： RequestMethod.GET
     * 2.2接收参数对应HttpServletRequest request, HttpServletResponse response, HttpSession session
     * 只需要在控制器方法的形参列表中定义就可以，框架会给参数赋值
     * 在控制器方法内部可以直接使用request,reponse,session
     * 接收请求中的参数，逐个接受，对象接受
     *   1.逐个接受：
     *       请求参数中的参数名和控制器方法的形参名一样，按名称对应请求参数
     *  参数接收：
     *   1.框架使用request对象，接收参数
     *       request.getParamter("name");
     *   2.在中央调度器的内部调用 doProperParm方法时，按名称对象传递参数
     *       框架可以实现请求参数 String 到int ,long等类型的转换
     * @RequestParam:解决请求参数中形参名不一样
     *   属性：value 请求中的参数名称
     *        required:boolean类型的，默认是true
     *                   TRUE：请求中必须有此参数，没有报错
     *                   FALSE：请求中可以没有此参数。
     *   对象接收：
     *       1.在控制器方法的形参是java对象，使用java对象的属性接收请求中的参数值
     *       要求：java对象的属性值和请求参数名一样。
     *
     *   位置：在形参定义的面前
     * 返回值ModelAndView表示本次请求的处理结果（数据和视图）
     * Model：表示数据
     * view：表示视图
     * */
    @RequestMapping(value = {"/some.do", "/receive-property.do"}, method = RequestMethod.GET)
    public ModelAndView dosome(String name, int age) {

        System.out.println("DOsome执行方法" + "name:" + name + "      " + "age:" + age);
        //使用这个方法处理请求
        //应该调用service对象，处理请求，返回数据
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "处理了some.do的请求");
        mv.addObject("function", "执行了dosome方法");
        mv.addObject("myname", name);
        mv.addObject("myage", age);
        //setViewName：视图的完整路径
        mv.setViewName("show");
        return mv;
    }

    /*
     * 当框架调用完dosome()方法后，得到返回modelView
     * 框架会在后续的处理逻辑值，处理mv对象里的数据和视图
     * 对数据执行 request.setAttribute;是吧数据放入request的作用域
     * 对视图执行forward转发操作，等同于
     *
     * */
    @RequestMapping(value = {"/other.do", "/second.do"})
    public ModelAndView doOther() {
        System.out.println("otherDo执行方法");
        //使用这个方法处理请求
        //应该调用service对象，处理请求，返回数据
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "处理了doOther的请求");
        mv.addObject("function", "执行了doOther方法");
        //setViewName：视图的完整路径
        mv.setViewName("show");
        return mv;
    }

    /*
     * 适用对象接收请求中的参数
     * 要求：参数名，java对象的属性名一样
     *      java类需要有一个无参构造方法，属性有set方法
     *框架的处理：
     *   1.调用Student的无参构造方法，创建对象
     *   2.在调用对象的set方法，同名的参数，调用对应的set方法
     *       参数是name,调用setName(参数值)
     * */
    @RequestMapping("/receive-object.do")
    public ModelAndView doReceiveObject(Student student) {
        System.out.println("MyController的方法doReceiveObject" + student);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname", student.getName());
        mv.addObject("myage", student.getAge());
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping("/return-string-view.do")
    public String doReturnStringview1(HttpServletRequest request, String name,Integer age) {
        System.out.println("MyController的方法doReturnStringview1" + name+age);
        //处理数据，
        request.setAttribute("myname",name);
        request.setAttribute("myage",age);
        //返回结果,forward转发到show.jsp
        return "show";
    }
    @RequestMapping("/return-string-view2.do")
    public String doReturnStringview2(HttpServletRequest request, String name,Integer age) {
        System.out.println("MyController的方法doReturnStringview1" + name+age);
        //处理数据，
        request.setAttribute("myname",name);
        request.setAttribute("myage",age);
        //返回结果,forward转发到show.jsp
        return "show";
    }
    /*
    * 控制区方法返回的是void，响应ajax请求，使用HttpServletResponse输出数据
    *
    *
    * */
    @RequestMapping("/return-void-ajax.do")
    public void returnVoidAjax(HttpServletResponse response, String name,Integer age) throws IOException {
        System.out.println("处理void返回类型："+"name"+name+"age"+age);
        Student student=new Student();
        student.setName(name+"同学");
        student.setAge(age);
        //讲对象转为json
        ObjectMapper om=new ObjectMapper();
        String json=om.writeValueAsString(student);
        System.out.println("服务器对象转为json=="+json);
        //输出json，响应ajax
        response.setContentType("UTF-8");
        PrintWriter pw=response.getWriter();
        pw.println(json);
        pw.flush();
        pw.close();


    }
    /*
     * 控制器方法返回Student--json
     *加注解
     * */
    @RequestMapping("/doStudentJson.do")
    @ResponseBody
    public Student doAjaxjson(String name,Integer age)
    {
        System.out.println("控制器方法返回自定义对象Student,转为json");
        Student student=new Student();
        student.setName("同学"+name);
        student.setAge(age);
        return student;
    }
    /*
    * 控制器方法返回集合List
    *
    * */
    @RequestMapping("/doStudentJsonArray.do")
    @ResponseBody
    public Student doAjaxjsonArray(String name,Integer age)
    {
        System.out.println("控制器方法返回自定义List<Student>,转为jsonarray");
        Student student=new Student();
        student.setName("张三同学"+name);
        student.setAge(15);
        Student student1=new Student();
        student.setName("李四同学"+name);
        student.setAge(20);
        List<Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student);
        return student;
    }
    /*
    * 控制器方法返回string--数据
    *区分返回值string时数据还是视图
    *   1.方法上有@ReponseBody注解就
    * .
    * 0.
    * 0是数据
    *   2.方法上面没有@ReponseBody注解就是视图
    * */
    @RequestMapping("/doStringData.do")
    @ResponseBody
    public String doStringData(String name,Integer age)
    {
        System.out.println("控制器方法返回String,是数据");
        return "hellospringMVC注解式开发";
    }
}
