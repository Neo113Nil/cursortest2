package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2791Zn implements View.OnClickListener {
    public final /* synthetic */ C2785Zh A00;
    public final /* synthetic */ MD A01;

    public ViewOnClickListenerC2791Zn(MD md, C2785Zh c2785Zh) {
        this.A01 = md;
        this.A00 = c2785Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AEr(EnumC2510Oi.A04);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
