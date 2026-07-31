package yads;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public abstract class th3 {
    public static volatile zj0 a;
    public static final Object b = new Object();

    public static zj0 a(Context context) {
        so0 so0Var;
        Context applicationContext = context.getApplicationContext();
        t33 t33Var = new t33(applicationContext);
        so0 so0Var2 = so0.d;
        if (so0Var2 == null) {
            synchronized (so0.c) {
                so0Var = so0.d;
                if (so0Var == null) {
                    so0Var = new so0();
                    so0.d = so0Var;
                }
            }
            so0Var2 = so0Var;
        }
        br a2 = so0Var2.a(applicationContext);
        ed0 ed0Var = new ed0(applicationContext, new zu2(new w53().a(), new ps2().a(applicationContext)));
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(4);
        hd0 hd0Var = new hd0(t33Var);
        er erVar = new er();
        erVar.a = a2;
        erVar.c = ed0Var;
        return new zj0(applicationContext, hd0Var, new id0(erVar, newFixedThreadPool));
    }

    public static zj0 b(Context context) {
        zj0 zj0Var;
        zj0 zj0Var2 = a;
        if (zj0Var2 != null) {
            return zj0Var2;
        }
        synchronized (b) {
            zj0 zj0Var3 = a;
            if (zj0Var3 != null) {
                return zj0Var3;
            }
            try {
                zj0Var = a(context);
                a = zj0Var;
            } catch (Throwable th) {
                th.toString();
                boolean z = ob1.a;
                zj0Var = null;
            }
            return zj0Var;
        }
    }
}
