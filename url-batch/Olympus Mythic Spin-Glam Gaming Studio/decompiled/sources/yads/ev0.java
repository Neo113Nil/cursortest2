package yads;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes9.dex */
public final class ev0 extends SuspendLambda implements Function2 {
    public Mutex b;
    public fv0 c;
    public qv0 d;
    public byte[] e;
    public int f;
    public final /* synthetic */ fv0 g;
    public final /* synthetic */ qv0 h;
    public final /* synthetic */ byte[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev0(fv0 fv0Var, qv0 qv0Var, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.g = fv0Var;
        this.h = qv0Var;
        this.i = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ev0(this.g, this.h, this.i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ev0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex c;
        qv0 qv0Var;
        fv0 fv0Var;
        byte[] bArr;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            fv0 fv0Var2 = this.g;
            qv0 qv0Var2 = this.h;
            byte[] bArr2 = fv0.d;
            c = fv0Var2.c(qv0Var2);
            fv0 fv0Var3 = this.g;
            qv0Var = this.h;
            byte[] bArr3 = this.i;
            this.b = c;
            this.c = fv0Var3;
            this.d = qv0Var;
            this.e = bArr3;
            this.f = 1;
            if (c.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            fv0Var = fv0Var3;
            bArr = bArr3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = this.e;
            qv0Var = this.d;
            fv0Var = this.c;
            c = this.b;
            ResultKt.throwOnFailure(obj);
        }
        try {
            byte[] bArr4 = fv0.d;
            File b = fv0Var.b(qv0Var);
            if (!b.exists() || !fv0.a(b)) {
                File a = fv0.a(fv0Var, bArr, qv0Var);
                if (a != null) {
                    if (!fv0.a(a) || !a.renameTo(b)) {
                        try {
                            a.delete();
                        } catch (Exception unused) {
                        }
                    }
                }
                b = null;
            }
            return b;
        } finally {
            c.unlock(null);
        }
    }
}
