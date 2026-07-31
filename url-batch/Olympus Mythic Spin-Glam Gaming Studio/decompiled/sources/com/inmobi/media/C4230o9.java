package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.o9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4230o9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ContentValues c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4230o9(String str, ContentValues contentValues, int i, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = contentValues;
        this.d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4230o9 c4230o9 = new C4230o9(this.b, this.c, this.d, continuation);
        c4230o9.a = obj;
        return c4230o9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4230o9) create((C4308r9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SQLiteDatabase sQLiteDatabase = ((C4308r9) this.a).c;
        if (sQLiteDatabase != null) {
            Boxing.boxLong(sQLiteDatabase.insertWithOnConflict(this.b, null, this.c, this.d));
        }
        return Unit.INSTANCE;
    }
}
