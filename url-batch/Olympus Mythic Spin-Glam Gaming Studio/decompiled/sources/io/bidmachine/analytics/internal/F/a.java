package io.bidmachine.analytics.internal.F;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import com.facebook.AuthenticationTokenClaims;
import com.ironsource.O6;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* loaded from: classes15.dex */
public final class a {
    public static final C1724a b = new C1724a(null);
    private final SQLiteDatabase a;

    /* renamed from: io.bidmachine.analytics.internal.F.a$a, reason: collision with other inner class name */
    public static final class C1724a {
        public /* synthetic */ C1724a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1724a() {
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    private final Object c(String str) {
        try {
            Result.Companion companion = Result.INSTANCE;
            Cursor rawQuery = this.a.rawQuery(str, new String[0]);
            try {
                a(rawQuery);
                int i = rawQuery.getInt(0);
                if (i != 0 && i != 1) {
                    throw new IllegalArgumentException(("Column 't' must be 0 or 1, but was " + i).toString());
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

    public final Object a(io.bidmachine.analytics.internal.G.a aVar) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", aVar.b());
            contentValues.put("sid", aVar.f());
            contentValues.put("itm", aVar.c());
            contentValues.put(AuthenticationTokenClaims.JSON_KEY_IAT, Integer.valueOf(aVar.a()));
            contentValues.put("irv", Long.valueOf(aVar.d()));
            contentValues.put(O6.f0, Integer.valueOf(aVar.e()));
            this.a.insert("irec", null, contentValues);
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null && (m8026exceptionOrNullimpl instanceof SQLiteFullException)) {
            try {
                this.a.execSQL("DELETE FROM irec\nWHERE rowid NOT IN (\n    SELECT rowid FROM irec\n    ORDER BY itm DESC, rowid DESC\n    LIMIT 100\n)");
                Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m8023constructorimpl(ResultKt.createFailure(th2));
            }
        }
        return m8023constructorimpl;
    }

    public final Object b(String str) {
        try {
            Result.Companion companion = Result.INSTANCE;
            Object c = c(str);
            if (Result.m8028isFailureimpl(c)) {
                Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(c);
                if (m8026exceptionOrNullimpl == null) {
                    m8026exceptionOrNullimpl = new Exception("Error while execute " + str);
                }
                return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
            }
            if (Result.m8028isFailureimpl(c)) {
                c = null;
            }
            Integer num = (Integer) c;
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

    public final Object a(String str) {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.a.delete("irec", "itm < ?", new String[]{str});
            return Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final void a(Cursor cursor) {
        if (cursor.getColumnCount() == 1) {
            if (StringsKt.equals(cursor.getColumnName(0), "t", false)) {
                if (cursor.moveToFirst()) {
                    if (!cursor.isLast()) {
                        throw new IllegalArgumentException("Query must return exactly one row, but returned more");
                    }
                    return;
                }
                throw new IllegalArgumentException("Query returned no rows");
            }
            throw new IllegalArgumentException(("Single column must be named 't', got '" + cursor.getColumnName(0) + '\'').toString());
        }
        throw new IllegalArgumentException(("Query must return exactly one column, got " + cursor.getColumnCount()).toString());
    }
}
