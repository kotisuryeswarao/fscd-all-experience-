package com.example.welcome;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CourseService {

    private List<Course> courseList = new ArrayList<>();

    public List<Course> getAll() {
        return courseList;
    }

    public Course addCourse(Course course) {
        courseList.add(course);
        return course;
    }

    public Course getById(int id) {
        for (Course c : courseList) {
            if (c.getCourseId() == id)
                return c;
        }
        return null;
    }

    public boolean delete(int id) {
        return courseList.removeIf(c -> c.getCourseId() == id);
    }

    public Course update(int id, Course updated) {
        for (Course c : courseList) {
            if (c.getCourseId() == id) {
                c.setTitle(updated.getTitle());
                c.setDuration(updated.getDuration());
                c.setFee(updated.getFee());
                return c;
            }
        }
        return null;
    }
}