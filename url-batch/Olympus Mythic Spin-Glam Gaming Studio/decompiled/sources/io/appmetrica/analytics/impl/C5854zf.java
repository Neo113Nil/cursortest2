package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.zf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5854zf implements ProtobufConverter {
    public final Lf a;
    public final C5724uf b;

    public C5854zf() {
        this(new Lf(), new C5724uf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Hf fromModel(@NonNull C5802xf c5802xf) {
        Hf hf = new Hf();
        hf.a = this.a.fromModel(c5802xf.a);
        hf.b = new Gf[c5802xf.b.size()];
        Iterator<C5776wf> it = c5802xf.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            hf.b[i] = this.b.fromModel(it.next());
            i++;
        }
        return hf;
    }

    public C5854zf(Lf lf, C5724uf c5724uf) {
        this.a = lf;
        this.b = c5724uf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5802xf toModel(@NonNull Hf hf) {
        Kf model;
        ArrayList arrayList = new ArrayList(hf.b.length);
        for (Gf gf : hf.b) {
            arrayList.add(this.b.toModel(gf));
        }
        Ff ff = hf.a;
        if (ff == null) {
            model = this.a.toModel(new Ff());
        } else {
            model = this.a.toModel(ff);
        }
        return new C5802xf(model, arrayList);
    }
}
