package com.inmobi.media;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;

/* renamed from: com.inmobi.media.n9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4203n9 extends SuspendLambda implements Function1 {
    public final /* synthetic */ C4308r9 a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4203n9(C4308r9 c4308r9, String str, Continuation continuation) {
        super(1, continuation);
        this.a = c4308r9;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C4203n9(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C4203n9(this.a, this.b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SQLiteDatabase sQLiteDatabase = this.a.d;
        if (sQLiteDatabase == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(this.b, null);
            try {
                if (rawQuery.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(rawQuery, contentValues);
                        arrayList.add(contentValues);
                    } while (rawQuery.moveToNext());
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(rawQuery, null);
                return arrayList;
            } finally {
            }
        } catch (Exception unused) {
            return arrayList;
        }
    }
}
