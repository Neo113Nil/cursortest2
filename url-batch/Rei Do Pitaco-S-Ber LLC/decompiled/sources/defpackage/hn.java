package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class hn implements dl {
    public final pn f;
    public final /* synthetic */ mn g;

    public hn(mn mnVar, pn pnVar) {
        this.g = mnVar;
        this.f = pnVar;
    }

    @Override // defpackage.dl
    public final Object a() {
        mn mnVar = this.g;
        pn pnVar = this.f;
        try {
        } catch (IOException e) {
            mnVar.m(2, 2, e);
        } catch (Throwable th) {
            mnVar.m(3, 3, null);
            z60.b(pnVar);
            throw th;
        }
        if (!pnVar.m(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (pnVar.m(false, this)) {
        }
        mnVar.m(1, 9, null);
        z60.b(pnVar);
        return tg.m;
    }
}
