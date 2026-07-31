package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class nt1 extends Lambda implements Function0 {
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt1(Context context) {
        super(0);
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        tt3 tt3Var;
        Context context = this.b;
        tt3 tt3Var2 = ut3.b;
        if (tt3Var2 != null) {
            return tt3Var2;
        }
        synchronized (ut3.a) {
            try {
                tt3Var = ut3.b;
                if (tt3Var == null) {
                    String str = pa.a(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
                    Cif cif = new Cif(context);
                    try {
                        rf0 rf0Var = (rf0) cif.a.getValue(cif, Cif.b[0]);
                        if (rf0Var != null) {
                            rf0Var.a.setCustomReporter(str);
                        }
                    } catch (Throwable unused) {
                        boolean z = ob1.a;
                    }
                    tt3Var = new tt3(context, cif);
                    ut3.b = tt3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tt3Var;
    }
}
