package com.inmobi.media;

import android.content.ContentValues;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class Mb {
    public static final ContentValues a(Db db) {
        Intrinsics.checkNotNullParameter(db, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("filename", db.a);
        contentValues.put("saveTimestamp", Long.valueOf(db.b));
        contentValues.put("retryCount", Integer.valueOf(db.c));
        contentValues.put("lastRetryTimestamp", Long.valueOf(db.d));
        contentValues.put("checkpoints", Integer.valueOf(db.f));
        contentValues.put("hasLoggerFinished", Integer.valueOf(db.e ? 1 : 0));
        return contentValues;
    }

    public static final Db a(ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(contentValues, "<this>");
        String asString = contentValues.getAsString("filename");
        Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
        Long asLong = contentValues.getAsLong("saveTimestamp");
        Intrinsics.checkNotNullExpressionValue(asLong, "getAsLong(...)");
        long longValue = asLong.longValue();
        Integer asInteger = contentValues.getAsInteger("retryCount");
        Intrinsics.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
        int intValue = asInteger.intValue();
        Long asLong2 = contentValues.getAsLong("lastRetryTimestamp");
        Intrinsics.checkNotNullExpressionValue(asLong2, "getAsLong(...)");
        long longValue2 = asLong2.longValue();
        Integer asInteger2 = contentValues.getAsInteger("checkpoints");
        Intrinsics.checkNotNullExpressionValue(asInteger2, "getAsInteger(...)");
        int intValue2 = asInteger2.intValue();
        Integer asInteger3 = contentValues.getAsInteger("hasLoggerFinished");
        return new Db(asString, longValue, intValue, longValue2, asInteger3 != null && asInteger3.intValue() == 1, intValue2);
    }
}
