package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0676Qe implements View.OnClickListener {
    public final /* synthetic */ C7C A00;

    public ViewOnClickListenerC0676Qe(C7C c7c) {
        this.A00 = c7c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SA videoView;
        JA ja;
        C0889Yn c0889Yn;
        SA videoView2;
        SA videoView3;
        SA videoView4;
        JA ja2;
        if (KL.A02(this)) {
        }
        try {
            videoView = this.A00.getVideoView();
            if (videoView != null) {
                ja = this.A00.A02;
                if (ja != null) {
                    ja2 = this.A00.A02;
                    ja2.A04(J9.A0p, null);
                }
                c0889Yn = this.A00.A01;
                c0889Yn.A0E().A35();
                int[] iArr = C0677Qf.A00;
                videoView2 = this.A00.getVideoView();
                switch (iArr[videoView2.getState().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        videoView3 = this.A00.getVideoView();
                        videoView3.A0b(QM.A04, 12);
                        break;
                    case 5:
                        videoView4 = this.A00.getVideoView();
                        videoView4.A0e(true, 8);
                        break;
                }
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
