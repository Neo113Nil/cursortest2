package yads;

/* loaded from: classes6.dex */
public final class qf1 {
    public final Object a;
    public yu0 b = new yu0();
    public boolean c;
    public boolean d;

    public qf1(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qf1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((qf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
