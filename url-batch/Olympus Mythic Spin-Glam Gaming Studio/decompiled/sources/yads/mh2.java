package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes5.dex */
public final class mh2 extends SuspendLambda implements Function2 {
    public er1 b;
    public MediatedAdapterPrefetcher c;
    public int d;
    public final /* synthetic */ rh2 e;
    public final /* synthetic */ rs1 f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ e00 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ l03 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh2(rh2 rh2Var, rs1 rs1Var, Context context, e00 e00Var, long j, l03 l03Var, Continuation continuation) {
        super(2, continuation);
        this.e = rh2Var;
        this.f = rs1Var;
        this.g = context;
        this.h = e00Var;
        this.i = j;
        this.j = l03Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new mh2(this.e, this.f, this.g, this.h, this.i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mh2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MediatedAdapterPrefetcher mediatedAdapterPrefetcher;
        er1 er1Var;
        MediatedAdapterPrefetcher mediatedAdapterPrefetcher2;
        Object withTimeout;
        er1 er1Var2;
        ch2 a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            hh2 hh2Var = this.e.e;
            rs1 rs1Var = this.f;
            hh2Var.getClass();
            String str = rs1Var.b;
            er1 er1Var3 = new er1(str, rs1Var.c, null, null, null, null, null, null);
            try {
                rh2.a(this.e, er1Var3);
                Object a2 = this.e.c.a(this.g, er1Var3, com.monetization.ads.mediation.base.a.class);
                mediatedAdapterPrefetcher = a2 instanceof MediatedAdapterPrefetcher ? (MediatedAdapterPrefetcher) a2 : null;
                if (mediatedAdapterPrefetcher == null) {
                    ch2 a3 = xq1.a(str);
                    this.e.a.a(this.g, this.h, a3, null);
                    return a3;
                }
                iv ivVar = this.e.b;
                ivVar.a.a();
                ivVar.a.a(ivVar.c, null);
                try {
                    long j = this.i;
                    lh2 lh2Var = new lh2(this.e, this.g, this.j, er1Var3, mediatedAdapterPrefetcher, null);
                    this.b = er1Var3;
                    this.c = mediatedAdapterPrefetcher;
                    this.d = 1;
                    withTimeout = TimeoutKt.withTimeout(j, lh2Var, this);
                    if (withTimeout == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    MediatedAdapterPrefetcher mediatedAdapterPrefetcher3 = mediatedAdapterPrefetcher;
                    er1Var2 = er1Var3;
                    mediatedAdapterPrefetcher2 = mediatedAdapterPrefetcher3;
                } catch (Exception e) {
                    e = e;
                    er1Var = er1Var3;
                    mediatedAdapterPrefetcher2 = mediatedAdapterPrefetcher;
                    iv ivVar2 = this.e.b;
                    ivVar2.a.a(ivVar2.c, ivVar2.b, null);
                    Long a4 = this.e.b.a();
                    a = xq1.a(er1Var.b, e);
                    this.e.a.a(this.g, this.h, a, a4);
                    mediatedAdapterPrefetcher2.onInvalidate();
                    return a;
                } catch (Throwable th) {
                    th = th;
                    mediatedAdapterPrefetcher.onInvalidate();
                    throw th;
                }
            } catch (IllegalArgumentException e2) {
                return xq1.a(er1Var3.b, e2);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mediatedAdapterPrefetcher2 = this.c;
            er1Var = this.b;
            try {
                try {
                    ResultKt.throwOnFailure(obj);
                    er1Var2 = er1Var;
                    withTimeout = obj;
                } catch (Exception e3) {
                    e = e3;
                    iv ivVar22 = this.e.b;
                    ivVar22.a.a(ivVar22.c, ivVar22.b, null);
                    Long a42 = this.e.b.a();
                    a = xq1.a(er1Var.b, e);
                    this.e.a.a(this.g, this.h, a, a42);
                    mediatedAdapterPrefetcher2.onInvalidate();
                    return a;
                }
            } catch (Throwable th2) {
                th = th2;
                mediatedAdapterPrefetcher = mediatedAdapterPrefetcher2;
                mediatedAdapterPrefetcher.onInvalidate();
                throw th;
            }
        }
        try {
            a = (ch2) withTimeout;
            iv ivVar3 = this.e.b;
            ivVar3.a.a(ivVar3.c, ivVar3.b, null);
            Long a5 = this.e.b.a();
            if (a != null) {
                this.e.a.a(this.g, this.h, a, a5);
            }
            mediatedAdapterPrefetcher2.onInvalidate();
        } catch (Exception e4) {
            e = e4;
            er1Var = er1Var2;
            iv ivVar222 = this.e.b;
            ivVar222.a.a(ivVar222.c, ivVar222.b, null);
            Long a422 = this.e.b.a();
            a = xq1.a(er1Var.b, e);
            this.e.a.a(this.g, this.h, a, a422);
            mediatedAdapterPrefetcher2.onInvalidate();
            return a;
        }
        return a;
    }
}
