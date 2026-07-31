package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.t5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5688t5 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final Context c;

    public C5688t5(Context context) {
        this.c = context.getApplicationContext();
    }

    public final InterfaceC5331fb a(C5351g5 c5351g5, G4 g4, InterfaceC5354g8 interfaceC5354g8, HashMap hashMap) {
        InterfaceC5331fb interfaceC5331fb = (InterfaceC5331fb) hashMap.get(c5351g5.toString());
        if (interfaceC5331fb != null) {
            interfaceC5331fb.a(g4);
            return interfaceC5331fb;
        }
        InterfaceC5331fb a = interfaceC5354g8.a(this.c, c5351g5, g4);
        hashMap.put(c5351g5.toString(), a);
        return a;
    }
}
