package J;

import i1.f;
import q.C0329b;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f590a;

    /* renamed from: b, reason: collision with root package name */
    public int f591b;

    public b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f590a = new Object[i];
    }

    public Object a() {
        int i = this.f591b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f590a;
        Object obj = objArr[i2];
        f.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.f591b--;
        return obj;
    }

    public void b(C0329b c0329b) {
        int i = this.f591b;
        Object[] objArr = this.f590a;
        if (i < objArr.length) {
            objArr[i] = c0329b;
            this.f591b = i + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z2;
        f.e(obj, "instance");
        int i = this.f591b;
        int i2 = 0;
        while (true) {
            objArr = this.f590a;
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
        int i3 = this.f591b;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f591b = i3 + 1;
        return true;
    }

    public b() {
        this.f590a = new Object[256];
    }
}
