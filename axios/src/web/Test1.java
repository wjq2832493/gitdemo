package web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String param = req.getParameter("param");
		System.out.println("请求参数:" + param);
		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Vue`s axios getRequest</h1>");
		writer.flush();
		writer.close();
		System.out.println("关闭");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// form表单直接提交和from表单形式提交是有区别的
		// post方式的非表单方式提交(application/x-www-form-urlencoded)则不能通过下面方式接受数据。
		// String user = req.getParameter("name");

		// System.out.println(user);

		// 通过字节流读取数据
		// ServletInputStream is = req.getInputStream();
		// byte[] buf = new byte[1024];
		// int len;
		// StringBuilder sb = new StringBuilder();
		// while((len=is.read(buf))!=-1){
		// String str = new String(buf,0,len,"UTF-8");
		// sb.append(str);
		// }
		// System.out.println(sb.toString());
		// resp.getWriter().print("axios--post");
		// 通过字符流读取数据(当字节数多的时候，防止解码的时候出错)
		// 中文在UTF-8中占用三个字节，如果刚好读完一次是两个字节了，那么就解码乱码
		BufferedReader br = req.getReader();
		StringBuilder sb = new StringBuilder();
		String line = null;
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		System.out.println(sb.toString());
		resp.getWriter().print("axios--post");
	}

}
