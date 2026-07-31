package com.unity3d.ads.core.domain;

import com.ironsource.Zf;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: InternalLoadListener.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/InternalLoadListener;", "", Zf.j, "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "onAdLoadFail", "error", "Lcom/unity3d/ads/UnityAdsError;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface InternalLoadListener {
    void onAdLoadFail(@NotNull UnityAdsError error);

    void onAdLoaded(@NotNull AdObject adObject);
}
