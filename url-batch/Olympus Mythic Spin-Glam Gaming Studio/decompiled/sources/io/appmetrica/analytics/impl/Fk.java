package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class Fk implements InterfaceC5282dd {
    public final Oo a;
    public final String b = "startup_state";
    public final AESEncrypter c;

    public Fk(@NotNull Oo oo) {
        this.a = oo;
        C5190a c5190a = new C5190a(Ka.k().g());
        this.c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c5190a.b(), c5190a.a());
    }

    public static void a(Oo oo, C5861zm c5861zm, Wb wb) {
        String optStringOrNull;
        synchronized (oo) {
            optStringOrNull = JsonUtils.optStringOrNull(oo.a.a(), "device_id");
        }
        if (TextUtils.isEmpty(optStringOrNull)) {
            if (!TextUtils.isEmpty(wb.d)) {
                oo.a(wb.d);
            }
            if (!TextUtils.isEmpty(wb.e)) {
                oo.b(wb.e);
            }
            if (TextUtils.isEmpty(wb.a)) {
                return;
            }
            c5861zm.a = wb.a;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5282dd
    public final void a(@NotNull Context context) {
        SQLiteDatabase readableDatabase = Ka.I.B().f(context).getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Wb a = a(readableDatabase);
                C5861zm c5861zm = new C5861zm(new C4(new A4()));
                if (a != null) {
                    a(this.a, c5861zm, a);
                    c5861zm.p = a.c;
                    c5861zm.r = a.b;
                }
                Am am = new Am(c5861zm);
                AbstractC5420in abstractC5420in = (AbstractC5420in) C5369gn.a(Am.class);
                abstractC5420in.a(context, abstractC5420in.b(context)).save(am);
            } catch (Throwable unused) {
            }
        }
    }

    public final Wb a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            cursor = sQLiteDatabase.query("binary_data", new String[]{"value"}, "data_key = ?", new String[]{this.b}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                        Wb wb = (Wb) MessageNano.mergeFrom(new Wb(), this.c.decrypt(cursor.getBlob(cursor.getColumnIndexOrThrow("value"))));
                        CloseableUtils.closeSafely(cursor);
                        return wb;
                    }
                } catch (Throwable unused) {
                }
            }
            if (cursor != null) {
                cursor.getCount();
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        CloseableUtils.closeSafely(cursor);
        return null;
    }
}
