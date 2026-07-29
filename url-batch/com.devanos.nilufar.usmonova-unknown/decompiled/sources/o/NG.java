package o;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class NG extends B implements RandomAccess {
    public final C1347k9[] h;
    public final int[] i;

    public NG(C1347k9[] c1347k9Arr, int[] iArr) {
        this.h = c1347k9Arr;
        this.i = iArr;
    }

    @Override // o.r, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C1347k9) {
            return super.contains((C1347k9) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.h[i];
    }

    @Override // o.B, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C1347k9) {
            return super.indexOf((C1347k9) obj);
        }
        return -1;
    }

    @Override // o.r
    public final int j() {
        return this.h.length;
    }

    @Override // o.B, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C1347k9) {
            return super.lastIndexOf((C1347k9) obj);
        }
        return -1;
    }
}
