package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.mj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5520mj extends AbstractC5208ah {
    public final Nf b;

    public C5520mj(@NonNull C5532n5 c5532n5) {
        this(c5532n5, Ka.k().t());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NonNull C5326f6 c5326f6) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(c5326f6.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObject = null;
        }
        this.b.b(Kf.a(jSONObject));
        return false;
    }

    public C5520mj(C5532n5 c5532n5, Nf nf) {
        super(c5532n5);
        this.b = nf;
    }
}
