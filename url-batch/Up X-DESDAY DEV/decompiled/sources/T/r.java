package T;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f738a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f739b;

    /* renamed from: c, reason: collision with root package name */
    public final H0.e f740c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f741e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f742f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f743g;
    public q1.d h;

    public r(Context context, H.e eVar) {
        H0.e eVar2 = s.d;
        this.d = new Object();
        q1.l.i(context, "Context cannot be null");
        this.f738a = context.getApplicationContext();
        this.f739b = eVar;
        this.f740c = eVar2;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.f741e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f741e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f743g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f742f = null;
                this.f743g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H.k b() {
        try {
            H0.e eVar = this.f740c;
            Context context = this.f738a;
            H.e eVar2 = this.f739b;
            eVar.getClass();
            H.j a2 = H.d.a(context, eVar2);
            int i = a2.f227a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            H.k[] kVarArr = (H.k[]) a2.f228b;
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // T.i
    public final void n(q1.d dVar) {
        synchronized (this.d) {
            this.h = dVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f742f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0032a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f743g = threadPoolExecutor;
                    this.f742f = threadPoolExecutor;
                }
                this.f742f.execute(new B0.q(6, this));
            } finally {
            }
        }
    }
}
