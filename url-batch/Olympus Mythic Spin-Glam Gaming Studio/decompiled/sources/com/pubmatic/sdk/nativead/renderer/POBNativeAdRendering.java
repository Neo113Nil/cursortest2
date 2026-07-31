package com.pubmatic.sdk.nativead.renderer;

import android.view.View;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.viewability.POBNativeMeasurementProvider;
import com.pubmatic.sdk.nativead.response.POBNativeAdResponse;
import com.pubmatic.sdk.nativead.views.POBNativeTemplateView;
import com.pubmatic.sdk.openwrap.core.POBBid;
import java.util.List;

/* loaded from: classes15.dex */
public interface POBNativeAdRendering {
    void destroy();

    @Nullable
    @MainThread
    View getAdInfoIcon();

    void registerView(@NonNull POBNativeAdResponse pOBNativeAdResponse, @NonNull View view, @NonNull List<View> list);

    void renderAd(@NonNull POBNativeAdResponse pOBNativeAdResponse, @NonNull POBNativeTemplateView pOBNativeTemplateView, @NonNull POBBid pOBBid);

    void setAdRendererListener(@Nullable POBNativeRendererListener pOBNativeRendererListener);

    void setNativeMeasurementProvider(@Nullable POBNativeMeasurementProvider pOBNativeMeasurementProvider);

    void setWatermark(@Nullable String str);
}
