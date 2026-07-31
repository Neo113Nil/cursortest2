package yads;

/* loaded from: classes4.dex */
public final class vq extends ro2 {
    public final hv0 s;

    public vq(String str, hv0 hv0Var, iv0 iv0Var) {
        super(0, str, iv0Var);
        this.s = hv0Var;
    }

    @Override // yads.ro2
    public final void a(Object obj) {
        this.s.a((byte[]) obj);
    }

    @Override // yads.ro2
    public final xp2 a(u82 u82Var) {
        try {
            return new xp2(u82Var.b, b11.a(u82Var));
        } catch (Exception e) {
            return new xp2(new hm3((Throwable) e));
        }
    }
}
