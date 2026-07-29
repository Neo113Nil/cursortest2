package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.kQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1364kQ implements InterfaceC0699aH {
    public final int b;
    public final List c;

    public C1364kQ(int i, ArrayList arrayList) {
        this.b = i;
        this.c = arrayList;
    }

    @Override // o.InterfaceC0699aH
    public final boolean j() {
        return this.c.contains(this);
    }
}
