package com.meta.analytics.dsp.uinode;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.5c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01685c {
    public static C0S A00(Context context, InterfaceC02187h interfaceC02187h) {
        return A01(context, interfaceC02187h, null);
    }

    public static C0S A01(Context context, InterfaceC02187h interfaceC02187h, String str) {
        C0888Ym sdkContext = A09(context);
        C0W A77 = interfaceC02187h.A77(sdkContext);
        if (A77 != null) {
            return str != null ? A77.AAJ(str) : A77.AAI();
        }
        return new C1024bb();
    }

    public static C0889Yn A02(Activity activity) {
        return new C0889Yn(activity, (InterfaceC02187h) A0A(), A00(activity, A0A()));
    }

    public static C0889Yn A03(Context context) {
        return new C0889Yn(context, A0A(), new C1024bb());
    }

    public static C0889Yn A04(Context context) {
        if (C0478Ih.A0r(context)) {
            return new C0889Yn(context, A0A(), A00(context, A0A()));
        }
        return A03(context);
    }

    public static C0889Yn A05(Context context, String str) {
        return new C0889Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static C0889Yn A06(Context context, String str) {
        return new C0889Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static C0889Yn A07(Context context, String str) {
        return new C0889Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static EQ A08(Context context) {
        return new EQ(context, A0A(), A0A().A77(A09(context)));
    }

    public static C0888Ym A09(Context context) {
        return new C0888Ym(context, A0A());
    }

    public static synchronized YL A0A() {
        YL A02;
        synchronized (C01685c.class) {
            A02 = YL.A02();
        }
        return A02;
    }
}
