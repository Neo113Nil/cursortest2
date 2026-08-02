package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class M8 implements View.OnClickListener {
    public final /* synthetic */ C00641a A00;
    public final /* synthetic */ JA A01;
    public final /* synthetic */ M9 A02;
    public final /* synthetic */ MC A03;
    public final /* synthetic */ String A04;

    public M8(M9 m9, JA ja, MC mc, String str, C00641a c00641a) {
        this.A02 = m9;
        this.A01 = ja;
        this.A03 = mc;
        this.A04 = str;
        this.A00 = c00641a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2S c2s;
        C0889Yn c0889Yn;
        C0889Yn c0889Yn2;
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A04(J9.A0A, null);
            c2s = this.A02.A02;
            c0889Yn = this.A02.A03;
            if (c2s.A0O(c0889Yn.A01(), true)) {
                this.A03.A9M(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                C0537Kv c0537Kv = new C0537Kv();
                c0889Yn2 = this.A02.A03;
                C0537Kv.A0M(c0537Kv, c0889Yn2, AbstractC0540Ky.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
