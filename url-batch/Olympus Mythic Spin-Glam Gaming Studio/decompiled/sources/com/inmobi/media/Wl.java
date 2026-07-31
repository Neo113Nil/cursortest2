package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes13.dex */
public final class Wl extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ Ref$BooleanRef c;
    public final /* synthetic */ C3979em d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wl(C3979em c3979em, Continuation continuation, Ref$BooleanRef ref$BooleanRef, XmlPullParser xmlPullParser) {
        super(1, continuation);
        this.b = xmlPullParser;
        this.c = ref$BooleanRef;
        this.d = c3979em;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        XmlPullParser xmlPullParser = this.b;
        return new Wl(this.d, continuation, this.c, xmlPullParser);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Wl) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String name = this.b.getName();
            if (Intrinsics.areEqual(name, "InLine")) {
                Ref$BooleanRef ref$BooleanRef = this.c;
                if (!ref$BooleanRef.element) {
                    ref$BooleanRef.element = true;
                    this.d.g(this.b);
                }
            } else if (Intrinsics.areEqual(name, "Wrapper")) {
                Ref$BooleanRef ref$BooleanRef2 = this.c;
                if (!ref$BooleanRef2.element) {
                    ref$BooleanRef2.element = true;
                    C3979em c3979em = this.d;
                    XmlPullParser xmlPullParser = this.b;
                    this.a = 1;
                    if (C3979em.c(c3979em, xmlPullParser, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                C3979em c3979em2 = this.d;
                XmlPullParser xmlPullParser2 = this.b;
                c3979em2.getClass();
                C3979em.w(xmlPullParser2);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
