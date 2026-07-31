package yads;

import android.content.Context;
import java.util.Set;

/* loaded from: classes4.dex */
public final class tt3 {
    public final Cif a;
    public final qf b;

    public tt3(Context context, Cif cif) {
        qf qfVar = new qf(context);
        this.a = cif;
        this.b = qfVar;
    }

    public final void a(String str) {
        if (this.b.c()) {
            Cif cif = this.a;
            cif.getClass();
            try {
                rf0 rf0Var = (rf0) cif.a.getValue(cif, Cif.b[0]);
                if (rf0Var != null) {
                    rf0Var.a.setExperiments(str);
                }
            } catch (Throwable unused) {
                boolean z = ob1.a;
            }
        }
    }

    public final void a(Set set) {
        if (this.b.c()) {
            Cif cif = this.a;
            cif.getClass();
            try {
                rf0 rf0Var = (rf0) cif.a.getValue(cif, Cif.b[0]);
                if (rf0Var != null) {
                    rf0Var.a.setTriggeredTestIds(set);
                }
            } catch (Throwable unused) {
                set.toString();
                boolean z = ob1.a;
            }
        }
    }
}
