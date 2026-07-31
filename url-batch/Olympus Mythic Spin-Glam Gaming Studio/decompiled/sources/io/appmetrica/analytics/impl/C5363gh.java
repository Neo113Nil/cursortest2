package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.gh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5363gh extends AbstractC5208ah {
    public final Po b;

    public C5363gh(@NonNull C5532n5 c5532n5) {
        this(c5532n5, c5532n5.u());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NonNull C5326f6 c5326f6) {
        C5532n5 c5532n5 = this.a;
        if (!this.b.c()) {
            if (!this.b.d()) {
                E9 e9 = c5532n5.n;
                e9.c.b(C5326f6.a(c5326f6, EnumC5798xb.EVENT_TYPE_FIRST_ACTIVATION));
            }
            Po po = this.b;
            synchronized (po) {
                JSONObject a = po.a.a();
                if (!a.optBoolean("first_event_done", false)) {
                    po.a.a(a.put("first_event_done", true));
                }
                Qo qo = po.a;
                Qo.a(qo.a);
                Qo.a(qo.b);
            }
        }
        return false;
    }

    public C5363gh(C5532n5 c5532n5, Po po) {
        super(c5532n5);
        this.b = po;
    }
}
