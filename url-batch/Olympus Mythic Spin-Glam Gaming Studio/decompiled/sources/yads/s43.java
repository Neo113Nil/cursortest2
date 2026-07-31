package yads;

import java.io.UnsupportedEncodingException;

/* loaded from: classes5.dex */
public final class s43 extends ro2 {
    public final Object s;
    public wp2 t;

    public s43(String str, wp2 wp2Var, vp2 vp2Var) {
        super(0, str, vp2Var);
        this.s = new Object();
        this.t = wp2Var;
    }

    @Override // yads.ro2
    public final void a(Object obj) {
        wp2 wp2Var;
        String str = (String) obj;
        synchronized (this.s) {
            wp2Var = this.t;
        }
        if (wp2Var != null) {
            wp2Var.a(str);
        }
    }

    @Override // yads.ro2
    public final void a() {
        super.a();
        synchronized (this.s) {
            this.t = null;
        }
    }

    @Override // yads.ro2
    public final xp2 a(u82 u82Var) {
        String str;
        try {
            str = new String(u82Var.b, b11.a(u82Var.c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(u82Var.b);
        }
        return new xp2(str, b11.a(u82Var));
    }
}
