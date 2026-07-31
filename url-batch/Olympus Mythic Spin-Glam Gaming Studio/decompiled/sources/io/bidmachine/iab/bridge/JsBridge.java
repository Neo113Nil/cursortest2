package io.bidmachine.iab.bridge;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.mraid.MraidJsValidator;
import io.bidmachine.iab.mraid.MraidWebView;
import java.util.Map;

/* loaded from: classes14.dex */
public interface JsBridge extends JsProvider {
    @NonNull
    MraidJsValidator getJsValidator();

    boolean isHandled(@NonNull String str);

    void runJsCommand(@Nullable MraidWebView mraidWebView, @NonNull String str, @NonNull Map<String, String> map);
}
