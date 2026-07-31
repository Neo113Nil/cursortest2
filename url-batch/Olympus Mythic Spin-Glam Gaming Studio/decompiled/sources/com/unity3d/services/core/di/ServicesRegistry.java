package com.unity3d.services.core.di;

import com.ironsource.Bd;
import com.ironsource.C4834q2;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ServicesRegistry.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\f\u001a\u00020\u0006\"\u0006\b\u0000\u0010\r\u0018\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\b\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\r0\u0011H\u0086\bø\u0001\u0000J.\u0010\u0012\u001a\u00020\u0006\"\u0006\b\u0000\u0010\r\u0018\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\b\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\r0\u0011H\u0086\bø\u0001\u0000J$\u0010\u0013\u001a\u00020\u0014\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0015\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\r0\u0007H\u0016J \u0010\u0016\u001a\u0002H\r\"\u0006\b\u0000\u0010\r\u0018\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086\b¢\u0006\u0002\u0010\u0017J'\u0010\u0018\u001a\u0002H\r\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0016¢\u0006\u0002\u0010\u001aJ\"\u0010\u001b\u001a\u0004\u0018\u0001H\r\"\u0006\b\u0000\u0010\r\u0018\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086\b¢\u0006\u0002\u0010\u0017J\u001b\u0010\u001c\u001a\u0002H\r\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u001dJ\u001d\u0010\u001e\u001a\u0004\u0018\u0001H\r\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u001dR\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"Lcom/unity3d/services/core/di/ServicesRegistry;", "Lcom/unity3d/services/core/di/IServicesRegistry;", "<init>", "()V", "_services", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/unity3d/services/core/di/ServiceKey;", "Lkotlin/Lazy;", "services", "", "getServices", "()Ljava/util/Map;", Bd.d, "T", "named", "", C4834q2.p, "Lkotlin/Function0;", "factory", "updateService", "", "key", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "getService", "Lkotlin/reflect/KClass;", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getOrNull", "resolveService", "(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;", "resolveServiceOrNull", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ServicesRegistry implements IServicesRegistry {

    @NotNull
    private final ConcurrentHashMap<ServiceKey, Lazy> _services = new ConcurrentHashMap<>();

    @Override // com.unity3d.services.core.di.IServicesRegistry
    @NotNull
    public Map<ServiceKey, Lazy> getServices() {
        return this._services;
    }

    public static /* synthetic */ ServiceKey single$default(ServicesRegistry servicesRegistry, String named, Function0 instance, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.reifiedOperationMarker(4, "T");
        ServiceKey serviceKey = new ServiceKey(named, Reflection.getOrCreateKotlinClass(Object.class));
        servicesRegistry.updateService(serviceKey, LazyKt.lazy(instance));
        return serviceKey;
    }

    public final /* synthetic */ <T> ServiceKey single(String named, Function0 instance) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.reifiedOperationMarker(4, "T");
        ServiceKey serviceKey = new ServiceKey(named, Reflection.getOrCreateKotlinClass(Object.class));
        updateService(serviceKey, LazyKt.lazy(instance));
        return serviceKey;
    }

    public static /* synthetic */ ServiceKey factory$default(ServicesRegistry servicesRegistry, String named, Function0 instance, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.reifiedOperationMarker(4, "T");
        ServiceKey serviceKey = new ServiceKey(named, Reflection.getOrCreateKotlinClass(Object.class));
        servicesRegistry.updateService(serviceKey, ServiceFactoryKt.factoryOf(instance));
        return serviceKey;
    }

    public final /* synthetic */ <T> ServiceKey factory(String named, Function0 instance) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.reifiedOperationMarker(4, "T");
        ServiceKey serviceKey = new ServiceKey(named, Reflection.getOrCreateKotlinClass(Object.class));
        updateService(serviceKey, ServiceFactoryKt.factoryOf(instance));
        return serviceKey;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> void updateService(@NotNull ServiceKey key, @NotNull Lazy instance) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (getServices().containsKey(key)) {
            throw new IllegalStateException(("Cannot have multiple identical services: " + key).toString());
        }
        this._services.put(key, instance);
    }

    public static /* synthetic */ Object get$default(ServicesRegistry servicesRegistry, String named, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.reifiedOperationMarker(4, "T");
        return servicesRegistry.resolveService(new ServiceKey(named, Reflection.getOrCreateKotlinClass(Object.class)));
    }

    public final /* synthetic */ <T> T get(String named) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) resolveService(new ServiceKey(named, Reflection.getOrCreateKotlinClass(Object.class)));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T getService(@NotNull String named, @NotNull KClass<?> instance) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        return (T) resolveService(new ServiceKey(named, instance));
    }

    public static /* synthetic */ Object getOrNull$default(ServicesRegistry servicesRegistry, String named, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.reifiedOperationMarker(4, "T");
        return servicesRegistry.resolveServiceOrNull(new ServiceKey(named, Reflection.getOrCreateKotlinClass(Object.class)));
    }

    public final /* synthetic */ <T> T getOrNull(String named) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) resolveServiceOrNull(new ServiceKey(named, Reflection.getOrCreateKotlinClass(Object.class)));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveService(@NotNull ServiceKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Lazy lazy = getServices().get(key);
        if (lazy == null) {
            throw new IllegalStateException("No service instance found for " + key);
        }
        return (T) lazy.getValue();
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    @Nullable
    public <T> T resolveServiceOrNull(@NotNull ServiceKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Lazy lazy = getServices().get(key);
        if (lazy == null) {
            return null;
        }
        return (T) lazy.getValue();
    }
}
