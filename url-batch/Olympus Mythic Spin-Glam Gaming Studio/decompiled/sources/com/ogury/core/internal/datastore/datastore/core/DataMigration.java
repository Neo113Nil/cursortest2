package com.ogury.core.internal.datastore.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000e\u0010\u0003\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H¦@¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u0000H¦@¢\u0006\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ogury/core/internal/datastore/datastore/core/DataMigration;", "T", "", "cleanUp", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "migrate", "currentData", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldMigrate", "", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DataMigration<T> {
    @Nullable
    Object cleanUp(@NotNull Continuation continuation);

    @Nullable
    Object migrate(T t, @NotNull Continuation continuation);

    @Nullable
    Object shouldMigrate(T t, @NotNull Continuation continuation);
}
