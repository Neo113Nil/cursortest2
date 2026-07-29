package o;

import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.nf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1577nf implements InterfaceC1412l8, InterfaceC1356kI {
    public final FlutterJNI h;
    public final HashMap i;
    public final HashMap j;
    public final Object k;
    public final AtomicBoolean l;
    public final HashMap m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public final C1590ns f204o;

    public C1577nf(FlutterJNI flutterJNI) {
        Object obj = C0950e6.D().k;
        this.i = new HashMap();
        this.j = new HashMap();
        this.k = new Object();
        this.l = new AtomicBoolean(false);
        this.m = new HashMap();
        this.n = 1;
        this.f204o = new C1590ns(21, (byte) 0);
        new WeakHashMap();
        this.h = flutterJNI;
    }

    @Override // o.InterfaceC1412l8
    public final void R(String str, InterfaceC1280j8 interfaceC1280j8) {
        b(str, interfaceC1280j8);
    }

    public final void a(final String str, final C1445lf c1445lf, final ByteBuffer byteBuffer, final int i, final long j) {
        C1590ns c1590ns = c1445lf != null ? c1445lf.b : null;
        String b = AbstractC1568nW.b("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1436lW.a(i, ZM.l(b));
        } else {
            String l = ZM.l(b);
            try {
                if (ZM.c == null) {
                    ZM.c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                ZM.c.invoke(null, Long.valueOf(ZM.a), l, Integer.valueOf(i));
            } catch (Exception e) {
                ZM.g("asyncTraceBegin", e);
            }
        }
        Runnable runnable = new Runnable() { // from class: o.jf
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                FlutterJNI flutterJNI = C1577nf.this.h;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String b2 = AbstractC1568nW.b(sb.toString());
                int i2 = Build.VERSION.SDK_INT;
                int i3 = i;
                if (i2 >= 29) {
                    AbstractC1436lW.b(i3, ZM.l(b2));
                } else {
                    String l2 = ZM.l(b2);
                    try {
                        if (ZM.d == null) {
                            ZM.d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        ZM.d.invoke(null, Long.valueOf(ZM.a), l2, Integer.valueOf(i3));
                    } catch (Exception e2) {
                        ZM.g("asyncTraceEnd", e2);
                    }
                }
                try {
                    AbstractC1568nW.c("DartMessenger#handleMessageFromDart on " + str2);
                    C1445lf c1445lf2 = c1445lf;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (c1445lf2 != null) {
                            try {
                                try {
                                    c1445lf2.a.s(byteBuffer2, new C1511mf(flutterJNI, i3));
                                } catch (Exception e3) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e3);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i3);
                                }
                            } catch (Error e4) {
                                Thread currentThread = Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() == null) {
                                    throw e4;
                                }
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e4);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i3);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                    } finally {
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j2);
                }
            }
        };
        if (c1590ns == null) {
            c1590ns = this.f204o;
        }
        ((Handler) c1590ns.i).post(runnable);
    }

    public final void b(String str, InterfaceC1280j8 interfaceC1280j8) {
        if (interfaceC1280j8 == null) {
            synchronized (this.k) {
                this.i.remove(str);
            }
            return;
        }
        synchronized (this.k) {
            try {
                this.i.put(str, new C1445lf(interfaceC1280j8, null));
                List<C1379kf> list = (List) this.j.remove(str);
                if (list == null) {
                    return;
                }
                for (C1379kf c1379kf : list) {
                    a(str, (C1445lf) this.i.get(str), c1379kf.a, c1379kf.b, c1379kf.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC1412l8
    public final void g(String str, ByteBuffer byteBuffer, InterfaceC1346k8 interfaceC1346k8) {
        AbstractC1568nW.c("DartMessenger#send on ".concat(str));
        try {
            int i = this.n;
            this.n = i + 1;
            if (interfaceC1346k8 != null) {
                this.m.put(Integer.valueOf(i), interfaceC1346k8);
            }
            FlutterJNI flutterJNI = this.h;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
