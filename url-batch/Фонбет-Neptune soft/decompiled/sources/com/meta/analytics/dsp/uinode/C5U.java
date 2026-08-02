package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.5U, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C5U implements View.OnLongClickListener {
    public final /* synthetic */ C5V A00;

    public C5U(C5V c5v) {
        this.A00 = c5v;
    }

    public /* synthetic */ C5U(C5V c5v, C5R c5r) {
        this(c5v);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C0600Ng c0600Ng;
        RelativeLayout relativeLayout;
        C0600Ng c0600Ng2;
        RelativeLayout relativeLayout2;
        RelativeLayout relativeLayout3;
        C0600Ng c0600Ng3;
        C0600Ng c0600Ng4;
        c0600Ng = this.A00.A0A;
        if (c0600Ng != null) {
            relativeLayout = this.A00.A06;
            if (relativeLayout != null) {
                c0600Ng2 = this.A00.A0A;
                relativeLayout2 = this.A00.A06;
                int width = relativeLayout2.getWidth();
                relativeLayout3 = this.A00.A06;
                c0600Ng2.setBounds(0, 0, width, relativeLayout3.getHeight());
                c0600Ng3 = this.A00.A0A;
                c0600Ng4 = this.A00.A0A;
                c0600Ng3.A0D(!c0600Ng4.A0E());
            }
        }
        return true;
    }
}
