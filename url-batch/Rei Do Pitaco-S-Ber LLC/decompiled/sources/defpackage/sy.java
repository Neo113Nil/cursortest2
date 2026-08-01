package defpackage;

import android.util.SparseArray;
import java.util.Set;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class sy {
    public SparseArray a;
    public int b;
    public Set c;

    public final ry a(int i) {
        SparseArray sparseArray = this.a;
        ry ryVar = (ry) sparseArray.get(i);
        if (ryVar != null) {
            return ryVar;
        }
        ry ryVar2 = new ry();
        sparseArray.put(i, ryVar2);
        return ryVar2;
    }
}
