package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.api.VideoController;

/* loaded from: classes14.dex */
public abstract class r extends i<t> {
    public static final sg.bigo.ads.core.adview.h H = new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.r.1
        @Override // sg.bigo.ads.core.adview.h
        public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        }

        @Override // sg.bigo.ads.core.adview.h
        public final void a(sg.bigo.ads.an.i iVar, int i, int i2) {
        }
    };

    @Nullable
    public sg.bigo.ads.y.b E;

    @Nullable
    protected ViewGroup F;

    @Nullable
    protected Button G;
    private u a;

    protected r(@NonNull Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void J() {
        super.J();
        VideoController ao = ao();
        if (ao != null) {
            ao.setVideoLifeCallback(null);
            ao.setLoadHTMLCallback(null);
            ao.setProgressChangeListener(null);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected boolean U() {
        return this instanceof sg.bigo.ads.s.b;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected final boolean V() {
        return this instanceof sg.bigo.ads.s.a;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected final sg.bigo.ads.d.c aj() {
        return this.E;
    }

    protected int am() {
        return 1;
    }

    @NonNull
    public final u an() {
        if (this.a == null) {
            this.a = (aN() || Y()) ? sg.bigo.ads.k.a.a(this.E) : sg.bigo.ads.k.a.a(this.E, o());
            this.a.a(this.P);
        }
        return this.a;
    }

    @Nullable
    public final VideoController ao() {
        sg.bigo.ads.y.b bVar = this.E;
        if (bVar != null) {
            return bVar.getVideoController();
        }
        return null;
    }

    protected final boolean ap() {
        T t = this.A;
        return t != 0 && ((t) t).E();
    }

    protected final boolean aq() {
        T t = this.A;
        return t != 0 && ((t) t).M();
    }

    public ValueCallback<Double> ar() {
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected void g(@LayoutRes int i) {
        ViewGroup viewGroup = (ViewGroup) q(R.id.inter_native_ad_view);
        this.F = viewGroup;
        if (viewGroup == null) {
            a("can not find ad root view.");
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    @CallSuper
    protected void h() {
        super.h();
        u uVar = this.a;
        if (uVar != null) {
            uVar.b();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    @CallSuper
    protected void j() {
        u uVar = this.a;
        if (uVar != null) {
            uVar.c();
        }
        if (ap()) {
            h(true);
        } else {
            super.j();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    @CallSuper
    protected void m() {
        this.E = ((t) this.A).K();
    }

    protected abstract int o();
}
