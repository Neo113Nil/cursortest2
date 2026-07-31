package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class aa extends t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ IBinder f767a;
    final /* synthetic */ ad b;

    aa(ad adVar, IBinder iBinder) {
        this.f767a = iBinder;
        this.b = adVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        z zVar;
        List list;
        List list2;
        zVar = this.b.f769a.j;
        this.b.f769a.o = (IInterface) zVar.a(this.f767a);
        ae.r(this.b.f769a);
        this.b.f769a.h = false;
        list = this.b.f769a.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.b.f769a.e;
        list2.clear();
    }
}
