package com.ogury.core.internal.datastore.datastore.core;

import com.ogury.core.internal.datastore.datastore.core.handlers.NoOpCorruptionHandler;
import com.ogury.core.internal.datastore.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jb\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¨\u0006\u0012"}, d2 = {"Lcom/ogury/core/internal/datastore/datastore/core/DataStoreFactory;", "", "()V", "create", "Lcom/ogury/core/internal/datastore/datastore/core/DataStore;", "T", "serializer", "Lcom/ogury/core/internal/datastore/datastore/core/Serializer;", "corruptionHandler", "Lcom/ogury/core/internal/datastore/datastore/core/handlers/ReplaceFileCorruptionHandler;", "migrations", "", "Lcom/ogury/core/internal/datastore/datastore/core/DataMigration;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "produceFile", "Lkotlin/Function0;", "Ljava/io/File;", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DataStoreFactory {

    @NotNull
    public static final DataStoreFactory INSTANCE = new DataStoreFactory();

    private DataStoreFactory() {
    }

    public static /* synthetic */ DataStore create$default(DataStoreFactory dataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, CoroutineScope coroutineScope, Function0 function0, int i, Object obj) {
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = (i & 2) != 0 ? null : replaceFileCorruptionHandler;
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        if ((i & 8) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        }
        return dataStoreFactory.create(serializer, replaceFileCorruptionHandler2, list2, coroutineScope, function0);
    }

    @NotNull
    public final <T> DataStore<T> create(@NotNull Serializer<T> serializer, @Nullable ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @NotNull List<? extends DataMigration<T>> migrations, @NotNull Function0 produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, migrations, null, produceFile, 8, null);
    }

    @NotNull
    public final <T> DataStore<T> create(@NotNull Serializer<T> serializer, @Nullable ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @NotNull Function0 produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, produceFile, 12, null);
    }

    @NotNull
    public final <T> DataStore<T> create(@NotNull Serializer<T> serializer, @NotNull Function0 produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, serializer, null, null, null, produceFile, 14, null);
    }

    @NotNull
    public final <T> DataStore<T> create(@NotNull Serializer<T> serializer, @Nullable ReplaceFileCorruptionHandler<T> corruptionHandler, @NotNull List<? extends DataMigration<T>> migrations, @NotNull CoroutineScope scope, @NotNull Function0 produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        if (corruptionHandler == null) {
            corruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new SingleProcessDataStore(produceFile, serializer, CollectionsKt.listOf(DataMigrationInitializer.INSTANCE.getInitializer(migrations)), corruptionHandler, scope, 0, 32, null);
    }
}
