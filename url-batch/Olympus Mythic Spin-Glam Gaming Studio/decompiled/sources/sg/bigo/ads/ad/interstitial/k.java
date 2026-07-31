package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.core.b;

/* loaded from: classes13.dex */
public abstract class k<U extends sg.bigo.ads.api.core.b> extends sg.bigo.ads.d.d<InterstitialAd, U> implements InterstitialAd {
    protected boolean A;
    protected Rect B;
    private long C;

    @Nullable
    protected b z;

    public interface a<T extends k> {
        T getAdInstance(@NonNull sg.bigo.ads.api.core.g gVar);
    }

    interface b {
        void I();

        void b(String str);
    }

    public k(@NonNull sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        this.A = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.app.Activity] */
    private void a(@Nullable Activity activity, boolean z) {
        sg.bigo.ads.ai.j jVar;
        a(activity == 0, z);
        if (activity != 0) {
            b(activity);
        }
        sg.bigo.ads.da.b.a(f());
        if (isExpired()) {
            b(2000, 1, "The ad is expired.");
            return;
        }
        if (this.i) {
            b(2000, 1, "The ad is destroyed.");
            return;
        }
        if (p()) {
            a(2003, "This ad cannot be shown repeatedly");
            return;
        }
        try {
            U f = f();
            if (f instanceof sg.bigo.ads.api.core.o) {
                sg.bigo.ads.api.core.o oVar = (sg.bigo.ads.api.core.o) f;
                if (oVar.aZ()) {
                    File file = new File(oVar.b(this.b.e));
                    if (!file.exists() && !new File(file.getParentFile(), sg.bigo.ads.common.utils.g.d(file.getName())).exists()) {
                        sg.bigo.ads.da.b.a(f, new AdError(2010, "resource clear."));
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (activity != 0) {
            b(1);
        }
        if (activity == 0 && (jVar = sg.bigo.ads.ai.k.a) != null && jVar.n().a(16)) {
            activity = sg.bigo.ads.at.b.b();
            b(2);
        }
        if (activity == 0) {
            activity = this.b.e;
        }
        int a2 = this.Y.a();
        this.Z = a2;
        sg.bigo.ads.aj.a aVar = this.aa;
        if (aVar != null) {
            aVar.g(a2);
        }
        a(activity);
    }

    public final boolean B() {
        return this.A;
    }

    public final void C() {
        this.A = false;
    }

    public int D() {
        if (E()) {
            return this.b.b.c();
        }
        return 0;
    }

    protected abstract boolean E();

    @CallSuper
    public final void F() {
        v();
        l();
        this.C = SystemClock.elapsedRealtime();
        sg.bigo.ads.da.b.a(this.b.a, this);
    }

    protected abstract Class<? extends sg.bigo.ads.cl.b<?>> G();

    @CallSuper
    public void a(int i, int i2) {
        m();
    }

    protected final void a(int i, long j) {
        sg.bigo.ads.da.b.a(this.b.a, i, this.C > 0 ? SystemClock.elapsedRealtime() - this.C : 0L, j, this);
    }

    protected void a(Context context) {
        if (sg.bigo.ads.controller.landing.d.a(context, G(), this, f() != null && f().as())) {
            return;
        }
        a(2004, "This ad cannot be open");
    }

    public final void a(b bVar) {
        this.z = bVar;
    }

    @Override // sg.bigo.ads.d.c, sg.bigo.ads.aj.d
    public final void a(@NonNull d.a<InterstitialAd> aVar) {
        super.a(aVar);
        b(aVar);
    }

    public abstract boolean a(int i);

    protected void b(@NonNull Activity activity) {
    }

    protected abstract void b(@NonNull d.a<InterstitialAd> aVar);

    @Override // sg.bigo.ads.d.d, sg.bigo.ads.d.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        this.z = null;
    }

    @CallSuper
    public final void e(String str) {
        a(2003, str);
    }

    @Override // sg.bigo.ads.api.InterstitialAd
    public void show() {
        a((Activity) null, true);
    }

    @Override // sg.bigo.ads.api.InterstitialAd
    public void show(@Nullable Activity activity) {
        a(activity, false);
    }
}
