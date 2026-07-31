package com.unity3d.ads.core.data.repository;

import com.ironsource.V5;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: CacheRepository.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001Jf\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062,\b\u0002\u0010\r\u001a&\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tH¦@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\fH¦@¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nH¦@¢\u0006\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lcom/unity3d/ads/core/data/repository/CacheRepository;", "", "", "url", "Lorg/json/JSONArray;", "headers", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "intervalMs", "Lkotlin/Function3;", "", "Lkotlin/coroutines/Continuation;", "", "onProgress", "Lcom/unity3d/ads/core/data/model/CacheResult;", "getFile", "(Ljava/lang/String;Lorg/json/JSONArray;IILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "type", "", "forceRemote", "getWebviewFile", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWebviewFileFromDisk", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/model/CachedFile;", "cachedFile", "removeFile", "(Lcom/unity3d/ads/core/data/model/CachedFile;)Z", V5.c.b, "doesFileExist", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveFile", "clearCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCacheSize", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface CacheRepository {
    @Nullable
    Object clearCache(@NotNull Continuation continuation);

    @Nullable
    Object doesFileExist(@NotNull String str, @NotNull Continuation continuation);

    @Nullable
    Object getCacheSize(@NotNull Continuation continuation);

    @Nullable
    Object getFile(@NotNull String str, @Nullable JSONArray jSONArray, int i, int i2, @Nullable Function3 function3, @NotNull Continuation continuation);

    @Nullable
    Object getWebviewFile(@NotNull String str, @NotNull String str2, boolean z, @NotNull Continuation continuation);

    @Nullable
    Object getWebviewFileFromDisk(@NotNull String str, @NotNull String str2, @NotNull Continuation continuation);

    boolean removeFile(@NotNull CachedFile cachedFile);

    @Nullable
    Object retrieveFile(@NotNull String str, @NotNull Continuation continuation);

    /* compiled from: CacheRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, JSONArray jSONArray, int i, int i2, Function3 function3, Continuation continuation, int i3, Object obj) {
            if (obj == null) {
                return cacheRepository.getFile(str, (i3 & 2) != 0 ? null : jSONArray, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? Integer.MAX_VALUE : i2, (i3 & 16) != 0 ? null : function3, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
        }

        public static /* synthetic */ Object getWebviewFile$default(CacheRepository cacheRepository, String str, String str2, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWebviewFile");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return cacheRepository.getWebviewFile(str, str2, z, continuation);
        }
    }
}
