package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.WebViewConfiguration;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CacheWebViewAssets.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH¦B¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\u0010R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "", "cached", "", "", "Ljava/io/File;", "getCached", "()Ljava/util/Map;", "invoke", "", "webviewConfiguration", "Lcom/unity3d/ads/core/data/model/WebViewConfiguration;", "forceDownload", "", "(Lcom/unity3d/ads/core/data/model/WebViewConfiguration;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "warmFromDisk", "(Lcom/unity3d/ads/core/data/model/WebViewConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface CacheWebViewAssets {
    @NotNull
    Map<String, File> getCached();

    @Nullable
    Object invoke(@NotNull WebViewConfiguration webViewConfiguration, boolean z, @NotNull Continuation continuation);

    @Nullable
    Object warmFromDisk(@NotNull WebViewConfiguration webViewConfiguration, @NotNull Continuation continuation);

    /* compiled from: CacheWebViewAssets.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(CacheWebViewAssets cacheWebViewAssets, WebViewConfiguration webViewConfiguration, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return cacheWebViewAssets.invoke(webViewConfiguration, z, continuation);
        }
    }
}
