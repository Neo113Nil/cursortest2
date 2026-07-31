package yads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class jh extends SuspendLambda implements Function2 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ mt1 c;
    public final /* synthetic */ CoroutineScope d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh(Context context, mt1 mt1Var, CoroutineScope coroutineScope, Continuation continuation) {
        super(2, continuation);
        this.b = context;
        this.c = mt1Var;
        this.d = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new jh(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jh) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vw2 vw2Var;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            if (kh.b != null) {
                return Unit.INSTANCE;
            }
            vw2 vw2Var2 = vw2.l;
            if (vw2Var2 == null) {
                synchronized (vw2.k) {
                    vw2Var = vw2.l;
                    if (vw2Var == null) {
                        vw2Var = new vw2();
                        vw2.l = vw2Var;
                    }
                }
                vw2Var2 = vw2Var;
            }
            bu2 a = vw2Var2.a(this.b);
            if (a != null && a.l0) {
                Set set = a.r0;
                if (set == null) {
                    set = SetsKt.emptySet();
                }
                Integer num = a.m0;
                int intValue = num != null ? num.intValue() : 10;
                Integer num2 = a.n0;
                int intValue2 = num2 != null ? num2.intValue() : 91;
                Boolean bool = a.o0;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                oe oeVar = new oe(set, intValue, intValue2, booleanValue);
                fh fhVar = new fh(this.b);
                gh ghVar = new gh(this.c, booleanValue);
                ce ceVar = new ce(sg1.a(this.b, "YadPreferenceFile"));
                AtomicBoolean atomicBoolean = kh.a;
                kh.b = new ih(oeVar, this.d, fhVar, ghVar, ceVar, this.c);
                ih ihVar = kh.b;
                if (ihVar != null && !ihVar.h.getAndSet(true)) {
                    BuildersKt__Builders_commonKt.launch$default(ihVar.b, ihVar.f, null, new hh(ihVar, null), 2, null);
                }
            }
            kh.a.set(false);
            return Unit.INSTANCE;
        } finally {
            kh.a.set(false);
        }
    }
}
