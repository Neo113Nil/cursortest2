package yads;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes15.dex */
public final class wx0 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ xx0 c;
    public final /* synthetic */ d8 d;
    public final /* synthetic */ px0 e;
    public final /* synthetic */ pn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx0(xx0 xx0Var, d8 d8Var, px0 px0Var, pn pnVar, Continuation continuation) {
        super(2, continuation);
        this.c = xx0Var;
        this.d = d8Var;
        this.e = px0Var;
        this.f = pnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new wx0(this.c, this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wx0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        try {
        } catch (Exception unused) {
            String str = this.e.b;
            String str2 = this.d.a;
            boolean z = ob1.a;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ki2 ki2Var = this.c.d;
            d8 d8Var = this.d;
            ki2Var.getClass();
            if (d8Var.h != null) {
                return Unit.INSTANCE;
            }
            td0 td0Var = this.c.c;
            px0 px0Var = this.e;
            this.b = 1;
            td0Var.getClass();
            int ordinal = px0Var.ordinal();
            if (ordinal == 0) {
                obj = jc1.a().a.a(this);
            } else if (ordinal == 1) {
                obj = fs2.a().a.a(this);
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (pg.d == null) {
                    synchronized (pg.c) {
                        try {
                            if (pg.d == null) {
                                pg.d = new pg();
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                pg pgVar = pg.d;
                if (pgVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                obj = pgVar.a.a(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return Unit.INSTANCE;
        }
        v0 v0Var = this.c.e;
        v0Var.a.putIfAbsent(v0Var.b.a(this.d), CompletableDeferredKt.CompletableDeferred$default(null, 1, null));
        d8 a = d8.a(this.d, null, "smart", 6143);
        pn pnVar = this.f;
        this.b = 2;
        if (pnVar.a(a, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
