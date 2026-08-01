package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ln extends k40 {
    public final /* synthetic */ mn e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln(String str, mn mnVar, int i, long j) {
        super(str, true);
        this.e = mnVar;
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.k40
    public final long a() {
        mn mnVar = this.e;
        try {
            mnVar.B.t(this.f, this.g);
            return -1L;
        } catch (IOException e) {
            mnVar.m(2, 2, e);
            return -1L;
        }
    }
}
