package yads;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class nd2 extends co {
    public static final int w = (int) TimeUnit.SECONDS.toMillis(10);

    public nd2(Context context, String str, bo boVar) {
        super(context, 0, str, boVar, null);
        Integer num;
        vw2 vw2Var;
        Integer num2;
        bu2 a = uw2.a().a(context);
        int intValue = (a == null || (num2 = a.y0) == null) ? w : num2.intValue();
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a2 = vw2Var2.a(context);
        this.o = new we0(1.0f, intValue, (a2 == null || (num = a2.M) == null) ? 0 : num.intValue());
        this.n = true;
        this.m = true;
    }

    @Override // yads.ro2
    public final xp2 a(u82 u82Var) {
        return new xp2(u82Var, b11.a(u82Var));
    }
}
