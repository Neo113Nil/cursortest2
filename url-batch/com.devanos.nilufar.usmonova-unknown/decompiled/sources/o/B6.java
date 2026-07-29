package o;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class B6 extends ArrayList implements NW {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof AbstractC1701pX) {
            return super.contains((AbstractC1701pX) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof AbstractC1701pX) {
            return super.indexOf((AbstractC1701pX) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof AbstractC1701pX) {
            return super.lastIndexOf((AbstractC1701pX) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof AbstractC1701pX) {
            return super.remove((AbstractC1701pX) obj);
        }
        return false;
    }
}
