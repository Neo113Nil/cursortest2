package sg.bigo.ads.au;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.au.c;

/* loaded from: classes5.dex */
public final class a {
    static c a;
    static AtomicBoolean b = new AtomicBoolean(false);

    @Nullable
    static SQLiteDatabase c;

    /* renamed from: sg.bigo.ads.au.a$a, reason: collision with other inner class name */
    public interface InterfaceC1844a {
        void a();

        void a(String str);
    }

    public static int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        a();
        SQLiteDatabase sQLiteDatabase = c;
        if (sQLiteDatabase == null) {
            return 0;
        }
        try {
            return sQLiteDatabase.update(str, contentValues, str2, strArr);
        } catch (SQLException unused) {
            sg.bigo.ads.bn.a.a(0, "DbHelper", "Failed: ".concat(String.valueOf(contentValues)));
            return 0;
        }
    }

    public static long a(String str, ContentValues contentValues) {
        a();
        if (c != null && !sg.bigo.ads.bw.a.s()) {
            try {
                return c.insert(str, null, contentValues);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public static Cursor a(String str, String str2, String[] strArr) {
        a();
        SQLiteDatabase sQLiteDatabase = c;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            return sQLiteDatabase.query(str, null, str2, strArr, null, null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Cursor a(String str, String str2, String[] strArr, String str3, int i) {
        a();
        SQLiteDatabase sQLiteDatabase = c;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            return sQLiteDatabase.query(str, null, str2, strArr, null, null, str3, Integer.toString(i));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void a() {
        Runnable poll;
        c cVar = a;
        if (cVar == null || b.get()) {
            return;
        }
        while (true) {
            synchronized (cVar.b) {
                poll = cVar.a.poll();
            }
            if (poll == null) {
                return;
            } else {
                poll.run();
            }
        }
    }

    public static void a(@NonNull Context context) {
        b.set(false);
        a = null;
        a(context, (InterfaceC1844a) null);
    }

    public static void a(@NonNull Context context, @Nullable String str) {
        File databasePath = context.getDatabasePath("bigo_ads_sdk.db");
        sg.bigo.ads.bn.a.a(0, "DbHelper", String.format("exception path:%s exists:%s isfile:%s read:%s write:%s exec:%s hidden:%s errormsg:%s", databasePath.getPath(), Boolean.valueOf(databasePath.exists()), Boolean.valueOf(databasePath.isFile()), Boolean.valueOf(databasePath.canRead()), Boolean.valueOf(databasePath.canWrite()), Boolean.valueOf(databasePath.canExecute()), Boolean.valueOf(databasePath.isHidden()), str));
        context.deleteDatabase("bigo_ads_sdk.db");
        b.a();
    }

    public static void a(@NonNull final Context context, final InterfaceC1844a interfaceC1844a) {
        c cVar = new c();
        a = cVar;
        c.a aVar = new c.a(new Runnable() { // from class: sg.bigo.ads.au.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.c = b.a(context).getWritableDatabase();
                } catch (Throwable th) {
                    a.a(context, Log.getStackTraceString(th));
                    try {
                        a.c = b.a(context).getWritableDatabase();
                    } catch (Throwable th2) {
                        sg.bigo.ads.bn.a.a(0, "DbHelper", "can't get db final," + th2.getMessage());
                        a.c = null;
                    }
                }
                a.b.set(true);
                a.a = null;
                InterfaceC1844a interfaceC1844a2 = interfaceC1844a;
                if (interfaceC1844a2 != null) {
                    if (a.c != null) {
                        interfaceC1844a2.a();
                    } else {
                        interfaceC1844a2.a("");
                    }
                }
            }
        });
        Runnable runnable = aVar.b;
        synchronized (cVar.b) {
            cVar.a.add(runnable);
        }
        cVar.c.execute(new Runnable() { // from class: sg.bigo.ads.au.c.1
            final /* synthetic */ a a;
            final /* synthetic */ Runnable b;

            AnonymousClass1(a aVar2, Runnable runnable2) {
                r2 = aVar2;
                r3 = runnable2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                r2.run();
                r3.run();
                synchronized (c.this.b) {
                    c.this.a.remove(r3);
                }
            }
        });
    }

    public static int b(String str, String str2, String[] strArr) {
        a();
        SQLiteDatabase sQLiteDatabase = c;
        if (sQLiteDatabase == null) {
            return 0;
        }
        try {
            return sQLiteDatabase.delete(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static long b(String str, ContentValues contentValues) {
        a();
        if (c != null && !sg.bigo.ads.bw.a.s()) {
            try {
                return c.insertWithOnConflict(str, null, contentValues, 5);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }
}
