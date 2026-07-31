package yads;

import com.monetization.ads.mediation.base.model.MediatedAdObjectInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes4.dex */
public final class vm extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ wm c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ String e;
    public final /* synthetic */ MediatedAdObjectInfo f;
    public final /* synthetic */ tn1 g;
    public final /* synthetic */ Lambda h;
    public final /* synthetic */ Lambda i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vm(wm wmVar, Object obj, String str, MediatedAdObjectInfo mediatedAdObjectInfo, tn1 tn1Var, Function1 function1, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.c = wmVar;
        this.d = obj;
        this.e = str;
        this.f = mediatedAdObjectInfo;
        this.g = tn1Var;
        this.h = (Lambda) function1;
        this.i = (Lambda) function0;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new vm(this.c, this.d, this.e, this.f, this.g, this.h, this.i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vm) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            wm wmVar = this.c;
            r7 r7Var = wmVar.f;
            Object obj2 = this.d;
            t8 t8Var = wmVar.w;
            String str = this.e;
            MediatedAdObjectInfo mediatedAdObjectInfo = this.f;
            tn1 tn1Var = this.g;
            this.b = 1;
            obj = r7Var.a(obj2, t8Var, str, mediatedAdObjectInfo, tn1Var, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        t7 t7Var = (t7) obj;
        if (t7Var instanceof s7) {
            MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
            tm tmVar = new tm(this.h, (s7) t7Var, null);
            this.b = 2;
            if (BuildersKt.withContext(immediate, tmVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (Intrinsics.areEqual(t7Var, u7.a)) {
            MainCoroutineDispatcher immediate2 = Dispatchers.getMain().getImmediate();
            um umVar = new um(this.i, null);
            this.b = 3;
            if (BuildersKt.withContext(immediate2, umVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
