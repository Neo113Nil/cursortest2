package yads;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class j41 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] b;

    public j41(Object[] objArr) {
        this.b = objArr;
    }

    public Object readResolve() {
        return l41.b(this.b);
    }
}
