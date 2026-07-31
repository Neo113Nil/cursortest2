package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* renamed from: com.inmobi.media.r9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4308r9 {
    public final I9 a;
    public final C4330s5 b;
    public SQLiteDatabase c;
    public SQLiteDatabase d;
    public CoroutineDispatcher e;

    public C4308r9(I9 sqLiteOpenHelper, C4330s5 databaseConfig) {
        Intrinsics.checkNotNullParameter(sqLiteOpenHelper, "sqLiteOpenHelper");
        Intrinsics.checkNotNullParameter(databaseConfig, "databaseConfig");
        this.a = sqLiteOpenHelper;
        this.b = databaseConfig;
    }

    public final Object a(String str, ContentValues contentValues, int i, ContinuationImpl continuationImpl) {
        Object a = a(new C4282q9(this, new C4230o9(str, contentValues, i, null), null), continuationImpl);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    public static Object a(C4308r9 c4308r9, String str, ContentValues contentValues, String str2, String[] strArr, ContinuationImpl continuationImpl, int i) {
        String str3 = (i & 4) != 0 ? null : str2;
        String[] strArr2 = (i & 8) != 0 ? null : strArr;
        c4308r9.getClass();
        Object a = c4308r9.a(new C4282q9(c4308r9, new C4256p9(str, contentValues, str3, strArr2, null), null), continuationImpl);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    public static /* synthetic */ Object a(C4308r9 c4308r9, String str, String str2, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c4308r9.a(str, str2, (String[]) null, continuationImpl);
    }

    public final Object a(String str, String str2, String[] strArr, Continuation continuation) {
        Object a = a(new C4282q9(this, new C4098j9(str, str2, strArr, null), null), continuation);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        Object a = a(new C4282q9(this, new C4124k9(str, null), null), continuationImpl);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function1 function1, Continuation continuation) {
        C4150l9 c4150l9;
        Object obj;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof C4150l9) {
            c4150l9 = (C4150l9) continuation;
            int i2 = c4150l9.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4150l9.d = i2 - Integer.MIN_VALUE;
                obj = c4150l9.b;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4150l9.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher coroutineDispatcher = this.e;
                    if (coroutineDispatcher != null) {
                        C4176m9 c4176m9 = new C4176m9(function1, null);
                        c4150l9.a = function1;
                        c4150l9.d = 1;
                        obj = BuildersKt.withContext(coroutineDispatcher, c4176m9, c4150l9);
                    }
                    c4150l9.a = null;
                    c4150l9.d = 2;
                    Object invoke = function1.invoke(c4150l9);
                    return invoke == coroutine_suspended ? coroutine_suspended : invoke;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                function1 = c4150l9.a;
                ResultKt.throwOnFailure(obj);
                if (obj != null) {
                    return obj;
                }
                c4150l9.a = null;
                c4150l9.d = 2;
                Object invoke2 = function1.invoke(c4150l9);
                if (invoke2 == coroutine_suspended) {
                }
            }
        }
        c4150l9 = new C4150l9(this, continuation);
        obj = c4150l9.b;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4150l9.d;
        if (i != 0) {
        }
        if (obj != null) {
        }
        c4150l9.a = null;
        c4150l9.d = 2;
        Object invoke22 = function1.invoke(c4150l9);
        if (invoke22 == coroutine_suspended) {
        }
    }
}
