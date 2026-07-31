package com.inmobi.media;

import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* loaded from: classes12.dex */
public final class Hf extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Xe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hf(Xe xe, Continuation continuation) {
        super(2, continuation);
        this.b = xe;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Hf(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Hf(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            F9 f9 = (F9) Ve.c.getValue();
            Xe xe = this.b;
            this.a = 1;
            obj = f9.a.a(xe, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        InterfaceC3892bf interfaceC3892bf = (InterfaceC3892bf) obj;
        if (!Fl.a(interfaceC3892bf)) {
            throw new IOException();
        }
        IntRange intRange = AbstractC4026gf.a;
        Intrinsics.checkNotNullParameter(interfaceC3892bf, "<this>");
        return interfaceC3892bf.d().string(Charsets.UTF_8);
    }
}
