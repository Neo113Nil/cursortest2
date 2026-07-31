package com.revenuecat.purchases.amazon;

import com.amazon.a.a.o.b;
import com.amazon.a.a.o.b.f;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductType;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: storeProductConversions.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u0004H\u0000\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"pattern", "Ljava/util/regex/Pattern;", "createPeriod", "Lcom/revenuecat/purchases/models/Period;", "", "createPrice", "Lcom/revenuecat/purchases/models/Price;", b.m, "parsePriceUsingRegex", "Ljava/math/BigDecimal;", "toStoreProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/amazon/device/iap/model/Product;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StoreProductConversionsKt {
    private static final Pattern pattern;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0208, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final StoreProduct toStoreProduct(final Product product, String marketplace) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(product, "<this>");
        Intrinsics.checkNotNullParameter(marketplace, "marketplace");
        if (product.getPrice() != null) {
            String price = product.getPrice();
            Intrinsics.checkNotNullExpressionValue(price, "price");
            Price createPrice = createPrice(price, marketplace);
            String sku = product.getSku();
            Intrinsics.checkNotNullExpressionValue(sku, "sku");
            ProductType productType = product.getProductType();
            Intrinsics.checkNotNullExpressionValue(productType, "productType");
            com.revenuecat.purchases.ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productType);
            String title = product.getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "title");
            String title2 = product.getTitle();
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            String description = product.getDescription();
            Intrinsics.checkNotNullExpressionValue(description, "description");
            String subscriptionPeriod = product.getSubscriptionPeriod();
            Period createPeriod = subscriptionPeriod != null ? createPeriod(subscriptionPeriod) : null;
            String smallIconUrl = product.getSmallIconUrl();
            Intrinsics.checkNotNullExpressionValue(smallIconUrl, "smallIconUrl");
            String freeTrialPeriod = product.getFreeTrialPeriod();
            Period createPeriod2 = freeTrialPeriod != null ? createPeriod(freeTrialPeriod) : null;
            JSONObject json = product.toJSON();
            Intrinsics.checkNotNullExpressionValue(json, "this.toJSON()");
            return new AmazonStoreProduct(sku, revenueCatProductType, title, title2, description, createPeriod, createPrice, (SubscriptionOptions) null, (SubscriptionOption) null, smallIconUrl, createPeriod2, json, (PresentedOfferingContext) null);
        }
        final LogIntent logIntent = LogIntent.AMAZON_ERROR;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.amazon.StoreProductConversionsKt$toStoreProduct$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                String format = String.format(AmazonStrings.PRODUCT_PRICE_MISSING, Arrays.copyOf(new Object[]{product.getSku()}, 1));
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
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r9.equals("SemiAnnual") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        return new com.revenuecat.purchases.models.Period(6, com.revenuecat.purchases.models.Period.Unit.MONTH, "P6M");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r9.equals("SemiAnnually") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r9.equals("Annually") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r9.equals("Annual") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0072, code lost:
    
        return new com.revenuecat.purchases.models.Period(1, com.revenuecat.purchases.models.Period.Unit.YEAR, "P1Y");
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Period createPeriod(String str) {
        List split$default;
        String str2;
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case -2115097178:
                if (str.equals("BiMonthly")) {
                    return new Period(2, Period.Unit.MONTH, "P2M");
                }
                split$default = StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null);
                if (split$default.size() != 2) {
                    split$default = null;
                }
                if (split$default != null || (str2 = (String) CollectionsKt.firstOrNull(split$default)) == null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) {
                    return null;
                }
                int intValue = intOrNull.intValue();
                String valueOf = String.valueOf(StringsKt.first((CharSequence) split$default.get(1)));
                Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                return Period.INSTANCE.create("P" + intValue + upperCase);
            case -1707840351:
                if (str.equals("Weekly")) {
                    return new Period(1, Period.Unit.WEEK, "P1W");
                }
                split$default = StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null);
                if (split$default.size() != 2) {
                }
                if (split$default != null) {
                    break;
                }
                return null;
            case -1393678355:
                if (str.equals("Monthly")) {
                    return new Period(1, Period.Unit.MONTH, "P1M");
                }
                split$default = StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null);
                if (split$default.size() != 2) {
                }
                if (split$default != null) {
                }
                return null;
            case -580032564:
                break;
            case -308855462:
                break;
            case 347098056:
                if (str.equals("BiWeekly")) {
                    return new Period(2, Period.Unit.WEEK, "P2W");
                }
                split$default = StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null);
                if (split$default.size() != 2) {
                }
                if (split$default != null) {
                }
                return null;
            case 357220109:
                break;
            case 937940249:
                if (str.equals("Quarterly")) {
                    return new Period(3, Period.Unit.MONTH, "P3M");
                }
                split$default = StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null);
                if (split$default.size() != 2) {
                }
                if (split$default != null) {
                }
                return null;
            case 1965874687:
                break;
            default:
                split$default = StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null);
                if (split$default.size() != 2) {
                }
                if (split$default != null) {
                }
                return null;
        }
    }

    public static final Price createPrice(String str, String marketplace) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(marketplace, "marketplace");
        BigDecimal priceNumeric = parsePriceUsingRegex(str);
        if (priceNumeric == null) {
            priceNumeric = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNullExpressionValue(priceNumeric, "priceNumeric");
        BigDecimal multiply = priceNumeric.multiply(new BigDecimal(1000000.0d));
        Intrinsics.checkNotNullExpressionValue(multiply, "multiply(...)");
        return new Price(str, multiply.longValue(), ISO3166Alpha2ToISO42170Converter.INSTANCE.convertOrEmpty(marketplace));
    }

    static {
        Pattern compile = Pattern.compile("(\\d+[[\\.,\\s]\\d+]*)");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(\"(\\\\d+[[\\\\.,\\\\s]\\\\d+]*)\")");
        pattern = compile;
    }

    public static final BigDecimal parsePriceUsingRegex(String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Matcher matcher = pattern.matcher(str);
        if ((matcher.find() ? matcher : null) == null) {
            return null;
        }
        String dirtyPrice = matcher.group();
        Intrinsics.checkNotNullExpressionValue(dirtyPrice, "dirtyPrice");
        String obj = StringsKt.trim((CharSequence) StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(dirtyPrice, " ", "", false, 4, (Object) null), " ", "", false, 4, (Object) null), " ", "", false, 4, (Object) null)).toString();
        List split$default = StringsKt.split$default((CharSequence) obj, new String[]{".", f.f598a}, false, 0, 6, (Object) null);
        if (split$default.size() != 1) {
            if (((String) CollectionsKt.last(split$default)).length() == 3) {
                str2 = StringsKt.replace$default(StringsKt.replace$default(obj, ".", "", false, 4, (Object) null), f.f598a, "", false, 4, (Object) null);
            } else {
                str2 = CollectionsKt.joinToString$default(CollectionsKt.dropLast(split$default, 1), "", null, null, 0, null, null, 62, null) + '.' + ((String) CollectionsKt.last(split$default));
            }
            obj = str2;
        }
        return new BigDecimal(StringsKt.trim((CharSequence) obj).toString());
    }
}
