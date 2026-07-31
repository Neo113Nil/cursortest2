package com.smaato.sdk.ng.utils;

/* loaded from: classes11.dex */
public class ClickThroughTimerManager {

    public interface ClickThroughTimerListener {
        void onClickThroughTriggered();
    }

    public static int getClickThroughTimer(Integer num) {
        if (num == null) {
            return 10000;
        }
        if (num.intValue() > 35) {
            return 35000;
        }
        if (num.intValue() < 5) {
            return 5000;
        }
        return num.intValue() * 1000;
    }
}
