package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c43 implements q30 {
    public final q30 a;
    public long b;
    public Uri c;

    public c43(q30 q30Var) {
        q30Var.getClass();
        this.a = q30Var;
        this.c = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // yads.q30
    public final long a(v30 v30Var) {
        this.c = v30Var.a;
        Collections.emptyMap();
        long a = this.a.a(v30Var);
        Uri d = this.a.d();
        d.getClass();
        this.c = d;
        this.a.b();
        return a;
    }

    @Override // yads.q30
    public final Map b() {
        return this.a.b();
    }

    @Override // yads.n30
    public final int c(byte[] bArr, int i, int i2) {
        int c = this.a.c(bArr, i, i2);
        if (c != -1) {
            this.b += c;
        }
        return c;
    }

    @Override // yads.q30
    public final void close() {
        this.a.close();
    }

    @Override // yads.q30
    public final Uri d() {
        return this.a.d();
    }

    @Override // yads.q30
    public final void a(h93 h93Var) {
        h93Var.getClass();
        this.a.a(h93Var);
    }
}
