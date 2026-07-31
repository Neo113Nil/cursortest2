package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.DataMigration;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FetchGLInfoDataMigration.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\rJ\b\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/FetchGLInfoDataMigration;", "Landroidx/datastore/core/DataMigration;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "getOpenGLRendererInfo", "Lcom/unity3d/ads/core/domain/GetOpenGLRendererInfo;", "<init>", "(Lcom/unity3d/ads/core/domain/GetOpenGLRendererInfo;)V", "cleanUp", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldMigrate", "", "currentData", "(Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "migrate", "gatherOpenGLRendererInfo", "Lcom/google/protobuf/ByteString;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FetchGLInfoDataMigration implements DataMigration<ByteStringStoreOuterClass.ByteStringStore> {

    @NotNull
    private final GetOpenGLRendererInfo getOpenGLRendererInfo;

    public FetchGLInfoDataMigration(@NotNull GetOpenGLRendererInfo getOpenGLRendererInfo) {
        Intrinsics.checkNotNullParameter(getOpenGLRendererInfo, "getOpenGLRendererInfo");
        this.getOpenGLRendererInfo = getOpenGLRendererInfo;
    }

    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object cleanUp(@NotNull Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object shouldMigrate(@NotNull ByteStringStoreOuterClass.ByteStringStore byteStringStore, @NotNull Continuation continuation) {
        return Boxing.boxBoolean(byteStringStore.getData().isEmpty());
    }

    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object migrate(@NotNull ByteStringStoreOuterClass.ByteStringStore byteStringStore, @NotNull Continuation continuation) {
        ByteString byteString;
        try {
            byteString = gatherOpenGLRendererInfo();
        } catch (Exception unused) {
            byteString = ByteString.EMPTY;
            Intrinsics.checkNotNull(byteString);
        }
        ByteStringStoreOuterClass.ByteStringStore build = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(byteString).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final ByteString gatherOpenGLRendererInfo() {
        return this.getOpenGLRendererInfo.invoke();
    }
}
