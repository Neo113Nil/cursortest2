package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class K4 {
    public final C4308r9 a;

    public K4(C4308r9 databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.a = databaseHelper;
    }

    public final Object a(int i, long j, R4 r4) {
        Object a = this.a.a("DELETE FROM c_data WHERE id NOT IN (SELECT id FROM (SELECT id FROM c_data WHERE timestamp > " + j + " ORDER BY timestamp DESC LIMIT " + i + ") foo);", r4);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[LOOP:0: B:11:0x005b->B:13:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        I4 i4;
        int i;
        if (continuationImpl instanceof I4) {
            i4 = (I4) continuationImpl;
            int i2 = i4.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i4.c = i2 - Integer.MIN_VALUE;
                Object obj = i4.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = i4.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4308r9 c4308r9 = this.a;
                    i4.c = 1;
                    c4308r9.getClass();
                    obj = c4308r9.a(new C4203n9(c4308r9, "SELECT * FROM c_data", null), i4);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Iterable<ContentValues> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (ContentValues contentValues : iterable) {
                    Intrinsics.checkNotNullParameter(contentValues, "<this>");
                    String asString = contentValues.getAsString("e_data");
                    Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                    Long asLong = contentValues.getAsLong("timestamp");
                    Intrinsics.checkNotNullExpressionValue(asLong, "getAsLong(...)");
                    arrayList.add(new C3961e6(asString, asLong.longValue()));
                }
                return arrayList;
            }
        }
        i4 = new I4(this, continuationImpl);
        Object obj2 = i4.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = i4.c;
        if (i != 0) {
        }
        Iterable<ContentValues> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        while (r7.hasNext()) {
        }
        return arrayList2;
    }
}
