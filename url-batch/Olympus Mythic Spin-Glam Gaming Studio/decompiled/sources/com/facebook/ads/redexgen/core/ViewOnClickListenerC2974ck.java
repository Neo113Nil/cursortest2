package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ck, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2974ck implements View.OnClickListener {
    public static String[] A01 = {"UbVTWMkCbiTkCH46K3jgevn4ZrjXJwTz", "QhkEmn79eJKUC441fbjRvFrP8rMFuK10", "M1y17FrLcKCq9CffRIAOFt9KL", "7BuiCs8qfizRNQQacuqpq", "NMEBAQB23JfGHe29j4ICw6", "tA", "w4e9O4TDm2cMnnpInxw7", "enarAElxAt9QJNN7p9xKH4Zm0Hlbhkd5"};
    public final /* synthetic */ C2381Ji A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC2470Mt abstractC2470Mt;
        AbstractC2470Mt abstractC2470Mt2;
        boolean z;
        C2895bT c2895bT;
        boolean z2;
        C2895bT c2895bT2;
        C2935c7 c2935c7;
        AbstractC3383jd abstractC3383jd;
        Handler handler;
        Runnable runnable;
        AbstractC3383jd abstractC3383jd2;
        C2935c7 c2935c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC2470Mt = this.A00.A0W;
            if (abstractC2470Mt == null) {
                return;
            }
            abstractC2470Mt2 = this.A00.A0W;
            Uri A0M = ((AnonymousClass85) abstractC2470Mt2).A0M();
            if (A0M == null) {
                return;
            }
            z = this.A00.A0D;
            if (!z) {
                this.A00.A0E = true;
                this.A00.A0m(A0M.toString());
                c2935c7 = this.A00.A0b;
                if (c2935c7.A0D() != null) {
                    c2935c72 = this.A00.A0b;
                    c2935c72.A0D().ACQ();
                }
                abstractC3383jd = this.A00.A0X;
                if (abstractC3383jd.A0q() >= 0) {
                    handler = this.A00.A0R;
                    runnable = this.A00.A0c;
                    abstractC3383jd2 = this.A00.A0X;
                    handler.postDelayed(runnable, abstractC3383jd2.A0q());
                }
            }
            c2895bT = this.A00.A09;
            if (c2895bT != null) {
                c2895bT2 = this.A00.A09;
                c2895bT2.A0B();
                this.A00.A09 = null;
            }
            C2381Ji c2381Ji = this.A00;
            z2 = this.A00.A0D;
            c2381Ji.A0q(z2 ? false : true);
        } catch (Throwable th) {
            String[] strArr = A01;
            if (strArr[6].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "NGdQEP5eIhe6T0Nr5s0Gdk";
            strArr2[5] = "GP";
            WU.A00(th, this);
        }
    }

    public ViewOnClickListenerC2974ck(C2381Ji c2381Ji) {
        this.A00 = c2381Ji;
    }
}
