package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.k9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4124k9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4124k9(String str, Continuation continuation) {
        super(2, continuation);
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4124k9 c4124k9 = new C4124k9(this.b, continuation);
        c4124k9.a = obj;
        return c4124k9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4124k9 c4124k9 = new C4124k9(this.b, (Continuation) obj2);
        c4124k9.a = (C4308r9) obj;
        return c4124k9.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SQLiteDatabase sQLiteDatabase = ((C4308r9) this.a).c;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL(this.b);
        }
        return Unit.INSTANCE;
    }
}
