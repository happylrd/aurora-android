package com.happylrd.aurora.model;

import cn.bmob.v3.BmobObject;

public class State extends BmobObject {

    private Motion motion;

    private Boolean isNormalState;

    private Boolean isToe;
    private Boolean isHeel;
    private Boolean isStomp;
    private Boolean isKickLow;
    private Boolean isKickMid;
    private Boolean isKickHigh;

    public Motion getMotion() {
        return motion;
    }

    public void setMotion(Motion motion) {
        this.motion = motion;
    }

    public Boolean getNormalState() {
        return isNormalState;
    }

    public void setNormalState(Boolean normalState) {
        isNormalState = normalState;
    }

    public Boolean getToe() {
        return isToe;
    }

    public void setToe(Boolean toe) {
        isToe = toe;
    }

    public Boolean getHeel() {
        return isHeel;
    }

    public void setHeel(Boolean heel) {
        isHeel = heel;
    }

    public Boolean getStomp() {
        return isStomp;
    }

    public void setStomp(Boolean stomp) {
        isStomp = stomp;
    }

    public Boolean getKickLow() {
        return isKickLow;
    }

    public void setKickLow(Boolean kickLow) {
        isKickLow = kickLow;
    }

    public Boolean getKickMid() {
        return isKickMid;
    }

    public void setKickMid(Boolean kickMid) {
        isKickMid = kickMid;
    }

    public Boolean getKickHigh() {
        return isKickHigh;
    }

    public void setKickHigh(Boolean kickHigh) {
        isKickHigh = kickHigh;
    }
}
