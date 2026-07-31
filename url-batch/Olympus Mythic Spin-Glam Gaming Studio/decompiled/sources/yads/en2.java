package yads;

import android.content.Context;
import com.ironsource.X3;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes11.dex */
public final class en2 {
    public final Context a;
    public final ap2 b;
    public final qa0 c;

    public en2(Context context, ap2 ap2Var, qa0 qa0Var, x51 x51Var) {
        this.a = context;
        this.b = ap2Var;
        this.c = qa0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        bn2 bn2Var;
        int i;
        if (continuationImpl instanceof bn2) {
            bn2Var = (bn2) continuationImpl;
            int i2 = bn2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bn2Var.d = i2 - Integer.MIN_VALUE;
                Object obj = bn2Var.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bn2Var.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    bn2Var.d = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(bn2Var), 1);
                    cancellableContinuationImpl.initCancellability();
                    w51 w51Var = new w51(new cn2(cancellableContinuationImpl), new dn2(cancellableContinuationImpl));
                    Context context = this.a;
                    qa0 qa0Var = this.c;
                    StringBuilder sb = new StringBuilder();
                    String str = qa0Var.a.e;
                    if (str == null) {
                        str = qa0.b;
                    }
                    sb.append(str);
                    Character lastOrNull = StringsKt.lastOrNull(sb);
                    if (lastOrNull == null || lastOrNull.charValue() != '/') {
                        sb.append('/');
                    }
                    sb.append("v1/debugpanel");
                    if (!qa0Var.a.b.isEmpty()) {
                        sb.append(CollectionsKt.joinToString$default(qa0Var.a.b, X3.j.c, "?", null, 0, null, pa0.b, 28, null));
                    }
                    String sb2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                    sa1 sa1Var = new sa1(context, sb2, this.b, this.c.a.c, w51Var);
                    zo2 a = yo2.a();
                    Context context2 = this.a;
                    synchronized (a) {
                        g92.a(context2).a(sa1Var);
                    }
                    obj = cancellableContinuationImpl.getResult();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(bn2Var);
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
        bn2Var = new bn2(this, continuationImpl);
        Object obj2 = bn2Var.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bn2Var.d;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
