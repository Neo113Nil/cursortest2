package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class w extends t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f787a;
    final /* synthetic */ t b;
    final /* synthetic */ ae c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ae aeVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, t tVar) {
        super(taskCompletionSource);
        this.f787a = taskCompletionSource2;
        this.b = tVar;
        this.c = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        s sVar;
        obj = this.c.g;
        synchronized (obj) {
            ae.o(this.c, this.f787a);
            atomicInteger = this.c.m;
            if (atomicInteger.getAndIncrement() > 0) {
                sVar = this.c.c;
                sVar.d("Already connected to the service.", new Object[0]);
            }
            ae.q(this.c, this.b);
        }
    }
}
