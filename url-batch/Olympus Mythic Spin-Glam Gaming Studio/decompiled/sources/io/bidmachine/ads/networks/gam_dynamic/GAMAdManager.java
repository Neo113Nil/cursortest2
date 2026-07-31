package io.bidmachine.ads.networks.gam_dynamic;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.StringValue;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.core.Logger;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes12.dex */
class GAMAdManager {

    @NonNull
    @VisibleForTesting
    final List<InternalAd> internalAdList = new ArrayList();

    @NonNull
    private final Object internalAdListLock = new Object();

    @NonNull
    @VisibleForTesting
    final Map<NetworkAdUnit, InternalAd> reservedInternalAdMap = new WeakHashMap();

    @NonNull
    private final Object reservedInternalAdMapLock = new Object();

    @NonNull
    private final Tag tag;

    public GAMAdManager(@NonNull String str) {
        this.tag = new Tag(str + "AdManager");
    }

    void storeAd(@NonNull final InternalAd internalAd) {
        synchronized (this.internalAdListLock) {
            try {
                if (this.internalAdList.contains(internalAd)) {
                    return;
                }
                this.internalAdList.add(internalAd);
                sortDescByPrice(this.internalAdList);
                Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.GAMAdManager$$ExternalSyntheticLambda1
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String lambda$storeAd$0;
                        lambda$storeAd$0 = GAMAdManager.this.lambda$storeAd$0(internalAd);
                        return lambda$storeAd$0;
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$storeAd$0(InternalAd internalAd) {
        return String.format("Store ad (%s, size - %s)", internalAd, Integer.valueOf(getLoadedAdCount(internalAd.getAdsFormat())));
    }

    @Nullable
    InternalAd storeOrSwapCheapestIdleAd(@NonNull InternalAd internalAd, int i) {
        synchronized (this.internalAdListLock) {
            try {
                AdsFormat adsFormat = internalAd.getAdsFormat();
                InternalAd internalAd2 = null;
                if (getLoadedAdCount(adsFormat) >= i) {
                    final InternalAd findCheapestIdleAd = findCheapestIdleAd(adsFormat);
                    if (findCheapestIdleAd != null && findCheapestIdleAd.getPrice() <= internalAd.getPrice()) {
                        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.GAMAdManager$$ExternalSyntheticLambda2
                            @Override // io.bidmachine.utils.lazy.LazyValue
                            public final Object get() {
                                String lambda$storeOrSwapCheapestIdleAd$1;
                                lambda$storeOrSwapCheapestIdleAd$1 = GAMAdManager.lambda$storeOrSwapCheapestIdleAd$1(InternalAd.this);
                                return lambda$storeOrSwapCheapestIdleAd$1;
                            }
                        });
                        removeAdFromCaches(findCheapestIdleAd);
                        internalAd2 = findCheapestIdleAd;
                    }
                    return null;
                }
                storeAd(internalAd);
                return internalAd2;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$storeOrSwapCheapestIdleAd$1(InternalAd internalAd) {
        return String.format("Remove cheapest ad (%s)", internalAd);
    }

    int getLoadedAdCount(@NonNull AdsFormat adsFormat) {
        int i;
        synchronized (this.internalAdListLock) {
            try {
                Iterator<InternalAd> it = this.internalAdList.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (it.next().getAdsFormat() == adsFormat) {
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Nullable
    InternalAdData reserveMostExpensiveAd(@NonNull NetworkAdUnit networkAdUnit, @NonNull AdsFormat adsFormat) {
        synchronized (this.internalAdListLock) {
            try {
                InternalAd findMostExpensiveIdleAd = findMostExpensiveIdleAd(adsFormat);
                if (findMostExpensiveIdleAd == null) {
                    return null;
                }
                reserveAd(networkAdUnit, findMostExpensiveIdleAd);
                return findMostExpensiveIdleAd;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    InternalAd findMostExpensiveIdleAd(@NonNull AdsFormat adsFormat) {
        synchronized (this.internalAdListLock) {
            try {
                for (InternalAd internalAd : this.internalAdList) {
                    if (internalAd.getAdsFormat() == adsFormat && !isAdReserved(internalAd)) {
                        return internalAd;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    InternalAd findCheapestIdleAd(@NonNull AdsFormat adsFormat) {
        synchronized (this.internalAdListLock) {
            try {
                for (int size = this.internalAdList.size() - 1; size >= 0; size--) {
                    InternalAd internalAd = this.internalAdList.get(size);
                    if (internalAd.getAdsFormat() == adsFormat && !isAdReserved(internalAd)) {
                        return internalAd;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean removeAdFromCaches(@NonNull final InternalAd internalAd) {
        boolean remove;
        synchronized (this.internalAdListLock) {
            try {
                remove = this.internalAdList.remove(internalAd);
                if (remove) {
                    Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.GAMAdManager$$ExternalSyntheticLambda4
                        @Override // io.bidmachine.utils.lazy.LazyValue
                        public final Object get() {
                            String lambda$removeAdFromCaches$2;
                            lambda$removeAdFromCaches$2 = GAMAdManager.this.lambda$removeAdFromCaches$2(internalAd);
                            return lambda$removeAdFromCaches$2;
                        }
                    });
                }
                unReserveAd(internalAd);
            } catch (Throwable th) {
                throw th;
            }
        }
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$removeAdFromCaches$2(InternalAd internalAd) {
        return String.format("Remove ad from caches (%s, size - %s)", internalAd, Integer.valueOf(getLoadedAdCount(internalAd.getAdsFormat())));
    }

    @Nullable
    List<Waterfall.Result.CachedAdUnit> getCachedAdUnitList(@NonNull AdsFormat adsFormat) {
        synchronized (this.internalAdListLock) {
            try {
                if (this.internalAdList.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (InternalAd internalAd : this.internalAdList) {
                    if (internalAd.getAdsFormat() == adsFormat) {
                        Waterfall.Configuration.AdUnit adUnit = internalAd.getAdUnit();
                        Waterfall.Result.CachedAdUnit.Builder frozen = Waterfall.Result.CachedAdUnit.newBuilder().setPrice(adUnit.getPrice()).setFrozen(isAdReserved(internalAd));
                        if (adUnit.getAdUnitId() != null) {
                            frozen.setAdUnitId(adUnit.getAdUnitId());
                        }
                        StringValue serverParams = adUnit.getServerParams();
                        if (serverParams != null) {
                            frozen.setServerParams(serverParams);
                        }
                        InternalAdLoadData internalAdLoadData = internalAd.getInternalAdLoadData();
                        if (internalAdLoadData != null) {
                            Waterfall.Result.EstimatedPrice price = internalAdLoadData.getPrice();
                            if (price != null) {
                                frozen.setEstimatedPrice(price);
                            }
                            String adResponse = internalAdLoadData.getAdResponse();
                            if (!TextUtils.isEmpty(adResponse)) {
                                frozen.setAdResponse(StringValue.newBuilder().setValue(adResponse).build());
                            }
                        }
                        arrayList.add(frozen.build());
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean isAdReserved(@NonNull InternalAd internalAd) {
        boolean containsValue;
        synchronized (this.reservedInternalAdMapLock) {
            containsValue = this.reservedInternalAdMap.containsValue(internalAd);
        }
        return containsValue;
    }

    void reserveAd(@NonNull final NetworkAdUnit networkAdUnit, @NonNull final InternalAd internalAd) {
        synchronized (this.reservedInternalAdMapLock) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.GAMAdManager$$ExternalSyntheticLambda3
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$reserveAd$3;
                    lambda$reserveAd$3 = GAMAdManager.this.lambda$reserveAd$3(networkAdUnit, internalAd);
                    return lambda$reserveAd$3;
                }
            });
            this.reservedInternalAdMap.put(networkAdUnit, internalAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$reserveAd$3(NetworkAdUnit networkAdUnit, InternalAd internalAd) {
        return String.format("Reserve ad (networkAdUnitId - %s, %s, %s / %s)", networkAdUnit.getId(), internalAd, Integer.valueOf(getReservedAdCount(internalAd.getAdsFormat())), Integer.valueOf(getLoadedAdCount(internalAd.getAdsFormat())));
    }

    void unReserveAd(@NonNull InternalAd internalAd) {
        synchronized (this.reservedInternalAdMapLock) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<NetworkAdUnit, InternalAd> entry : this.reservedInternalAdMap.entrySet()) {
                    if (entry.getValue().equals(internalAd)) {
                        arrayList.add(entry.getKey());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    unReserveAd((NetworkAdUnit) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void unReserveAd(@NonNull final NetworkAdUnit networkAdUnit) {
        synchronized (this.reservedInternalAdMapLock) {
            try {
                final InternalAd remove = this.reservedInternalAdMap.remove(networkAdUnit);
                if (remove != null) {
                    Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.GAMAdManager$$ExternalSyntheticLambda5
                        @Override // io.bidmachine.utils.lazy.LazyValue
                        public final Object get() {
                            String lambda$unReserveAd$4;
                            lambda$unReserveAd$4 = GAMAdManager.this.lambda$unReserveAd$4(networkAdUnit, remove);
                            return lambda$unReserveAd$4;
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$unReserveAd$4(NetworkAdUnit networkAdUnit, InternalAd internalAd) {
        return String.format("UnReserve ad (networkAdUnitId - %s, %s, %s / %s)", networkAdUnit.getId(), internalAd, Integer.valueOf(getReservedAdCount(internalAd.getAdsFormat())), Integer.valueOf(getLoadedAdCount(internalAd.getAdsFormat())));
    }

    @Nullable
    InternalAd getReservedAd(@NonNull NetworkAdUnit networkAdUnit) {
        InternalAd internalAd;
        synchronized (this.reservedInternalAdMapLock) {
            internalAd = this.reservedInternalAdMap.get(networkAdUnit);
        }
        return internalAd;
    }

    int getReservedAdCount(@NonNull AdsFormat adsFormat) {
        int i;
        synchronized (this.reservedInternalAdMapLock) {
            try {
                Iterator<InternalAd> it = this.reservedInternalAdMap.values().iterator();
                i = 0;
                while (it.hasNext()) {
                    if (it.next().getAdsFormat() == adsFormat) {
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @VisibleForTesting
    void sortDescByPrice(@NonNull List<InternalAd> list) {
        Collections.sort(list, new Comparator() { // from class: io.bidmachine.ads.networks.gam_dynamic.GAMAdManager$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$sortDescByPrice$5;
                lambda$sortDescByPrice$5 = GAMAdManager.lambda$sortDescByPrice$5((InternalAd) obj, (InternalAd) obj2);
                return lambda$sortDescByPrice$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortDescByPrice$5(InternalAd internalAd, InternalAd internalAd2) {
        return -Double.compare(internalAd.getPrice(), internalAd2.getPrice());
    }
}
