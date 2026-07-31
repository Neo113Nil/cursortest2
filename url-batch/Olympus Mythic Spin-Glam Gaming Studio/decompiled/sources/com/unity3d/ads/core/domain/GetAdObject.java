package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetAdObject.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦\u0002¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/domain/GetAdObject;", "", "invoke", "Lcom/unity3d/ads/core/data/model/AdObject;", "opportunityId", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface GetAdObject {
    @Nullable
    AdObject invoke(@NotNull String opportunityId);
}
