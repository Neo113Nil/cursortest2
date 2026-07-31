package com.ironsource.adqualitysdk.sdk.i;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0987 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String[] f2357;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final SQLiteDatabase f2361;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f2360 = StringFog.decrypt("BqDemxoB+MY=\n", "bdaB6G5uiqM=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2359 = StringFog.decrypt("ZQXD\n", "DmC6ry5FNVQ=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2358 = StringFog.decrypt("1OPf\n", "ooKzr3SuuRc=\n");

    static {
        StringFog.decrypt("rSEbPad11F2NBiN5v1P+VIEEOx2XdNRThQE/\n", "5HJaWfYAtTE=\n");
        f2357 = new String[]{StringFog.decrypt("Xq2S\n", "NcjrpzkBtcw=\n"), StringFog.decrypt("szzg\n", "xV2MwpkqloQ=\n")};
    }

    public C0987(Context context, String str) {
        this.f2361 = new C1033(context, str).getWritableDatabase();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized int m4279(String str) {
        Cursor cursor = null;
        try {
            cursor = this.f2361.query(f2360, new String[]{StringFog.decrypt("8VhlSC0ZIazePg==\n", "shcwBnkxV80=\n")}, StringFog.decrypt("we72RxKZUOmKtA==\n", "qouPZ17QG6w=\n"), new String[]{str.replace('*', '%')}, null, null, null);
            if (cursor == null || !cursor.moveToFirst()) {
                return 0;
            }
            int i = cursor.getInt(0);
            cursor.close();
            return i;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m4282(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(f2358, str2);
        SQLiteDatabase sQLiteDatabase = this.f2361;
        String str3 = f2360;
        if (sQLiteDatabase.update(str3, contentValues, StringFog.decrypt("DfkAOomcGQ==\n", "Zpx5GrS8Jis=\n"), new String[]{str}) == 0) {
            contentValues.put(f2359, str);
            this.f2361.replace(str3, null, contentValues);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized String m4280(String str) {
        Throwable th;
        Cursor cursor;
        try {
            cursor = this.f2361.query(f2360, f2357, StringFog.decrypt("u81EsrbJBQ==\n", "0Kg9kovpOmQ=\n"), new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToNext()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(f2358));
                        cursor.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized HashMap m4281(String str, int i) {
        HashMap hashMap;
        Cursor cursor = null;
        try {
            cursor = this.f2361.query(f2360, f2357, StringFog.decrypt("87paRSZi3Nu44A==\n", "mN8jZWorl54=\n"), new String[]{str.replace('*', '%')}, null, null, null, i <= 0 ? null : Integer.toString(i));
            hashMap = new HashMap();
            while (cursor != null) {
                if (!cursor.moveToNext()) {
                    break;
                }
                try {
                    hashMap.put(cursor.getString(cursor.getColumnIndexOrThrow(f2359)), cursor.getString(cursor.getColumnIndexOrThrow(f2358)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return hashMap;
    }
}
