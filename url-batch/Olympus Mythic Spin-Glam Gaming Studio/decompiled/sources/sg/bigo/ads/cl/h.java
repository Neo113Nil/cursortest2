package sg.bigo.ads.cl;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.ai.p;
import sg.bigo.ads.at.a;

/* loaded from: classes4.dex */
public final class h implements a.InterfaceC1842a {
    private static final h f = new h();
    private boolean h;
    private long i;
    private long j;
    public boolean a = false;
    long b = 5000;
    private long g = 21600000;
    long c = 0;
    long d = 0;

    @NonNull
    public final a e = new a();

    public class a {
        final long a = System.currentTimeMillis();
        long b = System.currentTimeMillis();
        long c = System.currentTimeMillis();

        public a() {
        }

        public final String a(String str) {
            boolean z;
            boolean z2;
            boolean z3;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("start_ts", Long.valueOf(this.c));
                h hVar = h.this;
                jSONObject.putOpt("total_duration", Long.valueOf(hVar.c + hVar.b()));
                h hVar2 = h.this;
                long b = hVar2.b();
                if (b > hVar2.b) {
                    hVar2.d = b;
                } else {
                    b = hVar2.d;
                }
                jSONObject.putOpt("close_duration", Long.valueOf(b));
                z = g.this.c;
                jSONObject.putOpt("front_total_req_times", Long.valueOf(z ? r2.a.getAndAdd(1) : r2.a.get()));
                z2 = g.this.c;
                jSONObject.putOpt("back_total_req_times", Long.valueOf(!z2 ? r2.b.getAndAdd(1) : r2.b.get()));
                z3 = g.this.c;
                jSONObject.putOpt("close_front_req_times", Long.valueOf(z3 ? r8.c.getAndAdd(1) : r8.c.get()));
                jSONObject.putOpt("req_status", Long.valueOf(h.a(h.this)));
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    private h() {
        sg.bigo.ads.at.a.a().d = this;
    }

    static /* synthetic */ int a(h hVar) {
        return hVar.h ? 1 : 2;
    }

    public static h a() {
        return f;
    }

    @Override // sg.bigo.ads.at.a.InterfaceC1842a
    public final void a(long j, long j2) {
        this.h = true;
        this.i = j;
        a aVar = this.e;
        aVar.b = j2;
        long j3 = this.g;
        if (j3 > 0) {
            long j4 = this.j;
            if (j4 > 0 && j - j4 >= j3) {
                this.c = 0L;
                this.d = 0L;
                aVar.c = System.currentTimeMillis();
                g.a().a.clear();
            }
        }
        a aVar2 = this.e;
        if (aVar2.c == 0) {
            aVar2.c = System.currentTimeMillis();
        }
        g.a().a(true);
    }

    public final void a(p pVar) {
        this.a = pVar.a();
        this.b = pVar.b();
        this.g = pVar.c();
    }

    @Override // sg.bigo.ads.at.a.InterfaceC1842a
    public final void a(boolean z, long j, long j2, long j3) {
        this.h = false;
        this.j = j2;
        this.i = 0L;
        long j4 = j2 - j;
        if (j4 > 0 && j4 > this.b) {
            this.c += j4;
            this.d = j4;
            if (this.a) {
                sg.bigo.ads.da.b.a(z ? 1 : 2, j3, j4);
            }
        }
        g.a().a(false);
    }

    final long b() {
        long j = this.i;
        if (j <= 0) {
            return 0L;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (elapsedRealtime <= 0 || elapsedRealtime <= this.b) {
            return 0L;
        }
        return elapsedRealtime;
    }
}
