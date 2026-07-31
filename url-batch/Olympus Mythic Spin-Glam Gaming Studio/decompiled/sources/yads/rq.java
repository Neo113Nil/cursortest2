package yads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class rq {
    public final yp0 a;
    public tp0 b;
    public pd0 c;

    public rq(yp0 yp0Var) {
        this.a = yp0Var;
    }

    public final void a(q30 q30Var, Uri uri, Map map, long j, long j2, ik2 ik2Var) {
        pd0 pd0Var = new pd0(q30Var, j, j2);
        this.c = pd0Var;
        if (this.b != null) {
            return;
        }
        tp0[] a = this.a.a(uri, map);
        if (a.length == 1) {
            this.b = a[0];
        } else {
            int length = a.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                tp0 tp0Var = a[i];
                try {
                } catch (EOFException unused) {
                    if (this.b != null) {
                        continue;
                    } else if (pd0Var.d != j) {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    if (this.b == null && pd0Var.d != j) {
                        throw new IllegalStateException();
                    }
                    pd0Var.f = 0;
                    throw th;
                }
                if (tp0Var.a(pd0Var)) {
                    this.b = tp0Var;
                    pd0Var.f = 0;
                    break;
                } else {
                    if (this.b == null && pd0Var.d != j) {
                        throw new IllegalStateException();
                    }
                    pd0Var.f = 0;
                    i++;
                }
            }
            if (this.b == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                int i2 = sb3.a;
                StringBuilder sb2 = new StringBuilder();
                for (int i3 = 0; i3 < a.length; i3++) {
                    sb2.append(a[i3].getClass().getSimpleName());
                    if (i3 < a.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String sb3 = sb.toString();
                uri.getClass();
                throw new xa3(sb3);
            }
        }
        this.b.a(ik2Var);
    }
}
