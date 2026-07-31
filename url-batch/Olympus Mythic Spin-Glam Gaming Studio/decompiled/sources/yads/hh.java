package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class hh extends SuspendLambda implements Function2 {
    public final /* synthetic */ ih b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh(ih ihVar, Continuation continuation) {
        super(2, continuation);
        this.b = ihVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new hh(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new hh(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            long b = ((qg1) this.b.e.a).b("ExitInfoAnrLastReportedTimestamp");
            ih ihVar = this.b;
            fh fhVar = ihVar.c;
            oe oeVar = ihVar.a;
            List a = fhVar.a(oeVar.b, oeVar.c, b);
            if (a.isEmpty()) {
                return Unit.INSTANCE;
            }
            ee eeVar = this.b.g;
            ArrayList a2 = ee.a(a);
            if (a2.isEmpty()) {
                return Unit.INSTANCE;
            }
            ArrayList a3 = this.b.g.a(a2);
            if (a3.isEmpty()) {
                return Unit.INSTANCE;
            }
            this.b.d.a(a3);
            ih.a(this.b, a3);
            this.b.h.set(false);
            return Unit.INSTANCE;
        } finally {
            this.b.h.set(false);
        }
    }
}
