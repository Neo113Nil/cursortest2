package com.inmobi.media;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: com.inmobi.media.i9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4072i9 extends SuspendLambda implements Function1 {
    public final /* synthetic */ C4308r9 a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4072i9(C4308r9 c4308r9, String str, Continuation continuation) {
        super(1, continuation);
        this.a = c4308r9;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C4072i9(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C4072i9(this.a, this.b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SQLiteDatabase sQLiteDatabase = this.a.d;
        int i = 0;
        if (sQLiteDatabase == null) {
            return Boxing.boxInt(0);
        }
        try {
            i = (int) DatabaseUtils.longForQuery(sQLiteDatabase, this.b, null);
        } catch (SQLiteException e) {
            e.getMessage();
        }
        return Boxing.boxInt(i);
    }
}
