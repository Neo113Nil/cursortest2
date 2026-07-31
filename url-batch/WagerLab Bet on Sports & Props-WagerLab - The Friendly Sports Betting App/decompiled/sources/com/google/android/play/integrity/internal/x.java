package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class x extends t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f788a;

    x(ae aeVar) {
        this.f788a = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        s sVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        s sVar2;
        obj = this.f788a.g;
        synchronized (obj) {
            atomicInteger = this.f788a.m;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.f788a.m;
                if (atomicInteger2.decrementAndGet() > 0) {
                    sVar2 = this.f788a.c;
                    sVar2.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            ae aeVar = this.f788a;
            iInterface = aeVar.o;
            if (iInterface != null) {
                sVar = aeVar.c;
                sVar.d("Unbind from service.", new Object[0]);
                ae aeVar2 = this.f788a;
                context = aeVar2.b;
                serviceConnection = aeVar2.n;
                context.unbindService(serviceConnection);
                this.f788a.h = false;
                this.f788a.o = null;
                this.f788a.n = null;
            }
            this.f788a.x();
        }
    }
}
