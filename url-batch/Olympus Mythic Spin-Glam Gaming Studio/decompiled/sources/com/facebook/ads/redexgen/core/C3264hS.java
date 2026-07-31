package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.hS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3264hS implements InterfaceC2759Yh {
    public static String[] A01 = {"8tOzOPKLz5DDIwqC88XBXxH90bmVDotF", "YCktuRbEMhZaz9U821mncTHWO05lwCqY", "Eq7g3criU65KDBPK", "XEHycrxPk7FQv1FkL381pmPNBNbKujpl", "niYnM4G6gzmxtC7fq", "sRQOtQAi", "8G5qrnHnaOtx52JqPPi", "6arHmIfqlBfM2iqNpfy3RxuQJelIt1eI"};
    public final WeakReference<C2580Re> A00;

    public C3264hS(C2580Re c2580Re) {
        this.A00 = new WeakReference<>(c2580Re);
    }

    private void A00(C2580Re c2580Re) {
        C3066eF A07 = c2580Re.A07();
        if (A07 != null && c2580Re.A04() != null) {
            c2580Re.A04().bringChildToFront(A07);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2759Yh
    public void A44(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        C2580Re c2580Re = this.A00.get();
        if (c2580Re != null && c2580Re.A04() != null) {
            c2580Re.A04().addView(view, i, layoutParams);
            A00(c2580Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2759Yh
    public void A45(View view, RelativeLayout.LayoutParams layoutParams) {
        C2580Re c2580Re = this.A00.get();
        if (c2580Re != null && c2580Re.A04() != null) {
            c2580Re.A04().addView(view, layoutParams);
            A00(c2580Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2759Yh
    public void A4j(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2759Yh
    public void A4k(String str, UL ul) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, ul);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2759Yh
    public void AAo(String str, C2488Nm c2488Nm) {
        if (this.A00.get() != null) {
            WeakReference<C2580Re> weakReference = this.A00;
            if (A01[4].length() == 0) {
                throw new RuntimeException();
            }
            A01[2] = "IO1gKUYJJG6YtU6JnI8y";
            weakReference.get().A0D(str, c2488Nm);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2759Yh
    public void ADJ(int i) {
        C2580Re activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i);
        }
    }
}
