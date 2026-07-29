package o;

/* renamed from: o.Sp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0485Sp extends AbstractC2336z9 implements InterfaceC0200Hp, InterfaceC1396kw {
    public final int h;
    public final int i;

    public AbstractC0485Sp(int i) {
        this(i, AbstractC2336z9.NO_RECEIVER, null, null, null, 0);
    }

    @Override // o.AbstractC2336z9
    public final InterfaceC0387Ov computeReflected() {
        return UM.a.a(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0485Sp) {
            AbstractC0485Sp abstractC0485Sp = (AbstractC0485Sp) obj;
            return getName().equals(abstractC0485Sp.getName()) && getSignature().equals(abstractC0485Sp.getSignature()) && this.i == abstractC0485Sp.i && this.h == abstractC0485Sp.h && AbstractC0048Bt.h(getBoundReceiver(), abstractC0485Sp.getBoundReceiver()) && AbstractC0048Bt.h(getOwner(), abstractC0485Sp.getOwner());
        }
        if (obj instanceof InterfaceC1396kw) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // o.InterfaceC0200Hp
    public final int getArity() {
        return this.h;
    }

    @Override // o.AbstractC2336z9
    public final InterfaceC0387Ov getReflected() {
        InterfaceC0387Ov compute = compute();
        if (compute != this) {
            return (InterfaceC1396kw) compute;
        }
        throw new C0526Ue();
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // o.AbstractC2336z9, o.InterfaceC0387Ov, o.InterfaceC1396kw
    public final boolean isSuspend() {
        InterfaceC0387Ov compute = compute();
        if (compute != this) {
            return ((InterfaceC1396kw) compute).isSuspend();
        }
        throw new C0526Ue();
    }

    public final String toString() {
        InterfaceC0387Ov compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC0485Sp(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public AbstractC0485Sp(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.h = i;
        this.i = 0;
    }
}
