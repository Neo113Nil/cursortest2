package com.meta.analytics.dsp.uinode;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class PC {
    public static final Map<String, WeakReference<PB>> A00 = new HashMap();

    public static int A00() {
        return A00.size();
    }

    public static PB A01(C0889Yn c0889Yn, AbstractC0992b5 abstractC0992b5, int i, P9 p9) {
        PB pb = new PB(c0889Yn, abstractC0992b5, c0889Yn.A01().A09(), i);
        pb.A0b(p9);
        pb.A0X();
        A00.put(abstractC0992b5.A0S(), new WeakReference<>(pb));
        return pb;
    }

    public static PB A02(String str) {
        WeakReference<PB> weakReference = A00.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC0992b5 abstractC0992b5, PB pb) {
        A00.put(abstractC0992b5.A0S(), new WeakReference<>(pb));
    }

    public static void A04(String str) {
        A00.remove(str);
    }
}
