package defpackage;

import java.util.RandomAccess;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class xv extends l implements RandomAccess {
    public final r8[] f;
    public final int[] g;

    public xv(r8[] r8VarArr, int[] iArr) {
        this.f = r8VarArr;
        this.g = iArr;
    }

    @Override // defpackage.l
    public final int a() {
        return this.f.length;
    }

    @Override // defpackage.l, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof r8) {
            return super.contains((r8) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f[i];
    }

    @Override // defpackage.l, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof r8) {
            return super.indexOf((r8) obj);
        }
        return -1;
    }

    @Override // defpackage.l, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof r8) {
            return super.lastIndexOf((r8) obj);
        }
        return -1;
    }
}
