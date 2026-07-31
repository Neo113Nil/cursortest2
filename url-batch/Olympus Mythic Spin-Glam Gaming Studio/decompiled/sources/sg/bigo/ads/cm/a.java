package sg.bigo.ads.cm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.ar.c;

/* loaded from: classes6.dex */
public final class a implements c {
    private static volatile a a;
    private final List<InterfaceC1865a> b = new ArrayList();

    /* renamed from: sg.bigo.ads.cm.a$a, reason: collision with other inner class name */
    public interface InterfaceC1865a {
        void a(boolean z);
    }

    public static synchronized void a(Context context, @Nullable InterfaceC1865a interfaceC1865a) {
        synchronized (a.class) {
            try {
                if (a == null) {
                    a = new a();
                    sg.bigo.ads.ar.a.a().a(context, a);
                }
                synchronized (a.b) {
                    if (interfaceC1865a != null) {
                        try {
                            a.b.add(interfaceC1865a);
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // sg.bigo.ads.ar.b
    public final void a(Context context, Intent intent) {
        boolean b = sg.bigo.ads.bz.c.b(context);
        synchronized (this.b) {
            try {
                for (InterfaceC1865a interfaceC1865a : this.b) {
                    if (interfaceC1865a != null) {
                        interfaceC1865a.a(b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
