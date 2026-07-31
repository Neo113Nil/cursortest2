package com.my.target;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class mc implements kc {
    private final SQLiteDatabase a;

    private mc(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public static kc a(jg jgVar) {
        Context context = jgVar.a;
        try {
            SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase("com_my_target_sdk.db", 0, null);
            if (openOrCreateDatabase == null) {
                mi.b("MyTargetDatabase error: can't open database");
                return new lc();
            }
            if (openOrCreateDatabase.getVersion() != 1) {
                openOrCreateDatabase.close();
                context.deleteDatabase("com_my_target_sdk.db");
                openOrCreateDatabase = a(context);
            }
            return new mc(openOrCreateDatabase);
        } catch (Throwable th) {
            mi.a("MyTargetDatabase error: exception occurred while initialization database, " + th);
            return new lc();
        }
    }

    private static SQLiteDatabase a(Context context) {
        SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase("com_my_target_sdk.db", 0, null);
        openOrCreateDatabase.setVersion(1);
        jc.a(openOrCreateDatabase);
        ai.a(openOrCreateDatabase);
        return openOrCreateDatabase;
    }

    @Override // com.my.target.kc
    public SQLiteDatabase a() {
        return this.a;
    }
}
