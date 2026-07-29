package o;

/* loaded from: classes.dex */
public final class QA {
    public final Object a;
    public final AbstractC1596ny b;

    /* JADX WARN: Multi-variable type inference failed */
    public QA(Object obj, InterfaceC1455lp interfaceC1455lp) {
        this.a = obj;
        this.b = (AbstractC1596ny) interfaceC1455lp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && QA.class == obj.getClass() && this.a.equals(((QA) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
