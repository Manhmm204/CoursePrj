/*
 * @(#) Course.java    1.0     01/09/2024
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package edu.iuh.fit;

/*
 * @description
 * @author Do Duc Manh
 * @version 1.0
 * @date 01/09/2024
 */

public class Course {
    private String id;
    private String title;
    private int credit;
    private String department;

    /*
     * descriptionL: hàm không tham số
     */
    public Course() {
    }

    /*
     * descriptionL: hàm có tham số

     * @param id : mã của khóa học
     * @param title: tiêu đề của khóa học
     * @param credit: tín chỉ của khóa học
     * @param department: khoa của khóa học
     * @param
     */
    public Course(String id, String title, int credit, String department) {
        this.id = id;
        this.title = title;
        this.credit = credit;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    /**
     * Description: Đặt ID cho khóa học
     * @param id ID của khóa học
     * @throws IllegalArgumentException nếu id là null, độ dài id nhỏ hơn 3, hoặc id chứa ký tự không phải chữ cái hoặc số
     */
    public void setId(String id) {
        if (id == null || id.length() < 3)
            throw new IllegalArgumentException("ID must have at least 3 characters");
        for (int i = 0; i < id.length(); i++) {
            if (!Character.isLetterOrDigit(id.charAt(i)))
                throw new IllegalArgumentException("ID must contain only letters or digits");
        }
        this.id = id;
    }

    /**
     * Description: Get the title of the course
     * @return The title of the course
     */
    public String getTitle() {
        return title;
    }

    /**
     * Description: Đặt tiêu đề cho khóa học
     * @param title Tiêu đề của khóa học
     * @throws IllegalArgumentException nếu title null, hoặc độ dài rỗng
     */
    public void setTitle(String title) {
        if (title == null || title.isEmpty())
            throw new IllegalArgumentException("Title must not be empty");
        this.title = title;
    }

    public int getCredit() {
        return credit;
    }

    /**
     * Description: Đặt tín chỉ cho khóa học
     * @param credit Tín chỉ của khóa học
     * @throws IllegalArgumentException nếu tín chỉ nhỏ hơn 0
     */
    public void setCredit(int credit) {
        if (credit < 0)
            throw new IllegalArgumentException("Credit must be greater than 0");
        this.credit = credit;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-30s%2d  %-10s", id, title, credit,department);
    }
}
