package com.inmobi.media;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.u6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4384u6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Ze c;
    public final /* synthetic */ int d;
    public final /* synthetic */ C4173m6 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Zk i;
    public final /* synthetic */ C4358t6 j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4384u6(long j, Ze ze, int i, C4173m6 c4173m6, String str, int i2, long j2, Zk zk, C4358t6 c4358t6, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = j;
        this.c = ze;
        this.d = i;
        this.e = c4173m6;
        this.f = str;
        this.g = i2;
        this.h = j2;
        this.i = zk;
        this.j = c4358t6;
        this.k = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4384u6(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4384u6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0042, code lost:
    
        if (r14 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002d, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r13) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.b * 1000;
            this.a = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                InterfaceC3892bf interfaceC3892bf = (InterfaceC3892bf) obj;
                Lazy lazy = AbstractC4411v6.a;
                if (Fl.a(interfaceC3892bf)) {
                    C4358t6 c4358t6 = this.j;
                    C4173m6 eventPayload = this.e;
                    c4358t6.getClass();
                    Intrinsics.checkNotNullParameter(eventPayload, "eventPayload");
                    String TAG = c4358t6.e;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    BuildersKt__BuildersKt.runBlocking$default(null, new C4279q6(c4358t6, eventPayload, null), 1, null);
                    c4358t6.a(System.currentTimeMillis());
                    if (c4358t6.d != null) {
                        ArrayList eventIds = eventPayload.a;
                        Intrinsics.checkNotNullParameter(eventIds, "eventIds");
                        Integer num = Ak.c;
                        if (num != null && eventIds.contains(Integer.valueOf(num.intValue()))) {
                            Ak.b = 0;
                            Qa qa = Ak.a;
                            if (qa != null) {
                                ConcurrentHashMap concurrentHashMap = Qa.b;
                                qa.a("count", 0, false);
                            }
                            Ak.c = null;
                        }
                    }
                    c4358t6.f.set(false);
                } else if (this.d > 1) {
                    Intrinsics.checkNotNullExpressionValue("v6", "access$getTAG$p(...)");
                    interfaceC3892bf.c();
                    interfaceC3892bf.e();
                    AbstractC4411v6.a(this.e, this.f, this.g, this.d - 1, this.h, this.i, this.j, this.k);
                } else {
                    C4358t6 c4358t62 = this.j;
                    C4173m6 eventPayload2 = this.e;
                    c4358t62.getClass();
                    Intrinsics.checkNotNullParameter(eventPayload2, "eventPayload");
                    String TAG2 = c4358t62.e;
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    BuildersKt__BuildersKt.runBlocking$default(null, new C4253p6(eventPayload2, true, c4358t62, null), 1, null);
                    c4358t62.a(System.currentTimeMillis());
                    if (c4358t62.d != null) {
                        ArrayList eventIds2 = eventPayload2.a;
                        Intrinsics.checkNotNullParameter(eventIds2, "eventIds");
                        Integer num2 = Ak.c;
                        if (num2 != null && eventIds2.contains(Integer.valueOf(num2.intValue()))) {
                            Ak.c = null;
                        }
                    }
                    c4358t62.f.set(false);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        F9 f9 = (F9) Ve.g.getValue();
        Ze ze = this.c;
        this.a = 2;
        obj = f9.a.a(ze, this);
    }
}
