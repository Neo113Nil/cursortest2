package yads;

import android.content.Context;
import android.location.Location;

/* loaded from: classes13.dex */
public final class zx0 implements ah1 {
    public final fh1 a;
    public final Object b = new Object();

    public zx0(Context context, String str) {
        this.a = new fh1(context, str);
    }

    @Override // yads.ah1
    public final Location a() {
        Location location;
        synchronized (this.b) {
            try {
                fh1 fh1Var = this.a;
                eh1 eh1Var = fh1Var.c;
                if (eh1Var == null) {
                    eh1Var = fh1Var.a();
                }
                if (eh1Var != null) {
                    Object a = rm2.a(eh1Var.a, "isComplete", new Object[0]);
                    Boolean bool = a instanceof Boolean ? (Boolean) a : null;
                    if (bool != null ? bool.booleanValue() : false) {
                        Object a2 = rm2.a(eh1Var.a, "getResult", new Object[0]);
                        location = a2 instanceof Location ? (Location) a2 : null;
                        fh1 fh1Var2 = this.a;
                        fh1Var2.c = fh1Var2.a();
                        fh1Var2.c = fh1Var2.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return location;
    }
}
