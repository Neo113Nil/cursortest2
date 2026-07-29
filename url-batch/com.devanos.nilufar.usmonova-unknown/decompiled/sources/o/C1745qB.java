package o;

import java.util.LinkedHashMap;

/* renamed from: o.qB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1745qB {
    public final LinkedHashMap a;

    public C1745qB(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }
}
