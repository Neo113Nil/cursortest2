package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.concurrent.Executors;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ḯ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1036 implements InterfaceC1076 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1029 f2624;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1098 f2625;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1075 f2626;

    public C1036(C1029 c1029, InterfaceC1075 interfaceC1075, C1098 c1098) {
        this.f2624 = c1029;
        this.f2626 = interfaceC1075;
        this.f2625 = c1098;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1076
    /* renamed from: ﾒ */
    public final void mo4130() {
        C0951 c0951 = this.f2624.f2613.f2439;
        synchronized (c0951) {
            c0951.f2267.remove(this);
        }
        C1007 c1007 = this.f2624.f2613;
        InterfaceC1075 interfaceC1075 = this.f2626;
        C1098 c1098 = this.f2625;
        if (c1007.f2438) {
            AbstractC0580.m4072(C1007.f2437, StringFog.decrypt("lX2KOLSi8sGyYI44v+zjjuZ7iSu0p/Kzo2OSOKi4t5aud4l9lanjlqlgjBC6ovaGo2DHKrq/t5Ku\nZ5M5tLv5\n", "xhLnXdvMl+E=\n"));
            return;
        }
        C1029 c1029 = new C1029(c1007, interfaceC1075, c1098);
        String str = AbstractC0530.f589;
        try {
            Executors.newSingleThreadExecutor().execute(c1029);
        } catch (Throwable th) {
            AbstractC0577.m4068(AbstractC0530.f589, StringFog.decrypt("CIuQwnq/D1oompfZYfENAiyKm8Nrvx5DPpI=\n", "TfnirQifaiI=\n"), th, false);
        }
    }
}
