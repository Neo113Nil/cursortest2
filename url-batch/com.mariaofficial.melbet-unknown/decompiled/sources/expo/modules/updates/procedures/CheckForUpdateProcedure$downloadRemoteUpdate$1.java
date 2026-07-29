package expo.modules.updates.procedures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CheckForUpdateProcedure.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.procedures.CheckForUpdateProcedure", f = "CheckForUpdateProcedure.kt", i = {}, l = {55}, m = "downloadRemoteUpdate", n = {}, s = {})
/* loaded from: classes2.dex */
final class CheckForUpdateProcedure$downloadRemoteUpdate$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckForUpdateProcedure this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckForUpdateProcedure$downloadRemoteUpdate$1(CheckForUpdateProcedure checkForUpdateProcedure, Continuation<? super CheckForUpdateProcedure$downloadRemoteUpdate$1> continuation) {
        super(continuation);
        this.this$0 = checkForUpdateProcedure;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object downloadRemoteUpdate;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        downloadRemoteUpdate = this.this$0.downloadRemoteUpdate(null, this);
        return downloadRemoteUpdate;
    }
}
