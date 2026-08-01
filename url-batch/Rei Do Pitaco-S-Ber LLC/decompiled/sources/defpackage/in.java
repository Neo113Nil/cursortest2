package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class in extends k40 {
    public final /* synthetic */ mn e;
    public final /* synthetic */ int f;
    public final /* synthetic */ m8 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(String str, mn mnVar, int i, m8 m8Var, int i2, boolean z) {
        super(str, true);
        this.e = mnVar;
        this.f = i;
        this.g = m8Var;
        this.h = i2;
    }

    @Override // defpackage.k40
    public final long a() {
        try {
            tg tgVar = this.e.p;
            m8 m8Var = this.g;
            int i = this.h;
            tgVar.getClass();
            m8Var.skip(i);
            this.e.B.s(this.f, 9);
            synchronized (this.e) {
                this.e.D.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
