package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import io.bidmachine.AdRequest;
import io.bidmachine.NetworkRegistry;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.mraid.MraidUtils;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.internal.C6008c;
import io.bidmachine.internal.C6020o;
import io.bidmachine.internal.C6025u;
import io.bidmachine.internal.E;
import io.bidmachine.internal.H;
import io.bidmachine.protobuf.AdCachePlacementControl;
import io.bidmachine.protobuf.AdNetwork;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.rendering.utils.UserAgentProvider;
import io.bidmachine.tracking.EventTrackerImpl;
import io.bidmachine.tracking.SessionTracker;
import io.bidmachine.u;
import io.bidmachine.utils.BluetoothUtils;
import io.bidmachine.utils.ProtoUtils;
import io.bidmachine.utils.ProtoUtilsKt;
import io.bidmachine.utils.ThrowableRunnable;
import io.bidmachine.utils.lazy.LazyValue;
import io.bidmachine.utils.log.DefaultLoggerInstance;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
final class k {
    private static final AtomicBoolean E = new AtomicBoolean(false);
    private static volatile k F;
    long A;
    long B;
    u C;
    private final u.d D;
    private final Set a = new CopyOnWriteArraySet();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final EventTrackerImpl d;
    private final SessionTracker e;
    private final io.bidmachine.internal.x f;
    private final PriceFloorParams g;
    private final AppParams h;
    private final DeviceParams i;
    private final C j;
    private final InterfaceC6026r k;
    private final Map l;
    private final List m;
    private final e n;
    private final C6008c o;
    private final i p;
    private final BidMachineAssetCacheInitializer q;
    private final InstallInfoProvider r;
    Context s;
    private String t;
    private TargetingParams u;
    private CustomParams v;
    private Publisher w;
    private boolean x;
    int y;
    private int z;

    class a extends DefaultLoggerInstance {
        a(String str) {
            super(str);
        }

        @Override // io.bidmachine.utils.log.DefaultLoggerInstance
        protected String buildMessage(Object obj, String str, LazyValue lazyValue, Throwable th) {
            String buildMessage = super.buildMessage(obj, str, lazyValue, th);
            if (!k.b().u()) {
                return buildMessage;
            }
            return "(TEST MODE) " + buildMessage;
        }
    }

    private class b implements u.d {
        private b() {
        }

        @Override // io.bidmachine.u.d
        public void a(u.b bVar) {
            InitResponse a = bVar.a();
            k.this.a(SessionManager.get().getSessionId(), a, bVar.b());
            if (k.this.s == null) {
                return;
            }
            ExtraParamsManager.get().setExtras(k.this.s, a.getExtras());
            k kVar = k.this;
            kVar.a(kVar.s, a.getAdNetworksList());
        }

        @Override // io.bidmachine.u.d
        public void b(u.b bVar) {
            k kVar = k.this;
            Context context = kVar.s;
            if (context == null) {
                return;
            }
            kVar.a(context, bVar.a().getAdNetworksList());
        }

        @Override // io.bidmachine.u.d
        public void c(u.b bVar) {
            k.this.a(SessionManager.get().getSessionId(), bVar.a(), bVar.b());
        }

        /* synthetic */ b(k kVar, a aVar) {
            this();
        }
    }

    static class c implements UserAgentProvider {
        private final Context a;

        public c(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // io.bidmachine.rendering.utils.UserAgentProvider
        public String getUserAgent() {
            return UserAgentManager.getUserAgent(this.a);
        }
    }

    static {
        Logger.setEnabledInstance(new a("BidMachineLog"));
    }

    k() {
        EventTrackerImpl eventTrackerImpl = new EventTrackerImpl();
        this.d = eventTrackerImpl;
        this.e = new l(eventTrackerImpl);
        this.f = new io.bidmachine.internal.x();
        this.g = new PriceFloorParams().addPriceFloor(UUID.randomUUID().toString(), 0.01d);
        this.h = new AppParams(new f());
        this.i = new DeviceParams(new DeviceConnectionParams());
        this.j = new C();
        this.k = new s();
        this.l = new EnumMap(TrackEventType.class);
        this.m = new CopyOnWriteArrayList();
        this.n = new e();
        this.o = new C6008c();
        this.p = new i();
        this.q = new BidMachineAssetCacheInitializer();
        this.r = new InstallInfoProvider();
        this.u = new TargetingParams();
        this.v = new CustomParams();
        this.y = 0;
        this.z = 0;
        this.A = 0L;
        this.B = 0L;
        this.D = new b(this, null);
    }

    static k b() {
        k kVar = F;
        if (kVar == null) {
            synchronized (k.class) {
                try {
                    kVar = F;
                    if (kVar == null) {
                        kVar = new k();
                        F = kVar;
                    }
                } finally {
                }
            }
        }
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Context context) {
        try {
            Debugger.setup(context);
            this.f.a(H.a(context));
            this.k.a(context);
            this.n.b(context);
            this.C.d();
            h(context);
            this.r.initialize(context);
            a(context, (NetworkRegistry.c) null);
            v();
            this.C.c();
            C6020o.a();
        } catch (Throwable th) {
            Logger.w(th);
        }
    }

    static void j(final Context context) {
        if (E.compareAndSet(false, true)) {
            Utils.runCatching(new ThrowableRunnable() { // from class: io.bidmachine.k$$ExternalSyntheticLambda3
                @Override // io.bidmachine.utils.ThrowableRunnable
                public final void run() {
                    h.a(context);
                }
            });
            Utils.runCatching(new ThrowableRunnable() { // from class: io.bidmachine.k$$ExternalSyntheticLambda4
                @Override // io.bidmachine.utils.ThrowableRunnable
                public final void run() {
                    i.a(context);
                }
            });
        }
    }

    void a(Context context, String str, InitializationCallback initializationCallback) {
        j(context);
        if (s()) {
            a(initializationCallback);
            return;
        }
        if (context == null) {
            Logger.d("Initialization fail: Context is not provided");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Logger.d("Initialization fail: Source id is not provided");
            return;
        }
        if (initializationCallback != null) {
            this.a.add(initializationCallback);
        }
        if (this.b.compareAndSet(false, true)) {
            final Context applicationContext = context.getApplicationContext();
            this.s = applicationContext;
            this.t = str;
            this.o.a(applicationContext);
            SessionManager sessionManager = SessionManager.get();
            sessionManager.addObserver(this.o);
            sessionManager.attachContext(applicationContext);
            sessionManager.resume();
            BluetoothUtils.register(applicationContext);
            UserAgentManager.initialize(context);
            Rendering.setUserAgentProvider(new c(applicationContext));
            this.C = new u(applicationContext, str, this.D);
            Utils.onBackgroundThread(new Runnable() { // from class: io.bidmachine.k$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    k.this.d(applicationContext);
                }
            });
        }
    }

    long c(Context context) {
        return n.t(context);
    }

    String g() {
        return this.n.a();
    }

    long h(Context context) {
        long j = this.A;
        if (j != 0) {
            return j;
        }
        long C = n.C(context);
        this.A = C;
        return C;
    }

    long i(Context context) {
        long j = this.B;
        if (j != 0) {
            return j;
        }
        long D = n.D(context);
        this.B = D;
        return D;
    }

    io.bidmachine.internal.x k() {
        return this.f;
    }

    Publisher l() {
        return this.w;
    }

    int m() {
        return this.y;
    }

    String n() {
        return this.t;
    }

    public C o() {
        return this.j;
    }

    SessionTracker p() {
        return this.e;
    }

    TargetingParams q() {
        return this.u;
    }

    boolean r() {
        return t() || s();
    }

    boolean s() {
        return this.c.get();
    }

    boolean t() {
        return this.b.get();
    }

    boolean u() {
        return this.x;
    }

    void v() {
        Logger.d("Notify initialization finished");
        this.c.set(true);
        this.b.set(false);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            a((InitializationCallback) it.next());
        }
        this.a.clear();
    }

    List c() {
        return this.m;
    }

    AppParams e() {
        return this.h;
    }

    DeviceParams f() {
        return this.i;
    }

    String g(Context context) {
        return this.o.b(context);
    }

    InstallInfoProvider h() {
        return this.r;
    }

    int i() {
        return this.z;
    }

    PriceFloorParams j() {
        return this.g;
    }

    void b(AdRequest.AdRequestListener adRequestListener) {
        if (adRequestListener == null) {
            return;
        }
        this.m.remove(adRequestListener);
    }

    C6025u b(Context context) {
        return a(n.s(context));
    }

    Context d() {
        return this.s;
    }

    private static void a(final InitializationCallback initializationCallback) {
        if (initializationCallback == null) {
            return;
        }
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.k$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                InitializationCallback.this.onInitialized();
            }
        });
    }

    void a(final String str, final InitResponse initResponse, final String str2) {
        UrlProvider.setAuctionUrlFromInit(initResponse.getEndpoint());
        this.l.clear();
        ProtoUtils.prepareEvents(this.l, initResponse.getEventList());
        this.d.setDefaultEventConfiguration(initResponse.getEventConfiguration());
        SessionManager.get().setSessionResetAfter(initResponse.getSessionResetAfter());
        this.y = initResponse.getAdRequestTmax();
        this.z = initResponse.getAdNetworksLoadingTimeout();
        m.a(initResponse.getShowWithoutInternet());
        o.a(initResponse.getTokenConfigurationsList());
        Map<String, AdCachePlacementControl> adCachePlacementControlMap = initResponse.getAdCachePlacementControlMap();
        if (adCachePlacementControlMap != null) {
            C5999c.a(adCachePlacementControlMap);
            AdCachePlacementControl adCachePlacementControl = adCachePlacementControlMap.get(AdsType.Interstitial.getName());
            int maxCacheSize = adCachePlacementControl != null ? adCachePlacementControl.getMaxCacheSize() : 0;
            AdCachePlacementControl adCachePlacementControl2 = adCachePlacementControlMap.get(AdsType.Rewarded.getName());
            if (adCachePlacementControl2 != null) {
                maxCacheSize += adCachePlacementControl2.getMaxCacheSize();
            }
            if (maxCacheSize > 5) {
                VastRequest.setCacheSize(maxCacheSize);
            }
        }
        MraidUtils.dynamicMraidJs = ProtoUtilsKt.getString(initResponse.getExtras().getInternal(), "mraid_js");
        final io.bidmachine.internal.y a2 = E.a(initResponse.getRestrictionMode());
        Utils.ifNotNull(this.s, new Executable() { // from class: io.bidmachine.k$$ExternalSyntheticLambda0
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                k.this.a(str, initResponse, str2, a2, (Context) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, InitResponse initResponse, String str2, io.bidmachine.internal.y yVar, Context context) {
        this.p.a(context, str, initResponse, str2);
        this.q.configure(context, initResponse);
        this.o.b(context, initResponse.getBmifvTtlSessions());
        n.a(context, yVar);
        if (yVar == io.bidmachine.internal.y.STRICT) {
            a(context);
        }
    }

    private void a(Context context) {
        n.b(context, (String) null);
    }

    void a(Context context, List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NetworkRegistry.registerInitNetwork(context, (AdNetwork) it.next());
        }
    }

    void a(Context context, NetworkRegistry.c cVar) {
        NetworkRegistry.registerCoreNetworks();
        NetworkRegistry.initializeNetworksAsync(context, cVar);
    }

    List a(TrackEventType trackEventType) {
        return (List) this.l.get(trackEventType);
    }

    void a(boolean z) {
        this.x = z;
    }

    void a(TargetingParams targetingParams) {
        if (targetingParams == null) {
            targetingParams = new TargetingParams();
        }
        this.u = targetingParams;
    }

    void a(Publisher publisher) {
        this.w = publisher;
    }

    void a(AdRequest.AdRequestListener adRequestListener) {
        if (adRequestListener == null) {
            return;
        }
        this.m.add(adRequestListener);
    }

    InitializationParams a() {
        return new v(this.u, a(io.bidmachine.internal.y.STRICT).a());
    }

    C6025u a(io.bidmachine.internal.y yVar) {
        return this.f.a(SessionManager.get().getSessionId(), yVar);
    }
}
