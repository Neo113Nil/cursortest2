package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class nt implements fp {
    public final Context d;
    public final mt e;
    public final y7 f;
    public final Object g = new Object();
    public Handler h;
    public ThreadPoolExecutor i;
    public ThreadPoolExecutor j;
    public px0 k;

    public nt(Context context, mt mtVar) {
        ld0.f(context, "Context cannot be null");
        this.d = context.getApplicationContext();
        this.e = mtVar;
        this.f = ot.d;
    }

    public final void a() {
        synchronized (this.g) {
            try {
                this.k = null;
                Handler handler = this.h;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.h = null;
                ThreadPoolExecutor threadPoolExecutor = this.j;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.i = null;
                this.j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.g) {
            try {
                if (this.k == null) {
                    return;
                }
                if (this.i == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new li("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.j = threadPoolExecutor;
                    this.i = threadPoolExecutor;
                }
                this.i.execute(new w2(5, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fp
    public final void c(px0 px0Var) {
        synchronized (this.g) {
            this.k = px0Var;
        }
        b();
    }

    public final wt d() {
        try {
            y7 y7Var = this.f;
            Context context = this.d;
            mt mtVar = this.e;
            y7Var.getClass();
            Object[] objArr = {mtVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            a7 a = lt.a(context, Collections.unmodifiableList(arrayList));
            int i = a.b;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            wt[] wtVarArr = (wt[]) ((List) a.c).get(0);
            if (wtVarArr == null || wtVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return wtVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
