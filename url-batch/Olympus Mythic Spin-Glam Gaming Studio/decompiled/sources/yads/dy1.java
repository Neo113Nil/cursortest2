package yads;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class dy1 implements i53, Serializable {
    public final int b = dx.a(2, "expectedValuesPerKey");

    @Override // yads.i53
    public final Object get() {
        return new ArrayList(this.b);
    }
}
