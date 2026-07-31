package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2795Zr implements View.OnClickListener {
    public final /* synthetic */ C2512Ok A00;
    public final /* synthetic */ C2785Zh A01;
    public final /* synthetic */ MD A02;

    public ViewOnClickListenerC2795Zr(MD md, C2785Zh c2785Zh, C2512Ok c2512Ok) {
        this.A02 = md;
        this.A01 = c2785Zh;
        this.A00 = c2512Ok;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0D.AF4(this.A00);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
