package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class Y4 extends DatabaseScript {
    public final int a = 2000;
    public final String b = "number";
    public final String c = "global_number";
    public final String d = "number_of_type";
    public final String e = "name";
    public final String f = "value";
    public final String g = "type";
    public final String h = "time";
    public final String i = SDKAnalyticsEvents.PARAMETER_SESSION_ID;
    public final String j = "error_environment";
    public final String k = "session_type";
    public final String l = "app_environment";
    public final String m = "app_environment_revision";
    public final String n = "truncated";
    public final String o = "custom_type";
    public final String p = "encrypting_mode";
    public final String q = "profile_id";
    public final String r = "first_occurrence_status";
    public final String s = "source";
    public final String t = "attribution_id_changed";
    public final String u = "open_id";
    public final String v = "extras";
    public final String w = "reports";
    public final C5768w7 x = new C5768w7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(C5742v7 c5742v7) {
        Long l;
        EnumC5798xb enumC5798xb;
        Long l2;
        Long l3;
        Long l4;
        Integer num;
        Long l5 = c5742v7.a;
        return (l5 == null || l5.longValue() < 10000000000L || c5742v7.b == null || (l = c5742v7.c) == null || l.longValue() < 0 || (enumC5798xb = c5742v7.d) == null || enumC5798xb == EnumC5798xb.EVENT_TYPE_UNDEFINED || (l2 = c5742v7.e) == null || l2.longValue() < 0 || (l3 = c5742v7.f) == null || l3.longValue() < 0 || ((l4 = c5742v7.g.d) != null && l4.longValue() < 0) || ((num = c5742v7.g.i) != null && num.intValue() < 0)) ? false : true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor2 = null;
        try {
            cursor = sQLiteDatabase.query(this.w, null, null, null, null, null, null, String.valueOf(this.a));
            while (cursor.moveToNext()) {
                try {
                    C5742v7 a = a(cursor);
                    if (a != null && a(a)) {
                        try {
                            sQLiteDatabase.insertOrThrow("events", null, this.x.fromModel(a));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor = cursor2;
                        cursor.close();
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.w);
                }
            }
        } catch (Throwable unused3) {
        }
        cursor.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:2|3|(3:(2:58|(1:60)(15:61|6|(2:51|(1:53)(2:54|(1:56)(12:57|9|10|11|(2:44|(1:46)(8:47|48|14|15|(2:38|(3:40|18|19))|17|18|19))|13|14|15|(0)|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|18|19)|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|(3:(0)|(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:2|3|(2:58|(1:60)(15:61|6|(2:51|(1:53)(2:54|(1:56)(12:57|9|10|11|(2:44|(1:46)(8:47|48|14|15|(2:38|(3:40|18|19))|17|18|19))|13|14|15|(0)|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|18|19|(3:(0)|(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012e, code lost:
    
        if (r32.getInt(r32.getColumnIndexOrThrow(r31.t)) == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
    
        r27 = io.appmetrica.analytics.impl.G9.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        r3 = io.appmetrica.analytics.impl.Aa.UNKNOWN;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0151 A[Catch: all -> 0x016b, TryCatch #4 {all -> 0x016b, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0132, B:25:0x0142, B:28:0x0157, B:33:0x0151, B:42:0x0120, B:50:0x0103, B:51:0x00d4, B:54:0x00d9, B:58:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:44:0x00fb, B:47:0x0100), top: B:2:0x0005, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:15:0x0107, B:38:0x0118), top: B:14:0x0107, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb A[Catch: all -> 0x0103, TryCatch #3 {all -> 0x0103, blocks: (B:11:0x00ea, B:44:0x00fb, B:47:0x0100), top: B:10:0x00ea, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4 A[Catch: all -> 0x016b, TryCatch #4 {all -> 0x016b, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0132, B:25:0x0142, B:28:0x0157, B:33:0x0151, B:42:0x0120, B:50:0x0103, B:51:0x00d4, B:54:0x00d9, B:58:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:44:0x00fb, B:47:0x0100), top: B:2:0x0005, inners: #0, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5742v7 a(Cursor cursor) {
        EnumC5600pl enumC5600pl;
        int i;
        EnumC5252c9 enumC5252c9;
        Aa aa;
        G9 g9;
        int i2;
        int i3;
        int i4;
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.i)));
            int i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.k));
            EnumC5600pl enumC5600pl2 = EnumC5600pl.FOREGROUND;
            boolean z = true;
            try {
                if (i5 != 0) {
                    enumC5600pl2 = EnumC5600pl.BACKGROUND;
                    if (i5 != 1) {
                        enumC5600pl = null;
                        Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.b)));
                        EnumC5798xb a = EnumC5798xb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.g)));
                        Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.c)));
                        Long valueOf4 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.h)));
                        Integer valueOf5 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.o)));
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.e));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f));
                        Long valueOf6 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.d)));
                        String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.j));
                        String string4 = cursor.getString(cursor.getColumnIndexOrThrow(this.l));
                        Long valueOf7 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.m)));
                        Integer valueOf8 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.n)));
                        i = cursor.getInt(cursor.getColumnIndexOrThrow(this.p));
                        EnumC5252c9 enumC5252c92 = EnumC5252c9.NONE;
                        if (i != 0) {
                            enumC5252c92 = EnumC5252c9.AES_VALUE_ENCRYPTION;
                            if (i != 2) {
                                enumC5252c92 = EnumC5252c9.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
                                if (i != 1) {
                                    enumC5252c9 = null;
                                    String string5 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
                                    i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.r));
                                    Aa aa2 = Aa.FIRST_OCCURRENCE;
                                    if (i4 != 1) {
                                        aa2 = Aa.NON_FIRST_OCCURENCE;
                                        if (i4 != 2) {
                                            Aa aa3 = Aa.UNKNOWN;
                                            aa = aa3;
                                            i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.s));
                                            G9 g92 = G9.NATIVE;
                                            if (i3 != 0) {
                                                g92 = G9.JS;
                                                if (i3 != 1) {
                                                    g9 = null;
                                                }
                                            }
                                            g9 = g92;
                                        }
                                    }
                                    aa = aa2;
                                    i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.s));
                                    G9 g922 = G9.NATIVE;
                                    if (i3 != 0) {
                                    }
                                    g9 = g922;
                                }
                            }
                        }
                        enumC5252c9 = enumC5252c92;
                        String string52 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
                        i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.r));
                        Aa aa22 = Aa.FIRST_OCCURRENCE;
                        if (i4 != 1) {
                        }
                        aa = aa22;
                        i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.s));
                        G9 g9222 = G9.NATIVE;
                        if (i3 != 0) {
                        }
                        g9 = g9222;
                    }
                }
            } catch (Throwable unused) {
            }
            enumC5600pl = enumC5600pl2;
            Long valueOf22 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.b)));
            EnumC5798xb a2 = EnumC5798xb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.g)));
            Long valueOf32 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.c)));
            Long valueOf42 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.h)));
            Integer valueOf52 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.o)));
            String string6 = cursor.getString(cursor.getColumnIndexOrThrow(this.e));
            String string22 = cursor.getString(cursor.getColumnIndexOrThrow(this.f));
            Long valueOf62 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.d)));
            String string32 = cursor.getString(cursor.getColumnIndexOrThrow(this.j));
            String string42 = cursor.getString(cursor.getColumnIndexOrThrow(this.l));
            Long valueOf72 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.m)));
            Integer valueOf82 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.n)));
            i = cursor.getInt(cursor.getColumnIndexOrThrow(this.p));
            EnumC5252c9 enumC5252c922 = EnumC5252c9.NONE;
            if (i != 0) {
            }
            enumC5252c9 = enumC5252c922;
            String string522 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
            i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.r));
            Aa aa222 = Aa.FIRST_OCCURRENCE;
            if (i4 != 1) {
            }
            aa = aa222;
            i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.s));
            G9 g92222 = G9.NATIVE;
            if (i3 != 0) {
            }
            g9 = g92222;
            z = false;
            Boolean valueOf9 = Boolean.valueOf(z);
            try {
                i2 = cursor.getInt(cursor.getColumnIndexOrThrow(this.u));
            } catch (Throwable unused2) {
                i2 = -1;
            }
            Integer valueOf10 = Integer.valueOf(i2);
            int columnIndex = cursor.getColumnIndex(this.v);
            return new C5742v7(valueOf, enumC5600pl, valueOf22, a2, valueOf32, valueOf42, new C5716u7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, enumC5252c9, string522, aa, g9, valueOf9, valueOf10, columnIndex >= 0 ? null : cursor.getBlob(columnIndex)));
            Integer valueOf102 = Integer.valueOf(i2);
            int columnIndex2 = cursor.getColumnIndex(this.v);
            return new C5742v7(valueOf, enumC5600pl, valueOf22, a2, valueOf32, valueOf42, new C5716u7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, enumC5252c9, string522, aa, g9, valueOf9, valueOf102, columnIndex2 >= 0 ? null : cursor.getBlob(columnIndex2)));
        } catch (Throwable unused3) {
            return null;
        }
    }
}
