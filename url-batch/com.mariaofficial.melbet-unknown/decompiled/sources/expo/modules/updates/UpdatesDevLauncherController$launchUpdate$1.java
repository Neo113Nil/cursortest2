package expo.modules.updates;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UpdatesDevLauncherController.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.UpdatesDevLauncherController", f = "UpdatesDevLauncherController.kt", i = {0, 0}, l = {289}, m = "launchUpdate", n = {"callback", "launcher"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
final class UpdatesDevLauncherController$launchUpdate$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdatesDevLauncherController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdatesDevLauncherController$launchUpdate$1(UpdatesDevLauncherController updatesDevLauncherController, Continuation<? super UpdatesDevLauncherController$launchUpdate$1> continuation) {
        super(continuation);
        this.this$0 = updatesDevLauncherController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object launchUpdate;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        launchUpdate = this.this$0.launchUpdate(null, null, null, null, this);
        return launchUpdate;
    }
}
