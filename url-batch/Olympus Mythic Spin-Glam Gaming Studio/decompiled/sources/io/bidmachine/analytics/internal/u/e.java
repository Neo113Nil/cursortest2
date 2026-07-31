package io.bidmachine.analytics.internal.u;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import io.bidmachine.analytics.internal.v.a;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public final class e {
    public static final a c = new a(null);
    private static final SimpleDateFormat d;
    private final SQLiteDatabase a;
    private final String b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(String str) {
            SQLiteDatabase create = SQLiteDatabase.create(null);
            create.execSQL("PRAGMA foreign_keys=ON");
            create.execSQL("CREATE TABLE prec (\n  id INTEGER PRIMARY KEY AUTOINCREMENT,\n  pt TEXT NOT NULL CHECK (pt IN ('C','NC','ARS','NRS')),\n  pd TEXT NOT NULL CHECK (julianday(pd) IS NOT NULL),\n  ac INTEGER NOT NULL CHECK (ac IN (0,1))\n)");
            return new e(create, str, null);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.EnumC1766a.values().length];
            try {
                iArr[a.EnumC1766a.INAPP_CONSUMABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC1766a.INAPP_NON_CONSUMABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC1766a.SUBS_AUTO_RENEWABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.EnumC1766a.SUBS_NON_AUTO_RENEWABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        d = simpleDateFormat;
    }

    public /* synthetic */ e(SQLiteDatabase sQLiteDatabase, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(sQLiteDatabase, str);
    }

    private final Object b(String str) {
        try {
            Result.Companion companion = Result.INSTANCE;
            Object a2 = a(str);
            if (Result.m8028isFailureimpl(a2)) {
                Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a2);
                if (m8026exceptionOrNullimpl == null) {
                    m8026exceptionOrNullimpl = new Exception("Error while execute " + str);
                }
                return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
            }
            if (Result.m8028isFailureimpl(a2)) {
                a2 = null;
            }
            Integer num = (Integer) a2;
            if (num == null) {
                return Result.m8023constructorimpl(ResultKt.createFailure(new Exception("Empty result for " + str)));
            }
            int intValue = num.intValue();
            boolean z = true;
            if (intValue != 1) {
                z = false;
            }
            return Result.m8023constructorimpl(Boolean.valueOf(z));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final Object a() {
        try {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8023constructorimpl(Integer.valueOf(this.a.delete("prec", null, null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final Object c() {
        try {
            Result.Companion companion = Result.INSTANCE;
            return b(this.b);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    private e(SQLiteDatabase sQLiteDatabase, String str) {
        this.a = sQLiteDatabase;
        this.b = str;
    }

    public final Object a(Iterable iterable) {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.a.beginTransaction();
            SQLiteStatement compileStatement = this.a.compileStatement("INSERT INTO prec (pt, pd, ac) VALUES (?, ?, ?)");
            try {
                try {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        io.bidmachine.analytics.internal.v.a aVar = (io.bidmachine.analytics.internal.v.a) it.next();
                        compileStatement.clearBindings();
                        compileStatement.bindString(1, a(aVar.b()));
                        compileStatement.bindString(2, d.format(aVar.a()));
                        compileStatement.bindLong(3, aVar.c() ? 1L : 0L);
                        compileStatement.executeInsert();
                    }
                    this.a.setTransactionSuccessful();
                    this.a.endTransaction();
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(compileStatement, null);
                    return Result.m8023constructorimpl(unit);
                } catch (Throwable th) {
                    this.a.endTransaction();
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th2));
        }
    }

    public final Object b() {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.a.close();
            return Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final Object a(String str) {
        try {
            Result.Companion companion = Result.INSTANCE;
            Cursor rawQuery = this.a.rawQuery(str, new String[0]);
            try {
                a(rawQuery);
                int i = rawQuery.getInt(0);
                if (i != 0 && i != 1) {
                    throw new IllegalArgumentException(("Column 'p' must be 0 or 1, but was " + i).toString());
                }
                Object m8023constructorimpl = Result.m8023constructorimpl(Integer.valueOf(i));
                CloseableKt.closeFinally(rawQuery, null);
                return m8023constructorimpl;
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final void a(Cursor cursor) {
        if (cursor.getColumnCount() == 1) {
            if (StringsKt.equals(cursor.getColumnName(0), "p", false)) {
                if (cursor.moveToFirst()) {
                    if (!cursor.isLast()) {
                        throw new IllegalArgumentException("Query must return exactly one row, but returned more");
                    }
                    return;
                }
                throw new IllegalArgumentException("Query returned no rows");
            }
            throw new IllegalArgumentException(("Single column must be named 'p', got '" + cursor.getColumnName(0) + '\'').toString());
        }
        throw new IllegalArgumentException(("Query must return exactly one column, got " + cursor.getColumnCount()).toString());
    }

    private final String a(a.EnumC1766a enumC1766a) {
        int i = b.$EnumSwitchMapping$0[enumC1766a.ordinal()];
        if (i == 1) {
            return "C";
        }
        if (i == 2) {
            return "NC";
        }
        if (i == 3) {
            return "ARS";
        }
        if (i == 4) {
            return "NRS";
        }
        throw new NoWhenBranchMatchedException();
    }
}
