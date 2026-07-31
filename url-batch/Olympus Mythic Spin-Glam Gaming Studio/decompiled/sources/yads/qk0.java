package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class qk0 extends ro2 {
    public static final Object v = new Object();
    public final pk0 s;
    public final nk0 t;
    public final p31 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk0(String str, Context context, nk0 nk0Var, vp2 vp2Var) {
        super(0, str, vp2Var);
        pk0 pk0Var = new pk0(context.getApplicationContext());
        this.s = pk0Var;
        this.t = nk0Var;
        this.u = new p31();
        this.o = new we0(2.0f, 1000, 2);
        this.j = false;
    }

    @Override // yads.ro2
    public final void a(Object obj) {
        this.t.invoke((rk0) obj);
    }

    @Override // yads.ro2
    public final xp2 a(u82 u82Var) {
        xp2 xp2Var;
        synchronized (v) {
            try {
                p31 p31Var = this.u;
                byte[] bArr = u82Var.b;
                p31Var.getClass();
                xp2Var = new xp2(new rk0(this.s.a(u82Var.b), p31.a(bArr)), b11.a(u82Var));
            } catch (Exception e) {
                xp2Var = new xp2(new ac2(e));
            } catch (OutOfMemoryError e2) {
                int length = u82Var.b.length;
                boolean z = lm3.a;
                boolean z2 = ob1.a;
                xp2Var = new xp2(new ac2(e2));
            }
        }
        return xp2Var;
    }
}
