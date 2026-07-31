package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class Mo implements Lo {
    public final V8 a;

    public Mo() {
        this(new V8());
    }

    @Override // io.appmetrica.analytics.impl.Lo
    @NonNull
    public final byte[] a(@NonNull C5381h9 c5381h9, @NonNull C5804xh c5804xh) {
        if (!((C5532n5) c5804xh.l).B() && !TextUtils.isEmpty(c5381h9.b)) {
            try {
                JSONObject jSONObject = new JSONObject(c5381h9.b);
                jSONObject.remove("preloadInfo");
                c5381h9.b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.a.a(c5381h9, c5804xh);
    }

    public Mo(V8 v8) {
        this.a = v8;
    }
}
