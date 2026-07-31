package sg.bigo.ads.au;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class b extends SQLiteOpenHelper {
    private static b a;
    private static WeakReference<Context> b;

    private b(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 5);
        b = new WeakReference<>(context);
    }

    public static synchronized b a(@NonNull Context context) {
        b bVar;
        synchronized (b.class) {
            try {
                if (a == null) {
                    a = new b(context, "bigo_ads_sdk.db");
                }
                bVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static void a() {
        a = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_event (_id INTEGER PRIMARY KEY AUTOINCREMENT,event_action TEXT NOT NULL,event_info TEXT NOT NULL,states INTEGER DEFAULT 0 NOT NULL,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_tracker (_id INTEGER PRIMARY KEY AUTOINCREMENT,ad_data TEXT NOT NULL,tracker_imp TEXT,tracker_cli TEXT,tracker_nurl TEXT,tracker_lurl TEXT,tracker_type INTEGER DEFAULT 0 NOT NULL,last_retry_ts LONG DEFAULT 0 NOT NULL,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_stat (_id INTEGER PRIMARY KEY AUTOINCREMENT,event_id TEXT NOT NULL,event_info TEXT NOT NULL,expired_ts LONG DEFAULT 0 NOT NULL,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_report (_id INTEGER PRIMARY KEY AUTOINCREMENT,pkg_name TEXT NOT NULL,status INTEGER DEFAULT 0,source INTEGER DEFAULT 0,check_ts LONG DEFAULT 0,result INTEGER DEFAULT 0,install_ts LONG DEFAULT 0,valid_date_ts LONG DEFAULT 0,sid LONG DEFAULT 0,ad_id TEXT,dsp TEXT,ext TEXT,mtime LONG DEFAULT 0 NOT NULL,ctime DATETIME DEFAULT CURRENT_TIMESTAMP,UNIQUE (pkg_name,status,source,sid));");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_addata (_id INTEGER PRIMARY KEY AUTOINCREMENT,slot TEXT NOT NULL UNIQUE,log_id TEXT,start_time LONG DEFAULT 0,end_time LONG DEFAULT 0,ad_data TEXT NOT NULL,ext TEXT,mtime LONG DEFAULT 0,ctime DATETIME DEFAULT CURRENT_TIMESTAMP);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_resource (_id INTEGER PRIMARY KEY AUTOINCREMENT,res_file_name TEXT NOT NULL,sdk_init_millis LONG DEFAULT 0 NOT NULL,res_delete_millis LONG DEFAULT 0 NOT NULL,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Context context;
        String str = "onDowngrade oldVersion=" + i + ",newVersion=" + i2;
        super.onDowngrade(sQLiteDatabase, i, i2);
        WeakReference<Context> weakReference = b;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return;
        }
        a.a(context, str);
        a.a(context);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_report (_id INTEGER PRIMARY KEY AUTOINCREMENT,pkg_name TEXT NOT NULL,status INTEGER DEFAULT 0,source INTEGER DEFAULT 0,check_ts LONG DEFAULT 0,result INTEGER DEFAULT 0,install_ts LONG DEFAULT 0,valid_date_ts LONG DEFAULT 0,sid LONG DEFAULT 0,ad_id TEXT,dsp TEXT,ext TEXT,mtime LONG DEFAULT 0 NOT NULL,ctime DATETIME DEFAULT CURRENT_TIMESTAMP,UNIQUE (pkg_name,status,source,sid));");
        }
        if (i < 3) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_addata (_id INTEGER PRIMARY KEY AUTOINCREMENT,slot TEXT NOT NULL UNIQUE,log_id TEXT,start_time LONG DEFAULT 0,end_time LONG DEFAULT 0,ad_data TEXT NOT NULL,ext TEXT,mtime LONG DEFAULT 0,ctime DATETIME DEFAULT CURRENT_TIMESTAMP);");
        }
        if (i < 4) {
            sQLiteDatabase.execSQL("ALTER TABLE tb_tracker ADD tracker_nurl TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE tb_tracker ADD tracker_lurl TEXT");
        }
        if (i < 5) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_resource (_id INTEGER PRIMARY KEY AUTOINCREMENT,res_file_name TEXT NOT NULL,sdk_init_millis LONG DEFAULT 0 NOT NULL,res_delete_millis LONG DEFAULT 0 NOT NULL,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
        }
    }
}
