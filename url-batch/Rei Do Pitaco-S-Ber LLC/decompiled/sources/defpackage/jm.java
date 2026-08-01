package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class jm extends zo implements dl {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jm(int i, Object obj) {
        super(0);
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.dl
    public final Object a() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return (List) obj;
            case 1:
                try {
                    return (List) ((dl) obj).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return uh.f;
                }
            default:
                return oo.t((t80) obj);
        }
    }
}
