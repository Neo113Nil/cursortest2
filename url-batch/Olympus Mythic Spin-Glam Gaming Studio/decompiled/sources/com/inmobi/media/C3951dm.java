package com.inmobi.media;

import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.inmobi.media.dm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3951dm extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ C3979em c;
    public final /* synthetic */ Ref$BooleanRef d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3951dm(C3979em c3979em, Continuation continuation, Ref$BooleanRef ref$BooleanRef, XmlPullParser xmlPullParser) {
        super(1, continuation);
        this.b = xmlPullParser;
        this.c = c3979em;
        this.d = ref$BooleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C3951dm(this.c, continuation, this.d, this.b);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3951dm) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b4, code lost:
    
        if (r1.a((java.lang.String) r5, r4) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (r5 == r0) goto L41;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String name = this.b.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -2077435339:
                        if (name.equals("AdVerifications")) {
                            this.c.c(this.b);
                            return Unit.INSTANCE;
                        }
                        break;
                    case -1692490108:
                        if (name.equals("Creatives")) {
                            this.c.t(this.b);
                            return Unit.INSTANCE;
                        }
                        break;
                    case -587420703:
                        if (name.equals("VASTAdTagURI")) {
                            this.d.element = true;
                            C3979em c3979em = this.c;
                            XmlPullParser xmlPullParser = this.b;
                            this.a = 1;
                            if (c3979em.n(xmlPullParser) != 4) {
                                throw new Sl((short) 1109);
                            }
                            String b = Nl.b(xmlPullParser.getText());
                            if (b.length() == 0) {
                                throw new Sl((short) 1108);
                            }
                            obj = Rl.a.a(b, this);
                            break;
                        }
                        break;
                    case 67232232:
                        if (name.equals("Error")) {
                            Je a = this.c.a("error", this.b);
                            if (a != null) {
                                this.c.i.add(a);
                            }
                            return Unit.INSTANCE;
                        }
                        break;
                    case 184043572:
                        if (name.equals(VastTagName.EXTENSIONS)) {
                            this.c.e(this.b);
                            return Unit.INSTANCE;
                        }
                        break;
                    case 2114088489:
                        if (name.equals("Impression")) {
                            this.c.f(this.b);
                            return Unit.INSTANCE;
                        }
                        break;
                }
            }
            C3979em c3979em2 = this.c;
            XmlPullParser xmlPullParser2 = this.b;
            c3979em2.getClass();
            C3979em.w(xmlPullParser2);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C3979em c3979em3 = this.c;
        this.a = 2;
    }
}
