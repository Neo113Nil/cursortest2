package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class f51 {
    public final g51 a;
    public final Handler b;
    public final rl3 c;
    public final db1 d;

    public f51(z12 z12Var, ArrayList arrayList) {
        int i;
        Integer num;
        g51 g51Var = new g51();
        Handler handler = new Handler(Looper.getMainLooper());
        rl3 rl3Var = new rl3();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Integer valueOf = Integer.valueOf(((ez2) it.next()).c);
                while (it.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(((ez2) it.next()).c);
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
                num = valueOf;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
                db1 db1Var = new db1(z12Var, i);
                this.a = g51Var;
                this.b = handler;
                this.c = rl3Var;
                this.d = db1Var;
            }
        }
        i = 50;
        db1 db1Var2 = new db1(z12Var, i);
        this.a = g51Var;
        this.b = handler;
        this.c = rl3Var;
        this.d = db1Var2;
    }
}
