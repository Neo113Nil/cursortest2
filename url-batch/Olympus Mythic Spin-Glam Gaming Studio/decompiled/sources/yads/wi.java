package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class wi extends yi {
    public final long b;
    public final ArrayList c;
    public final ArrayList d;

    public wi(int i, long j) {
        super(i);
        this.b = j;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final wi b(int i) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            wi wiVar = (wi) this.d.get(i2);
            if (wiVar.a == i) {
                return wiVar;
            }
        }
        return null;
    }

    public final xi c(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            xi xiVar = (xi) this.c.get(i2);
            if (xiVar.a == i) {
                return xiVar;
            }
        }
        return null;
    }

    @Override // yads.yi
    public final String toString() {
        return yi.a(this.a) + " leaves: " + Arrays.toString(this.c.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
    }
}
