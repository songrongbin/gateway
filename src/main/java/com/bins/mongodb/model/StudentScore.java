package com.bins.mongodb.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by songrongbin on 2016/10/25.
 */
public class StudentScore extends IdEntity implements Serializable {
    private static final long serialVersionUID = 8743196073520676022L;

    /**
     * 学生姓名
     */
    private String username;


    /**
     * 学生成绩
     */
    private List<Double> scoreList;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Double> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Double> scoreList) {
        this.scoreList = scoreList;
    }
}
