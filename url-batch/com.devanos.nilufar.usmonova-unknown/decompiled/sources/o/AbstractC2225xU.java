package o;

/* renamed from: o.xU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2225xU extends AbstractC2367ze implements InterfaceC0200Hp {
    private final int arity;

    public AbstractC2225xU(int i, InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        this.arity = i;
    }

    @Override // o.InterfaceC0200Hp
    public int getArity() {
        return this.arity;
    }

    @Override // o.Y7
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String h = UM.a.h(this);
        AbstractC0048Bt.m(h, "renderLambdaToString(...)");
        return h;
    }
}
