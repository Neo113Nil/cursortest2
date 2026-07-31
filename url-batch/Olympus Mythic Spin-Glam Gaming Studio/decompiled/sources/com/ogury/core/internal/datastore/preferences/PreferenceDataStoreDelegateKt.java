package com.ogury.core.internal.datastore.preferences;

import android.content.Context;
import com.ogury.core.internal.datastore.datastore.core.DataMigration;
import com.ogury.core.internal.datastore.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.ogury.core.internal.datastore.preferences.core.Preferences;
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
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a^\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"preferencesDataStore", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Lcom/ogury/core/internal/datastore/datastore/core/DataStore;", "Lcom/ogury/core/internal/datastore/preferences/core/Preferences;", "name", "", "corruptionHandler", "Lcom/ogury/core/internal/datastore/datastore/core/handlers/ReplaceFileCorruptionHandler;", "produceMigrations", "Lkotlin/Function1;", "", "Lcom/ogury/core/internal/datastore/datastore/core/DataMigration;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "sdk-core_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PreferenceDataStoreDelegateKt {
    @NotNull
    public static final ReadOnlyProperty preferencesDataStore(@NotNull String name, @Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @NotNull Function1 produceMigrations, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new PreferenceDataStoreSingletonDelegate(name, replaceFileCorruptionHandler, produceMigrations, scope);
    }

    public static /* synthetic */ ReadOnlyProperty preferencesDataStore$default(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: com.ogury.core.internal.datastore.preferences.PreferenceDataStoreDelegateKt$preferencesDataStore$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final List<DataMigration<Preferences>> invoke(@NotNull Context it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CollectionsKt.emptyList();
                }
            };
        }
        if ((i & 8) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        }
        return preferencesDataStore(str, replaceFileCorruptionHandler, function1, coroutineScope);
    }
}
