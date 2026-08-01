package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class xx {
    public final long a;
    public final l40 b;
    public final kn c;
    public final ConcurrentLinkedQueue d;

    public xx(m40 m40Var) {
        m40Var.getClass();
        TimeUnit.MINUTES.getClass();
        this.a = 300000000000L;
        this.b = m40Var.e();
        this.c = new kn(this, z60.g + " ConnectionPool");
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(z1 z1Var, tx txVar, ArrayList arrayList, boolean z) {
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            wx wxVar = (wx) it.next();
            wxVar.getClass();
            synchronized (wxVar) {
                if (z) {
                    try {
                        if (!(wxVar.g != null)) {
                            continue;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (wxVar.h(z1Var, arrayList)) {
                    txVar.b(wxVar);
                    return true;
                }
            }
        }
    }

    public final int b(wx wxVar, long j) {
        byte[] bArr = z60.a;
        ArrayList arrayList = wxVar.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + wxVar.b.a.h + " was leaked. Did you forget to close a response body?";
                jw jwVar = jw.a;
                jw.a.j(((rx) reference).a, str);
                arrayList.remove(i);
                wxVar.j = true;
                if (arrayList.isEmpty()) {
                    wxVar.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
