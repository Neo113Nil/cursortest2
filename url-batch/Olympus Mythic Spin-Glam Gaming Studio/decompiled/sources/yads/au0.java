package yads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes15.dex */
public final class au0 extends jn {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    public au0() {
        super(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r2 != false) goto L39;
     */
    @Override // yads.q30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(v30 v30Var) {
        boolean a;
        Uri uri = v30Var.a;
        this.f = uri;
        h();
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(v30Var.f);
                long j = v30Var.g;
                if (j == -1) {
                    j = this.e.length() - v30Var.f;
                }
                this.g = j;
                if (j < 0) {
                    throw new zt0(null, null, 2008);
                }
                this.h = true;
                b(v30Var);
                return this.g;
            } catch (IOException e) {
                throw new zt0(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (sb3.a >= 21) {
                    a = xt0.a(e2.getCause());
                }
                i = 2005;
                throw new zt0(e2, i);
            }
            throw new zt0("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e2, 1004);
        } catch (SecurityException e3) {
            throw new zt0(e3, 2006);
        } catch (RuntimeException e4) {
            throw new zt0(e4, 2000);
        }
    }

    @Override // yads.n30
    public final int c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            int i3 = sb3.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.g -= read;
                c(read);
            }
            return read;
        } catch (IOException e) {
            throw new zt0(e, 2000);
        }
    }

    @Override // yads.q30
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new zt0(e, 2000);
            }
        } finally {
            this.e = null;
            if (this.h) {
                this.h = false;
                g();
            }
        }
    }

    @Override // yads.q30
    public final Uri d() {
        return this.f;
    }
}
