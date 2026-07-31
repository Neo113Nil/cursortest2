package yads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lg2 extends SSLSocketFactory {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final SSLSocketFactory a;

    public lg2(SSLSocketFactory sSLSocketFactory) {
        this.a = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.a.createSocket(str, i);
        String[] a = kg2.a(this.a);
        Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(a);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return kg2.a(this.a);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return kg2.b(this.a);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.a.createSocket(inetAddress, i);
        String[] a = kg2.a(this.a);
        Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(a);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.a.createSocket(socket, str, i, z);
        String[] a = kg2.a(this.a);
        Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(a);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.a.createSocket(str, i, inetAddress, i2);
        String[] a = kg2.a(this.a);
        Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(a);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.a.createSocket(inetAddress, i, inetAddress2, i2);
        String[] a = kg2.a(this.a);
        Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(a);
        return createSocket;
    }
}
