package com.inmobi.media;

import android.content.ContentValues;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ck extends AbstractC4147l6 {
    public final C4308r9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ck(C4308r9 databaseHelper) {
        super(TelemetryCategory.TELEMETRY, databaseHelper);
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
        Bk bk;
        int i2;
        if (continuationImpl instanceof Bk) {
            bk = (Bk) continuationImpl;
            int i3 = bk.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bk.c = i3 - Integer.MIN_VALUE;
                Object obj = bk.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = bk.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4308r9 c4308r9 = this.c;
                    bk.c = 1;
                    c4308r9.getClass();
                    obj = c4308r9.a(new C4203n9(c4308r9, "SELECT * FROM telemetry ORDER BY ts ASC LIMIT " + i, null), bk);
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
                    String asString = contentValues.getAsString("eventType");
                    String asString2 = contentValues.getAsString("payload");
                    String asString3 = contentValues.getAsString("eventSource");
                    String asString4 = contentValues.getAsString("ts");
                    Intrinsics.checkNotNullExpressionValue(asString4, "getAsString(...)");
                    long parseLong = Long.parseLong(asString4);
                    Intrinsics.checkNotNull(asString);
                    Intrinsics.checkNotNull(asString3);
                    Dk dk = new Dk(asString, asString2, asString3);
                    dk.c = parseLong;
                    Integer asInteger = contentValues.getAsInteger("id");
                    Intrinsics.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
                    dk.d = asInteger.intValue();
                    arrayList.add(dk);
                }
                return arrayList;
            }
        }
        bk = new Bk(this, continuationImpl);
        Object obj2 = bk.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = bk.c;
        if (i2 != 0) {
        }
        List<ContentValues> list2 = (List) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        while (r9.hasNext()) {
        }
        return arrayList2;
    }
}
