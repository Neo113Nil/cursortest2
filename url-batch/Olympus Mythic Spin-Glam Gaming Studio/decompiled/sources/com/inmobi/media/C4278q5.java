package com.inmobi.media;

import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.q5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4278q5 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4303r5 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4278q5(C4303r5 c4303r5, int i, int i2, int i3, int i4, int i5, Continuation continuation) {
        super(2, continuation);
        this.b = c4303r5;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4278q5 c4278q5 = new C4278q5(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
        c4278q5.a = obj;
        return c4278q5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4278q5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Drawable drawable = ContextCompat.getDrawable(this.b.getContext(), this.c);
        if (drawable != null) {
            this.b.a(drawable, this.d, this.e, this.f, this.g);
            return Unit.INSTANCE;
        }
        C4303r5 c4303r5 = this.b;
        InterfaceC4466x9 interfaceC4466x9 = c4303r5.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("CustomView", "CustomView drawable for " + ((int) c4303r5.a) + " cannot be created");
        }
        return Unit.INSTANCE;
    }
}
