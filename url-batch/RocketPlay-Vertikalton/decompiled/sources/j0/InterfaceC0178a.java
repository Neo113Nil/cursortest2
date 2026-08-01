package j0;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0178a extends Closeable {
    Cursor B(InterfaceC0181d interfaceC0181d, CancellationSignal cancellationSignal);

    InterfaceC0182e C(String str);

    void c();

    void d();

    void e();

    boolean isOpen();

    boolean n();

    void p(String str);

    Cursor t(String str);

    Cursor v(InterfaceC0181d interfaceC0181d);

    void w();

    boolean x();
}
