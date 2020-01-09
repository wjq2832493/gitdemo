package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class Test3 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		List<Phone> list = new ArrayList<>();
		Phone p1 = new Phone("Redmi K30","120Hz流速屏，全速热爱", "1599元起", "https://cdn.cnbj1.fds.api.mi-img.com/mi-mall/2c16238f786e4f93bdb175d7bf21aa47.jpg?thumb=1&w=200&h=200&f=webp&q=90");
		Phone p2 = new Phone("Redmi K30 5G","120Hz流速屏，全速热爱", "2599元起", "https://cdn.cnbj1.fds.api.mi-img.com/mi-mall/53641901fbc28cbcdb495b17fdf69e46.jpg?thumb=1&w=200&h=200&f=webp&q=90");
		Phone p3 = new Phone("Redmi K30 6G","120Hz流速屏，全速热爱", "3599元起", "https://cdn.cnbj1.fds.api.mi-img.com/mi-mall/07270cc09689eb9b13b29aa9f6bc41eb.jpg?thumb=1&w=200&h=200&f=webp&q=90");
	    list.add(p1);
	    list.add(p2);
	    list.add(p3);
	    Gson gson = new Gson();
	    String jsonStr = gson.toJson(list);
	    resp.getWriter().append(jsonStr);
	}

}
