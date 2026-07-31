package com.my.target.nativeads;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.BaseAd;
import com.my.target.common.ExternalClickHandler;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.listeners.HtmlCustomEventListener;
import com.my.target.common.listeners.HtmlInteractionListener;
import com.my.target.common.listeners.HtmlInteractiveProgressListener;
import com.my.target.common.listeners.HtmlLoadingListener;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.dd;
import com.my.target.hd;
import com.my.target.jb;
import com.my.target.k0;
import com.my.target.kg;
import com.my.target.mi;
import com.my.target.n;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.nativeads.views.NativeAdView;
import com.my.target.nb;
import com.my.target.q;
import com.my.target.q5;
import com.my.target.s;
import com.my.target.sc;
import com.my.target.t;
import com.my.target.vb;
import com.my.target.yc;
import com.my.target.zc;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes9.dex */
public final class NativeAd extends BaseAd implements INativeAd {
    private final Context f;
    private final zc.a g;
    private MenuFactory h;
    private q5 i;
    private NativeAdListener j;
    private NativeAdVideoListener k;
    private NativeAdChoicesListener l;
    private NativeAdMediaListener m;
    private NativeAdChoicesOptionListener n;
    private ExternalClickHandler o;
    private CollageItemsShowHandler p;
    private HtmlInteractionListener q;
    private HtmlLoadingListener r;
    private HtmlInteractiveProgressListener s;
    private HtmlCustomEventListener t;
    private long u;
    private int v;
    private boolean w;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface CollageItemsShowHandler {
        boolean showCollageItem(int i, @NonNull View view);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface NativeAdChoicesListener {
        void onAdChoicesIconLoad(@Nullable ImageData imageData, boolean z, @NonNull NativeAd nativeAd);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface NativeAdChoicesOptionListener {
        void closeIfAutomaticallyDisabled(@NonNull NativeAd nativeAd);

        void onCloseAutomatically(@NonNull NativeAd nativeAd);

        boolean shouldCloseAutomatically();
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface NativeAdListener {
        void onClick(@Nullable View view, @NonNull NativeAd nativeAd);

        @Deprecated
        void onClick(@NonNull NativeAd nativeAd);

        void onLoad(@NonNull NativePromoBanner nativePromoBanner, @NonNull NativeAd nativeAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull NativeAd nativeAd);

        void onShow(@NonNull NativeAd nativeAd);

        @Deprecated
        void onVideoComplete(@NonNull NativeAd nativeAd);

        @Deprecated
        void onVideoPause(@NonNull NativeAd nativeAd);

        @Deprecated
        void onVideoPlay(@NonNull NativeAd nativeAd);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface NativeAdMediaListener {
        void onIconLoad(@NonNull NativeAd nativeAd);

        void onImageLoad(@NonNull NativeAd nativeAd);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface NativeAdVideoListener {
        void onVideoComplete(@NonNull NativeAd nativeAd);

        void onVideoError(@NonNull String str, @NonNull NativeAd nativeAd);

        void onVideoPause(@NonNull NativeAd nativeAd);

        void onVideoProgress(float f, float f2, @NonNull NativeAd nativeAd);

        void onVideoReplay(@NonNull NativeAd nativeAd);

        void onVideoResume(@NonNull NativeAd nativeAd);

        void onVideoStart(@NonNull NativeAd nativeAd);

        void onVideoVolumeChanged(float f, @NonNull NativeAd nativeAd);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface NativeAdVideoPlayer {
        float getCurrentPosition();

        float getDuration();

        boolean isVolumeOn();

        void pause();

        void play();

        void replay();

        void setVolumeOff();

        void setVolumeOn();
    }

    public NativeAd(int i, @NonNull Context context) {
        super(i, "nativeads", context);
        this.g = new zc.a();
        this.u = 5000L;
        this.v = 0;
        this.w = true;
        this.f = context.getApplicationContext();
        this.h = null;
        mi.c("Native ad created. Version - " + MyTargetVersion.VERSION);
    }

    public void a(n nVar, sc scVar) {
        setCachePolicy(nVar.g());
        this.a.c().a(nVar.c());
        a(scVar);
        t a = t.a(this.d, nVar.a());
        this.a.a(a);
        scVar.f().a(a);
    }

    @Nullable
    public NativeAdChoicesListener getAdChoicesListener() {
        return this.l;
    }

    @Nullable
    public NativeAdChoicesOptionListener getAdChoicesOptionListener() {
        return this.n;
    }

    @Override // com.my.target.nativeads.IAd
    public int getAdChoicesPlacement() {
        return this.v;
    }

    @Nullable
    public String getAdSource() {
        q5 q5Var = this.i;
        if (q5Var != null) {
            return q5Var.a();
        }
        return null;
    }

    public float getAdSourcePriority() {
        q5 q5Var = this.i;
        if (q5Var != null) {
            return q5Var.d();
        }
        return 0.0f;
    }

    @Nullable
    public NativePromoBanner getBanner() {
        q5 q5Var = this.i;
        if (q5Var == null) {
            return null;
        }
        return q5Var.g();
    }

    @Override // com.my.target.nativeads.IAd
    public int getCachePolicy() {
        return this.a.g();
    }

    public boolean getHtml5ContentIsLoaded() {
        q5 q5Var = this.i;
        if (q5Var != null) {
            return q5Var.e();
        }
        return false;
    }

    @Nullable
    public NativeAdListener getListener() {
        return this.j;
    }

    @Nullable
    public NativeAdMediaListener getMediaListener() {
        return this.m;
    }

    @Nullable
    public NativeAdVideoListener getNativeAdVideoListener() {
        return this.k;
    }

    @Nullable
    public NativeAdVideoPlayer getNativeAdVideoPlayer() {
        q5 q5Var = this.i;
        if (q5Var != null) {
            return q5Var.c();
        }
        return null;
    }

    public int getVideoQuality() {
        return this.a.l();
    }

    public void handleAdChoicesClick(@NonNull Context context) {
        q5 q5Var = this.i;
        if (q5Var == null) {
            return;
        }
        q5Var.handleAdChoicesClick(context);
    }

    public void handleClick(boolean z, @NonNull View view) {
        q5 q5Var = this.i;
        if (q5Var == null) {
            return;
        }
        q5Var.handleClick(z, view);
    }

    @Override // com.my.target.nativeads.IAd
    public void handleData(@NonNull String str) {
        t a = t.a(this.d, UUID.randomUUID().toString(), 1, vb.b());
        this.a.a(a);
        a.b(0, 0);
        zc.a(this.g, str, this.a, this.b).a(new NativeAd$$ExternalSyntheticLambda0(this)).a(this.b.a(), this.f);
    }

    public boolean isMediationEnabled() {
        return this.a.m();
    }

    public boolean isUseExoPlayer() {
        return this.w;
    }

    @Override // com.my.target.nativeads.IAd
    public void load() {
        if (isLoadCalled()) {
            mi.a("NativeAd: Doesn't support multiple load");
            this.a.a().a(0, 1);
            a((hd) null, s.a(q.t));
        } else {
            t a = t.a(this.d, this.a.j(), 1, vb.b());
            this.a.a(a);
            a.b(0, 0);
            zc.a(this.g, this.a, this.b).a(new NativeAd$$ExternalSyntheticLambda0(this)).a(this.b.a(), this.f);
        }
    }

    @Override // com.my.target.nativeads.IAd
    public void loadFromBid(@NonNull String str) {
        this.a.b(str);
        load();
    }

    @Override // com.my.target.nativeads.INativeAd
    public void registerView(@NonNull NativeAdViewBinder nativeAdViewBinder) {
        registerView(nativeAdViewBinder, (List<View>) null);
    }

    public void reloadHtmlContent() {
        q5 q5Var = this.i;
        if (q5Var != null) {
            q5Var.f();
        }
    }

    public void setAdChoicesListener(@Nullable NativeAdChoicesListener nativeAdChoicesListener) {
        this.l = nativeAdChoicesListener;
    }

    public void setAdChoicesOptionListener(@Nullable NativeAdChoicesOptionListener nativeAdChoicesOptionListener) {
        this.n = nativeAdChoicesOptionListener;
    }

    @Override // com.my.target.nativeads.IAd
    public void setAdChoicesPlacement(int i) {
        this.v = i;
    }

    public void setAdsLightPixelParams(@NonNull String str, @Nullable Map<String, String> map) {
        if (k0.a(this.f)) {
            this.a.c().a(str, map);
        } else {
            mi.b("Method 'setAdsLightPixelParams' is for internal partners only.");
        }
    }

    @Override // com.my.target.nativeads.IAd
    public void setCachePolicy(int i) {
        this.a.b(i);
    }

    public void setCollageItemsShowHandler(@Nullable CollageItemsShowHandler collageItemsShowHandler) {
        this.p = collageItemsShowHandler;
        q5 q5Var = this.i;
        if (q5Var != null) {
            q5Var.a(collageItemsShowHandler);
        }
    }

    public void setHtmlCustomEventListener(@Nullable HtmlCustomEventListener htmlCustomEventListener) {
        this.t = htmlCustomEventListener;
        q5 q5Var = this.i;
        if (q5Var != null) {
            q5Var.a(htmlCustomEventListener);
        }
    }

    public void setHtmlInteractionListener(@Nullable HtmlInteractionListener htmlInteractionListener) {
        this.q = htmlInteractionListener;
        q5 q5Var = this.i;
        if (q5Var != null) {
            q5Var.a(htmlInteractionListener);
        }
    }

    public void setHtmlInteractiveProgressListener(@NonNull HtmlInteractiveProgressListener htmlInteractiveProgressListener) {
        this.s = htmlInteractiveProgressListener;
        q5 q5Var = this.i;
        if (q5Var != null) {
            q5Var.a(htmlInteractiveProgressListener);
        }
    }

    public void setHtmlLoadingListener(@Nullable HtmlLoadingListener htmlLoadingListener) {
        this.r = htmlLoadingListener;
        q5 q5Var = this.i;
        if (q5Var != null) {
            q5Var.a(htmlLoadingListener);
        }
    }

    public void setHtmlLoadingTimeoutMillis(long j) {
        this.u = j;
        q5 q5Var = this.i;
        if (q5Var != null) {
            q5Var.a(j);
        }
    }

    public void setInternalObject(@NonNull Object obj) {
        if (!k0.a(this.f)) {
            mi.b("Method 'setInternalObject' is for internal partners only.");
            return;
        }
        if (!(obj instanceof ExternalClickHandler)) {
            mi.b("'setInternalObject' method error. Wrong object type.");
            return;
        }
        ExternalClickHandler externalClickHandler = (ExternalClickHandler) obj;
        this.o = externalClickHandler;
        q5 q5Var = this.i;
        if (q5Var == null) {
            return;
        }
        q5Var.a(externalClickHandler);
    }

    public void setListener(@Nullable NativeAdListener nativeAdListener) {
        this.j = nativeAdListener;
    }

    public void setMediaListener(@Nullable NativeAdMediaListener nativeAdMediaListener) {
        this.m = nativeAdMediaListener;
        q5 q5Var = this.i;
        if (q5Var != null) {
            q5Var.a(nativeAdMediaListener);
        }
    }

    public void setMediationEnabled(boolean z) {
        this.a.a(z);
    }

    public void setNativeAdVideoListener(@Nullable NativeAdVideoListener nativeAdVideoListener) {
        this.k = nativeAdVideoListener;
    }

    public void setVideoQuality(int i) {
        this.a.d(i);
    }

    @Override // com.my.target.nativeads.IAd
    public void unregisterView() {
        dd.a(this);
        q5 q5Var = this.i;
        if (q5Var != null) {
            q5Var.unregisterView();
        }
    }

    public void useExoPlayer(boolean z) {
        this.w = z;
        if (z) {
            return;
        }
        kg.g();
    }

    @Override // com.my.target.nativeads.INativeAd
    public void registerView(@NonNull NativeAdViewBinder nativeAdViewBinder, @Nullable List<View> list) {
        dd.a(nativeAdViewBinder.getRootAdView(), this);
        q5 q5Var = this.i;
        if (q5Var != null) {
            q5Var.registerView(nativeAdViewBinder, list, this.v);
        }
    }

    @Override // com.my.target.nativeads.INativeAd
    public void registerView(@NonNull NativeAdView nativeAdView) {
        registerView(nativeAdView.getNativeAdViewBinder(), (List<View>) null);
    }

    @Override // com.my.target.nativeads.INativeAd
    public void registerView(@NonNull NativeAdView nativeAdView, @Nullable List<View> list) {
        registerView(nativeAdView.getNativeAdViewBinder(), list);
    }

    @Override // com.my.target.nativeads.IAd
    @Deprecated
    public void registerView(@NonNull View view, @Nullable List<View> list) {
        dd.a(view, this);
        q5 q5Var = this.i;
        if (q5Var != null) {
            q5Var.a(view, list, this.v, null);
        }
    }

    @Override // com.my.target.nativeads.IAd
    @Deprecated
    public void registerView(@NonNull View view) {
        registerView(view, (List<View>) null);
    }

    void a(View view, List list, MediaAdView mediaAdView) {
        dd.a(view, this);
        q5 q5Var = this.i;
        if (q5Var != null) {
            q5Var.a(view, list, this.v, mediaAdView);
        }
    }

    void a(sc scVar) {
        yc a = yc.a(this, scVar, this.h, this.f);
        this.i = a;
        a.a(this.o);
    }

    public void a(hd hdVar) {
        t a = t.a(this.d, 1, vb.b());
        this.a.a(a);
        a.b(0, 0);
        zc.a(this.g, hdVar, this.a, this.b).a(new NativeAd$$ExternalSyntheticLambda0(this)).a(this.b.a(), this.f);
    }

    public NativeAd(int i, @Nullable MenuFactory menuFactory, @NonNull Context context) {
        this(i, context);
        this.h = menuFactory;
    }

    void a(hd hdVar, s sVar) {
        if (this.j == null) {
            return;
        }
        q a = sVar.a();
        if (hdVar == null) {
            NativeAdListener nativeAdListener = this.j;
            if (a == null) {
                a = q.o;
            }
            nativeAdListener.onNoAd(a, this);
            return;
        }
        sc d = hdVar.d();
        jb b = hdVar.b();
        if (d == null) {
            if (b != null) {
                nb a2 = nb.a(this, b, this.a, this.b, this.h);
                this.i = a2;
                a2.b(this.f);
                this.a.a().b(0, 3);
                return;
            }
            NativeAdListener nativeAdListener2 = this.j;
            if (a == null) {
                a = q.v;
            }
            nativeAdListener2.onNoAd(a, this);
            return;
        }
        yc a3 = yc.a(this, d, this.h, this.f);
        this.i = a3;
        a3.a(this.m);
        this.i.a(this.o);
        this.i.a(this.p);
        this.i.a(this.q);
        this.i.a(this.r);
        this.i.a(this.s);
        this.i.a(this.t);
        this.i.a(this.u);
        if (this.i.g() != null) {
            this.j.onLoad(this.i.g(), this);
            this.a.a().b(0, 3);
        }
    }
}
