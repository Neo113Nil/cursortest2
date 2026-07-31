package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class C2 {
    public final C5621qf a;
    public final long b;
    public final long c;
    public final SystemTimeProvider d;
    public final Map e;

    public C2(C5351g5 c5351g5, C5621qf c5621qf) {
        this.a = c5621qf;
        c5351g5.b();
        this.b = TimeUnit.MINUTES.toMillis(1L);
        this.c = TimeUnit.DAYS.toMillis(7L);
        this.d = new SystemTimeProvider();
        Map<String, Long> f = c5621qf.f();
        a(f);
        this.e = f;
    }

    public final void a(Map map) {
        long currentTimeMillis = this.d.currentTimeMillis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (((Number) entry.getValue()).longValue() < currentTimeMillis - this.c) {
                linkedHashSet.add(str);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
