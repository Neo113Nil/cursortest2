package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes10.dex */
public final class Gb {
    public final C5659s2 a = new C5659s2();
    public final A6 b = new A6();
    public Rn c;
    public boolean d;
    public boolean e;

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC5564ob interfaceC5564ob) {
        if (this.e) {
            return;
        }
        CollectionsKt.addAll(this.b.a, new InterfaceC5305eb[]{this.a.a(context, appMetricaConfig, interfaceC5564ob)});
        this.e = true;
    }

    public final synchronized void b() {
        if (this.d) {
            return;
        }
        A6 a6 = this.b;
        ArrayList arrayList = C5661s4.l().i.a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        a6.a.addAll(arrayList2);
        this.d = true;
    }

    public final synchronized void c() {
        try {
            if (this.c != null) {
                return;
            }
            C5219b2 c5219b2 = new C5219b2(this.b);
            this.c = new Rn(c5219b2);
            Qn qn = new Qn();
            qn.a.add(c5219b2);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                qn.a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(qn);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        this.b.a.clear();
        this.d = false;
        this.e = false;
    }
}
