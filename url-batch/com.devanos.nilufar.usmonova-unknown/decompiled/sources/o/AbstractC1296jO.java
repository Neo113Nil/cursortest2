package o;

/* renamed from: o.jO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1296jO extends AbstractC1232iO implements InterfaceC0200Hp {
    public final int h;

    public AbstractC1296jO(InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        this.h = 2;
    }

    @Override // o.InterfaceC0200Hp
    public final int getArity() {
        return this.h;
    }

    @Override // o.Y7
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String h = UM.a.h(this);
        AbstractC0048Bt.m(h, "renderLambdaToString(...)");
        return h;
    }
}
