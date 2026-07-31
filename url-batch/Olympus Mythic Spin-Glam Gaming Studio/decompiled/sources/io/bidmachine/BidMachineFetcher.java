package io.bidmachine;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.AdRequest;
import io.bidmachine.core.Logger;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.lazy.LazyValue;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public class BidMachineFetcher {
    public static final String AD_TYPE_DISPLAY = "display";
    public static final String AD_TYPE_NATIVE = "native";
    public static final String AD_TYPE_VIDEO = "video";
    public static final String KEY_AD_TYPE = "bm_ad_type";
    public static final String KEY_ID = "bm_id";
    public static final String KEY_NETWORK_KEY = "bm_network_key";
    public static final String KEY_PRICE = "bm_pf";
    private static final String TAG = "BidMachineFetcher";
    private static final BigDecimal PRICE_ROUNDING = new BigDecimal("0.01");
    private static final RoundingMode PRICE_ROUNDING_MODE = RoundingMode.CEILING;

    @VisibleForTesting
    static EnumMap<AdsType, Map<String, AdRequest>> cachedRequests = new EnumMap<>(AdsType.class);

    class a implements AdRequest.AdRequestListener {
        a() {
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        public void onRequestExpired(AdRequest adRequest) {
            BidMachineFetcher.release(adRequest);
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        public void onRequestFailed(AdRequest adRequest, BMError bMError) {
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        public void onRequestSuccess(AdRequest adRequest, AuctionResult auctionResult) {
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CreativeFormat.values().length];
            a = iArr;
            try {
                iArr[CreativeFormat.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CreativeFormat.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CreativeFormat.Native.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Nullable
    public static Map<String, String> fetch(@NonNull final AdRequest adRequest) {
        Logger.d(TAG, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.BidMachineFetcher$$ExternalSyntheticLambda0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$fetch$0;
                lambda$fetch$0 = BidMachineFetcher.lambda$fetch$0(AdRequest.this);
                return lambda$fetch$0;
            }
        });
        Map<String, String> map = toMap(adRequest);
        String str = map.get(KEY_ID);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        AdsType adsType = adRequest.getAdsType();
        adRequest.addListener(new a());
        synchronized (BidMachineFetcher.class) {
            try {
                Map<String, AdRequest> map2 = cachedRequests.get(adsType);
                if (map2 == null) {
                    map2 = new HashMap<>();
                    cachedRequests.put((EnumMap<AdsType, Map<String, AdRequest>>) adsType, (AdsType) map2);
                }
                map2.put(str, adRequest);
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    @Nullable
    @VisibleForTesting
    static String identifyAdType(@Nullable CreativeFormat creativeFormat) {
        if (creativeFormat == null) {
            return null;
        }
        int i = b.a[creativeFormat.ordinal()];
        if (i == 1) {
            return "display";
        }
        if (i == 2) {
            return "video";
        }
        if (i != 3) {
            return null;
        }
        return "native";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$fetch$0(AdRequest adRequest) {
        return String.format("fetch - %s", adRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$release$1(String str) {
        return String.format("release - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$toMap$2(AdRequest adRequest) {
        return String.format("toMap - %s", adRequest);
    }

    @Nullable
    public static <T extends AdRequest> T release(@NonNull T t) {
        AuctionResult auctionResult = t.getAuctionResult();
        if (auctionResult != null) {
            return (T) release(t.getAdsType(), auctionResult.getId());
        }
        return null;
    }

    private static String roundPrice(double d) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        BigDecimal bigDecimal2 = PRICE_ROUNDING;
        if (bigDecimal2.signum() != 0) {
            bigDecimal = bigDecimal.divide(bigDecimal2, 0, PRICE_ROUNDING_MODE).multiply(bigDecimal2);
        }
        return bigDecimal.setScale(bigDecimal2.scale(), RoundingMode.HALF_UP).toString();
    }

    @NonNull
    public static Map<String, String> toMap(@NonNull final AdRequest adRequest) {
        Logger.d(TAG, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.BidMachineFetcher$$ExternalSyntheticLambda2
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$toMap$2;
                lambda$toMap$2 = BidMachineFetcher.lambda$toMap$2(AdRequest.this);
                return lambda$toMap$2;
            }
        });
        HashMap hashMap = new HashMap();
        AuctionResult auctionResult = adRequest.getAuctionResult();
        if (auctionResult == null) {
            return hashMap;
        }
        hashMap.put(KEY_ID, auctionResult.getId());
        hashMap.put(KEY_PRICE, roundPrice(auctionResult.getPrice()));
        hashMap.put(KEY_NETWORK_KEY, auctionResult.getNetworkKey());
        String identifyAdType = identifyAdType(auctionResult.getCreativeFormat());
        if (identifyAdType != null) {
            hashMap.put(KEY_AD_TYPE, identifyAdType);
        }
        hashMap.putAll(auctionResult.getCustomParams());
        return hashMap;
    }

    @Nullable
    public static <T extends AdRequest> T release(@NonNull AdsType adsType, @NonNull Map<String, String> map) {
        return (T) release(adsType, map.get(KEY_ID));
    }

    @Nullable
    public static <T extends AdRequest> T release(@NonNull AdsType adsType, @Nullable final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Logger.d(TAG, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.BidMachineFetcher$$ExternalSyntheticLambda1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$release$1;
                lambda$release$1 = BidMachineFetcher.lambda$release$1(str);
                return lambda$release$1;
            }
        });
        synchronized (BidMachineFetcher.class) {
            try {
                Map<String, AdRequest> map = cachedRequests.get(adsType);
                if (map == null) {
                    return null;
                }
                try {
                    return (T) map.remove(str);
                } catch (Exception unused) {
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
