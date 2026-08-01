package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class jn extends k40 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ mn f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn(String str, mn mnVar, int i, List list, boolean z) {
        super(str, true);
        this.f = mnVar;
        this.g = i;
    }

    @Override // defpackage.k40
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.p.getClass();
                try {
                    this.f.B.s(this.g, 9);
                    synchronized (this.f) {
                        this.f.D.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
            default:
                this.f.p.getClass();
                try {
                    this.f.B.s(this.g, 9);
                    synchronized (this.f) {
                        this.f.D.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused2) {
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn(String str, mn mnVar, int i, List list) {
        super(str, true);
        this.f = mnVar;
        this.g = i;
    }
}
