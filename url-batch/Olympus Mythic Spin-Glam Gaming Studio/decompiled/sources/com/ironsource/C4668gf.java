package com.ironsource;

import com.ironsource.N8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.FeaturesManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.gf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4668gf implements N8, N8.a {

    @NotNull
    private Map<String, C4978y> a = new LinkedHashMap();

    @NotNull
    private final C4826pc b = new C4826pc();

    @NotNull
    private final ReadWriteLock c = new ReentrantReadWriteLock();

    /* renamed from: com.ironsource.gf$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4650ff.values().length];
            try {
                iArr[EnumC4650ff.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4650ff.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4650ff.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    private final void b() {
        C4632ef configuration = FeaturesManager.getInstance().getSessionHistoryConfig();
        C4826pc c4826pc = this.b;
        Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
        c4826pc.a(a(configuration));
        this.b.a(a());
    }

    @Override // com.ironsource.N8.a
    public void a(@NotNull AbstractC4686hf historyRecord) {
        Intrinsics.checkNotNullParameter(historyRecord, "historyRecord");
        this.c.writeLock().lock();
        try {
            P a2 = historyRecord.a();
            String valueOf = String.valueOf(a2 != null ? a2.b() : null);
            Map<String, C4978y> map = this.a;
            C4978y c4978y = map.get(valueOf);
            if (c4978y == null) {
                c4978y = new C4978y();
                map.put(valueOf, c4978y);
            }
            c4978y.a(historyRecord.a(new C4793nf()));
            this.c.writeLock().unlock();
            b();
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.N8
    @NotNull
    public JSONObject a(@NotNull EnumC4847qf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.c.readLock().lock();
        try {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            for (Map.Entry<String, C4978y> entry : this.a.entrySet()) {
                String key = entry.getKey();
                JSONObject a2 = entry.getValue().a(mode);
                if (a2.length() > 0) {
                    jsonObjectInit.put(key, a2);
                }
            }
            return jsonObjectInit;
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.N8
    public int a(@NotNull IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.c.readLock().lock();
        try {
            C4978y c4978y = this.a.get(adFormat.toString());
            return c4978y != null ? c4978y.a() : 0;
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.N8
    @NotNull
    public List<String> a() {
        this.c.readLock().lock();
        try {
            Map<String, C4978y> map = this.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C4978y> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List<String> list = CollectionsKt.toList(linkedHashMap.keySet());
            this.c.readLock().unlock();
            return list;
        } catch (Throwable th) {
            this.c.readLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.N8
    @NotNull
    public Map<String, JSONObject> a(@NotNull C4632ef configuration) {
        Map<String, JSONObject> mutableMapOf;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.c.readLock().lock();
        try {
            int i = a.a[configuration.a().ordinal()];
            if (i == 1) {
                mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(O6.z1, a(EnumC4847qf.FullHistory)), TuplesKt.to(O6.A1, a(EnumC4847qf.CurrentlyLoadedAds)));
            } else if (i == 2) {
                mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(O6.A1, a(EnumC4847qf.CurrentlyLoadedAds)));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                mutableMapOf = MapsKt.emptyMap();
            }
            this.c.readLock().unlock();
            return mutableMapOf;
        } catch (Throwable th) {
            this.c.readLock().unlock();
            throw th;
        }
    }
}
