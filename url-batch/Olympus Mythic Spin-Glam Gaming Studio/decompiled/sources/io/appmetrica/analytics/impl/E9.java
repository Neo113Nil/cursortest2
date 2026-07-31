package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class E9 {
    public final C5621qf a;
    public final Po b;
    public final C5470kl c;
    public final C5250c7 d;
    public final C5226b9 e;
    public final C5238bl f;
    public final C5475l0 g;
    public final C5584p5 h;
    public final TimeProvider i;
    public final int j;
    public long k;
    public int l;

    public E9(C5621qf c5621qf, Po po, C5470kl c5470kl, C5250c7 c5250c7, C5475l0 c5475l0, C5226b9 c5226b9, C5238bl c5238bl, int i, C5584p5 c5584p5, SystemTimeProvider systemTimeProvider) {
        this.a = c5621qf;
        this.b = po;
        this.c = c5470kl;
        this.d = c5250c7;
        this.g = c5475l0;
        this.e = c5226b9;
        this.f = c5238bl;
        this.j = i;
        this.i = systemTimeProvider;
        this.h = c5584p5;
        this.k = c5621qf.i();
        this.l = c5621qf.h();
    }

    public final void a(C5326f6 c5326f6, C5548nl c5548nl) {
        Map map = c5326f6.p;
        C5238bl c5238bl = this.f;
        c5238bl.getClass();
        map.putAll(new HashMap(c5238bl.b));
        c5326f6.c(this.a.j());
        c5326f6.o = Integer.valueOf(this.b.b());
        C5449k0 a = this.g.a();
        C5226b9 c5226b9 = this.e;
        c5226b9.getClass();
        InterfaceC5200a9 interfaceC5200a9 = (InterfaceC5200a9) c5226b9.b.a(EnumC5798xb.a(c5326f6.d));
        C5250c7 c5250c7 = this.d;
        S8 a2 = interfaceC5200a9.a(c5326f6);
        int i = c5326f6.d;
        Po po = this.b;
        C5820y7 c5820y7 = new C5820y7(c5250c7.d, c5548nl, i, po, a2, (C5804xh) c5250c7.e.k.a(), a);
        Long valueOf = Long.valueOf(c5548nl.a);
        EnumC5600pl enumC5600pl = c5548nl.d;
        Long valueOf2 = Long.valueOf(c5548nl.b);
        EnumC5798xb a3 = EnumC5798xb.a(c5820y7.h.d);
        long j = 0;
        if (!Q9.g.contains(EnumC5798xb.a(i))) {
            synchronized (po) {
                JSONObject a4 = po.a.a();
                j = a4.optLong("global_number", 0L);
                po.a.a(a4.put("global_number", 1 + j));
            }
        }
        ContentValues fromModel = c5250c7.i.fromModel(new C5742v7(valueOf, enumC5600pl, valueOf2, a3, Long.valueOf(j), Long.valueOf(c5548nl.c), c5820y7.a()));
        Integer asInteger = fromModel.getAsInteger("type");
        asInteger.intValue();
        c5250c7.j.b.submit(fromModel, AbstractC5707to.a.contains(asInteger));
        this.h.a.h();
    }
}
