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

/* renamed from: com.inmobi.media.p9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4256p9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ContentValues c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4256p9(String str, ContentValues contentValues, String str2, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = contentValues;
        this.d = str2;
        this.e = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4256p9 c4256p9 = new C4256p9(this.b, this.c, this.d, this.e, continuation);
        c4256p9.a = obj;
        return c4256p9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4256p9) create((C4308r9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SQLiteDatabase sQLiteDatabase = ((C4308r9) this.a).c;
        if (sQLiteDatabase != null) {
            Boxing.boxInt(sQLiteDatabase.updateWithOnConflict(this.b, this.c, this.d, this.e, 4));
        }
        return Unit.INSTANCE;
    }
}
