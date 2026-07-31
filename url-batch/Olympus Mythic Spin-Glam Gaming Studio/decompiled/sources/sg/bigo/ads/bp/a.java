package sg.bigo.ads.bp;

import android.net.TrafficStats;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Objects;
import org.apache.http.conn.ConnectTimeoutException;
import sg.bigo.ads.an.g;
import sg.bigo.ads.bo.h;
import sg.bigo.ads.bo.i;
import sg.bigo.ads.bp.d;

/* loaded from: classes14.dex */
public final class a implements sg.bigo.ads.bo.d {
    private final b a = new b();

    @Nullable
    private final g b;

    /* renamed from: sg.bigo.ads.bp.a$a, reason: collision with other inner class name */
    static class C1853a implements Closeable {
        private final d a;

        public C1853a(d dVar) {
            this.a = dVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            d dVar = this.a;
            if (dVar != null) {
                dVar.a.disconnect();
            }
        }
    }

    public a(@Nullable g gVar) {
        this.b = gVar;
        e.k();
    }

    private static void a(@NonNull sg.bigo.ads.bo.b<sg.bigo.ads.bs.c, sg.bigo.ads.bt.c> bVar, @NonNull c cVar, @NonNull h hVar) {
        if (!cVar.b()) {
            T t = cVar.a.k;
            if (hVar.getClass() == h.class) {
                t.b();
            } else if (hVar.getClass() == sg.bigo.ads.bo.e.class) {
                t.c();
            }
        }
        bVar.a((sg.bigo.ads.bo.b<sg.bigo.ads.bs.c, sg.bigo.ads.bt.c>) cVar.a, hVar);
    }

    private static void a(@NonNull sg.bigo.ads.bo.b<sg.bigo.ads.bs.c, sg.bigo.ads.bt.c> bVar, @NonNull c cVar, @NonNull sg.bigo.ads.bt.c cVar2) {
        if (!cVar.b()) {
            cVar.a.k.c();
        }
        bVar.a((sg.bigo.ads.bo.b<sg.bigo.ads.bs.c, sg.bigo.ads.bt.c>) cVar.a, (sg.bigo.ads.bs.c<? extends sg.bigo.ads.bo.a>) cVar2);
    }

    private void a(@NonNull c cVar, @NonNull sg.bigo.ads.bo.b<sg.bigo.ads.bs.c, sg.bigo.ads.bt.c> bVar, boolean z) {
        InputStream inputStream;
        URL url;
        TrafficStats.setThreadStatsTag(9999000);
        d dVar = null;
        boolean z2 = false;
        try {
            d dVar2 = new d(cVar);
            try {
                d.a b = dVar2.b();
                if (b != null) {
                    bVar.a(cVar.a, b.b, b.e);
                    if (b.c == 0 && (url = b.a) != null) {
                        this.a.a(cVar.b, url);
                        try {
                            c a = cVar.a(b.a);
                            Objects.toString(b.a);
                            if (cVar.c) {
                                cVar.a.a("Accept-Encoding");
                            }
                            a(a, bVar, z);
                            sg.bigo.ads.common.utils.h.a((Closeable) null);
                            dVar2.a.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            return;
                        } catch (i unused) {
                        }
                    }
                }
                if (bVar.a((sg.bigo.ads.bo.b<sg.bigo.ads.bs.c, sg.bigo.ads.bt.c>) cVar.a, dVar2.b)) {
                    cVar.toString();
                    inputStream = dVar2.a();
                    try {
                        a(bVar, cVar, bVar.a(new sg.bigo.ads.bt.a(cVar.a.j, dVar2.b, inputStream, dVar2.c, z ? null : new C1853a(dVar2))));
                    } catch (Throwable th) {
                        th = th;
                        dVar = dVar2;
                        try {
                            a(bVar, cVar, new h(th instanceof SocketTimeoutException ? 702 : th instanceof ConnectTimeoutException ? 701 : 700, th.getMessage()));
                            sg.bigo.ads.bn.a.a(0, "AndroidNetClient", cVar + ", error = " + th.getMessage());
                            sg.bigo.ads.common.utils.h.a((Closeable) inputStream);
                            if (dVar != null) {
                                dVar.a.disconnect();
                            }
                            TrafficStats.clearThreadStatsTag();
                            return;
                        } catch (Throwable th2) {
                            if (z) {
                                sg.bigo.ads.common.utils.h.a((Closeable) inputStream);
                                if (dVar != null) {
                                    dVar.a.disconnect();
                                }
                            }
                            TrafficStats.clearThreadStatsTag();
                            throw th2;
                        }
                    }
                } else {
                    String str = b != null ? b.d : null;
                    InputStream errorStream = dVar2.a.getErrorStream();
                    if (TextUtils.isEmpty(str)) {
                        str = sg.bigo.ads.common.utils.h.a(errorStream);
                    }
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(str)) {
                        sb.append(str);
                        sb.append(", ");
                    }
                    sb.append("responseCode is ");
                    sb.append(dVar2.b);
                    sb.append(", validate fail.");
                    sg.bigo.ads.bn.a.a(0, "AndroidNetClient", cVar + ", responseCode = " + dVar2.b + ", is invalid.");
                    a(bVar, cVar, new sg.bigo.ads.bo.e(dVar2.b, sb.toString()));
                    z2 = true;
                    inputStream = errorStream;
                }
                if (z || z2) {
                    sg.bigo.ads.common.utils.h.a((Closeable) inputStream);
                    dVar2.a.disconnect();
                }
                TrafficStats.clearThreadStatsTag();
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    @Override // sg.bigo.ads.bo.d
    public final void a(@NonNull sg.bigo.ads.bs.c cVar, @NonNull sg.bigo.ads.bo.b bVar) {
        new e(cVar.l, cVar, bVar) { // from class: sg.bigo.ads.bp.a.1
            @Override // sg.bigo.ads.bp.e
            protected final void a(sg.bigo.ads.bs.c cVar2, sg.bigo.ads.bo.b bVar2) {
                a.this.a(cVar2, (sg.bigo.ads.bo.b<sg.bigo.ads.bs.c, sg.bigo.ads.bt.c>) bVar2, true);
            }
        }.l();
    }

    final void a(@NonNull sg.bigo.ads.bs.c cVar, @NonNull sg.bigo.ads.bo.b<sg.bigo.ads.bs.c, sg.bigo.ads.bt.c> bVar, boolean z) {
        a(new c(cVar, this.a, this.b), bVar, z);
    }

    @Override // sg.bigo.ads.bo.d
    public final void b(@NonNull sg.bigo.ads.bs.c cVar, @NonNull sg.bigo.ads.bo.b bVar) {
        new e(cVar.l, cVar, bVar) { // from class: sg.bigo.ads.bp.a.2
            @Override // sg.bigo.ads.bp.e
            protected final void a(sg.bigo.ads.bs.c cVar2, sg.bigo.ads.bo.b bVar2) {
                a.this.a(cVar2, (sg.bigo.ads.bo.b<sg.bigo.ads.bs.c, sg.bigo.ads.bt.c>) bVar2, true);
            }
        }.l();
    }

    @Override // sg.bigo.ads.bo.d
    public final void c(@NonNull sg.bigo.ads.bs.c cVar, @NonNull sg.bigo.ads.bo.b bVar) {
        a(cVar, (sg.bigo.ads.bo.b<sg.bigo.ads.bs.c, sg.bigo.ads.bt.c>) bVar, false);
    }
}
