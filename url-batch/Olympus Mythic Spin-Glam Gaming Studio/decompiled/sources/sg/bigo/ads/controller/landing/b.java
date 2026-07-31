package sg.bigo.ads.controller.landing;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.aj.h;
import sg.bigo.ads.al.a;

/* loaded from: classes8.dex */
public final class b implements h, a.c {
    String a;
    String b;
    String c;
    private final String f;
    private final sg.bigo.ads.api.core.b g;
    private final sg.bigo.ads.d.c<?, ?> h;
    private final sg.bigo.ads.controller.landing.a i;
    private final int l;
    private final long m;
    private final String e = "ChromeTabStatSession";
    private int j = 0;
    private boolean k = false;
    protected long d = -1;
    private final List<h.a> n = new ArrayList();
    private final AtomicBoolean o = new AtomicBoolean(true);
    private final AtomicBoolean p = new AtomicBoolean(true);
    private boolean q = false;

    static class a implements h.a {
        private final int a;
        private final long b;

        private a(int i, long j) {
            this.a = i;
            this.b = System.currentTimeMillis() - j;
        }

        /* synthetic */ a(int i, long j, byte b) {
            this(i, j);
        }

        @Override // sg.bigo.ads.aj.h.a
        public final int a() {
            return this.a;
        }

        @Override // sg.bigo.ads.aj.h.a
        public final long b() {
            return this.b;
        }
    }

    public b(String str, @Nullable sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.d.c<?, ?> cVar, @Nullable sg.bigo.ads.controller.landing.a aVar) {
        long currentTimeMillis;
        this.f = str;
        this.g = bVar;
        this.h = cVar;
        this.i = aVar;
        if (cVar != null) {
            this.l = cVar.s();
            currentTimeMillis = cVar.t();
        } else {
            this.l = 0;
            currentTimeMillis = System.currentTimeMillis();
        }
        this.m = currentTimeMillis;
    }

    private void a(int i) {
        a aVar = new a(i, this.m, (byte) 0);
        this.n.add(0, aVar);
        sg.bigo.ads.da.b.a(this, aVar, this.g, this.h, (String) null);
    }

    @Override // sg.bigo.ads.al.a.c
    public final void a() {
        a(1);
    }

    @Override // sg.bigo.ads.al.a.c
    public final void b() {
        this.d = SystemClock.elapsedRealtime();
        this.j++;
        if (this.o.compareAndSet(true, false)) {
            a(4);
        }
    }

    @Override // sg.bigo.ads.al.a.c
    public final void c() {
        this.k = true;
    }

    @Override // sg.bigo.ads.al.a.c
    public final void d() {
        if (this.q) {
            return;
        }
        a(6);
    }

    @Override // sg.bigo.ads.al.a.c
    public final void e() {
        this.q = true;
        if (this.p.compareAndSet(true, false)) {
            a(5);
        }
    }

    @Override // sg.bigo.ads.al.a.c
    public final void f() {
        sg.bigo.ads.da.b.a(this, this.n.isEmpty() ? null : this.n.get(0), System.currentTimeMillis() - this.m, this.j, this.g, this.h, (String) null, "");
    }

    @Override // sg.bigo.ads.aj.h
    public final int i() {
        return 0;
    }

    @Override // sg.bigo.ads.aj.h
    public final String j() {
        return this.f;
    }

    @Override // sg.bigo.ads.aj.h
    public final int k() {
        return 0;
    }

    @Override // sg.bigo.ads.aj.h
    public final int l() {
        return 0;
    }

    @Override // sg.bigo.ads.aj.h
    public final int m() {
        return this.q ? 100 : 0;
    }

    @Override // sg.bigo.ads.aj.h
    public final boolean n() {
        sg.bigo.ads.controller.landing.a aVar = this.i;
        return aVar != null && aVar.d;
    }

    @Override // sg.bigo.ads.aj.h
    public final int o() {
        return this.l;
    }

    @Override // sg.bigo.ads.aj.h
    public final int p() {
        return 2;
    }

    @Override // sg.bigo.ads.aj.h
    @Nullable
    public final Map<String, String> q() {
        if (!this.k && TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.c) && TextUtils.isEmpty(this.b)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (this.k) {
            hashMap.put("tab_aborted", "1");
        }
        if (!TextUtils.isEmpty(this.a)) {
            hashMap.put("chrome_pkg", this.a);
        }
        if (!TextUtils.isEmpty(this.c)) {
            hashMap.put("is_chrome_def", TextUtils.equals(this.a, this.c) ? "1" : "0");
        }
        if (!TextUtils.isEmpty(this.b)) {
            hashMap.put("chrome_ver", this.b);
        }
        return hashMap;
    }
}
