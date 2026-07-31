package io.appmetrica.analytics.adrevenue.applovin.v12.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.pubmatic.sdk.common.POBCommonConstants;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class b implements ModuleAdRevenueProcessor {
    public final a a;
    public final ClientContext b;

    public b(@NotNull a aVar, @NotNull ClientContext clientContext) {
        this.a = aVar;
        this.b = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    @NotNull
    public final String getDescription() {
        return "AppLovin";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(@NotNull Object... objArr) {
        String str;
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, MaxAd.class, AppLovinSdk.class)) {
            return false;
        }
        Object orNull = ArraysKt.getOrNull(objArr, 0);
        Intrinsics.checkNotNull(orNull, "null cannot be cast to non-null type com.applovin.mediation.MaxAd");
        MaxAd maxAd = (MaxAd) orNull;
        Object orNull2 = ArraysKt.getOrNull(objArr, 1);
        Intrinsics.checkNotNull(orNull2, "null cannot be cast to non-null type com.applovin.sdk.AppLovinSdk");
        AppLovinSdk appLovinSdk = (AppLovinSdk) orNull2;
        this.a.getClass();
        MaxAdFormat format = maxAd.getFormat();
        ModuleAdType moduleAdType = format == null ? null : Intrinsics.areEqual(format, MaxAdFormat.NATIVE) ? ModuleAdType.NATIVE : Intrinsics.areEqual(format, MaxAdFormat.BANNER) ? ModuleAdType.BANNER : Intrinsics.areEqual(format, MaxAdFormat.REWARDED) ? ModuleAdType.REWARDED : Intrinsics.areEqual(format, MaxAdFormat.INTERSTITIAL) ? ModuleAdType.INTERSTITIAL : Intrinsics.areEqual(format, MaxAdFormat.MREC) ? ModuleAdType.MREC : ModuleAdType.OTHER;
        Pair pair = TuplesKt.to("countryCode", appLovinSdk.getConfiguration().getCountryCode());
        Pair pair2 = TuplesKt.to(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-applovin-v12");
        MaxAdFormat format2 = maxAd.getFormat();
        if (format2 == null || (str = format2.getLabel()) == null) {
            str = POBCommonConstants.NULL_VALUE;
        }
        this.b.getInternalClientModuleFacade().reportAdRevenue(new ModuleAdRevenue(BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(maxAd.getRevenue(), 0.0d)), Currency.getInstance("USD"), moduleAdType, maxAd.getNetworkName(), maxAd.getAdUnitId(), null, maxAd.getNetworkPlacement(), maxAd.getPlacement(), maxAd.getRevenuePrecision(), MapsKt.mapOf(pair, pair2, TuplesKt.to(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, str), TuplesKt.to("source", "applovin")), false, 32, null));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AppLovin with values " + Arrays.toString(objArr) + " was reported", new Object[0]);
        return true;
    }
}
