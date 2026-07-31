package yads;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes6.dex */
public final class n41 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] b;
    public final Object[] c;

    public n41(o41 o41Var) {
        int i = ((zm2) o41Var).g;
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        wa3 it = o41Var.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i2] = entry.getKey();
            objArr2[i2] = entry.getValue();
            i2++;
        }
        this.b = objArr;
        this.c = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.b;
        int i = 0;
        if (objArr instanceof q41) {
            q41 q41Var = (q41) objArr;
            f41 f41Var = (f41) this.c;
            Object[] objArr2 = new Object[q41Var.size() * 2];
            wa3 it = q41Var.iterator();
            wa3 it2 = f41Var.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Object next2 = it2.next();
                int i2 = i + 1;
                int i3 = i2 * 2;
                if (i3 > objArr2.length) {
                    objArr2 = Arrays.copyOf(objArr2, e41.a(objArr2.length, i3));
                }
                dx.a(next, next2);
                int i4 = i * 2;
                objArr2[i4] = next;
                objArr2[i4 + 1] = next2;
                i = i2;
            }
            return zm2.a(i, objArr2);
        }
        Object[] objArr3 = this.c;
        Object[] objArr4 = new Object[objArr.length * 2];
        int i5 = 0;
        while (i < objArr.length) {
            Object[] objArr5 = objArr[i];
            Object obj = objArr3[i];
            int i6 = i5 + 1;
            int i7 = i6 * 2;
            if (i7 > objArr4.length) {
                objArr4 = Arrays.copyOf(objArr4, e41.a(objArr4.length, i7));
            }
            dx.a(objArr5, obj);
            int i8 = i5 * 2;
            objArr4[i8] = objArr5;
            objArr4[i8 + 1] = obj;
            i++;
            i5 = i6;
            objArr4 = objArr4;
        }
        return zm2.a(i5, objArr4);
    }
}
