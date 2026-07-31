package sg.bigo.ads.k;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class w extends u {
    public w(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.k.u
    protected final boolean B() {
        return false;
    }

    @Override // sg.bigo.ads.k.u
    protected final int[] z() {
        int i;
        int i2;
        if (x() == 1) {
            i = 16777215;
            i2 = -1;
        } else {
            i = 2105636;
            i2 = -16777216;
        }
        return new int[]{i, i2};
    }
}
