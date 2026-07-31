package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.j9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4098j9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4098j9(String str, String str2, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = str2;
        this.d = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4098j9 c4098j9 = new C4098j9(this.b, this.c, this.d, continuation);
        c4098j9.a = obj;
        return c4098j9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4098j9) create((C4308r9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SQLiteDatabase sQLiteDatabase = ((C4308r9) this.a).c;
        if (sQLiteDatabase != null) {
            Boxing.boxInt(sQLiteDatabase.delete(this.b, this.c, this.d));
        }
        return Unit.INSTANCE;
    }
}
