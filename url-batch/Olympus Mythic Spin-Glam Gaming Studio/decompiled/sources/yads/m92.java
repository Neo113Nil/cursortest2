package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final class m92 extends SuspendLambda implements Function2 {
    public final /* synthetic */ n92 b;
    public final /* synthetic */ CountDownLatch c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ xo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m92(n92 n92Var, CountDownLatch countDownLatch, ArrayList arrayList, xo xoVar, Continuation continuation) {
        super(2, continuation);
        this.b = n92Var;
        this.c = countDownLatch;
        this.d = arrayList;
        this.e = xoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m92(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m92) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        JSONArray jSONArray;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        n92 n92Var = this.b;
        CountDownLatch countDownLatch = this.c;
        ArrayList arrayList = this.d;
        xo xoVar = this.e;
        n92Var.getClass();
        try {
            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                boolean z = ob1.a;
            }
            xoVar.a.set(true);
            synchronized (n92Var.b) {
                jSONArray = new JSONArray((Collection) arrayList);
            }
            return jSONArray;
        } catch (InterruptedException unused) {
            boolean z2 = ob1.a;
            return null;
        }
    }
}
