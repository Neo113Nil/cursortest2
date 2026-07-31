package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineOpportunity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/data/model/CoroutineOpportunity;", "Lkotlin/coroutines/CoroutineContext$Element;", "value", "Lcom/google/protobuf/ByteString;", "<init>", "(Lcom/google/protobuf/ByteString;)V", "getValue", "()Lcom/google/protobuf/ByteString;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "Key", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CoroutineOpportunity implements CoroutineContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ByteString value;

    public CoroutineOpportunity(@NotNull ByteString value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2 function2) {
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key key) {
        return (E) CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @NotNull
    public final ByteString getValue() {
        return this.value;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.Key getKey() {
        return INSTANCE;
    }

    /* compiled from: CoroutineOpportunity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/core/data/model/CoroutineOpportunity$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lcom/unity3d/ads/core/data/model/CoroutineOpportunity;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.data.model.CoroutineOpportunity$Key, reason: from kotlin metadata */
    public static final class Companion implements CoroutineContext.Key {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
