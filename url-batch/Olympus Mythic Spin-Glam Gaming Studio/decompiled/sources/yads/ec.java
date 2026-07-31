package yads;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class ec implements s01 {
    public final tb a;
    public final hb b;
    public final fc c;
    public final List d;
    public gc e;

    public ec(tb tbVar, hb hbVar) {
        fc fcVar = new fc();
        this.a = tbVar;
        this.b = hbVar;
        this.c = fcVar;
        this.d = CollectionsKt.listOf((Object[]) new hc[]{new hc("adtuneRendered", new dc(this)), new hc("adtuneClosed", new bc(this)), new hc("openOptOut", new cc(this))});
    }

    public final void a(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            for (hc hcVar : this.d) {
                if (hcVar.a(scheme, host)) {
                    hcVar.a();
                    return;
                }
            }
            gc gcVar = this.e;
            if (gcVar != null) {
                ((lb) gcVar).a.d.a(str);
            }
        } catch (URISyntaxException unused) {
            boolean z = ob1.a;
            a(false);
        }
    }

    @Override // yads.s01
    public final void a(int i) {
        for (int i2 : this.c.a) {
            if (i == i2) {
                a(false);
                return;
            }
        }
    }

    public final void a(boolean z) {
        gc gcVar = this.e;
        if (gcVar != null) {
            lb lbVar = (lb) gcVar;
            if (z) {
                lbVar.a.c.a();
            }
            vg0.a(lbVar.a.a);
        }
    }
}
