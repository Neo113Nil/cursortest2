package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class s implements h {
    public static final Handler g = new Handler(Looper.getMainLooper());
    public static final String h = s.class.getSimpleName();
    public final e a;
    public final Executor b;
    public final n c;
    public final CopyOnWriteArrayList d;
    public final r e;
    public long f;

    public s(e creator, com.vungle.ads.internal.executor.j executor, i iVar) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.a = creator;
        this.b = executor;
        this.c = iVar;
        this.f = Long.MAX_VALUE;
        this.d = new CopyOnWriteArrayList();
        this.e = new r(new WeakReference(this));
    }

    public final synchronized void a(f jobInfo) {
        try {
            Intrinsics.checkNotNullParameter(jobInfo, "jobInfo");
            f a = jobInfo.a();
            if (a != null) {
                String d = a.d();
                long b = a.b();
                a.g();
                if (a.f()) {
                    Iterator it = this.d.iterator();
                    while (it.hasNext()) {
                        q qVar = (q) it.next();
                        f a2 = qVar.a();
                        if (Intrinsics.areEqual(a2 != null ? a2.d() : null, d)) {
                            boolean z = u.a;
                            String TAG = h;
                            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                            t.a(TAG, "replacing pending job with new " + d);
                            this.d.remove(qVar);
                        }
                    }
                }
                this.d.add(new q(SystemClock.uptimeMillis() + b, a));
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator it = this.d.iterator();
            long j = Long.MAX_VALUE;
            while (it.hasNext()) {
                q qVar = (q) it.next();
                long j2 = qVar.a;
                if (uptimeMillis >= j2) {
                    this.d.remove(qVar);
                    f fVar = qVar.b;
                    if (fVar != null) {
                        this.b.execute(new g(fVar, this.a, this, this.c));
                    }
                } else {
                    j = Math.min(j, j2);
                }
            }
            if (j != Long.MAX_VALUE && j != this.f) {
                Handler handler = g;
                handler.removeCallbacks(this.e);
                handler.postAtTime(this.e, h, j);
            }
            this.f = j;
        } catch (Throwable th) {
            throw th;
        }
    }
}
