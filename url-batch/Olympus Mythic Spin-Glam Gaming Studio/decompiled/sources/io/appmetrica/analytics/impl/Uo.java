package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class Uo implements InterfaceC5647rg {
    public final Oo a;
    public final String b = "vital";

    public Uo(@NotNull Oo oo) {
        this.a = oo;
    }

    @NotNull
    public final String a() {
        return this.b;
    }

    @Nullable
    public final Eg b() {
        C5751vg b = this.a.b();
        if (b != null) {
            return new Dg(b);
        }
        return null;
    }

    public final boolean c() {
        boolean optBoolean;
        Oo oo = this.a;
        synchronized (oo) {
            optBoolean = oo.a.a().optBoolean("referrer_checked", false);
        }
        return optBoolean;
    }

    public final void a(@NotNull Eg eg) {
        this.a.a(eg.a());
        Oo oo = this.a;
        synchronized (oo) {
            JSONObject a = oo.a.a();
            if (!a.optBoolean("referrer_checked", false)) {
                oo.a.a(a.put("referrer_checked", true));
            }
            Qo qo = oo.a;
            Qo.a(qo.a);
            Qo.a(qo.b);
        }
    }
}
