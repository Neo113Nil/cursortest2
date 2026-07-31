package com.smaato.sdk.ng.vpaid;

/* loaded from: classes6.dex */
public class NextGenActivityInteractor {
    private static NextGenActivityInteractor a;
    private static boolean b;

    private NextGenActivityInteractor() {
        b = true;
    }

    public static NextGenActivityInteractor getInstance() {
        if (a == null) {
            a = new NextGenActivityInteractor();
        }
        return a;
    }

    public void activityCreated() {
        b = true;
    }

    public void activityDestroyed() {
        b = false;
        a = null;
    }

    public void activityPaused() {
        b = false;
    }

    public void activityResumed() {
        b = true;
    }

    public boolean isActivityVisible() {
        return b;
    }
}
