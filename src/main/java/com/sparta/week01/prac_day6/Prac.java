package com.sparta.week01.prac_day6;

public class Prac {

    public static void main(String[] args) {

        String title = "웹개발의 봄, Spring";
        String tutor = "남병관";
        int days = 30;

        Course course = new Course(title, tutor, days);

        course.setTitle(title);
        course.setTutor(tutor);
        course.setDays(days);

        System.out.println(course.getTitle());
        System.out.println(course.getTutor());

//        Course course2 = new Course();
//        course2.title = "프론트엔드의 꽃, React";
//        course2.tutor = "임민영";
//
//        System.out.println(course2.title);
//        System.out.println(course2.tutor);


    }
}