package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.inmobiJson.model.AppMetrics;
import com.inmobi.media.ads.network.inmobiJson.model.CTA;
import com.inmobi.media.ads.network.inmobiJson.model.Description;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.Sponsored;
import com.inmobi.media.ads.network.inmobiJson.model.Title;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Dd extends AbstractC4483y implements Bj, Ih, InterfaceC3982f {
    public final MediaView b;
    public final View c;
    public final AbstractC3984f1 d;
    public final C3864ad e;
    public final Rc f;
    public final Wc g;
    public final L4 h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Dd(MediaView mediaView, View view, AbstractC3984f1 adSessionManager, C3864ad nativeBeaconProcessor, Rc nativeAdUnitComponent, Wc stateMachine) {
        super(r0);
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        C4456x c4456x = nativeAdUnitComponent.a;
        this.b = mediaView;
        this.c = view;
        this.d = adSessionManager;
        this.e = nativeBeaconProcessor;
        this.f = nativeAdUnitComponent;
        this.g = stateMachine;
        G g = c4456x.b;
        this.h = new L4(g.h, g.a.a.a);
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        NativeMedia media;
        AppMetrics appMetrics;
        Sponsored sponsored;
        CTA cta;
        Description description;
        Title title;
        Icon icon;
        AppMetrics appMetrics2;
        AppMetrics appMetrics3;
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("NativeLoadedState", "Initialize Called");
        }
        Qc qc = (Qc) this.f.f.getValue();
        Map a = Hk.a(qc.a);
        long j = qc.b.a;
        CoroutineScope coroutineScope = Hl.a;
        a.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("AdLoadSuccessful", a, EnumC4530zk.a);
        this.e.b.b.a(C4052hf.a);
        JsonAssetObject assetsObject = this.f.b.getAssetsObject();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(InMobiNative.APP_INSTALLS, (assetsObject == null || (appMetrics3 = assetsObject.getAppMetrics()) == null) ? null : appMetrics3.getDownloads());
        jSONObject.put(InMobiNative.LIKES, (assetsObject == null || (appMetrics2 = assetsObject.getAppMetrics()) == null) ? null : appMetrics2.getLikes());
        C4261pe pubData = new C4261pe((assetsObject == null || (title = assetsObject.getTitle()) == null) ? null : title.getText(), (assetsObject == null || (description = assetsObject.getDescription()) == null) ? null : description.getText(), new InMobiNativeImage((assetsObject == null || (icon = assetsObject.getIcon()) == null) ? null : icon.getUrl()), (assetsObject == null || (cta = assetsObject.getCta()) == null) ? null : cta.getText(), jSONObject, (assetsObject == null || (sponsored = assetsObject.getSponsored()) == null) ? null : sponsored.getText(), (assetsObject == null || (appMetrics = assetsObject.getAppMetrics()) == null) ? null : appMetrics.getRating(), Intrinsics.areEqual((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), "video"), this.b, this.c);
        Nc nc = this.f.c;
        nc.getClass();
        Intrinsics.checkNotNullParameter(pubData, "pubData");
        Bj bj = nc.c;
        Pd pd = bj instanceof Pd ? (Pd) bj : null;
        if (pd != null) {
            pd.a(pubData);
        }
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    @Override // com.inmobi.media.Ih
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("NativeLoadedState", "registerViewForTracking - parentView: " + inMobiNativeViewData.getParentView() + ", isAttachedToWindow: " + inMobiNativeViewData.getParentView().isAttachedToWindow());
        }
        G g = this.a.b;
        Intrinsics.checkNotNullParameter(g, "<this>");
        Intrinsics.checkNotNullParameter(g, "<this>");
        long timeToLive = g.a.b.getCacheConfig("native").getTimeToLive();
        long j = g.k;
        if (j == -1) {
            j = g.j + TimeUnit.SECONDS.toMillis(timeToLive);
        }
        if (j - System.currentTimeMillis() < 0) {
            InterfaceC4466x9 l2 = l();
            if (l2 != null) {
                ((C4493y9) l2).a("NativeLoadedState", "Ad-Expired");
            }
            Map a = Hk.a(((Qc) this.f.f.getValue()).a);
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("AdExpired", a, EnumC4530zk.a);
        }
        this.h.a();
        C3903c0 c3903c0 = this.a.a.d;
        c3903c0.getClass();
        c3903c0.d = SystemClock.elapsedRealtime();
        this.e.b.d.a(C4052hf.a);
        Map a2 = Hk.a(((Qc) this.f.f.getValue()).a);
        C4425vk c4425vk2 = C4425vk.a;
        C4425vk.b("StartTracking", a2, EnumC4530zk.a);
        this.g.a(new He(new Ie(new Ni(), new C4106jh(inMobiNativeViewData, this.b, this.c), this.h, this.d, this.e, this.f), this.g), this);
    }

    @Override // com.inmobi.media.InterfaceC3982f
    public final Object a(Continuation continuation) {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("NativeLoadedState", "onDestroy");
        }
        Object a = this.g.a(new C4076id(), this, (ContinuationImpl) continuation);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }
}
