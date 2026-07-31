package com.five_corp.ad;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.five_corp.ad.AdActivity;
import com.five_corp.ad.internal.view.H;
import com.five_corp.ad.internal.view.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

/* loaded from: classes5.dex */
public final class f implements com.five_corp.ad.internal.system.d, com.five_corp.ad.internal.beacon.h, com.five_corp.ad.internal.soundstate.b, com.five_corp.ad.internal.layouter.c, com.five_corp.ad.internal.hub.ad_instance.c, com.five_corp.ad.internal.hub.ad_instance.f, com.five_corp.ad.internal.hub.ad_instance.g, com.five_corp.ad.internal.hub.ad_instance.h, com.five_corp.ad.internal.hub.ad_instance.i, AdActivity.Callback, com.five_corp.ad.internal.hub.ad_instance.a, com.five_corp.ad.internal.hub.ad_instance.d {
    public final com.five_corp.ad.internal.hub.ad_instance.e A;
    public final Context a;
    public final k b;
    public final com.five_corp.ad.internal.view.l c;
    public final Handler d;
    public final com.five_corp.ad.internal.http.auxcache.h e;
    public final com.five_corp.ad.internal.h f;
    public final com.five_corp.ad.internal.system.b g;
    public final com.five_corp.ad.internal.view.u h;
    public final com.five_corp.ad.internal.viewability.a i;
    public final com.five_corp.ad.internal.context.h l;
    public final com.five_corp.ad.internal.soundstate.c n;
    public final com.five_corp.ad.internal.q o;
    public final com.five_corp.ad.internal.handler.a p;
    public final com.five_corp.ad.internal.handler.b q;
    public final com.five_corp.ad.internal.viewability.b r;
    public final com.five_corp.ad.internal.beacon.g t;
    public final com.five_corp.ad.internal.layouter.i x;
    public final com.five_corp.ad.internal.a y;
    public final com.five_corp.ad.internal.hub.global.b z;
    public boolean j = false;
    public long k = Long.MAX_VALUE;
    public final Object m = new Object();
    public boolean s = false;
    public double u = 0.0d;
    public int v = 1;
    public com.five_corp.ad.internal.fullscreen.c w = null;

    public f(Context context, k kVar, FrameLayout frameLayout, com.five_corp.ad.internal.r rVar, com.five_corp.ad.internal.soundstate.c cVar, com.five_corp.ad.internal.context.h hVar, com.five_corp.ad.internal.hub.global.b bVar, com.five_corp.ad.internal.hub.ad_instance.e eVar) {
        com.five_corp.ad.internal.soundstate.a aVar;
        ArrayList arrayList;
        com.five_corp.ad.internal.view.u vVar;
        this.a = context;
        this.b = kVar;
        this.l = hVar;
        this.z = bVar;
        this.A = eVar;
        this.e = kVar.p;
        com.five_corp.ad.internal.h hVar2 = new com.five_corp.ad.internal.h(eVar, this);
        this.f = hVar2;
        eVar.l.add(hVar2);
        this.g = kVar.o;
        this.d = new Handler(Looper.getMainLooper());
        com.five_corp.ad.internal.context.s sVar = hVar.c;
        com.five_corp.ad.internal.context.g gVar = sVar.a;
        com.five_corp.ad.internal.ad.a aVar2 = hVar.a;
        CreativeType creativeType = aVar2.a;
        this.y = new com.five_corp.ad.internal.a(eVar, bVar, gVar, new com.five_corp.ad.internal.beacon.b(aVar2.b, hVar.h, hVar.d.a));
        this.n = cVar;
        com.five_corp.ad.internal.media_config.c cVar2 = sVar.c;
        synchronized (cVar.a) {
            com.five_corp.ad.internal.soundstate.a aVar3 = cVar.b;
            aVar = new com.five_corp.ad.internal.soundstate.a(aVar3.a, aVar3.b, cVar2.d, aVar3.d);
            cVar.b = aVar;
            arrayList = new ArrayList(cVar.c);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((f) ((com.five_corp.ad.internal.soundstate.b) it.next())).b(aVar);
        }
        com.five_corp.ad.internal.soundstate.a a = this.n.a(this);
        com.five_corp.ad.internal.layouter.i iVar = new com.five_corp.ad.internal.layouter.i(com.five_corp.ad.internal.layouter.g.a(0, 0, false, a.a(), false));
        this.x = iVar;
        Context context2 = this.a;
        com.five_corp.ad.internal.hub.ad_instance.e eVar2 = this.A;
        int i = com.five_corp.ad.internal.view.u.h;
        CreativeType creativeType2 = hVar.a.a;
        int i2 = com.five_corp.ad.internal.view.t.a[creativeType2.ordinal()];
        if (i2 == 1) {
            vVar = new v(context2, hVar, this, eVar2);
        } else {
            if (i2 != 2) {
                throw new RuntimeException("Unknown CreativeType: " + creativeType2.value);
            }
            vVar = new com.five_corp.ad.internal.view.s(context2, hVar, this, eVar2);
        }
        com.five_corp.ad.internal.view.u uVar = vVar;
        this.h = uVar;
        uVar.a(a.a());
        com.five_corp.ad.internal.viewability.a aVar4 = new com.five_corp.ad.internal.viewability.a(this.a, hVar, uVar);
        this.i = aVar4;
        this.r = new com.five_corp.ad.internal.viewability.b(aVar4, hVar.a.z, hVar.c.c.a, this.z, this.b.m);
        this.t = new com.five_corp.ad.internal.beacon.g(hVar.a, this.A, this);
        if (frameLayout == null || hVar.d.b == null) {
            this.c = null;
        } else {
            com.five_corp.ad.internal.view.l lVar = new com.five_corp.ad.internal.view.l(this.a, this.A, uVar, this, hVar, hVar.b, aVar4, hVar.d.b, iVar);
            this.c = lVar;
            frameLayout.addView(lVar);
            lVar.b.a();
            aVar4.e = lVar;
        }
        k kVar2 = this.b;
        com.five_corp.ad.internal.q qVar = new com.five_corp.ad.internal.q(rVar, kVar2.b, this.n, kVar2.m, hVar, this.z);
        this.o = qVar;
        Context context3 = this.a;
        com.five_corp.ad.internal.ad.a aVar5 = hVar.a;
        com.five_corp.ad.internal.ad.g gVar2 = aVar5.f;
        com.five_corp.ad.internal.hub.ad_instance.e eVar3 = this.A;
        this.p = new com.five_corp.ad.internal.handler.a(context3, qVar, gVar2, eVar3);
        this.q = new com.five_corp.ad.internal.handler.b(context3, hVar.e, aVar5.m, aVar5.g, this.b.l, eVar3);
    }

    public static f a(Context context, k kVar, FrameLayout frameLayout, com.five_corp.ad.internal.r rVar, com.five_corp.ad.internal.soundstate.c cVar, com.five_corp.ad.internal.context.h hVar, com.five_corp.ad.internal.hub.global.b bVar, com.five_corp.ad.internal.hub.ad_instance.e eVar) {
        f fVar = new f(context, kVar, frameLayout, rVar, cVar, hVar, bVar, eVar);
        com.five_corp.ad.internal.a aVar = fVar.y;
        aVar.a.k.add(aVar);
        com.five_corp.ad.internal.system.b bVar2 = fVar.g;
        com.five_corp.ad.internal.h hVar2 = fVar.f;
        bVar2.a.a.add(new WeakReference(hVar2));
        if (!bVar2.b) {
            boolean z = hVar2.b && hVar2.c;
            if (hVar2.c) {
                hVar2.c = false;
                if (z) {
                    hVar2.a.l();
                }
            }
        } else if (!hVar2.c) {
            hVar2.c = true;
            if (hVar2.b) {
                hVar2.a.k();
            }
        }
        eVar.j.add(fVar);
        eVar.f.add(fVar);
        eVar.b.add(fVar);
        eVar.c.add(fVar);
        eVar.d.add(fVar);
        eVar.a.add(fVar);
        eVar.e.add(fVar);
        return fVar;
    }

    @Override // com.five_corp.ad.internal.hub.ad_instance.c
    public final void b() {
        this.z.a(new com.five_corp.ad.internal.beacon.a(this.l, 5, this.n.a(), 0L, 0.0d));
    }

    @Override // com.five_corp.ad.internal.layouter.c
    public final void c() {
        i();
    }

    @Override // com.five_corp.ad.internal.layouter.c
    public final void d() {
        int currentPositionMs = this.h.getCurrentPositionMs();
        this.h.e();
        this.o.p(currentPositionMs, this.u);
    }

    @Override // com.five_corp.ad.internal.layouter.c
    public final void e() {
        this.A.a(com.five_corp.ad.internal.logger.b.a("PLAY_IN_FULLSCREEN feature is currently not supported (AdController)."));
        m();
    }

    public final void f() {
        com.five_corp.ad.internal.system.b bVar = this.g;
        com.five_corp.ad.internal.h hVar = this.f;
        com.five_corp.ad.internal.util.d dVar = bVar.a;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = dVar.a.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            Object obj = weakReference.get();
            if (obj != null && obj != hVar) {
                arrayList.add(weakReference);
            }
        }
        dVar.a = arrayList;
        this.h.d();
        com.five_corp.ad.internal.view.l lVar = this.c;
        ViewGroup viewGroup = lVar != null ? (ViewGroup) lVar.getParent() : null;
        H.a(this.c);
        if (viewGroup != null) {
            viewGroup.requestLayout();
        }
        this.l.f.b = false;
    }

    public final void g() {
        if (this.w == null) {
            return;
        }
        int currentPositionMs = this.h.getCurrentPositionMs();
        f();
        com.five_corp.ad.internal.fullscreen.c cVar = this.w;
        if (!cVar.m.getAndSet(true)) {
            cVar.g.removeAllViews();
            cVar.k = null;
            cVar.l = null;
            cVar.a.finish();
        }
        this.w = null;
        this.o.l(currentPositionMs, this.u);
    }

    public final void h() {
        if (this.w == null) {
            return;
        }
        int currentPositionMs = this.h.getCurrentPositionMs();
        a(currentPositionMs);
        com.five_corp.ad.internal.fullscreen.c cVar = this.w;
        if (!cVar.m.getAndSet(true)) {
            cVar.g.removeAllViews();
            cVar.k = null;
            cVar.l = null;
            cVar.a.finish();
        }
        this.w = null;
        long j = currentPositionMs;
        this.o.l(j, this.u);
        if (this.l.e == com.five_corp.ad.internal.context.f.VIDEO_REWARD) {
            this.o.r(j, this.u);
        }
    }

    public final void i() {
        com.five_corp.ad.internal.q qVar = this.o;
        String a = qVar.c.a(new com.five_corp.ad.internal.beacon.a(qVar.f, 20, qVar.d.a(), this.h.getCurrentPositionMs(), this.u));
        com.five_corp.ad.internal.handler.b bVar = this.q;
        com.five_corp.ad.internal.ad.information_icon.e eVar = bVar.c;
        if (eVar == null) {
            String str = bVar.d;
            if (str == null) {
                return;
            }
            bVar.f.a(str);
            return;
        }
        int a2 = e.a(eVar.a.a);
        if (a2 != 0) {
            if (a2 != 1) {
                return;
            }
            bVar.a(a);
        } else {
            String str2 = bVar.d;
            if (str2 == null) {
                return;
            }
            bVar.f.a(str2);
        }
    }

    public final void j() {
        Context context = this.a;
        if (com.five_corp.ad.internal.fullscreen.b.a == null) {
            com.five_corp.ad.internal.fullscreen.b.a = new com.five_corp.ad.internal.fullscreen.a();
        }
        com.five_corp.ad.internal.fullscreen.b.a.a(context, this);
    }

    public final void k() {
        if (!this.s) {
            if (!this.j) {
                com.five_corp.ad.internal.http.auxcache.h hVar = this.e;
                hVar.a.post(new com.five_corp.ad.internal.http.auxcache.b(hVar, this.l));
                this.j = true;
            }
            if (this.l.a.i != null) {
                this.k = this.l.a.i.longValue() + SystemClock.uptimeMillis();
            }
        }
        com.five_corp.ad.internal.system.l lVar = this.b.n;
        synchronized (lVar.a) {
            try {
                com.five_corp.ad.internal.util.d dVar = lVar.d;
                dVar.getClass();
                ArrayList arrayList = new ArrayList();
                dVar.a(arrayList);
                if (!arrayList.contains(this)) {
                    lVar.d.a.add(new WeakReference(this));
                    if (lVar.e == null) {
                        Timer timer = new Timer();
                        lVar.e = timer;
                        com.five_corp.ad.internal.system.j jVar = new com.five_corp.ad.internal.system.j(lVar);
                        long j = lVar.c;
                        timer.schedule(jVar, j, j);
                    }
                }
            } finally {
            }
        }
    }

    public final void l() {
        this.k = Long.MAX_VALUE;
        com.five_corp.ad.internal.system.l lVar = this.b.n;
        synchronized (lVar.a) {
            try {
                com.five_corp.ad.internal.util.d dVar = lVar.d;
                dVar.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = dVar.a.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Object obj = weakReference.get();
                    if (obj != null && obj != this) {
                        arrayList.add(weakReference);
                    }
                }
                dVar.a = arrayList;
                if (lVar.e != null) {
                    com.five_corp.ad.internal.util.d dVar2 = lVar.d;
                    dVar2.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    dVar2.a(arrayList2);
                    if (arrayList2.isEmpty()) {
                        lVar.e.cancel();
                        lVar.e = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d.post(new Runnable() { // from class: com.five_corp.ad.f$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                f.this.n();
            }
        });
    }

    public final void m() {
        int currentPositionMs = this.h.getCurrentPositionMs();
        try {
            this.p.a(currentPositionMs, this.u);
        } catch (Exception e) {
            a(currentPositionMs, new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.f4, null, e));
        }
    }

    public final void n() {
        boolean z;
        if (!this.s) {
            if (SystemClock.uptimeMillis() > this.k) {
                a(0, new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.c4, null, null));
                return;
            }
            return;
        }
        com.five_corp.ad.internal.viewability.c a = this.i.a();
        this.u = Math.max(this.u, a.a);
        com.five_corp.ad.internal.beacon.g gVar = this.t;
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = gVar.a.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.beacon.e eVar = (com.five_corp.ad.internal.beacon.e) it.next();
            if (!eVar.f) {
                com.five_corp.ad.internal.ad.beacon.a aVar = eVar.b;
                if (aVar.a == 2) {
                    if (a.a(aVar.d)) {
                        if (eVar.e) {
                            eVar.d += currentTimeMillis - eVar.c;
                        } else {
                            eVar.e = true;
                        }
                        long j = eVar.d;
                        com.five_corp.ad.internal.ad.beacon.a aVar2 = eVar.b;
                        if (j >= aVar2.c) {
                            eVar.f = true;
                            eVar.g.a(j, aVar2);
                        }
                    } else if (eVar.e) {
                        if (eVar.b.b == 2) {
                            eVar.d = 0L;
                        }
                        eVar.e = false;
                    }
                    eVar.c = currentTimeMillis;
                }
            }
        }
        this.h.a(a);
        com.five_corp.ad.internal.viewability.b bVar = this.r;
        if (bVar.c.isEmpty()) {
            return;
        }
        bVar.e.getClass();
        long currentTimeMillis2 = System.currentTimeMillis() - bVar.f;
        if (currentTimeMillis2 < ((Integer) bVar.c.get(0)).intValue()) {
            return;
        }
        bVar.c.remove(0);
        com.five_corp.ad.internal.viewability.a aVar3 = bVar.a;
        View view = aVar3.e;
        if (view == null) {
            view = aVar3.d;
        }
        synchronized (aVar3.g) {
            z = aVar3.h;
        }
        if (z && aVar3.b(aVar3.d) && aVar3.b(view)) {
            bVar.d.a(new com.five_corp.ad.internal.beacon.l(bVar.b, currentTimeMillis2, a, bVar.a.b()));
            return;
        }
        com.five_corp.ad.internal.hub.global.b bVar2 = bVar.d;
        String str = bVar.b;
        com.five_corp.ad.internal.viewability.c cVar = new com.five_corp.ad.internal.viewability.c(0.0d, 0.0d, 0.0d, 0.0d);
        Rect rect = new Rect(0, 0, 0, 0);
        com.five_corp.ad.internal.beacon.i iVar = new com.five_corp.ad.internal.beacon.i(rect.left, rect.top, rect.width(), rect.height());
        Rect rect2 = new Rect(0, 0, 0, 0);
        bVar2.a(new com.five_corp.ad.internal.beacon.l(str, currentTimeMillis2, cVar, new com.five_corp.ad.internal.beacon.k(iVar, new com.five_corp.ad.internal.beacon.i(rect2.left, rect2.top, rect2.width(), rect2.height()), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), 2)));
    }

    public final boolean o() {
        int i;
        synchronized (this.m) {
            i = this.v;
        }
        if (i != 1) {
            a(0, new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.d4, null, null));
            return false;
        }
        this.d.post(new Runnable() { // from class: com.five_corp.ad.f$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                f.this.j();
            }
        });
        return true;
    }

    @Override // com.five_corp.ad.AdActivity.Callback
    public final void onAdActivityBackPressed() {
        try {
            if (this.h.b()) {
                h();
            }
        } catch (Exception e) {
            this.A.a(com.five_corp.ad.internal.logger.b.a(e));
        }
    }

    @Override // com.five_corp.ad.internal.beacon.h
    public final void b(long j, com.five_corp.ad.internal.ad.beacon.a aVar) {
        com.five_corp.ad.internal.q qVar = this.o;
        double d = this.u;
        ArrayList<com.five_corp.ad.internal.ad.beacon.f> arrayList = qVar.f.a.y;
        if (arrayList != null) {
            for (com.five_corp.ad.internal.ad.beacon.f fVar : arrayList) {
                if (aVar.equals(fVar.b)) {
                    break;
                }
            }
        }
        fVar = null;
        if (fVar != null) {
            qVar.a(fVar.a, j, d, aVar, null);
        }
        com.five_corp.ad.internal.ad.a aVar2 = qVar.f.a;
        aVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (com.five_corp.ad.internal.ad.beacon.d dVar : aVar2.u) {
            if (aVar.equals(dVar.c)) {
                arrayList2.add(dVar);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.ad.beacon.d dVar2 = (com.five_corp.ad.internal.ad.beacon.d) it.next();
            com.five_corp.ad.internal.hub.global.b bVar = qVar.h;
            String str = dVar2.b;
            String str2 = dVar2.d;
            Iterator it2 = bVar.d.iterator();
            while (it2.hasNext()) {
                com.five_corp.ad.internal.v vVar = (com.five_corp.ad.internal.v) ((com.five_corp.ad.internal.hub.global.c) it2.next());
                com.five_corp.ad.internal.bgtask.b bVar2 = vVar.c;
                com.five_corp.ad.internal.bgtask.k kVar = new com.five_corp.ad.internal.bgtask.k(str, str2, vVar.b);
                com.five_corp.ad.internal.bgtask.a aVar3 = bVar2.b;
                aVar3.getClass();
                aVar3.a(new com.five_corp.ad.internal.bgtask.g(kVar, aVar3.c));
                Iterator it3 = bVar2.c.iterator();
                while (it3.hasNext()) {
                    com.five_corp.ad.internal.bgtask.e eVar = (com.five_corp.ad.internal.bgtask.e) it3.next();
                    eVar.d.post(new com.five_corp.ad.internal.bgtask.c(eVar));
                }
            }
        }
    }

    @Override // com.five_corp.ad.internal.beacon.h
    public final void c(long j, com.five_corp.ad.internal.ad.beacon.a aVar) {
        com.five_corp.ad.internal.q qVar = this.o;
        qVar.a(14, j, this.u, aVar, null);
        qVar.a(com.five_corp.ad.internal.ad.beacon.e.VIEWABLE_IMPRESSION);
    }

    public final void b(final com.five_corp.ad.internal.soundstate.a aVar) {
        this.d.post(new Runnable() { // from class: com.five_corp.ad.f$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                f.this.a(aVar);
            }
        });
    }

    public final void a(int i) {
        int i2;
        synchronized (this.m) {
            i2 = this.v;
            if (i2 == 1 || i2 == 3) {
                this.v = 2;
            }
        }
        if (i2 != 1 && i2 != 3) {
            a(i, new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.a4, "CurrentState: ".concat(d.a(i2)), null));
            return;
        }
        f();
        Iterator it = this.A.h.iterator();
        while (it.hasNext()) {
            ((com.five_corp.ad.internal.hub.ad_instance.b) it.next()).a();
        }
    }

    public static boolean a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    public final void a(com.five_corp.ad.internal.soundstate.a aVar) {
        boolean a = aVar.a();
        this.h.a(a);
        com.five_corp.ad.internal.layouter.i iVar = this.x;
        com.five_corp.ad.internal.layouter.g gVar = iVar.b;
        iVar.a(com.five_corp.ad.internal.layouter.g.a(gVar.a, gVar.c, gVar.e, a, gVar.g));
    }

    @Override // com.five_corp.ad.internal.layouter.c
    public final void a() {
        m();
    }

    public final void a(long j) {
        this.s = true;
        if (j > 0) {
            com.five_corp.ad.internal.layouter.i iVar = this.x;
            com.five_corp.ad.internal.layouter.g gVar = iVar.b;
            iVar.a(com.five_corp.ad.internal.layouter.g.a(gVar.a, (int) j, gVar.e, gVar.f, gVar.g));
        }
        this.k = Long.MAX_VALUE;
        com.five_corp.ad.internal.q qVar = this.o;
        if (!qVar.k) {
            qVar.k = true;
            if (qVar.f.c.b.e) {
                qVar.a(16, 0L, 0.0d, null, null);
            }
        }
        com.five_corp.ad.internal.viewability.b bVar = this.r;
        bVar.e.getClass();
        bVar.f = System.currentTimeMillis();
    }

    @Override // com.five_corp.ad.internal.layouter.c
    public final void a(com.five_corp.ad.internal.l lVar) {
        a(this.h.getCurrentPositionMs(), lVar);
    }

    @Override // com.five_corp.ad.internal.beacon.h
    public final void a(long j, com.five_corp.ad.internal.ad.beacon.a aVar) {
        int i;
        synchronized (this.m) {
            i = this.v;
        }
        if (i != 1) {
            a(0, new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.Y3, "CurrentState: ".concat(d.a(i)), null));
        } else {
            this.o.b(j, this.u, aVar);
        }
    }

    public final void a(int i, com.five_corp.ad.internal.l lVar) {
        synchronized (this.m) {
            try {
                if (this.v == 3) {
                    return;
                }
                this.v = 3;
                this.o.b(lVar, i);
                this.d.post(new Runnable() { // from class: com.five_corp.ad.f$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.this.g();
                    }
                });
                Iterator it = this.A.i.iterator();
                while (it.hasNext()) {
                    ((com.five_corp.ad.internal.hub.ad_instance.j) it.next()).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
