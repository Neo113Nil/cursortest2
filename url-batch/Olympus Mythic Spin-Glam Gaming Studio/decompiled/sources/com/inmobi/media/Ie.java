package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.network.common.model.LandingPageParam;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.inmobiJson.model.CTA;
import com.inmobi.media.ads.network.inmobiJson.model.Description;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.Link;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.ads.network.inmobiJson.model.Title;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes12.dex */
public final class Ie extends AbstractC4483y {
    public final Ni b;
    public final C4106jh c;
    public final L4 d;
    public final AbstractC3984f1 e;
    public final C3864ad f;
    public final Rc g;
    public final CoroutineScope h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ie(Ni renderedStateCache, C4106jh publisherNativeViewData, L4 contextualDataHandler, AbstractC3984f1 adSessionManager, C3864ad nativeBeaconProcessor, Rc nativeAdUnitComponent) {
        super(nativeAdUnitComponent.a);
        Intrinsics.checkNotNullParameter(renderedStateCache, "renderedStateCache");
        Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        this.b = renderedStateCache;
        this.c = publisherNativeViewData;
        this.d = contextualDataHandler;
        this.e = adSessionManager;
        this.f = nativeBeaconProcessor;
        this.g = nativeAdUnitComponent;
        this.h = X4.a(k());
        this.i = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Ie$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Ie.g(Ie.this);
            }
        });
        this.j = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Ie$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Ie.c(Ie.this);
            }
        });
        this.k = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Ie$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Ie.e(Ie.this);
            }
        });
        this.l = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Ie$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Ie.h(Ie.this);
            }
        });
        this.m = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Ie$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Ie.b(Ie.this);
            }
        });
        this.n = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Ie$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Ie.a(Ie.this);
            }
        });
        this.o = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Ie$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Ie.f(Ie.this);
            }
        });
        this.p = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Ie$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Ie.d(Ie.this);
            }
        });
    }

    public static final Ii a(Ie ie) {
        return new Ii(ie.d, ie.e, ie.g);
    }

    public static final C3996fd b(Ie ie) {
        Rc rc = ie.g;
        AbstractC3984f1 clickSession = ie.e;
        L4 contextualDataHandler = ie.d;
        C3864ad nativeBeaconProcessor = ie.f;
        C4444wd nativeLandingPageHandler = (C4444wd) ie.p.getValue();
        InterfaceC4466x9 l = ie.l();
        Intrinsics.checkNotNullParameter(rc, "<this>");
        Intrinsics.checkNotNullParameter(clickSession, "clickSession");
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeLandingPageHandler, "nativeLandingPageHandler");
        Intrinsics.checkNotNullParameter(rc, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonAssetObject assetsObject = rc.b.getAssetsObject();
        if (assetsObject != null) {
            Title title = assetsObject.getTitle();
            if (title != null) {
                Link link = title.getLink();
                linkedHashMap.put((short) 3, new Xc(link != null ? link.getUrl() : null, title.getTrackers()));
            }
            Description description = assetsObject.getDescription();
            if (description != null) {
                Link link2 = description.getLink();
                linkedHashMap.put((short) 4, new Xc(link2 != null ? link2.getUrl() : null, description.getTrackers()));
            }
            Icon icon = assetsObject.getIcon();
            if (icon != null) {
                Link link3 = icon.getLink();
                linkedHashMap.put((short) 5, new Xc(link3 != null ? link3.getUrl() : null, icon.getTrackers()));
            }
            CTA cta = assetsObject.getCta();
            if (cta != null) {
                Link link4 = cta.getLink();
                linkedHashMap.put((short) 6, new Xc(link4 != null ? link4.getUrl() : null, cta.getTrackers()));
            }
            Image adChoice = assetsObject.getAdChoice();
            if (adChoice != null) {
                Link link5 = adChoice.getLink();
                linkedHashMap.put((short) 7, new Xc(link5 != null ? link5.getUrl() : null, adChoice.getTrackers()));
            } else {
                linkedHashMap.put((short) 7, new Xc(rc.a.b.a.b.getNative().getAdChoiceConfig().getLink(), CollectionsKt.emptyList()));
            }
        }
        return new C3996fd(nativeLandingPageHandler, clickSession, contextualDataHandler, nativeBeaconProcessor, new C3968ed(rc.e, new Si(linkedHashMap, rc.b.getMainLink(), rc.a.b.g)), l);
    }

    public static final C4338sd c(Ie ie) {
        CoroutineScope coroutineScope = ie.h;
        Tn tn = (Tn) ie.i.getValue();
        Rc rc = ie.g;
        Intrinsics.checkNotNullParameter(rc, "<this>");
        AdConfig.NativeViewabilityConfig viewabilityConfig = rc.a.b.a.b.getNative().getViewabilityConfig();
        F f = rc.a.b.m;
        Wn wn = new Wn(viewabilityConfig.getImpressionConfig().getPollInterval(), f.d, Gl.a(viewabilityConfig.getParentMinDimension().getDimensions()), f.c);
        MutableStateFlow mutableStateFlow = ((Xo) ie.l.getValue()).b;
        ie.l();
        return new C4338sd(coroutineScope, tn, wn, mutableStateFlow);
    }

    public static final C4444wd d(Ie ie) {
        String str;
        String str2;
        List<LandingPageParam> landingPageParams;
        LandingPageParam landingPageParam;
        List<LandingPageParam> landingPageParams2;
        LandingPageParam landingPageParam2;
        Context context = ie.g.a.a.b;
        G g = ie.a.b;
        MetaInfo metaInfo = g.d;
        boolean z = (metaInfo == null || (landingPageParams2 = metaInfo.getLandingPageParams()) == null || (landingPageParam2 = (LandingPageParam) CollectionsKt.getOrNull(landingPageParams2, 0)) == null || !landingPageParam2.getSupportLockScreen()) ? false : true;
        G g2 = ie.a.b;
        C3868ah c3868ah = g2.a.a;
        long j = c3868ah.a;
        String str3 = g2.m.b;
        String str4 = c3868ah.h;
        String str5 = g2.c;
        MetaInfo metaInfo2 = g2.d;
        if (metaInfo2 == null || (str = metaInfo2.getCreativeType()) == null) {
            str = "unknown";
        }
        String str6 = str;
        String str7 = ie.g.a.b.i;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = str7;
        G g3 = ie.a.b;
        boolean z2 = g3.b.a;
        MetaInfo metaInfo3 = g3.d;
        if (metaInfo3 == null || (landingPageParams = metaInfo3.getLandingPageParams()) == null || (landingPageParam = (LandingPageParam) CollectionsKt.getOrNull(landingPageParams, 0)) == null || (str2 = landingPageParam.getOpenMode()) == null) {
            str2 = "DEFAULT";
        }
        return new C4444wd(new C4471xd(context, g, z, new C4178mb(j, str3, str4, "native", str5, str6, str8, z2, str2), (Qc) ie.g.f.getValue(), ie.g.c, ie.l()));
    }

    public static final Sd e(Ie ie) {
        AbstractC4075ic s5;
        NativeMedia media;
        NativeVideo video;
        CoroutineScope coroutineScope = ie.h;
        Rc rc = ie.g;
        Tn viewHolderConfig = (Tn) ie.i.getValue();
        Intrinsics.checkNotNullParameter(rc, "<this>");
        Intrinsics.checkNotNullParameter(viewHolderConfig, "viewHolderConfig");
        E e = rc.a.b.n;
        InMobiJsonResponse inMobiJsonResponse = rc.b;
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "<this>");
        JsonAssetObject assetsObject = inMobiJsonResponse.getAssetsObject();
        if ((assetsObject == null || (media = assetsObject.getMedia()) == null || (video = media.getVideo()) == null) ? false : video.getRequired()) {
            s5 = new C4191mn(((C4496yc) rc.g.getValue()).e, e.a);
        } else {
            AdConfig.NativeViewabilityConfig viewabilityConfig = rc.a.b.a.b.getNative().getViewabilityConfig();
            s5 = new S5(viewHolderConfig, new Wn(viewabilityConfig.getImpressionConfig().getPollInterval(), e.b, Gl.a(viewabilityConfig.getParentMinDimension().getDimensions()), e.a));
        }
        return new Sd(coroutineScope, s5, ((Xo) ie.l.getValue()).b);
    }

    public static final C4158lh f(Ie ie) {
        ie.getClass();
        return new C4158lh();
    }

    public static final Tn g(Ie ie) {
        NativeMedia media;
        NativeImage image;
        Icon icon;
        NativeMedia media2;
        NativeVideo video;
        NativeMedia media3;
        NativeMedia media4;
        Rc rc = ie.g;
        C4106jh publisherNativeViewData = ie.c;
        Intrinsics.checkNotNullParameter(rc, "<this>");
        Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        AdConfig.NativeConfig nativeConfig = rc.a.b.a.b.getNative();
        JsonAssetObject assetsObject = rc.b.getAssetsObject();
        Boolean bool = null;
        String type = (assetsObject == null || (media4 = assetsObject.getMedia()) == null) ? null : media4.getType();
        InMobiJsonResponse inMobiJsonResponse = rc.b;
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "<this>");
        JsonAssetObject assetsObject2 = inMobiJsonResponse.getAssetsObject();
        if (Intrinsics.areEqual((assetsObject2 == null || (media3 = assetsObject2.getMedia()) == null) ? null : media3.getType(), "video")) {
            JsonAssetObject assetsObject3 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject3 != null && (media2 = assetsObject3.getMedia()) != null && (video = media2.getVideo()) != null) {
                bool = Boolean.valueOf(video.getRequired());
            }
        } else {
            JsonAssetObject assetsObject4 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject4 != null && (media = assetsObject4.getMedia()) != null && (image = media.getImage()) != null) {
                bool = Boolean.valueOf(image.getRequired());
            }
        }
        boolean z = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (Intrinsics.areEqual(type, "video")) {
            if (!booleanValue) {
                z = true;
            }
        } else if (assetsObject != null && (icon = assetsObject.getIcon()) != null) {
            z = icon.getRequired();
        }
        return new Tn(z, booleanValue, Gl.a(nativeConfig.getViewabilityConfig().getIconMinDimension().getDimensions()), Gl.a(nativeConfig.getViewabilityConfig().getMediaMinDimension().getDimensions()), publisherNativeViewData);
    }

    public static final Xo h(Ie ie) {
        return new Xo(ie.a.b.a.b.getViewability().getWindowPollingInterval(), ie.h, ie.c.a.getParentView(), ie.l());
    }
}
