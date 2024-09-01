/*
 * @(#) CourseList.java    1.0     01/09/2024
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package edu.iuh.fit;

/*
 * @description
 * @author Do Duc Manh
 * @version 1.0
 * @date 01/09/2024
 */

public class CourseList {

    private Course[] courses;
    private static int count = 0;

    /**
     * @description: Constructor với tham số để khởi tạo mảng các khóa học với độ dài cụ thể n
     * @param n Độ dài của mảng
     * @throws IllegalArgumentException nếu n nhỏ hơn hoặc bằng 0
     */
    public CourseList(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("Length of the array must be greater than 0");
        courses = new Course[n]; // create an array of n elements
    }

    /**
     * Description: Thêm một khóa học vào danh sách
     * @param course
     * @return true nếu khóa học được thêm thành công, false nếu không
     * @throws IllegalArgumentException nếu khóa học là null, khóa học đã tồn tại, hoặc mảng đã đầy
     */
    public boolean addCourse(Course course) {
        //  check if course is null
        if(course == null)
            return false;
        //  check if course already exists
        if(exists(course)) //Check if id of course duplicate
            return false;
        //  check if the array is full
        if (count == courses.length)
            return false;
        //  add course to the array
        courses[count++] = course;
        return true;
    }

    /**
     * Description: Kiểm tra nếu khóa học tồn tại trong danh sách, dựa trên ID của khóa học
     * @param course Khóa học cần kiểm tra
     * @return true nếu khóa học tồn tại, false nếu không
     */
    private boolean exists(Course course) {
        for (int i = 0; i < count; i++) {
            if (courses[i] != null && courses[i].getId().equalsIgnoreCase(course.getId()))
                return true;
        }
        return false;
    }

    public Course[] getCourses() {
        return courses;
    }
}
