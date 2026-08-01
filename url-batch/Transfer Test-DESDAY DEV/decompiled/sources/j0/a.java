package j0;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface a extends Closeable {
    void b();

    void c();

    void d();

    boolean i();

    boolean k();

    void l(String str);

    Cursor q(String str);

    Cursor r(d dVar);

    void s();

    boolean u();

    Cursor x(d dVar, CancellationSignal cancellationSignal);

    e y(String str);
}
