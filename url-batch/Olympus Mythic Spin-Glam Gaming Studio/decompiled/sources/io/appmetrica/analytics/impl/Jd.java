package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class Jd implements Converter {
    public final Ok a = Ka.k().p();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Jm[] fromModel(@NotNull Map<String, ? extends Object> map) {
        Jm jm;
        Map<String, C5670sd> b = this.a.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            C5670sd c5670sd = b.get(key);
            if (c5670sd == null || value == null) {
                jm = null;
            } else {
                jm = new Jm();
                jm.a = key;
                jm.b = (byte[]) c5670sd.c.fromModel(value);
            }
            if (jm != null) {
                arrayList.add(jm);
            }
        }
        return (Jm[]) arrayList.toArray(new Jm[0]);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(@NotNull Jm[] jmArr) {
        Map<String, C5670sd> b = this.a.b();
        ArrayList arrayList = new ArrayList();
        for (Jm jm : jmArr) {
            C5670sd c5670sd = b.get(jm.a);
            Pair pair = c5670sd != null ? TuplesKt.to(jm.a, c5670sd.c.toModel(jm.b)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }
}
