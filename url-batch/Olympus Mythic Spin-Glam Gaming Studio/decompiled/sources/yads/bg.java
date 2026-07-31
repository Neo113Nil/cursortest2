package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes5.dex */
public final class bg {
    public final qf a;
    public final yb0 b;

    public bg(Context context) {
        this.a = new qf(context);
        this.b = new yb0(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        yf yfVar;
        int i;
        if (continuationImpl instanceof yf) {
            yfVar = (yf) continuationImpl;
            int i2 = yfVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yfVar.d = i2 - Integer.MIN_VALUE;
                Object obj = yfVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = yfVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    yfVar.d = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(yfVar), 1);
                    cancellableContinuationImpl.initCancellability();
                    zf zfVar = new zf(cancellableContinuationImpl);
                    yb0 yb0Var = this.b;
                    List list = eg.a;
                    AppMetrica.requestStartupParams(yb0Var.a, new xb0(list, new dg(zfVar)), list);
                    obj = cancellableContinuationImpl.getResult();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(yfVar);
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
                return ((Result) obj).getValue();
            }
        }
        yfVar = new yf(this, continuationImpl);
        Object obj2 = yfVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = yfVar.d;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ag agVar;
        int i;
        Object a;
        try {
            if (continuationImpl instanceof ag) {
                agVar = (ag) continuationImpl;
                int i2 = agVar.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    agVar.d = i2 - Integer.MIN_VALUE;
                    Object obj = agVar.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = agVar.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        agVar.d = 1;
                        a = a(agVar);
                        if (a == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        a = ((Result) obj).getValue();
                    }
                    return a;
                }
            }
            if (i != 0) {
            }
            return a;
        } catch (CancellationException e) {
            throw e;
        } catch (wf e2) {
            boolean z = ob1.a;
            Result.Companion companion = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(e2));
        } catch (Throwable unused) {
            boolean z2 = ob1.a;
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(new wf(vf.b)));
        }
        agVar = new ag(this, continuationImpl);
        Object obj2 = agVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = agVar.d;
    }
}
