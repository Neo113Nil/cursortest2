package com.vungle.ads;

import android.content.Context;
import android.os.Handler;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.Bd;
import com.ironsource.Zf;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.vungle.ads.internal.ServiceLocator;
import com.vungle.ads.internal.load.a;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.l;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.m;
import com.vungle.ads.internal.t1;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.y;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0017\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u000e\u0012\u0006\u00102\u001a\u00020-¢\u0006\u0004\b{\u0010|J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H ¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0006\u0010!\u001a\u00020 J\u0006\u0010\"\u001a\u00020\fJ\u0006\u0010#\u001a\u00020\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010,\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001b\u0010?\u001a\u00020\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010CR\u001a\u0010J\u001a\u00020E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010P\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010S\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010OR\u001a\u0010V\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010M\u001a\u0004\bU\u0010OR\u001a\u0010Y\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010M\u001a\u0004\bX\u0010OR\u001a\u0010_\u001a\u00020Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010b\u001a\u00020Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010\\\u001a\u0004\ba\u0010^R\u001a\u0010e\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bc\u0010M\u001a\u0004\bd\u0010OR$\u0010m\u001a\u0004\u0018\u00010f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR(\u0010q\u001a\u0004\u0018\u00010\u000e2\b\u0010n\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bo\u0010)\u001a\u0004\bp\u0010+R(\u0010t\u001a\u0004\u0018\u00010\u000e2\b\u0010n\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\br\u0010)\u001a\u0004\bs\u0010+R.\u0010z\u001a\u0004\u0018\u00010\u000e2\b\u0010u\u001a\u0004\u0018\u00010\u000e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bv\u0010)\u001a\u0004\bw\u0010+\"\u0004\bx\u0010y¨\u0006}"}, d2 = {"Lcom/vungle/ads/BaseAd;", "Lcom/vungle/ads/Ad;", "Lcom/vungle/ads/VungleAdType;", "Landroid/content/Context;", "context", "Lcom/vungle/ads/internal/s;", "constructAdInternal$vungle_ads_release", "(Landroid/content/Context;)Lcom/vungle/ads/internal/s;", "constructAdInternal", "", "canPlayAd", "()Ljava/lang/Boolean;", "", "load", "", "adMarkup", "Lcom/vungle/ads/internal/model/h0;", "advertisement", "onAdLoaded$vungle_ads_release", "(Lcom/vungle/ads/internal/model/h0;)V", Zf.j, "baseAd", "onLoadSuccess$vungle_ads_release", "(Lcom/vungle/ads/BaseAd;Ljava/lang/String;)V", Bd.f, "Lcom/vungle/ads/VungleError;", "vungleError", "onLoadFailure$vungle_ads_release", "(Lcom/vungle/ads/BaseAd;Lcom/vungle/ads/VungleError;)V", "onLoadFailure", "Lcom/vungle/ads/VungleCSBData;", "csbData", "", "getWinningPrice", "sendWinURL", "sendLossURL", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getPlacementId", "()Ljava/lang/String;", "placementId", "Lcom/vungle/ads/AdConfig;", "c", "Lcom/vungle/ads/AdConfig;", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "adConfig", "Lcom/vungle/ads/BaseAdListener;", "d", "Lcom/vungle/ads/BaseAdListener;", "getAdListener", "()Lcom/vungle/ads/BaseAdListener;", "setAdListener", "(Lcom/vungle/ads/BaseAdListener;)V", "adListener", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lkotlin/Lazy;", "getAdInternal$vungle_ads_release", "()Lcom/vungle/ads/internal/s;", "adInternal", "Lcom/vungle/ads/internal/signals/j;", InneractiveMediationDefs.GENDER_FEMALE, "getSignalManager$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/j;", "signalManager", "Lcom/vungle/ads/internal/util/s;", "g", "Lcom/vungle/ads/internal/util/s;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/s;", "logEntry", "Lcom/vungle/ads/internal/t1;", "h", "Lcom/vungle/ads/internal/t1;", "getResponseToShowMetric$vungle_ads_release", "()Lcom/vungle/ads/internal/t1;", "responseToShowMetric", "i", "getPresentToDisplayMetric$vungle_ads_release", "presentToDisplayMetric", j.b, "getShowToFailMetric$vungle_ads_release", "showToFailMetric", CampaignEx.JSON_KEY_AD_K, "getDisplayToClickMetric$vungle_ads_release", "displayToClickMetric", "Lcom/vungle/ads/internal/m2;", "l", "Lcom/vungle/ads/internal/m2;", "getLeaveApplicationMetric$vungle_ads_release", "()Lcom/vungle/ads/internal/m2;", "leaveApplicationMetric", "m", "getRewardedMetric$vungle_ads_release", "rewardedMetric", "n", "getShowToCloseMetric$vungle_ads_release", "showToCloseMetric", "Lcom/vungle/ads/internal/signals/m;", "o", "Lcom/vungle/ads/internal/signals/m;", "getSignaledAd$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/m;", "setSignaledAd$vungle_ads_release", "(Lcom/vungle/ads/internal/signals/m;)V", "signaledAd", "<set-?>", "p", "getCreativeId", "creativeId", CampaignEx.JSON_KEY_AD_Q, "getEventId", "eventId", "value", "r", "getAdapterAdFormat", "setAdapterAdFormat", "(Ljava/lang/String;)V", "adapterAdFormat", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes13.dex */
public abstract class BaseAd implements Ad, VungleAdType {

    /* renamed from: a, reason: from kotlin metadata */
    public final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    public final String placementId;

    /* renamed from: c, reason: from kotlin metadata */
    public final AdConfig adConfig;

    /* renamed from: d, reason: from kotlin metadata */
    public BaseAdListener adListener;

    /* renamed from: e, reason: from kotlin metadata */
    public final Lazy adInternal;

    /* renamed from: f, reason: from kotlin metadata */
    public final Lazy signalManager;

    /* renamed from: g, reason: from kotlin metadata */
    public final s logEntry;

    /* renamed from: h, reason: from kotlin metadata */
    public final t1 responseToShowMetric;

    /* renamed from: i, reason: from kotlin metadata */
    public final t1 presentToDisplayMetric;

    /* renamed from: j, reason: from kotlin metadata */
    public final t1 showToFailMetric;

    /* renamed from: k, reason: from kotlin metadata */
    public final t1 displayToClickMetric;

    /* renamed from: l, reason: from kotlin metadata */
    public final m2 leaveApplicationMetric;

    /* renamed from: m, reason: from kotlin metadata */
    public final m2 rewardedMetric;

    /* renamed from: n, reason: from kotlin metadata */
    public final t1 showToCloseMetric;

    /* renamed from: o, reason: from kotlin metadata */
    public m signaledAd;

    /* renamed from: p, reason: from kotlin metadata */
    public String creativeId;

    /* renamed from: q, reason: from kotlin metadata */
    public String eventId;

    /* renamed from: r, reason: from kotlin metadata */
    public String adapterAdFormat;

    public BaseAd(@NotNull final Context context, @NotNull String placementId, @NotNull AdConfig adConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        this.context = context;
        this.placementId = placementId;
        this.adConfig = adConfig;
        this.adInternal = LazyKt.lazy(new Function0() { // from class: com.vungle.ads.BaseAd$adInternal$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final com.vungle.ads.internal.s mo4828invoke() {
                BaseAd baseAd = BaseAd.this;
                com.vungle.ads.internal.s constructAdInternal$vungle_ads_release = baseAd.constructAdInternal$vungle_ads_release(baseAd.getContext());
                constructAdInternal$vungle_ads_release.m = BaseAd.this.getLogEntry();
                return constructAdInternal$vungle_ads_release;
            }
        });
        this.signalManager = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.vungle.ads.BaseAd$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.j, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final com.vungle.ads.internal.signals.j mo4828invoke() {
                return ServiceLocator.d.a(context).getService(com.vungle.ads.internal.signals.j.class);
            }
        });
        s sVar = new s();
        sVar.g(placementId);
        this.logEntry = sVar;
        this.responseToShowMetric = new t1(Sdk.SDKMetric.SDKMetricType.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.presentToDisplayMetric = new t1(Sdk.SDKMetric.SDKMetricType.AD_PRESENT_TO_DISPLAY_DURATION_MS);
        this.showToFailMetric = new t1(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_FAIL_DURATION_MS);
        this.displayToClickMetric = new t1(Sdk.SDKMetric.SDKMetricType.AD_DISPLAY_TO_CLICK_DURATION_MS);
        this.leaveApplicationMetric = new m2(Sdk.SDKMetric.SDKMetricType.AD_LEAVE_APPLICATION);
        this.rewardedMetric = new m2(Sdk.SDKMetric.SDKMetricType.AD_REWARD_USER);
        this.showToCloseMetric = new t1(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_CLOSE_DURATION_MS);
    }

    @Override // com.vungle.ads.Ad
    @NotNull
    public Boolean canPlayAd() {
        com.vungle.ads.internal.s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        Json json = com.vungle.ads.internal.s.p;
        return Boolean.valueOf(adInternal$vungle_ads_release.a(false) == null);
    }

    @NotNull
    public abstract com.vungle.ads.internal.s constructAdInternal$vungle_ads_release(@NotNull Context context);

    @NotNull
    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    @NotNull
    public final com.vungle.ads.internal.s getAdInternal$vungle_ads_release() {
        return (com.vungle.ads.internal.s) this.adInternal.getValue();
    }

    @Nullable
    public final BaseAdListener getAdListener() {
        return this.adListener;
    }

    @Override // com.vungle.ads.VungleAdType
    @Nullable
    public String getAdapterAdFormat() {
        return this.adapterAdFormat;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final String getCreativeId() {
        return this.creativeId;
    }

    @NotNull
    /* renamed from: getDisplayToClickMetric$vungle_ads_release, reason: from getter */
    public final t1 getDisplayToClickMetric() {
        return this.displayToClickMetric;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    /* renamed from: getLeaveApplicationMetric$vungle_ads_release, reason: from getter */
    public final m2 getLeaveApplicationMetric() {
        return this.leaveApplicationMetric;
    }

    @NotNull
    /* renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final s getLogEntry() {
        return this.logEntry;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @NotNull
    /* renamed from: getPresentToDisplayMetric$vungle_ads_release, reason: from getter */
    public final t1 getPresentToDisplayMetric() {
        return this.presentToDisplayMetric;
    }

    @NotNull
    /* renamed from: getResponseToShowMetric$vungle_ads_release, reason: from getter */
    public final t1 getResponseToShowMetric() {
        return this.responseToShowMetric;
    }

    @NotNull
    /* renamed from: getRewardedMetric$vungle_ads_release, reason: from getter */
    public final m2 getRewardedMetric() {
        return this.rewardedMetric;
    }

    @NotNull
    /* renamed from: getShowToCloseMetric$vungle_ads_release, reason: from getter */
    public final t1 getShowToCloseMetric() {
        return this.showToCloseMetric;
    }

    @NotNull
    /* renamed from: getShowToFailMetric$vungle_ads_release, reason: from getter */
    public final t1 getShowToFailMetric() {
        return this.showToFailMetric;
    }

    @NotNull
    public final com.vungle.ads.internal.signals.j getSignalManager$vungle_ads_release() {
        return (com.vungle.ads.internal.signals.j) this.signalManager.getValue();
    }

    @Nullable
    /* renamed from: getSignaledAd$vungle_ads_release, reason: from getter */
    public final m getSignaledAd() {
        return this.signaledAd;
    }

    public final double getWinningPrice() {
        l lVar;
        h0 h0Var = getAdInternal$vungle_ads_release().c;
        if (h0Var != null) {
            com.vungle.ads.internal.model.s i = h0Var.i();
            Double d = (i == null || (lVar = i.c) == null) ? null : lVar.a;
            if (d != null) {
                return d.doubleValue();
            }
        }
        return 0.0d;
    }

    @Override // com.vungle.ads.Ad
    public void load() {
        load((String) null);
    }

    public void onAdLoaded$vungle_ads_release(@NotNull h0 advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        advertisement.a(this.adConfig);
        this.creativeId = advertisement.n();
        String h = advertisement.h();
        this.eventId = h;
        m mVar = this.signaledAd;
        if (mVar == null) {
            return;
        }
        mVar.a(h);
    }

    public void onLoadFailure$vungle_ads_release(@NotNull BaseAd baseAd, @NotNull final VungleError vungleError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(vungleError, "vungleError");
        this.responseToShowMetric.e();
        Handler handler = y.a;
        y.a(new Function0() { // from class: com.vungle.ads.BaseAd$onLoadFailure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                BaseAdListener adListener = BaseAd.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToLoad(BaseAd.this, vungleError);
                }
            }
        });
    }

    public void onLoadSuccess$vungle_ads_release(@NotNull BaseAd baseAd, @Nullable String adMarkup) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        this.responseToShowMetric.e();
        Handler handler = y.a;
        y.a(new Function0() { // from class: com.vungle.ads.BaseAd$onLoadSuccess$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                BaseAdListener adListener = BaseAd.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdLoaded(BaseAd.this);
                }
            }
        });
    }

    public final void sendLossURL() {
        getAdInternal$vungle_ads_release().k();
    }

    public final void sendWinURL() {
        getAdInternal$vungle_ads_release().l();
    }

    public final void setAdListener(@Nullable BaseAdListener baseAdListener) {
        this.adListener = baseAdListener;
    }

    @Override // com.vungle.ads.VungleAdType
    public void setAdapterAdFormat(@Nullable String str) {
        this.adapterAdFormat = str;
        this.logEntry.m = str;
    }

    public final void setSignaledAd$vungle_ads_release(@Nullable m mVar) {
        this.signaledAd = mVar;
    }

    @Override // com.vungle.ads.Ad
    public void load(@Nullable final String adMarkup) {
        getAdInternal$vungle_ads_release().a(this.placementId, adMarkup, null, new a() { // from class: com.vungle.ads.BaseAd$load$1
            @Override // com.vungle.ads.internal.load.a
            public void onFailure(@NotNull VungleError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, error);
            }

            @Override // com.vungle.ads.internal.load.a
            public void onSuccess(@NotNull h0 advertisement) {
                Intrinsics.checkNotNullParameter(advertisement, "advertisement");
                BaseAd.this.onAdLoaded$vungle_ads_release(advertisement);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, adMarkup);
            }
        });
    }

    @Override // com.vungle.ads.Ad
    public void load(@NotNull VungleCSBData csbData) {
        Intrinsics.checkNotNullParameter(csbData, "csbData");
        getAdInternal$vungle_ads_release().a(this.placementId, null, csbData, new a() { // from class: com.vungle.ads.BaseAd$load$2
            @Override // com.vungle.ads.internal.load.a
            public void onFailure(@NotNull VungleError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, error);
            }

            @Override // com.vungle.ads.internal.load.a
            public void onSuccess(@NotNull h0 advertisement) {
                Intrinsics.checkNotNullParameter(advertisement, "advertisement");
                BaseAd.this.onAdLoaded$vungle_ads_release(advertisement);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, null);
            }
        });
    }
}
