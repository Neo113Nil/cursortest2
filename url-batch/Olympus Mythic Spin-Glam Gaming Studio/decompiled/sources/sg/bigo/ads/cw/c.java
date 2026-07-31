package sg.bigo.ads.cw;

import java.io.OutputStream;
import java.util.Locale;

/* loaded from: classes12.dex */
final class c extends i {
    sg.bigo.ads.cx.a a;

    public c(sg.bigo.ads.ay.a aVar) {
        this.e = aVar;
        sg.bigo.ads.cx.a aVar2 = new sg.bigo.ads.cx.a(aVar);
        this.a = aVar2;
        this.b = aVar2;
    }

    static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    final void a(OutputStream outputStream, long j) {
        byte[] bArr = new byte[8192];
        Thread.currentThread().getName();
        while (true) {
            int a = a(bArr, j);
            if (a == -1) {
                Thread.currentThread().getName();
                outputStream.flush();
                return;
            } else {
                outputStream.write(bArr, 0, a);
                j += a;
            }
        }
    }
}
