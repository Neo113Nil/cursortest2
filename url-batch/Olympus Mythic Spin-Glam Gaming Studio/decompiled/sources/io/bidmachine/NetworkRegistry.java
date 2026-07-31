package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.NetworkRegistry;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingConfig;
import io.bidmachine.ads.networks.mraid.MraidConfig;
import io.bidmachine.ads.networks.nast.NastConfig;
import io.bidmachine.ads.networks.vast.VastConfig;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.internal.InterfaceC6021p;
import io.bidmachine.protobuf.AdNetwork;
import io.bidmachine.tracking.EventData;
import io.bidmachine.tracking.TrackEventInfo;
import io.bidmachine.tracking.TrackingObject;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.lazy.LazyValue;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes10.dex */
public class NetworkRegistry {

    @NonNull
    @VisibleForTesting
    static final Map<String, NetworkAdapter> NETWORK_ADAPTER_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    static final Map<String, NetworkConfig> CORE_NETWORK_CONFIG_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    static final Map<String, NetworkConfig> FROM_INIT_NETWORK_CONFIG_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    static final Map<String, NetworkConfig> PENDING_NETWORK_CONFIG_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    static final Map<String, NetworkConfig> INITIALIZING_NETWORK_CONFIG_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    static final Map<String, NetworkConfig> INITIALIZED_NETWORK_CONFIG_MAP = new ConcurrentHashMap();

    @NonNull
    @VisibleForTesting
    static final Map<AdsType, Map<String, NetworkConfig>> INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP = new ConcurrentHashMap(AdsType.values().length);

    @NonNull
    @VisibleForTesting
    static final Map<AdsType, Map<String, NetworkConfig>> INITIALIZED_NETWORK_CONFIG_TYPED_MAP = new ConcurrentHashMap(AdsType.values().length);

    @NonNull
    private static final AtomicBoolean IS_NETWORKS_INITIALIZING_EXECUTED = new AtomicBoolean(false);

    @NonNull
    private static final AtomicBoolean IS_CORE_NETWORKS_INITIALIZING = new AtomicBoolean(false);

    @NonNull
    private static final AtomicBoolean IS_CORE_NETWORKS_INITIALIZED = new AtomicBoolean(false);

    @NonNull
    private static final Object CORE_INITIALIZING_LOCK = new Object();

    @NonNull
    private static final Object INITIALIZING_LOCK = new Object();

    class a extends Thread {
        final /* synthetic */ Context a;
        final /* synthetic */ c b;

        a(Context context, c cVar) {
            this.a = context;
            this.b = cVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            NetworkRegistry.initializeNetworksAwait(this.a);
            c cVar = this.b;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    static final class b implements Runnable {
        private static final Executor g = Executors.newFixedThreadPool(Math.max(8, Runtime.getRuntime().availableProcessors() * 4));
        private static final Object h = new Object();
        static final List i = new CopyOnWriteArrayList();
        private final ContextProvider a;
        private final InitializationParams b;
        private final NetworkConfig c;
        private final c d;
        private final String e;
        private final TrackingObject f;

        private static class a implements InternalNetworkInitializationCallback {
            private final WeakReference a;

            public a(b bVar) {
                this.a = new WeakReference(bVar);
            }

            @Override // io.bidmachine.InternalNetworkInitializationCallback
            public void onFail(NetworkAdapter networkAdapter, String str) {
                b bVar = (b) this.a.get();
                if (bVar != null) {
                    bVar.b(str);
                }
            }

            @Override // io.bidmachine.InternalNetworkInitializationCallback
            public void onSuccess(NetworkAdapter networkAdapter) {
                b bVar = (b) this.a.get();
                if (bVar != null) {
                    bVar.b(networkAdapter);
                }
            }
        }

        /* synthetic */ b(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfig networkConfig, c cVar, a aVar) {
            this(contextProvider, initializationParams, networkConfig, cVar);
        }

        void a() {
            i.add(this);
            try {
                g.execute(this);
            } catch (Throwable th) {
                Logger.w(th);
                b("Exception creating network initialization task");
            }
        }

        void b(final NetworkAdapter networkAdapter) {
            Logger.d(this.e, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.NetworkRegistry$b$$ExternalSyntheticLambda1
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String a2;
                    a2 = NetworkRegistry.b.a(NetworkAdapter.this);
                    return a2;
                }
            });
            if (networkAdapter instanceof HeaderBiddingAdapter) {
                this.f.eventFinish(TrackEventType.HeaderBiddingNetworkInitialize, null, new EventData().setNetworkName(this.e), null);
            } else {
                this.f.clearEvent(TrackEventType.HeaderBiddingNetworkInitialize);
            }
            i.remove(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.d(this.e, "Initialization started");
            try {
                this.f.eventStart(TrackEventType.HeaderBiddingNetworkInitialize, new TrackEventInfo().withParameter("HB_NETWORK", this.e));
                NetworkAdapter obtainAdapter = NetworkRegistry.obtainAdapter(this.c);
                obtainAdapter.setLogging(Logger.isLoggingEnabled());
                obtainAdapter.initialize(this.a, this.b, this.c.getNetworkConfigParams(), new a(this));
                Map<String, NetworkConfig> map = NetworkRegistry.INITIALIZED_NETWORK_CONFIG_MAP;
                if (!map.containsKey(this.e)) {
                    map.put(this.e, this.c);
                }
                for (AdsType adsType : this.c.getSupportedAdsTypes(obtainAdapter)) {
                    synchronized (h) {
                        try {
                            if (NetworkRegistry.CORE_NETWORK_CONFIG_MAP.containsKey(this.e)) {
                                a(NetworkRegistry.INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP, adsType, this.e, this.c);
                            }
                            a(NetworkRegistry.INITIALIZED_NETWORK_CONFIG_TYPED_MAP, adsType, this.e, this.c);
                        } finally {
                        }
                    }
                }
                NetworkRegistry.PENDING_NETWORK_CONFIG_MAP.remove(this.e);
            } catch (Throwable th) {
                Logger.w(th);
                b("Network initialization exception");
            }
            c cVar = this.d;
            if (cVar != null) {
                cVar.a();
            }
        }

        private b(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfig networkConfig, c cVar) {
            this.a = contextProvider;
            this.b = initializationParams;
            this.c = networkConfig;
            this.d = cVar;
            String networkKey = networkConfig.getNetworkKey();
            this.e = networkKey;
            this.f = new BidMachineTrackingObject(networkKey + "_initialize");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String a(NetworkAdapter networkAdapter) {
            return String.format("Initialization completed: %s, %s", networkAdapter.obtainNetworkSdkVersion(), networkAdapter.getAdapterVersion());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String a(String str) {
            return String.format("Initialization error: %s", str);
        }

        private void a(Map map, AdsType adsType, String str, NetworkConfig networkConfig) {
            Map map2 = (Map) map.get(adsType);
            if (map2 == null) {
                map2 = new ConcurrentHashMap();
                map.put(adsType, map2);
            }
            map2.put(str, networkConfig);
        }

        void b(final String str) {
            Logger.e(this.e, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.NetworkRegistry$b$$ExternalSyntheticLambda0
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String a2;
                    a2 = NetworkRegistry.b.a(str);
                    return a2;
                }
            });
            this.f.eventFinish(TrackEventType.HeaderBiddingNetworkInitialize, null, new EventData().setNetworkName(this.e), BMError.adapterInitialization(str));
            i.remove(this);
        }
    }

    interface c {
        void a();
    }

    @Nullable
    static String checkAndPutNetwork(@NonNull Context context, @NonNull AdsType adsType, @NonNull NetworkConfig networkConfig, @NonNull Map<String, NetworkConfig> map) {
        NetworkAdapter adapter = getAdapter(networkConfig.getNetworkKey());
        if (adapter == null) {
            return "Network not registered";
        }
        if (!adapter.isAdsTypeSupported(adsType)) {
            return "Network does not support this ad type";
        }
        if (!adapter.isInitialized(context)) {
            return "Network not initialized";
        }
        map.put(networkConfig.getNetworkKey(), networkConfig);
        return null;
    }

    @Nullable
    static Map<String, NetworkConfig> copyOrNullInitializedCoreNetworkConfigs(@NonNull AdsType adsType) {
        Map<String, NetworkConfig> map = INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP.get(adsType);
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    @Nullable
    static Map<String, NetworkConfig> copyOrNullInitializedNetworkConfigs(@NonNull AdsType adsType) {
        Map<String, NetworkConfig> map = INITIALIZED_NETWORK_CONFIG_TYPED_MAP.get(adsType);
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    @NonNull
    static Map<String, NetworkConfig> createInitNetworkConfigMap() {
        return new HashMap(FROM_INIT_NETWORK_CONFIG_MAP);
    }

    @Nullable
    public static NetworkAdapter getAdapter(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return NETWORK_ADAPTER_MAP.get(str);
    }

    @Nullable
    static NetworkConfig getConfig(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return INITIALIZED_NETWORK_CONFIG_MAP.get(str);
    }

    static Collection<NetworkConfig> getCoreNetworkConfigList() {
        return CORE_NETWORK_CONFIG_MAP.values();
    }

    static Collection<NetworkConfig> getPendingNetworkConfigList() {
        return PENDING_NETWORK_CONFIG_MAP.values();
    }

    private static void initializeNetwork(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfig networkConfig, @Nullable c cVar) {
        synchronized (INITIALIZING_LOCK) {
            try {
                String networkKey = networkConfig.getNetworkKey();
                Map<String, NetworkConfig> map = INITIALIZING_NETWORK_CONFIG_MAP;
                if (!map.containsKey(networkKey)) {
                    map.put(networkKey, networkConfig);
                    new b(contextProvider, initializationParams, networkConfig, cVar, null).a();
                } else {
                    PENDING_NETWORK_CONFIG_MAP.remove(networkKey);
                    if (cVar != null) {
                        cVar.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void initializeNetworksAsync(@NonNull Context context, @Nullable c cVar) {
        if (IS_NETWORKS_INITIALIZING_EXECUTED.compareAndSet(false, true)) {
            new a(context.getApplicationContext(), cVar).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initializeNetworksAwait(@NonNull Context context) {
        initializeNetworksAwait(context, getPendingNetworkConfigList());
    }

    static void initializeNetworksSync(@NonNull Context context) {
        if (IS_NETWORKS_INITIALIZING_EXECUTED.compareAndSet(false, true)) {
            initializeNetworksAwait(context.getApplicationContext());
        }
    }

    static boolean isNetworkRegistered(@NonNull String str) {
        return getAdapter(str) != null;
    }

    static boolean isNetworksInitializingExecuted() {
        return IS_NETWORKS_INITIALIZING_EXECUTED.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerNetworks$0(NetworkRegistryCallback networkRegistryCallback) {
        if (networkRegistryCallback != null) {
            networkRegistryCallback.onRegistered();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerNetworks$1(Context context, String str, final NetworkRegistryCallback networkRegistryCallback) throws Throwable {
        registerNetworks(context, str);
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.NetworkRegistry$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                NetworkRegistry.lambda$registerNetworks$0(NetworkRegistryCallback.this);
            }
        });
    }

    @NonNull
    static NetworkAdapter obtainAdapter(@NonNull NetworkConfig networkConfig) {
        synchronized (NetworkRegistry.class) {
            try {
                String networkKey = networkConfig.getNetworkKey();
                NetworkAdapter adapter = getAdapter(networkKey);
                if (adapter != null) {
                    return adapter;
                }
                NetworkAdapter createNetworkAdapter = networkConfig.createNetworkAdapter();
                NETWORK_ADAPTER_MAP.put(networkKey, createNetworkAdapter);
                return createNetworkAdapter;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void registerAndInitializeCoreNetworks(@NonNull Context context) {
        AtomicBoolean atomicBoolean = IS_CORE_NETWORKS_INITIALIZED;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (CORE_INITIALIZING_LOCK) {
            try {
                if (IS_CORE_NETWORKS_INITIALIZING.compareAndSet(false, true)) {
                    registerCoreNetworks();
                    initializeNetworksAwait(context, getCoreNetworkConfigList());
                    atomicBoolean.set(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void registerCoreNetwork(@NonNull NetworkConfig networkConfig) {
        String networkKey = networkConfig.getNetworkKey();
        Map<String, NetworkConfig> map = CORE_NETWORK_CONFIG_MAP;
        if (map.containsKey(networkKey)) {
            return;
        }
        map.put(networkKey, networkConfig);
        registerNetwork(networkConfig);
    }

    static void registerCoreNetworks() {
        MraidConfig mraidConfig = new MraidConfig();
        AdsFormat adsFormat = AdsFormat.Banner;
        registerCoreNetwork(mraidConfig.withMediationConfig(adsFormat, new HashMap()).withMediationConfig(AdsFormat.InterstitialStatic, new HashMap()).withMediationConfig(AdsFormat.RewardedStatic, new HashMap()));
        registerCoreNetwork(new VastConfig().withMediationConfig(AdsFormat.InterstitialVideo, new HashMap()).withMediationConfig(AdsFormat.RewardedVideo, new HashMap()));
        registerCoreNetwork(new NastConfig().withMediationConfig(AdsFormat.Native, new HashMap()));
        registerCoreNetwork(new AdaptiveRenderingConfig().withMediationConfig(adsFormat, new HashMap()).withMediationConfig(AdsFormat.Interstitial, new HashMap()).withMediationConfig(AdsFormat.Rewarded, new HashMap()));
    }

    static void registerInitNetwork(@NonNull Context context, @NonNull AdNetwork adNetwork) {
        NetworkConfig a2;
        if (isNetworkRegistered(adNetwork.getName()) || (a2 = y.a(context, adNetwork)) == null) {
            return;
        }
        FROM_INIT_NETWORK_CONFIG_MAP.put(a2.getNetworkKey(), a2);
        registerNetwork(a2);
    }

    static void registerNetwork(@Nullable NetworkConfig networkConfig) {
        k b2;
        Context d;
        if (networkConfig == null || isNetworkRegistered(networkConfig.getNetworkKey())) {
            return;
        }
        obtainAdapter(networkConfig);
        PENDING_NETWORK_CONFIG_MAP.put(networkConfig.getNetworkKey(), networkConfig);
        if (!isNetworksInitializingExecuted() || (d = (b2 = k.b()).d()) == null) {
            return;
        }
        initializeNetwork(new SimpleContextProvider(d), b2.a(), networkConfig, null);
    }

    static void registerNetworks(@Nullable NetworkConfig... networkConfigArr) {
        if (networkConfigArr == null) {
            return;
        }
        for (NetworkConfig networkConfig : networkConfigArr) {
            registerNetwork(networkConfig);
        }
    }

    @VisibleForTesting
    static void reset() {
        NETWORK_ADAPTER_MAP.clear();
        CORE_NETWORK_CONFIG_MAP.clear();
        FROM_INIT_NETWORK_CONFIG_MAP.clear();
        PENDING_NETWORK_CONFIG_MAP.clear();
        INITIALIZING_NETWORK_CONFIG_MAP.clear();
        INITIALIZED_NETWORK_CONFIG_MAP.clear();
        INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP.clear();
        INITIALIZED_NETWORK_CONFIG_TYPED_MAP.clear();
        IS_NETWORKS_INITIALIZING_EXECUTED.set(false);
        IS_CORE_NETWORKS_INITIALIZING.set(false);
        IS_CORE_NETWORKS_INITIALIZED.set(false);
        b.i.clear();
    }

    static void setLoggingEnabled(boolean z) {
        Iterator<Map.Entry<String, NetworkAdapter>> it = NETWORK_ADAPTER_MAP.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().setLogging(z);
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    private static void initializeNetworksAwait(@NonNull Context context, @NonNull Collection<NetworkConfig> collection) {
        initializeNetworksAwait(new SimpleContextProvider(context), k.b().a(), collection);
    }

    static void registerNetworks(@NonNull Context context, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                NetworkConfig a2 = y.a(context, jSONArray.getJSONObject(i));
                if (a2 != null) {
                    registerNetwork(a2);
                }
            }
        } catch (JSONException e) {
            Logger.w(e);
        }
    }

    private static void initializeNetworksAwait(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull Collection<NetworkConfig> collection) {
        if (collection.isEmpty()) {
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(collection.size());
        Iterator<NetworkConfig> it = collection.iterator();
        while (it.hasNext()) {
            initializeNetwork(contextProvider, initializationParams, it.next(), new c() { // from class: io.bidmachine.NetworkRegistry$$ExternalSyntheticLambda1
                @Override // io.bidmachine.NetworkRegistry.c
                public final void a() {
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            Logger.w(e);
        }
    }

    static void registerNetworks(@NonNull final Context context, @Nullable final String str, @Nullable final NetworkRegistryCallback networkRegistryCallback) {
        p.a().execute(new InterfaceC6021p() { // from class: io.bidmachine.NetworkRegistry$$ExternalSyntheticLambda0
            @Override // io.bidmachine.utils.SafeRunnable
            public final void onRun() {
                NetworkRegistry.lambda$registerNetworks$1(context, str, networkRegistryCallback);
            }
        });
    }
}
