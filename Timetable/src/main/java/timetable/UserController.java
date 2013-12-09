package timetable;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class UserController {
 
    @Autowired
    private AdminDao adminDao;
 
    @RequestMapping(value="/user")
    public ModelAndView timetable(HttpServletRequest request) {
        // Handle a new guest (if any):
        /*String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ((username != null) && (password != null))
        	userDao.persist(new User(username, password));*/
 
        // Prepare the result view (guest.jsp):
        return new ModelAndView("user.jsp", "adminDao", adminDao);
    }
}