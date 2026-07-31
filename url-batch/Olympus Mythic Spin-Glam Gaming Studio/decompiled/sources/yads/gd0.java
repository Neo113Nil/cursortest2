package yads;

import android.database.Cursor;
import java.io.Closeable;

/* loaded from: classes4.dex */
public final class gd0 implements Closeable {
    public final Cursor a;

    public gd0(Cursor cursor) {
        this.a = cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
