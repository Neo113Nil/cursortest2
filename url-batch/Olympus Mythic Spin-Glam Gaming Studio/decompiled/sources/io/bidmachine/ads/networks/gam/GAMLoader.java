package io.bidmachine.ads.networks.gam;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.versions.VersionWrapper;
import io.bidmachine.core.Logger;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes13.dex */
public class GAMLoader {
    static final int DEFAULT_BOTTOM_BORDER_LOADED_AD = 2;
    private static final int DEFAULT_REST_AD_LOAD_MS = 500;

    @NonNull
    private final Context applicationContext;
    private final long expirationTimeMs;

    @NonNull
    private final String networkName;

    @Nullable
    private final String requestAgent;

    @NonNull
    private final Tag tag;

    @NonNull
    private final VersionWrapper versionWrapper;

    @NonNull
    private final Map<AdsFormat, GAMTypeConfig> gamTypeConfigMap = new HashMap();

    @NonNull
    private final GAMTaskLoader gamTaskLoader = new GAMTaskLoader();

    @NonNull
    @VisibleForTesting
    final List<InternalGAMAd> gamAdList = new ArrayList();

    @NonNull
    @VisibleForTesting
    final Map<NetworkAdUnit, InternalGAMAd> reservedGamAdMap = new WeakHashMap();

    @NonNull
    private final Object gamAdListLock = new Object();

    @NonNull
    private final Object reservedGamAdMapLock = new Object();

    GAMLoader(@NonNull Context context, @NonNull VersionWrapper versionWrapper, @NonNull String str, @NonNull Map<AdsFormat, GAMTypeConfig> map, @Nullable String str2, long j) {
        this.tag = new Tag(str + "Loader");
        this.applicationContext = context;
        this.versionWrapper = versionWrapper;
        this.networkName = str;
        this.requestAgent = str2;
        this.expirationTimeMs = j;
        for (AdsFormat adsFormat : AdsFormat.values()) {
            GAMTypeConfig gAMTypeConfig = map.get(adsFormat);
            if (gAMTypeConfig != null && !gAMTypeConfig.getGAMUnitDataList().isEmpty()) {
                sortDescByScore(gAMTypeConfig.getGAMUnitDataList());
                this.gamTypeConfigMap.put(gAMTypeConfig.getAdsFormat(), gAMTypeConfig);
            }
        }
    }

    @NonNull
    public VersionWrapper getVersionWrapper() {
        return this.versionWrapper;
    }

    @NonNull
    public String getNetworkName() {
        return this.networkName;
    }

    @Nullable
    public String getRequestAgent() {
        return this.requestAgent;
    }

    public long getExpirationTimeMs() {
        return this.expirationTimeMs;
    }

    void load() {
        for (AdsFormat adsFormat : AdsFormat.values()) {
            load(adsFormat);
        }
    }

    boolean load(@NonNull AdsFormat adsFormat) {
        GAMTypeConfig gAMTypeConfig = this.gamTypeConfigMap.get(adsFormat);
        if (gAMTypeConfig == null || loadedGAMAdCount(gAMTypeConfig) >= gAMTypeConfig.getCacheSize()) {
            return false;
        }
        this.gamTaskLoader.loadTask(adsFormat, new LoadAdUnitListTask(gAMTypeConfig, 500));
        return true;
    }

    @Nullable
    GAMUnitData reserveMostExpensiveGAMAd(@NonNull NetworkAdUnit networkAdUnit, @NonNull String str) {
        synchronized (this.gamAdListLock) {
            try {
                InternalGAMAd findMostExpensiveIdleGAMAd = findMostExpensiveIdleGAMAd(str);
                if (findMostExpensiveIdleGAMAd == null) {
                    return null;
                }
                reserveGAMAd(networkAdUnit, findMostExpensiveIdleGAMAd);
                return findMostExpensiveIdleGAMAd.getGamUnitData();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void reserveGAMAd(@NonNull final NetworkAdUnit networkAdUnit, @NonNull final InternalGAMAd internalGAMAd) {
        synchronized (this.reservedGamAdMapLock) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam.GAMLoader$$ExternalSyntheticLambda4
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$reserveGAMAd$0;
                    lambda$reserveGAMAd$0 = GAMLoader.lambda$reserveGAMAd$0(NetworkAdUnit.this, internalGAMAd);
                    return lambda$reserveGAMAd$0;
                }
            });
            this.reservedGamAdMap.put(networkAdUnit, internalGAMAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$reserveGAMAd$0(NetworkAdUnit networkAdUnit, InternalGAMAd internalGAMAd) {
        return String.format("reserveGAMAd (networkAdUnitId - %s, %s)", networkAdUnit.getId(), internalGAMAd);
    }

    void unReserveGAMAd(@NonNull final NetworkAdUnit networkAdUnit) {
        synchronized (this.reservedGamAdMapLock) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam.GAMLoader$$ExternalSyntheticLambda1
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$unReserveGAMAd$1;
                    lambda$unReserveGAMAd$1 = GAMLoader.lambda$unReserveGAMAd$1(NetworkAdUnit.this);
                    return lambda$unReserveGAMAd$1;
                }
            });
            this.reservedGamAdMap.remove(networkAdUnit);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$unReserveGAMAd$1(NetworkAdUnit networkAdUnit) {
        return String.format("unReserveGAMAd (networkAdUnitId - %s)", networkAdUnit.getId());
    }

    @Nullable
    InternalGAMAd getReservedGAMAd(@NonNull NetworkAdUnit networkAdUnit) {
        InternalGAMAd internalGAMAd;
        synchronized (this.reservedGamAdMapLock) {
            internalGAMAd = this.reservedGamAdMap.get(networkAdUnit);
        }
        return internalGAMAd;
    }

    void onGAMAdShown(@NonNull InternalGAMAd internalGAMAd) {
        removeFromCaches(internalGAMAd);
    }

    void onGAMAdDestroy(@NonNull InternalGAMAd internalGAMAd, boolean z) {
        if (z) {
            internalGAMAd.release();
            removeFromCaches(internalGAMAd);
        } else {
            unReserveGAMAd(internalGAMAd);
        }
    }

    private void sortDescByScore(@NonNull List<GAMUnitData> list) {
        Collections.sort(list, new Comparator() { // from class: io.bidmachine.ads.networks.gam.GAMLoader$$ExternalSyntheticLambda2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$sortDescByScore$2;
                lambda$sortDescByScore$2 = GAMLoader.lambda$sortDescByScore$2((GAMUnitData) obj, (GAMUnitData) obj2);
                return lambda$sortDescByScore$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortDescByScore$2(GAMUnitData gAMUnitData, GAMUnitData gAMUnitData2) {
        return -Float.compare(gAMUnitData.getScore(), gAMUnitData2.getScore());
    }

    @Nullable
    @VisibleForTesting
    InternalGAMAd findMostExpensiveIdleGAMAd(@NonNull String str) {
        synchronized (this.gamAdListLock) {
            try {
                for (InternalGAMAd internalGAMAd : this.gamAdList) {
                    if (internalGAMAd.getAdUnitId().equals(str) && !isReserved(internalGAMAd)) {
                        return internalGAMAd;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    boolean isReserved(@NonNull InternalGAMAd internalGAMAd) {
        boolean containsValue;
        synchronized (this.reservedGamAdMapLock) {
            containsValue = this.reservedGamAdMap.containsValue(internalGAMAd);
        }
        return containsValue;
    }

    @VisibleForTesting
    void storeGAMAd(@NonNull InternalGAMAd internalGAMAd) {
        synchronized (this.gamAdListLock) {
            try {
                if (this.gamAdList.contains(internalGAMAd)) {
                    return;
                }
                this.gamAdList.add(internalGAMAd);
                Collections.sort(this.gamAdList, new Comparator() { // from class: io.bidmachine.ads.networks.gam.GAMLoader$$ExternalSyntheticLambda0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int lambda$storeGAMAd$3;
                        lambda$storeGAMAd$3 = GAMLoader.lambda$storeGAMAd$3((InternalGAMAd) obj, (InternalGAMAd) obj2);
                        return lambda$storeGAMAd$3;
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$storeGAMAd$3(InternalGAMAd internalGAMAd, InternalGAMAd internalGAMAd2) {
        return -Float.compare(internalGAMAd.getScope(), internalGAMAd2.getScope());
    }

    private void removeFromCaches(@NonNull final InternalGAMAd internalGAMAd) {
        synchronized (this.gamAdListLock) {
            try {
                if (this.gamAdList.remove(internalGAMAd)) {
                    Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam.GAMLoader$$ExternalSyntheticLambda3
                        @Override // io.bidmachine.utils.lazy.LazyValue
                        public final Object get() {
                            String lambda$removeFromCaches$4;
                            lambda$removeFromCaches$4 = GAMLoader.lambda$removeFromCaches$4(InternalGAMAd.this);
                            return lambda$removeFromCaches$4;
                        }
                    });
                }
                unReserveGAMAd(internalGAMAd);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$removeFromCaches$4(InternalGAMAd internalGAMAd) {
        return String.format("removeFromCaches (%s)", internalGAMAd);
    }

    @VisibleForTesting
    void unReserveGAMAd(@NonNull InternalGAMAd internalGAMAd) {
        synchronized (this.reservedGamAdMapLock) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<NetworkAdUnit, InternalGAMAd> entry : this.reservedGamAdMap.entrySet()) {
                    if (entry.getValue().equals(internalGAMAd)) {
                        arrayList.add(entry.getKey());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    unReserveGAMAd((NetworkAdUnit) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyGAMAd(@NonNull InternalGAMAd internalGAMAd) {
        try {
            internalGAMAd.destroy();
        } catch (Throwable unused) {
        }
        removeFromCaches(internalGAMAd);
    }

    private int loadedGAMAdCount(@NonNull GAMTypeConfig gAMTypeConfig) {
        int i;
        synchronized (this.gamAdListLock) {
            try {
                Iterator<InternalGAMAd> it = this.gamAdList.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (it.next().getAdsFormat() == gAMTypeConfig.getAdsFormat()) {
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
    void clear() {
        this.gamTypeConfigMap.clear();
        this.gamAdList.clear();
        this.reservedGamAdMap.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class LoadAdUnitListTask implements Runnable {

        @NonNull
        private final GAMLoader gamLoader;

        @NonNull
        private final GAMTypeConfig gamTypeConfig;

        @NonNull
        private final String id;
        private final int restAdLoadMs;

        private LoadAdUnitListTask(@NonNull GAMLoader gAMLoader, @NonNull GAMTypeConfig gAMTypeConfig, int i) {
            this.id = UUID.randomUUID().toString();
            this.gamLoader = gAMLoader;
            this.gamTypeConfig = gAMTypeConfig;
            this.restAdLoadMs = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Iterator it = new ArrayList(this.gamTypeConfig.getGAMUnitDataList()).iterator();
                while (it.hasNext()) {
                    InternalGAMAd createAd = this.gamLoader.versionWrapper.createAd(this.gamLoader, this.gamTypeConfig.getAdsFormat(), (GAMUnitData) it.next());
                    if (createAd != null) {
                        if (loadGAMAdSync(createAd)) {
                            return;
                        } else {
                            Thread.sleep(this.restAdLoadMs);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }

        private boolean loadGAMAdSync(@NonNull InternalGAMAd internalGAMAd) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                internalGAMAd.load(this.gamLoader.applicationContext, new AwaitLoadListener(countDownLatch));
                countDownLatch.await();
            } catch (Throwable unused) {
                countDownLatch.countDown();
            }
            if (!internalGAMAd.isLoaded()) {
                this.gamLoader.destroyGAMAd(internalGAMAd);
                return false;
            }
            this.gamLoader.storeGAMAd(internalGAMAd);
            return true;
        }

        private static class AwaitLoadListener implements InternalLoadListener {

            @NonNull
            private final CountDownLatch countDownLatch;

            private AwaitLoadListener(@NonNull CountDownLatch countDownLatch) {
                this.countDownLatch = countDownLatch;
            }

            @Override // io.bidmachine.ads.networks.gam.InternalLoadListener
            public void onAdLoaded(@NonNull InternalGAMAd internalGAMAd) {
                this.countDownLatch.countDown();
            }

            @Override // io.bidmachine.ads.networks.gam.InternalLoadListener
            public void onAdLoadFailed(@NonNull InternalGAMAd internalGAMAd, @NonNull BMError bMError) {
                this.countDownLatch.countDown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class GAMTaskLoader {
        private static final int CORE_POOL_SIZE;
        private static final int CPU_COUNT;

        @NonNull
        private final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(CORE_POOL_SIZE);

        @NonNull
        private final Map<AdsFormat, Map<String, Future<?>>> submittedFutureMap = new EnumMap(AdsFormat.class);

        @NonNull
        private final Object submittedFutureMapLocker = new Object();

        static {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            CPU_COUNT = availableProcessors;
            CORE_POOL_SIZE = Math.max(2, Math.min(availableProcessors - 1, 4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadTask(@NonNull final AdsFormat adsFormat, @NonNull final LoadAdUnitListTask loadAdUnitListTask) {
            try {
                synchronized (this.submittedFutureMapLocker) {
                    try {
                        Map<String, Future<?>> map = this.submittedFutureMap.get(adsFormat);
                        if (map == null || map.isEmpty()) {
                            Future<?> submit = this.executorService.submit(new Runnable() { // from class: io.bidmachine.ads.networks.gam.GAMLoader$GAMTaskLoader$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    GAMLoader.GAMTaskLoader.this.lambda$loadTask$0(loadAdUnitListTask, adsFormat);
                                }
                            });
                            if (map == null) {
                                map = new HashMap<>();
                                this.submittedFutureMap.put(adsFormat, map);
                            }
                            map.put(loadAdUnitListTask.id, submit);
                        }
                    } finally {
                    }
                }
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadTask$0(LoadAdUnitListTask loadAdUnitListTask, AdsFormat adsFormat) {
            loadAdUnitListTask.run();
            removeTask(adsFormat, loadAdUnitListTask.id);
        }

        private void removeTask(@NonNull AdsFormat adsFormat, @NonNull String str) {
            synchronized (this.submittedFutureMapLocker) {
                try {
                    Map<String, Future<?>> map = this.submittedFutureMap.get(adsFormat);
                    if (map != null) {
                        map.remove(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
