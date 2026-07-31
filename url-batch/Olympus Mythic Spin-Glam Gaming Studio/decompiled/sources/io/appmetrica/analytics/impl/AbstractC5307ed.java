package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* renamed from: io.appmetrica.analytics.impl.ed, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC5307ed {
    public abstract void a(int i);

    public final synchronized void a(Context context) {
        try {
            int b = b();
            int libraryApiLevel = AppMetrica.getLibraryApiLevel();
            if (b != libraryApiLevel) {
                if (b < libraryApiLevel) {
                    SparseArray c = c();
                    while (true) {
                        b++;
                        if (b > libraryApiLevel) {
                            break;
                        }
                        InterfaceC5282dd interfaceC5282dd = (InterfaceC5282dd) c.get(b);
                        if (interfaceC5282dd != null) {
                            interfaceC5282dd.a(context);
                        }
                    }
                }
                a(libraryApiLevel);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract int b();

    public abstract SparseArray c();

    public final int a() {
        return AppMetrica.getLibraryApiLevel();
    }
}
