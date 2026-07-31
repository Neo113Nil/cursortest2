package yads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class yh extends jn {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public yh(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // yads.q30
    public final long a(v30 v30Var) {
        try {
            Uri uri = v30Var.a;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            h();
            InputStream open = this.e.open(path, 1);
            this.g = open;
            if (open.skip(v30Var.f) < v30Var.f) {
                throw new xh(null, 2008);
            }
            long j = v30Var.g;
            if (j != -1) {
                this.h = j;
            } else {
                long available = this.g.available();
                this.h = available;
                if (available == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            b(v30Var);
            return this.h;
        } catch (xh e) {
            throw e;
        } catch (IOException e2) {
            throw new xh(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // yads.n30
    public final int c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new xh(e, 2000);
            }
        }
        InputStream inputStream = this.g;
        int i3 = sb3.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - read;
        }
        c(read);
        return read;
    }

    @Override // yads.q30
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new xh(e, 2000);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
                g();
            }
        }
    }

    @Override // yads.q30
    public final Uri d() {
        return this.f;
    }
}
