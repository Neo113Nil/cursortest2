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

/* renamed from: com.inmobi.media.am, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3873am extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ C3979em c;
    public final /* synthetic */ Ref$BooleanRef d;
    public final /* synthetic */ Ref$BooleanRef e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3873am(XmlPullParser xmlPullParser, C3979em c3979em, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, Continuation continuation) {
        super(1, continuation);
        this.b = xmlPullParser;
        this.c = c3979em;
        this.d = ref$BooleanRef;
        this.e = ref$BooleanRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C3873am(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3873am) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String name = this.b.getName();
            if (Intrinsics.areEqual(name, "Error")) {
                Je a = this.c.a("error", this.b);
                if (a != null) {
                    this.c.h.add(a);
                }
            } else if (Intrinsics.areEqual(name, "Ad")) {
                C3979em c3979em = this.c;
                XmlPullParser xmlPullParser = this.b;
                c3979em.getClass();
                try {
                    z = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "conditionalAd"));
                } catch (Exception unused) {
                    z = false;
                }
                if (z) {
                    this.d.element = true;
                    C3979em c3979em2 = this.c;
                    XmlPullParser xmlPullParser2 = this.b;
                    c3979em2.getClass();
                    C3979em.w(xmlPullParser2);
                    return Unit.INSTANCE;
                }
                Ref$BooleanRef ref$BooleanRef = this.e;
                if (ref$BooleanRef.element) {
                    C3979em c3979em3 = this.c;
                    XmlPullParser xmlPullParser3 = this.b;
                    c3979em3.getClass();
                    C3979em.w(xmlPullParser3);
                    return Unit.INSTANCE;
                }
                ref$BooleanRef.element = true;
                C3979em c3979em4 = this.c;
                XmlPullParser xmlPullParser4 = this.b;
                this.a = 1;
                if (C3979em.a(c3979em4, xmlPullParser4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                C3979em c3979em5 = this.c;
                XmlPullParser xmlPullParser5 = this.b;
                c3979em5.getClass();
                C3979em.w(xmlPullParser5);
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
