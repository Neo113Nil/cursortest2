package sg.bigo.ads.f;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import sg.bigo.ads.ad.banner.h;
import sg.bigo.ads.ai.n;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.core.mraid.e;
import sg.bigo.ads.dh.a;
import sg.bigo.ads.dh.p;
import sg.bigo.ads.h.a;
import sg.bigo.ads.h.b;

/* loaded from: classes14.dex */
public final class c implements sg.bigo.ads.h.b {
    public boolean a;
    volatile File c;
    public Runnable d;
    public b e;
    InterfaceC1895c f;

    @NonNull
    final sg.bigo.ads.api.core.b h;
    long i;
    long j;
    long k;
    long l;
    long m;
    public volatile int n;

    @NonNull
    public final sg.bigo.ads.g.b o;

    @Nullable
    public a p;
    volatile boolean r;
    private Context s;
    private boolean x;
    private volatile boolean y;
    private volatile boolean z;
    public volatile boolean b = false;
    final a.C1898a g = new a.C1898a();
    private final int t = 1;
    private final int u = -1;
    private final int v = 2;
    private final int w = 3;
    volatile int q = 3;

    /* renamed from: sg.bigo.ads.f.c$2, reason: invalid class name */
    final class AnonymousClass2 implements sg.bigo.ads.cy.b {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;

        AnonymousClass2(String str, Context context) {
            this.a = str;
            this.b = context;
        }

        @Override // sg.bigo.ads.cy.b
        public final void a(@NonNull String str, int i, @Nullable String str2) {
            c.this.q = -1;
            sg.bigo.ads.bn.a.a(0, 5, "PlayableAdCompanion", "preloadZipResource onFailed: key=" + str + ", code=" + i + ", msg=" + str2);
        }

        @Override // sg.bigo.ads.cy.b
        public final void a(@NonNull String str, @NonNull File file, boolean z) {
            file.getAbsolutePath();
            String aB = c.this.h.aB();
            if (TextUtils.isEmpty(aB)) {
                c.this.q = -1;
                sg.bigo.ads.bn.a.a(0, 5, "PlayableAdCompanion", "preloadZipResource onReady: empty html path, skip local load");
                return;
            }
            if (c.this.b || c.this.r) {
                c.this.q = -1;
                boolean z2 = c.this.b;
                boolean z3 = c.this.r;
                return;
            }
            File file2 = new File(file, aB);
            if (file2.isFile()) {
                c.this.c = file2;
                sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.f.c.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            sg.bigo.ads.g.b bVar = c.this.o;
                            Context context = anonymousClass2.b;
                            e.d dVar = new e.d() { // from class: sg.bigo.ads.f.c.2.1.1
                                @Override // sg.bigo.ads.core.mraid.e.d
                                public final void a() {
                                    c.this.q = 1;
                                }
                            };
                            if (context != null) {
                                if (bVar.i == null) {
                                    bVar.b(context);
                                }
                                sg.bigo.ads.core.mraid.e eVar = bVar.i;
                                if (eVar != null) {
                                    eVar.a(dVar);
                                    bVar.g();
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            }
            c.this.q = -1;
            sg.bigo.ads.bn.a.a(0, 5, "PlayableAdCompanion", "preloadZipResource onReady: html file not found: " + file2.getAbsolutePath());
            sg.bigo.ads.da.b.a(c.this.h, 15, 0L, this.a, 0, (String) null, (String) null);
        }
    }

    public final class a implements b.a {
        public b.a a;

        private a() {
        }

        /* synthetic */ a(c cVar, byte b) {
            this();
        }

        @Override // sg.bigo.ads.h.b.a
        public final void a(WebView webView, int i) {
            InterfaceC1895c interfaceC1895c = c.this.f;
            if (interfaceC1895c != null) {
                interfaceC1895c.a(i);
            }
            b.a aVar = this.a;
            if (aVar != null) {
                aVar.a(webView, i);
            }
        }

        @Override // sg.bigo.ads.h.b.a
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c cVar = c.this;
            if (cVar.a) {
                cVar.i = SystemClock.elapsedRealtime();
            }
            c cVar2 = c.this;
            long j = cVar2.i;
            cVar2.g.a(bVar, 6, j > 0 ? elapsedRealtime - j : 0L);
            b.a aVar = this.a;
            if (aVar != null) {
                aVar.a(bVar);
            }
        }

        @Override // sg.bigo.ads.h.b.a
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
            c.this.g.a(bVar, 0, j);
            b.a aVar = this.a;
            if (aVar != null) {
                aVar.a(bVar, j);
            }
        }

        @Override // sg.bigo.ads.h.b.a
        public final void b(@NonNull sg.bigo.ads.api.core.b bVar) {
            if (c.this.a) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                c cVar = c.this;
                cVar.j = elapsedRealtime;
                Map<String, String> i = cVar.i();
                c cVar2 = c.this;
                long j = cVar2.i;
                long j2 = j > 0 ? elapsedRealtime - j : 0L;
                a.C1898a c1898a = cVar2.g;
                if (i.isEmpty()) {
                    i = null;
                }
                c1898a.a(bVar, 7, j2, i);
            }
            b.a aVar = this.a;
            if (aVar != null) {
                aVar.b(bVar);
            }
        }

        @Override // sg.bigo.ads.h.b.a
        public final void b(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
            c.this.g.a(bVar, 2, j);
            b.a aVar = this.a;
            if (aVar != null) {
                aVar.b(bVar, j);
            }
        }

        @Override // sg.bigo.ads.h.b.a
        public final void c() {
            Runnable runnable = c.this.d;
            if (runnable != null) {
                runnable.run();
            }
            c cVar = c.this;
            if (cVar.a) {
                cVar.k = SystemClock.elapsedRealtime();
                Map<String, String> i = c.this.i();
                c cVar2 = c.this;
                long j = cVar2.j;
                if (j > 0) {
                    i.put("start_2_loaded", String.valueOf(cVar2.k - j));
                }
                c cVar3 = c.this;
                long j2 = cVar3.i;
                long j3 = j2 > 0 ? cVar3.k - j2 : 0L;
                a.C1898a c1898a = cVar3.g;
                sg.bigo.ads.api.core.b bVar = cVar3.h;
                if (i.isEmpty()) {
                    i = null;
                }
                c1898a.a(bVar, 8, j3, i);
            }
            b.a aVar = this.a;
            if (aVar != null) {
                aVar.c();
            }
        }

        @Override // sg.bigo.ads.h.b.a
        public final void c(@NonNull sg.bigo.ads.api.core.b bVar) {
            if (c.this.a) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                c cVar = c.this;
                cVar.m = elapsedRealtime;
                Map<String, String> i = cVar.i();
                long j = c.this.l;
                if (j > 0) {
                    i.put("imp_2_game_start", String.valueOf(elapsedRealtime - j));
                }
                c cVar2 = c.this;
                long j2 = cVar2.i;
                long j3 = j2 > 0 ? elapsedRealtime - j2 : 0L;
                a.C1898a c1898a = cVar2.g;
                if (i.isEmpty()) {
                    i = null;
                }
                c1898a.a(bVar, 9, j3, i);
            }
            b.a aVar = this.a;
            if (aVar != null) {
                aVar.c(bVar);
            }
        }

        @Override // sg.bigo.ads.h.b.a
        public final void c(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
            c.this.g.a(bVar, 1, j);
            b.a aVar = this.a;
            if (aVar != null) {
                aVar.c(bVar, j);
            }
        }

        @Override // sg.bigo.ads.h.b.a
        public final void d() {
            if (c.this.a) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Map<String, String> i = c.this.i();
                long j = c.this.m;
                if (j > 0) {
                    i.put("game_start_2_end", String.valueOf(elapsedRealtime - j));
                }
                c cVar = c.this;
                long j2 = cVar.i;
                long j3 = j2 > 0 ? elapsedRealtime - j2 : 0L;
                a.C1898a c1898a = cVar.g;
                sg.bigo.ads.api.core.b bVar = cVar.h;
                if (i.isEmpty()) {
                    i = null;
                }
                c1898a.a(bVar, 13, j3, i);
            }
            b bVar2 = c.this.e;
            if (bVar2 != null) {
                bVar2.a();
            }
            b.a aVar = this.a;
            if (aVar != null) {
                aVar.d();
            }
        }

        @Override // sg.bigo.ads.h.b.a
        public final void d(@NonNull sg.bigo.ads.api.core.b bVar) {
            if (c.this.a) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                c cVar = c.this;
                cVar.l = elapsedRealtime;
                Map<String, String> i = cVar.i();
                long j = c.this.k;
                if (j > 0) {
                    i.put("loaded_2_imp", String.valueOf(elapsedRealtime - j));
                }
                long j2 = c.this.m;
                if (j2 > 0) {
                    i.put("imp_2_game_start", String.valueOf(j2 - elapsedRealtime));
                }
                c cVar2 = c.this;
                long j3 = cVar2.i;
                long j4 = j3 > 0 ? elapsedRealtime - j3 : 0L;
                a.C1898a c1898a = cVar2.g;
                if (i.isEmpty()) {
                    i = null;
                }
                c1898a.a(bVar, 11, j4, i);
            }
            b.a aVar = this.a;
            if (aVar != null) {
                aVar.d(bVar);
            }
        }

        @Override // sg.bigo.ads.h.b.a
        public final void d(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
            c.this.g.a(bVar, 5, j);
            b.a aVar = this.a;
            if (aVar != null) {
                aVar.d(bVar, j);
            }
        }

        @Override // sg.bigo.ads.h.b.a
        public final void e(@NonNull sg.bigo.ads.api.core.b bVar) {
            c cVar = c.this;
            if (cVar.a) {
                Map<String, String> i = cVar.i();
                a.C1898a c1898a = c.this.g;
                if (i.isEmpty()) {
                    i = null;
                }
                c1898a.a(bVar, 12, 0L, i);
            }
            b.a aVar = this.a;
            if (aVar != null) {
                aVar.e(bVar);
            }
        }

        @Override // sg.bigo.ads.h.b.a
        public final boolean e() {
            return false;
        }
    }

    public interface b {
        void a();
    }

    /* renamed from: sg.bigo.ads.f.c$c, reason: collision with other inner class name */
    public interface InterfaceC1895c {
        void a(int i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        if (android.text.TextUtils.isEmpty(r15.aA()) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009b, code lost:
    
        if (r15.as() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a1, code lost:
    
        if (r3 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(@NonNull Ad ad, @NonNull n nVar, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.core.player.c cVar, @Nullable p pVar) {
        sg.bigo.ads.dh.a next;
        byte b2 = 0;
        boolean z = true;
        this.h = bVar;
        a.C1889a c1889a = null;
        if (pVar != null) {
            Iterator<sg.bigo.ads.dh.a> it = pVar.A.iterator();
            while (it.hasNext() && ((next = it.next()) == null || (c1889a = next.a()) == null || !c1889a.a())) {
            }
        }
        a.C1889a c1889a2 = c1889a;
        boolean s = nVar.s();
        boolean ad2 = bVar.ad();
        boolean z2 = c1889a2 != null && c1889a2.a();
        int ay = bVar.ay();
        int y = bVar.y();
        boolean z3 = y == 3 || y == 4 || y == 12 || y == 20;
        if (1 != ay) {
            boolean z4 = z2 || !TextUtils.isEmpty(bVar.aA());
            if (!s) {
            }
            if (ad2) {
                if (z4) {
                }
            }
            z = false;
        } else if (!z2) {
        }
        this.a = z;
        if (this.a) {
            a aVar = new a(this, b2);
            this.p = aVar;
            this.o = new sg.bigo.ads.g.b(ad, bVar, cVar, pVar, c1889a2, aVar);
        } else {
            this.o = new sg.bigo.ads.g.b(ad, bVar, null, null, null, null);
        }
        nVar.l();
        nVar.n();
    }

    public c(@NonNull Ad ad, @NonNull n nVar, @NonNull a.C1889a c1889a, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.core.player.c cVar, @Nullable p pVar, @Nullable b.a aVar) {
        sg.bigo.ads.g.b bVar2;
        byte b2 = 0;
        boolean z = true;
        this.h = bVar;
        int y = bVar.y();
        if (y != 3 && y != 4 && y != 12 && y != 20) {
            z = false;
        }
        this.a = z;
        if (z) {
            a aVar2 = new a(this, b2);
            aVar2.a = aVar;
            bVar2 = new sg.bigo.ads.g.b(ad, bVar, cVar, pVar, c1889a, aVar2);
        } else {
            bVar2 = new sg.bigo.ads.g.b(ad, bVar, null, null, null, null);
        }
        this.o = bVar2;
        nVar.l();
        nVar.n();
    }

    private void a(@NonNull Context context, @NonNull String str) {
        this.x = true;
        if (!(this.h instanceof o)) {
            sg.bigo.ads.bn.a.a(0, 5, "PlayableAdCompanion", "preloadZipResource: adData is not NativeAdData, skip zip preload. url=".concat(String.valueOf(str)));
            this.q = -1;
        } else {
            if (this.q == 2) {
                return;
            }
            this.q = 2;
            this.s = context.getApplicationContext();
            sg.bigo.ads.cy.c.a().a(this.s, (o) this.h, new AnonymousClass2(str, context));
        }
    }

    private void j() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, String> i = i();
        long j = this.m;
        if (j > 0) {
            i.put("game_start_2_close", String.valueOf(elapsedRealtime - j));
        }
        long j2 = this.m;
        long j3 = j2 > 0 ? elapsedRealtime - j2 : 0L;
        a.C1898a c1898a = this.g;
        sg.bigo.ads.api.core.b bVar = this.h;
        if (i.isEmpty()) {
            i = null;
        }
        c1898a.a(bVar, 14, j3, i);
    }

    @Override // sg.bigo.ads.h.a
    @Nullable
    public final View a() {
        return this.o.k;
    }

    @Override // sg.bigo.ads.h.a
    public final void a(int i) {
        if (i == 1) {
            this.b = true;
            if (this.a) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Map<String, String> i2 = i();
                long j = this.k;
                long j2 = j > 0 ? elapsedRealtime - j : 0L;
                a.C1898a c1898a = this.g;
                sg.bigo.ads.api.core.b bVar = this.h;
                if (i2.isEmpty()) {
                    i2 = null;
                }
                c1898a.a(bVar, 10, j2, i2);
            }
        } else if (i == 2 && this.a && this.b) {
            j();
            this.b = false;
        }
        this.o.a(i);
    }

    @Override // sg.bigo.ads.h.a
    public final void a(int i, int i2) {
        this.o.a(i, i2);
    }

    public final void a(Runnable runnable) {
        if (this.d == runnable) {
            this.d = null;
        }
    }

    public final void a(h hVar) {
        this.o.h = hVar;
    }

    public final void a(InterfaceC1895c interfaceC1895c) {
        if (this.f == interfaceC1895c) {
            this.f = null;
        }
    }

    @Override // sg.bigo.ads.h.a
    public final boolean a(Context context) {
        if (!this.a || context == null) {
            return false;
        }
        if (this.z) {
            return true;
        }
        this.z = true;
        String aA = this.h.aA();
        if (!TextUtils.isEmpty(aA)) {
            a(context, aA);
            return true;
        }
        if (sg.bigo.ads.bh.d.b()) {
            return this.o.a(context);
        }
        final Context applicationContext = context.getApplicationContext();
        sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.f.c.1
            @Override // java.lang.Runnable
            public final void run() {
                c.this.o.a(applicationContext);
            }
        });
        return true;
    }

    @Override // sg.bigo.ads.h.a
    public final boolean b() {
        if (!this.a) {
            return false;
        }
        if (this.o.b()) {
            return true;
        }
        if (this.x) {
            return this.q == 1;
        }
        sg.bigo.ads.ai.o f = this.h.f();
        if (f != null) {
            int a2 = f.a("playable_attr.playable_loaded_progress", 0);
            int i = this.o.f;
            if (a2 > 0 && i >= a2) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(Context context) {
        if (!this.a || context == null) {
            return false;
        }
        this.r = true;
        return this.o.a(context);
    }

    @Override // sg.bigo.ads.h.a
    public final void c() {
        this.o.c();
    }

    @Override // sg.bigo.ads.h.a
    public final void d() {
        this.o.d();
    }

    @Override // sg.bigo.ads.h.a
    public final void e() {
        if (this.a) {
            j();
        }
        this.o.e();
        this.e = null;
    }

    @Override // sg.bigo.ads.h.a
    public final void f() {
        this.o.f();
    }

    public final void g() {
        if (!this.x || this.s == null || this.c == null || this.o == null || this.y) {
            return;
        }
        this.y = true;
        this.o.a(this.s, this.c);
    }

    public final boolean h() {
        return this.a && this.x && this.q != 1;
    }

    @NonNull
    final Map<String, String> i() {
        HashMap hashMap = new HashMap();
        if (this.n > 0) {
            hashMap.put("preload_type", String.valueOf(this.n));
        }
        return hashMap;
    }
}
