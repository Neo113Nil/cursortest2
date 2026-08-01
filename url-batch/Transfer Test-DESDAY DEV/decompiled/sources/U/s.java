package U;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class s implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f841a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f842b;

    /* renamed from: c, reason: collision with root package name */
    public final O0.e f843c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f844e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f845f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f846g;
    public T.e h;

    public s(Context context, H.e eVar) {
        O0.e eVar2 = t.d;
        this.d = new Object();
        A.c.l(context, "Context cannot be null");
        this.f841a = context.getApplicationContext();
        this.f842b = eVar;
        this.f843c = eVar2;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.f844e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f844e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f846g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f845f = null;
                this.f846g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H.k b() {
        try {
            O0.e eVar = this.f843c;
            Context context = this.f841a;
            H.e eVar2 = this.f842b;
            eVar.getClass();
            H.j a2 = H.d.a(context, eVar2);
            int i = a2.f235a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            H.k[] kVarArr = (H.k[]) a2.f236b;
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // U.i
    public final void h(T.e eVar) {
        synchronized (this.d) {
            this.h = eVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f845f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0031a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f846g = threadPoolExecutor;
                    this.f845f = threadPoolExecutor;
                }
                this.f845f.execute(new B0.b(6, this));
            } finally {
            }
        }
    }
}
