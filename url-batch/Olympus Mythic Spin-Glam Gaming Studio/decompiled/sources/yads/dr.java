package yads;

import com.safedk.android.internal.partials.YandexFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class dr {
    public final br a;
    public final long b;
    public final int c;
    public v30 d;
    public long e;
    public File f;
    public OutputStream g;
    public long h;
    public long i;
    public kq2 j;

    public dr(br brVar) {
        brVar.getClass();
        this.a = brVar;
        this.b = 5242880L;
        this.c = 20480;
    }

    public final void a(v30 v30Var) {
        File file;
        long j = v30Var.g;
        long min = j == -1 ? -1L : Math.min(j - this.i, this.e);
        br brVar = this.a;
        String str = v30Var.h;
        int i = sb3.a;
        long j2 = v30Var.f + this.i;
        lz2 lz2Var = (lz2) brVar;
        synchronized (lz2Var) {
            try {
                lz2Var.a();
                zr zrVar = (zr) lz2Var.c.a.get(str);
                zrVar.getClass();
                if (!zrVar.c(j2, min)) {
                    throw new IllegalStateException();
                }
                if (!lz2Var.a.exists()) {
                    lz2.a(lz2Var.a);
                    lz2Var.c();
                }
                yd1 yd1Var = lz2Var.b;
                if (min != -1) {
                    yd1Var.a(lz2Var, min);
                } else {
                    yd1Var.getClass();
                }
                File file2 = new File(lz2Var.a, Integer.toString(lz2Var.f.nextInt(10)));
                if (!file2.exists()) {
                    lz2.a(file2);
                }
                long currentTimeMillis = System.currentTimeMillis();
                int i2 = zrVar.a;
                Pattern pattern = nz2.h;
                file = new File(file2, i2 + "." + j2 + "." + currentTimeMillis + ".v3.exo");
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f = file;
        FileOutputStream fileOutputStreamCtor = YandexFilesBridge.fileOutputStreamCtor(this.f);
        if (this.c > 0) {
            kq2 kq2Var = this.j;
            if (kq2Var == null) {
                this.j = new kq2(fileOutputStreamCtor, this.c);
            } else {
                kq2Var.a(fileOutputStreamCtor);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStreamCtor;
        }
        this.h = 0L;
    }

    public final void a() {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            sb3.a(this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            br brVar = this.a;
            long j = this.h;
            lz2 lz2Var = (lz2) brVar;
            synchronized (lz2Var) {
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    nz2 a = nz2.a(file, j, -9223372036854775807L, lz2Var.c);
                    a.getClass();
                    ds dsVar = lz2Var.c;
                    zr zrVar = (zr) dsVar.a.get(a.b);
                    zrVar.getClass();
                    if (zrVar.c(a.c, a.d)) {
                        long a2 = lz.a(zrVar.e);
                        if (a2 != -1 && a.c + a.d > a2) {
                            throw new IllegalStateException();
                        }
                        if (lz2Var.d != null) {
                            try {
                                lz2Var.d.a(file.getName(), a.d, a.g);
                            } catch (IOException e) {
                                throw new yq(e);
                            }
                        }
                        lz2Var.a(a);
                        try {
                            lz2Var.c.a();
                            lz2Var.notifyAll();
                            return;
                        } finally {
                            yq yqVar = new yq(e);
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Throwable th) {
            sb3.a(this.g);
            this.g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }
}
