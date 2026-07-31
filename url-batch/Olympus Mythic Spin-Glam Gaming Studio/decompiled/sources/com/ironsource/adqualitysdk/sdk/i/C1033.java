package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ḟ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1033 extends SQLiteOpenHelper {
    public C1033(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL(StringFog.decrypt("OLek9urE7AwHl4DYwOuTAQ2c2P7p\n", "aOXlsaeFzGo=\n"));
        }
        sQLiteDatabase.execSQL(StringFog.decrypt("85+s7Q+xBQTxj6Xpe71jcP6CvYwerGwD5J7Jxy2rViTfv4yEMJFccOSIsfh7pHcZ/Yy79Xu/YAmc\n7Z/NN9RxFeiZwA==\n", "sM3prFv0JVA=\n"));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
