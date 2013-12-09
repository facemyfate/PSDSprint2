package timetable;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class AdminController {
 
    @Autowired
    private AdminDao adminDao;
 
    @RequestMapping(value="/admin")
    public ModelAndView timetable(HttpServletRequest request) throws ParseException {
        // Handle a new guest (if any):
        String course = request.getParameter("course");
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        String duration = request.getParameter("duration");
        String repeatFreq = request.getParameter("repeatFreq");
        String lecturer = request.getParameter("lecturer");
        String maxAtt = request.getParameter("maxAtt");
        String compulsory = request.getParameter("compulsory");
        String venue = request.getParameter("venue");
        if ((course != null) && (!date.equals("")) && (!time.equals("")) && (duration != null) && (repeatFreq != null) && (lecturer != null) && (maxAtt != null)&& (compulsory != null) && (venue != null))
            if (repeatFreq.equals("Weekly")){
            	String[] fiveWeeks = Admin.getFiveWeeksDate(date);
            	for (int i=0; i<5;i++) {
            		adminDao.persist(new Admin(course, fiveWeeks[i], time, duration, repeatFreq, lecturer, maxAtt, compulsory, venue));
            	}
            } else {
            	adminDao.persist(new Admin(course, date, time, duration, repeatFreq, lecturer, maxAtt, compulsory, venue));
            }
        return new ModelAndView("admin.jsp", "adminDao", adminDao);
    }
    
    @RequestMapping(value="/signup")
    public ModelAndView timetable2(HttpServletRequest request) throws ParseException {
        // Handle a new guest (if any):
        String course = request.getParameter("course");
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        String duration = request.getParameter("duration");
        String repeatFreq = request.getParameter("repeatFreq");
        String lecturer = request.getParameter("lecturer");
        String maxAtt = request.getParameter("maxAtt");
        String compulsory = request.getParameter("compulsory");
        String venue = request.getParameter("venue");
        if ((course != null) && (!date.equals("")) && (!time.equals("")) && (duration != null) && (repeatFreq != null) && (lecturer != null) && (maxAtt != null)&& (compulsory != null) && (venue != null))
            if (repeatFreq.equals("Weekly")){
            	String[] fiveWeeks = Admin.getFiveWeeksDate(date);
            	for (int i=0; i<5;i++) {
            		adminDao.persist(new Admin(course, fiveWeeks[i], time, duration, repeatFreq, lecturer, maxAtt, compulsory, venue));
            	}
            } else {
            	adminDao.persist(new Admin(course, date, time, duration, repeatFreq, lecturer, maxAtt, compulsory, venue));
            }
        return new ModelAndView("signup.jsp", "adminDao", adminDao);
    }
    
    @RequestMapping(value="/view")
    public ModelAndView timetable3(HttpServletRequest request) throws ParseException {
        // Handle a new guest (if any):
        String course = request.getParameter("course");
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        String duration = request.getParameter("duration");
        String repeatFreq = request.getParameter("repeatFreq");
        String lecturer = request.getParameter("lecturer");
        String maxAtt = request.getParameter("maxAtt");
        String compulsory = request.getParameter("compulsory");
        String venue = request.getParameter("venue");
        if ((course != null) && (!date.equals("")) && (!time.equals("")) && (duration != null) && (repeatFreq != null) && (lecturer != null) && (maxAtt != null)&& (compulsory != null) && (venue != null))
            if (repeatFreq.equals("Weekly")){
            	String[] fiveWeeks = Admin.getFiveWeeksDate(date);
            	for (int i=0; i<5;i++) {
            		adminDao.persist(new Admin(course, fiveWeeks[i], time, duration, repeatFreq, lecturer, maxAtt, compulsory, venue));
            	}
            } else {
            	adminDao.persist(new Admin(course, date, time, duration, repeatFreq, lecturer, maxAtt, compulsory, venue));
            }
        return new ModelAndView("view.jsp", "adminDao", adminDao);
    }
    
    @RequestMapping(value="/weeklyview")
    public ModelAndView timetable4(HttpServletRequest request) throws ParseException {
        // Handle a new guest (if any):
        String course = request.getParameter("course");
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        String duration = request.getParameter("duration");
        String repeatFreq = request.getParameter("repeatFreq");
        String lecturer = request.getParameter("lecturer");
        String maxAtt = request.getParameter("maxAtt");
        String compulsory = request.getParameter("compulsory");
        String venue = request.getParameter("venue");
        if ((course != null) && (!date.equals("")) && (!time.equals("")) && (duration != null) && (repeatFreq != null) && (lecturer != null) && (maxAtt != null)&& (compulsory != null) && (venue != null))
            if (repeatFreq.equals("Weekly")){
            	String[] fiveWeeks = Admin.getFiveWeeksDate(date);
            	for (int i=0; i<5;i++) {
            		adminDao.persist(new Admin(course, fiveWeeks[i], time, duration, repeatFreq, lecturer, maxAtt, compulsory, venue));
            	}
            } else {
            	adminDao.persist(new Admin(course, date, time, duration, repeatFreq, lecturer, maxAtt, compulsory, venue));
            }
        return new ModelAndView("weeklyview.jsp", "adminDao", adminDao);
    }
    
    @RequestMapping(value="/todayview")
    public ModelAndView timetable5(HttpServletRequest request) throws ParseException {
        // Handle a new guest (if any):
        String course = request.getParameter("course");
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        String duration = request.getParameter("duration");
        String repeatFreq = request.getParameter("repeatFreq");
        String lecturer = request.getParameter("lecturer");
        String maxAtt = request.getParameter("maxAtt");
        String compulsory = request.getParameter("compulsory");
        String venue = request.getParameter("venue");
        if ((course != null) && (!date.equals("")) && (!time.equals("")) && (duration != null) && (repeatFreq != null) && (lecturer != null) && (maxAtt != null)&& (compulsory != null) && (venue != null))
            if (repeatFreq.equals("Weekly")){
            	String[] fiveWeeks = Admin.getFiveWeeksDate(date);
            	for (int i=0; i<5;i++) {
            		adminDao.persist(new Admin(course, fiveWeeks[i], time, duration, repeatFreq, lecturer, maxAtt, compulsory, venue));
            	}
            } else {
            	adminDao.persist(new Admin(course, date, time, duration, repeatFreq, lecturer, maxAtt, compulsory, venue));
            }
        return new ModelAndView("todayview.jsp", "adminDao", adminDao);
    }
}