package com.ogury.core.internal.datastore.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J4\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ogury/core/internal/datastore/datastore/core/InitializerApi;", "T", "", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "transform", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface InitializerApi<T> {
    @Nullable
    Object updateData(@NotNull Function2 function2, @NotNull Continuation continuation);
}
