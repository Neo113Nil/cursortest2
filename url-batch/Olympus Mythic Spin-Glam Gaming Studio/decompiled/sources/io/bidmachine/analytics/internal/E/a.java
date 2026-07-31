package io.bidmachine.analytics.internal.E;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ironsource.B5;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class a extends SQLiteOpenHelper {
    public static final C1723a a = new C1723a(null);

    /* renamed from: io.bidmachine.analytics.internal.E.a$a, reason: collision with other inner class name */
    public static final class C1723a {
        public /* synthetic */ C1723a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1723a() {
        }
    }

    public a(Context context) {
        super(context, "BMAnalytics.db", (SQLiteDatabase.CursorFactory) null, 3);
    }

    /* JADX WARN: Finally extract failed */
    private final Object a(SQLiteDatabase sQLiteDatabase) {
        try {
            Result.Companion companion = Result.INSTANCE;
            Cursor query = sQLiteDatabase.query("sqlite_master", new String[]{"name"}, "type = ?", new String[]{B5.R}, null, null, null);
            while (query.moveToNext()) {
                try {
                    try {
                        Result.Companion companion2 = Result.INSTANCE;
                        String string = query.getString(0);
                        if (!Intrinsics.areEqual(string, "android_metadata") && !Intrinsics.areEqual(string, "sqlite_master")) {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + string);
                        }
                        Result.m8023constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion3 = Result.INSTANCE;
                        Result.m8023constructorimpl(ResultKt.createFailure(th));
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(query, th2);
                        throw th3;
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(query, null);
            return Result.m8023constructorimpl(unit);
        } catch (Throwable th4) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th4));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE monitor_record (id TEXT,name TEXT,timestamp INTEGER,session_id TEXT,data BLOB,error BLOB,is_reserved INTEGER DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE TABLE reader_record (id TEXT,name TEXT,timestamp INTEGER,data_hash TEXT,rule TEXT,error BLOB,is_dirty INTEGER,is_reserved INTEGER DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE TABLE irec (id TEXT,sid TEXT,itm TEXT,iat INTEGER,irv INTEGER,itp INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        a(sQLiteDatabase);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS monitor_record");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS reader_record");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS irec");
        onCreate(sQLiteDatabase);
    }
}
