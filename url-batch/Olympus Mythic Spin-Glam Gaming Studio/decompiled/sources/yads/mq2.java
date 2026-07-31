package yads;

import java.io.Serializable;

/* loaded from: classes13.dex */
public final class mq2 extends gb2 implements Serializable {
    private static final long serialVersionUID = 0;
    public final gb2 b;

    public mq2(gb2 gb2Var) {
        this.b = gb2Var;
    }

    @Override // yads.gb2
    public final gb2 a() {
        return this.b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.b.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mq2) {
            return this.b.equals(((mq2) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return -this.b.hashCode();
    }

    public final String toString() {
        return this.b + ".reverse()";
    }
}
