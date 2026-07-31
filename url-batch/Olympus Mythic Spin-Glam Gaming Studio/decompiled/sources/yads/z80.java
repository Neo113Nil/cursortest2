package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class z80 extends SuspendLambda implements Function2 {
    public g80 b;
    public h80 c;
    public int d;
    public final /* synthetic */ a90 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z80(a90 a90Var, Continuation continuation) {
        super(2, continuation);
        this.e = a90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new z80(this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new z80(this.e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g80 a;
        h80 h80Var;
        Object obj2;
        List emptyList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a = this.e.a.a();
            h80 h80Var2 = a.f;
            if (h80Var2 == null) {
                return s51.a;
            }
            en2 en2Var = this.e.b;
            this.b = a;
            this.c = h80Var2;
            this.d = 1;
            Object a2 = en2Var.a(this);
            if (a2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            h80Var = h80Var2;
            obj2 = a2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h80Var = this.c;
            a = this.b;
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).getValue();
        }
        if (Result.m8028isFailureimpl(obj2)) {
            obj2 = null;
        }
        s80 s80Var = (s80) obj2;
        if (s80Var == null || (emptyList = s80Var.g) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList = a.c;
        ArrayList a3 = this.e.c.a(emptyList);
        return this.e.e.a(this.e.d.a(new y80(a.a, a.b, a3.isEmpty() ? arrayList : a3, a.d, h80Var.a, h80Var.b)));
    }
}
