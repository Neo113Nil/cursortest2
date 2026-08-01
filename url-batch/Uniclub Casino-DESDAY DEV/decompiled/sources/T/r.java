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
    public final Context f742a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f743b;

    /* renamed from: c, reason: collision with root package name */
    public final J0.e f744c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f745e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f746f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f747g;
    public q1.l h;

    public r(Context context, H.e eVar) {
        J0.e eVar2 = s.d;
        this.d = new Object();
        q1.l.n(context, "Context cannot be null");
        this.f742a = context.getApplicationContext();
        this.f743b = eVar;
        this.f744c = eVar2;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.f745e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f745e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f747g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f746f = null;
                this.f747g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H.k b() {
        try {
            J0.e eVar = this.f744c;
            Context context = this.f742a;
            H.e eVar2 = this.f743b;
            eVar.getClass();
            H.j a2 = H.d.a(context, eVar2);
            int i = a2.f220a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            H.k[] kVarArr = (H.k[]) a2.f221b;
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // T.i
    public final void q(q1.l lVar) {
        synchronized (this.d) {
            this.h = lVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f746f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0031a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f747g = threadPoolExecutor;
                    this.f746f = threadPoolExecutor;
                }
                this.f746f.execute(new D0.p(5, this));
            } finally {
            }
        }
    }
}
