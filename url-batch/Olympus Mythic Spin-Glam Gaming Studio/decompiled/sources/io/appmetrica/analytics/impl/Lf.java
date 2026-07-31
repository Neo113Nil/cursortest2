package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class Lf implements ProtobufConverter {
    public final Jf a = new Jf();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ff fromModel(@NonNull Kf kf) {
        Ff ff = new Ff();
        if (!StringUtils.isNullOrEmpty(kf.a)) {
            ff.a = kf.a;
        }
        ff.b = kf.b.toString();
        ff.c = kf.c;
        ff.d = kf.d;
        ff.e = this.a.fromModel(kf.e).intValue();
        return ff;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Kf toModel(@NonNull Ff ff) {
        JSONObject jSONObject;
        String str = ff.a;
        String str2 = ff.b;
        if (!StringUtils.isNullOrEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new Kf(str, jSONObject, ff.c, ff.d, this.a.toModel(Integer.valueOf(ff.e)));
        }
        jSONObject = new JSONObject();
        return new Kf(str, jSONObject, ff.c, ff.d, this.a.toModel(Integer.valueOf(ff.e)));
    }
}
