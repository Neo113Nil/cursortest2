package yads;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes6.dex */
public final class lw3 implements sv3 {
    public static lw3 e;
    public float a = 0.0f;
    public final dv3 b;
    public xv3 c;
    public qv3 d;

    public lw3(cw3 cw3Var, dv3 dv3Var) {
        this.b = dv3Var;
    }

    @Override // yads.sv3
    public final void a(boolean z) {
        if (!z) {
            m93.g.getClass();
            Handler handler = m93.i;
            if (handler != null) {
                handler.removeCallbacks(m93.k);
                m93.i = null;
                return;
            }
            return;
        }
        m93.g.getClass();
        if (m93.i == null) {
            Handler handler2 = new Handler(Looper.getMainLooper());
            m93.i = handler2;
            handler2.post(m93.j);
            m93.i.postDelayed(m93.k, 200L);
        }
    }

    public static lw3 a() {
        if (e == null) {
            e = new lw3(new cw3(), new dv3());
        }
        return e;
    }
}
