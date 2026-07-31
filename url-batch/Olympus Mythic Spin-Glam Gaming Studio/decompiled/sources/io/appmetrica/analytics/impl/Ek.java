package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class Ek extends AbstractC5307ed {
    public final Oo a;

    public Ek() {
        this(Ka.k().D().b());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5307ed
    public final void a(int i) {
        Oo oo = this.a;
        synchronized (oo) {
            JSONObject a = oo.a.a();
            if (a.optInt("last_migration_api_level", -1) != i) {
                oo.a.a(a.put("last_migration_api_level", i));
            }
            Qo qo = oo.a;
            Qo.a(qo.a);
            Qo.a(qo.b);
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5307ed
    public final int b() {
        int optInt;
        Oo oo = this.a;
        synchronized (oo) {
            optInt = oo.a.a().optInt("last_migration_api_level", -1);
        }
        return optInt;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5307ed
    public final SparseArray<InterfaceC5282dd> c() {
        SparseArray<InterfaceC5282dd> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new Fk(this.a));
        sparseArray.put(115, new Gk());
        sparseArray.put(116, new Jk());
        return sparseArray;
    }

    public Ek(Oo oo) {
        this.a = oo;
    }
}
