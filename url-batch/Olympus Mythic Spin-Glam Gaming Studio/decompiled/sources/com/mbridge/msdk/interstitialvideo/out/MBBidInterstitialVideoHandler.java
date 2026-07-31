package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.reward.controller.a;

@Deprecated
/* loaded from: classes15.dex */
public class MBBidInterstitialVideoHandler {
    private a a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private InterstitialVideoListener h;
    private int i = 2;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private int n;
    private int o;
    private int p;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.n().d() == null && context != null) {
            c.n().b(context);
        }
        a(str, str2);
    }

    private void a(String str, String str2) {
        String e = v0.e(str2);
        if (!TextUtils.isEmpty(e)) {
            v0.d(str2, e);
        }
        this.b = str2;
        this.c = str;
        a();
    }

    private void b(String str, String str2) {
        try {
            if (this.a == null) {
                a aVar = new a();
                this.a = aVar;
                aVar.d(true);
                this.a.e(true);
                this.a.c(str, str2);
            }
        } catch (Throwable th) {
            q0.b("MBBidRewardVideoHandler", th.getMessage(), th);
        }
    }

    public void clearVideoCache() {
        try {
            a aVar = this.a;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.a;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        a aVar = this.a;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isBidReady() {
        a();
        a aVar = this.a;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFormSelfFilling() {
        a();
        if (this.a != null) {
            this.a.a(false, d.b().a(1, 287, this.b, true, 1));
        }
    }

    public void loadFromBid(String str) {
        a();
        if (this.a != null) {
            this.a.a(true, str, d.b().a(1, 287, this.b, true, 2));
        }
    }

    public void playVideoMute(int i) {
        this.i = i;
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.k = true;
        this.l = true;
        MBridgeGlobalCommon.setAlertDialogText(this.b, str, str2, str3, str4);
    }

    public void setIVRewardEnable(int i, int i2) {
        this.n = i;
        this.o = i2;
        this.p = com.mbridge.msdk.foundation.same.a.K;
        this.m = true;
        b();
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.h = interstitialVideoListener;
        this.j = true;
        a aVar = this.a;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.a.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener, this.b, true));
        this.j = false;
    }

    @Deprecated
    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.h = interstitialVideoListener;
        this.j = true;
        a aVar = this.a;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.a.a(new com.mbridge.msdk.interstitialvideo.listener.a(interstitialVideoListener, this.b, true));
        this.j = false;
    }

    public void showFromBid() {
        a();
        if (this.a != null) {
            this.a.a((String) null, (String) null, (String) null, d.b().a(1, 287, this.b, false, -1));
        }
    }

    public void setIVRewardEnable(int i, double d) {
        this.n = i;
        this.o = (int) (d * 100.0d);
        this.p = com.mbridge.msdk.foundation.same.a.J;
        this.m = true;
        b();
    }

    private void a() {
        a aVar;
        if (this.a == null) {
            b(this.c, this.b);
        }
        if (this.j) {
            a aVar2 = this.a;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.interstitialvideo.listener.a(this.h, this.b, true));
            }
            this.j = false;
        }
        if (this.k) {
            a aVar3 = this.a;
            if (aVar3 != null) {
                aVar3.a(this.d, this.e, this.f, this.g);
            }
            this.k = false;
        }
        if (!this.m || (aVar = this.a) == null) {
            return;
        }
        aVar.a(this.n, this.p, this.o);
        this.m = false;
    }

    private void b() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(this.n, this.p, this.o);
        }
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        a(str, str2);
    }
}
