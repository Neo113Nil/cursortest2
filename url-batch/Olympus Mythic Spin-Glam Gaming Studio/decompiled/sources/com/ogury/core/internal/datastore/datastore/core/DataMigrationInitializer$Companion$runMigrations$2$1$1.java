package com.ogury.core.internal.datastore.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ogury.core.internal.datastore.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends SuspendLambda implements Function1 {
    final /* synthetic */ DataMigration<T> $migration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2$1$1(DataMigration<T> dataMigration, Continuation continuation) {
        super(1, continuation);
        this.$migration = dataMigration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@NotNull Continuation continuation) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.$migration, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DataMigration<T> dataMigration = this.$migration;
            this.label = 1;
            if (dataMigration.cleanUp(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation continuation) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
