package com.mbridge.msdk.thrid.okhttp;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: RealCall.java */
/* loaded from: classes13.dex */
final class x implements d {
    final v a;
    final com.mbridge.msdk.thrid.okhttp.internal.http.j b;
    final com.mbridge.msdk.thrid.okio.a c;
    private o d;
    final y e;
    final boolean f;
    private boolean g;

    /* compiled from: RealCall.java */
    class a extends com.mbridge.msdk.thrid.okio.a {
        a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        protected void j() {
            x.this.cancel();
        }
    }

    /* compiled from: RealCall.java */
    final class b extends com.mbridge.msdk.thrid.okhttp.internal.b {
        static final /* synthetic */ boolean d = true;
        private final e b;

        b(e eVar) {
            super("OkHttp %s", x.this.e());
            this.b = eVar;
        }

        void a(ExecutorService executorService) {
            if (!d && Thread.holdsLock(x.this.a.j())) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    x.this.d.callFailed(x.this, interruptedIOException);
                    this.b.a(x.this, interruptedIOException);
                    x.this.a.j().b(this);
                }
            } catch (Throwable th) {
                x.this.a.j().b(this);
                throw th;
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        protected void b() {
            x.this.c.h();
            boolean z = false;
            try {
                try {
                    try {
                        this.b.a(x.this, x.this.c());
                        x.this.a.j().b(this);
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        IOException a = x.this.a(e);
                        if (z) {
                            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(4, "Callback failure for " + x.this.f(), a);
                        } else {
                            x.this.d.callFailed(x.this, a);
                            this.b.a(x.this, a);
                        }
                        x.this.a.j().b(this);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        x.this.cancel();
                        if (!z) {
                            this.b.a(x.this, new IOException("canceled due to " + th));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    x.this.a.j().b(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        x c() {
            return x.this;
        }

        String d() {
            return x.this.e.g().g();
        }
    }

    private x(v vVar, y yVar, boolean z) {
        this.a = vVar;
        this.e = yVar;
        this.f = z;
        this.b = new com.mbridge.msdk.thrid.okhttp.internal.http.j(vVar, z);
        a aVar = new a();
        this.c = aVar;
        aVar.a(vVar.b(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x clone() {
        return a(this.a, this.e, this.f);
    }

    a0 c() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a.p());
        arrayList.add(this.b);
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.a(this.a.i()));
        this.a.q();
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.cache.a(null));
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.connection.a(this.a));
        if (!this.f) {
            arrayList.addAll(this.a.r());
        }
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.b(this.f));
        a0 a2 = new com.mbridge.msdk.thrid.okhttp.internal.http.g(arrayList, null, null, null, 0, this.e, this, this.d, this.a.e(), this.a.y(), this.a.C()).a(this.e);
        if (!this.b.b()) {
            return a2;
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(a2);
        throw new IOException("Canceled");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void cancel() {
        this.b.a();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public a0 d() throws IOException {
        synchronized (this) {
            if (this.g) {
                throw new IllegalStateException("Already Executed");
            }
            this.g = true;
        }
        a();
        this.c.h();
        this.d.callStart(this);
        try {
            try {
                this.a.j().a(this);
                a0 c = c();
                if (c != null) {
                    return c;
                }
                throw new IOException("Canceled");
            } catch (IOException e) {
                IOException a2 = a(e);
                this.d.callFailed(this, a2);
                throw a2;
            }
        } finally {
            this.a.j().b(this);
        }
    }

    String e() {
        return this.e.g().l();
    }

    String f() {
        StringBuilder sb = new StringBuilder();
        sb.append(h() ? "canceled " : "");
        sb.append(this.f ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(e());
        return sb.toString();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public boolean h() {
        return this.b.b();
    }

    static x a(v vVar, y yVar, boolean z) {
        x xVar = new x(vVar, yVar, z);
        xVar.d = vVar.l().a(xVar);
        return xVar;
    }

    IOException a(IOException iOException) {
        if (!this.c.i()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    private void a() {
        this.b.a(com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("response.body().close()"));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void a(e eVar) {
        synchronized (this) {
            if (!this.g) {
                this.g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        a();
        this.d.callStart(this);
        this.a.j().a(new b(eVar));
    }
}
