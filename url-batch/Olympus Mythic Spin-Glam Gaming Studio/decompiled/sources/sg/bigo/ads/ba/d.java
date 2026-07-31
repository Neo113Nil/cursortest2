package sg.bigo.ads.ba;

import android.content.Context;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes12.dex */
public final class d implements Runnable {
    private final a a;
    private InputStream b;
    private final File c;
    private final Context d;

    public d(Context context, a aVar) {
        this.d = context;
        this.a = aVar;
        sg.bigo.ads.ay.a aVar2 = aVar.b;
        this.c = new File(aVar2.c, sg.bigo.ads.common.utils.g.d(aVar2.d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r14 <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r18.c.length() != r14) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r18.a.e != r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        r0 = r18.c;
        r10 = r18.a.b;
        r0.renameTo(new java.io.File(r10.c, r10.d));
        r18.a.e = sg.bigo.ads.ba.h.f;
        r9 = true;
        sg.bigo.ads.ba.f.a().a(r18.a.a);
        a("download is over.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a() {
        RandomAccessFile randomAccessFile;
        int i;
        String str = "the download file has a invalid size.";
        a("startDownloadTask");
        if (this.b == null) {
            b("downloadStream is null");
            return;
        }
        this.a.e = h.d;
        f.a().a(this.a.a);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.b);
        byte[] bArr = new byte[1048576];
        boolean z = false;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(this.c, "rwd");
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            long j = this.a.b.g;
            randomAccessFile.seek(j);
            String str2 = this.a.a;
            while (true) {
                int i2 = this.a.e;
                i = h.d;
                if (i2 != i) {
                    break;
                }
                int read = bufferedInputStream.read(bArr, 0, 1048576);
                if (read == -1) {
                    break;
                }
                randomAccessFile.write(bArr, 0, read);
                j += read;
                this.a.b(j);
                f.a().a(this.a.a);
            }
            if (!r.a((CharSequence) "")) {
                str = "";
            } else if (this.a.b.g > 0 && this.c.length() > 0) {
                str = this.a.e != i ? "the download task error and download state is not loading." : "the download stream has not been read completely.";
            }
            b("Failed to download due to: ".concat(str));
            sg.bigo.ads.common.utils.h.a(randomAccessFile);
            sg.bigo.ads.common.utils.h.a((Closeable) bufferedInputStream);
            sg.bigo.ads.common.utils.h.a((Closeable) this.b);
        } catch (Exception e2) {
            e = e2;
            randomAccessFile2 = randomAccessFile;
            String message = e.getMessage();
            if (!z) {
                if (!r.a((CharSequence) message)) {
                    str = message;
                } else if (this.a.b.g > 0 && this.c.length() > 0) {
                    str = this.a.e != h.d ? "the download task error and download state is not loading." : "the download stream has not been read completely.";
                }
                b("Failed to download due to: ".concat(String.valueOf(str)));
            }
            sg.bigo.ads.common.utils.h.a(randomAccessFile2);
            sg.bigo.ads.common.utils.h.a((Closeable) bufferedInputStream);
            sg.bigo.ads.common.utils.h.a((Closeable) this.b);
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (!z) {
                if (!r.a((CharSequence) "")) {
                    str = "";
                } else if (this.a.b.g > 0 && this.c.length() > 0) {
                    str = this.a.e != h.d ? "the download task error and download state is not loading." : "the download stream has not been read completely.";
                }
                b("Failed to download due to: ".concat(str));
            }
            sg.bigo.ads.common.utils.h.a(randomAccessFile2);
            sg.bigo.ads.common.utils.h.a((Closeable) bufferedInputStream);
            sg.bigo.ads.common.utils.h.a((Closeable) this.b);
            throw th;
        }
    }

    private void a(String str) {
        a aVar = this.a;
        String str2 = aVar.a;
        aVar.toString();
    }

    private void b(String str) {
        sg.bigo.ads.bn.a.a(0, IDownloadTask.TAG, str + " , " + this.a.a + " has a error ! " + this.a.toString());
        a aVar = this.a;
        aVar.f = str;
        aVar.e = h.g;
        f.a().a(this.a.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x010d, code lost:
    
        if (sg.bigo.ads.common.utils.g.c(r8.c) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010f, code lost:
    
        b("Failed to create temp file.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0114, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        while (true) {
            sg.bigo.ads.bs.a aVar = new sg.bigo.ads.bs.a(sg.bigo.ads.bx.a.a(), new sg.bigo.ads.bs.d(this.a.b.b), this.a.b.r, this.d);
            aVar.l = sg.bigo.ads.bp.e.h();
            String str = "bytes=" + this.a.b.g + "-";
            aVar.a(Command.HTTP_HEADER_RANGE, str);
            a("Range = ".concat(String.valueOf(str)));
            sg.bigo.ads.bo.c<sg.bigo.ads.bt.a> a = sg.bigo.ads.bo.g.a(aVar);
            sg.bigo.ads.bt.a aVar2 = a.a;
            if (aVar2 != null) {
                sg.bigo.ads.bt.b a2 = sg.bigo.ads.bt.b.a(aVar2.a("Content-Range"));
                long j = a2 != null ? a2.b : 0L;
                if (j <= 0) {
                    j = a.a.a();
                }
                this.a.a(j);
                sg.bigo.ads.bt.a aVar3 = a.a;
                this.b = aVar3.b;
                this.a.b.q = aVar3.a("Content-Type");
                if (!this.c.exists()) {
                    break;
                }
                sg.bigo.ads.ay.a aVar4 = this.a.b;
                long j2 = aVar4.g;
                long j3 = a2 != null ? a2.a : 0L;
                if (j2 > 0 && j2 == j3) {
                    aVar4.p = true;
                    break;
                }
                a("Delete tmp file.");
                if (!sg.bigo.ads.common.utils.g.a(this.c)) {
                    b("Failed to delete temp file.");
                    return;
                }
                this.a.b(0L);
                if (j3 <= 0) {
                    break;
                }
                sg.bigo.ads.common.utils.h.a((Closeable) this.b);
                this.b = null;
            } else {
                String str2 = "Failed to request url.";
                if (a.b != null) {
                    str2 = "Failed to request url. Error code: " + a.b.a + ", error msg: " + a.b.getMessage();
                }
                b(str2);
                return;
            }
        }
        this.a.e = h.c;
        f.a().a(this.a.a);
        a();
    }
}
