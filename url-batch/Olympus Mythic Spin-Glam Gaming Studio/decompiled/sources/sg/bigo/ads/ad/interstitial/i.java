package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.k;

/* loaded from: classes14.dex */
public abstract class i<T extends k<?>> extends sg.bigo.ads.cl.b<T> implements k.b {
    public T A;
    protected ViewGroup B;
    public AdCountDownButton C;
    final AtomicBoolean D;
    private final AtomicBoolean a;
    private long b;
    private long c;

    protected i(@NonNull Activity activity) {
        super(activity);
        this.a = new AtomicBoolean(false);
        this.D = new AtomicBoolean(true);
        this.b = 0L;
        this.c = 0L;
    }

    static /* synthetic */ void a(i iVar) {
        if (iVar.A.a(iVar.H())) {
            iVar.d(true);
        }
    }

    private void c() {
        AdCountDownButton adCountDownButton = (AdCountDownButton) q(R.id.inter_btn_close);
        this.C = adCountDownButton;
        if (adCountDownButton != null) {
            b(adCountDownButton);
            this.C.setOnCloseListener(new AdCountDownButton.a() { // from class: sg.bigo.ads.ad.interstitial.i.1
                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.a
                public final void a() {
                    i.a(i.this);
                }

                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.a
                public final void a(Rect rect) {
                    i.this.A.B = rect;
                }
            });
        }
    }

    protected int H() {
        return 1;
    }

    public void I() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void J() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            adCountDownButton.d();
        }
        if (this.A != null && !U() && this.a.compareAndSet(false, true)) {
            this.A.a(H(), 2);
        }
        if (this.A == null || U()) {
            return;
        }
        this.A.destroy();
    }

    protected boolean U() {
        return false;
    }

    protected boolean V() {
        return false;
    }

    @LayoutRes
    protected int W() {
        return R.layout.bigo_ad_activity_interstitial;
    }

    @Override // sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void X() {
        super.X();
        try {
            T t = (T) this.Q;
            this.A = t;
            if (t == null) {
                aM();
                return;
            }
            if (!U()) {
                aL();
                if (Y()) {
                    int i = R.layout.bigo_ad_activity_popup;
                    int i2 = this.N.getResources().getDisplayMetrics().widthPixels;
                    int c = sg.bigo.ads.common.utils.f.c(this.N);
                    this.N.setContentView(sg.bigo.ads.common.utils.a.a(this.N, i, null, false), new ViewGroup.LayoutParams(i2, c));
                } else {
                    p(W());
                }
            }
            m();
            this.B = (ViewGroup) q(R.id.inter_main);
            if (V()) {
                c();
                ae();
                ab();
            } else {
                if (U()) {
                    h(aa());
                    this.A.a(this);
                    return;
                }
                int aa = aa();
                c();
                g(aa);
                this.A.a(this);
                ab();
            }
        } catch (Exception unused) {
            a("Illegal InterstitialAd.");
        }
    }

    protected boolean Y() {
        return false;
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final boolean Z() {
        return Y();
    }

    protected final void a(String str) {
        T t = this.A;
        if (t != null) {
            t.e(str);
        }
        aM();
    }

    @LayoutRes
    protected int aa() {
        int ac = ac();
        Activity activity = this.N;
        ViewGroup viewGroup = this.B;
        sg.bigo.ads.common.utils.a.a(activity, ac, viewGroup, viewGroup != null);
        return ac;
    }

    protected void ab() {
        this.A.F();
    }

    @LayoutRes
    protected abstract int ac();

    protected abstract boolean ad();

    protected void ae() {
    }

    public final void af() {
        if (this.A != null && !this.a.get()) {
            this.b += SystemClock.elapsedRealtime() - this.c;
            this.A.a(H(), this.b);
            this.b = 0L;
        }
        aM();
    }

    @Override // sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ag() {
        if (g() && this.D.compareAndSet(true, false)) {
            h();
        }
        sg.bigo.ads.api.core.d z = aj().z();
        if (z == null || z.a != 4 || z.d) {
            if (this.A.B()) {
                d(true);
                this.A.C();
                return;
            }
            return;
        }
        aj().z().d = true;
        sg.bigo.ads.controller.landing.d.a(this.N, aj());
        Activity activity = this.N;
        sg.bigo.ads.core.landing.a.a(activity, z.b, activity.getPackageName(), z.c);
    }

    protected boolean ah() {
        return true;
    }

    @Override // sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ai() {
        if (i() && this.D.compareAndSet(false, true)) {
            j();
        }
        sg.bigo.ads.controller.landing.d.a(this.N, aj());
    }

    protected sg.bigo.ads.d.c aj() {
        return this.A;
    }

    @Override // sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void ak() {
    }

    @Override // sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void al() {
    }

    @Override // sg.bigo.ads.ad.interstitial.k.b
    public void b(String str) {
    }

    protected void d(boolean z) {
        af();
    }

    protected abstract void g(@LayoutRes int i);

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void g(boolean z) {
        if (z) {
            aL();
        }
    }

    protected boolean g() {
        return true;
    }

    @CallSuper
    protected void h() {
        h(false);
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton == null || adCountDownButton.c || !ah()) {
            return;
        }
        this.C.c();
    }

    protected void h(@LayoutRes int i) {
    }

    protected final void h(boolean z) {
        this.D.set(z);
        if (z) {
            this.b += SystemClock.elapsedRealtime() - this.c;
        } else {
            this.c = SystemClock.elapsedRealtime();
        }
    }

    protected boolean i() {
        return true;
    }

    @CallSuper
    protected void j() {
        h(true);
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton == null || adCountDownButton.c) {
            return;
        }
        adCountDownButton.b();
    }

    public final void k(@DrawableRes int i) {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            adCountDownButton.setCloseImageResource(i);
        }
    }

    protected abstract void m();
}
