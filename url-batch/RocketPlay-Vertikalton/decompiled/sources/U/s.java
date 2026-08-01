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
    public final Context f1199a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f1200b;

    /* renamed from: c, reason: collision with root package name */
    public final M0.e f1201c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1202e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f1203f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f1204g;
    public F1.l h;

    public s(Context context, H.e eVar) {
        M0.e eVar2 = t.d;
        this.d = new Object();
        F1.l.j(context, "Context cannot be null");
        this.f1199a = context.getApplicationContext();
        this.f1200b = eVar;
        this.f1201c = eVar2;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.f1202e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1202e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1204g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1203f = null;
                this.f1204g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H.j b() {
        try {
            M0.e eVar = this.f1201c;
            Context context = this.f1199a;
            H.e eVar2 = this.f1200b;
            eVar.getClass();
            B1.p a2 = H.d.a(context, eVar2);
            int i = a2.f222a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            H.j[] jVarArr = (H.j[]) a2.f223b;
            if (jVarArr == null || jVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return jVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // U.i
    public final void j(F1.l lVar) {
        synchronized (this.d) {
            this.h = lVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f1203f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0037a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1204g = threadPoolExecutor;
                    this.f1203f = threadPoolExecutor;
                }
                this.f1203f.execute(new G0.o(7, this));
            } finally {
            }
        }
    }
}
