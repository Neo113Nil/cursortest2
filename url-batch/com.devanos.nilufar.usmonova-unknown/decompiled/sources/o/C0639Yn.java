package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.Yn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639Yn implements InterfaceC0246Jj {
    public final Context a;
    public final C1216i8 b;
    public final C0218Ih c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public AbstractC0868ct h;

    public C0639Yn(Context context, C1216i8 c1216i8) {
        AbstractC1807r8.m(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = c1216i8;
        this.c = C0665Zn.d;
    }

    @Override // o.InterfaceC0246Jj
    public final void a(AbstractC0868ct abstractC0868ct) {
        synchronized (this.d) {
            this.h = abstractC0868ct;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0032Bd("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new D1(10, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1718po c() {
        try {
            C0218Ih c0218Ih = this.c;
            Context context = this.a;
            C1216i8 c1216i8 = this.b;
            c0218Ih.getClass();
            C1143h2 A = AbstractC1052fg.A(context, c1216i8);
            int i = A.h;
            if (i != 0) {
                throw new RuntimeException(AbstractC1888sN.h(i, "fetchFonts failed (", ")"));
            }
            C1718po[] c1718poArr = (C1718po[]) A.i;
            if (c1718poArr == null || c1718poArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c1718poArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
