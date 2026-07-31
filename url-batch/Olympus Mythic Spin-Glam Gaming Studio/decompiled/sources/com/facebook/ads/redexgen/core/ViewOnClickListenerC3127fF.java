package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.fF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC3127fF implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass34 A00;

    public ViewOnClickListenerC3127fF(AnonymousClass34 anonymousClass34) {
        this.A00 = anonymousClass34;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2255Ek videoView;
        VI vi;
        C3218gi c3218gi;
        C2255Ek videoView2;
        C2255Ek videoView3;
        C2255Ek videoView4;
        VI vi2;
        if (WU.A02(this)) {
        }
        try {
            videoView = this.A00.getVideoView();
            if (videoView != null) {
                vi = this.A00.A02;
                if (vi != null) {
                    vi2 = this.A00.A02;
                    vi2.A04(VH.A0x, null);
                }
                c3218gi = this.A00.A01;
                c3218gi.A0F().A3g();
                int[] iArr = C3128fG.A00;
                videoView2 = this.A00.getVideoView();
                switch (iArr[videoView2.getState().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        videoView3 = this.A00.getVideoView();
                        videoView3.A0e(EnumC3105et.A04, 12);
                        break;
                    case 5:
                        videoView4 = this.A00.getVideoView();
                        videoView4.A0i(true, 8);
                        break;
                }
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
