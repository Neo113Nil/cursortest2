package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommonIsOMActivated.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/om/CommonIsOMActivated;", "Lcom/unity3d/ads/core/domain/om/IsOMActivated;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "<init>", "(Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "invoke", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonIsOMActivated implements IsOMActivated {

    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonIsOMActivated(@NotNull OpenMeasurementRepository openMeasurementRepository) {
        Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.core.domain.om.IsOMActivated
    public boolean invoke() {
        return this.openMeasurementRepository.isOMActive();
    }
}
