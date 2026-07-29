package expo.modules.updates;

import expo.modules.updates.db.Reaper;
import expo.modules.updates.db.UpdatesDatabase;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.selectionpolicy.SelectionPolicy;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UpdatesDevLauncherController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.UpdatesDevLauncherController$runReaper$1", f = "UpdatesDevLauncherController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class UpdatesDevLauncherController$runReaper$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UpdatesDevLauncherController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdatesDevLauncherController$runReaper$1(UpdatesDevLauncherController updatesDevLauncherController, Continuation<? super UpdatesDevLauncherController$runReaper$1> continuation) {
        super(2, continuation);
        this.this$0 = updatesDevLauncherController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdatesDevLauncherController$runReaper$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UpdatesDevLauncherController$runReaper$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UpdatesConfiguration updatesConfiguration;
        UpdatesDatabase database;
        SelectionPolicy selectionPolicy;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            updatesConfiguration = this.this$0.updatesConfiguration;
            if (updatesConfiguration != null) {
                UpdatesDevLauncherController updatesDevLauncherController = this.this$0;
                database = updatesDevLauncherController.getDatabase();
                File updatesDirectory = updatesDevLauncherController.getUpdatesDirectory();
                UpdateEntity launchedUpdate = updatesDevLauncherController.getLaunchedUpdate();
                selectionPolicy = updatesDevLauncherController.getSelectionPolicy();
                Reaper.reapUnusedUpdates(updatesConfiguration, database, updatesDirectory, launchedUpdate, selectionPolicy);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
