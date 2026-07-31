package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2907bf implements View.OnClickListener {
    public final /* synthetic */ C2910bi A00;

    public ViewOnClickListenerC2907bf(C2910bi c2910bi) {
        this.A00 = c2910bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2909bh interfaceC2909bh;
        AbstractC2753Yb abstractC2753Yb;
        List list;
        C2255Ek c2255Ek;
        C2255Ek c2255Ek2;
        C2255Ek c2255Ek3;
        AbstractC2753Yb abstractC2753Yb2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC2909bh = this.A00.A05;
            interfaceC2909bh.AEm();
            abstractC2753Yb = this.A00.A00;
            if (abstractC2753Yb != null) {
                abstractC2753Yb2 = this.A00.A00;
                YB.A0L(abstractC2753Yb2);
            }
            list = this.A00.A07;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                YB.A0O((View) it.next(), 0);
            }
            YB.A0J(this.A00);
            c2255Ek = this.A00.A06;
            if (c2255Ek == null) {
                return;
            }
            c2255Ek2 = this.A00.A06;
            YB.A0O(c2255Ek2, 0);
            c2255Ek3 = this.A00.A06;
            c2255Ek3.A0e(EnumC3105et.A02, 14);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
