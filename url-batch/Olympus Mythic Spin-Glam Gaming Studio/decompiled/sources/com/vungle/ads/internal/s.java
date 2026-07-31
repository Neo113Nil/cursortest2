package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdExpiredOnPlayError;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.AdMarkupJsonError;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.EmptyBidPayloadError;
import com.vungle.ads.InvalidAdStateError;
import com.vungle.ads.InvalidBannerSizeError;
import com.vungle.ads.InvalidCSBDataError;
import com.vungle.ads.PlacementAdTypeMismatchError;
import com.vungle.ads.PlacementNotFoundError;
import com.vungle.ads.SdkNotInitialized;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleCSBData;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;

/* loaded from: classes15.dex */
public abstract class s implements com.vungle.ads.internal.load.a {
    public static final Json p = JsonKt.Json$default(null, i.a, 1, null);
    public final Context a;
    public volatile h b;
    public com.vungle.ads.internal.model.h0 c;
    public i3 d;
    public com.vungle.ads.internal.model.p0 e;
    public com.vungle.ads.internal.load.a f;
    public final Lazy g;
    public com.vungle.ads.internal.load.g h;
    public n2 i;
    public n2 j;
    public final t1 k;
    public final t1 l;
    public com.vungle.ads.internal.util.s m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;

    public s(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = h.a;
        this.g = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new r(context));
        this.k = new t1(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS);
        this.l = new t1(Sdk.SDKMetric.SDKMetricType.AD_VALIDATION_TO_PRESENT_DURATION_MS);
        this.n = new AtomicBoolean(false);
        this.o = new AtomicBoolean(false);
    }

    public final void a(h value) {
        com.vungle.ads.internal.model.h0 h0Var;
        String h;
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.a() && (h0Var = this.c) != null && (h = h0Var.h()) != null) {
            ((com.vungle.ads.internal.task.s) ((com.vungle.ads.internal.task.h) LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new j(this.a)).getValue())).a(com.vungle.ads.internal.task.a.a(h));
        }
        this.b = this.b.b(value);
        com.vungle.ads.internal.util.s sVar = this.m;
        if (sVar == null) {
            return;
        }
        sVar.a(this.b);
    }

    public void a(com.vungle.ads.internal.model.h0 advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
    }

    public abstract boolean a(VungleAdSize vungleAdSize);

    public abstract boolean a(i3 i3Var);

    public abstract VungleAdSize b();

    public void b(com.vungle.ads.internal.model.h0 advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
    }

    public final com.vungle.ads.internal.model.h0 c() {
        return this.c;
    }

    public final Context d() {
        return this.a;
    }

    public final com.vungle.ads.internal.util.s e() {
        return this.m;
    }

    public final i3 f() {
        return this.d;
    }

    public final t1 g() {
        return this.k;
    }

    public final t1 h() {
        return this.l;
    }

    public final boolean i() {
        return this.b == h.d || this.b == h.e;
    }

    public InvalidAdStateError j() {
        if (this.b == h.d) {
            return new InvalidAdStateError(Sdk.SDKError.Reason.AD_IS_PLAYING, "Current ad is playing");
        }
        if (this.b == h.e) {
            return new InvalidAdStateError(Sdk.SDKError.Reason.AD_IS_PLAYING, "Current ad is playing, impression logged");
        }
        if (this.b == h.c) {
            return null;
        }
        return new InvalidAdStateError(Sdk.SDKError.Reason.AD_NOT_LOADED, this.b + " is not READY");
    }

    public final void k() {
        List<String> r;
        if (!this.o.compareAndSet(false, true)) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("AdInternal", "Loss URL already sent, skipping");
            return;
        }
        com.vungle.ads.internal.model.h0 h0Var = this.c;
        if (h0Var == null || (r = h0Var.r()) == null) {
            return;
        }
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new p(this.a));
        for (String str : r) {
            if (com.vungle.ads.internal.util.n.a(str)) {
                ((com.vungle.ads.internal.network.r) lazy.getValue()).a(new com.vungle.ads.internal.network.p(str).d().a(), false);
            } else {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("AdInternal", "Invalid loss URL skipped: " + str);
            }
        }
    }

    public final void l() {
        List<String> w;
        if (!this.n.compareAndSet(false, true)) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("AdInternal", "Win URL already sent, skipping");
            return;
        }
        com.vungle.ads.internal.model.h0 h0Var = this.c;
        if (h0Var == null || (w = h0Var.w()) == null) {
            return;
        }
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new q(this.a));
        for (String str : w) {
            if (com.vungle.ads.internal.util.n.a(str)) {
                ((com.vungle.ads.internal.network.r) lazy.getValue()).a(new com.vungle.ads.internal.network.p(str).d().a(), false);
            } else {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("AdInternal", "Invalid win URL skipped: " + str);
            }
        }
    }

    @Override // com.vungle.ads.internal.load.a
    public final void onFailure(VungleError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a(h.g);
        n2 n2Var = this.j;
        if (n2Var != null) {
            n2Var.a(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS);
            n2Var.d();
            AnalyticsClient.INSTANCE.a(n2Var, this.m, error.getCode() + '-' + error.getErrorMessage());
        }
        com.vungle.ads.internal.load.a aVar = this.f;
        if (aVar != null) {
            aVar.onFailure(error);
        }
    }

    @Override // com.vungle.ads.internal.load.a
    public final void onSuccess(com.vungle.ads.internal.model.h0 advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.c = advertisement;
        a(h.c);
        a(advertisement);
        b(advertisement);
        com.vungle.ads.internal.load.a aVar = this.f;
        if (aVar != null) {
            aVar.onSuccess(advertisement);
        }
        n2 n2Var = this.j;
        if (n2Var != null) {
            if (!advertisement.b()) {
                n2Var.a(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_DURATION_MS);
            }
            n2Var.d();
            AnalyticsClient.a(AnalyticsClient.INSTANCE, n2Var, this.m, 4);
        }
        n2 n2Var2 = this.i;
        if (n2Var2 != null) {
            if (!advertisement.b()) {
                n2Var2.a(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_DURATION_MS);
            }
            n2Var2.d();
            AnalyticsClient.a(AnalyticsClient.INSTANCE, n2Var2, this.m, 4);
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new o(this.a));
            List a = com.vungle.ads.internal.model.h0.a(advertisement, "ad.loadDuration", String.valueOf(n2Var2.c()), 4);
            if (a != null) {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    ((com.vungle.ads.internal.network.r) lazy.getValue()).a(new com.vungle.ads.internal.network.p((String) it.next()).b("ad.loadDuration").a(this.m).a(), false);
                }
            }
        }
    }

    public final VungleError a(boolean z) {
        VungleError adExpiredError;
        com.vungle.ads.internal.model.i k;
        VungleError j = j();
        com.vungle.ads.internal.model.h0 h0Var = this.c;
        if (h0Var == null) {
            j = new AdNotLoadedCantPlay("adv is null on onPlay=" + z);
        } else if (j == null) {
            Integer num = null;
            if (!h0Var.x()) {
                return null;
            }
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Ad expiry: ");
            com.vungle.ads.internal.model.h0 h0Var2 = this.c;
            if (h0Var2 != null && (k = h0Var2.k()) != null) {
                num = k.d;
            }
            a.append(num);
            a.append(", device: ");
            a.append(System.currentTimeMillis());
            String sb = a.toString();
            if (z) {
                adExpiredError = new AdExpiredOnPlayError(sb);
            } else {
                adExpiredError = new AdExpiredError(sb);
            }
            j = adExpiredError;
        }
        if (z) {
            j.setLogEntry$vungle_ads_release(this.m).logErrorNoReturnValue$vungle_ads_release();
        }
        return j;
    }

    public final void a(String placementId, String str, VungleCSBData vungleCSBData, com.vungle.ads.internal.load.a adLoaderCallback) {
        Sdk.SDKError.Reason reason;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adLoaderCallback, "adLoaderCallback");
        com.vungle.ads.internal.util.s sVar = this.m;
        if (sVar != null) {
            sVar.a(this.b);
        }
        AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.LOAD_AD_API, 0L, this.m, null, 10);
        n2 n2Var = new n2(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_ADO_DURATION_MS);
        this.j = n2Var;
        n2Var.e();
        this.f = adLoaderCallback;
        if (!VungleAds.INSTANCE.isInitialized()) {
            adLoaderCallback.onFailure(new SdkNotInitialized("SDK not initialized").setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
            return;
        }
        ConfigManager.INSTANCE.getClass();
        i3 a = ConfigManager.a(placementId);
        if (a != null) {
            this.d = a;
            if (!a(a)) {
                adLoaderCallback.onFailure(new PlacementAdTypeMismatchError(a.b()).setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
                return;
            } else if (a.a() && (str == null || str.length() == 0)) {
                adLoaderCallback.onFailure(new EmptyBidPayloadError(placementId).setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
                return;
            }
        } else if (ConfigManager.a() == -1) {
            a = new i3(placementId);
            this.d = a;
        } else {
            adLoaderCallback.onFailure(new PlacementNotFoundError(placementId).setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
            return;
        }
        VungleAdSize b = b();
        if (!a(b)) {
            adLoaderCallback.onFailure(new InvalidBannerSizeError(b != null ? b.toString() : null).setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
            return;
        }
        if (this.b != h.a) {
            switch (this.b.ordinal()) {
                case 0:
                    throw new NotImplementedError(null, 1, null);
                case 1:
                    reason = Sdk.SDKError.Reason.AD_IS_LOADING;
                    break;
                case 2:
                    reason = Sdk.SDKError.Reason.AD_ALREADY_LOADED;
                    break;
                case 3:
                    reason = Sdk.SDKError.Reason.AD_IS_PLAYING;
                    break;
                case 4:
                    reason = Sdk.SDKError.Reason.AD_IS_PLAYING;
                    break;
                case 5:
                    reason = Sdk.SDKError.Reason.AD_CONSUMED;
                    break;
                case 6:
                    reason = Sdk.SDKError.Reason.AD_ALREADY_FAILED;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            adLoaderCallback.onFailure(new InvalidAdStateError(reason, this.b + " state is incorrect for load").setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
            return;
        }
        n2 n2Var2 = new n2(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS);
        this.i = n2Var2;
        n2Var2.e();
        if (str != null && str.length() != 0) {
            try {
                Json json = p;
                KSerializer serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(com.vungle.ads.internal.model.p0.class));
                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                this.e = (com.vungle.ads.internal.model.p0) json.decodeFromString(serializer, str);
            } catch (IllegalArgumentException e) {
                StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Unable to decode payload into BidPayload object. Error: ");
                a2.append(e.getLocalizedMessage());
                adLoaderCallback.onFailure(new AdMarkupInvalidError(a2.toString()).setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
                return;
            } catch (Throwable th) {
                adLoaderCallback.onFailure(new AdMarkupJsonError(th.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
                return;
            }
        }
        a(h.b);
        Context context = this.a;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, new k(context));
        Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, new l(this.a));
        Lazy lazy3 = LazyKt.lazy(lazyThreadSafetyMode, new m(this.a));
        Lazy lazy4 = LazyKt.lazy(lazyThreadSafetyMode, new n(this.a));
        if (vungleCSBData != null) {
            double bidFloor = vungleCSBData.getBidFloor();
            InvalidCSBDataError invalidCSBDataError = bidFloor < 0.0d ? new InvalidCSBDataError("bidFloor must be >= 0, got: " + bidFloor) : null;
            if (invalidCSBDataError == null) {
                int phase = vungleCSBData.getPhase();
                invalidCSBDataError = (1 > phase || phase >= 3) ? new InvalidCSBDataError("phase must be 1 or 2, got: " + phase) : null;
                if (invalidCSBDataError == null) {
                    invalidCSBDataError = vungleCSBData.getAuctionId().length() > 500 ? new InvalidCSBDataError("auctionId exceeds maximum length of 500") : null;
                    if (invalidCSBDataError == null) {
                        invalidCSBDataError = vungleCSBData.getCreativeId().length() > 500 ? new InvalidCSBDataError("creativeId exceeds maximum length of 500") : null;
                        if (invalidCSBDataError == null) {
                            invalidCSBDataError = vungleCSBData.getAdUnitId().length() > 500 ? new InvalidCSBDataError("adUnitId exceeds maximum length of 500") : null;
                        }
                    }
                    if (invalidCSBDataError == null) {
                        Map<String, String> extras = vungleCSBData.getExtras();
                        if (extras != null) {
                            if (extras.size() > 50) {
                                StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("extras map exceeds maximum of 50 entries, got: ");
                                a3.append(extras.size());
                                invalidCSBDataError = new InvalidCSBDataError(a3.toString());
                            } else {
                                for (Map.Entry<String, String> entry : extras.entrySet()) {
                                    String key = entry.getKey();
                                    String value = entry.getValue();
                                    if (key.length() == 0) {
                                        invalidCSBDataError = new InvalidCSBDataError("extras contains empty key");
                                        break;
                                    }
                                    if (key.length() > 100) {
                                        invalidCSBDataError = new InvalidCSBDataError(com.iab.omid.library.vungle.d.a("extras key exceeds maximum length of 100: ", key));
                                        break;
                                    } else if (value.length() > 500) {
                                        invalidCSBDataError = new InvalidCSBDataError("extras value for key '" + key + "' exceeds maximum length of 500");
                                        break;
                                    }
                                }
                            }
                        }
                        invalidCSBDataError = null;
                    }
                }
            }
            if (invalidCSBDataError != null) {
                adLoaderCallback.onFailure(invalidCSBDataError.setLogEntry$vungle_ads_release(this.m).logError$vungle_ads_release());
                return;
            }
            com.vungle.ads.internal.util.s sVar2 = this.m;
            if (sVar2 != null) {
                sVar2.a(vungleCSBData.getPhase() == 2 ? 4L : 3L);
            }
            this.h = new com.vungle.ads.internal.load.h(this.a, (VungleApiClient) this.g.getValue(), (com.vungle.ads.internal.executor.d) lazy2.getValue(), (com.vungle.ads.internal.omsdk.c) lazy.getValue(), (com.vungle.ads.internal.downloader.m) lazy4.getValue(), (PathProvider) lazy3.getValue(), new com.vungle.ads.internal.load.b(a, null, b, vungleCSBData));
        } else if (str == null || str.length() == 0) {
            com.vungle.ads.internal.util.s sVar3 = this.m;
            if (sVar3 != null) {
                sVar3.a((Long) 1L);
            }
            this.h = new com.vungle.ads.internal.load.j(this.a, (VungleApiClient) this.g.getValue(), (com.vungle.ads.internal.executor.d) lazy2.getValue(), (com.vungle.ads.internal.omsdk.c) lazy.getValue(), (com.vungle.ads.internal.downloader.m) lazy4.getValue(), (PathProvider) lazy3.getValue(), new com.vungle.ads.internal.load.b(a, null, b, null));
        } else {
            com.vungle.ads.internal.util.s sVar4 = this.m;
            if (sVar4 != null) {
                sVar4.a((Long) 2L);
            }
            this.h = new com.vungle.ads.internal.load.n(this.a, (VungleApiClient) this.g.getValue(), (com.vungle.ads.internal.executor.d) lazy2.getValue(), (com.vungle.ads.internal.omsdk.c) lazy.getValue(), (com.vungle.ads.internal.downloader.m) lazy4.getValue(), (PathProvider) lazy3.getValue(), new com.vungle.ads.internal.load.b(a, this.e, b, null));
        }
        com.vungle.ads.internal.load.g gVar = this.h;
        if (gVar != null) {
            gVar.a(this.m);
        }
        com.vungle.ads.internal.load.g gVar2 = this.h;
        if (gVar2 != null) {
            gVar2.a(this);
        }
    }

    public final void a() {
        com.vungle.ads.internal.model.h0 h0Var = this.c;
        if (h0Var != null && h0Var.B()) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("AdInternal", "Skip cancelling download for ads with partial download enabled.");
        } else {
            com.vungle.ads.internal.load.g gVar = this.h;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    public final boolean a(int i) {
        return this.b == h.c && i == 304;
    }
}
