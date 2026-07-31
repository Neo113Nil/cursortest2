package yads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes14.dex */
public final class fm2 extends jn {
    public final Resources e;
    public final String f;
    public Uri g;
    public AssetFileDescriptor h;
    public FileInputStream i;
    public long j;
    public boolean k;

    public fm2(Context context) {
        super(false);
        this.e = context.getResources();
        this.f = context.getPackageName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (r3.matches("\\d+") != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0165  */
    @Override // yads.q30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(v30 v30Var) {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        String str;
        Uri uri = v30Var.a;
        this.g = uri;
        try {
            try {
                if (!TextUtils.equals("rawresource", uri.getScheme())) {
                    if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                        String lastPathSegment = uri.getLastPathSegment();
                        lastPathSegment.getClass();
                    }
                    if (!TextUtils.equals("android.resource", uri.getScheme())) {
                        throw new em2("URI must either use scheme rawresource or android.resource", null, 1004);
                    }
                    String path = uri.getPath();
                    path.getClass();
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String host = uri.getHost();
                    StringBuilder sb = new StringBuilder();
                    if (TextUtils.isEmpty(host)) {
                        str = "";
                    } else {
                        str = host + ":";
                    }
                    sb.append(str);
                    sb.append(path);
                    parseInt = this.e.getIdentifier(sb.toString(), "raw", this.f);
                    if (parseInt == 0) {
                        throw new em2("Resource not found.", null, 2005);
                    }
                    h();
                    openRawResourceFd = this.e.openRawResourceFd(parseInt);
                    this.h = openRawResourceFd;
                    if (openRawResourceFd != null) {
                        throw new em2("Resource is compressed: " + uri, null, 2000);
                    }
                    long length = openRawResourceFd.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.i = fileInputStream;
                    if (length != -1) {
                        try {
                            if (v30Var.f > length) {
                                throw new em2(null, null, 2008);
                            }
                        } catch (em2 e) {
                            throw e;
                        } catch (IOException e2) {
                            throw new em2(null, e2, 2000);
                        }
                    }
                    long startOffset = openRawResourceFd.getStartOffset();
                    long skip = fileInputStream.skip(v30Var.f + startOffset) - startOffset;
                    if (skip != v30Var.f) {
                        throw new em2(null, null, 2008);
                    }
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.j = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.j = size;
                            if (size < 0) {
                                throw new em2(null, null, 2008);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.j = j;
                        if (j < 0) {
                            throw new r30(2008);
                        }
                    }
                    long j2 = v30Var.g;
                    if (j2 != -1) {
                        long j3 = this.j;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.j = j2;
                    }
                    this.k = true;
                    b(v30Var);
                    long j4 = v30Var.g;
                    return j4 != -1 ? j4 : this.j;
                }
                openRawResourceFd = this.e.openRawResourceFd(parseInt);
                this.h = openRawResourceFd;
                if (openRawResourceFd != null) {
                }
            } catch (Resources.NotFoundException e3) {
                throw new em2(null, e3, 2005);
            }
            String lastPathSegment2 = uri.getLastPathSegment();
            lastPathSegment2.getClass();
            parseInt = Integer.parseInt(lastPathSegment2);
            h();
        } catch (NumberFormatException unused) {
            throw new em2("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // yads.n30
    public final int c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new em2(null, e, 2000);
            }
        }
        FileInputStream fileInputStream = this.i;
        int i3 = sb3.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.j == -1) {
                return -1;
            }
            throw new em2("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.j;
        if (j2 != -1) {
            this.j = j2 - read;
        }
        c(read);
        return read;
    }

    @Override // yads.q30
    public final void close() {
        this.g = null;
        try {
            try {
                FileInputStream fileInputStream = this.i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new em2(null, e, 2000);
                    }
                } finally {
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        g();
                    }
                }
            } catch (IOException e2) {
                throw new em2(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        g();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new em2(null, e3, 2000);
                }
            } finally {
                this.h = null;
                if (this.k) {
                    this.k = false;
                    g();
                }
            }
        }
    }

    @Override // yads.q30
    public final Uri d() {
        return this.g;
    }
}
