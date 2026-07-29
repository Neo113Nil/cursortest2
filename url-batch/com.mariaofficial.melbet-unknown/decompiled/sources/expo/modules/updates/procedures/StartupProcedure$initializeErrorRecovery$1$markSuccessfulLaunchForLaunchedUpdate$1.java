package expo.modules.updates.procedures;

import expo.modules.updates.db.DatabaseHolder;
import expo.modules.updates.db.UpdatesDatabase;
import expo.modules.updates.db.entity.UpdateEntity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StartupProcedure.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.procedures.StartupProcedure$initializeErrorRecovery$1$markSuccessfulLaunchForLaunchedUpdate$1", f = "StartupProcedure.kt", i = {}, l = {297}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class StartupProcedure$initializeErrorRecovery$1$markSuccessfulLaunchForLaunchedUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ StartupProcedure this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StartupProcedure$initializeErrorRecovery$1$markSuccessfulLaunchForLaunchedUpdate$1(StartupProcedure startupProcedure, Continuation<? super StartupProcedure$initializeErrorRecovery$1$markSuccessfulLaunchForLaunchedUpdate$1> continuation) {
        super(2, continuation);
        this.this$0 = startupProcedure;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StartupProcedure$initializeErrorRecovery$1$markSuccessfulLaunchForLaunchedUpdate$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StartupProcedure$initializeErrorRecovery$1$markSuccessfulLaunchForLaunchedUpdate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DatabaseHolder databaseHolder;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UpdateEntity launchedUpdate = this.this$0.getLaunchedUpdate();
            if (launchedUpdate == null) {
                return Unit.INSTANCE;
            }
            databaseHolder = this.this$0.databaseHolder;
            this.label = 1;
            if (databaseHolder.withDatabase(new AnonymousClass1(launchedUpdate, null), this) == coroutine_suspended) {
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

    /* compiled from: StartupProcedure.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lexpo/modules/updates/db/UpdatesDatabase;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.updates.procedures.StartupProcedure$initializeErrorRecovery$1$markSuccessfulLaunchForLaunchedUpdate$1$1", f = "StartupProcedure.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: expo.modules.updates.procedures.StartupProcedure$initializeErrorRecovery$1$markSuccessfulLaunchForLaunchedUpdate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<UpdatesDatabase, Continuation<? super Unit>, Object> {
        final /* synthetic */ UpdateEntity $launchedUpdate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UpdateEntity updateEntity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$launchedUpdate = updateEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$launchedUpdate, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UpdatesDatabase updatesDatabase, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(updatesDatabase, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((UpdatesDatabase) this.L$0).updateDao().incrementSuccessfulLaunchCount(this.$launchedUpdate);
            return Unit.INSTANCE;
        }
    }
}
