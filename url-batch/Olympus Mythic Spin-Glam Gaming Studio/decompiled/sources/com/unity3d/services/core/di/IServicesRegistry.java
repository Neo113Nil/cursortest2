package com.unity3d.services.core.di;

import com.ironsource.C4834q2;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IServicesRegistry.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\u0005H&J\u001b\u0010\r\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000f\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0002\u0010\u000eJ)\u0010\u0010\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0013H&¢\u0006\u0002\u0010\u0014R\"\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/unity3d/services/core/di/IServicesRegistry;", "", "services", "", "Lcom/unity3d/services/core/di/ServiceKey;", "Lkotlin/Lazy;", "getServices", "()Ljava/util/Map;", "updateService", "", "T", "key", C4834q2.p, "resolveService", "(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;", "resolveServiceOrNull", "getService", "named", "", "Lkotlin/reflect/KClass;", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface IServicesRegistry {
    <T> T getService(@NotNull String named, @NotNull KClass<?> instance);

    @NotNull
    Map<ServiceKey, Lazy> getServices();

    <T> T resolveService(@NotNull ServiceKey key);

    @Nullable
    <T> T resolveServiceOrNull(@NotNull ServiceKey key);

    <T> void updateService(@NotNull ServiceKey key, @NotNull Lazy instance);

    /* compiled from: IServicesRegistry.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(IServicesRegistry iServicesRegistry, String str, KClass kClass, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            return iServicesRegistry.getService(str, kClass);
        }
    }
}
