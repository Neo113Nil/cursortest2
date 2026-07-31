package io.bidmachine.iab.measurer;

import android.view.View;
import androidx.annotation.NonNull;
import io.bidmachine.iab.vast.VastRequest;

/* loaded from: classes14.dex */
public interface VastAdMeasurer extends AdMeasurer<View> {
    void onVastModelLoaded(@NonNull VastRequest vastRequest);
}
