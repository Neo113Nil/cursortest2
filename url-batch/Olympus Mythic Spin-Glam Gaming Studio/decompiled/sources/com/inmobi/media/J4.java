package com.inmobi.media;

import android.content.ContentValues;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class J4 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ K4 b;
    public final /* synthetic */ C3961e6 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J4(K4 k4, C3961e6 c3961e6, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.b = k4;
        this.c = c3961e6;
        this.d = j;
        this.e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new J4(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J4) create((C4308r9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        if (r1.a(r8, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r8.a("c_data", r4, 4, r7) == r0) goto L15;
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
            C4308r9 c4308r9 = this.b.a;
            C3961e6 c3961e6 = this.c;
            Intrinsics.checkNotNullParameter(c3961e6, "<this>");
            ContentValues contentValues = new ContentValues();
            contentValues.put("e_data", c3961e6.a);
            contentValues.put("timestamp", Long.valueOf(c3961e6.b));
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
        String str = "DELETE FROM c_data WHERE id NOT IN (SELECT id FROM (SELECT id FROM c_data WHERE timestamp > " + this.d + " ORDER BY timestamp DESC LIMIT " + this.e + ") foo);";
        C4308r9 c4308r92 = this.b.a;
        this.a = 2;
    }
}
