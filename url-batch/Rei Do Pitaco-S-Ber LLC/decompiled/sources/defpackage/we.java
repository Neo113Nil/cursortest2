package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class we implements h10 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ we(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.h10
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ve(this);
            default:
                return new em(this);
        }
    }
}
