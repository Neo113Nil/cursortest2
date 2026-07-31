package com.revenuecat.purchases.hybridcommon.mappers;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: OfferingsMapper.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004H\u0002\u001a\u001a\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0005H\u0002\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0006\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0007\u001a\u0016\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\b\u001a,\u0010\t\u001a\u00020\n*\u00020\u00042 \u0010\u000b\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u0012\u0004\u0012\u00020\n0\f\u001a,\u0010\t\u001a\u00020\n*\u00020\u00052 \u0010\u000b\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u0012\u0004\u0012\u00020\n0\f¨\u0006\r"}, d2 = {"map", "", "", "", "Lcom/revenuecat/purchases/Offering;", "Lcom/revenuecat/purchases/Offerings;", "Lcom/revenuecat/purchases/Package;", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "mapAsync", "", "callback", "Lkotlin/Function1;", "hybridcommon_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferingsMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Object> map(Offerings offerings) {
        Pair[] pairArr = new Pair[2];
        Map<String, Offering> all = offerings.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(all.size()));
        Iterator<T> it = all.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), map((Offering) entry.getValue()));
        }
        pairArr[0] = TuplesKt.to("all", linkedHashMap);
        Offering current = offerings.getCurrent();
        pairArr[1] = TuplesKt.to("current", current != null ? map(current) : null);
        return MapsKt.mapOf(pairArr);
    }

    public static final void mapAsync(Offerings offerings, Function1<? super Map<String, ? extends Object>, Unit> callback) {
        Intrinsics.checkNotNullParameter(offerings, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(MappersHelpersKt.getMainScope(), null, null, new OfferingsMapperKt$mapAsync$1(callback, offerings, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Object> map(Offering offering) {
        Pair[] pairArr = new Pair[11];
        pairArr[0] = TuplesKt.to(NotificationsService.IDENTIFIER_KEY, offering.getIdentifier());
        pairArr[1] = TuplesKt.to("serverDescription", offering.getServerDescription());
        pairArr[2] = TuplesKt.to(TtmlNode.TAG_METADATA, offering.getMetadata());
        List<Package> availablePackages = offering.getAvailablePackages();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(availablePackages, 10));
        Iterator<T> it = availablePackages.iterator();
        while (it.hasNext()) {
            arrayList.add(map((Package) it.next()));
        }
        pairArr[3] = TuplesKt.to("availablePackages", arrayList);
        Package lifetime = offering.getLifetime();
        pairArr[4] = TuplesKt.to("lifetime", lifetime != null ? map(lifetime) : null);
        Package annual = offering.getAnnual();
        pairArr[5] = TuplesKt.to("annual", annual != null ? map(annual) : null);
        Package sixMonth = offering.getSixMonth();
        pairArr[6] = TuplesKt.to("sixMonth", sixMonth != null ? map(sixMonth) : null);
        Package threeMonth = offering.getThreeMonth();
        pairArr[7] = TuplesKt.to("threeMonth", threeMonth != null ? map(threeMonth) : null);
        Package twoMonth = offering.getTwoMonth();
        pairArr[8] = TuplesKt.to("twoMonth", twoMonth != null ? map(twoMonth) : null);
        Package monthly = offering.getMonthly();
        pairArr[9] = TuplesKt.to("monthly", monthly != null ? map(monthly) : null);
        Package weekly = offering.getWeekly();
        pairArr[10] = TuplesKt.to("weekly", weekly != null ? map(weekly) : null);
        return MapsKt.mapOf(pairArr);
    }

    public static final void mapAsync(Offering offering, Function1<? super Map<String, ? extends Object>, Unit> callback) {
        Intrinsics.checkNotNullParameter(offering, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(MappersHelpersKt.getMainScope(), null, null, new OfferingsMapperKt$mapAsync$2(callback, offering, null), 3, null);
    }

    public static final Map<String, Object> map(Package r3) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        return MapsKt.mapOf(TuplesKt.to(NotificationsService.IDENTIFIER_KEY, r3.getIdentifier()), TuplesKt.to("packageType", r3.getPackageType().name()), TuplesKt.to("product", StoreProductMapperKt.map(r3.getProduct())), TuplesKt.to("offeringIdentifier", r3.getPresentedOfferingContext().getOfferingIdentifier()), TuplesKt.to("presentedOfferingContext", map(r3.getPresentedOfferingContext())));
    }

    public static final Map<String, Object> map(PresentedOfferingContext presentedOfferingContext) {
        Intrinsics.checkNotNullParameter(presentedOfferingContext, "<this>");
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("offeringIdentifier", presentedOfferingContext.getOfferingIdentifier());
        pairArr[1] = TuplesKt.to("placementIdentifier", presentedOfferingContext.getPlacementIdentifier());
        PresentedOfferingContext.TargetingContext targetingContext = presentedOfferingContext.getTargetingContext();
        pairArr[2] = TuplesKt.to("targetingContext", targetingContext != null ? map(targetingContext) : null);
        return MapsKt.mapOf(pairArr);
    }

    public static final Map<String, Object> map(PresentedOfferingContext.TargetingContext targetingContext) {
        Intrinsics.checkNotNullParameter(targetingContext, "<this>");
        return MapsKt.mapOf(TuplesKt.to("revision", Integer.valueOf(targetingContext.getRevision())), TuplesKt.to("ruleId", targetingContext.getRuleId()));
    }
}
