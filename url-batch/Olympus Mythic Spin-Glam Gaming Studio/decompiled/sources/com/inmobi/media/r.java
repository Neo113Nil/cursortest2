package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes13.dex */
public final class r extends SuspendLambda implements Function2 {
    public C3897bk a;
    public int b;
    public final /* synthetic */ C4430w c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C4430w c4430w, String str, int i, int i2, int i3, Continuation continuation) {
        super(2, continuation);
        this.c = c4430w;
        this.d = str;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new r(this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C3897bk c3897bk;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C3897bk c3897bk2 = new C3897bk(this.c.a);
            c3897bk2.setLayoutParams(new ViewGroup.LayoutParams(this.f, this.g));
            C4430w c4430w = this.c;
            String str = this.d;
            int i2 = this.e;
            this.a = c3897bk2;
            this.b = 1;
            Object a = C4430w.a(c4430w, c3897bk2, str, i2, this);
            if (a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c3897bk = c3897bk2;
            obj = a;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3897bk = this.a;
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return c3897bk;
        }
        throw new C4285qc();
    }
}
