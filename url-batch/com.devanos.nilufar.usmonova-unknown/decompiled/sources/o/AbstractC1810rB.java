package o;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* renamed from: o.rB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1810rB {
    public static final C1325jr a;

    static {
        String str;
        int i = HU.a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = Arrays.asList(new C2198x3()).iterator();
            AbstractC0048Bt.n(it, "<this>");
            Iterator it2 = PQ.B(new C0577Wd(new T6(2, it))).iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    ((C2198x3) obj).getClass();
                    do {
                        ((C2198x3) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((C2198x3) obj) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            a = new C1325jr(AbstractC1391kr.a(mainLooper));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
