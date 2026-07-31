package io.bidmachine.rendering.measurer;

import android.webkit.WebView;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public interface HtmlMeasurer extends Measurer<WebView> {
    @NonNull
    String prepareCreativeForMeasure(@NonNull String str);
}
