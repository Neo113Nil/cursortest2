package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Yq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2768Yq implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public ViewOnClickListenerC2768Yq(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2752Ya interfaceC2752Ya;
        ZK zk;
        InterfaceC2752Ya interfaceC2752Ya2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC2752Ya = this.A00.A02;
            if (interfaceC2752Ya != null) {
                zk = this.A00.A09;
                if (zk.A06()) {
                    interfaceC2752Ya2 = this.A00.A02;
                    interfaceC2752Ya2.ACl(this.A00);
                }
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
