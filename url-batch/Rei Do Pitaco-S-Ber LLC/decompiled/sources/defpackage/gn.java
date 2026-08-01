package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class gn extends k40 {
    public final /* synthetic */ int e;
    public final /* synthetic */ mn f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gn(String str, mn mnVar, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.f = mnVar;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.k40
    public final long a() {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                mn mnVar = this.f;
                try {
                    mnVar.B.r(this.g, this.h, true);
                } catch (IOException e) {
                    mnVar.m(2, 2, e);
                }
                return -1L;
            case 1:
                tg tgVar = this.f.p;
                int i3 = this.h;
                tgVar.getClass();
                if (i3 == 0) {
                    throw null;
                }
                synchronized (this.f) {
                    this.f.D.remove(Integer.valueOf(this.g));
                }
                return -1L;
            default:
                mn mnVar2 = this.f;
                try {
                    i = this.g;
                    i2 = this.h;
                } catch (IOException e2) {
                    mnVar2.m(2, 2, e2);
                }
                if (i2 == 0) {
                    throw null;
                }
                mnVar2.B.s(i, i2);
                return -1L;
        }
    }
}
