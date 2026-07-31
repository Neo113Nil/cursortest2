package yads;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ub0 {
    public int a;
    public int b;
    public int c = 0;
    public id[] d = new id[100];

    public final synchronized void a(int i) {
        boolean z = i < this.a;
        this.a = i;
        if (z) {
            b();
        }
    }

    public final synchronized void b() {
        int i = this.a;
        int i2 = sb3.a;
        int max = Math.max(0, ((i + 65535) / 65536) - this.b);
        int i3 = this.c;
        if (max >= i3) {
            return;
        }
        Arrays.fill(this.d, max, i3, (Object) null);
        this.c = max;
    }

    public final synchronized id a() {
        id idVar;
        try {
            int i = this.b + 1;
            this.b = i;
            int i2 = this.c;
            if (i2 > 0) {
                id[] idVarArr = this.d;
                int i3 = i2 - 1;
                this.c = i3;
                idVar = idVarArr[i3];
                idVar.getClass();
                this.d[this.c] = null;
            } else {
                id idVar2 = new id(new byte[65536], 0);
                id[] idVarArr2 = this.d;
                if (i > idVarArr2.length) {
                    this.d = (id[]) Arrays.copyOf(idVarArr2, idVarArr2.length * 2);
                }
                idVar = idVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return idVar;
    }
}
