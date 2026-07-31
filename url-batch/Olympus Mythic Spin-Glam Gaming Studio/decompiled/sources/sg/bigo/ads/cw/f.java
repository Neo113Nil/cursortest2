package sg.bigo.ads.cw;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import sg.bigo.ads.an.m;

/* loaded from: classes12.dex */
final class f extends ProxySelector {
    private static final List<Proxy> a = Arrays.asList(Proxy.NO_PROXY);
    private final ProxySelector b;
    private final String c;
    private final int d;

    private f(ProxySelector proxySelector, String str, int i) {
        this.b = (ProxySelector) m.a(proxySelector);
        this.c = (String) m.a(str);
        this.d = i;
    }

    static void a(String str, int i) {
        ProxySelector.setDefault(new f(ProxySelector.getDefault(), str, i));
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.b.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        return (this.c.equals(uri.getHost()) && this.d == uri.getPort()) ? a : this.b.select(uri);
    }
}
