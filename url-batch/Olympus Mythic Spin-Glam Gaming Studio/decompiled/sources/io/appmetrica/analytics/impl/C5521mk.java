package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.mk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5521mk extends AbstractC5208ah {
    public C5521mk(@NotNull C5532n5 c5532n5) {
        super(c5532n5);
    }

    public static final void b(C5521mk c5521mk) {
        Po po = c5521mk.a.t;
        synchronized (po) {
            JSONObject a = po.a.a();
            if (!a.optBoolean("referrer_handled", false)) {
                po.a.a(a.put("referrer_handled", true));
            }
            Qo qo = po.a;
            Qo.a(qo.a);
            Qo.a(qo.b);
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NotNull C5326f6 c5326f6) {
        if (b()) {
            return false;
        }
        C5855zg u = Ka.I.u();
        C5495lk c5495lk = new C5495lk(this);
        u.getClass();
        u.a.a(new C5313ej(c5495lk));
        return false;
    }

    public final boolean b() {
        boolean optBoolean;
        Po po = this.a.t;
        synchronized (po) {
            optBoolean = po.a.a().optBoolean("referrer_handled", false);
        }
        return optBoolean;
    }
}
