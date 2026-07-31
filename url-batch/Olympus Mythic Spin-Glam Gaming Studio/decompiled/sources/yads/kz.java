package yads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class kz extends jn {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public kz(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // yads.q30
    public final long a(v30 v30Var) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = v30Var.a;
            this.f = uri;
            h();
            if ("content".equals(v30Var.a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.e.openAssetFileDescriptor(uri, "r");
            }
            this.g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new jz(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.h = fileInputStream;
            if (length != -1 && v30Var.f > length) {
                throw new jz(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(v30Var.f + startOffset) - startOffset;
            if (skip != v30Var.f) {
                throw new jz(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.i = -1L;
                } else {
                    long position = size - channel.position();
                    this.i = position;
                    if (position < 0) {
                        throw new jz(null, 2008);
                    }
                }
            } else {
                long j = length - skip;
                this.i = j;
                if (j < 0) {
                    throw new jz(null, 2008);
                }
            }
            long j2 = v30Var.g;
            if (j2 != -1) {
                long j3 = this.i;
                if (j3 != -1) {
                    j2 = Math.min(j3, j2);
                }
                this.i = j2;
            }
            this.j = true;
            b(v30Var);
            long j4 = v30Var.g;
            return j4 != -1 ? j4 : this.i;
        } catch (jz e) {
            throw e;
        } catch (IOException e2) {
            throw new jz(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // yads.n30
    public final int c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new jz(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.h;
        int i3 = sb3.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - read;
        }
        c(read);
        return read;
    }

    @Override // yads.q30
    public final void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new jz(e, 2000);
                    }
                } finally {
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        g();
                    }
                }
            } catch (IOException e2) {
                throw new jz(e2, 2000);
            }
        } catch (Throwable th) {
            this.h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        g();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new jz(e3, 2000);
                }
            } finally {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    g();
                }
            }
        }
    }

    @Override // yads.q30
    public final Uri d() {
        return this.f;
    }
}
