package sg.bigo.ads.controller.loader;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CallSuper;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.ai.j;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.ai.n;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.api.core.h;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.cl.a;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.d.b;

/* loaded from: classes3.dex */
public abstract class AbstractAdLoader<U extends Ad, T extends sg.bigo.ads.api.b> implements d.a<U>, AdLoader<T> {
    private static final Map<String, Long> a = new ConcurrentHashMap();
    private static final ConcurrentHashMap<String, List<a>> b = new ConcurrentHashMap<>();

    @NonNull
    private final f<U> c;
    private final String d;

    abstract class a implements sg.bigo.ads.ce.d<U> {

        @Nullable
        sg.bigo.ads.api.core.b[] e;

        @Nullable
        sg.bigo.ads.api.core.b[] f;
        String h;

        @Nullable
        a.C1864a<sg.bigo.ads.api.b> j;
        sg.bigo.ads.api.b k;
        final AbstractAdLoader l;
        boolean c = false;
        boolean d = false;
        boolean g = false;
        private boolean a = false;
        final Runnable m = new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                a.C1864a<sg.bigo.ads.api.b> c1864a = aVar.j;
                if (c1864a == null || aVar.g) {
                    return;
                }
                aVar.c = true;
                c1864a.c = true;
                if (c1864a.f == 0) {
                    c1864a.f = c1864a.e;
                }
                if (l.a(aVar.e)) {
                    a aVar2 = a.this;
                    sg.bigo.ads.controller.loader.a.a(aVar2.e, aVar2.j.f);
                    a aVar3 = a.this;
                    int i = aVar3.c ? 2 : aVar3.d ? 4 : 1;
                    a.C1864a<sg.bigo.ads.api.b> c1864a2 = aVar3.j;
                    sg.bigo.ads.controller.loader.a.a(aVar3.e, i, c1864a2 == null ? 1 : c1864a2.f, true);
                }
                AbstractAdLoader<U, T>.a aVar4 = a.this;
                AbstractAdLoader.this.a(aVar4, 1011, 10206, "Ad request is timeout due to bad network.", new Pair<>(aVar4.j.a, null));
            }
        };
        final long i = SystemClock.elapsedRealtime();

        protected a(AbstractAdLoader abstractAdLoader, sg.bigo.ads.api.b bVar, String str) {
            this.h = str;
            this.l = abstractAdLoader;
            this.k = bVar;
        }

        public final void a() {
            sg.bigo.ads.bh.d.a(this.m);
            if (this.a) {
                return;
            }
            this.a = true;
            a.C1864a<sg.bigo.ads.api.b> c1864a = this.j;
            if (c1864a == null) {
                return;
            }
            String str = c1864a.a.g.b;
        }

        public final String b() {
            a.C1864a<sg.bigo.ads.api.b> c1864a = this.j;
            String d = c1864a == null ? null : c1864a.a.d();
            return TextUtils.isEmpty(d) ? this.h : d;
        }
    }

    public interface b<U extends Ad, T extends sg.bigo.ads.api.b> extends d.a<U> {
        AbstractAdLoader<U, T> a();
    }

    public AbstractAdLoader(AdLoadListener<U> adLoadListener, String str) {
        if (adLoadListener == null) {
            this.c = new f<>();
        } else {
            this.c = new f<>(adLoadListener);
        }
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, AbstractAdLoader<U, T>.a aVar, U u, int i, int i2, String str2) {
        if (!TextUtils.isEmpty(str)) {
            a.remove(str);
        }
        aVar.a();
        aVar.g = true;
        b(aVar.b(), aVar);
        if (aVar.c || aVar.d) {
            return;
        }
        a(str, aVar, sg.bigo.ads.controller.loader.a.a(u), 0, i, i2, str2, false, u);
        a((AbstractAdLoader<U, T>) u, i, i2, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final AbstractAdLoader<U, T>.a aVar, final sg.bigo.ads.api.core.b[] bVarArr, final int i, final int i2, final int i3, final String str2, final boolean z, final Ad ad) {
        final boolean z2;
        final String str3;
        j jVar;
        final String b2 = TextUtils.isEmpty(str) ? aVar.b() : str;
        if (TextUtils.isEmpty(b2) || (jVar = k.a) == null) {
            z2 = false;
            str3 = null;
        } else {
            sg.bigo.ads.ai.b q = jVar.q();
            boolean c = q.c(b2);
            str3 = q.d(b2);
            z2 = c;
        }
        sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.7
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:100:0x00d2  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x011a  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0139  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x014b  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x0176  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x017c  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x0181  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x0133  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x00f1  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                int i4;
                int i5;
                int i6;
                String str4;
                int i7;
                int i8;
                int a2;
                h ab;
                sg.bigo.ads.api.b bVar;
                String str5;
                String str6;
                sg.bigo.ads.api.core.b bVar2;
                q Z;
                boolean z3 = !z && i3 == 10206;
                if (i3 == 10213) {
                    i4 = 3;
                } else {
                    a aVar2 = aVar;
                    i4 = aVar2.c ? 2 : aVar2.d ? 4 : 1;
                }
                a aVar3 = aVar;
                a.C1864a<sg.bigo.ads.api.b> c1864a = aVar3.j;
                int i9 = c1864a == null ? 0 : c1864a.f;
                sg.bigo.ads.api.core.b[] bVarArr2 = bVarArr;
                if (bVarArr2 == null) {
                    bVarArr2 = aVar3.e;
                }
                if (bVarArr2 != null) {
                    sg.bigo.ads.controller.loader.a.a(bVarArr2, i4, i9, false);
                    sg.bigo.ads.api.core.b bVar3 = (sg.bigo.ads.api.core.b) l.b(bVarArr2);
                    int V = bVar3 != null ? bVar3.V() : 0;
                    sg.bigo.ads.api.core.b bVar4 = (sg.bigo.ads.api.core.b) l.b(bVarArr2);
                    int S = bVar4 != null ? bVar4.S() : 0;
                    sg.bigo.ads.api.core.b bVar5 = (sg.bigo.ads.api.core.b) l.b(bVarArr2);
                    String valueOf = String.valueOf(bVar5 != null ? bVar5.W() : 0);
                    if (V == 1 && i4 == 1) {
                        i6 = 4;
                    } else if (V == 1 && S == 0) {
                        i5 = 1;
                        i6 = i4;
                        str4 = valueOf;
                        i7 = V;
                    } else {
                        i6 = i4;
                    }
                    str4 = valueOf;
                    i7 = V;
                    i5 = S;
                } else {
                    i5 = 0;
                    i6 = i4;
                    str4 = "0";
                    i7 = 0;
                }
                if (!l.a(aVar.f)) {
                    a2 = sg.bigo.ads.controller.loader.a.a(aVar.f);
                } else {
                    if (l.a(aVar.e)) {
                        i8 = 0;
                        if (!z2 || i7 == 1 || z3) {
                            sg.bigo.ads.api.core.b bVar6 = (sg.bigo.ads.api.core.b) l.b(bVarArr);
                            ab = bVar6 == null ? bVar6.ab() : null;
                            if (ab == null) {
                                str5 = ab.c();
                                a.C1864a<sg.bigo.ads.api.b> c1864a2 = aVar.j;
                                str6 = c1864a2 == null ? "0" : c1864a2.a.g.b;
                                if (TextUtils.equals(str5, str6)) {
                                    str6 = "0";
                                }
                            } else {
                                a aVar4 = aVar;
                                a.C1864a<sg.bigo.ads.api.b> c1864a3 = aVar4.j;
                                if (c1864a3 == null) {
                                    bVar = aVar4.k;
                                    if (bVar == null) {
                                        str5 = "0";
                                        str6 = null;
                                    }
                                } else {
                                    bVar = c1864a3.a;
                                }
                                str5 = bVar.g.b;
                                str6 = null;
                            }
                            bVar2 = (sg.bigo.ads.api.core.b) l.b(bVarArr);
                            Z = bVar2 != null ? null : bVar2.Z();
                            if (Z == null) {
                                a.C1864a<sg.bigo.ads.api.b> c1864a4 = aVar.j;
                                Z = c1864a4 == null ? null : c1864a4.g;
                            }
                            Ad ad2 = ad;
                            p b_ = !(ad2 instanceof sg.bigo.ads.aj.a) ? ((sg.bigo.ads.aj.a) ad2).b_() : null;
                            String str7 = b2;
                            if (bVar2 == null) {
                                bVar2 = (sg.bigo.ads.api.core.b) l.b(aVar.e);
                            }
                            String str8 = str3;
                            if (str5 == null) {
                                str5 = "0";
                            }
                            sg.bigo.ads.da.b.a(str7, bVar2, str8, str5, str6 != null ? str6 : "0", i, i2, i3, str2, SystemClock.elapsedRealtime() - aVar.i, i7, str4, i5, i6, i9, i8, Z == null && Z.a, Z == null && Z.b, Z != null ? Z.c : 4, Z == null ? Z.d : null, b_);
                        }
                        return;
                    }
                    a2 = sg.bigo.ads.controller.loader.a.a(aVar.e);
                }
                i8 = a2;
                if (z2) {
                }
                sg.bigo.ads.api.core.b bVar62 = (sg.bigo.ads.api.core.b) l.b(bVarArr);
                if (bVar62 == null) {
                }
                if (ab == null) {
                }
                bVar2 = (sg.bigo.ads.api.core.b) l.b(bVarArr);
                if (bVar2 != null) {
                }
                if (Z == null) {
                }
                Ad ad22 = ad;
                if (!(ad22 instanceof sg.bigo.ads.aj.a)) {
                }
                String str72 = b2;
                if (bVar2 == null) {
                }
                String str82 = str3;
                if (str5 == null) {
                }
                sg.bigo.ads.da.b.a(str72, bVar2, str82, str5, str6 != null ? str6 : "0", i, i2, i3, str2, SystemClock.elapsedRealtime() - aVar.i, i7, str4, i5, i6, i9, i8, Z == null && Z.a, Z == null && Z.b, Z != null ? Z.c : 4, Z == null ? Z.d : null, b_);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final n nVar, final String str, @NonNull final AbstractAdLoader<U, T>.a aVar, final Ad ad) {
        sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.4
            @Override // java.lang.Runnable
            public final void run() {
                if (aVar.c) {
                    b.a.a.a(nVar, ad);
                    a.C1864a<sg.bigo.ads.api.b> c1864a = aVar.j;
                    if (c1864a != null) {
                        String str2 = c1864a.a.g.b;
                    }
                    String.valueOf(ad);
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    AbstractAdLoader.a.remove(str);
                }
                a.C1864a<sg.bigo.ads.api.b> c1864a2 = aVar.j;
                sg.bigo.ads.controller.loader.a.a(ad, c1864a2 == null ? "0" : c1864a2.a.g.b);
                a aVar2 = aVar;
                a.C1864a<sg.bigo.ads.api.b> c1864a3 = aVar2.j;
                if (c1864a3 != null) {
                    c1864a3.d = true;
                    if (c1864a3.f == 0) {
                        c1864a3.f = c1864a3.e;
                    }
                }
                aVar2.g = true;
                AbstractAdLoader.b(str, aVar2);
                aVar.a();
                aVar.d = true;
                sg.bigo.ads.api.core.b[] a2 = sg.bigo.ads.controller.loader.a.a(ad);
                a aVar3 = aVar;
                aVar3.f = a2;
                a.C1864a<sg.bigo.ads.api.b> c1864a4 = aVar3.j;
                sg.bigo.ads.controller.loader.a.a(a2, 4, c1864a4 == null ? 1 : c1864a4.f, true);
                AbstractAdLoader.this.a(str, aVar, a2, 1, 0, 0, null, true, ad);
                sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        aVar.l.a(ad, true);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Ad ad, boolean z) {
        boolean z2 = ad instanceof sg.bigo.ads.aj.a;
        if (z2) {
            ((sg.bigo.ads.aj.a) ad).b();
        }
        if (z) {
            if (z2) {
                ((sg.bigo.ads.aj.a) ad).c();
            }
            this.c.onAdLoaded(ad);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(T t) {
        long j;
        a.C1864a<sg.bigo.ads.api.b> a2;
        j jVar;
        t.b = 0;
        t.a(this.d);
        final String d = t.d();
        AbstractAdLoader<U, T>.a aVar = new AbstractAdLoader<U, T>.a(this, t, d) { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.1
            @Override // sg.bigo.ads.ce.e
            public final /* synthetic */ void a(final int i, final int i2, final int i3, @NonNull final String str, @Nullable Pair<sg.bigo.ads.api.b, n> pair) {
                final Pair<sg.bigo.ads.api.b, n> pair2 = pair;
                sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        j jVar2;
                        j jVar3;
                        int i4 = i3;
                        if (AnonymousClass1.this.c && (jVar3 = k.a) != null) {
                            boolean b2 = jVar3.q().b(d);
                            int f = jVar3.q().f(d);
                            if (!b2 || f > 2) {
                                if (i4 != 10207 && i4 != 10208) {
                                    i4 = 10211;
                                }
                                int i5 = i4;
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                AbstractAdLoader.this.a(this, 1011, i5, str, anonymousClass1.j == null ? null : new Pair<>(AnonymousClass1.this.j.a, null));
                                return;
                            }
                        }
                        if (AnonymousClass1.this.d && (jVar2 = k.a) != null) {
                            boolean b3 = jVar2.q().b(d);
                            int g = jVar2.q().g(d);
                            if (!b3 || g > 2) {
                                if (i4 != 10207 && i4 != 10208) {
                                    i4 = 10212;
                                }
                                int i6 = i4;
                                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                AbstractAdLoader.this.a(this, 1011, i6, str, anonymousClass12.j == null ? null : new Pair<>(AnonymousClass1.this.j.a, null));
                                return;
                            }
                        }
                        AbstractAdLoader.this.a(this, i2, i4, str, pair2);
                    }
                });
            }

            @Override // sg.bigo.ads.ce.e
            public final /* synthetic */ void a(int i, @NonNull sg.bigo.ads.api.b bVar, @NonNull g[] gVarArr) {
                q qVar;
                q qVar2;
                q qVar3;
                q qVar4;
                g gVar;
                j jVar2;
                j jVar3;
                sg.bigo.ads.api.b bVar2 = bVar;
                g[] gVarArr2 = gVarArr;
                sg.bigo.ads.api.core.b[] a3 = sg.bigo.ads.controller.loader.a.a(gVarArr2);
                this.e = a3;
                a.C1864a<sg.bigo.ads.api.b> c1864a = this.j;
                if (c1864a != null) {
                    sg.bigo.ads.controller.loader.a.a(a3, c1864a.f);
                    sg.bigo.ads.api.core.b[] bVarArr = this.e;
                    q qVar5 = this.j.g;
                    if (!l.a(bVarArr)) {
                        for (sg.bigo.ads.api.core.b bVar3 : bVarArr) {
                            if (bVar3 != null) {
                                bVar3.a(qVar5);
                            }
                        }
                    }
                }
                bVar2.g.a();
                if (this.c && (jVar3 = k.a) != null) {
                    boolean b2 = jVar3.q().b(d);
                    int f = jVar3.q().f(d);
                    if (!b2 || f > 2) {
                        AbstractAdLoader.this.a(this, 1011, 10209, "no fill", this.j == null ? null : new Pair<>(this.j.a, null));
                        return;
                    }
                }
                if (this.d && (jVar2 = k.a) != null) {
                    boolean b3 = jVar2.q().b(d);
                    int g = jVar2.q().g(d);
                    if (!b3 || g > 2) {
                        AbstractAdLoader.this.a(this, 1011, 10210, "no fill", this.j == null ? null : new Pair<>(this.j.a, null));
                        return;
                    }
                }
                n i2 = bVar2.i();
                if (i2 == null && (gVar = (g) l.b(gVarArr2)) != null) {
                    i2 = gVar.b;
                }
                n nVar = i2;
                sg.bigo.ads.api.core.b[] a4 = sg.bigo.ads.controller.loader.a.a(gVarArr2);
                sg.bigo.ads.api.core.b bVar4 = (sg.bigo.ads.api.core.b) l.b(a4);
                if (nVar != null && bVar4 != null) {
                    boolean z = nVar.s() && bVar4.ad();
                    int i3 = 4;
                    int i4 = this.c ? 2 : this.d ? 4 : 1;
                    a.C1864a<sg.bigo.ads.api.b> c1864a2 = this.j;
                    int i5 = c1864a2 != null ? c1864a2.f : 0;
                    int i6 = (c1864a2 == null || (qVar4 = c1864a2.g) == null) ? 3 : qVar4.a ? 1 : 0;
                    boolean z2 = (c1864a2 == null || (qVar3 = c1864a2.g) == null || !qVar3.b) ? false : true;
                    if (c1864a2 != null && (qVar2 = c1864a2.g) != null) {
                        i3 = qVar2.c;
                    }
                    sg.bigo.ads.da.b.a(a4, bVar2, z, i4, i5, i6, z2, i3, (c1864a2 == null || (qVar = c1864a2.g) == null) ? null : qVar.d);
                }
                AbstractAdLoader.this.a(this, i, nVar, bVar2, gVarArr2);
            }

            @Override // sg.bigo.ads.ce.d
            public final void a(@NonNull n nVar, @NonNull U u) {
                AbstractAdLoader.this.a(nVar, d, this, u);
            }
        };
        if (a(d)) {
            a(aVar, 1012, 10213, "The ad is loading", new Pair<>(t, null));
            return;
        }
        if (!TextUtils.isEmpty(d)) {
            a.put(d, Long.valueOf(SystemClock.elapsedRealtime()));
        }
        if (!TextUtils.isEmpty(d) && (jVar = k.a) != null) {
            sg.bigo.ads.ai.b q = jVar.q();
            if (q.b(d)) {
                ConcurrentHashMap<String, List<a>> concurrentHashMap = b;
                List<a> list = concurrentHashMap.get(d);
                if (list == null) {
                    list = new CopyOnWriteArrayList<>();
                    concurrentHashMap.put(d, list);
                }
                list.add(0, aVar);
                j = q.e(d);
                a2 = BigoAdSdk.a(t, aVar);
                if (a2 == null) {
                    aVar.j = a2;
                    if (j > -1) {
                        a(aVar, j);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        j = -1;
        a2 = BigoAdSdk.a(t, aVar);
        if (a2 == null) {
        }
    }

    private static void a(AbstractAdLoader<U, T>.a aVar, long j) {
        sg.bigo.ads.bh.d.a(3, aVar.m, j * 1000);
    }

    private static boolean a(String str) {
        j jVar;
        if (!TextUtils.isEmpty(str) && (jVar = k.a) != null && jVar.q().i(str)) {
            long j = k.a.q().j(str);
            if (j < 0) {
                return false;
            }
            if (j == 0 && a.containsKey(str)) {
                return true;
            }
            long j2 = j * 1000;
            Long l = a.get(str);
            if (l != null && SystemClock.elapsedRealtime() - l.longValue() < j2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, AbstractAdLoader<U, T>.a aVar) {
        List<a> list;
        if (TextUtils.isEmpty(str) || (list = b.get(str)) == null || list.size() <= 0) {
            return;
        }
        list.remove(aVar);
    }

    private boolean b(final T t) {
        String[] split;
        String str;
        boolean isInitialized = BigoAdSdk.isInitialized();
        boolean z = !isInitialized;
        if (!isInitialized) {
            Activity b2 = sg.bigo.ads.at.b.b();
            r4 = b2 != null ? b2.getApplicationContext() : null;
            if (r4 == null) {
                r4 = sg.bigo.ads.at.b.a();
            }
            z = r4 != null;
        }
        String str2 = "";
        if (z) {
            String d = t.d();
            if (d != null && !d.isEmpty() && (split = d.split("-")) != null && split.length >= 2 && (str = split[0]) != null && !str.isEmpty()) {
                str2 = split[0];
            }
            z = (str2 == null || str2.isEmpty()) ? false : true;
        }
        if (z) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        AbstractAdLoader.this.a((AbstractAdLoader) t);
                    }
                }
            }, 1000L);
            try {
                AdConfig.Builder builder = new AdConfig.Builder();
                builder.setAppId(str2);
                BigoAdSdk.initialize(r4.getApplicationContext(), builder.build(), new BigoAdSdk.InitListener() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.3
                    @Override // sg.bigo.ads.BigoAdSdk.InitListener
                    public final void onInitialized() {
                        if (atomicBoolean.compareAndSet(false, true)) {
                            AbstractAdLoader.this.a((AbstractAdLoader) t);
                        }
                    }
                });
            } catch (Exception unused) {
                if (atomicBoolean.compareAndSet(false, true)) {
                    a((AbstractAdLoader<U, T>) t);
                }
            }
        }
        return z;
    }

    protected U a(@NonNull sg.bigo.ads.api.b bVar, g... gVarArr) {
        return null;
    }

    protected U a(g gVar) {
        return null;
    }

    @Override // sg.bigo.ads.aj.d.a
    public final void a(U u) {
        a((Ad) u, true);
    }

    @Override // sg.bigo.ads.aj.d.a
    public final void a(U u, int i, int i2, String str) {
        if (u instanceof sg.bigo.ads.aj.a) {
            ((sg.bigo.ads.aj.a) u).a(i, i2, str);
        }
        sg.bigo.ads.bn.a.a(2, 5, "", "Failed to load ads: (" + i + ") " + str);
        this.c.onError(new AdError(i, str));
    }

    @Override // sg.bigo.ads.aj.d.a
    public final void a(U u, boolean z, int i, int i2, String str, boolean z2) {
    }

    public final void a(AbstractAdLoader<U, T>.a aVar, int i, int i2, @NonNull String str, @Nullable Pair<sg.bigo.ads.api.b, n> pair) {
        n nVar;
        sg.bigo.ads.api.b bVar;
        String str2;
        boolean z;
        q qVar;
        q qVar2;
        q qVar3;
        q qVar4;
        String str3 = null;
        if (pair != null) {
            bVar = (sg.bigo.ads.api.b) pair.first;
            nVar = (n) pair.second;
        } else {
            nVar = null;
            bVar = null;
        }
        if (bVar != null) {
            bVar.g.a();
        }
        String l = nVar != null ? nVar.l() : null;
        if (TextUtils.isEmpty(l) && bVar != null) {
            l = bVar.d();
        }
        if (TextUtils.isEmpty(l)) {
            l = aVar.h;
        }
        boolean z2 = i2 == 10213;
        if (!z2 && !TextUtils.isEmpty(l)) {
            a.remove(l);
        }
        boolean z3 = i == 1011;
        boolean z4 = i2 == 10206;
        if (z4) {
            str2 = l;
            z = true;
        } else {
            int i3 = z2 ? 3 : aVar.c ? 2 : aVar.d ? 4 : 1;
            a.C1864a<sg.bigo.ads.api.b> c1864a = aVar.j;
            int i4 = c1864a != null ? c1864a.f : 0;
            int i5 = (c1864a == null || (qVar4 = c1864a.g) == null) ? 3 : qVar4.a ? 1 : 0;
            boolean z5 = (c1864a == null || (qVar3 = c1864a.g) == null || !qVar3.b) ? false : true;
            int i6 = (c1864a == null || (qVar2 = c1864a.g) == null) ? 4 : qVar2.c;
            if (c1864a != null && (qVar = c1864a.g) != null) {
                str3 = qVar.d;
            }
            str2 = l;
            z = true;
            sg.bigo.ads.da.b.a(nVar, bVar, i, i2, str, i3, i4, i5, z5, i6, str3);
        }
        aVar.a();
        aVar.g = z;
        b(aVar.b(), aVar);
        if (z4 || !(aVar.c || aVar.d || z3)) {
            a(str2, aVar, null, 0, i, i2, str, false, null);
            this.c.onError(new AdError(i, str));
        }
    }

    @CallSuper
    public final void a(final AbstractAdLoader<U, T>.a aVar, final int i, final n nVar, @NonNull sg.bigo.ads.api.b bVar, @NonNull g... gVarArr) {
        U a2 = bVar.f() ? a(bVar, gVarArr) : a((g) l.b(gVarArr));
        if (a2 == null) {
            a(aVar.b(), aVar, (AbstractAdLoader<U, T>.a) null, 1005, 1009, "Unmatched ad type.");
            return;
        }
        if (!(a2 instanceof d)) {
            a(nVar == null ? null : nVar.l(), aVar, (AbstractAdLoader<U, T>.a) a2, 1024, 1010, "Unknown ad.");
            return;
        }
        a.C1864a<sg.bigo.ads.api.b> c1864a = aVar.j;
        if (c1864a != null) {
            c1864a.e = 3;
        }
        sg.bigo.ads.api.core.b[] a3 = sg.bigo.ads.controller.loader.a.a(a2);
        int i2 = aVar.c ? 2 : aVar.d ? 4 : 1;
        a.C1864a<sg.bigo.ads.api.b> c1864a2 = aVar.j;
        sg.bigo.ads.controller.loader.a.a(a3, i2, c1864a2 == null ? 0 : c1864a2.f, false);
        ((d) a2).a(new b<U, T>() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.5
            @Override // sg.bigo.ads.controller.loader.AbstractAdLoader.b
            public final AbstractAdLoader<U, T> a() {
                return AbstractAdLoader.this;
            }

            @Override // sg.bigo.ads.aj.d.a
            public final void a(final U u) {
                final AbstractAdLoader abstractAdLoader = AbstractAdLoader.this;
                final a aVar2 = aVar;
                final int i3 = i;
                final n nVar2 = nVar;
                sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.loader.AbstractAdLoader.6
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        n nVar3 = nVar2;
                        String l = nVar3 == null ? null : nVar3.l();
                        if (!TextUtils.isEmpty(l)) {
                            AbstractAdLoader.a.remove(l);
                        }
                        a aVar3 = aVar2;
                        aVar3.g = true;
                        AbstractAdLoader.b(l, aVar3);
                        aVar2.a();
                        AbstractAdLoader<U, T>.a aVar4 = aVar2;
                        if (aVar4.c) {
                            AbstractAdLoader.this.a(aVar4, nVar2, u, 1);
                        } else if (aVar4.d) {
                            AbstractAdLoader.this.a(aVar4, nVar2, u, 2);
                        } else {
                            AbstractAdLoader.this.a(l, aVar4, sg.bigo.ads.controller.loader.a.a(u), 1, 0, 0, null, true, u);
                            AbstractAdLoader.this.a((AbstractAdLoader) u);
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.aj.d.a
            public final void a(U u, int i3, int i4, String str) {
                AbstractAdLoader abstractAdLoader = AbstractAdLoader.this;
                n nVar2 = nVar;
                abstractAdLoader.a(nVar2 == null ? null : nVar2.l(), aVar, (a) u, i3, i4, str);
            }

            @Override // sg.bigo.ads.aj.d.a
            public final void a(U u, boolean z, int i3, int i4, String str, boolean z2) {
            }
        });
    }

    @CallSuper
    public final void a(AbstractAdLoader<U, T>.a aVar, n nVar, @NonNull Ad ad, int i) {
        List<a> list;
        a.C1864a<sg.bigo.ads.api.b> c1864a = aVar.j;
        if (c1864a != null) {
            String str = c1864a.a.g.b;
        }
        if (nVar != null) {
            String l = nVar.l();
            if (TextUtils.isEmpty(l)) {
                l = aVar.b();
            }
            if (TextUtils.isEmpty(l)) {
                return;
            }
            sg.bigo.ads.api.core.b[] a2 = sg.bigo.ads.controller.loader.a.a(ad);
            for (int i2 = 0; a2 != null && i2 < a2.length; i2++) {
                sg.bigo.ads.api.core.b bVar = a2[i2];
                bVar.U();
                bVar.c(i);
                bVar.T();
            }
            a remove = (TextUtils.isEmpty(l) || (list = b.get(l)) == null || list.size() <= 0) ? null : list.remove(0);
            if (remove != null) {
                a(nVar, l, remove, ad);
                return;
            }
            String.valueOf(ad);
            a(ad, false);
            b.a.a.a(nVar, ad);
        }
    }

    @Keep
    @CallSuper
    public void loadAd(T t) {
        if (b(t)) {
            return;
        }
        a((AbstractAdLoader<U, T>) t);
    }
}
