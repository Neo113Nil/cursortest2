package o;

/* loaded from: classes.dex */
public abstract class VJ extends AbstractC2336z9 implements InterfaceC0937dx {
    private final boolean syntheticJavaProperty;

    public VJ(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // o.AbstractC2336z9
    public InterfaceC0387Ov compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VJ) {
            VJ vj = (VJ) obj;
            return getOwner().equals(vj.getOwner()) && getName().equals(vj.getName()) && getSignature().equals(vj.getSignature()) && AbstractC0048Bt.h(getBoundReceiver(), vj.getBoundReceiver());
        }
        if (obj instanceof InterfaceC0937dx) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // o.InterfaceC0937dx
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // o.InterfaceC0937dx
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC0387Ov compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // o.AbstractC2336z9
    public InterfaceC0937dx getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC0387Ov compute = compute();
        if (compute != this) {
            return (InterfaceC0937dx) compute;
        }
        throw new C0526Ue();
    }
}
