package sg.bigo.ads.cw;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes12.dex */
public final class d {
    ServerSocket b;
    public int c;
    private Thread f;
    private h g;
    private final Object d = new Object();
    final sg.bigo.ads.bh.e a = new sg.bigo.ads.bh.e("Play", 3, 0);
    private final Map<String, e> e = new ConcurrentHashMap();

    final class a implements Runnable {
        private final Socket b;

        public a(Socket socket) {
            this.b = socket;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v4 */
        @Override // java.lang.Runnable
        public final void run() {
            final e eVar;
            String str;
            String str2;
            int i;
            String str3;
            e eVar2;
            long j;
            String str4;
            String str5 = "ProxyCache";
            d dVar = d.this;
            Socket socket = this.b;
            try {
                try {
                    try {
                        sg.bigo.ads.cw.b a = sg.bigo.ads.cw.b.a(socket.getInputStream());
                        if (a != null) {
                            a.toString();
                            String f = r.f(a.a);
                            if ("ping".equals(f)) {
                                try {
                                    OutputStream outputStream = socket.getOutputStream();
                                    outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
                                    outputStream.write("ping ok".getBytes());
                                } catch (IOException e) {
                                    sg.bigo.ads.bn.a.a(0, "ProxyCache", "Pinger#responseToPing, error message is : " + e.toString());
                                }
                            } else if (!TextUtils.isEmpty(f)) {
                                eVar = dVar.a(f);
                                try {
                                    if (eVar.a()) {
                                        try {
                                            if (SystemClock.elapsedRealtime() - eVar.e > 300000) {
                                                eVar.f.getAndSet(0);
                                                eVar.e = SystemClock.elapsedRealtime();
                                            }
                                            eVar.a.incrementAndGet();
                                            boolean z = true;
                                            if (eVar.c != null && eVar.c.j != 1 && !eVar.c.b() && SystemClock.elapsedRealtime() - eVar.d > 15000 && eVar.f.getAndIncrement() < 3) {
                                                eVar.f.get();
                                                eVar.d = SystemClock.elapsedRealtime();
                                                sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.cw.e.1
                                                    AnonymousClass1() {
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        sg.bigo.ads.core.player.b.a().c.a(e.this.c, true);
                                                    }
                                                });
                                            }
                                            c cVar = eVar.b;
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
                                            String a2 = sg.bigo.ads.common.utils.g.a(r.f(a.a));
                                            boolean isEmpty = TextUtils.isEmpty(a2);
                                            long a3 = cVar.a.c() ? cVar.a.a() : cVar.a.b.i;
                                            boolean z2 = a3 >= 0;
                                            boolean z3 = a.c;
                                            if (z3) {
                                                eVar2 = eVar;
                                                try {
                                                    j = a3 - a.b;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    eVar2.b();
                                                    throw th;
                                                }
                                            } else {
                                                eVar2 = eVar;
                                                j = a3;
                                            }
                                            if (!z2 || !z3) {
                                                z = false;
                                            }
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(a.c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
                                            sb.append("Accept-Ranges: bytes\n");
                                            String str6 = "";
                                            sb.append(z2 ? c.a("Content-Length: %d\n", Long.valueOf(j)) : "");
                                            if (z) {
                                                str4 = "";
                                                try {
                                                    str6 = c.a("Content-Range: bytes %d-%d/%d\n", Long.valueOf(a.b), Long.valueOf(a3 - 1), Long.valueOf(a3));
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    eVar2.b();
                                                    throw th;
                                                }
                                            } else {
                                                str4 = "";
                                            }
                                            sb.append(str6);
                                            sb.append(!isEmpty ? c.a("Content-Type: %s\n", a2) : str4);
                                            sb.append("\n");
                                            str5 = "UTF-8";
                                            bufferedOutputStream.write(sb.toString().getBytes("UTF-8"));
                                            cVar.a(bufferedOutputStream, a.b);
                                            eVar2.b();
                                        } catch (Throwable th3) {
                                            th = th3;
                                            eVar2 = eVar;
                                        }
                                    } else {
                                        sg.bigo.ads.bn.a.a(0, "ProxyCache", "startProcessRequest failed");
                                        eVar.b();
                                    }
                                } catch (SocketException unused) {
                                    str2 = "Closing socket… Socket is closed by client.";
                                    i = 0;
                                    str3 = eVar;
                                    sg.bigo.ads.bn.a.a(i, str3, str2);
                                } catch (IOException e2) {
                                    e = e2;
                                    str = eVar;
                                    str2 = "Error processing request, error message is : " + e.toString();
                                    i = 0;
                                    str3 = str;
                                    sg.bigo.ads.bn.a.a(i, str3, str2);
                                } catch (j e3) {
                                    e = e3;
                                    str = eVar;
                                    str2 = "Error processing request, error message is : " + e.toString();
                                    i = 0;
                                    str3 = str;
                                    sg.bigo.ads.bn.a.a(i, str3, str2);
                                }
                            }
                        }
                    } finally {
                        d.a(socket);
                        dVar.b();
                    }
                } catch (j e4) {
                    e = e4;
                    str = str5;
                    str2 = "Error processing request, error message is : " + e.toString();
                    i = 0;
                    str3 = str;
                    sg.bigo.ads.bn.a.a(i, str3, str2);
                }
            } catch (SocketException unused2) {
                eVar = str5;
            } catch (IOException e5) {
                e = e5;
                str = str5;
                str2 = "Error processing request, error message is : " + e.toString();
                i = 0;
                str3 = str;
                sg.bigo.ads.bn.a.a(i, str3, str2);
            }
        }
    }

    final class b implements Runnable {
        private final CountDownLatch b;

        public b(CountDownLatch countDownLatch) {
            this.b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.countDown();
            d dVar = d.this;
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Socket accept = dVar.b.accept();
                    Objects.toString(accept);
                    dVar.a.submit(dVar.new a(accept));
                } catch (Throwable th) {
                    sg.bigo.ads.da.b.a(3005, 10111, th.toString());
                    sg.bigo.ads.bn.a.a(0, "ProxyCache", "Error during waiting connection, error message is : " + th.toString());
                    return;
                }
            }
        }
    }

    public d() {
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.b = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.c = localPort;
            f.a("127.0.0.1", localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new b(countDownLatch));
            this.f = thread;
            thread.setName("BGAd-Conn");
            this.f.start();
            countDownLatch.await();
            this.g = new h("127.0.0.1", this.c);
            a();
        } catch (IOException | InterruptedException e) {
            this.a.shutdown();
            sg.bigo.ads.da.b.a(3005, 10110, "Error starting local proxy server, error message is : " + e.toString());
            sg.bigo.ads.bn.a.a(0, "ProxyCache", "Error starting local proxy server, error message is : " + e.toString());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(3:2|3|(1:5))|7|8|(1:10)|12|13|(2:15|17)(1:19)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
    
        sg.bigo.ads.bn.a.a(0, "ProxyCache", "Failed to close socket on proxy side: {}. It seems client have already closed connection." + r2.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[Catch: IOException -> 0x0031, TRY_LEAVE, TryCatch #1 {IOException -> 0x0031, blocks: (B:8:0x0027, B:10:0x002d), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[Catch: IOException -> 0x0051, TRY_LEAVE, TryCatch #0 {IOException -> 0x0051, blocks: (B:13:0x0047, B:15:0x004d), top: B:12:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void a(Socket socket) {
        String str;
        try {
            try {
                if (!socket.isInputShutdown()) {
                    socket.shutdownInput();
                }
            } catch (SocketException unused) {
                str = "Releasing input stream… Socket is closed by client.";
                sg.bigo.ads.bn.a.a(0, "ProxyCache", str);
                if (!socket.isOutputShutdown()) {
                }
                if (socket.isClosed()) {
                }
            } catch (IOException e) {
                str = "Error closing socket input stream, error message is " + e.getMessage();
                sg.bigo.ads.bn.a.a(0, "ProxyCache", str);
                if (!socket.isOutputShutdown()) {
                }
                if (socket.isClosed()) {
                }
            }
            if (socket.isClosed()) {
                return;
            }
            socket.close();
            return;
        } catch (IOException e2) {
            sg.bigo.ads.bn.a.a(0, "ProxyCache", "Error closing socket" + e2.getMessage());
            return;
        }
        if (!socket.isOutputShutdown()) {
            socket.shutdownOutput();
        }
    }

    final e a(String str) {
        e eVar;
        synchronized (this.d) {
            try {
                eVar = this.e.get(str);
                if (eVar == null) {
                    eVar = new e(str);
                    this.e.put(str, eVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final boolean a() {
        h hVar = this.g;
        return hVar != null && hVar.a();
    }

    final int b() {
        int i;
        synchronized (this.d) {
            try {
                Iterator<e> it = this.e.values().iterator();
                i = 0;
                while (it.hasNext()) {
                    i += it.next().a.get();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }
}
