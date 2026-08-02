package F;

import D.u;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class j implements N.f, k {

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f225b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f226c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f227d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f228e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f229f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f230g;

    /* renamed from: h, reason: collision with root package name */
    public int f231h;

    /* renamed from: i, reason: collision with root package name */
    public final l f232i;

    /* renamed from: j, reason: collision with root package name */
    public final WeakHashMap f233j;

    /* renamed from: k, reason: collision with root package name */
    public final u f234k;

    public j(FlutterJNI flutterJNI) {
        u uVar = new u();
        uVar.f111c = (ExecutorService) C.b.e().f15c;
        this.f226c = new HashMap();
        this.f227d = new HashMap();
        this.f228e = new Object();
        this.f229f = new AtomicBoolean(false);
        this.f230g = new HashMap();
        this.f231h = 1;
        this.f232i = new l();
        this.f233j = new WeakHashMap();
        this.f225b = flutterJNI;
        this.f234k = uVar;
    }

    @Override // N.f
    public final void a(String str, N.d dVar, B.b bVar) {
        e eVar;
        if (dVar == null) {
            synchronized (this.f228e) {
                this.f226c.remove(str);
            }
            return;
        }
        if (bVar != null) {
            eVar = (e) this.f233j.get(bVar);
            if (eVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar = null;
        }
        synchronized (this.f228e) {
            try {
                this.f226c.put(str, new f(dVar, eVar));
                List<d> list = (List) this.f227d.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar2 : list) {
                    c(str, (f) this.f226c.get(str), dVar2.f212a, dVar2.f213b, dVar2.f214c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // N.f
    public final void b(String str, N.d dVar) {
        a(str, dVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [F.c] */
    public final void c(final String str, final f fVar, final ByteBuffer byteBuffer, final int i2, final long j2) {
        e eVar = fVar != null ? fVar.f216b : null;
        String a2 = T.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            p.a.a(a.a.C(a2), i2);
        } else {
            String C2 = a.a.C(a2);
            try {
                if (a.a.f407c == null) {
                    a.a.f407c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                a.a.f407c.invoke(null, Long.valueOf(a.a.f405a), C2, Integer.valueOf(i2));
            } catch (Exception e2) {
                a.a.n("asyncTraceBegin", e2);
            }
        }
        ?? r0 = new Runnable() { // from class: F.c
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j2;
                FlutterJNI flutterJNI = j.this.f225b;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a3 = T.a.a(sb.toString());
                int i3 = Build.VERSION.SDK_INT;
                int i4 = i2;
                if (i3 >= 29) {
                    p.a.b(a.a.C(a3), i4);
                } else {
                    String C3 = a.a.C(a3);
                    try {
                        if (a.a.f408d == null) {
                            a.a.f408d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        a.a.f408d.invoke(null, Long.valueOf(a.a.f405a), C3, Integer.valueOf(i4));
                    } catch (Exception e3) {
                        a.a.n("asyncTraceEnd", e3);
                    }
                }
                try {
                    T.a.b("DartMessenger#handleMessageFromDart on " + str2);
                    f fVar2 = fVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (fVar2 != null) {
                            try {
                                try {
                                    fVar2.f215a.c(byteBuffer2, new g(flutterJNI, i4));
                                } catch (Exception e4) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e4);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
                                }
                            } catch (Error e5) {
                                Thread currentThread = Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() == null) {
                                    throw e5;
                                }
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e5);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                    } finally {
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j3);
                }
            }
        };
        e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = this.f232i;
        }
        eVar2.a(r0);
    }

    @Override // N.f
    public final B.b e(N.h hVar) {
        u uVar = this.f234k;
        uVar.getClass();
        i iVar = new i((ExecutorService) uVar.f111c);
        B.b bVar = new B.b(3);
        this.f233j.put(bVar, iVar);
        return bVar;
    }

    @Override // N.f
    public final void f(String str, ByteBuffer byteBuffer, N.e eVar) {
        T.a.b("DartMessenger#send on " + str);
        try {
            int i2 = this.f231h;
            this.f231h = i2 + 1;
            if (eVar != null) {
                this.f230g.put(Integer.valueOf(i2), eVar);
            }
            FlutterJNI flutterJNI = this.f225b;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i2);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i2);
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
