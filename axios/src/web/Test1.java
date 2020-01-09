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
		System.out.println("�������:" + param);
		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Vue`s axios getRequest</h1>");
		writer.flush();
		writer.close();
		System.out.println("�ر�");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// form��ֱ���ύ��from����ʽ�ύ���������
		// post��ʽ�ķǱ���ʽ�ύ(application/x-www-form-urlencoded)����ͨ�����淽ʽ�������ݡ�
		// String user = req.getParameter("name");

		// System.out.println(user);

		// ͨ���ֽ�����ȡ����
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
		// ͨ���ַ�����ȡ����(���ֽ������ʱ�򣬷�ֹ�����ʱ�����)
		// ������UTF-8��ռ�������ֽڣ�����պö���һ���������ֽ��ˣ���ô�ͽ�������
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
