package com.my.target;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class th {
    private final w0 a;
    private final sh b;
    private final g0 c;
    private final Set d = new HashSet();
    private final Set e = new HashSet();
    private final Set f = new HashSet();
    private final Set g = new HashSet();
    private final List h = new ArrayList();
    private final List i = new ArrayList();
    private final Comparator j = new Comparator() { // from class: com.my.target.th$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int a;
            a = th.a((ke) obj, (ke) obj2);
            return a;
        }
    };
    private boolean k = false;

    private th(w0 w0Var, sh shVar, g0 g0Var) {
        this.a = w0Var;
        this.b = shVar;
        this.c = g0Var;
    }

    public static th a(w0 w0Var, sh shVar, g0 g0Var) {
        return new th(w0Var, shVar, g0Var);
    }

    public static boolean c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((rh) it.next()).d()) {
                return true;
            }
        }
        return false;
    }

    public w0 b() {
        return this.a;
    }

    public boolean d(String str) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (str.equals(((rh) it.next()).b())) {
                return true;
            }
        }
        return false;
    }

    public sh e() {
        return this.b;
    }

    public boolean f() {
        return (this.d.isEmpty() && this.e.isEmpty() && this.h.isEmpty() && this.i.isEmpty() && this.g.isEmpty() && this.f.isEmpty()) ? false : true;
    }

    public boolean g() {
        return this.k;
    }

    public static th a(w0 w0Var, sh shVar) {
        return new th(w0Var, shVar, null);
    }

    public uh b(int i) {
        ArrayList arrayList = new ArrayList();
        for (ke keVar : this.h) {
            if (keVar.g() == i) {
                arrayList.add(keVar);
            }
        }
        return uh.a(this, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(ke keVar, ke keVar2) {
        return v4.a(keVar2.i(), keVar.i());
    }

    public uh c() {
        return uh.a(this, new ArrayList(this.e));
    }

    public uh d() {
        uh a = uh.a(this);
        a.c.addAll(this.e);
        Collections.sort(a.c, new Comparator() { // from class: com.my.target.th$$ExternalSyntheticLambda2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int b;
                b = th.b((xe) obj, (xe) obj2);
                return b;
            }
        });
        return a;
    }

    public g0 a() {
        return this.c;
    }

    protected ArrayList c(String str) {
        ArrayList arrayList = new ArrayList();
        for (rh rhVar : this.d) {
            if (str.equals(rhVar.b())) {
                arrayList.add(rhVar);
            }
        }
        return arrayList;
    }

    public void a(rh rhVar) {
        if (rhVar.d()) {
            this.k = true;
        }
        if (rhVar instanceof je) {
            String g = ((je) rhVar).g();
            if ("landscape".equals(g)) {
                this.g.add(rhVar);
                return;
            } else {
                if ("portrait".equals(g)) {
                    this.f.add(rhVar);
                    return;
                }
                return;
            }
        }
        if (rhVar instanceof xe) {
            this.e.add((xe) rhVar);
            return;
        }
        if (rhVar instanceof ke) {
            ke keVar = (ke) rhVar;
            int binarySearch = Collections.binarySearch(this.h, keVar, this.j);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            this.h.add(binarySearch, keVar);
            return;
        }
        if (rhVar instanceof gc) {
            this.i.add((gc) rhVar);
        } else {
            this.d.add(rhVar);
        }
    }

    public uh b(String str) {
        ArrayList arrayList = new ArrayList();
        for (rh rhVar : this.d) {
            if (str.equals(rhVar.b())) {
                arrayList.add(rhVar);
            }
        }
        return uh.a(this, arrayList);
    }

    public void b(List list) {
        list.addAll(this.e);
        Collections.sort(list, new Comparator() { // from class: com.my.target.th$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a;
                a = th.a((xe) obj, (xe) obj2);
                return a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(xe xeVar, xe xeVar2) {
        return (int) (xeVar2.h() - xeVar.h());
    }

    public void b(th thVar, float f) {
        this.d.addAll(thVar.c("playbackStarted"));
        this.d.addAll(thVar.c("playbackResumed"));
        this.d.addAll(thVar.c("playbackPaused"));
        this.d.addAll(thVar.c("playbackStopped"));
        this.d.addAll(thVar.c("playbackCompleted"));
        this.d.addAll(thVar.c("playbackError"));
        this.d.addAll(thVar.c("volumeOn"));
        this.d.addAll(thVar.c("volumeOff"));
        this.d.addAll(thVar.c("fullscreenOn"));
        this.d.addAll(thVar.c("fullscreenOff"));
        this.d.addAll(thVar.c("error"));
        this.d.addAll(thVar.c("playbackTimeout"));
        this.i.addAll(thVar.a(2).c);
        if (f <= 0.0f) {
            this.e.addAll(thVar.e);
            this.h.addAll(thVar.b(2).c);
            return;
        }
        for (xe xeVar : thVar.e) {
            float g = xeVar.g();
            if (g >= 0.0f) {
                xeVar.b((g * f) / 100.0f);
                xeVar.a(-1.0f);
            }
            a(xeVar);
        }
        for (ke keVar : thVar.b(2).c) {
            float h = keVar.h();
            if (h >= 0.0f) {
                keVar.b((h * f) / 100.0f);
                keVar.a(-1.0f);
            }
            a(keVar);
        }
    }

    public uh a(int i) {
        ArrayList arrayList = new ArrayList();
        for (gc gcVar : this.i) {
            if (gcVar.g() == i) {
                arrayList.add(gcVar);
            }
        }
        return uh.a(this, arrayList);
    }

    public uh a(String str) {
        Set set;
        if (str.equals("portrait")) {
            set = this.f;
        } else {
            set = this.g;
        }
        return uh.a(this, new ArrayList(set));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(xe xeVar, xe xeVar2) {
        return (int) (xeVar2.h() - xeVar.h());
    }

    public void a(th thVar) {
        a((List) thVar.c("click"));
        a((List) thVar.c("ctaClick"));
        a((List) thVar.c("closedByUser"));
    }

    public void a(th thVar, float f) {
        this.d.addAll(thVar.d);
        this.i.addAll(thVar.i);
        this.f.addAll(thVar.f);
        this.g.addAll(thVar.g);
        if (f <= 0.0f) {
            this.e.addAll(thVar.e);
            this.h.addAll(thVar.h);
            return;
        }
        for (xe xeVar : thVar.e) {
            float g = xeVar.g();
            if (g >= 0.0f) {
                xeVar.b((g * f) / 100.0f);
                xeVar.a(-1.0f);
            }
            a(xeVar);
        }
        for (ke keVar : thVar.h) {
            float h = keVar.h();
            if (h >= 0.0f) {
                keVar.b((h * f) / 100.0f);
                keVar.a(-1.0f);
            }
            a(keVar);
        }
    }

    public void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((rh) it.next());
        }
    }

    public void a(ArrayList arrayList) {
        this.e.addAll(arrayList);
    }

    public boolean a(x0 x0Var) {
        boolean z = false;
        boolean z2 = false;
        for (rh rhVar : this.d) {
            String b = rhVar.b();
            if (rhVar.d() || "show".equals(b) || "playbackStarted".equals(b) || "playheadViewabilityValue".equals(b)) {
                z = true;
            }
            if ("click".equals(b)) {
                z2 = true;
            }
        }
        if (!z) {
            x0Var.c(3008, "isImpression stats not found");
        }
        if (x0Var.b() && !z2) {
            x0Var.c(3008, "click stat is not found");
        }
        return z && z2;
    }
}
