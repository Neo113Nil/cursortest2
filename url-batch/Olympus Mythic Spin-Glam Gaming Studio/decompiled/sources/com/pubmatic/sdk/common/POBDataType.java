package com.pubmatic.sdk.common;

/* loaded from: classes15.dex */
public interface POBDataType {

    public enum POBAdState {
        DEFAULT,
        LOAD_DEFERRED,
        LOADING,
        RENDERING,
        FAILED,
        READY,
        SHOWING,
        SHOWN,
        AD_SERVER_READY,
        EXPIRED,
        BID_RECEIVED,
        BID_FAILED,
        DESTROYED
    }

    public enum POBVideoAdEventType {
        START,
        FIRST_QUARTILE,
        MID_POINT,
        THIRD_QUARTILE,
        COMPLETE,
        SKIP,
        MUTE,
        UNMUTE,
        CLICK,
        PAUSE,
        RESUME,
        ICON_CLICK
    }
}
