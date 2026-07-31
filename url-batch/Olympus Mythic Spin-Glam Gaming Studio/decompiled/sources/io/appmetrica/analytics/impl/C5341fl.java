package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5341fl {
    public final String a;
    public final C5212al b;
    public final C5315el c;
    public final IBinaryDataHelper d;

    public C5341fl(Context context, C5351g5 c5351g5) {
        c5351g5.a();
        this.a = "session_extras";
        this.b = new C5212al();
        this.c = new C5315el();
        this.d = Ka.k().B().a(context, c5351g5);
    }

    public final Map a() {
        try {
            byte[] bArr = this.d.get(this.a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.b.toModel(this.c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        C5212al c5212al = this.b;
        this.c.getClass();
        return c5212al.toModel(new C5264cl());
    }
}
