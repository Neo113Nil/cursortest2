package o;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class GN extends JN {
    public final /* synthetic */ int a;
    public final /* synthetic */ NB b;
    public final /* synthetic */ Object c;

    public /* synthetic */ GN(NB nb, Object obj, int i) {
        this.a = i;
        this.b = nb;
        this.c = obj;
    }

    @Override // o.JN
    public final long contentLength() {
        switch (this.a) {
            case 0:
                return ((File) this.c).length();
            default:
                return ((C1347k9) this.c).b();
        }
    }

    @Override // o.JN
    public final NB contentType() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // o.JN
    public final void writeTo(M8 m8) {
        int i = this.a;
        Object obj = this.c;
        AbstractC0048Bt.n(m8, "sink");
        switch (i) {
            case 0:
                File file = (File) obj;
                Logger logger = OF.a;
                AbstractC0048Bt.n(file, "<this>");
                W6 w6 = new W6(new FileInputStream(file), 1, NV.d);
                try {
                    m8.E(w6);
                    w6.close();
                    return;
                } finally {
                }
            default:
                m8.r((C1347k9) obj);
                return;
        }
    }
}
