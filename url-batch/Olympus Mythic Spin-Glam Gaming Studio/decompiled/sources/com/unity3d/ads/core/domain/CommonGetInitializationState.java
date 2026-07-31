package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.InitializationStateKt;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommonGetInitializationState.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetInitializationState;", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sdkPropertiesManager", "Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;)V", "invoke", "Lcom/unity3d/ads/core/data/model/InitializationState;", "legacy", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CommonGetInitializationState implements GetInitializationState {

    @NotNull
    private final SDKPropertiesManager sdkPropertiesManager;

    @NotNull
    private final SessionRepository sessionRepository;

    public CommonGetInitializationState(@NotNull SessionRepository sessionRepository, @NotNull SDKPropertiesManager sdkPropertiesManager) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(sdkPropertiesManager, "sdkPropertiesManager");
        this.sessionRepository = sessionRepository;
        this.sdkPropertiesManager = sdkPropertiesManager;
    }

    @Override // com.unity3d.ads.core.domain.GetInitializationState
    @NotNull
    public InitializationState invoke(boolean legacy) {
        if (legacy) {
            return InitializationStateKt.toBold(this.sdkPropertiesManager.getCurrentInitializationState());
        }
        return this.sessionRepository.getInitializationState();
    }
}
