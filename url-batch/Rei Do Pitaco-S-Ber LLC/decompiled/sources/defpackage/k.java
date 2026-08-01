package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class k extends l implements RandomAccess {
    public final l f;
    public final int g;
    public final int h;

    public k(l lVar, int i, int i2) {
        this.f = lVar;
        this.g = i;
        m60.j(i, i2, lVar.a());
        this.h = i2 - i;
    }

    @Override // defpackage.l
    public final int a() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.h;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(n20.d(i, i2, "index: ", ", size: "));
        }
        return this.f.get(this.g + i);
    }

    @Override // defpackage.l, java.util.List
    public final List subList(int i, int i2) {
        m60.j(i, i2, this.h);
        int i3 = this.g;
        return new k(this.f, i + i3, i3 + i2);
    }
}
