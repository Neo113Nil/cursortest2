package com.unity3d.ads.datastore;

import com.unity3d.ads.datastore.UniversalRequestStoreKt;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UniversalRequestStoreKt.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/unity3d/ads/datastore/UniversalRequestStoreKt$Dsl;", "", "block", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "-initializeuniversalRequestStore", "(Lkotlin/jvm/functions/Function1;)Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "universalRequestStore", "copy", "(Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;Lkotlin/jvm/functions/Function1;)Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UniversalRequestStoreKtKt {
    @NotNull
    /* renamed from: -initializeuniversalRequestStore, reason: not valid java name */
    public static final UniversalRequestStoreOuterClass.UniversalRequestStore m6948initializeuniversalRequestStore(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        UniversalRequestStoreKt.Dsl.Companion companion = UniversalRequestStoreKt.Dsl.INSTANCE;
        UniversalRequestStoreOuterClass.UniversalRequestStore.Builder newBuilder = UniversalRequestStoreOuterClass.UniversalRequestStore.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        UniversalRequestStoreKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final UniversalRequestStoreOuterClass.UniversalRequestStore copy(@NotNull UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(universalRequestStore, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UniversalRequestStoreKt.Dsl.Companion companion = UniversalRequestStoreKt.Dsl.INSTANCE;
        UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = universalRequestStore.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        UniversalRequestStoreKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
