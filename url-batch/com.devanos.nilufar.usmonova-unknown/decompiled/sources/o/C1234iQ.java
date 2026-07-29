package o;

import android.view.ScrollCaptureTarget;
import android.view.View;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Consumer;

/* renamed from: o.iQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1234iQ {
    public final C2278yH a = AbstractC2219xO.r(Boolean.FALSE);

    public final void a(View view, BQ bq, InterfaceC0189He interfaceC0189He, Consumer<ScrollCaptureTarget> consumer) {
        AbstractC1298jQ[] abstractC1298jQArr = new AbstractC1298jQ[16];
        C2287yQ a = bq.a();
        YD yd = new YD(new C2287yQ[16]);
        List g = a.g(false, false);
        while (true) {
            yd.c(yd.j, g);
            while (yd.l()) {
                C2287yQ c2287yQ = (C2287yQ) yd.n(yd.j - 1);
                ME c = c2287yQ.c();
                LinkedHashMap linkedHashMap = c2287yQ.d.h;
                if (!(c != null ? c.o0() : false) && !linkedHashMap.containsKey(CQ.m) && !linkedHashMap.containsKey(CQ.i)) {
                    ME c2 = c2287yQ.c();
                    if (c2 == null) {
                        AbstractC0868ct.X("Expected semantics node to have a coordinator.");
                        throw null;
                    }
                    C1032fM k = AbstractC1807r8.k(c2);
                    int round = Math.round(k.a);
                    int round2 = Math.round(k.b);
                    int round3 = Math.round(k.c);
                    int round4 = Math.round(k.d);
                    if (round < round3 && round2 < round4) {
                        Object obj = linkedHashMap.get(C1957tQ.e);
                        if (obj == null) {
                            obj = null;
                        }
                        Object obj2 = linkedHashMap.get(CQ.p);
                        if ((obj2 != null ? obj2 : null) != null) {
                            throw new ClassCastException();
                        }
                        g = c2287yQ.g(false, false);
                    }
                }
            }
            final InterfaceC2114vp[] interfaceC2114vpArr = {RP.f97o, RP.p};
            Arrays.sort(abstractC1298jQArr, 0, 0, new Comparator() { // from class: o.wc
                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    for (InterfaceC2114vp interfaceC2114vp : interfaceC2114vpArr) {
                        int l = AbstractC1305jX.l((Comparable) interfaceC2114vp.invoke(obj3), (Comparable) interfaceC2114vp.invoke(obj4));
                        if (l != 0) {
                            return l;
                        }
                    }
                    return 0;
                }
            });
            return;
        }
    }
}
