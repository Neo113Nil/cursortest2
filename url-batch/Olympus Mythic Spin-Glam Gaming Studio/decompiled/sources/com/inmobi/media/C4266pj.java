package com.inmobi.media;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;

/* renamed from: com.inmobi.media.pj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4266pj {
    public final long a;
    public final InterfaceC4466x9 b;
    public final Function1 c;
    public final CoroutineScope d;
    public long e;
    public boolean f;
    public EnumC4213nj g;
    public boolean h;
    public Job i;

    public C4266pj(long j, InterfaceC4466x9 interfaceC4466x9, Function1 onLoadingCompleted) {
        Intrinsics.checkNotNullParameter(onLoadingCompleted, "onLoadingCompleted");
        this.a = j;
        this.b = interfaceC4466x9;
        this.c = onLoadingCompleted;
        this.d = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()));
        this.g = EnumC4213nj.a;
    }

    public final void a() {
        try {
            Job job = this.i;
            if (job != null) {
                JobKt.ensureActive(job);
            }
            Job job2 = this.i;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, null, 1, null);
            }
        } catch (Exception unused) {
            InterfaceC4466x9 interfaceC4466x9 = this.b;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("SessionTracker", "No pending commit completion job to cancel.");
            }
        }
        this.i = null;
    }

    public final void a(String str, String str2) {
        boolean z = this.f;
        if (z) {
            return;
        }
        long j = this.a;
        if (j <= 0) {
            return;
        }
        if (!z && j > 0) {
            this.f = true;
            this.g = EnumC4213nj.f;
            a();
        }
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("SessionTracker", "onLoadingCompleted sessionId=" + this.e + " reason=" + str + " url=" + str2);
        }
        this.c.invoke(str);
    }
}
