package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.TcfDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidTcfRepository.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidTcfRepository;", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "tcfDataSource", "Lcom/unity3d/ads/core/data/datasource/TcfDataSource;", "<init>", "(Lcom/unity3d/ads/core/data/datasource/TcfDataSource;)V", "getTcfDataSource", "()Lcom/unity3d/ads/core/data/datasource/TcfDataSource;", "tcfString", "", "getTcfString", "()Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AndroidTcfRepository implements TcfRepository {

    @NotNull
    private final TcfDataSource tcfDataSource;

    public AndroidTcfRepository(@NotNull TcfDataSource tcfDataSource) {
        Intrinsics.checkNotNullParameter(tcfDataSource, "tcfDataSource");
        this.tcfDataSource = tcfDataSource;
    }

    @NotNull
    public final TcfDataSource getTcfDataSource() {
        return this.tcfDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.TcfRepository
    @Nullable
    public String getTcfString() {
        return this.tcfDataSource.getTcfString();
    }
}
