package com.happylrd.aurora.model;

import cn.bmob.v3.BmobObject;

public class Mode extends BmobObject {

    private String modeName;

    private MyUser author;  // author and mode are one to many

    private State normalState;
    private State gestureState;

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public MyUser getAuthor() {
        return author;
    }

    public void setAuthor(MyUser author) {
        this.author = author;
    }

    public State getNormalState() {
        return normalState;
    }

    public void setNormalState(State normalState) {
        this.normalState = normalState;
    }

    public State getGestureState() {
        return gestureState;
    }

    public void setGestureState(State gestureState) {
        this.gestureState = gestureState;
    }
}
