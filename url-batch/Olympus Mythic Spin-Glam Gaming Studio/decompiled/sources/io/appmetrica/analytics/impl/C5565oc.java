package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.oc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5565oc implements InterfaceC5487lc, ToggleObserver {
    public final ArrayList a = new ArrayList();
    public final IHandlerExecutor b = Ka.k().w().c();
    public C5267co c;
    public boolean d;

    public final void a(@Nullable Toggle toggle) {
        C5267co c5267co = new C5267co(toggle);
        this.c = c5267co;
        c5267co.c.registerObserver(this, true);
    }

    public final void b(@NotNull Object obj) {
        C5267co c5267co = this.c;
        if (c5267co == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            c5267co = null;
        }
        c5267co.b.b(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(final boolean z) {
        this.b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.oc$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C5565oc.a(C5565oc.this, z);
            }
        });
    }

    public final void a(@NotNull final LocationControllerObserver locationControllerObserver, final boolean z) {
        this.b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.oc$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C5565oc.a(C5565oc.this, locationControllerObserver, z);
            }
        });
    }

    public static final void a(C5565oc c5565oc, LocationControllerObserver locationControllerObserver, boolean z) {
        c5565oc.a.add(locationControllerObserver);
        if (z) {
            if (c5565oc.d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(C5565oc c5565oc, boolean z) {
        if (c5565oc.d != z) {
            c5565oc.d = z;
            Function1 function1 = z ? C5513mc.a : C5539nc.a;
            Iterator it = c5565oc.a.iterator();
            while (it.hasNext()) {
                function1.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(@NotNull Object obj) {
        C5267co c5267co = this.c;
        if (c5267co == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            c5267co = null;
        }
        c5267co.b.a(obj);
    }

    public final void a(boolean z) {
        C5267co c5267co = this.c;
        if (c5267co == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            c5267co = null;
        }
        c5267co.a.a(z);
    }
}
