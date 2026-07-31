package com.revenuecat.purchases.common;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.revenuecat.purchases.JsonTools;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.OfferingsKt;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import expo.modules.notifications.service.NotificationsService;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: OfferingParser.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J>\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007J4\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J,\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0017\u001a\u00020\u0006H$¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/common/OfferingParser;", "", "()V", "createOffering", "Lcom/revenuecat/purchases/Offering;", "offeringJson", "Lorg/json/JSONObject;", "productsById", "", "", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "uiConfig", "Lcom/revenuecat/purchases/UiConfig;", "createOfferings", "Lcom/revenuecat/purchases/Offerings;", "offeringsJson", "originalSource", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "loadedFromDiskCache", "", "createPackage", "Lcom/revenuecat/purchases/Package;", "packageJson", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "findMatchingProduct", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class OfferingParser {
    public final Offerings createOfferings(JSONObject offeringsJson, Map<String, ? extends List<? extends StoreProduct>> productsById) {
        Intrinsics.checkNotNullParameter(offeringsJson, "offeringsJson");
        Intrinsics.checkNotNullParameter(productsById, "productsById");
        return createOfferings$default(this, offeringsJson, productsById, null, false, 12, null);
    }

    public final Offerings createOfferings(JSONObject offeringsJson, Map<String, ? extends List<? extends StoreProduct>> productsById, HTTPResponseOriginalSource originalSource) {
        Intrinsics.checkNotNullParameter(offeringsJson, "offeringsJson");
        Intrinsics.checkNotNullParameter(productsById, "productsById");
        Intrinsics.checkNotNullParameter(originalSource, "originalSource");
        return createOfferings$default(this, offeringsJson, productsById, originalSource, false, 8, null);
    }

    protected abstract StoreProduct findMatchingProduct(Map<String, ? extends List<? extends StoreProduct>> productsById, JSONObject packageJson);

    public static /* synthetic */ Offerings createOfferings$default(OfferingParser offeringParser, JSONObject jSONObject, Map map, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createOfferings");
        }
        if ((i & 4) != 0) {
            hTTPResponseOriginalSource = HTTPResponseOriginalSource.MAIN;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return offeringParser.createOfferings(jSONObject, map, hTTPResponseOriginalSource, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x030e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Offerings createOfferings(JSONObject offeringsJson, final Map<String, ? extends List<? extends StoreProduct>> productsById, HTTPResponseOriginalSource originalSource, boolean loadedFromDiskCache) {
        UiConfig uiConfig;
        int length;
        int i;
        JSONObject optJSONObject;
        Offerings.Targeting targeting;
        JSONObject optJSONObject2;
        Offerings.Placements placements;
        Offering offering;
        Offerings.Placements placements2;
        LinkedHashMap linkedHashMap;
        Map map$default;
        Offerings.Targeting targeting2;
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(offeringsJson, "offeringsJson");
        Intrinsics.checkNotNullParameter(productsById, "productsById");
        Intrinsics.checkNotNullParameter(originalSource, "originalSource");
        final LogIntent logIntent = LogIntent.DEBUG;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.common.OfferingParser$createOfferings$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                String format = String.format(OfferingStrings.BUILDING_OFFERINGS, Arrays.copyOf(new Object[]{Integer.valueOf(productsById.size())}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return append.append(format).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        JSONArray jSONArray = offeringsJson.getJSONArray("offerings");
        String string = offeringsJson.getString("current_offering_id");
        JSONObject optJSONObject3 = offeringsJson.optJSONObject("ui_config");
        if (optJSONObject3 != null) {
            try {
                Json json = JsonTools.INSTANCE.getJson();
                String jSONObject = optJSONObject3.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "it.toString()");
                json.getSerializersModule();
                uiConfig = (UiConfig) json.decodeFromString(UiConfig.INSTANCE.serializer(), jSONObject);
            } catch (Throwable th) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error deserializing ui_config", th);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            length = jSONArray.length();
            for (i = 0; i < length; i++) {
                JSONObject offeringJson = jSONArray.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(offeringJson, "offeringJson");
                Offering createOffering = createOffering(offeringJson, productsById, uiConfig);
                if (createOffering != null) {
                    linkedHashMap2.put(createOffering.getIdentifier(), createOffering);
                    if (createOffering.getAvailablePackages().isEmpty()) {
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            String str2 = "[Purchases] - " + logLevel10.name();
                            String format = String.format(OfferingStrings.OFFERING_EMPTY, Arrays.copyOf(new Object[]{createOffering.getIdentifier()}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            currentLogHandler7.w(str2, format);
                        }
                    }
                }
            }
            optJSONObject = offeringsJson.optJSONObject("targeting");
            if (optJSONObject == null) {
                Integer optNullableInt = JSONObjectExtensionsKt.optNullableInt(optJSONObject, "revision");
                String optNullableString = JSONObjectExtensionsKt.optNullableString(optJSONObject, "rule_id");
                if (optNullableInt == null || optNullableString == null) {
                    LogLevel logLevel11 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel11.name(), OfferingStrings.TARGETING_ERROR);
                    }
                    targeting2 = null;
                } else {
                    targeting2 = new Offerings.Targeting(optNullableInt.intValue(), optNullableString);
                }
                targeting = targeting2;
            } else {
                targeting = null;
            }
            optJSONObject2 = offeringsJson.optJSONObject("placements");
            if (optJSONObject2 != null) {
                String nullableString = JSONObjectExtensionsKt.getNullableString(optJSONObject2, "fallback_offering_id");
                JSONObject optJSONObject4 = optJSONObject2.optJSONObject("offering_ids_by_placement");
                Map replaceJsonNullWithKotlinNull = (optJSONObject4 == null || (map$default = JSONObjectExtensionsKt.toMap$default(optJSONObject4, false, 1, null)) == null) ? null : JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull(map$default);
                if (replaceJsonNullWithKotlinNull != null) {
                    placements = new Offerings.Placements(nullableString, replaceJsonNullWithKotlinNull);
                    offering = (Offering) linkedHashMap2.get(string);
                    Offering offering2 = null;
                    if (offering != null) {
                        placements2 = placements;
                        linkedHashMap = linkedHashMap2;
                        offering2 = OfferingsKt.withPresentedContext(offering, null, targeting);
                    } else {
                        placements2 = placements;
                        linkedHashMap = linkedHashMap2;
                    }
                    return new Offerings(offering2, linkedHashMap, placements2, targeting, originalSource, loadedFromDiskCache);
                }
            }
            placements = null;
            offering = (Offering) linkedHashMap2.get(string);
            Offering offering22 = null;
            if (offering != null) {
            }
            return new Offerings(offering22, linkedHashMap, placements2, targeting, originalSource, loadedFromDiskCache);
        }
        uiConfig = null;
        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
        length = jSONArray.length();
        while (i < length) {
        }
        optJSONObject = offeringsJson.optJSONObject("targeting");
        if (optJSONObject == null) {
        }
        optJSONObject2 = offeringsJson.optJSONObject("placements");
        if (optJSONObject2 != null) {
        }
        placements = null;
        offering = (Offering) linkedHashMap22.get(string);
        Offering offering222 = null;
        if (offering != null) {
        }
        return new Offerings(offering222, linkedHashMap, placements2, targeting, originalSource, loadedFromDiskCache);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Offering createOffering(JSONObject offeringJson, Map<String, ? extends List<? extends StoreProduct>> productsById, UiConfig uiConfig) {
        Map emptyMap;
        PaywallData paywallData;
        JSONObject optJSONObject;
        PaywallComponentsData paywallComponentsData;
        URL webCheckoutURL;
        Intrinsics.checkNotNullParameter(offeringJson, "offeringJson");
        Intrinsics.checkNotNullParameter(productsById, "productsById");
        String offeringIdentifier = offeringJson.getString(NotificationsService.IDENTIFIER_KEY);
        JSONObject optJSONObject2 = offeringJson.optJSONObject(TtmlNode.TAG_METADATA);
        if (optJSONObject2 == null || (emptyMap = JSONObjectExtensionsKt.toMap(optJSONObject2, true)) == null) {
            emptyMap = MapsKt.emptyMap();
        }
        Map map = emptyMap;
        JSONArray jSONArray = offeringJson.getJSONArray("packages");
        Intrinsics.checkNotNullExpressionValue(offeringIdentifier, "offeringIdentifier");
        PresentedOfferingContext presentedOfferingContext = new PresentedOfferingContext(offeringIdentifier);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject packageJson = jSONArray.getJSONObject(i);
            Intrinsics.checkNotNullExpressionValue(packageJson, "packageJson");
            Package createPackage = createPackage(packageJson, productsById, presentedOfferingContext);
            if (createPackage != null) {
                arrayList.add(createPackage);
            }
        }
        JSONObject optJSONObject3 = offeringJson.optJSONObject("paywall");
        if (optJSONObject3 != null) {
            try {
                Json json = JsonTools.INSTANCE.getJson();
                String jSONObject = optJSONObject3.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "it.toString()");
                json.getSerializersModule();
                paywallData = (PaywallData) json.decodeFromString(PaywallData.INSTANCE.serializer(), jSONObject);
            } catch (Exception e) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error deserializing paywall data", e);
            }
            optJSONObject = offeringJson.optJSONObject("paywall_components");
            if (optJSONObject != null) {
                try {
                    Json json2 = JsonTools.INSTANCE.getJson();
                    String jSONObject2 = optJSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "it.toString()");
                    json2.getSerializersModule();
                    paywallComponentsData = (PaywallComponentsData) json2.decodeFromString(PaywallComponentsData.INSTANCE.serializer(), jSONObject2);
                } catch (Throwable th) {
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error deserializing paywall components data", th);
                }
                Offering.PaywallComponents paywallComponents = (paywallComponentsData != null || uiConfig == null) ? null : new Offering.PaywallComponents(uiConfig, paywallComponentsData);
                webCheckoutURL = OfferingParserKt.getWebCheckoutURL(offeringJson);
                if (arrayList.isEmpty()) {
                    return null;
                }
                String string = offeringJson.getString("description");
                Intrinsics.checkNotNullExpressionValue(string, "offeringJson.getString(\"description\")");
                return new Offering(offeringIdentifier, string, map, arrayList, paywallData, paywallComponents, webCheckoutURL);
            }
            paywallComponentsData = null;
            if (paywallComponentsData != null) {
            }
            webCheckoutURL = OfferingParserKt.getWebCheckoutURL(offeringJson);
            if (arrayList.isEmpty()) {
            }
        }
        paywallData = null;
        optJSONObject = offeringJson.optJSONObject("paywall_components");
        if (optJSONObject != null) {
        }
        paywallComponentsData = null;
        if (paywallComponentsData != null) {
        }
        webCheckoutURL = OfferingParserKt.getWebCheckoutURL(offeringJson);
        if (arrayList.isEmpty()) {
        }
    }

    public final Package createPackage(JSONObject packageJson, Map<String, ? extends List<? extends StoreProduct>> productsById, PresentedOfferingContext presentedOfferingContext) {
        PackageType packageType;
        URL webCheckoutURL;
        Intrinsics.checkNotNullParameter(packageJson, "packageJson");
        Intrinsics.checkNotNullParameter(productsById, "productsById");
        Intrinsics.checkNotNullParameter(presentedOfferingContext, "presentedOfferingContext");
        String packageIdentifier = packageJson.getString(NotificationsService.IDENTIFIER_KEY);
        StoreProduct findMatchingProduct = findMatchingProduct(productsById, packageJson);
        Intrinsics.checkNotNullExpressionValue(packageIdentifier, "packageIdentifier");
        packageType = OfferingParserKt.toPackageType(packageIdentifier);
        webCheckoutURL = OfferingParserKt.getWebCheckoutURL(packageJson);
        if (findMatchingProduct != null) {
            return new Package(packageIdentifier, packageType, findMatchingProduct.copyWithPresentedOfferingContext(presentedOfferingContext), presentedOfferingContext, webCheckoutURL);
        }
        return null;
    }
}
