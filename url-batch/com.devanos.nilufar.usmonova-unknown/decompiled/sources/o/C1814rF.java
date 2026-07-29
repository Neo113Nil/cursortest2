package o;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* renamed from: o.rF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1814rF extends ProxySelector {
    public static final C1814rF a = new C1814rF();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return AbstractC0868ct.J(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
