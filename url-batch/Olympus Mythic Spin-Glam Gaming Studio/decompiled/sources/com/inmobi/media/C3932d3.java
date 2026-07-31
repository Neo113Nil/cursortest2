package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.d3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3932d3 {
    public final C4308r9 a;

    public C3932d3(C4308r9 databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.a = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, int i2, ContinuationImpl continuationImpl) {
        C3854a3 c3854a3;
        int i3;
        if (continuationImpl instanceof C3854a3) {
            c3854a3 = (C3854a3) continuationImpl;
            int i4 = c3854a3.c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c3854a3.c = i4 - Integer.MIN_VALUE;
                Object obj = c3854a3.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = c3854a3.c;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = "SELECT * FROM click WHERE ts < " + (System.currentTimeMillis() - i2) + " ORDER BY ts ASC LIMIT " + i;
                    C4308r9 c4308r9 = this.a;
                    c3854a3.c = 1;
                    c4308r9.getClass();
                    obj = c4308r9.a(new C4203n9(c4308r9, str, null), c3854a3);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Iterable<ContentValues> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (ContentValues contentValues : iterable) {
                    Intrinsics.checkNotNullParameter(contentValues, "<this>");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String asString = contentValues.getAsString("track_extras");
                    if (asString != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(asString);
                            Intrinsics.checkNotNullParameter(jSONObject, "<this>");
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                Object obj2 = jSONObject.get(next);
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                                linkedHashMap2.put(next, (String) obj2);
                            }
                            linkedHashMap.putAll(linkedHashMap2);
                        } catch (Exception unused) {
                        }
                    }
                    Integer asInteger = contentValues.getAsInteger("id");
                    Intrinsics.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
                    int intValue = asInteger.intValue();
                    String asString2 = contentValues.getAsString("url");
                    Intrinsics.checkNotNullExpressionValue(asString2, "getAsString(...)");
                    Boolean asBoolean = contentValues.getAsBoolean("follow_redirect");
                    Intrinsics.checkNotNullExpressionValue(asBoolean, "getAsBoolean(...)");
                    boolean booleanValue = asBoolean.booleanValue();
                    Boolean asBoolean2 = contentValues.getAsBoolean("ping_in_webview");
                    Intrinsics.checkNotNullExpressionValue(asBoolean2, "getAsBoolean(...)");
                    boolean booleanValue2 = asBoolean2.booleanValue();
                    Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
                    Intrinsics.checkNotNullExpressionValue(asInteger2, "getAsInteger(...)");
                    int intValue2 = asInteger2.intValue();
                    Long asLong = contentValues.getAsLong("ts");
                    Intrinsics.checkNotNullExpressionValue(asLong, "getAsLong(...)");
                    long longValue = asLong.longValue();
                    Long asLong2 = contentValues.getAsLong("created_ts");
                    Intrinsics.checkNotNullExpressionValue(asLong2, "getAsLong(...)");
                    arrayList.add(new Z2(intValue, asString2, linkedHashMap, booleanValue, booleanValue2, intValue2, longValue, asLong2.longValue()));
                }
                return arrayList;
            }
        }
        c3854a3 = new C3854a3(this, continuationImpl);
        Object obj3 = c3854a3.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = c3854a3.c;
        if (i3 != 0) {
        }
        Iterable<ContentValues> iterable2 = (Iterable) obj3;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        while (r1.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C3880b3 c3880b3;
        int i;
        if (continuationImpl instanceof C3880b3) {
            c3880b3 = (C3880b3) continuationImpl;
            int i2 = c3880b3.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3880b3.c = i2 - Integer.MIN_VALUE;
                Object obj = c3880b3.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3880b3.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4308r9 c4308r9 = this.a;
                    c3880b3.c = 1;
                    c4308r9.getClass();
                    obj = c4308r9.a(new C4072i9(c4308r9, "SELECT COUNT(*) FROM click", null), c3880b3);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((Number) obj).intValue() != 0);
            }
        }
        c3880b3 = new C3880b3(this, continuationImpl);
        Object obj2 = c3880b3.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3880b3.c;
        if (i != 0) {
        }
        return Boxing.boxBoolean(((Number) obj2).intValue() != 0);
    }
}
