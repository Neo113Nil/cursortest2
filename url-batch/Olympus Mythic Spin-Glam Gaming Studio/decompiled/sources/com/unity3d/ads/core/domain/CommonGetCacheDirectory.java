package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommonGetCacheDirectory.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0096\u0002¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetCacheDirectory;", "Lcom/unity3d/ads/core/domain/GetCacheDirectory;", "<init>", "()V", "invoke", "Ljava/io/File;", "cacheDirectoryBase", "cacheDirectoryPath", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CommonGetCacheDirectory implements GetCacheDirectory {
    @Override // com.unity3d.ads.core.domain.GetCacheDirectory
    @NotNull
    public File invoke(@NotNull File cacheDirectoryBase, @NotNull String cacheDirectoryPath) {
        Intrinsics.checkNotNullParameter(cacheDirectoryBase, "cacheDirectoryBase");
        Intrinsics.checkNotNullParameter(cacheDirectoryPath, "cacheDirectoryPath");
        return new File(cacheDirectoryBase, cacheDirectoryPath);
    }
}
