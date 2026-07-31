package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes12.dex */
public final class ec2 implements cg1 {
    public final long a;
    public final v30 b;
    public final int c;
    public final c43 d;
    public final dc2 e;
    public volatile Object f;

    public ec2(q30 q30Var, Uri uri, int i, dc2 dc2Var) {
        Map emptyMap = Collections.emptyMap();
        oh.a(uri, "The uri must be set.");
        v30 v30Var = new v30(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        this.d = new c43(q30Var);
        this.b = v30Var;
        this.c = i;
        this.e = dc2Var;
        this.a = wf1.a.getAndIncrement();
    }

    @Override // yads.cg1
    public final void a() {
        this.d.b = 0L;
        s30 s30Var = new s30(this.d, this.b);
        try {
            s30Var.a.a(s30Var.b);
            s30Var.d = true;
            Uri d = this.d.a.d();
            d.getClass();
            this.f = this.e.a(d, s30Var);
        } finally {
            sb3.a(s30Var);
        }
    }

    @Override // yads.cg1
    public final void b() {
    }
}
