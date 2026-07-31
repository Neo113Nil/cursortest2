package com.ironsource;

import com.ironsource.C4888t3;
import com.ironsource.S1;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class S1 {

    @NotNull
    private final V0 a;

    @NotNull
    private final AbstractC4961x0 b;

    @NotNull
    private final Map<String, I> c;

    @NotNull
    private final C4691i2 d;

    @NotNull
    private final List<CallableC4835q3> e;
    private final boolean f;

    public static final class a extends AbstractRunnableC4756le {
        final /* synthetic */ C4888t3 b;
        final /* synthetic */ S1 c;
        final /* synthetic */ C4888t3.b d;

        a(C4888t3 c4888t3, S1 s1, C4888t3.b bVar) {
            this.b = c4888t3;
            this.c = s1;
            this.d = bVar;
        }

        @Override // com.ironsource.AbstractRunnableC4756le
        public void a() {
            this.b.a(this.c.e(), this.d, this.c.b.f(), TimeUnit.MILLISECONDS);
        }
    }

    public static final class c implements C4888t3.b {
        final /* synthetic */ d b;

        c(d dVar) {
            this.b = dVar;
        }

        @Override // com.ironsource.C4888t3.b
        public void a(@NotNull final List<? extends C4906u3> biddingDataList, final long j, @NotNull final List<String> reachedTimeout) {
            Intrinsics.checkNotNullParameter(biddingDataList, "biddingDataList");
            Intrinsics.checkNotNullParameter(reachedTimeout, "reachedTimeout");
            V0 v0 = S1.this.a;
            final S1 s1 = S1.this;
            final d dVar = this.b;
            v0.c(new Runnable() { // from class: com.ironsource.S1$c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    S1.c.a(S1.this, j, biddingDataList, reachedTimeout, dVar);
                }
            });
        }

        @Override // com.ironsource.C4888t3.b
        public void onFailure(@NotNull final String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            V0 v0 = S1.this.a;
            final S1 s1 = S1.this;
            final d dVar = this.b;
            v0.c(new Runnable() { // from class: com.ironsource.S1$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    S1.c.a(S1.this, error, dVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(S1 this$0, long j, List biddingDataList, List reachedTimeout, d biddingDataListener) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(biddingDataList, "$biddingDataList");
            Intrinsics.checkNotNullParameter(reachedTimeout, "$reachedTimeout");
            Intrinsics.checkNotNullParameter(biddingDataListener, "$biddingDataListener");
            this$0.a(j, biddingDataList, reachedTimeout, biddingDataListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(S1 this$0, String error, d biddingDataListener) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(error, "$error");
            Intrinsics.checkNotNullParameter(biddingDataListener, "$biddingDataListener");
            this$0.a.f().g().a(error);
            biddingDataListener.a(this$0, error);
        }
    }

    public interface d {
        void a(@NotNull S1 s1);

        void a(@NotNull S1 s1, @NotNull String str);
    }

    public S1(@NotNull V0 adTools, @NotNull AbstractC4961x0 adUnitData, @Nullable C4712j6 c4712j6) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.a = adTools;
        this.b = adUnitData;
        this.c = a();
        this.d = new C4691i2(adUnitData);
        this.e = new ArrayList();
        this.f = adUnitData.e().q();
        b b2 = b();
        Uf g = adUnitData.b().g();
        boolean z = Kb.u.d().h().w() && (adUnitData.b().a() == IronSource.a.INTERSTITIAL || adUnitData.b().a() == IronSource.a.REWARDED_VIDEO);
        for (NetworkSettings networkSettings : adUnitData.m()) {
            if (g == null || g.a(networkSettings, this.b.b().a())) {
                AdData a2 = this.b.a(networkSettings);
                if (networkSettings.isBidder(this.b.b().a())) {
                    Object b3 = this.f ? b(networkSettings.getProviderName()) : a(networkSettings);
                    if (b3 instanceof InterfaceC4870s3) {
                        this.e.add(new CallableC4835q3(networkSettings.getInstanceType(this.b.b().a()), networkSettings.getProviderInstanceName(), a2, (InterfaceC4870s3) b3, b2, networkSettings));
                    } else {
                        this.a.f().h().g(b3 == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                    }
                } else if (!z) {
                    this.d.a(networkSettings);
                }
            }
        }
        this.d.a(c4712j6);
    }

    @NotNull
    public final Map<String, I> c() {
        return this.c;
    }

    @NotNull
    public final C4691i2 d() {
        return this.d;
    }

    @NotNull
    public final List<CallableC4835q3> e() {
        return this.e;
    }

    public final boolean f() {
        return !this.e.isEmpty();
    }

    public final boolean g() {
        return this.d.e();
    }

    public final boolean h() {
        return this.f;
    }

    private final b b() {
        return new b();
    }

    private final C4888t3.b b(d dVar) {
        return new c(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseAdAdapter<?, ?> b(String str) {
        I i = this.c.get(str);
        if (i != null) {
            return i.b();
        }
        return null;
    }

    private final Map<String, I> a() {
        List<NetworkSettings> m = this.b.m();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(m, 10)), 16));
        Iterator<T> it = m.iterator();
        while (it.hasNext()) {
            I i = new I(this.a, this.b, (NetworkSettings) it.next());
            Pair pair = TuplesKt.to(i.c(), i);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static final class b implements InterfaceC4852r3 {
        b() {
        }

        @Override // com.ironsource.InterfaceC4852r3
        public void a(@Nullable NetworkSettings networkSettings) {
            AdapterBaseInterface a;
            if (S1.this.h()) {
                a = null;
                BaseAdAdapter b = S1.this.b(networkSettings != null ? networkSettings.getProviderName() : null);
                if (b != null) {
                    a = b.getNetworkAdapter();
                }
            } else {
                a = S1.this.a(networkSettings);
            }
            if (a != null) {
                S1.this.a.f().g().b(S1.this.a(networkSettings, a));
            }
        }

        @Override // com.ironsource.InterfaceC4852r3
        public void a(@Nullable String str) {
            S1.this.a.f().h().g(str);
        }
    }

    public /* synthetic */ S1(V0 v0, AbstractC4961x0 abstractC4961x0, C4712j6 c4712j6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(v0, abstractC4961x0, (i & 4) != 0 ? null : c4712j6);
    }

    public final void a(@NotNull d biddingDataListener) {
        Intrinsics.checkNotNullParameter(biddingDataListener, "biddingDataListener");
        C4888t3 c4888t3 = new C4888t3();
        C4888t3.b b2 = b(biddingDataListener);
        this.a.f().g().a(this.b.f());
        this.a.a((AbstractRunnableC4756le) new a(c4888t3, this, b2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j, List<? extends C4906u3> list, List<String> list2, d dVar) {
        this.a.f().g().b(j);
        for (C4906u3 c4906u3 : list) {
            String c2 = c4906u3.c();
            Intrinsics.checkNotNullExpressionValue(c2, "biddingResponse.instanceName");
            Map<String, Object> a2 = a(c2);
            if (c4906u3.a() != null) {
                this.d.a(c4906u3);
                this.a.f().g().a(a2, c4906u3.e());
            } else {
                this.a.f().g().a(a2, c4906u3.e(), c4906u3.b());
            }
        }
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            this.a.f().g().b(a(it.next()), j);
        }
        dVar.a(this);
    }

    private final Map<String, Object> a(String str) {
        AdapterBaseInterface a2;
        NetworkSettings a3 = this.b.a(str);
        if (this.f) {
            BaseAdAdapter<?, ?> b2 = b(str);
            a2 = b2 != null ? b2.getNetworkAdapter() : null;
        } else {
            a2 = a(a3);
        }
        return a(a3, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        String providerDefaultInstance;
        HashMap hashMap = new HashMap();
        if (networkSettings != null) {
            try {
                providerDefaultInstance = networkSettings.getProviderDefaultInstance();
            } catch (Exception e) {
                C4782n4.d().a(e);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + (networkSettings != null ? networkSettings.getProviderDefaultInstance() : null), e);
            }
        } else {
            providerDefaultInstance = null;
        }
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, providerDefaultInstance);
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getAdapterVersion() : null);
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getNetworkSDKVersion() : null);
        hashMap.put("spId", networkSettings != null ? networkSettings.getSubProviderId() : null);
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        hashMap.put("instanceType", networkSettings != null ? Integer.valueOf(networkSettings.getInstanceType(this.b.b().a())) : null);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdapterBaseInterface a(NetworkSettings networkSettings) {
        return com.ironsource.mediationsdk.c.b().b(networkSettings, this.b.b().a(), this.b.b().b());
    }
}
