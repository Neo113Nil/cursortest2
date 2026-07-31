package yads;

import com.safedk.android.internal.partials.YandexNetworkBridge;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* loaded from: classes4.dex */
public final class i11 extends FilterInputStream {
    public final HttpURLConnection a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i11(HttpURLConnection httpURLConnection) {
        super(r0);
        InputStream errorStream;
        try {
            errorStream = YandexNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        this.a = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        YandexNetworkBridge.httpUrlConnectionDisconnect(this.a);
    }
}
