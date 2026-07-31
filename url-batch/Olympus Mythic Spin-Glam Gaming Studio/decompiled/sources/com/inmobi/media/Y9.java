package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Y9 extends AbstractC4147l6 {
    public final C4308r9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y9(C4308r9 databaseHelper) {
        super("crash", databaseHelper);
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.c = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070 A[LOOP:0: B:11:0x006a->B:13:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.inmobi.media.AbstractC4147l6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, ContinuationImpl continuationImpl) {
        X9 x9;
        int i2;
        if (continuationImpl instanceof X9) {
            x9 = (X9) continuationImpl;
            int i3 = x9.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x9.c = i3 - Integer.MIN_VALUE;
                Object obj = x9.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = x9.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4308r9 c4308r9 = this.c;
                    x9.c = 1;
                    c4308r9.getClass();
                    obj = c4308r9.a(new C4203n9(c4308r9, "SELECT * FROM crash ORDER BY ts ASC LIMIT " + i, null), x9);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                List<ContentValues> list = (List) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (ContentValues contentValues : list) {
                    Intrinsics.checkNotNullParameter(contentValues, "contentValues");
                    String asString = contentValues.getAsString("eventId");
                    String asString2 = contentValues.getAsString("eventType");
                    String asString3 = contentValues.getAsString("componentType");
                    String asString4 = contentValues.getAsString("payload");
                    String asString5 = contentValues.getAsString("ts");
                    Intrinsics.checkNotNullExpressionValue(asString5, "getAsString(...)");
                    long parseLong = Long.parseLong(asString5);
                    Intrinsics.checkNotNull(asString);
                    Intrinsics.checkNotNull(asString3);
                    Intrinsics.checkNotNull(asString2);
                    C3887ba c3887ba = new C3887ba(asString, asString3, asString2, asString4);
                    c3887ba.c = parseLong;
                    Integer asInteger = contentValues.getAsInteger("id");
                    Intrinsics.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
                    c3887ba.d = asInteger.intValue();
                    arrayList.add(c3887ba);
                }
                return arrayList;
            }
        }
        x9 = new X9(this, continuationImpl);
        Object obj2 = x9.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = x9.c;
        if (i2 != 0) {
        }
        List<ContentValues> list2 = (List) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        while (r10.hasNext()) {
        }
        return arrayList2;
    }
}
