package com.yandex.div.storage.util;

import android.database.sqlite.SQLiteStatement;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SqlExtensions.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\bH\u0000\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\nH\u0000¨\u0006\u000b"}, d2 = {"bindNullableBlob", "", "Landroid/database/sqlite/SQLiteStatement;", "index", "", "value", "", "closeSilently", "Ljava/io/Closeable;", "endTransactionSilently", "Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;", "div-storage_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SqlExtensionsKt {
    public static final void bindNullableBlob(@NotNull SQLiteStatement sQLiteStatement, int i, @Nullable byte[] bArr) {
        if (bArr == null) {
            sQLiteStatement.bindNull(i);
        } else {
            sQLiteStatement.bindBlob(i, bArr);
        }
    }

    public static final void closeSilently(@NotNull Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static final void endTransactionSilently(@NotNull DatabaseOpenHelper.Database database) {
        try {
            database.endTransaction();
        } catch (IllegalStateException unused) {
        }
    }
}
