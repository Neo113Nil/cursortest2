package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes12.dex */
public final class J3 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J3(long j, Function1 function1, long j2, Continuation continuation) {
        super(2, continuation);
        this.c = j;
        this.d = function1;
        this.e = j2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        J3 j3 = new J3(this.c, this.d, this.e, continuation);
        j3.b = obj;
        return j3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r7) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r8.invoke(r7) == r0) goto L23;
     */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005c -> B:12:0x003f). Please report as a decompilation issue!!! */
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
            CoroutineScope coroutineScope2 = (CoroutineScope) this.b;
            long j = this.c;
            this.b = coroutineScope2;
            this.a = 1;
            if (DelayKt.delay(j, this) != coroutine_suspended) {
                coroutineScope = coroutineScope2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                coroutineScope = (CoroutineScope) this.b;
                ResultKt.throwOnFailure(obj);
                long j2 = this.e;
                this.b = coroutineScope;
                this.a = 3;
            } else if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        coroutineScope = (CoroutineScope) this.b;
        ResultKt.throwOnFailure(obj);
        if (!CoroutineScopeKt.isActive(coroutineScope)) {
            return Unit.INSTANCE;
        }
        ?? r8 = this.d;
        this.b = coroutineScope;
        this.a = 2;
    }
}
