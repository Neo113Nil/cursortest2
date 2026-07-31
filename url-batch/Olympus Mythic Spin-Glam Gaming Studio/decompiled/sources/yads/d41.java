package yads;

import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class d41 extends e41 {
    public Object[] a;
    public int b;
    public boolean c;

    public d41() {
        dx.a(4, "initialCapacity");
        this.a = new Object[4];
        this.b = 0;
    }

    public final void a(int i) {
        Object[] objArr = this.a;
        if (objArr.length < i) {
            this.a = Arrays.copyOf(objArr, e41.a(objArr.length, i));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }
}
