package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes5.dex */
public abstract class in {
    public final Context a;
    public final qh1 b;
    public final lh1 c;
    public final ki2 d;
    public final vd0 e;
    public final CoroutineScope f;
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();

    public in(Context context, qh1 qh1Var, lh1 lh1Var, ki2 ki2Var, vd0 vd0Var, CoroutineScope coroutineScope) {
        this.a = context;
        this.b = qh1Var;
        this.c = lh1Var;
        this.d = ki2Var;
        this.e = vd0Var;
        this.f = coroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(in inVar, d8 d8Var, Object obj, ContinuationImpl continuationImpl) {
        hn hnVar;
        Object obj2;
        int i;
        inVar.getClass();
        if (continuationImpl instanceof hn) {
            hnVar = (hn) continuationImpl;
            int i2 = hnVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hnVar.e = i2 - Integer.MIN_VALUE;
                obj2 = hnVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hnVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    vd0 vd0Var = inVar.e;
                    hnVar.b = obj;
                    hnVar.e = 1;
                    obj2 = vd0Var.a(d8Var, 30000L, hnVar);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = hnVar.b;
                    ResultKt.throwOnFailure(obj2);
                }
                if (obj2 != null) {
                    return Boxing.boxBoolean(false);
                }
                inVar.a(obj2, obj);
                return Boxing.boxBoolean(true);
            }
        }
        hnVar = new hn(inVar, continuationImpl);
        obj2 = hnVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hnVar.e;
        if (i != 0) {
        }
        if (obj2 != null) {
        }
    }

    public abstract Object a(d8 d8Var);

    public abstract Object a(gn gnVar);

    public abstract void a(Object obj, Object obj2);

    public abstract void a(d8 d8Var, Object obj, String str);

    public abstract Object b(Object obj);

    public abstract void c(Object obj);

    public /* bridge */ /* synthetic */ void a(d8 d8Var, js3 js3Var) {
        a(d8Var, (Object) js3Var);
    }

    public /* bridge */ /* synthetic */ void a(d8 d8Var, mt3 mt3Var) {
        a(d8Var, (Object) mt3Var);
    }

    public final void a(Object obj) {
        c(obj);
        this.g.remove(obj);
    }

    public final void a(d8 d8Var, Object obj) {
        this.b.a();
        BuildersKt__Builders_commonKt.launch$default(this.f, Dispatchers.getMain().getImmediate(), null, new en(this, d8Var, obj, null), 2, null);
    }
}
