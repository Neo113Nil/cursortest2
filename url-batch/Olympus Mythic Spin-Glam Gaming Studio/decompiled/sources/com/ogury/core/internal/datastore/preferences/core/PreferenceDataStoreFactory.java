package com.ogury.core.internal.datastore.preferences.core;

import com.ogury.core.internal.datastore.datastore.core.DataMigration;
import com.ogury.core.internal.datastore.datastore.core.DataStore;
import com.ogury.core.internal.datastore.datastore.core.DataStoreFactory;
import com.ogury.core.internal.datastore.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JN\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¨\u0006\u0010"}, d2 = {"Lcom/ogury/core/internal/datastore/preferences/core/PreferenceDataStoreFactory;", "", "()V", "create", "Lcom/ogury/core/internal/datastore/datastore/core/DataStore;", "Lcom/ogury/core/internal/datastore/preferences/core/Preferences;", "corruptionHandler", "Lcom/ogury/core/internal/datastore/datastore/core/handlers/ReplaceFileCorruptionHandler;", "migrations", "", "Lcom/ogury/core/internal/datastore/datastore/core/DataMigration;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "produceFile", "Lkotlin/Function0;", "Ljava/io/File;", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PreferenceDataStoreFactory {

    @NotNull
    public static final PreferenceDataStoreFactory INSTANCE = new PreferenceDataStoreFactory();

    private PreferenceDataStoreFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, CoroutineScope coroutineScope, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        }
        return preferenceDataStoreFactory.create(replaceFileCorruptionHandler, list, coroutineScope, function0);
    }

    @NotNull
    public final DataStore<Preferences> create(@Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @NotNull List<? extends DataMigration<Preferences>> migrations, @NotNull Function0 produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, migrations, null, produceFile, 4, null);
    }

    @NotNull
    public final DataStore<Preferences> create(@Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @NotNull Function0 produceFile) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, null, null, produceFile, 6, null);
    }

    @NotNull
    public final DataStore<Preferences> create(@NotNull Function0 produceFile) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, null, null, null, produceFile, 7, null);
    }

    @NotNull
    public final DataStore<Preferences> create(@Nullable ReplaceFileCorruptionHandler<Preferences> corruptionHandler, @NotNull List<? extends DataMigration<Preferences>> migrations, @NotNull CoroutineScope scope, @NotNull final Function0 produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return new PreferenceDataStore(DataStoreFactory.INSTANCE.create(PreferencesSerializer.INSTANCE, corruptionHandler, migrations, scope, new Function0() { // from class: com.ogury.core.internal.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final File mo4828invoke() {
                File file = (File) Function0.this.mo4828invoke();
                if (Intrinsics.areEqual(FilesKt.getExtension(file), PreferencesSerializer.fileExtension)) {
                    return file;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: json").toString());
            }
        }));
    }
}
