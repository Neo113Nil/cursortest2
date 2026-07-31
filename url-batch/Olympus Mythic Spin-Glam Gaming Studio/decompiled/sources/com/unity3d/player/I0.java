package com.unity3d.player;

/* loaded from: classes4.dex */
final class I0 implements Runnable {
    I0() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC5133c.a();
        } catch (Exception e) {
            AbstractC5179z.Log(6, "Exception when hiding Activity Indicator " + e);
        }
    }
}
