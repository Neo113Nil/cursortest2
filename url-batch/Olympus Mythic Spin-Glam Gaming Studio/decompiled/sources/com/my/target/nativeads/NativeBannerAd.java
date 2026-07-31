package com.my.target.nativeads;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.BaseAd;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.dd;
import com.my.target.hd;
import com.my.target.jb;
import com.my.target.mi;
import com.my.target.n;
import com.my.target.nativeads.banners.NativeBanner;
import com.my.target.nativeads.views.NativeBannerAdView;
import com.my.target.ob;
import com.my.target.q;
import com.my.target.r5;
import com.my.target.s;
import com.my.target.sc;
import com.my.target.t;
import com.my.target.tb;
import com.my.target.ud;
import com.my.target.vb;
import com.my.target.zc;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes10.dex */
public final class NativeBannerAd extends BaseAd implements INativeBannerAd {
    private final Context f;
    private final zc.b g;
    private MenuFactory h;
    private r5 i;
    private NativeBannerAdListener j;
    private NativeBannerAdMediaListener k;
    private NativeBannerAdChoicesListener l;
    private NativeBannerAdChoicesOptionListener m;
    private int n;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface NativeBannerAdChoicesListener {
        void onAdChoicesIconLoad(@Nullable ImageData imageData, boolean z, @Nullable NativeBannerAd nativeBannerAd);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface NativeBannerAdChoicesOptionListener {
        void closeIfAutomaticallyDisabled(@NonNull NativeBannerAd nativeBannerAd);

        void onCloseAutomatically(@NonNull NativeBannerAd nativeBannerAd);

        boolean shouldCloseAutomatically();
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface NativeBannerAdListener {
        void onClick(@NonNull NativeBannerAd nativeBannerAd);

        void onLoad(@NonNull NativeBanner nativeBanner, @NonNull NativeBannerAd nativeBannerAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull NativeBannerAd nativeBannerAd);

        void onShow(@NonNull NativeBannerAd nativeBannerAd);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface NativeBannerAdMediaListener {
        void onIconLoad(@NonNull NativeBannerAd nativeBannerAd);
    }

    public NativeBannerAd(int i, @NonNull Context context) {
        super(i, "nativebanner", context);
        this.g = new zc.b();
        this.n = 0;
        this.f = context.getApplicationContext();
        mi.c("Native banner ad created. Version - " + MyTargetVersion.VERSION);
    }

    void a(sc scVar) {
        this.i = ud.a(this, scVar, this.h, this.f);
    }

    @Nullable
    public NativeBannerAdChoicesListener getAdChoicesListener() {
        return this.l;
    }

    @Nullable
    public NativeBannerAdChoicesOptionListener getAdChoicesOptionListener() {
        return this.m;
    }

    @Override // com.my.target.nativeads.IAd
    public int getAdChoicesPlacement() {
        return this.n;
    }

    @Nullable
    public String getAdSource() {
        r5 r5Var = this.i;
        if (r5Var != null) {
            return r5Var.a();
        }
        return null;
    }

    public float getAdSourcePriority() {
        r5 r5Var = this.i;
        if (r5Var != null) {
            return r5Var.d();
        }
        return 0.0f;
    }

    @Nullable
    public NativeBanner getBanner() {
        r5 r5Var = this.i;
        if (r5Var == null) {
            return null;
        }
        return r5Var.b();
    }

    @Override // com.my.target.nativeads.IAd
    public int getCachePolicy() {
        return this.a.g();
    }

    @Nullable
    public NativeBannerAdListener getListener() {
        return this.j;
    }

    @Nullable
    public NativeBannerAdMediaListener getMediaListener() {
        return this.k;
    }

    public void handleAdChoicesClick(@NonNull Context context) {
        r5 r5Var = this.i;
        if (r5Var == null) {
            return;
        }
        r5Var.handleAdChoicesClick(context);
    }

    public void handleClick(boolean z, @NonNull View view) {
        r5 r5Var = this.i;
        if (r5Var == null) {
            return;
        }
        r5Var.handleClick(z, view);
    }

    @Override // com.my.target.nativeads.IAd
    public void handleData(@NonNull String str) {
        t a = t.a(this.d, UUID.randomUUID().toString(), 0, vb.b());
        this.a.a(a);
        a.b(0, 0);
        zc.a(this.g, str, this.a, this.b).a(new NativeBannerAd$$ExternalSyntheticLambda0(this)).a(this.b.a(), this.f);
    }

    public boolean isMediationEnabled() {
        return this.a.m();
    }

    @Override // com.my.target.nativeads.IAd
    public void load() {
        if (isLoadCalled()) {
            mi.a("NativeBannerAd: Doesn't support multiple load");
            this.a.a().a(0, 1);
            a((hd) null, s.a(q.t));
        } else {
            t a = t.a(this.d, this.a.j(), 0, vb.b());
            this.a.a(a);
            a.b(0, 0);
            zc.a(this.g, this.a, this.b).a(new NativeBannerAd$$ExternalSyntheticLambda0(this)).a(this.b.a(), this.f);
        }
    }

    @Override // com.my.target.nativeads.IAd
    public void loadFromBid(@NonNull String str) {
        this.a.b(str);
        load();
    }

    @Override // com.my.target.nativeads.INativeBannerAd
    public void registerView(@NonNull NativeBannerAdViewBinder nativeBannerAdViewBinder, @Nullable List<View> list) {
        dd.a(nativeBannerAdViewBinder.getRootAdBannerView(), this);
        r5 r5Var = this.i;
        if (r5Var != null) {
            r5Var.registerView(nativeBannerAdViewBinder, list, this.n);
        }
    }

    public void setAdChoicesListener(@Nullable NativeBannerAdChoicesListener nativeBannerAdChoicesListener) {
        this.l = nativeBannerAdChoicesListener;
    }

    public void setAdChoicesOptionListener(@Nullable NativeBannerAdChoicesOptionListener nativeBannerAdChoicesOptionListener) {
        this.m = nativeBannerAdChoicesOptionListener;
    }

    @Override // com.my.target.nativeads.IAd
    public void setAdChoicesPlacement(int i) {
        this.n = i;
    }

    @Override // com.my.target.nativeads.IAd
    public void setCachePolicy(int i) {
        this.a.b(i);
    }

    public void setListener(@Nullable NativeBannerAdListener nativeBannerAdListener) {
        this.j = nativeBannerAdListener;
    }

    public void setMediaListener(@Nullable NativeBannerAdMediaListener nativeBannerAdMediaListener) {
        this.k = nativeBannerAdMediaListener;
        r5 r5Var = this.i;
        if (r5Var != null) {
            r5Var.a(nativeBannerAdMediaListener);
        }
    }

    public void setMediationEnabled(boolean z) {
        this.a.a(z);
    }

    @Override // com.my.target.nativeads.IAd
    public void unregisterView() {
        dd.a(this);
        r5 r5Var = this.i;
        if (r5Var != null) {
            r5Var.unregisterView();
        }
    }

    public void a(hd hdVar) {
        t a = t.a(this.d, 0, vb.b());
        this.a.a(a);
        a.b(0, 0);
        tb.a a2 = tb.a(this.a.j());
        zc.a(this.g, hdVar, this.a, a2).a(new NativeBannerAd$$ExternalSyntheticLambda0(this)).a(a2.a(), this.f);
    }

    @Override // com.my.target.nativeads.INativeBannerAd
    public void registerView(@NonNull NativeBannerAdView nativeBannerAdView) {
        registerView(nativeBannerAdView.getNativeBannerAdViewBinder(), (List<View>) null);
    }

    @Override // com.my.target.nativeads.INativeBannerAd
    public void registerView(@NonNull NativeBannerAdView nativeBannerAdView, @Nullable List<View> list) {
        registerView(nativeBannerAdView.getNativeBannerAdViewBinder(), list);
    }

    @Override // com.my.target.nativeads.INativeBannerAd
    public void registerView(@NonNull NativeBannerAdViewBinder nativeBannerAdViewBinder) {
        registerView(nativeBannerAdViewBinder, (List<View>) null);
    }

    @Override // com.my.target.nativeads.IAd
    @Deprecated
    public void registerView(@NonNull View view, @Nullable List<View> list) {
        dd.a(view, this);
        r5 r5Var = this.i;
        if (r5Var != null) {
            r5Var.registerView(view, list, this.n);
        }
    }

    @Override // com.my.target.nativeads.IAd
    @Deprecated
    public void registerView(@NonNull View view) {
        registerView(view, (List<View>) null);
    }

    void a(hd hdVar, s sVar) {
        if (this.j == null) {
            return;
        }
        q a = sVar.a();
        if (hdVar == null) {
            NativeBannerAdListener nativeBannerAdListener = this.j;
            if (a == null) {
                a = q.o;
            }
            nativeBannerAdListener.onNoAd(a, this);
            return;
        }
        sc d = hdVar.d();
        jb b = hdVar.b();
        if (d != null) {
            ud a2 = ud.a(this, d, this.h, this.f);
            this.i = a2;
            a2.a(this.k);
            NativeBanner b2 = this.i.b();
            if (b2 != null) {
                this.j.onLoad(b2, this);
                this.a.a().b(0, 3);
                return;
            }
            return;
        }
        if (b != null) {
            ob a3 = ob.a(this, b, this.a, this.b, this.h);
            this.i = a3;
            a3.b(this.f);
            this.a.a().b(0, 3);
            return;
        }
        NativeBannerAdListener nativeBannerAdListener2 = this.j;
        if (a == null) {
            a = q.v;
        }
        nativeBannerAdListener2.onNoAd(a, this);
    }

    public NativeBannerAd(int i, @Nullable MenuFactory menuFactory, @NonNull Context context) {
        this(i, context);
        this.h = menuFactory;
    }

    public void a(n nVar, sc scVar) {
        setCachePolicy(nVar.g());
        a(scVar);
        t a = t.a(this.d, nVar.a());
        this.a.a(a);
        scVar.f().a(a);
    }
}
