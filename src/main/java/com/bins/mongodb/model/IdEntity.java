package com.bins.mongodb.model;

import java.io.Serializable;

/**
 * Created by songrongbin on 2016/10/25.
 */
public class IdEntity implements Serializable {
    private static final long serialVersionUID = 33633625616087044L;
    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
