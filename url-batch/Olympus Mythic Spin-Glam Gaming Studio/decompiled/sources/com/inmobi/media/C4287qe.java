package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.qe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4287qe extends SuspendLambda implements Function2 {
    public final /* synthetic */ He a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4287qe(He he, Continuation continuation) {
        super(2, continuation);
        this.a = he;
    }

    public static final Unit a(He he, short s) {
        InterfaceC4466x9 l = he.l();
        if (l != null) {
            ((C4493y9) l).a("NativeRenderedState", "onAssetClickEvent " + ((int) s));
        }
        ((C3996fd) he.b.m.getValue()).a(s);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4287qe(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4287qe(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C4158lh c4158lh = (C4158lh) this.a.b.o.getValue();
        final He he = this.a;
        C4106jh c4106jh = he.b.c;
        Function1 function1 = new Function1() { // from class: com.inmobi.media.qe$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C4287qe.a(He.this, ((Short) obj2).shortValue());
            }
        };
        c4158lh.getClass();
        C4158lh.a(c4106jh, function1);
        return Unit.INSTANCE;
    }
}
