package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: CacheFile.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jj\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2,\b\u0002\u0010\u000f\u001a&\b\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bH¦B¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/CacheFile;", "", "", "url", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lorg/json/JSONArray;", "headers", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "intervalMs", "Lkotlin/Function3;", "", "Lkotlin/coroutines/Continuation;", "", "onProgress", "Lcom/unity3d/ads/core/data/model/CacheResult;", "invoke", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lorg/json/JSONArray;IILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface CacheFile {
    @Nullable
    Object invoke(@NotNull String str, @NotNull AdObject adObject, @Nullable JSONArray jSONArray, int i, int i2, @Nullable Function3 function3, @NotNull Continuation continuation);

    /* compiled from: CacheFile.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(CacheFile cacheFile, String str, AdObject adObject, JSONArray jSONArray, int i, int i2, Function3 function3, Continuation continuation, int i3, Object obj) {
            if (obj == null) {
                return cacheFile.invoke(str, adObject, jSONArray, i, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? null : function3, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }
}
