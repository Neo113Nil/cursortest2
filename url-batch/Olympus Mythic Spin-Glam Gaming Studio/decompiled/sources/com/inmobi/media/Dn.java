package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes10.dex */
public final class Dn extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ En c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dn(En en, Continuation continuation) {
        super(2, continuation);
        this.c = en;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Dn dn = new Dn(this.c, continuation);
        dn.b = obj;
        return dn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Dn dn = new Dn(this.c, (Continuation) obj2);
        dn.b = (CoroutineScope) obj;
        return dn.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (com.inmobi.media.En.a(r7, r6) == r0) goto L23;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0052 -> B:6:0x0030). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.b;
        } else if (i == 1) {
            coroutineScope = (CoroutineScope) this.b;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (IllegalStateException e) {
                e.toString();
            }
            long j = this.c.c;
            this.b = coroutineScope;
            this.a = 2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.b;
            ResultKt.throwOnFailure(obj);
        }
        if (!CoroutineScopeKt.isActive(coroutineScope)) {
            return Unit.INSTANCE;
        }
        En en = this.c;
        this.b = coroutineScope;
        this.a = 1;
    }
}
