package yads;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* loaded from: classes6.dex */
public final class e63 implements q30 {
    public final q30 a;
    public final dr b;
    public boolean c;
    public long d;

    public e63(q30 q30Var, dr drVar) {
        q30Var.getClass();
        this.a = q30Var;
        drVar.getClass();
        this.b = drVar;
    }

    @Override // yads.q30
    public final long a(v30 v30Var) {
        long a = this.a.a(v30Var);
        this.d = a;
        if (a == 0) {
            return 0L;
        }
        if (v30Var.g == -1 && a != -1) {
            v30Var = v30Var.a(0L, a);
        }
        this.c = true;
        dr drVar = this.b;
        drVar.getClass();
        v30Var.h.getClass();
        if (v30Var.g == -1 && (v30Var.i & 2) == 2) {
            drVar.d = null;
        } else {
            drVar.d = v30Var;
            drVar.e = (v30Var.i & 4) == 4 ? drVar.b : Long.MAX_VALUE;
            drVar.i = 0L;
            try {
                drVar.a(v30Var);
            } catch (IOException e) {
                throw new cr(e);
            }
        }
        return this.d;
    }

    @Override // yads.q30
    public final Map b() {
        return this.a.b();
    }

    @Override // yads.n30
    public final int c(byte[] bArr, int i, int i2) {
        if (this.d == 0) {
            return -1;
        }
        int c = this.a.c(bArr, i, i2);
        if (c > 0) {
            dr drVar = this.b;
            v30 v30Var = drVar.d;
            if (v30Var != null) {
                int i3 = 0;
                while (i3 < c) {
                    try {
                        if (drVar.h == drVar.e) {
                            drVar.a();
                            drVar.a(v30Var);
                        }
                        int min = (int) Math.min(c - i3, drVar.e - drVar.h);
                        OutputStream outputStream = drVar.g;
                        int i4 = sb3.a;
                        outputStream.write(bArr, i + i3, min);
                        i3 += min;
                        long j = min;
                        drVar.h += j;
                        drVar.i += j;
                    } catch (IOException e) {
                        throw new cr(e);
                    }
                }
            }
            long j2 = this.d;
            if (j2 != -1) {
                this.d = j2 - c;
            }
        }
        return c;
    }

    @Override // yads.q30
    public final void close() {
        try {
            this.a.close();
            if (this.c) {
                this.c = false;
                dr drVar = this.b;
                if (drVar.d == null) {
                    return;
                }
                try {
                    drVar.a();
                } catch (IOException e) {
                    throw new cr(e);
                }
            }
        } catch (Throwable th) {
            if (this.c) {
                this.c = false;
                dr drVar2 = this.b;
                if (drVar2.d != null) {
                    try {
                        drVar2.a();
                    } catch (IOException e2) {
                        throw new cr(e2);
                    }
                }
            }
            throw th;
        }
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
