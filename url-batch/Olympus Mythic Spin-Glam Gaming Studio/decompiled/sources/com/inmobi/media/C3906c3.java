package com.inmobi.media;

import android.content.ContentValues;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.c3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3906c3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ C3932d3 c;
    public final /* synthetic */ Z2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3906c3(int i, C3932d3 c3932d3, Z2 z2, Continuation continuation) {
        super(2, continuation);
        this.b = i;
        this.c = c3932d3;
        this.d = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3906c3(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3906c3) create((C4308r9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        if (r6.a("click", r1, 5, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r1.a(r6, r5) == r0) goto L15;
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
            String str = "DELETE FROM click WHERE ts = (SELECT ts FROM click ORDER BY ts ASC LIMIT 1) AND (SELECT COUNT(*) FROM click) > " + (this.b - 1) + ";";
            C4308r9 c4308r9 = this.c.a;
            this.a = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        C4308r9 c4308r92 = this.c.a;
        ContentValues a = AbstractC3986f3.a(this.d);
        this.a = 2;
    }
}
