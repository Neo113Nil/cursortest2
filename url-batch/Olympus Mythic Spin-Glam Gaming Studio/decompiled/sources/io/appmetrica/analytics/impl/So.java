package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class So {
    public final Context a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final Oo c;
    public final Oo d;

    public So(Context context) {
        this.a = context;
        C5823ya c5823ya = new C5823ya(context, "appmetrica_vital.dat", Ka.k().w().e(), 0L, 8, null);
        this.c = new Oo(Ka.k().y(), c5823ya);
        this.d = new Oo(new C5698tf(Ka.k().B().e(context)), c5823ya);
    }

    public final Oo a() {
        return this.c;
    }

    public final Oo b() {
        return this.d;
    }
}
