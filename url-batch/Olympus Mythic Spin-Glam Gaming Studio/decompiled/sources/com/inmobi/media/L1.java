package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes12.dex */
public final class L1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ M1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L1(M1 m1, Continuation continuation) {
        super(2, continuation);
        this.a = m1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new L1(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new L1(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        M1 m1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = 0;
        z = 0;
        try {
            try {
                M1 m12 = this.a;
                m12.c = m12.a.mo4828invoke();
                m1 = this.a;
            } catch (Exception e) {
                e.getMessage();
                m1 = this.a;
            }
            m1.d.set(false);
            z = Unit.INSTANCE;
            return z;
        } catch (Throwable th) {
            this.a.d.set(z);
            throw th;
        }
    }
}
