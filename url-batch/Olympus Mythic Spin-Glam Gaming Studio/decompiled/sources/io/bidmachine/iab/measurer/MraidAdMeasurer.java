package io.bidmachine.iab.measurer;

import android.webkit.WebView;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public interface MraidAdMeasurer extends AdMeasurer<WebView> {
    @NonNull
    String prepareCreativeForMeasure(@NonNull String str);
}
