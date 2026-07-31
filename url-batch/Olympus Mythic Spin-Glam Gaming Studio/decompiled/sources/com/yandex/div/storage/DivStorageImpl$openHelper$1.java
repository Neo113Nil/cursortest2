package com.yandex.div.storage;

import com.yandex.div.storage.database.DatabaseOpenHelper;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivStorageImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class DivStorageImpl$openHelper$1 implements DatabaseOpenHelper.CreateCallback, FunctionAdapter {
    final /* synthetic */ DivStorageImpl $tmp0;

    DivStorageImpl$openHelper$1(DivStorageImpl divStorageImpl) {
        this.$tmp0 = divStorageImpl;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof DatabaseOpenHelper.CreateCallback) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    @NotNull
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, DivStorageImpl.class, "onCreate", "onCreate(Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper.CreateCallback
    public final void onCreate(@NotNull DatabaseOpenHelper.Database database) {
        this.$tmp0.onCreate(database);
    }
}
