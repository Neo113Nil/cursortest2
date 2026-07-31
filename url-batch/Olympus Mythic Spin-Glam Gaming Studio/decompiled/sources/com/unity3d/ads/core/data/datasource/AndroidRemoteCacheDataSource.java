package com.unity3d.ads.core.data.datasource;

import com.ironsource.V5;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HttpClientProvider;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidRemoteCacheDataSource.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJh\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00132*\u0010\u001b\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJh\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00132*\u0010\u001b\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0016H\u0096@¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$¨\u0006%"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/unity3d/ads/core/domain/CreateFile;", "createFile", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "getFileExtensionFromUrl", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "httpClientProvider", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/CreateFile;Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;Lcom/unity3d/ads/core/domain/HttpClientProvider;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "Ljava/io/File;", "cachePath", "", V5.c.b, "url", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "intervalMs", "Lkotlin/Function3;", "", "Lkotlin/coroutines/Continuation;", "", "", "onProgress", "Lcom/unity3d/ads/core/data/model/CacheResult;", "getFileInternal", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFile", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lcom/unity3d/ads/core/domain/CreateFile;", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AndroidRemoteCacheDataSource implements CacheDataSource {

    @NotNull
    private final CreateFile createFile;

    @NotNull
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;

    @NotNull
    private final HttpClientProvider httpClientProvider;

    @NotNull
    private final CoroutineDispatcher ioDispatcher;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidRemoteCacheDataSource(@NotNull CoroutineDispatcher ioDispatcher, @NotNull CreateFile createFile, @NotNull GetFileExtensionFromUrl getFileExtensionFromUrl, @NotNull HttpClientProvider httpClientProvider, @NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(createFile, "createFile");
        Intrinsics.checkNotNullParameter(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        Intrinsics.checkNotNullParameter(httpClientProvider, "httpClientProvider");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.ioDispatcher = ioDispatcher;
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
        this.httpClientProvider = httpClientProvider;
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    @Nullable
    public Object getFile(@NotNull File file, @NotNull String str, @Nullable String str2, @Nullable Integer num, int i, @Nullable Function3 function3, @NotNull Continuation continuation) {
        return getFileInternal(file, str, str2, num, i, function3, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, String str2, Integer num, int i, Function3 function3, Continuation continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new AndroidRemoteCacheDataSource$getFileInternal$2(str2, this, file, str, num, i, function3, null), continuation);
    }
}
