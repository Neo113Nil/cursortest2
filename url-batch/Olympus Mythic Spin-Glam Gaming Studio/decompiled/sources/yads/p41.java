package yads;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class p41 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] b;

    public p41(Object[] objArr) {
        this.b = objArr;
    }

    public Object readResolve() {
        Object[] objArr = this.b;
        int length = objArr.length;
        return length != 0 ? length != 1 ? q41.b(objArr.length, (Object[]) objArr.clone()) : new i03(objArr[0]) : an2.j;
    }
}
