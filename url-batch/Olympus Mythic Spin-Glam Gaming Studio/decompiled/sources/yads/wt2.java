package yads;

import android.content.Context;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.selects.SelectImplementation;

/* loaded from: classes15.dex */
public final class wt2 extends SuspendLambda implements Function2 {
    public h5 b;
    public xt2 c;
    public wo d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xt2 g;
    public final /* synthetic */ wo h;
    public final /* synthetic */ vq3 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt2(xt2 xt2Var, wo woVar, vq3 vq3Var, Continuation continuation) {
        super(2, continuation);
        this.g = xt2Var;
        this.h = woVar;
        this.i = vq3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        wt2 wt2Var = new wt2(this.g, this.h, this.i, continuation);
        wt2Var.f = obj;
        return wt2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wt2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y43 y43Var;
        y43 y43Var2;
        y43 y43Var3;
        i5 i5Var;
        h5 h5Var;
        Job launch$default;
        Deferred async$default;
        Object doSelect;
        wo woVar;
        xt2 xt2Var;
        ot2 ot2Var;
        Context context;
        ic icVar;
        pm0 pm0Var;
        bb2 bb2Var;
        bb2 bb2Var2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.e;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                String str = "Cannot load bidder token. Token generation failed " + th.getMessage();
                boolean z = ob1.a;
                MainCoroutineDispatcher b = w10.b();
                rt2 rt2Var = new rt2(this.i, str, null);
                this.f = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = 4;
                if (BuildersKt.withContext(b, rt2Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f;
                y43Var3 = this.g.g;
                y43Var3.b(cd1.b, this.g);
                i5Var = this.g.c;
                h5Var = h5.C;
                xt2 xt2Var2 = this.g;
                wo woVar2 = this.h;
                i5Var.b(h5Var);
                SelectImplementation selectImplementation = new SelectImplementation(getContext());
                launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new st2(null), 3, null);
                selectImplementation.invoke(launch$default.getOnJoin(), new tt2(null));
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ut2(xt2Var2, null), 3, null);
                selectImplementation.invoke(async$default.getOnAwait(), new vt2(null));
                this.f = i5Var;
                this.b = h5Var;
                this.c = xt2Var2;
                this.d = woVar2;
                this.e = 1;
                doSelect = selectImplementation.doSelect(this);
                if (doSelect == coroutine_suspended) {
                    return coroutine_suspended;
                }
                woVar = woVar2;
                xt2Var = xt2Var2;
            } else {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    y43Var2 = this.g.g;
                    y43Var2.a(cd1.b, this.g);
                    return Unit.INSTANCE;
                }
                wo woVar3 = this.d;
                xt2Var = this.c;
                h5 h5Var2 = this.b;
                i5 i5Var2 = (i5) this.f;
                ResultKt.throwOnFailure(obj);
                woVar = woVar3;
                h5Var = h5Var2;
                i5Var = i5Var2;
                doSelect = obj;
            }
            yt2 yt2Var = (yt2) doSelect;
            ot2Var = xt2Var.h;
            context = xt2Var.b;
            icVar = xt2Var.e;
            pm0Var = xt2Var.d;
            o73 o73Var = new o73(ot2Var.a(context, icVar, pm0Var.a(), woVar, yt2Var), yt2Var);
            i5Var.a(h5Var);
            if (o73Var.a() != null) {
                bb2Var2 = this.g.i;
                bb2Var2.a(this.h, o73Var.b());
                MainCoroutineDispatcher b2 = w10.b();
                pt2 pt2Var = new pt2(this.i, o73Var, null);
                this.f = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = 2;
                if (BuildersKt.withContext(b2, pt2Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                bb2Var = this.g.i;
                bb2Var.a(this.h);
                MainCoroutineDispatcher b3 = w10.b();
                qt2 qt2Var = new qt2(this.i, null);
                this.f = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = 3;
                if (BuildersKt.withContext(b3, qt2Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            y43Var2 = this.g.g;
            y43Var2.a(cd1.b, this.g);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            y43Var = this.g.g;
            y43Var.a(cd1.b, this.g);
            throw th2;
        }
    }
}
