package com.inmobi.media;

import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes14.dex */
public final class Yl extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ Ref$BooleanRef c;
    public final /* synthetic */ C3979em d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yl(C3979em c3979em, Continuation continuation, Ref$BooleanRef ref$BooleanRef, XmlPullParser xmlPullParser) {
        super(1, continuation);
        this.b = xmlPullParser;
        this.c = ref$BooleanRef;
        this.d = c3979em;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        XmlPullParser xmlPullParser = this.b;
        return new Yl(this.d, continuation, this.c, xmlPullParser);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Yl) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(this.b.getName(), VastTagName.VAST)) {
                this.c.element = true;
                C3979em c3979em = this.d;
                XmlPullParser xmlPullParser = this.b;
                this.a = 1;
                if (C3979em.b(c3979em, xmlPullParser, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
