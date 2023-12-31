package com.school.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "questions")
public class Question extends BaseEntity{
    private String title;
    private String optionA;
    private String optionB;
    private String optionC;
    private int answer;
    private int choice;

    public Question() {
    }

    public Question(String title, String optionA, String optionB, String optionC, int answer, int choice) {
        this.title = title;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.answer = answer;
        this.choice = choice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }
}
