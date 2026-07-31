package com.ogury.core.internal.datastore.datastore;

import android.content.Context;
import androidx.annotation.GuardedBy;
import com.ironsource.V5;
import com.ogury.core.internal.datastore.datastore.core.DataStore;
import com.ogury.core.internal.datastore.datastore.core.DataStoreFactory;
import com.ogury.core.internal.datastore.datastore.core.Serializer;
import com.ogury.core.internal.datastore.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0002BU\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0016\u001a\u00020\u00032\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0096\u0002R\u001a\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ogury/core/internal/datastore/datastore/DataStoreSingletonDelegate;", "T", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Lcom/ogury/core/internal/datastore/datastore/core/DataStore;", V5.c.b, "", "serializer", "Lcom/ogury/core/internal/datastore/datastore/core/Serializer;", "corruptionHandler", "Lcom/ogury/core/internal/datastore/datastore/core/handlers/ReplaceFileCorruptionHandler;", "produceMigrations", "Lkotlin/Function1;", "", "Lcom/ogury/core/internal/datastore/datastore/core/DataMigration;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Ljava/lang/String;Lcom/ogury/core/internal/datastore/datastore/core/Serializer;Lcom/ogury/core/internal/datastore/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)V", "INSTANCE", "lock", "", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DataStoreSingletonDelegate<T> implements ReadOnlyProperty {

    @GuardedBy
    @Nullable
    private volatile DataStore<T> INSTANCE;

    @Nullable
    private final ReplaceFileCorruptionHandler<T> corruptionHandler;

    @NotNull
    private final String fileName;

    @NotNull
    private final Object lock;

    @NotNull
    private final Function1 produceMigrations;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final Serializer<T> serializer;

    public DataStoreSingletonDelegate(@NotNull String fileName, @NotNull Serializer<T> serializer, @Nullable ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @NotNull Function1 produceMigrations, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.fileName = fileName;
        this.serializer = serializer;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((Context) obj, (KProperty<?>) kProperty);
    }

    @NotNull
    public DataStore<T> getValue(@NotNull Context thisRef, @NotNull KProperty<?> property) {
        DataStore<T> dataStore;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        DataStore<T> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    final Context applicationContext = thisRef.getApplicationContext();
                    DataStoreFactory dataStoreFactory = DataStoreFactory.INSTANCE;
                    Serializer<T> serializer = this.serializer;
                    ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler = this.corruptionHandler;
                    Function1 function1 = this.produceMigrations;
                    Intrinsics.checkNotNull(applicationContext);
                    this.INSTANCE = dataStoreFactory.create(serializer, replaceFileCorruptionHandler, (List) function1.invoke(applicationContext), this.scope, new Function0() { // from class: com.ogury.core.internal.datastore.datastore.DataStoreSingletonDelegate$getValue$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final File mo4828invoke() {
                            String str;
                            Context applicationContext2 = applicationContext;
                            Intrinsics.checkNotNullExpressionValue(applicationContext2, "$applicationContext");
                            str = ((DataStoreSingletonDelegate) this).fileName;
                            return DataStoreFile.dataStoreFile(applicationContext2, str);
                        }
                    });
                }
                dataStore = this.INSTANCE;
                Intrinsics.checkNotNull(dataStore);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dataStore;
    }
}
