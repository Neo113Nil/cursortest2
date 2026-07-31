package yads;

import com.ironsource.X3;
import java.io.File;

/* loaded from: classes3.dex */
public abstract class mr implements Comparable {
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final File f;
    public final long g;

    public mr(String str, long j, long j2, long j3, File file) {
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = file != null;
        this.f = file;
        this.g = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        mr mrVar = (mr) obj;
        if (!this.b.equals(mrVar.b)) {
            return this.b.compareTo(mrVar.b);
        }
        long j = this.c - mrVar.c;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        return X3.j.d + this.c + ", " + this.d + X3.j.e;
    }
}
