package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public abstract class W0 {
    public static void a(AdResponse adResponse, C4493y9 c4493y9, Function1 onFetchEvent) {
        MetaInfo metaInfo;
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(onFetchEvent, "onFetchEvent");
        Objects.toString(adResponse);
        AdSet adSet = (AdSet) CollectionsKt.getOrNull(adResponse.getAdSets(), 0);
        if (StringsKt.trim(adResponse.getRequestId()).toString().length() == 0) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4108jj(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2208))));
        }
        if (adResponse.getAdSets().isEmpty()) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new C4160lj((short) 54));
        }
        if (adSet == null) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4160lj((short) 2364));
        }
        if (adSet.getAds().isEmpty()) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new C4160lj((short) 54));
        }
        com.inmobi.media.ads.network.common.model.Ad ad = (com.inmobi.media.ads.network.common.model.Ad) CollectionsKt.getOrNull(adSet.getAds(), 0);
        String creativeType = (ad == null || (metaInfo = ad.getMetaInfo()) == null) ? null : metaInfo.getCreativeType();
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("isRewarded", Boolean.valueOf(adSet.getIsRewarded())));
        if (creativeType != null) {
            mutableMapOf.put("creativeType", creativeType);
        }
        onFetchEvent.invoke(new C4134kj(mutableMapOf));
        a(adSet.getAdSetId(), adSet.getIsRewarded());
        a(adSet, c4493y9);
    }

    public static void a(String str, boolean z) {
        if (str.length() != 0) {
            return;
        }
        throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4108jj(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2231), TuplesKt.to("isRewarded", Boolean.valueOf(z)))));
    }

    public static void a(AdSet adSet, C4493y9 c4493y9) {
        Objects.toString(adSet);
        if (adSet.getAds().peekFirst() != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            for (Object obj : adSet.getAds()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                com.inmobi.media.ads.network.common.model.Ad ad = (com.inmobi.media.ads.network.common.model.Ad) obj;
                if (i == 0) {
                    a(ad);
                } else {
                    try {
                        a(ad);
                        Unit unit = Unit.INSTANCE;
                    } catch (Y e) {
                        if (c4493y9 != null) {
                            c4493y9.b("AdResponseValidator", "validateAdObjects Exception: (Index: " + i + ") - " + e);
                        }
                        linkedHashSet.add(ad);
                    }
                }
                i = i2;
            }
            adSet.getAds().removeAll(linkedHashSet);
            return;
        }
        throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4108jj(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2116), TuplesKt.to("isRewarded", Boolean.valueOf(adSet.getIsRewarded())))));
    }

    public static void a(com.inmobi.media.ads.network.common.model.Ad ad) {
        Objects.toString(ad);
        if (ad.getImpressionId().length() != 0) {
            String type = ad.getMarkupType();
            Intrinsics.checkNotNullParameter(type, "type");
            if ((Intrinsics.areEqual(type, "html") || Intrinsics.areEqual(type, "inmobiJson") || Intrinsics.areEqual(type, "htmlUrl")) && !Intrinsics.areEqual(ad.getMarkupType(), "unknown")) {
                try {
                    ad.getPubContent().a();
                    return;
                } catch (IllegalArgumentException unused) {
                    throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4108jj(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2163))));
                }
            }
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4108jj(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2163))));
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2230);
        throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4108jj(hashMap));
    }
}
