package com.ogury.core.internal.datastore.datastore;

import android.content.Context;
import com.ironsource.V5;
import com.ogury.core.internal.datastore.datastore.core.Serializer;
import com.ogury.core.internal.datastore.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001ar\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0001\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\n2 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000e0\r0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"dataStore", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Lcom/ogury/core/internal/datastore/datastore/core/DataStore;", "T", V5.c.b, "", "serializer", "Lcom/ogury/core/internal/datastore/datastore/core/Serializer;", "corruptionHandler", "Lcom/ogury/core/internal/datastore/datastore/core/handlers/ReplaceFileCorruptionHandler;", "produceMigrations", "Lkotlin/Function1;", "", "Lcom/ogury/core/internal/datastore/datastore/core/DataMigration;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "sdk-core_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DataStoreDelegateKt {
    @NotNull
    public static final <T> ReadOnlyProperty dataStore(@NotNull String fileName, @NotNull Serializer<T> serializer, @Nullable ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @NotNull Function1 produceMigrations, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new DataStoreSingletonDelegate(fileName, serializer, replaceFileCorruptionHandler, produceMigrations, scope);
    }

    public static /* synthetic */ ReadOnlyProperty dataStore$default(String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 4) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: com.ogury.core.internal.datastore.datastore.DataStoreDelegateKt$dataStore$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final List invoke(@NotNull Context it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CollectionsKt.emptyList();
                }
            };
        }
        if ((i & 16) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        }
        return dataStore(str, serializer, replaceFileCorruptionHandler, function1, coroutineScope);
    }
}
