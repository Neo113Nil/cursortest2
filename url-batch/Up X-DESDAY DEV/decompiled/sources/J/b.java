package J;

import X0.e;
import q.C0288b;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f352a;

    /* renamed from: b, reason: collision with root package name */
    public int f353b;

    public b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f352a = new Object[i];
    }

    public Object a() {
        int i = this.f353b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f352a;
        Object obj = objArr[i2];
        e.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.f353b--;
        return obj;
    }

    public void b(C0288b c0288b) {
        int i = this.f353b;
        Object[] objArr = this.f352a;
        if (i < objArr.length) {
            objArr[i] = c0288b;
            this.f353b = i + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z2;
        e.e(obj, "instance");
        int i = this.f353b;
        int i2 = 0;
        while (true) {
            objArr = this.f352a;
            if (i2 >= i) {
                z2 = false;
                break;
            }
            if (objArr[i2] == obj) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.f353b;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f353b = i3 + 1;
        return true;
    }

    public b() {
        this.f352a = new Object[256];
    }
}
