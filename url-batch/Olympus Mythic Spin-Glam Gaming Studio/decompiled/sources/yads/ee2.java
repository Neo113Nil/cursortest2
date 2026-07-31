package yads;

import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes12.dex */
public final class ee2 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ ge2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee2(ge2 ge2Var, Continuation continuation) {
        super(2, continuation);
        this.c = ge2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ee2(this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ee2(this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ge2 ge2Var = this.c;
            this.b = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            try {
                Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(ge2Var.a.getApplicationContext()).getAppSetIdInfo();
                final ce2 ce2Var = new ce2(cancellableContinuationImpl);
                appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: yads.fe2
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final /* synthetic */ void onSuccess(Object obj2) {
                        ce2.this.invoke(obj2);
                    }
                }).addOnFailureListener(new de2(cancellableContinuationImpl));
            } catch (Throwable unused) {
                cancellableContinuationImpl.resume((Object) null, (Function1) null);
            }
            obj = cancellableContinuationImpl.getResult();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
