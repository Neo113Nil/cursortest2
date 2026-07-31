package com.monetization.ads.mediation.base.prefetch;

import androidx.annotation.MainThread;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.monetization.ads.mediation.base.prefetch.model.MediatedPrefetchAdapterData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/monetization/ads/mediation/base/prefetch/MediatedAdapterPrefetchListener;", "", "onPrefetchFailed", "", IronSourceConstants.EVENTS_ERROR_CODE, "", "errorMessage", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "onPrefetched", "mediatedPrefetchAdapterData", "Lcom/monetization/ads/mediation/base/prefetch/model/MediatedPrefetchAdapterData;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface MediatedAdapterPrefetchListener {
    @MainThread
    void onPrefetchFailed(@Nullable Integer errorCode, @Nullable String errorMessage);

    @MainThread
    void onPrefetched(@NotNull MediatedPrefetchAdapterData mediatedPrefetchAdapterData);
}
