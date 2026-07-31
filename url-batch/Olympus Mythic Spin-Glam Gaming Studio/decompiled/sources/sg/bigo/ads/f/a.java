package sg.bigo.ads.f;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import sg.bigo.ads.ad.banner.h;
import sg.bigo.ads.ai.n;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.dh.a;
import sg.bigo.ads.dh.p;
import sg.bigo.ads.h.a;
import sg.bigo.ads.h.b;
import sg.bigo.ads.h.c;

/* loaded from: classes6.dex */
public final class a implements sg.bigo.ads.h.b, sg.bigo.ads.h.c {
    public boolean a;

    @Nullable
    public sg.bigo.ads.h.a b;
    final a.C1898a c = new a.C1898a();

    /* renamed from: sg.bigo.ads.f.a$a, reason: collision with other inner class name */
    final class C1893a implements b.a {
        private C1893a() {
        }

        /* synthetic */ C1893a(a aVar, byte b) {
            this();
        }

        @Override // sg.bigo.ads.h.b.a
        public final void a(WebView webView, int i) {
        }

        @Override // sg.bigo.ads.h.b.a
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar) {
            a.this.c.a(bVar, 6, 0L);
        }

        @Override // sg.bigo.ads.h.b.a
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
            a.this.c.a(bVar, 0, j);
        }

        @Override // sg.bigo.ads.h.b.a
        public final void b(@NonNull sg.bigo.ads.api.core.b bVar) {
        }

        @Override // sg.bigo.ads.h.b.a
        public final void b(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
            a.this.c.a(bVar, 2, j);
        }

        @Override // sg.bigo.ads.h.b.a
        public final void c() {
        }

        @Override // sg.bigo.ads.h.b.a
        public final void c(@NonNull sg.bigo.ads.api.core.b bVar) {
        }

        @Override // sg.bigo.ads.h.b.a
        public final void c(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
            a.this.c.a(bVar, 1, j);
        }

        @Override // sg.bigo.ads.h.b.a
        public final void d() {
        }

        @Override // sg.bigo.ads.h.b.a
        public final void d(@NonNull sg.bigo.ads.api.core.b bVar) {
        }

        @Override // sg.bigo.ads.h.b.a
        public final void d(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
            a.this.c.a(bVar, 5, j);
        }

        @Override // sg.bigo.ads.h.b.a
        public final void e(@NonNull sg.bigo.ads.api.core.b bVar) {
        }

        @Override // sg.bigo.ads.h.b.a
        public final boolean e() {
            return true;
        }
    }

    final class b implements c.b {
        private b() {
        }

        /* synthetic */ b(a aVar, byte b) {
            this();
        }

        @Override // sg.bigo.ads.h.c.b
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar) {
            a.this.c.a(bVar, 6, 0L);
        }

        @Override // sg.bigo.ads.h.c.b
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
            a.this.c.a(bVar, 5, j);
        }

        @Override // sg.bigo.ads.h.c.b
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar, long j, @Nullable String str, int i, @Nullable String str2) {
            a.this.c.a(bVar, 3, j, str, i, str2, null);
        }

        @Override // sg.bigo.ads.h.c.b
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar, long j, @Nullable String str, int i, @Nullable String str2, @Nullable String str3) {
            a.this.c.a(bVar, 4, j, str, i, str2, str3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(boolean z, @NonNull Ad ad, @NonNull n nVar, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.core.player.c cVar, @Nullable p pVar) {
        a.C1889a c1889a;
        sg.bigo.ads.dh.a next;
        if ((bVar.as() || nVar.t()) && !z) {
            if (bVar.y() == 3 || bVar.y() == 4 || bVar.y() == 12 || bVar.y() == 20) {
                a.C1889a c1889a2 = null;
                if (pVar != null) {
                    Iterator<sg.bigo.ads.dh.a> it = pVar.A.iterator();
                    a.C1889a c1889a3 = null;
                    while (it.hasNext() && ((next = it.next()) == null || (((c1889a2 = sg.bigo.ads.dh.a.a(next.b)) == null || !c1889a2.a()) && ((c1889a3 = next.a()) == null || !c1889a3.a())))) {
                    }
                    c1889a = c1889a3;
                } else {
                    c1889a = null;
                }
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (c1889a2 != null && c1889a2.a()) {
                    this.b = new sg.bigo.ads.g.c(ad, bVar, cVar, pVar, new b(this, objArr2 == true ? 1 : 0));
                }
                if (this.b == null && c1889a != null && c1889a.a()) {
                    this.b = new sg.bigo.ads.g.b(ad, bVar, cVar, pVar, c1889a, new C1893a(this, objArr == true ? 1 : 0));
                }
                this.a = this.b != null;
                nVar.l();
                nVar.n();
            }
        }
    }

    @Override // sg.bigo.ads.h.a
    @Nullable
    public final View a() {
        sg.bigo.ads.h.a aVar;
        if (this.a && (aVar = this.b) != null) {
            return aVar.a();
        }
        return null;
    }

    @Override // sg.bigo.ads.h.a
    public final void a(int i) {
        sg.bigo.ads.h.a aVar;
        if (this.a && (aVar = this.b) != null) {
            aVar.a(i);
        }
    }

    @Override // sg.bigo.ads.h.a
    public final void a(int i, int i2) {
        sg.bigo.ads.h.a aVar;
        if (this.a && (aVar = this.b) != null) {
            aVar.a(i, i2);
        }
    }

    public final void a(h hVar) {
        sg.bigo.ads.h.a aVar = this.b;
        if (aVar instanceof sg.bigo.ads.g.b) {
            ((sg.bigo.ads.g.b) aVar).h = hVar;
        }
    }

    public final void a(c.a aVar) {
        sg.bigo.ads.h.a aVar2 = this.b;
        if (aVar2 instanceof sg.bigo.ads.g.c) {
            ((sg.bigo.ads.g.c) aVar2).f = aVar;
        }
    }

    @Override // sg.bigo.ads.h.a
    public final boolean a(Context context) {
        sg.bigo.ads.h.a aVar;
        if (this.a && (aVar = this.b) != null) {
            return aVar.a(context);
        }
        return false;
    }

    @Override // sg.bigo.ads.h.a
    public final boolean b() {
        sg.bigo.ads.h.a aVar;
        if (this.a && (aVar = this.b) != null) {
            return aVar.b();
        }
        return false;
    }

    @Override // sg.bigo.ads.h.a
    public final void c() {
        sg.bigo.ads.h.a aVar = this.b;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // sg.bigo.ads.h.a
    public final void d() {
        sg.bigo.ads.h.a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // sg.bigo.ads.h.a
    public final void e() {
        sg.bigo.ads.h.a aVar = this.b;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // sg.bigo.ads.h.a
    public final void f() {
        sg.bigo.ads.h.a aVar = this.b;
        if (aVar != null) {
            aVar.f();
        }
    }
}
