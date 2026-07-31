package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZB implements View.OnClickListener {
    public final /* synthetic */ C2488Nm A00;
    public final /* synthetic */ VI A01;
    public final /* synthetic */ InterfaceC2759Yh A02;
    public final /* synthetic */ ZC A03;
    public final /* synthetic */ String A04;

    public ZB(ZC zc, VI vi, InterfaceC2759Yh interfaceC2759Yh, String str, C2488Nm c2488Nm) {
        this.A03 = zc;
        this.A01 = vi;
        this.A02 = interfaceC2759Yh;
        this.A04 = str;
        this.A00 = c2488Nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2508Og c2508Og;
        C3218gi c3218gi;
        C3218gi c3218gi2;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A04(VH.A0A, null);
            c2508Og = this.A03.A01;
            c3218gi = this.A03.A02;
            if (c2508Og.A0O(c3218gi.A02(), true)) {
                this.A02.AAo(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                X6 x6 = new X6();
                c3218gi2 = this.A03.A02;
                X6.A0O(x6, c3218gi2, XB.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
