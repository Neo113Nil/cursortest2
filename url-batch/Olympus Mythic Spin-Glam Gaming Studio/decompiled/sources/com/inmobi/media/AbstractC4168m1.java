package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsClient;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.Partner;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.inmobi.media.ads.network.common.model.LandingPageParam;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import com.inmobi.media.ads.network.common.model.Viewability;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.m1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4168m1 extends AbstractC4528zi implements J2, Lk, InterfaceC4457x0, Qo {
    public static final /* synthetic */ int E = 0;
    public WatermarkData A;
    public final Lazy B;
    public boolean C;
    public final Lazy D;
    public final String a;
    public volatile byte b;
    public final AdConfig c;
    public WeakReference d;
    public TimeoutConfigurations e;
    public WeakReference f;
    public final Ka g;
    public CopyOnWriteArrayList h;
    public C4493y9 i;
    public Handler j;
    public boolean k;
    public C4431w0 l;
    public AdResponse m;
    public Nk n;
    public int o;
    public int p;
    public long q;
    public final TreeSet r;
    public boolean s;
    public String t;
    public C3877b0 u;
    public C4309ra v;
    public Ac w;
    public final Handler x;
    public final LinkedHashMap y;
    public final C4326s1 z;

    public AbstractC4168m1(Context context, C4431w0 adPlacement, AbstractC3924cl abstractC3924cl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.a = uuid;
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        this.c = (AdConfig) AbstractC4015g4.a.a(AdConfig.class);
        this.g = (Ka) La.a.getValue();
        this.h = new CopyOnWriteArrayList();
        this.l = adPlacement;
        this.q = -1L;
        this.r = new TreeSet();
        this.x = new Handler(Looper.getMainLooper());
        this.y = new LinkedHashMap();
        this.z = new C4326s1(this);
        this.B = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.m1$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return AbstractC4168m1.d(AbstractC4168m1.this);
            }
        });
        this.d = new WeakReference(context);
        this.f = new WeakReference(abstractC3924cl);
        Nb nb = AbstractC3869ai.a;
        AbstractC3869ai.a(abstractC3924cl, this.i);
        WeakReference weakReference = this.f;
        String m = m();
        AdSet s = s();
        this.u = new C3877b0(weakReference, m, s != null ? s.getIsRewarded() : false);
        M();
        this.D = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.m1$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return AbstractC4168m1.e(AbstractC4168m1.this);
            }
        });
    }

    public static final void c(AbstractC4168m1 abstractC4168m1) {
        AdConfig.OmidConfig omidConfig;
        Sf sf = Rf.a;
        Context o = abstractC4168m1.o();
        AdConfig adConfig = abstractC4168m1.c;
        sf.getClass();
        try {
            if (!Omid.isActive()) {
                Omid.activate(o);
                return;
            }
            if (adConfig != null) {
                try {
                    AdConfig.ViewabilityConfig viewability = adConfig.getViewability();
                    if (viewability != null) {
                        omidConfig = viewability.getOmidConfig();
                        if (omidConfig == null) {
                        }
                        sf.b = Partner.createPartner(omidConfig.getPartnerKey(), sf.a());
                    }
                } catch (Exception e) {
                    Lazy lazy = AbstractC3861aa.a;
                    AbstractC3861aa.a(new Q2(e));
                    return;
                }
            }
            omidConfig = new AdConfig.OmidConfig();
            sf.b = Partner.createPartner(omidConfig.getPartnerKey(), sf.a());
        } catch (Exception e2) {
            Lazy lazy2 = AbstractC3861aa.a;
            AbstractC4361t9.a(e2);
        }
    }

    public static final Jo d(AbstractC4168m1 abstractC4168m1) {
        return new Jo(abstractC4168m1.i);
    }

    public final boolean A() {
        AdConfig.CacheConfig cacheConfig;
        C4493y9 c4493y9;
        com.inmobi.media.ads.network.common.model.Ad b = b(0);
        if (b == null) {
            return false;
        }
        AdConfig adConfig = this.c;
        if (adConfig != null && (cacheConfig = adConfig.getCacheConfig(m())) != null) {
            r0 = ((b.getExpiryTimestampInMillis() > (-1L) ? 1 : (b.getExpiryTimestampInMillis() == (-1L) ? 0 : -1)) == 0 ? TimeUnit.SECONDS.toMillis(cacheConfig.getTimeToLive()) + b.getInsertionTimestampInMillis() : b.getExpiryTimestampInMillis()) - System.currentTimeMillis() < 0;
            if (r0 && (c4493y9 = this.i) != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y9.b("m1", "Top ad has expired, failing show of ad.");
            }
        }
        return r0;
    }

    public final void B() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "initTelemetry " + this);
        }
        this.y.put("AdImpressionSuccessful", this.z);
    }

    public final boolean C() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "isBlockingStateForLoadWithResponse getter " + this + " state=" + ((int) this.b));
        }
        if (!AbstractC3962e7.a()) {
            d();
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), true, (short) 2141);
            return true;
        }
        if (F()) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y92.b("m1", "Some of the dependency libraries for " + m() + " not found");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return true;
        }
        byte b = this.b;
        if (b == 1) {
            C4493y9 c4493y93 = this.i;
            if (c4493y93 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y93.b("m1", "load with reasponse called while loading");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (short) 2001);
            return true;
        }
        if (b != 7) {
            return false;
        }
        C4493y9 c4493y94 = this.i;
        if (c4493y94 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y94.b("m1", "ad active before load");
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2003);
        return true;
    }

    public void D() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "load  " + this);
        }
        C4326s1 c4326s1 = this.z;
        c4326s1.getClass();
        c4326s1.c = SystemClock.elapsedRealtime();
        a(new Function0() { // from class: com.inmobi.media.m1$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return AbstractC4168m1.a(AbstractC4168m1.this);
            }
        }, new Function1() { // from class: com.inmobi.media.m1$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC4168m1.a(AbstractC4168m1.this, (EnumC4069i6) obj);
            }
        });
    }

    public final void E() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "makeUnitActive " + this);
        }
        this.k = false;
    }

    public boolean F() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "missingPrerequisitesForAd " + this);
        }
        try {
            Reflection.getOrCreateKotlinClass(CustomTabsClient.class).getSimpleName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public void G() {
        MetaInfo metaInfo;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "onDidParseAfterFetch " + this);
        }
        if (this.l.j) {
            int i = 0;
            com.inmobi.media.ads.network.common.model.Ad b = b(0);
            if (b != null && (metaInfo = b.getMetaInfo()) != null) {
                i = metaInfo.getCrH();
            }
            Pair b2 = b(this.l.i);
            Pair b3 = b(this.l.h);
            if (i > 0 && b2 != null) {
                C4431w0 c4431w0 = this.l;
                String str = b2.getFirst() + VastAttributes.HORIZONTAL_POSITION + Math.min(((Number) b2.getSecond()).intValue(), i);
                c4431w0.getClass();
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                c4431w0.i = str;
            } else if (b3 != null) {
                C4431w0 c4431w02 = this.l;
                String str2 = b3.getFirst() + VastAttributes.HORIZONTAL_POSITION + b3.getSecond();
                c4431w02.getClass();
                Intrinsics.checkNotNullParameter(str2, "<set-?>");
                c4431w02.i = str2;
            }
        }
        c((byte) 2);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.inmobi.media.m1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC4168m1.c(AbstractC4168m1.this);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        if (com.inmobi.media.AbstractC4002fj.f != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Ze H() {
        boolean z;
        Integer num;
        Integer num2;
        Integer num3;
        AdConfig.RenderingConfig rendering;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "prepareAdRequest " + this);
        }
        Context o = o();
        C4367tf c4367tf = o != null ? new C4367tf(o, this.i) : null;
        String str = this.l.g;
        Intrinsics.checkNotNull(str);
        this.l.getClass();
        C4431w0 c4431w0 = this.l;
        Map map = c4431w0.c;
        long j = c4431w0.a;
        String str2 = c4431w0.k;
        String m = m();
        HashMap l = l();
        String str3 = this.l.d;
        AdConfig adConfig = this.c;
        if (adConfig != null && (rendering = adConfig.getRendering()) != null) {
            z = true;
            if (rendering.getEnablePubMuteControl()) {
            }
        }
        z = false;
        C4194n0 c4194n0 = new C4194n0(str, map, j, str2, m, l, str3, z);
        Ac ac = this.w;
        int i = 15000;
        long intValue = (ac == null || (num3 = ac.d) == null) ? 15000 : num3.intValue();
        Ac ac2 = this.w;
        long intValue2 = (ac2 == null || (num2 = ac2.d) == null) ? 15000 : num2.intValue();
        Ac ac3 = this.w;
        if (ac3 != null && (num = ac3.d) != null) {
            i = num.intValue();
        }
        Ok ok = new Ok(intValue, intValue2, i);
        AdConfig adConfig2 = this.c;
        String url = adConfig2 != null ? adConfig2.getUrl() : null;
        AdConfig adConfig3 = this.c;
        Intrinsics.checkNotNull(adConfig3);
        Zk zk = new Zk(adConfig3.getIncludeIds());
        C4314rf a = c4367tf != null ? c4367tf.a() : null;
        C4493y9 c4493y92 = this.i;
        AdConfig adConfig4 = this.c;
        return new C4247p0(url, zk, c4194n0, ok, a, c4493y92, adConfig4 != null ? adConfig4.getApplyGzipReq() : false).a();
    }

    public final void I() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "printPublisherTestId " + this);
        }
        Yk.b();
    }

    public void J() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "resetContainersForNextAd " + this);
        }
        int size = this.h.size();
        int i = this.p;
        if (size <= i || this.h.get(i) == null) {
            return;
        }
        a(this.p, false);
    }

    public final void K() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.d("m1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 1);
    }

    public void L() {
        Intrinsics.checkNotNullParameter("activity", "monetizationContext");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "setMonetizationContext " + this);
        }
        C4431w0 c4431w0 = this.l;
        c4431w0.getClass();
        Intrinsics.checkNotNullParameter("activity", "<set-?>");
        c4431w0.k = "activity";
    }

    public final void M() {
        Intrinsics.checkNotNullExpressionValue("m1", "TAG");
        toString();
        this.e = z();
        c((byte) 0);
        this.j = new Handler(Looper.getMainLooper());
        this.n = new Nk(this);
    }

    public final boolean N() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "shouldBlockLoadAd " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(0);
        if (b != null && 4 == this.b && !A()) {
            AbstractC4038h1 n = n();
            if (n != null) {
                C4493y9 c4493y92 = this.i;
                if (c4493y92 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                    c4493y92.a("m1", "ad is ready - load success");
                }
                d(n);
            } else {
                c((short) 2188);
            }
            return true;
        }
        if (b == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2131);
            C4493y9 c4493y93 = this.i;
            if (c4493y93 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y93.b("m1", "ad no longer available");
            }
            return true;
        }
        if (2 == this.b) {
            if (!A()) {
                return false;
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2133);
            C4493y9 c4493y94 = this.i;
            if (c4493y94 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y94.b("m1", "ad is expired");
            }
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2132);
        C4493y9 c4493y95 = this.i;
        if (c4493y95 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y95.b("m1", "ad no longer available. state - " + ((int) this.b));
        }
        return true;
    }

    public final void O() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad;
        int i;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "startLoadingHTMLAd " + this);
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = null;
        try {
            AdSet s = s();
            com.inmobi.media.ads.network.common.model.Ad ad2 = (s == null || (i = this.o) < 0 || i >= s.getAds().size()) ? null : s.getAds().get(this.o);
            d(this.o);
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                AdSet s2 = s();
                c4493y92.a("m1", "Loading ad with impressionId : " + ((s2 == null || (ads = s2.getAds()) == null || (ad = ads.get(this.o)) == null) ? null : ad.getImpressionId()));
            }
            GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi2 = (GestureDetectorOnGestureListenerC4476xi) this.h.get(this.o);
            if (ad2 != null) {
                Xg pubContent = ad2.getPubContent();
                if (pubContent instanceof C3911c8) {
                    C4493y9 c4493y93 = this.i;
                    if (c4493y93 != null) {
                        Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                        c4493y93.a("m1", "Loading HTML content into WebView");
                    }
                    if (gestureDetectorOnGestureListenerC4476xi2 != null) {
                        gestureDetectorOnGestureListenerC4476xi2.i(((C3911c8) pubContent).a);
                    }
                } else if (pubContent instanceof C3937d8) {
                    String obj = StringsKt.trim(((C3937d8) pubContent).a).toString();
                    C4493y9 c4493y94 = this.i;
                    if (c4493y94 != null) {
                        Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                        c4493y94.a("m1", "Loading HTML URL into WebView");
                    }
                    if (gestureDetectorOnGestureListenerC4476xi2 != null) {
                        gestureDetectorOnGestureListenerC4476xi2.a(obj, this.c.getRendering().getEnableHtmlUrlPrefetch());
                    }
                }
            }
            if (gestureDetectorOnGestureListenerC4476xi2 == null || !Intrinsics.areEqual(t(), "htmlUrl")) {
                return;
            }
            k(gestureDetectorOnGestureListenerC4476xi2);
        } catch (Exception e) {
            C4493y9 c4493y95 = this.i;
            if (c4493y95 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y95.a("m1", "Loading ad markup into container encountered an unexpected error: " + e.getMessage());
            }
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
            int i2 = this.o;
            if (i2 >= 0 && i2 < this.h.size()) {
                gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) this.h.get(this.o);
            }
            a(gestureDetectorOnGestureListenerC4476xi, (short) 2135, e((short) 2135));
        }
    }

    public final void P() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "submitAdLoadCalled " + this);
        }
        HashMap hashMap = new HashMap();
        c(hashMap);
        c("AdLoadCalled", hashMap);
    }

    public final void Q() {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "submitAdLoadSuccessfulEvent ADunit markuptype : " + t() + " " + this);
        }
        HashMap hashMap = new HashMap();
        long j = this.z.c;
        CoroutineScope coroutineScope = Hl.a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad p = p();
        if (p == null || (str = p.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad p2 = p();
        if (p2 != null && (metaInfo = p2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        C4309ra c4309ra = this.v;
        if (c4309ra != null) {
            hashMap.put("retryCount", Integer.valueOf(c4309ra.b));
        }
        AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        c("AdLoadSuccessful", hashMap);
    }

    public final void R() {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "submitAdShowCalled " + this);
        }
        C4326s1 c4326s1 = this.z;
        c4326s1.getClass();
        c4326s1.f = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        long j = this.z.i;
        CoroutineScope coroutineScope = Hl.a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null && (metaInfo = q2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        c("AdShowCalled", hashMap);
    }

    public final void S() {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "submitAdShowSuccess " + this);
        }
        HashMap hashMap = new HashMap();
        long j = this.z.f;
        CoroutineScope coroutineScope = Hl.a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null && (metaInfo = q2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        c("AdShowSuccessful", hashMap);
    }

    public final void T() {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "submitRenderSuccessEvent ADunit markuptype : " + t() + " " + this);
        }
        HashMap hashMap = new HashMap();
        long j = this.z.g;
        CoroutineScope coroutineScope = Hl.a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null && (metaInfo = q2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        C4309ra c4309ra = this.v;
        if (c4309ra != null) {
            hashMap.put("retryCount", Integer.valueOf(c4309ra.b));
        }
        hashMap.put("plType", Byte.valueOf(u()));
        AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        a(q(), hashMap);
        c("RenderSuccess", hashMap);
    }

    public final long U() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "timeSincePodShow " + this);
        }
        if (this.s) {
            return System.currentTimeMillis() - this.q;
        }
        return -1L;
    }

    public final void V() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.b("m1", "ad unloaded with current state - " + ((int) this.b));
        }
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y92.d("m1", "AdUnit " + this + " state - UNLOADED");
        }
        c((byte) 8);
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public void a(GestureDetectorOnGestureListenerC4476xi renderView, boolean z) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "onRenderProcessGone didCrash=" + z + " state=" + ((int) this.b));
        }
        byte b = this.b;
        if (b == 0) {
            short s = z ? (short) 2214 : (short) 2213;
            K();
            renderView.a(z, s);
            return;
        }
        if (b == 1) {
            short s2 = z ? (short) 2216 : (short) 2215;
            K();
            c(s2);
            AbstractC4038h1 n = n();
            if (n != null) {
                n.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b == 3) {
            renderView.a(z, z ? (short) 2226 : (short) 2225);
            return;
        }
        if (b == 2) {
            K();
            c(z ? (short) 2218 : (short) 2217);
            AbstractC4038h1 n2 = n();
            if (n2 != null) {
                n2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b == 4 || b == 6 || b == 7 || b != 8) {
            return;
        }
        renderView.a(z, z ? (short) 2240 : (short) 2241);
    }

    public final com.inmobi.media.ads.network.common.model.Ad b(int i) {
        Iterable emptyList;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads3;
        Intrinsics.checkNotNullExpressionValue("m1", "TAG");
        toString();
        AdSet s = s();
        if (s == null || (ads3 = s.getAds()) == null || (emptyList = CollectionsKt.getIndices(ads3)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        if (CollectionsKt.contains(emptyList, Integer.valueOf(i))) {
            AdSet s2 = s();
            if (s2 == null || (ads2 = s2.getAds()) == null) {
                return null;
            }
            return ads2.get(i);
        }
        AdSet s3 = s();
        if (s3 == null || (ads = s3.getAds()) == null) {
            return null;
        }
        return ads.peekFirst();
    }

    public final void e(AbstractC4038h1 abstractC4038h1) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "adUnitEventListener setter " + this);
        }
        WeakReference weakReference = new WeakReference(abstractC4038h1);
        this.f = weakReference;
        AdSet s = s();
        C3877b0 c3877b0 = new C3877b0(weakReference, com.safedk.android.analytics.brandsafety.m.w, s != null ? s.getIsRewarded() : false);
        this.u = c3877b0;
        C4493y9 logger = this.i;
        if (logger != null) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            c3877b0.f = logger;
        }
    }

    public final void f() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "destroyAllContainer " + this);
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            a(i, true);
        }
    }

    public final void g() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "doAdLoadWork " + this);
        }
        try {
            c((byte) 1);
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y92.d("m1", "AdUnit " + this + " state - LOADING");
            }
            I();
            C4277q4 c4277q4 = AbstractC4015g4.a;
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            if (((RootConfig) AbstractC4015g4.a.a(RootConfig.class)).getMonetizationDisabled()) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (short) 2012);
                C4493y9 c4493y93 = this.i;
                if (c4493y93 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                    c4493y93.b("m1", "Monetization is Disabled");
                    return;
                }
                return;
            }
            if (d((byte) 0)) {
                this.g.a(this.a, new C4064i1(this, null));
                C4493y9 c4493y94 = this.i;
                if (c4493y94 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                    c4493y94.a("m1", "Fresh ad requested");
                }
            }
        } catch (Exception e) {
            C4493y9 c4493y95 = this.i;
            if (c4493y95 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y95.b("m1", "Load failed with unexpected error: " + e.getMessage());
            }
            Lazy lazy = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(e));
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2000);
        }
    }

    public final void h() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "fireAdServedBeacon " + this);
        }
        GestureDetectorOnGestureListenerC4476xi j = j();
        if (j == null) {
            return;
        }
        j.t();
    }

    public abstract void i();

    @Override // com.inmobi.media.AbstractC4528zi
    public void i(GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "RenderView visible, for index " + this.h.indexOf(renderView) + " " + this);
        }
    }

    public final GestureDetectorOnGestureListenerC4476xi j() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "adMarkupContainer getter " + this);
        }
        byte b = this.b;
        String t = t();
        if (Intrinsics.areEqual(t, "html")) {
            if (b == 0 || 1 == b || 3 == b || 8 == b) {
                return null;
            }
            return r();
        }
        if (!Intrinsics.areEqual(t, "htmlUrl") || b == 0 || 1 == b || 3 == b || 8 == b) {
            return null;
        }
        return r();
    }

    public final AdMetaInfo k() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "adMetaInfo getter " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(0);
        if (b != null) {
            return new AdMetaInfo(b.getCreativeId(), b.getTransaction());
        }
        return null;
    }

    public HashMap l() {
        return new HashMap();
    }

    public abstract String m();

    public void m(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        Xh xh;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "Render view signaled ad ready, for index " + this.h.indexOf(gestureDetectorOnGestureListenerC4476xi) + " " + this);
        }
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y92.a("m1", "==== CHECKPOINT REACHED - LOAD SUCCESS ====");
        }
        C4493y9 c4493y93 = this.i;
        if (c4493y93 == null || (xh = c4493y93.a) == null) {
            return;
        }
        xh.a();
    }

    public final AbstractC4038h1 n() {
        C4493y9 c4493y9;
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y92.c("m1", "adUnitEventListener getter " + this);
        }
        AbstractC4038h1 abstractC4038h1 = (AbstractC4038h1) this.f.get();
        if (abstractC4038h1 == null && (c4493y9 = this.i) != null) {
            c4493y9.b("InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return abstractC4038h1;
    }

    public final Context o() {
        WeakReference weakReference = this.d;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public final com.inmobi.media.ads.network.common.model.Ad p() {
        return this.s ? b(this.o) : b(0);
    }

    public final com.inmobi.media.ads.network.common.model.Ad q() {
        return this.s ? b(this.p) : b(0);
    }

    public abstract GestureDetectorOnGestureListenerC4476xi r();

    public final AdSet s() {
        List<AdSet> adSets;
        AdResponse adResponse = this.m;
        if (adResponse == null || (adSets = adResponse.getAdSets()) == null) {
            return null;
        }
        return (AdSet) CollectionsKt.firstOrNull((List) adSets);
    }

    public final String t() {
        String markupType;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "markupType getter " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(0);
        return (b == null || (markupType = b.getMarkupType()) == null) ? "unknown" : markupType;
    }

    public abstract byte u();

    public final String v() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "getPodAdContext " + this);
        }
        if (this.s) {
            return this.t;
        }
        return null;
    }

    public final JSONArray w() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "getRenderableAdIndexes " + this);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.r.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            jSONArray.put(((Number) next).intValue());
        }
        return jSONArray;
    }

    public final long x() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "getShowTimeStamp " + this);
        }
        if (this.s) {
            return this.q;
        }
        return -1L;
    }

    public final String y() {
        String telemetryMetadataBlob;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        AdSet s = s();
        com.inmobi.media.ads.network.common.model.Ad ad = (s == null || (ads = s.getAds()) == null) ? null : (com.inmobi.media.ads.network.common.model.Ad) CollectionsKt.firstOrNull((List) ads);
        return (ad == null || (telemetryMetadataBlob = ad.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }

    public final TimeoutConfigurations z() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "timeOutConfiguration getter " + this);
        }
        AdConfig adConfig = this.c;
        Intrinsics.checkNotNull(adConfig);
        return adConfig.getTimeouts();
    }

    public final int l(GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "getCurrentRenderingPodAdIndex " + this);
        }
        if (!this.s) {
            return -1;
        }
        int indexOf = this.h.indexOf(renderView);
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y92.c("m1", "getCurrentRenderingPodAdIndex " + indexOf);
        }
        return indexOf;
    }

    public void o(GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "onAdUnloadedAfterShowSuccess");
        }
        renderView.n();
        b((byte) 4);
    }

    public final void d(int i) {
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "initializeHtmlAdContainer " + this);
        }
        Context o = o();
        if (o == null) {
            return;
        }
        try {
            if (this.h.get(i) != null && ((gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) this.h.get(i)) == null || !gestureDetectorOnGestureListenerC4476xi.N.get())) {
                return;
            }
            com.inmobi.media.ads.network.common.model.Ad b = b(i);
            C4221o0 a = a(i);
            GestureDetectorOnGestureListenerC4476xi a2 = ((Jo) this.B.getValue()).a(new Yi("adUnit-" + i, "default"), o, (short) 0, a, this.c);
            a(a2, a.p);
            this.h.set(i, a2);
            a2.a(this);
            a2.a(b);
        } catch (Exception e) {
            a((GestureDetectorOnGestureListenerC4476xi) this.h.get(this.o), (short) 2136, e((short) 2136));
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y92.a("m1", "Exception while initializing WebView", e);
            }
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
    }

    public static String p(GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Job job = renderView.z;
        return e((job == null || !job.isActive()) ? (short) 3103 : (short) 3102);
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void h(final GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "onRenderViewSignaledAdReady " + this);
        }
        if (!this.k && o() != null) {
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.inmobi.media.m1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC4168m1.a(AbstractC4168m1.this, renderView);
                    }
                });
                return;
            } else {
                c((short) 2187);
                return;
            }
        }
        c((short) 2186);
    }

    public final void k(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        int indexOf = this.h.indexOf(gestureDetectorOnGestureListenerC4476xi);
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "fireLoadAdTokenUrlSuccessful : " + indexOf + " " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(indexOf);
        if (b != null) {
            for (String url : Ti.a(b, "load_ad_token_url")) {
                E3 e3 = E3.a;
                C4493y9 c4493y92 = this.i;
                Intrinsics.checkNotNullParameter(url, "url");
                E3.a(url, true, c4493y92);
            }
        }
    }

    public void n(GestureDetectorOnGestureListenerC4476xi renderView) {
        int l;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "onAdUnloadedAfterLoadSuccess");
        }
        if (this.s && (l = l(renderView)) > this.p) {
            this.r.remove(Integer.valueOf(l));
        } else {
            V();
        }
    }

    public final void b(AbstractC4038h1 abstractC4038h1) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "onAdShowFailed " + this);
        }
        d((short) 85);
        abstractC4038h1.b();
    }

    public static Pair b(String str) {
        List split$default;
        if (str != null && (split$default = StringsKt.split$default((CharSequence) str, new String[]{VastAttributes.HORIZONTAL_POSITION}, false, 2, 2, (Object) null)) != null) {
            String str2 = (String) CollectionsKt.getOrNull(split$default, 0);
            Integer intOrNull = str2 != null ? StringsKt.toIntOrNull(str2) : null;
            String str3 = (String) CollectionsKt.getOrNull(split$default, 1);
            Integer intOrNull2 = str3 != null ? StringsKt.toIntOrNull(str3) : null;
            if (intOrNull != null && intOrNull2 != null) {
                return TuplesKt.to(intOrNull, intOrNull2);
            }
        }
        return null;
    }

    public final void b(InMobiAdRequestStatus requestStatus, short s) {
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "onAdFetchFailed " + this);
        }
        if (!this.k && o() != null && this.b != 3) {
            a(requestStatus, s);
            return;
        }
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y92.b("m1", "callback ignored - isDestroyed - " + this.k + " context - " + o() + " state- " + ((int) this.b));
        }
    }

    public final void c(byte b) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.d("m1", "STATE UPDATE: from " + ((int) this.b) + " to " + ((int) b));
        }
        this.b = b;
    }

    public final boolean c(int i) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "getAllowAutoRedirectionForIndex " + this + " index - " + i);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(i);
        return b != null && b.getAllowAutoRedirection();
    }

    public final void c(AbstractC4038h1 listener) {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        Intrinsics.checkNotNullParameter(listener, "listener");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "onFetchSuccess " + this);
        }
        HashMap hashMap = new HashMap();
        c(hashMap);
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad p = p();
        if (p == null || (str = p.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        long j = this.z.h;
        CoroutineScope coroutineScope = Hl.a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put("metadataBlob", y());
        C4309ra c4309ra = this.v;
        if (c4309ra != null) {
            hashMap.put("retryCount", Integer.valueOf(c4309ra.b));
        }
        AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s.getIsRewarded()));
        }
        com.inmobi.media.ads.network.common.model.Ad p2 = p();
        if (p2 != null && (metaInfo = p2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        c("ParseSuccess", hashMap);
        AdMetaInfo k = k();
        if (k == null) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y92.b("m1", "ad meta info null. fail");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2106);
            return;
        }
        C4493y9 c4493y93 = this.i;
        if (c4493y93 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y93.a("m1", "callback - onAdFetchSuccess");
        }
        listener.b(k);
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void j(GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        byte b = this.b;
        if (b == 2) {
            V();
            b((byte) 1);
            AbstractC4038h1 n = n();
            InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
            if (n != null) {
                n.a(this, inMobiAdRequestStatus);
            } else {
                C4493y9 c4493y9 = this.i;
                if (c4493y9 != null) {
                    c4493y9.a();
                }
            }
            c((short) 2238);
            renderView.b();
            return;
        }
        if (b == 4) {
            n(renderView);
            renderView.b();
            b((byte) 4);
        } else {
            if (b != 6 && b != 7) {
                C4493y9 c4493y92 = this.i;
                if (c4493y92 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                    c4493y92.b("m1", "onUnloadCalled - invalid state - " + ((int) this.b));
                    return;
                }
                return;
            }
            o(renderView);
        }
    }

    public final void b(InMobiAdRequestStatus requestStatus, boolean z, short s) {
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.b("m1", "handleAdLoadFailure " + this + " errorCode - " + ((int) s));
        }
        if (this.b == 1 && z) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y92.b("m1", "load failed - " + ((int) s));
            }
            C4493y9 c4493y93 = this.i;
            if (c4493y93 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y93.d("m1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        AbstractC4038h1 n = n();
        if (n != null) {
            n.a(this, requestStatus);
        } else {
            C4493y9 c4493y94 = this.i;
            if (c4493y94 != null) {
                c4493y94.a();
            }
        }
        if (s != 0) {
            c(s);
        }
    }

    public final void e() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "clearAdPods " + this);
        }
        if (this.s) {
            f();
            this.h.clear();
            this.o = 0;
            this.p = 0;
            this.r.clear();
        }
    }

    public static final void b(AbstractC4168m1 abstractC4168m1) {
        if (6 == abstractC4168m1.b) {
            abstractC4168m1.a((short) 2158);
        }
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void b(HashMap rewards) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "onAdRewardActionCompleted " + this);
        }
        if (this.k || o() == null) {
            return;
        }
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y92.a("m1", "Ad reward action completed. Params:" + rewards);
        }
        AbstractC4038h1 n = n();
        if (n != null) {
            n.b(rewards);
        }
    }

    public final void e(int i) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "resetCurrentRenderingIndex " + this);
        }
        this.p = i;
    }

    public static String e(short s) {
        return "SDK_" + ((int) s);
    }

    public static final Oo e(AbstractC4168m1 abstractC4168m1) {
        com.inmobi.media.ads.network.common.model.Ad b = abstractC4168m1.b(0);
        if (b == null || abstractC4168m1.A()) {
            b = null;
        }
        C4493y9 c4493y9 = abstractC4168m1.i;
        Intrinsics.checkNotNullExpressionValue("m1", "TAG");
        return new Oo(b, c4493y9);
    }

    public final void b(short s) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "submitAdLoadDroppedAtSDK " + this);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        c(hashMap);
        c("AdLoadDroppedAtSDK", hashMap);
    }

    public final void b(Map map) {
        MetaInfo metaInfo;
        String creativeType;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.z.d));
        map.put("networkType", F5.g());
        map.put("plId", Long.valueOf(this.l.a));
        AdSet s = s();
        map.put("isRewarded", Boolean.valueOf(s != null ? s.getIsRewarded() : false));
        String str = this.l.e;
        if (str != null) {
            map.put("adType", str);
        }
        String str2 = this.l.f;
        if (str2 != null) {
            map.put("plType", str2);
        }
        C4309ra c4309ra = this.v;
        if (c4309ra != null) {
            map.put("retryCount", Integer.valueOf(c4309ra.b));
        }
        com.inmobi.media.ads.network.common.model.Ad p = p();
        if (p != null && (metaInfo = p.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        a(p(), map);
        b("ServerError", map);
    }

    public final void b(String str, Map map) {
        com.inmobi.media.ads.network.common.model.Ad p;
        MetaInfo metaInfo;
        String creativeType;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "onTelemetryEvent " + this + " adState=" + ((int) this.b));
        }
        if (this.b != 3) {
            a(str, map);
            if ((Intrinsics.areEqual(str, "ServerFill") || Intrinsics.areEqual(str, "ServerError")) && (p = p()) != null && (metaInfo = p.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
                map.put("creativeType", creativeType);
            }
            c(str, map);
        }
    }

    public final void b(com.inmobi.media.ads.network.common.model.Ad ad) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "updateAd " + this);
        }
        AdSet s = s();
        if (s == null || (ads = s.getAds()) == null) {
            return;
        }
        ads.set(0, ad);
    }

    public final void b(byte b) {
        Nk nk;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "cancelTimer " + this);
        }
        if (b == 1 && (nk = this.n) != null) {
            nk.a((byte) 2);
        }
        Nk nk2 = this.n;
        if (nk2 != null) {
            nk2.a(b);
        }
    }

    public final void b(int i, boolean z) {
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "fireAdPodShowResult " + this);
        }
        CopyOnWriteArrayList list = this.h;
        Intrinsics.checkNotNullParameter(list, "list");
        if (i < 0 || i >= list.size() || (gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) this.h.get(i)) == null) {
            return;
        }
        gestureDetectorOnGestureListenerC4476xi.b(z);
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void b(GestureDetectorOnGestureListenerC4476xi renderView) {
        MetaInfo metaInfo;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "fireClickTracker " + this);
        }
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.ads.network.common.model.Ad b = b(this.h.indexOf(renderView));
        if (Intrinsics.areEqual((b == null || (metaInfo = b.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), "video") || b == null) {
            return;
        }
        for (String url : Ti.a(b, "click")) {
            E3 e3 = E3.a;
            C4493y9 c4493y92 = this.i;
            Intrinsics.checkNotNullParameter(url, "url");
            E3.a(url, true, c4493y92);
        }
    }

    public static final void a(AbstractC4168m1 abstractC4168m1, W w) {
        abstractC4168m1.getClass();
        if (w instanceof C4363tb) {
            C4326s1 c4326s1 = abstractC4168m1.z;
            c4326s1.getClass();
            c4326s1.d = SystemClock.elapsedRealtime();
            return;
        }
        if (w instanceof Yf) {
            C4326s1 c4326s12 = abstractC4168m1.z;
            c4326s12.getClass();
            c4326s12.h = SystemClock.elapsedRealtime();
        } else {
            if (w instanceof C4134kj) {
                Map map = ((C4134kj) w).a;
                Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("latency", Long.valueOf(SystemClock.elapsedRealtime() - abstractC4168m1.z.d)), TuplesKt.to("networkType", F5.g()), TuplesKt.to("plId", Long.valueOf(abstractC4168m1.l.a)));
                mutableMapOf.putAll(map);
                String str = abstractC4168m1.l.f;
                if (str != null) {
                    mutableMapOf.put("plType", str);
                }
                String str2 = abstractC4168m1.l.e;
                if (str2 != null) {
                    mutableMapOf.put("adType", str2);
                }
                abstractC4168m1.b("ServerFill", mutableMapOf);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void a(Context context, C4431w0 adPlacement, AbstractC3924cl abstractC3924cl) {
        C4431w0 c4431w0;
        String str;
        String str2;
        C4493y9 c4493y9;
        C4493y9 c4493y92;
        C4493y9 c4493y93;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        Intrinsics.checkNotNullExpressionValue("m1", "TAG");
        toString();
        a(context);
        this.f = new WeakReference(abstractC3924cl);
        Nb nb = AbstractC3869ai.a;
        AbstractC3869ai.a(abstractC3924cl, this.i);
        WeakReference weakReference = this.f;
        String m = m();
        AdSet s = s();
        this.u = new C3877b0(weakReference, m, s != null ? s.getIsRewarded() : false);
        this.l = adPlacement;
        B();
        C4493y9 c4493y94 = this.i;
        if (c4493y94 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y94.c("m1", "initInternetAvailabilityAdRetry");
        }
        if (this.c == null && (c4493y93 = this.i) != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y93.c("m1", "adConfig is null");
            Unit unit = Unit.INSTANCE;
        }
        if (this.l.f == null && (c4493y92 = this.i) != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y92.c("m1", "placement.placementType is null");
            Unit unit2 = Unit.INSTANCE;
        }
        if (this.l.e == null && (c4493y9 = this.i) != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "placement.adType is null");
            Unit unit3 = Unit.INSTANCE;
        }
        AdConfig adConfig = this.c;
        if (adConfig != null && (str = (c4431w0 = this.l).f) != null && (str2 = c4431w0.e) != null) {
            Ac a = AbstractC4522zc.a(adConfig.getTimeouts().a0(), str, str2, AbstractC4030gj.b);
            this.v = new C4309ra(a);
            this.w = a;
        }
        if (R5.h != null) {
            Intrinsics.checkNotNullExpressionValue("R5", "TAG");
        } else {
            R5.h = Float.valueOf(new TextView(context).getTextSize());
            Intrinsics.checkNotNullExpressionValue("R5", "TAG");
        }
        M();
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "setContext " + this);
        }
        this.d = new WeakReference(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0130, code lost:
    
        if (r12.equals("video") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0137, code lost:
    
        if (r12.equals("audio") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0127, code lost:
    
        if (r12.equals("nonvideo") == false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024d A[EDGE_INSN: B:134:0x024d->B:78:0x024d BREAK  A[LOOP:1: B:57:0x01ae->B:133:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C4221o0 a(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        long j;
        boolean z;
        String str5;
        String str6;
        String str7;
        String str8;
        Iterator<Viewability> it;
        MetaInfo metaInfo;
        MetaInfo metaInfo2;
        String creativeId;
        MetaInfo metaInfo3;
        String creativeType;
        List<LandingPageParam> landingPageParams;
        LandingPageParam landingPageParam;
        List<LandingPageParam> landingPageParams2;
        LandingPageParam landingPageParam2;
        AdConfig.ViewabilityConfig viewability;
        AdConfig.OmidConfig omidConfig;
        MetaInfo metaInfo4;
        com.inmobi.media.ads.network.common.model.Ad ad = b(i);
        String str9 = "audio";
        if (Intrinsics.areEqual(this.l.e, "banner") || Intrinsics.areEqual(this.l.e, "audio")) {
            C4431w0 c4431w0 = this.l;
            if (c4431w0.j && c4431w0.i.length() > 0) {
                str = this.l.i;
            } else {
                str = this.l.h;
            }
            str2 = str;
        } else {
            str2 = null;
        }
        if (ad == null || (str3 = ad.getMarkupType()) == null) {
            str3 = "html";
        }
        String str10 = str3;
        String str11 = this.l.e;
        boolean a = a(ad);
        long j2 = this.l.a;
        boolean c = c(i);
        String str12 = this.l.m;
        String creativeType2 = (ad == null || (metaInfo4 = ad.getMetaInfo()) == null) ? null : metaInfo4.getCreativeType();
        AdMetaInfo k = k();
        String creativeID = k != null ? k.getCreativeID() : null;
        boolean z2 = this.l.l;
        LinkedHashMap linkedHashMap = this.y;
        WatermarkData watermarkData = this.A;
        AdQualityControl adQualityControl = ad != null ? ad.getAdQualityControl() : null;
        byte u = u();
        Intrinsics.checkNotNull(ad);
        AdConfig adConfig = this.c;
        Intrinsics.checkNotNullParameter(ad, "ad");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        MetaInfo metaInfo5 = ad.getMetaInfo();
        if (adConfig == null || (viewability = adConfig.getViewability()) == null || (omidConfig = viewability.getOmidConfig()) == null) {
            str4 = str12;
            bool = null;
        } else {
            bool = Boolean.valueOf(omidConfig.isOmidEnabled());
            str4 = str12;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            if ((metaInfo5 != null ? metaInfo5.getOmsdkInfo() : null) != null) {
                OmSdkInfo omsdkInfo = metaInfo5.getOmsdkInfo();
                if (omsdkInfo.getOmidEnabled()) {
                    str6 = str2;
                    Vk vk = new Vk((byte) 3);
                    boolean isolateVerificationScripts = omsdkInfo.getIsolateVerificationScripts();
                    str5 = str10;
                    String customReferenceData = omsdkInfo.getCustomReferenceData();
                    str7 = creativeType2;
                    HashMap<String, String> obj = omsdkInfo.getMacros();
                    str8 = creativeID;
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    JSONObject a2 = AbstractC4494ya.a(obj, obj.getClass());
                    byte impressionType = omsdkInfo.getImpressionType();
                    String creativeType3 = metaInfo5.getCreativeType();
                    z = c;
                    int hashCode = creativeType3.hashCode();
                    j = j2;
                    if (hashCode != 93166550) {
                        if (hashCode == 112202875) {
                            str9 = "video";
                        } else {
                            if (hashCode == 1425678798) {
                                str9 = "nonvideo";
                            }
                            str9 = "unknown";
                            HashMap hashMap = new HashMap();
                            if (a2 != null) {
                                Iterator<String> keys = a2.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    hashMap.put(next, a2.optString(next));
                                }
                            }
                            HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("creativeType", str9), TuplesKt.to("customReferenceData", customReferenceData), TuplesKt.to("impressionType", Byte.valueOf(impressionType)), TuplesKt.to("macros", hashMap), TuplesKt.to("isolateVerificationScripts", Boolean.valueOf(isolateVerificationScripts)));
                            if (hashMapOf == null) {
                                hashMapOf = null;
                            }
                            if (hashMapOf == null) {
                                hashMapOf = new HashMap();
                            }
                            vk.b = hashMapOf;
                            linkedHashSet.add(vk);
                        }
                    }
                    it = ad.getViewability().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            break;
                        }
                        Viewability next2 = it.next();
                        if (next2.getInmobi() != null) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            int a3 = Wk.a(next2.getInmobi().getTime());
                            if (a3 != -1) {
                                linkedHashMap2.put("time", Integer.valueOf(a3));
                            }
                            int a4 = Wk.a(next2.getInmobi().getView());
                            if (a4 != -1) {
                                linkedHashMap2.put("view", Integer.valueOf(a4));
                            }
                            int a5 = Wk.a(next2.getInmobi().getPixel());
                            if (a5 != -1) {
                                linkedHashMap2.put("pixel", Integer.valueOf(a5));
                            }
                            byte type = next2.getInmobi().getType();
                            linkedHashMap2.put("type", Integer.valueOf(type));
                            if (type == 2) {
                                if (next2.getInmobi().getFrame().length == 4) {
                                    linkedHashMap2.put("frame", next2.getInmobi().getFrame());
                                } else {
                                    linkedHashMap2.put("frame", new JSONArray("[0,0,0,0]"));
                                }
                            }
                            Vk vk2 = new Vk((byte) 2);
                            vk2.b = linkedHashMap2;
                            linkedHashSet.add(vk2);
                        }
                    }
                    com.inmobi.media.ads.network.common.model.Ad b = b(i);
                    String impressionId = b == null ? b.getImpressionId() : null;
                    metaInfo = ad.getMetaInfo();
                    if (metaInfo != null || (landingPageParams2 = metaInfo.getLandingPageParams()) == null || (landingPageParam2 = (LandingPageParam) CollectionsKt.getOrNull(landingPageParams2, 0)) == null || (r2 = landingPageParam2.getOpenMode()) == null) {
                        String str13 = "DEFAULT";
                    }
                    String str14 = str13;
                    C4277q4 c4277q4 = AbstractC4015g4.a;
                    Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
                    Gi gi = new Gi(((TelemetryConfig) AbstractC4015g4.a.a(TelemetryConfig.class)).getMaxTemplateEvents());
                    metaInfo2 = ad.getMetaInfo();
                    if (metaInfo2 != null || (landingPageParams = metaInfo2.getLandingPageParams()) == null || (landingPageParam = (LandingPageParam) CollectionsKt.getOrNull(landingPageParams, 0)) == null || (r2 = landingPageParam.getAParams()) == null) {
                        InlineParams inlineParams = new InlineParams(null, null, 0, 7, null);
                    }
                    inlineParams.setTargetBundleId(ad.getBidBundle());
                    inlineParams.setPingMode(this.c.getInlineInstaller().getEffectivePingMode());
                    C4431w0 c4431w02 = this.l;
                    String t = t();
                    String impressionId2 = ad.getImpressionId();
                    String str15 = impressionId2 != null ? "" : impressionId2;
                    String telemetryMetadataBlob = ad.getTelemetryMetadataBlob();
                    String str16 = telemetryMetadataBlob != null ? "" : telemetryMetadataBlob;
                    C4309ra c4309ra = this.v;
                    int i2 = c4309ra == null ? c4309ra.b : 0;
                    com.inmobi.media.ads.network.common.model.Ad p = p();
                    String str17 = (p != null || (metaInfo3 = p.getMetaInfo()) == null || (creativeType = metaInfo3.getCreativeType()) == null) ? "" : creativeType;
                    com.inmobi.media.ads.network.common.model.Ad p2 = p();
                    String str18 = (p2 != null || (creativeId = p2.getCreativeId()) == null) ? "" : creativeId;
                    AdSet s = s();
                    return new C4221o0(str11, a, j, z, str8, str7, str5, str6, this, str4, linkedHashMap, Boolean.valueOf(z2), watermarkData, adQualityControl, u, linkedHashSet, impressionId, str14, new Bi(c4431w02, t, str15, str16, i2, str17, str18, s != null ? s.getIsRewarded() : false, i, this.z.j, gi, "default", inlineParams), this.i);
                }
            }
        }
        j = j2;
        z = c;
        str5 = str10;
        str6 = str2;
        str7 = creativeType2;
        str8 = creativeID;
        it = ad.getViewability().iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        com.inmobi.media.ads.network.common.model.Ad b2 = b(i);
        if (b2 == null) {
        }
        metaInfo = ad.getMetaInfo();
        if (metaInfo != null) {
        }
        String str132 = "DEFAULT";
        String str142 = str132;
        C4277q4 c4277q42 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        Gi gi2 = new Gi(((TelemetryConfig) AbstractC4015g4.a.a(TelemetryConfig.class)).getMaxTemplateEvents());
        metaInfo2 = ad.getMetaInfo();
        if (metaInfo2 != null) {
        }
        InlineParams inlineParams2 = new InlineParams(null, null, 0, 7, null);
        inlineParams2.setTargetBundleId(ad.getBidBundle());
        inlineParams2.setPingMode(this.c.getInlineInstaller().getEffectivePingMode());
        C4431w0 c4431w022 = this.l;
        String t2 = t();
        String impressionId22 = ad.getImpressionId();
        if (impressionId22 != null) {
        }
        String telemetryMetadataBlob2 = ad.getTelemetryMetadataBlob();
        if (telemetryMetadataBlob2 != null) {
        }
        C4309ra c4309ra2 = this.v;
        if (c4309ra2 == null) {
        }
        com.inmobi.media.ads.network.common.model.Ad p3 = p();
        if (p3 != null) {
        }
        com.inmobi.media.ads.network.common.model.Ad p22 = p();
        if (p22 != null) {
        }
        AdSet s2 = s();
        return new C4221o0(str11, a, j, z, str8, str7, str5, str6, this, str4, linkedHashMap, Boolean.valueOf(z2), watermarkData, adQualityControl, u, linkedHashSet, impressionId, str142, new Bi(c4431w022, t2, str15, str16, i2, str17, str18, s2 != null ? s2.getIsRewarded() : false, i, this.z.j, gi2, "default", inlineParams2), this.i);
    }

    public final void b(GestureDetectorOnGestureListenerC4476xi renderView, String errorCode) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        int indexOf = this.h.indexOf(renderView);
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.b("m1", "fireLoadAdTokenUrlFailed : " + indexOf + " " + this + " errorCode: " + errorCode);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(indexOf);
        if (b != null) {
            List<String> a = Ti.a(b, "load_ad_token_url_failure");
            boolean contains = this.c.getDisableAppendingKeysForBeacons().contains("load_ad_token_url_failure");
            for (String url : a) {
                if (!contains) {
                    Uri parse = Uri.parse(url);
                    Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
                    url = parse.buildUpon().appendQueryParameter("error", errorCode).build().toString();
                    Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
                }
                E3 e3 = E3.a;
                C4493y9 c4493y92 = this.i;
                Intrinsics.checkNotNullParameter(url, "url");
                E3.a(url, true, c4493y92);
            }
        }
    }

    public final void d(AbstractC4038h1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "onLoadSuccess " + this);
        }
        AdMetaInfo k = k();
        if (k == null) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y92.b("m1", "load success - ad unit null");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2107);
            return;
        }
        b((byte) 1);
        C4493y9 c4493y93 = this.i;
        if (c4493y93 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y93.a("m1", "callback - onAdLoadSucceeded");
        }
        listener.c(k);
    }

    public void d() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "clear " + this);
        }
        if (this.k) {
            return;
        }
        this.k = true;
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        e();
        C4309ra c4309ra = this.v;
        if (c4309ra != null) {
            c4309ra.b = 0;
        }
        J();
        c((byte) 0);
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y92.d("m1", "AdUnit " + this + " state - CREATED");
        }
        Ka ka = this.g;
        String id = this.a;
        ka.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        try {
            List list = (List) ka.c.get(id);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Job.DefaultImpls.cancel$default((Job) it.next(), null, 1, null);
                }
            }
            List list2 = (List) ka.c.remove(id);
            if (list2 != null) {
                list2.clear();
            }
        } catch (Exception unused) {
        }
        this.m = null;
        this.s = false;
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void d(GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (this.C) {
            return;
        }
        this.C = true;
        Hi hi = renderView.e0;
        if (hi != null) {
            Map a = hi.a();
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("AttachedToWindow", a, EnumC4530zk.a);
        }
    }

    public final void d(short s) {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "submitAdShowFailed " + this);
        }
        HashMap hashMap = new HashMap();
        long j = this.z.f;
        CoroutineScope coroutineScope = Hl.a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null && (metaInfo = q2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        AdSet s2 = s();
        if (s2 != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s2.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        a(q(), hashMap);
        c("AdShowFailed", hashMap);
    }

    public final void c(String podAdContext) {
        Intrinsics.checkNotNullParameter(podAdContext, "podAdContext");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "setPodAdContext " + this);
        }
        if (this.s) {
            this.t = podAdContext;
        }
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void c() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "onAdScreenDisplayFailed " + this);
        }
        if (this.k || o() == null) {
            return;
        }
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y92.b("m1", "Ad failed to display");
        }
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.inmobi.media.m1$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC4168m1.b(AbstractC4168m1.this);
                }
            });
        }
    }

    public final void c(HashMap hashMap) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "constructTelemetryPayload " + this);
        }
        hashMap.put("adType", m());
        hashMap.put("networkType", F5.g());
        hashMap.put("plId", Long.valueOf(this.l.a));
        String str = this.l.f;
        if (str != null) {
            hashMap.put("plType", str);
        }
    }

    public final void c(short s) {
        long j;
        long elapsedRealtime;
        String str;
        MetaInfo metaInfo;
        String creativeType;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "submitAdLoadFailedEvent " + this);
        }
        HashMap hashMap = new HashMap();
        if (s == 2138 || s == 2109) {
            j = this.z.e;
            CoroutineScope coroutineScope = Hl.a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        } else if (s == 2139) {
            j = this.z.g;
            CoroutineScope coroutineScope2 = Hl.a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j = this.z.c;
            CoroutineScope coroutineScope3 = Hl.a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        hashMap.put("latency", Long.valueOf(elapsedRealtime - j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad p = p();
        if (p == null || (str = p.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad p2 = p();
        if (p2 != null && (metaInfo = p2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        C4309ra c4309ra = this.v;
        if (c4309ra != null) {
            hashMap.put("retryCount", Integer.valueOf(c4309ra.b));
        }
        AdSet s2 = s();
        if (s2 != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s2.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        c(hashMap);
        a(p(), hashMap);
        c("AdLoadFailed", hashMap);
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void g(GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "RenderView completed loading ad content, for index " + this.h.indexOf(renderView) + " " + this);
        }
    }

    public final boolean d(byte b) {
        int b0;
        Integer num;
        long j;
        Integer num2;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "startTimer " + this);
        }
        if (b == 0) {
            Ac ac = this.w;
            if (ac != null && (num2 = ac.d) != null) {
                b0 = num2.intValue();
                j = b0;
            }
            j = 15000;
        } else if (b == 1) {
            Ac ac2 = this.w;
            if (ac2 != null) {
                b0 = ac2.c;
                j = b0;
            }
            j = 15000;
        } else {
            if (b == 2) {
                Ac ac3 = this.w;
                if (ac3 != null && (num = ac3.e) != null) {
                    b0 = num.intValue();
                }
                j = 15000;
            } else if (b == 4) {
                TimeoutConfigurations timeoutConfigurations = this.e;
                Intrinsics.checkNotNull(timeoutConfigurations);
                b0 = timeoutConfigurations.b0();
            } else {
                C4493y9 c4493y92 = this.i;
                if (c4493y92 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                    c4493y92.b("m1", "Invalid value for timeOutScenario passed!. Please pass a valid value");
                }
                return false;
            }
            j = b0;
        }
        Nk nk = this.n;
        return nk != null && nk.a(b, j);
    }

    public final void c(String eventType, Map kv) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(kv, "kv");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "submitTelemetryEvent " + this);
        }
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b(eventType, kv, EnumC4530zk.a);
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void c(GestureDetectorOnGestureListenerC4476xi renderView) {
        MetaInfo metaInfo;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "fireImpressionTracker " + this);
        }
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.ads.network.common.model.Ad b = b(this.h.indexOf(renderView));
        if (Intrinsics.areEqual((b == null || (metaInfo = b.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), "video") || b == null) {
            return;
        }
        for (String url : Ti.a(b, "impression")) {
            Fk telemetryOnAdImpression = renderView.getTelemetryOnAdImpression();
            telemetryOnAdImpression.getClass();
            Intrinsics.checkNotNullParameter("adResponseTracker", "<set-?>");
            telemetryOnAdImpression.f = "adResponseTracker";
            E3 e3 = E3.a;
            C3851a0 c3851a0 = new C3851a0(this.u, telemetryOnAdImpression);
            C4493y9 c4493y92 = this.i;
            Intrinsics.checkNotNullParameter(url, "url");
            Ug.a(Rg.a, new C4434w3(url, c4493y92, c3851a0, null));
        }
    }

    public final boolean a(com.inmobi.media.ads.network.common.model.Ad ad) {
        Short sh;
        Pair pair;
        P0 features;
        boolean enableImmersive = this.c.getRendering().getEnableImmersive();
        boolean z = R5.i;
        boolean a = (ad == null || (features = ad.getFeatures()) == null) ? false : features.a(false);
        boolean z2 = enableImmersive && z && a;
        if (!z2) {
            StringBuilder sb = new StringBuilder("Immersive not supported on");
            BitSet bitSet = new BitSet(3);
            ArrayList arrayList = new ArrayList();
            if (!enableImmersive) {
                arrayList.add(" config");
                bitSet.set(0);
            }
            if (!z) {
                arrayList.add(" device");
                bitSet.set(1);
            }
            if (!a) {
                arrayList.add(" ad");
                bitSet.set(2);
            }
            sb.append(CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null));
            Intrinsics.checkNotNullParameter(bitSet, "bitSet");
            if (bitSet.get(0) && bitSet.get(1) && bitSet.get(2)) {
                sh = (short) 2202;
            } else if (bitSet.get(0) && bitSet.get(1)) {
                sh = (short) 2200;
            } else if (bitSet.get(0) && bitSet.get(2)) {
                sh = (short) 2199;
            } else if (bitSet.get(1) && bitSet.get(2)) {
                sh = (short) 2201;
            } else if (bitSet.get(0)) {
                sh = (short) 2196;
            } else if (bitSet.get(1)) {
                sh = (short) 2197;
            } else {
                sh = bitSet.get(2) ? (short) 2198 : null;
            }
            short shortValue = sh != null ? sh.shortValue() : (short) -1;
            if (shortValue == -1) {
                pair = new Pair("Invalid Reason", (short) -1);
            } else {
                pair = new Pair(sb.toString(), Short.valueOf(shortValue));
            }
            String str = (String) pair.component1();
            short shortValue2 = ((Number) pair.component2()).shortValue();
            HashMap hashMap = new HashMap();
            hashMap.put("reason", str);
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(shortValue2));
            c("ImmersiveNotSupported", hashMap);
        }
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "Immersive support - config, device, adResponse - (" + enableImmersive + " " + z + " " + a + ")");
        }
        return z2;
    }

    public final void a(AbstractC4038h1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "onAdDisplayed " + this);
        }
        AdMetaInfo k = k();
        if (k == null) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y92.b("m1", "callback onAdDisplayed failed. ad meta info is null");
            }
            b(listener);
            return;
        }
        C4493y9 c4493y93 = this.i;
        if (c4493y93 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y93.a("m1", "callback - onAdDisplayed");
        }
        listener.a(k);
    }

    public final void a(AdResponse adResponse) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "handleAdFetchSuccessful " + this);
        }
        if (!this.k && o() != null) {
            if (this.b == 1) {
                this.m = adResponse;
                AdSet s = s();
                this.s = s != null ? s.getIsPod() : false;
                this.h = new CopyOnWriteArrayList();
                AdSet s2 = s();
                if (s2 != null && (ads = s2.getAds()) != null) {
                    for (com.inmobi.media.ads.network.common.model.Ad ad : ads) {
                        this.h.add(null);
                    }
                }
                G();
                return;
            }
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y92.b("m1", "incorrect state - " + ((int) this.b));
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2118);
            return;
        }
        c((short) 2185);
        C4493y9 c4493y93 = this.i;
        if (c4493y93 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y93.b("m1", "adUnit is destroyed");
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "handleMarkupFetchFailure " + this);
        }
        try {
            if (this.b == 1) {
                C4493y9 c4493y92 = this.i;
                if (c4493y92 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                    c4493y92.b("m1", "Failed to fetch ad for placement id: " + this.l + ", reason - " + inMobiAdRequestStatus.getMessage());
                }
                String str = "MarkupFetch failed reason is: " + inMobiAdRequestStatus.getMessage();
                C4493y9 c4493y93 = this.i;
                if (c4493y93 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                    c4493y93.b("m1", str);
                }
                C4493y9 c4493y94 = this.i;
                if (c4493y94 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                    c4493y94.d("m1", "AdUnit " + this + " state - FAILED");
                }
                c((byte) 3);
                b((byte) 1);
                if (s != 0) {
                    b(s);
                }
                AbstractC4038h1 n = n();
                if (n != null) {
                    n.a(inMobiAdRequestStatus);
                    return;
                }
                C4493y9 c4493y95 = this.i;
                if (c4493y95 != null) {
                    c4493y95.a();
                }
            }
        } catch (Exception e) {
            C4493y9 c4493y96 = this.i;
            if (c4493y96 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y96.a("m1", "onAdFetchFailed with error: ", e);
            }
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
    }

    public final void a(short s) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.b("m1", "handleAdShowFailure " + this + " errorCode - " + ((int) s));
        }
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y92.d("m1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 4);
        AbstractC4038h1 n = n();
        if (n != null) {
            n.b();
        }
        if (s != 0) {
            d(s);
        }
    }

    public final void a(InMobiAdRequestStatus requestStatus, boolean z, short s) {
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.b("m1", "handleAdFetchFailure " + this + " errorCode - " + ((int) s));
        }
        if (this.b == 3 && z) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y92.d("m1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        AbstractC4038h1 n = n();
        if (n != null) {
            n.a(this, requestStatus);
        }
        if (s != 0) {
            b(s);
        }
    }

    public final void a(Map map) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "setPublisherSuppliedExtras " + this + " - " + map);
        }
        this.l.c = map;
    }

    public static final Unit a(AbstractC4168m1 abstractC4168m1) {
        C4326s1 c4326s1 = abstractC4168m1.z;
        c4326s1.getClass();
        c4326s1.e = SystemClock.elapsedRealtime();
        abstractC4168m1.g();
        return Unit.INSTANCE;
    }

    public static final Unit a(AbstractC4168m1 abstractC4168m1, EnumC4069i6 errorCode) {
        short s;
        Intrinsics.checkNotNullParameter(errorCode, "it");
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        int ordinal = errorCode.ordinal();
        if (ordinal != 0) {
            if (ordinal != 21) {
                switch (ordinal) {
                    case 12:
                        s = 2101;
                        break;
                    case 13:
                        s = 2102;
                        break;
                    case 14:
                        s = 2103;
                        break;
                    case 15:
                        s = 2104;
                        break;
                    case 16:
                        s = 2105;
                        break;
                }
            } else {
                s = 2228;
            }
            abstractC4168m1.a(inMobiAdRequestStatus, true, s);
            return Unit.INSTANCE;
        }
        s = 2100;
        abstractC4168m1.a(inMobiAdRequestStatus, true, s);
        return Unit.INSTANCE;
    }

    public final void a(final Function0 onSuccess, final Function1 onMaxRetryReached) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onMaxRetryReached, "onMaxRetryReached");
        C4493y9 c4493y9 = this.i;
        Object obj = null;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            C4309ra c4309ra = this.v;
            c4493y9.c("m1", "loadWithRetry " + (c4309ra != null ? Integer.valueOf(c4309ra.b) : null));
        }
        C4309ra c4309ra2 = this.v;
        if (c4309ra2 != null) {
            EnumC4069i6 a = AbstractC3998ff.a();
            if (a == null) {
                obj = Xf.a;
            } else {
                int i = c4309ra2.b + 1;
                c4309ra2.b = i;
                if (i >= c4309ra2.a.b) {
                    obj = new C4049hc(a);
                } else {
                    obj = Dh.a;
                }
            }
        }
        if (obj instanceof C4049hc) {
            onMaxRetryReached.invoke(((C4049hc) obj).a);
            return;
        }
        if (obj instanceof Xf) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y92.c("m1", "load with retry success");
            }
            onSuccess.mo4828invoke();
            return;
        }
        if (!(obj instanceof Dh)) {
            if (obj == null) {
                C4493y9 c4493y93 = this.i;
                if (c4493y93 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                    c4493y93.c("m1", "shouldProceedToLoad result null. starting as if we have internet.");
                }
                onSuccess.mo4828invoke();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        C4493y9 c4493y94 = this.i;
        if (c4493y94 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y94.c("m1", "load failed, retrying");
        }
        this.x.postDelayed(new Runnable() { // from class: com.inmobi.media.m1$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4168m1.a(AbstractC4168m1.this, onSuccess, onMaxRetryReached);
            }
        }, this.w != null ? r8.a : 1000L);
    }

    public static final void a(AbstractC4168m1 abstractC4168m1, Function0 function0, Function1 function1) {
        C4493y9 c4493y9 = abstractC4168m1.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            C4309ra c4309ra = abstractC4168m1.v;
            c4493y9.c("m1", "Loading from retry Handler " + (c4309ra != null ? Integer.valueOf(c4309ra.b) : null));
        }
        abstractC4168m1.a(function0, function1);
    }

    public void a(byte[] bArr) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "load response " + this);
        }
        C4326s1 c4326s1 = this.z;
        c4326s1.getClass();
        c4326s1.c = SystemClock.elapsedRealtime();
        if (C()) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y92.a("m1", "isBlockingStateForLoadWithResponse - blocking");
                return;
            }
            return;
        }
        if (bArr != null && bArr.length != 0) {
            c((byte) 1);
            C4493y9 c4493y93 = this.i;
            if (c4493y93 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y93.d("m1", "AdUnit " + this + " state - LOADING");
            }
            this.g.a(this.a, new C4116k1(bArr, this, null));
            return;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (short) 2143);
        C4493y9 c4493y94 = this.i;
        if (c4493y94 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y94.a("m1", "null response. failing");
        }
    }

    public static final void a(AbstractC4168m1 abstractC4168m1, Y y) {
        Intrinsics.checkNotNullExpressionValue("m1", "TAG");
        Objects.toString(y);
        V v = y.b;
        if (v instanceof C4160lj) {
            abstractC4168m1.getClass();
            Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("latency", Long.valueOf(SystemClock.elapsedRealtime() - abstractC4168m1.z.d)), TuplesKt.to("networkType", F5.g()), TuplesKt.to("plId", Long.valueOf(abstractC4168m1.l.a)));
            String str = abstractC4168m1.l.f;
            if (str != null) {
                mutableMapOf.put("plType", str);
            }
            String str2 = abstractC4168m1.l.e;
            if (str2 != null) {
                mutableMapOf.put("adType", str2);
            }
            abstractC4168m1.b("ServerNoFill", mutableMapOf);
            abstractC4168m1.b(y.a, (short) 0);
            return;
        }
        if (v instanceof R6) {
            abstractC4168m1.b(y.a, ((R6) v).a);
            return;
        }
        if (v instanceof S6) {
            abstractC4168m1.b(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(((S6) v).a))));
            abstractC4168m1.b(y.a, (short) 2205);
        } else {
            if (v instanceof C4108jj) {
                abstractC4168m1.b(((C4108jj) v).a);
                abstractC4168m1.b(y.a, (short) 0);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final void a(AbstractC4168m1 abstractC4168m1, GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi) {
        abstractC4168m1.m(gestureDetectorOnGestureListenerC4476xi);
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void a(final GestureDetectorOnGestureListenerC4476xi renderView, final String errorCode) {
        Handler handler;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "onRenderViewSignaledAdFailed " + this);
        }
        if (this.k || o() == null || (handler = this.j) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.inmobi.media.m1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4168m1.a(AbstractC4168m1.this, renderView, errorCode);
            }
        });
    }

    public static final void a(AbstractC4168m1 abstractC4168m1, GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, String str) {
        abstractC4168m1.a(gestureDetectorOnGestureListenerC4476xi, (short) 2137, str);
    }

    public void a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, short s, String failureErrorCode) {
        Intrinsics.checkNotNullParameter(failureErrorCode, "failureErrorCode");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.b("m1", "Render view signaled ad failed, for index " + this.h.indexOf(gestureDetectorOnGestureListenerC4476xi) + " " + this);
        }
        if (gestureDetectorOnGestureListenerC4476xi == null || !Intrinsics.areEqual(gestureDetectorOnGestureListenerC4476xi.getMarkupType(), "htmlUrl")) {
            return;
        }
        b(gestureDetectorOnGestureListenerC4476xi, failureErrorCode);
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void a(HashMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "onAdInteraction " + this);
        }
        if (this.k || o() == null) {
            return;
        }
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y92.a("m1", "Ad interaction. Params: " + params);
        }
        AbstractC4038h1 n = n();
        if (n != null) {
            n.a(params);
        }
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void a(final Fk telemetryOnAdImpression) {
        Gk gk;
        AtomicBoolean atomicBoolean;
        Intrinsics.checkNotNullParameter(telemetryOnAdImpression, "telemetryOnAdImpression");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "onImpressionFiredFromTemplate " + this);
        }
        telemetryOnAdImpression.getClass();
        Intrinsics.checkNotNullParameter("imraid_impressionFired", "<set-?>");
        telemetryOnAdImpression.f = "imraid_impressionFired";
        if (!this.k && o() != null) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y92.a("m1", "onImpressionFiredFromTemplate");
            }
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.inmobi.media.m1$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC4168m1.a(AbstractC4168m1.this, telemetryOnAdImpression);
                    }
                });
                return;
            }
            return;
        }
        C4326s1 c4326s1 = telemetryOnAdImpression.a;
        if (c4326s1 == null || (gk = c4326s1.b) == null || (atomicBoolean = gk.a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap a = telemetryOnAdImpression.a();
            a.put("networkType", F5.g());
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2180);
            String str = telemetryOnAdImpression.d;
            if (str == null) {
                str = "";
            }
            a.put("impressionId", str);
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("AdImpressionSuccessful", a, EnumC4530zk.a);
        }
    }

    public static final void a(AbstractC4168m1 abstractC4168m1, Fk fk) {
        abstractC4168m1.u.a(fk);
    }

    @Override // com.inmobi.media.AbstractC4528zi, com.inmobi.media.InterfaceC4531zl
    public final void a() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "onUserLeaveApplication " + this);
        }
        if (this.k || o() == null) {
            return;
        }
        C4493y9 c4493y92 = this.i;
        if (c4493y92 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y92.a("m1", "User left application");
        }
        AbstractC4038h1 n = n();
        if (n != null) {
            n.e();
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad, Map map) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "updateIdsInTelemetryPayload " + this);
        }
        if (ad != null) {
            map.put("creativeId", ad.getCreativeId());
        }
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void a(String eventType, HashMap kv) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(kv, "kv");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "onRenderViewRequestedAction " + this);
        }
        c(eventType, kv);
    }

    public final void a(String str, Map map) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "addRetryCountToTelemetryEvent event - " + str);
        }
        switch (str.hashCode()) {
            case -1959333523:
                if (!str.equals("RenderSuccess")) {
                    return;
                }
                break;
            case 167123846:
                if (!str.equals("ServerFill")) {
                    return;
                }
                break;
            case 885222501:
                if (!str.equals("ServerError")) {
                    return;
                }
                break;
            case 925075267:
                if (!str.equals("AdLoadSuccessful")) {
                    return;
                }
                break;
            case 1881615718:
                if (!str.equals("AdLoadFailed")) {
                    return;
                }
                break;
            case 1925668903:
                if (!str.equals("ServerNoFill")) {
                    return;
                }
                break;
            default:
                return;
        }
        C4309ra c4309ra = this.v;
        if (c4309ra != null) {
            map.put("retryCount", Integer.valueOf(c4309ra.b));
        }
    }

    public final void a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, LinkedHashSet linkedHashSet) {
        AdConfig.ViewabilityConfig viewability;
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "omidSessionForHtmlMarkup " + this);
        }
        AdConfig adConfig = this.c;
        AdConfig.OmidConfig omidConfig = (adConfig == null || (viewability = adConfig.getViewability()) == null) ? null : viewability.getOmidConfig();
        if (omidConfig == null || omidConfig.isOmidEnabled()) {
            Rf.a.getClass();
            if (Omid.isActive()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    Vk vk = (Vk) it.next();
                    if (3 == vk.a) {
                        try {
                            Intrinsics.checkNotNullParameter("creativeType", "key");
                            Intrinsics.checkNotNullParameter(String.class, "classType");
                            Object obj = vk.b.get("creativeType");
                            String str = (String) (String.class.isInstance(obj) ? String.class.cast(obj) : null);
                            Intrinsics.checkNotNullParameter("customReferenceData", "key");
                            Intrinsics.checkNotNullParameter(String.class, "classType");
                            Object obj2 = vk.b.get("customReferenceData");
                            String str2 = (String) (String.class.isInstance(obj2) ? String.class.cast(obj2) : null);
                            Intrinsics.checkNotNullParameter("isolateVerificationScripts", "key");
                            Intrinsics.checkNotNullParameter(Boolean.class, "classType");
                            Object obj3 = vk.b.get("isolateVerificationScripts");
                            Boolean bool = (Boolean) (Boolean.class.isInstance(obj3) ? Boolean.class.cast(obj3) : null);
                            Intrinsics.checkNotNullParameter("impressionType", "key");
                            Intrinsics.checkNotNullParameter(Byte.class, "classType");
                            Object obj4 = vk.b.get("impressionType");
                            Byte b = (Byte) (Byte.class.isInstance(obj4) ? Byte.class.cast(obj4) : null);
                            C4473xf a = (str == null || bool == null || b == null) ? null : If.a(str, gestureDetectorOnGestureListenerC4476xi, bool.booleanValue(), this.l.m, b.byteValue(), str2);
                            if (a != null) {
                                vk.b.put("omidAdSession", a);
                                vk.b.put("deferred", Boolean.TRUE);
                                C4493y9 c4493y92 = this.i;
                                if (c4493y92 != null) {
                                    Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                                    c4493y92.a("m1", "OMID ad session created and WebView container registered with OMID");
                                }
                            } else {
                                C4493y9 c4493y93 = this.i;
                                if (c4493y93 != null) {
                                    Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                                    c4493y93.a("m1", "Ignoring IAB meta data for this ad markup");
                                }
                            }
                        } catch (Exception e) {
                            C4493y9 c4493y94 = this.i;
                            if (c4493y94 != null) {
                                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                                c4493y94.b("m1", "Setting up impression tracking for IAB encountered an unexpected error: " + e.getMessage());
                            }
                            Lazy lazy = AbstractC3861aa.a;
                            AbstractC4361t9.a(e);
                        }
                    }
                }
            }
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad, String str) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "updateAdForBlob " + this);
        }
        ad.setWebVast(str);
        b(ad);
    }

    public final void a(String blob, String str) {
        Intrinsics.checkNotNullParameter(blob, "blob");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "saveBlob " + this);
        }
        this.g.a(this.a, new C4142l1(this, str, blob, null));
    }

    public final void a(String jsCallbackNamespace, String callback, K2 receiver, String str) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "getBlob " + this);
        }
        this.g.a(this.a, new C4090j1(this, str, receiver, jsCallbackNamespace, callback, null));
    }

    public void a(int i, GestureDetectorOnGestureListenerC4476xi renderView, Context context) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "Show pod ad with index : " + i + " from creative: " + this.h.indexOf(renderView) + " " + this);
        }
        if (i >= 0) {
            this.p = i;
        } else {
            this.p++;
        }
    }

    @Override // com.inmobi.media.InterfaceC4457x0
    public void a(GestureDetectorOnGestureListenerC4476xi renderView, Activity activity) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.c("m1", "closeCurrentPodAd " + this);
        }
    }

    @Override // com.inmobi.media.InterfaceC4457x0
    public boolean a(GestureDetectorOnGestureListenerC4476xi renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 == null) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue("m1", "TAG");
        c4493y9.c("m1", "hasNextAdInAdPod " + this);
        return false;
    }

    @Override // com.inmobi.media.Lk
    public void a(byte b) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "onTimeOut " + this);
        }
        if (b == 0) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y92.a("m1", "AdRequestTimeOut by timer, Adstate=" + ((int) this.b));
            }
            if (this.b != 3) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2109);
                return;
            }
            return;
        }
        if (b != 2 && b != 1) {
            if (b == 4) {
                C4493y9 c4493y93 = this.i;
                if (c4493y93 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                    c4493y93.a("m1", "Show RequestTimeOut by show timer");
                }
                AbstractC4038h1 n = n();
                if (n != null) {
                    n.d();
                    return;
                }
                return;
            }
            C4493y9 c4493y94 = this.i;
            if (c4493y94 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y94.a("m1", "Unknown TimeOut ignored");
                return;
            }
            return;
        }
        C4493y9 c4493y95 = this.i;
        if (c4493y95 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y95.a("m1", "Internal LoadTimeOut by timer, Adstate=" + ((int) this.b));
        }
        if (this.b != 3) {
            this.x.removeCallbacksAndMessages(null);
            C4493y9 c4493y96 = this.i;
            if (c4493y96 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "TAG");
                c4493y96.a("m1", "adUnitEventListener=" + n() + ", Adstate=" + ((int) this.b));
            }
            if (2 == this.b) {
                K();
                i();
                c(AbstractC3998ff.a() == null ? (short) 2139 : (short) 2203);
                AbstractC4038h1 n2 = n();
                if (n2 != null) {
                    n2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            if (1 == this.b) {
                K();
                c((short) 2138);
                AbstractC4038h1 n3 = n();
                if (n3 != null) {
                    n3.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
                }
            }
        }
    }

    public final void a(int i, boolean z) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "Destroying container for index " + i + " " + this);
        }
        CopyOnWriteArrayList list = this.h;
        Intrinsics.checkNotNullParameter(list, "list");
        if (i < 0 || i >= list.size()) {
            return;
        }
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) this.h.get(i);
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            gestureDetectorOnGestureListenerC4476xi.J0.set(z);
            gestureDetectorOnGestureListenerC4476xi.stopLoading();
            gestureDetectorOnGestureListenerC4476xi.b();
        }
        this.h.set(i, null);
    }

    public final void a(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, Integer num, int i) {
        int intValue;
        if (gestureDetectorOnGestureListenerC4476xi != null) {
            intValue = this.h.indexOf(gestureDetectorOnGestureListenerC4476xi);
        } else if (num == null) {
            return;
        } else {
            intValue = num.intValue();
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(intValue);
        if (b != null) {
            Iterator it = Ti.a(b, "pod_abort").iterator();
            while (it.hasNext()) {
                String url = StringsKt.replace$default(StringsKt.replace$default((String) it.next(), "$PODINDEX", String.valueOf(intValue), false, 4, (Object) null), "$REASON", String.valueOf(i), false, 4, (Object) null);
                E3 e3 = E3.a;
                C4493y9 c4493y9 = this.i;
                Intrinsics.checkNotNullParameter(url, "url");
                E3.a(url, true, c4493y9);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void a(GestureDetectorOnGestureListenerC4476xi renderView, String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y9.a("m1", "fireLandingPageTracker " + trackerName + " " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(this.h.indexOf(renderView));
        if (b != null) {
            for (String str : Ti.a(b, trackerName)) {
                String url = str;
                for (Map.Entry entry : macros.entrySet()) {
                    url = StringsKt.replace$default(url, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
                }
                E3 e3 = E3.a;
                C4493y9 c4493y92 = this.i;
                Intrinsics.checkNotNullParameter(url, "url");
                E3.a(url, true, c4493y92);
            }
            return;
        }
        C4493y9 c4493y93 = this.i;
        if (c4493y93 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "TAG");
            c4493y93.a("m1", "fireLandingPageTracker failed");
        }
    }

    @Override // com.inmobi.media.AbstractC4528zi
    public final void a(String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        AbstractC4038h1 n = n();
        if (n != null) {
            n.a(log);
        }
    }

    @Override // com.inmobi.media.Qo
    public final String a(int i, double d) {
        return ((Qo) this.D.getValue()).a(i, d);
    }

    @Override // com.inmobi.media.Qo
    public final String a(double d) {
        return ((Qo) this.D.getValue()).a(d);
    }
}
