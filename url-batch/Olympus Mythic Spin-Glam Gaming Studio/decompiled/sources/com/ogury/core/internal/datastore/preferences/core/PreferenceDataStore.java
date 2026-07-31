package com.ogury.core.internal.datastore.preferences.core;

import com.ogury.core.internal.datastore.datastore.core.DataStore;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\n\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/ogury/core/internal/datastore/preferences/core/PreferenceDataStore;", "Lcom/ogury/core/internal/datastore/datastore/core/DataStore;", "Lcom/ogury/core/internal/datastore/preferences/core/Preferences;", "delegate", "<init>", "(Lcom/ogury/core/internal/datastore/datastore/core/DataStore;)V", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "transform", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ogury/core/internal/datastore/datastore/core/DataStore;", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "data", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferenceDataStore implements DataStore<Preferences> {

    @NotNull
    private final DataStore<Preferences> delegate;

    public PreferenceDataStore(@NotNull DataStore<Preferences> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.ogury.core.internal.datastore.datastore.core.DataStore
    @NotNull
    public Flow getData() {
        return this.delegate.getData();
    }

    @Override // com.ogury.core.internal.datastore.datastore.core.DataStore
    @Nullable
    public Object updateData(@NotNull Function2 function2, @NotNull Continuation continuation) {
        return this.delegate.updateData(new PreferenceDataStore$updateData$2(function2, null), continuation);
    }
}
