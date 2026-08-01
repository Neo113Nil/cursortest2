package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class j10 implements Iterable, vo {
    public final /* synthetic */ we f;

    public j10(we weVar) {
        this.f = weVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ve(this.f);
    }
}
