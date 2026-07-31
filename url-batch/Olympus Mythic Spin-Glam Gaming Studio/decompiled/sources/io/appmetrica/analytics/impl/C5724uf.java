package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.uf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5724uf implements ProtobufConverter {
    public final Jf a;

    public C5724uf() {
        this(new Jf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Gf fromModel(@NonNull C5776wf c5776wf) {
        Gf gf = new Gf();
        if (!StringUtils.isNullOrEmpty(c5776wf.a)) {
            gf.a = c5776wf.a;
        }
        gf.b = c5776wf.b.toString();
        gf.c = this.a.fromModel(c5776wf.c).intValue();
        return gf;
    }

    public C5724uf(Jf jf) {
        this.a = jf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5776wf toModel(@NonNull Gf gf) {
        JSONObject jSONObject;
        String str = gf.a;
        String str2 = gf.b;
        if (!StringUtils.isNullOrEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C5776wf(str, jSONObject, this.a.toModel(Integer.valueOf(gf.c)));
        }
        jSONObject = new JSONObject();
        return new C5776wf(str, jSONObject, this.a.toModel(Integer.valueOf(gf.c)));
    }
}
