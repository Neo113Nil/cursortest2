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

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class kj implements zg {
    public final Context f;
    public final jj g;
    public final tg h;
    public final Object i = new Object();
    public Handler j;
    public ThreadPoolExecutor k;
    public ThreadPoolExecutor l;
    public vv m;

    public kj(Context context, jj jjVar) {
        g8.p(context, "Context cannot be null");
        this.f = context.getApplicationContext();
        this.g = jjVar;
        this.h = lj.d;
    }

    public final void a() {
        synchronized (this.i) {
            try {
                this.m = null;
                Handler handler = this.j;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.j = null;
                ThreadPoolExecutor threadPoolExecutor = this.l;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.k = null;
                this.l = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final uj b() {
        try {
            tg tgVar = this.h;
            Context context = this.f;
            jj jjVar = this.g;
            tgVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{jjVar}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            g2 a = ij.a(context, Collections.unmodifiableList(arrayList));
            int i = a.f;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            uj[] ujVarArr = (uj[]) ((List) a.g).get(0);
            if (ujVarArr == null || ujVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return ujVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    @Override // defpackage.zg
    public final void u(vv vvVar) {
        synchronized (this.i) {
            this.m = vvVar;
        }
        synchronized (this.i) {
            try {
                if (this.m == null) {
                    return;
                }
                if (this.k == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new sb("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.l = threadPoolExecutor;
                    this.k = threadPoolExecutor;
                }
                this.k.execute(new p1(7, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
