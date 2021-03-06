package com.kaishengit.web;

import com.kaishengit.dao.MovieDAO;
import com.kaishengit.entity.Movie;
import com.kaishengit.service.MovieService;
import com.kaishengit.util.Page;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list")
public class PageServlet extends HttpServlet {
    private MovieDAO dao = new MovieDAO();
    private Logger logger = LoggerFactory.getLogger(PageServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pageNo = req.getParameter("p");
        int p = 1;
        if (StringUtils.isNumeric(pageNo)){
            p = Integer.parseInt(pageNo);
        }
        MovieService movieService = new MovieService();
        Page<Movie>page = movieService.findMovieBy(p);
        req.setAttribute("page",page);
        req.getRequestDispatcher("/WEB-INF/views/page.jsp").forward(req,resp);

    }
}
