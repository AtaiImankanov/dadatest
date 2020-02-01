package com.company;

public class Me {
    private Integer age ;
    private String education;
    public void eat(String food) throws Exception {
        if(food.equals("Med")){
            throw new Exception("");
        }
        System.out.println("im eating "+food);
    }
    public void go(String place){
        System.out.println("im going to "+place);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
