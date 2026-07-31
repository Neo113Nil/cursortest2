package com.ironsource;

import com.ironsource.Q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class T implements Q, Q.a {

    @NotNull
    private final ReadWriteLock a;

    @NotNull
    private final Map<String, P> b;

    /* JADX WARN: Multi-variable type inference failed */
    public T() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.Q
    @Nullable
    public P a(@NotNull String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.a.readLock().lock();
        try {
            return this.b.get(adId);
        } finally {
            this.a.readLock().unlock();
        }
    }

    public T(@NotNull ReadWriteLock readWriteLock) {
        Intrinsics.checkNotNullParameter(readWriteLock, "readWriteLock");
        this.a = readWriteLock;
        this.b = new LinkedHashMap();
    }

    @Override // com.ironsource.Q
    @NotNull
    public List<P> a() {
        this.a.readLock().lock();
        List<P> list = CollectionsKt.toList(this.b.values());
        this.a.readLock().unlock();
        return list;
    }

    public /* synthetic */ T(ReadWriteLock readWriteLock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.ironsource.Q.a
    public void a(@NotNull P adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.writeLock().lock();
        try {
            if (this.b.get(adInfo.c()) == null) {
                this.b.put(adInfo.c(), adInfo);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.Q.a
    public void a(@NotNull JSONObject json, @NotNull EnumC4796o0 adStatus, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(adStatus, "adStatus");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.a.writeLock().lock();
        try {
            P p = this.b.get(adId);
            if (p == null) {
                this.a.writeLock().unlock();
                return;
            }
            String bundleId = json.optString("bundleId");
            Intrinsics.checkNotNullExpressionValue(bundleId, "bundleId");
            if (bundleId.length() > 0) {
                p.a(bundleId);
            }
            String dynamicDemandSourceId = json.optString("dynamicDemandSource");
            Intrinsics.checkNotNullExpressionValue(dynamicDemandSourceId, "dynamicDemandSourceId");
            if (dynamicDemandSourceId.length() > 0) {
                p.a(S7.b.a(dynamicDemandSourceId));
            }
            p.a(adStatus);
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.Q.a
    public void a(@NotNull EnumC4796o0 adStatus, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(adStatus, "adStatus");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.a.writeLock().lock();
        try {
            P p = this.b.get(adId);
            if (p == null) {
                return;
            }
            p.a(adStatus);
            p.a(System.currentTimeMillis() / 1000.0d);
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
