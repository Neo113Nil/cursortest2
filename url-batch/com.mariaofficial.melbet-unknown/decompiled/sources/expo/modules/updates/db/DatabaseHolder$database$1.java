package expo.modules.updates.db;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: DatabaseHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lexpo/modules/updates/db/UpdatesDatabase;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.db.DatabaseHolder$database$1", f = "DatabaseHolder.kt", i = {0}, l = {40}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class DatabaseHolder$database$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UpdatesDatabase>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DatabaseHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatabaseHolder$database$1(DatabaseHolder databaseHolder, Continuation<? super DatabaseHolder$database$1> continuation) {
        super(2, continuation);
        this.this$0 = databaseHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DatabaseHolder$database$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UpdatesDatabase> continuation) {
        return ((DatabaseHolder$database$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        DatabaseHolder databaseHolder;
        UpdatesDatabase updatesDatabase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutex = this.this$0.mutex;
            DatabaseHolder databaseHolder2 = this.this$0;
            this.L$0 = mutex;
            this.L$1 = databaseHolder2;
            this.label = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            databaseHolder = databaseHolder2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            databaseHolder = (DatabaseHolder) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            updatesDatabase = databaseHolder.mDatabase;
            return updatesDatabase;
        } finally {
            mutex.unlock(null);
        }
    }
}
