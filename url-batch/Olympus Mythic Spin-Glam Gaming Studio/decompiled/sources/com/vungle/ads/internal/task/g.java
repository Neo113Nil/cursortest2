package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.os.Process;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class g extends j {
    public static final String e = "g";
    public final f a;
    public final e b;
    public final h c;
    public final n d;

    public g(f jobinfo, e creator, h jobRunner, n nVar) {
        Intrinsics.checkNotNullParameter(jobinfo, "jobinfo");
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        this.a = jobinfo;
        this.b = creator;
        this.c = jobRunner;
        this.d = nVar;
    }

    @Override // com.vungle.ads.internal.task.j
    public final int a() {
        return this.a.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.d;
        if (nVar != null) {
            try {
                int a = ((i) nVar).a(this.a);
                Process.setThreadPriority(a);
                boolean z = u.a;
                String TAG = e;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                t.a(TAG, "Setting process thread prio = " + a + " for " + this.a.d());
            } catch (Throwable unused) {
                boolean z2 = u.a;
                String TAG2 = e;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                t.b(TAG2, "Error on setting process thread priority");
            }
        }
        try {
            String d = this.a.d();
            Bundle c = this.a.c();
            boolean z3 = u.a;
            String TAG3 = e;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            t.a(TAG3, "Start job " + d + "Thread " + Thread.currentThread().getName());
            int a2 = ((p) this.b).a(d).a(c, this.c);
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            t.a(TAG3, "On job finished " + d + " with result " + a2);
            if (a2 == 2) {
                this.a.getClass();
            }
        } catch (Exception e2) {
            boolean z4 = u.a;
            String TAG4 = e;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            t.b(TAG4, "Cannot create job" + e2.getLocalizedMessage());
        }
    }
}
