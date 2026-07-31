package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.q9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4282q9 extends SuspendLambda implements Function1 {
    public SQLiteDatabase a;
    public int b;
    public final /* synthetic */ C4308r9 c;
    public final /* synthetic */ SuspendLambda d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4282q9(C4308r9 c4308r9, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.c = c4308r9;
        this.d = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C4282q9(this.c, this.d, continuation);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C4282q9(this.c, this.d, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[Catch: SQLiteException -> 0x0065, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x0065, blocks: (B:23:0x005b, B:25:0x0061), top: B:22:0x005b }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4308r9 c4308r9 = this.c;
                sQLiteDatabase = c4308r9.c;
                if (sQLiteDatabase == 0) {
                    return null;
                }
                ?? r3 = this.d;
                if (c4308r9.b.c == 2) {
                    sQLiteDatabase.beginTransactionNonExclusive();
                } else {
                    sQLiteDatabase.beginTransaction();
                }
                try {
                    this.a = sQLiteDatabase;
                    this.b = 1;
                    if (r3.invoke(c4308r9, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sQLiteDatabase2 = sQLiteDatabase;
                } catch (SQLiteException e) {
                    e = e;
                    sQLiteDatabase2 = sQLiteDatabase;
                    e.getMessage();
                    if (sQLiteDatabase2.inTransaction()) {
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (SQLiteException e2) {
                        e2.getMessage();
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sQLiteDatabase2 = this.a;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (SQLiteException e3) {
                    e = e3;
                    e.getMessage();
                    try {
                        if (sQLiteDatabase2.inTransaction()) {
                            sQLiteDatabase2.endTransaction();
                        }
                    } catch (SQLiteException e4) {
                        e4.getMessage();
                    }
                    return Unit.INSTANCE;
                }
            }
            sQLiteDatabase2.setTransactionSuccessful();
            try {
                if (sQLiteDatabase2.inTransaction()) {
                    sQLiteDatabase2.endTransaction();
                }
            } catch (SQLiteException e5) {
                e5.getMessage();
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = coroutine_suspended;
        }
    }
}
