package com.unity3d.ads.core.data.model;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UniversalRequestStoreSerializer.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/data/model/UniversalRequestStoreSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "<init>", "()V", "defaultValue", "getDefaultValue", "()Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "readFrom", "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "", "t", "output", "Ljava/io/OutputStream;", "(Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniversalRequestStoreSerializer implements Serializer<UniversalRequestStoreOuterClass.UniversalRequestStore> {

    @NotNull
    private final UniversalRequestStoreOuterClass.UniversalRequestStore defaultValue;

    public UniversalRequestStoreSerializer() {
        UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance(...)");
        this.defaultValue = defaultInstance;
    }

    @Override // androidx.datastore.core.Serializer
    @NotNull
    public UniversalRequestStoreOuterClass.UniversalRequestStore getDefaultValue() {
        return this.defaultValue;
    }

    @Override // androidx.datastore.core.Serializer
    @Nullable
    public Object readFrom(@NotNull InputStream inputStream, @NotNull Continuation continuation) {
        try {
            UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom = UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(inputStream);
            Intrinsics.checkNotNullExpressionValue(parseFrom, "parseFrom(...)");
            return parseFrom;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        } catch (Throwable th) {
            throw new CorruptionException("Error while reading proto file.", th);
        }
    }

    @Override // androidx.datastore.core.Serializer
    @Nullable
    public Object writeTo(@NotNull UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, @NotNull OutputStream outputStream, @NotNull Continuation continuation) {
        universalRequestStore.writeTo(outputStream);
        return Unit.INSTANCE;
    }
}
