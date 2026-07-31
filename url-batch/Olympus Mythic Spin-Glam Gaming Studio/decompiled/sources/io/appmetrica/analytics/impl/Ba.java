package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class Ba {
    public static final Ba d = new Ba();
    public final Md a = new Md();
    public final ServiceComponentsInitializer b = AbstractC5677sk.a();
    public boolean c = false;

    public final void a(Context context) {
        C5748vd c5748vd;
        Ka.a(context);
        this.b.onCreate(context);
        this.a.getClass();
        List<String> a = Ka.I.s.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a, 10));
        for (String str : a) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c5748vd = new C5748vd(str, false);
            } else {
                Ka.I.p().a((ModuleServiceEntryPoint<Object>) loadAndInstantiateClassWithDefaultConstructor);
                c5748vd = new C5748vd(str, true);
            }
            arrayList.add(c5748vd);
        }
        new Ek(Ka.I.D().d).a(context);
        Oo oo = Ka.I.D().c;
        synchronized (oo) {
            oo.a.a();
        }
        Ka.I.q().a();
        new C5774wd(Ka.I.d.b(), Ka.I.y(), "service_modules", new SystemTimeProvider()).a(arrayList);
    }

    public final void b(Context context) {
        if (this.c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.c) {
                    a(context);
                    this.c = true;
                }
            } finally {
            }
        }
    }
}
