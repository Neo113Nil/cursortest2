package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* renamed from: com.inmobi.media.ia, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4073ia extends SuspendLambda implements Function1 {
    public final /* synthetic */ C4099ja a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4073ia(C4099ja c4099ja, long j, String str, int i, String str2, Continuation continuation) {
        super(1, continuation);
        this.a = c4099ja;
        this.b = j;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C4073ia(this.a, this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4073ia) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [T, com.inmobi.media.Q2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.inmobi.media.Q2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = B9.a;
        ArrayList arrayList2 = new ArrayList();
        C4021ga c4021ga = new C4021ga();
        ArrayList arrayList3 = new ArrayList();
        BuildersKt__BuildersKt.runBlocking$default(null, new C3993fa(c4021ga, arrayList3, null), 1, null);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C4204na((C4047ha) it.next()));
        }
        arrayList.addAll(arrayList2);
        Iterator it2 = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next = it2.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            C4099ja c4099ja = this.a;
            long j = this.b;
            C4204na c4204na = (C4204na) ((InterfaceC4125ka) next);
            long j2 = c4204na.a.c.b;
            if (j >= j2 && j - j2 <= c4099ja.a) {
                String str = this.c;
                int i = this.d;
                c4204na.a("Message - " + str + ", Reason - " + i + ", Timestamp - " + j + ", Data - " + this.e);
                c4204na.b(String.valueOf(i));
                Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(c4204na.b());
                if (m8026exceptionOrNullimpl != null) {
                    try {
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ?? q2 = new Q2(m8026exceptionOrNullimpl);
                        ref$ObjectRef.element = q2;
                        AbstractC3861aa.a(q2);
                        Object a = c4204na.a();
                        Throwable m8026exceptionOrNullimpl2 = Result.m8026exceptionOrNullimpl(a);
                        if (m8026exceptionOrNullimpl2 != null) {
                            try {
                                ?? q22 = new Q2(m8026exceptionOrNullimpl2);
                                ref$ObjectRef.element = q22;
                                AbstractC3861aa.a(q22);
                                a = Result.m8023constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th) {
                                Result.Companion companion = Result.INSTANCE;
                                a = Result.m8023constructorimpl(ResultKt.createFailure(th));
                            }
                        }
                        Result.m8023constructorimpl(Result.m8022boximpl(a));
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m8023constructorimpl(ResultKt.createFailure(th2));
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
