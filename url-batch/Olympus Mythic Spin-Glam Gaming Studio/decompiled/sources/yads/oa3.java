package yads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes15.dex */
public final class oa3 extends jn {
    public final int e;
    public final byte[] f;
    public final DatagramPacket g;
    public Uri h;
    public DatagramSocket i;
    public MulticastSocket j;
    public InetAddress k;
    public boolean l;
    public int m;

    public oa3() {
        super(true);
        this.e = 8000;
        byte[] bArr = new byte[2000];
        this.f = bArr;
        this.g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // yads.q30
    public final long a(v30 v30Var) {
        Uri uri = v30Var.a;
        this.h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.h.getPort();
        h();
        try {
            this.k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.k, port);
            if (this.k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.j = multicastSocket;
                multicastSocket.joinGroup(this.k);
                this.i = this.j;
            } else {
                this.i = new DatagramSocket(inetSocketAddress);
            }
            this.i.setSoTimeout(this.e);
            this.l = true;
            b(v30Var);
            return -1L;
        } catch (IOException e) {
            throw new na3(e, 2001);
        } catch (SecurityException e2) {
            throw new na3(e2, 2006);
        }
    }

    @Override // yads.n30
    public final int c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.m == 0) {
            try {
                DatagramSocket datagramSocket = this.i;
                datagramSocket.getClass();
                datagramSocket.receive(this.g);
                int length = this.g.getLength();
                this.m = length;
                c(length);
            } catch (SocketTimeoutException e) {
                throw new na3(e, 2002);
            } catch (IOException e2) {
                throw new na3(e2, 2001);
            }
        }
        int length2 = this.g.getLength();
        int i3 = this.m;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f, length2 - i3, bArr, i, min);
        this.m -= min;
        return min;
    }

    @Override // yads.q30
    public final void close() {
        this.h = null;
        MulticastSocket multicastSocket = this.j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.j = null;
        }
        DatagramSocket datagramSocket = this.i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.k = null;
        this.m = 0;
        if (this.l) {
            this.l = false;
            g();
        }
    }

    @Override // yads.q30
    public final Uri d() {
        return this.h;
    }
}
