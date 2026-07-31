package yads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes3.dex */
public final class le extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ ne c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(ne neVar, Continuation continuation) {
        super(2, continuation);
        this.c = neVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new le(this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new le(this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0047 -> B:13:0x001e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    long j = this.c.a;
                    this.b = 2;
                    if (DelayKt.delay(j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ne neVar = this.c;
                    be beVar = neVar.e;
                    long j2 = neVar.b;
                    this.b = 1;
                    obj = BuildersKt.withContext(beVar.a, new ae(beVar, j2, null), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        ne.a(this.c);
                        return Unit.INSTANCE;
                    }
                }
            } else if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        ResultKt.throwOnFailure(obj);
        ne neVar2 = this.c;
        be beVar2 = neVar2.e;
        long j22 = neVar2.b;
        this.b = 1;
        obj = BuildersKt.withContext(beVar2.a, new ae(beVar2, j22, null), this);
        if (obj == coroutine_suspended) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
