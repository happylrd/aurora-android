package com.happylrd.aurora.model;

import cn.bmob.v3.BmobObject;

public class Mode extends BmobObject {

    private String modeName;
    private String modeDescription;

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public String getModeDescription() {
        return modeDescription;
    }

    public void setModeDescription(String modeDescription) {
        this.modeDescription = modeDescription;
    }
}
