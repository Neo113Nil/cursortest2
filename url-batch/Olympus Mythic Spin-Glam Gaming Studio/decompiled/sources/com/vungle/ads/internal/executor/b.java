package com.vungle.ads.internal.executor;

import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class b implements Future {
    public static final String b = "b";
    public final Future a;

    public b(Future future) {
        this.a = future;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Future future = this.a;
        if (future != null) {
            return future.cancel(z);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            Future future = this.a;
            if (future != null) {
                return future.get();
            }
            return null;
        } catch (InterruptedException unused) {
            boolean z = u.a;
            String TAG = b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            t.c(TAG, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            boolean z2 = u.a;
            String TAG2 = b;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            t.a(TAG2, "error on execution", e);
            return null;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        Future future = this.a;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Future future = this.a;
        if (future != null) {
            return future.isDone();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        try {
            Future future = this.a;
            if (future != null) {
                return future.get(j, unit);
            }
            return null;
        } catch (InterruptedException unused) {
            boolean z = u.a;
            String TAG = b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            t.c(TAG, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            boolean z2 = u.a;
            String TAG2 = b;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            t.a(TAG2, "error on execution", e);
            return null;
        } catch (TimeoutException e2) {
            boolean z3 = u.a;
            String TAG3 = b;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            t.a(TAG3, "error on timeout", e2);
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            t.c(TAG3, "future.get() Timeout on Thread " + Thread.currentThread().getName());
            return null;
        }
    }
}
