package com.unity3d.ads.injection;

import com.ironsource.Bd;
import com.ironsource.C4834q2;
import com.safedk.android.analytics.brandsafety.m;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Registry.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\f\u001a\u00020\u0007\"\u0006\b\u0000\u0010\r\u0018\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\b\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\r0\u0011H\u0086\bø\u0001\u0000J.\u0010\u0012\u001a\u00020\u0007\"\u0006\b\u0000\u0010\r\u0018\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\b\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\r0\u0011H\u0086\bø\u0001\u0000J\"\u0010\u0013\u001a\u00020\u0014\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0015\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\r0\bJ \u0010\u0016\u001a\u0002H\r\"\u0006\b\u0000\u0010\r\u0018\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086\b¢\u0006\u0002\u0010\u0017J\"\u0010\u0018\u001a\u0004\u0018\u0001H\r\"\u0006\b\u0000\u0010\r\u0018\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086\b¢\u0006\u0002\u0010\u0017R$\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"Lcom/unity3d/ads/injection/Registry;", "", "<init>", "()V", "_services", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/unity3d/ads/injection/EntryKey;", "Lkotlin/Lazy;", "services", "getServices", "()Ljava/util/Map;", Bd.d, "T", "named", "", C4834q2.p, "Lkotlin/Function0;", "factory", m.l, "", "key", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "getOrNull", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Registry {

    @NotNull
    private final MutableStateFlow _services = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());

    @NotNull
    public final Map<EntryKey, Lazy> getServices() {
        return (Map) this._services.getValue();
    }

    public static /* synthetic */ EntryKey single$default(Registry registry, String named, Function0 instance, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.reifiedOperationMarker(4, "T");
        EntryKey entryKey = new EntryKey(named, Reflection.getOrCreateKotlinClass(Object.class));
        registry.add(entryKey, LazyKt.lazy(instance));
        return entryKey;
    }

    public final /* synthetic */ <T> EntryKey single(String named, Function0 instance) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.reifiedOperationMarker(4, "T");
        EntryKey entryKey = new EntryKey(named, Reflection.getOrCreateKotlinClass(Object.class));
        add(entryKey, LazyKt.lazy(instance));
        return entryKey;
    }

    public static /* synthetic */ EntryKey factory$default(Registry registry, String named, Function0 instance, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.reifiedOperationMarker(4, "T");
        EntryKey entryKey = new EntryKey(named, Reflection.getOrCreateKotlinClass(Object.class));
        registry.add(entryKey, new Factory(instance));
        return entryKey;
    }

    public final /* synthetic */ <T> EntryKey factory(String named, Function0 instance) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.reifiedOperationMarker(4, "T");
        EntryKey entryKey = new EntryKey(named, Reflection.getOrCreateKotlinClass(Object.class));
        add(entryKey, new Factory(instance));
        return entryKey;
    }

    public final <T> void add(@NotNull EntryKey key, @NotNull Lazy instance) {
        Object value;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (getServices().containsKey(key)) {
            throw new IllegalStateException("Cannot have identical entries.");
        }
        MutableStateFlow mutableStateFlow = this._services;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MapsKt.plus((Map) value, MapsKt.mapOf(TuplesKt.to(key, instance)))));
    }

    public static /* synthetic */ Object get$default(Registry registry, String named, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.reifiedOperationMarker(4, "T");
        EntryKey entryKey = new EntryKey(named, Reflection.getOrCreateKotlinClass(Object.class));
        Lazy lazy = registry.getServices().get(entryKey);
        if (lazy == null) {
            throw new IllegalStateException("No entry found for " + entryKey);
        }
        Object value = lazy.getValue();
        Intrinsics.reifiedOperationMarker(1, "T");
        return value;
    }

    public final /* synthetic */ <T> T get(String named) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.reifiedOperationMarker(4, "T");
        EntryKey entryKey = new EntryKey(named, Reflection.getOrCreateKotlinClass(Object.class));
        Lazy lazy = getServices().get(entryKey);
        if (lazy == null) {
            throw new IllegalStateException("No entry found for " + entryKey);
        }
        T t = (T) lazy.getValue();
        Intrinsics.reifiedOperationMarker(1, "T");
        return t;
    }

    public static /* synthetic */ Object getOrNull$default(Registry registry, String named, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.reifiedOperationMarker(4, "T");
        Lazy lazy = registry.getServices().get(new EntryKey(named, Reflection.getOrCreateKotlinClass(Object.class)));
        if (lazy == null) {
            return null;
        }
        Object value = lazy.getValue();
        Intrinsics.reifiedOperationMarker(1, "T");
        return value;
    }

    public final /* synthetic */ <T> T getOrNull(String named) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.reifiedOperationMarker(4, "T");
        Lazy lazy = getServices().get(new EntryKey(named, Reflection.getOrCreateKotlinClass(Object.class)));
        if (lazy == null) {
            return null;
        }
        T t = (T) lazy.getValue();
        Intrinsics.reifiedOperationMarker(1, "T");
        return t;
    }
}
