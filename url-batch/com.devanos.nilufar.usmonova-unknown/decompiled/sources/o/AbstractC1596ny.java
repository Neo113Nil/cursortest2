package o;

import java.io.Serializable;

/* renamed from: o.ny, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1596ny implements InterfaceC0200Hp, Serializable {
    private final int arity;

    public AbstractC1596ny(int i) {
        this.arity = i;
    }

    @Override // o.InterfaceC0200Hp
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String i = UM.a.i(this);
        AbstractC0048Bt.m(i, "renderLambdaToString(...)");
        return i;
    }
}
