package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UniversalRequestDataSource.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "", "universalRequestStoreProvider", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;", "<init>", "(Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;)V", "get", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "set", "", "key", "", "data", "Lcom/google/protobuf/ByteString;", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UniversalRequestDataSource {

    @NotNull
    private final UniversalRequestDataStoreProvider universalRequestStoreProvider;

    public UniversalRequestDataSource(@NotNull UniversalRequestDataStoreProvider universalRequestStoreProvider) {
        Intrinsics.checkNotNullParameter(universalRequestStoreProvider, "universalRequestStoreProvider");
        this.universalRequestStoreProvider = universalRequestStoreProvider;
    }

    @Nullable
    public final Object get(@NotNull Continuation continuation) {
        return FlowKt.first(FlowKt.m8234catch(this.universalRequestStoreProvider.invoke().getData(), new UniversalRequestDataSource$get$2(null)), continuation);
    }

    @Nullable
    public final Object set(@NotNull String str, @NotNull ByteString byteString, @NotNull Continuation continuation) {
        Object updateData = this.universalRequestStoreProvider.invoke().updateData(new UniversalRequestDataSource$set$2(str, byteString, null), continuation);
        return updateData == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateData : Unit.INSTANCE;
    }

    @Nullable
    public final Object remove(@NotNull String str, @NotNull Continuation continuation) {
        Object updateData = this.universalRequestStoreProvider.invoke().updateData(new UniversalRequestDataSource$remove$2(str, null), continuation);
        return updateData == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateData : Unit.INSTANCE;
    }
}
