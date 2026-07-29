package o;

import java.util.ArrayList;

/* renamed from: o.oD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1615oD extends LY {
    public final ArrayList a;

    public C1615oD(ArrayList arrayList) {
        this.a = arrayList;
        if (EB.V(arrayList).size() != arrayList.size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.a + ')';
    }
}
