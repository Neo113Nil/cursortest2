package io.appmetrica.analytics.impl;

import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class A2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Em fromModel(@NonNull C5841z2 c5841z2) {
        Cm cm;
        Em em = new Em();
        em.a = new Dm[c5841z2.a.size()];
        for (int i = 0; i < c5841z2.a.size(); i++) {
            Dm dm = new Dm();
            Pair pair = (Pair) c5841z2.a.get(i);
            dm.a = (String) pair.first;
            if (pair.second != null) {
                dm.b = new Cm();
                C5815y2 c5815y2 = (C5815y2) pair.second;
                if (c5815y2 == null) {
                    cm = null;
                } else {
                    Cm cm2 = new Cm();
                    cm2.a = c5815y2.a;
                    cm = cm2;
                }
                dm.b = cm;
            }
            em.a[i] = dm;
        }
        return em;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5841z2 toModel(@NonNull Em em) {
        ArrayList arrayList = new ArrayList();
        for (Dm dm : em.a) {
            String str = dm.a;
            Cm cm = dm.b;
            arrayList.add(new Pair(str, cm == null ? null : new C5815y2(cm.a)));
        }
        return new C5841z2(arrayList);
    }
}
