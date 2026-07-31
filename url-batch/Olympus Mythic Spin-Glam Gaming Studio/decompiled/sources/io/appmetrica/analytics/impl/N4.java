package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class N4 implements InterfaceC5280db, InterfaceC5394hm, InterfaceC5331fb {
    public final Context a;
    public final C5351g5 b;
    public final Rm c;
    public final Mh d;
    public final U4 e;
    public final Bn f;
    public ArrayList g;
    public final C5377h5 h;
    public final C5453k4 i;
    public final C5855zg j;
    public final Object k;

    public N4(@NonNull Context context, @NonNull Yl yl, @NonNull C5351g5 c5351g5, @NonNull G4 g4) {
        this(context, yl, c5351g5, g4, new Mh(g4.b), new C5377h5(), new P4());
    }

    public static void b(G4 g4) {
        Ka.I.c().b(!Boolean.FALSE.equals(g4.b.n));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5280db
    public final void a(@NonNull F4 f4) {
        Mh mh = this.d;
        mh.a = mh.a.mergeFrom(f4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5280db
    public final void c() {
    }

    @NonNull
    public final C5453k4 d() {
        return this.i;
    }

    @NonNull
    public final F4 e() {
        return this.d.a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5280db
    @NonNull
    public final Context getContext() {
        return this.a;
    }

    public N4(Context context, Yl yl, C5351g5 c5351g5, G4 g4, Mh mh, C5377h5 c5377h5, P4 p4) {
        this.g = new ArrayList();
        this.k = new Object();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = c5351g5;
        this.d = mh;
        this.h = c5377h5;
        this.e = P4.a(this);
        b(g4);
        Rm a = yl.a(applicationContext, c5351g5, g4.a);
        this.c = a;
        this.i = AbstractC5479l4.a(a, Ka.k().c());
        this.f = p4.a(this, a);
        C5855zg u = Ka.k().u();
        this.j = u;
        u.a();
        yl.a(c5351g5, this);
    }

    public final synchronized void a(@NonNull L4 l4) {
        this.h.a.add(l4);
        T6.a(l4.c, this.i.a(Wm.a(this.c.e().l)));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5280db
    @NonNull
    public final CounterConfigurationReporterType b() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    public final synchronized void b(@NonNull L4 l4) {
        this.h.a.remove(l4);
    }

    public final void a(@NonNull C5326f6 c5326f6, @NonNull L4 l4) {
        U4 u4 = this.e;
        u4.getClass();
        u4.a(c5326f6, new T4(l4));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5280db
    @NonNull
    public final C5351g5 a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5394hm
    public final void a(@NonNull EnumC5213am enumC5213am, @Nullable C5783wm c5783wm) {
        synchronized (this.k) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    C5694tb c5694tb = (C5694tb) it.next();
                    T6.a(c5694tb.a, enumC5213am, this.i.a(c5694tb.c));
                }
                this.g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5394hm
    public final void a(@NonNull C5783wm c5783wm) {
        synchronized (this.k) {
            try {
                Iterator it = this.h.a.iterator();
                while (it.hasNext()) {
                    L4 l4 = (L4) it.next();
                    T6.a(l4.c, this.i.a(Wm.a(c5783wm.l)));
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.g.iterator();
                while (it2.hasNext()) {
                    C5694tb c5694tb = (C5694tb) it2.next();
                    if (AbstractC5705tm.a(c5783wm, c5694tb.b, c5694tb.c, new C5642rb())) {
                        T6.a(c5694tb.a, this.i.a(c5694tb.c));
                    } else {
                        arrayList.add(c5694tb);
                    }
                }
                this.g = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(@Nullable C5694tb c5694tb) {
        ResultReceiver resultReceiver;
        HashMap hashMap;
        List<String> list;
        HashMap hashMap2 = new HashMap();
        if (c5694tb != null) {
            list = c5694tb.b;
            resultReceiver = c5694tb.a;
            hashMap = c5694tb.c;
        } else {
            resultReceiver = null;
            hashMap = hashMap2;
            list = null;
        }
        boolean a = this.c.a(list, hashMap);
        if (!a) {
            T6.a(resultReceiver, this.i.a(hashMap));
        }
        if (!this.c.g()) {
            if (a) {
                T6.a(resultReceiver, this.i.a(hashMap));
                return;
            }
            return;
        }
        synchronized (this.k) {
            if (a && c5694tb != null) {
                try {
                    this.g.add(c5694tb);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f.c();
    }

    public final void a(@Nullable final ResultReceiver resultReceiver) {
        C5855zg c5855zg = this.j;
        InterfaceC5803xg interfaceC5803xg = new InterfaceC5803xg() { // from class: io.appmetrica.analytics.impl.N4$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC5803xg
            public final void a(Eg eg) {
                Fg.a(resultReceiver, eg.a());
            }
        };
        c5855zg.getClass();
        c5855zg.a.a(new C5313ej(interfaceC5803xg));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5331fb
    public final void a(@NonNull G4 g4) {
        this.c.a(g4.a);
        a(g4.b);
    }
}
