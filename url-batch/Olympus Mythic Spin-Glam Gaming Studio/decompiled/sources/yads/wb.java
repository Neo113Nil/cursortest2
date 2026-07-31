package yads;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class wb implements s01 {
    public final db2 a;
    public final fc b;
    public final List c;
    public xb d;

    public wb(db2 db2Var) {
        fc fcVar = new fc();
        this.a = db2Var;
        this.b = fcVar;
        this.c = CollectionsKt.listOf(new hc("noInterestAd", new vb(this)));
    }

    public final void a(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            for (hc hcVar : this.c) {
                if (hcVar.a(scheme, host)) {
                    hcVar.a();
                    return;
                }
            }
        } catch (URISyntaxException unused) {
            boolean z = ob1.a;
        }
    }

    @Override // yads.s01
    public final void a(int i) {
        for (int i2 : this.b.a) {
            if (i == i2) {
                xb xbVar = this.d;
                if (xbVar != null) {
                    vg0.a(((rb) xbVar).a.a);
                    return;
                }
                return;
            }
        }
    }
}
