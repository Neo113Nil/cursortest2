package com.mbridge.msdk.timer;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;

/* compiled from: TimerController.java */
/* loaded from: classes12.dex */
public class b {

    /* compiled from: TimerController.java */
    /* renamed from: com.mbridge.msdk.timer.b$b, reason: collision with other inner class name */
    static class C1481b {
        static b a = new b();
    }

    public static b getInstance() {
        return C1481b.a;
    }

    public void addInterstitialList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().a(str, str2);
        } catch (Exception e) {
            q0.b("TimerController", "addInterstitialList error:" + e.getMessage());
        }
    }

    public void addRewardList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().b(str, str2);
        } catch (Exception e) {
            q0.b("TimerController", "addRewardList error:" + e.getMessage());
        }
    }

    public void start() {
        g f = i.b().f(c.n().b());
        if (f == null) {
            f = i.b().a();
        }
        if (f.h() > 0) {
            com.mbridge.msdk.timer.a.a().b(r0 * 1000);
        }
    }

    private b() {
    }
}
