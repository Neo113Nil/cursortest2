package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonCleanAssets.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u0007H\u0096B¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonCleanAssets;", "Lcom/unity3d/ads/core/domain/CleanAssets;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "<init>", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CommonCleanAssets implements CleanAssets {

    @NotNull
    private final CacheRepository cacheRepository;

    public CommonCleanAssets(@NotNull CacheRepository cacheRepository) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        this.cacheRepository = cacheRepository;
    }

    @Override // com.unity3d.ads.core.domain.CleanAssets
    @Nullable
    public Object invoke(@NotNull Continuation continuation) {
        Object clearCache = this.cacheRepository.clearCache(continuation);
        return clearCache == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? clearCache : Unit.INSTANCE;
    }
}
