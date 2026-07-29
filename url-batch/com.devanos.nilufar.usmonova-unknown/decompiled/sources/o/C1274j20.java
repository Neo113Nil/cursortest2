package o;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: o.j20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1274j20 implements InterfaceC0356Nq, InterfaceC0382Oq {
    public final D4 b;
    public final G4 c;
    public final KX d;
    public final int g;
    public boolean h;
    public final /* synthetic */ C0408Pq k;
    public final LinkedList a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList i = new ArrayList();
    public C0162Gd j = null;

    public C1274j20(C0408Pq c0408Pq, B20 b20) {
        this.k = c0408Pq;
        Looper looper = c0408Pq.m.getLooper();
        Context context = b20.a;
        C0950e6 c0950e6 = new C0950e6(6, false);
        Set set = Collections.EMPTY_SET;
        if (((N6) c0950e6.i) == null) {
            c0950e6.i = new N6(0);
        }
        ((N6) c0950e6.i).addAll(set);
        c0950e6.k = context.getClass().getName();
        c0950e6.j = context.getPackageName();
        C0950e6 c0950e62 = new C0950e6((N6) c0950e6.i, (String) c0950e6.j, (String) c0950e6.k);
        A20 a20 = (A20) b20.c.i;
        AbstractC1473m3.n(a20);
        Context context2 = b20.a;
        WU wu = b20.d;
        a20.getClass();
        D20 d20 = new D20(context2, looper, c0950e62, wu, this, this);
        String str = b20.b;
        if (str != null) {
            d20.r = str;
        }
        this.b = d20;
        this.c = b20.e;
        this.d = new KX(4);
        this.g = b20.f;
    }

    @Override // o.InterfaceC0382Oq
    public final void a(C0162Gd c0162Gd) {
        o(c0162Gd, null);
    }

    @Override // o.InterfaceC0356Nq
    public final void b(int i) {
        Looper myLooper = Looper.myLooper();
        E20 e20 = this.k.m;
        if (myLooper == e20.getLooper()) {
            i(i);
        } else {
            e20.post(new F9(i, 2, this));
        }
    }

    @Override // o.InterfaceC0356Nq
    public final void c() {
        Looper myLooper = Looper.myLooper();
        E20 e20 = this.k.m;
        if (myLooper == e20.getLooper()) {
            h();
        } else {
            e20.post(new R2(10, this));
        }
    }

    public final void d(C0162Gd c0162Gd) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (EB.o(c0162Gd, C0162Gd.l)) {
                this.b.j();
            }
            throw null;
        }
    }

    public final void e(Status status) {
        AbstractC1473m3.j(this.k.m);
        f(status, null, false);
    }

    public final void f(Status status, Exception exc, boolean z) {
        AbstractC1473m3.j(this.k.m);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            AbstractC1538n20 abstractC1538n20 = (AbstractC1538n20) it.next();
            if (!z || abstractC1538n20.a == 2) {
                if (status != null) {
                    abstractC1538n20.c(status);
                } else {
                    abstractC1538n20.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1538n20 abstractC1538n20 = (AbstractC1538n20) arrayList.get(i);
            if (!this.b.a()) {
                return;
            }
            if (k(abstractC1538n20)) {
                linkedList.remove(abstractC1538n20);
            }
        }
    }

    public final void h() {
        C0408Pq c0408Pq = this.k;
        AbstractC1473m3.j(c0408Pq.m);
        this.j = null;
        d(C0162Gd.l);
        E20 e20 = c0408Pq.m;
        if (this.h) {
            G4 g4 = this.c;
            e20.removeMessages(11, g4);
            e20.removeMessages(9, g4);
            this.h = false;
        }
        Iterator it = this.f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        g();
        j();
    }

    public final void i(int i) {
        C0408Pq c0408Pq = this.k;
        E20 e20 = c0408Pq.m;
        AbstractC1473m3.j(c0408Pq.m);
        this.j = null;
        this.h = true;
        String k = this.b.k();
        KX kx = this.d;
        kx.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (k != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(k);
        }
        kx.a(true, new Status(20, sb.toString(), null, null));
        G4 g4 = this.c;
        e20.sendMessageDelayed(Message.obtain(e20, 9, g4), 5000L);
        e20.sendMessageDelayed(Message.obtain(e20, 11, g4), 120000L);
        ((SparseIntArray) c0408Pq.g.h).clear();
        Iterator it = this.f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void j() {
        C0408Pq c0408Pq = this.k;
        E20 e20 = c0408Pq.m;
        G4 g4 = this.c;
        e20.removeMessages(12, g4);
        e20.sendMessageDelayed(e20.obtainMessage(12, g4), c0408Pq.a);
    }

    public final boolean k(AbstractC1538n20 abstractC1538n20) {
        C0300Ll c0300Ll;
        if (abstractC1538n20 == null) {
            KX kx = this.d;
            D4 d4 = this.b;
            abstractC1538n20.f(kx, d4.m());
            try {
                abstractC1538n20.e(this);
                return true;
            } catch (DeadObjectException unused) {
                b(1);
                d4.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        C0300Ll[] b = abstractC1538n20.b(this);
        if (b != null && b.length != 0) {
            C0300Ll[] i = this.b.i();
            if (i == null) {
                i = new C0300Ll[0];
            }
            K6 k6 = new K6(i.length);
            for (C0300Ll c0300Ll2 : i) {
                k6.put(c0300Ll2.h, Long.valueOf(c0300Ll2.a()));
            }
            int length = b.length;
            for (int i2 = 0; i2 < length; i2++) {
                c0300Ll = b[i2];
                Long l = (Long) k6.get(c0300Ll.h);
                if (l == null || l.longValue() < c0300Ll.a()) {
                    break;
                }
            }
        }
        c0300Ll = null;
        if (c0300Ll == null) {
            KX kx2 = this.d;
            D4 d42 = this.b;
            abstractC1538n20.f(kx2, d42.m());
            try {
                abstractC1538n20.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                b(1);
                d42.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + c0300Ll.h + ", " + c0300Ll.a() + ").");
        if (!this.k.n || !abstractC1538n20.a(this)) {
            abstractC1538n20.d(new C2031uY(c0300Ll));
            return true;
        }
        C1340k20 c1340k20 = new C1340k20(this.c, c0300Ll);
        int indexOf = this.i.indexOf(c1340k20);
        if (indexOf >= 0) {
            C1340k20 c1340k202 = (C1340k20) this.i.get(indexOf);
            this.k.m.removeMessages(15, c1340k202);
            E20 e20 = this.k.m;
            e20.sendMessageDelayed(Message.obtain(e20, 15, c1340k202), 5000L);
        } else {
            this.i.add(c1340k20);
            E20 e202 = this.k.m;
            e202.sendMessageDelayed(Message.obtain(e202, 15, c1340k20), 5000L);
            E20 e203 = this.k.m;
            e203.sendMessageDelayed(Message.obtain(e203, 16, c1340k20), 120000L);
            C0162Gd c0162Gd = new C0162Gd(2, null);
            if (!l(c0162Gd)) {
                this.k.a(c0162Gd, this.g);
            }
        }
        return false;
    }

    public final boolean l(C0162Gd c0162Gd) {
        synchronized (C0408Pq.q) {
        }
        return false;
    }

    public final void m() {
        C0408Pq c0408Pq = this.k;
        AbstractC1473m3.j(c0408Pq.m);
        D4 d4 = this.b;
        if (d4.a() || d4.h()) {
            return;
        }
        try {
            KX kx = c0408Pq.g;
            Context context = c0408Pq.e;
            SparseIntArray sparseIntArray = (SparseIntArray) kx.h;
            AbstractC1473m3.n(context);
            int f = d4.f();
            int i = ((SparseIntArray) kx.h).get(f, -1);
            if (i == -1) {
                i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= sparseIntArray.size()) {
                        i = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i2);
                    if (keyAt > f && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i == -1) {
                    i = ((C0305Lq) kx.i).b(context, f);
                }
                sparseIntArray.put(f, i);
            }
            if (i == 0) {
                C0928dn c0928dn = new C0928dn(c0408Pq, d4, this.c);
                if (d4.m()) {
                    AbstractC1473m3.n(null);
                    throw null;
                }
                try {
                    d4.g(c0928dn);
                    return;
                } catch (SecurityException e) {
                    o(new C0162Gd(10), e);
                    return;
                }
            }
            C0162Gd c0162Gd = new C0162Gd(i, null);
            Log.w("GoogleApiManager", "The service for " + d4.getClass().getName() + " is not available: " + c0162Gd.toString());
            o(c0162Gd, null);
        } catch (IllegalStateException e2) {
            o(new C0162Gd(10), e2);
        }
    }

    public final void n(AbstractC1538n20 abstractC1538n20) {
        AbstractC1473m3.j(this.k.m);
        boolean a = this.b.a();
        LinkedList linkedList = this.a;
        if (a) {
            if (k(abstractC1538n20)) {
                j();
                return;
            } else {
                linkedList.add(abstractC1538n20);
                return;
            }
        }
        linkedList.add(abstractC1538n20);
        C0162Gd c0162Gd = this.j;
        if (c0162Gd == null || c0162Gd.i == 0 || c0162Gd.j == null) {
            m();
        } else {
            o(c0162Gd, null);
        }
    }

    public final void o(C0162Gd c0162Gd, RuntimeException runtimeException) {
        AbstractC1473m3.j(this.k.m);
        AbstractC1473m3.j(this.k.m);
        this.j = null;
        ((SparseIntArray) this.k.g.h).clear();
        d(c0162Gd);
        if ((this.b instanceof D20) && c0162Gd.i != 24) {
            C0408Pq c0408Pq = this.k;
            c0408Pq.b = true;
            E20 e20 = c0408Pq.m;
            e20.sendMessageDelayed(e20.obtainMessage(19), 300000L);
        }
        if (c0162Gd.i == 4) {
            e(C0408Pq.p);
            return;
        }
        if (this.a.isEmpty()) {
            this.j = c0162Gd;
            return;
        }
        if (runtimeException != null) {
            AbstractC1473m3.j(this.k.m);
            f(null, runtimeException, false);
            return;
        }
        if (!this.k.n) {
            e(C0408Pq.b(this.c, c0162Gd));
            return;
        }
        f(C0408Pq.b(this.c, c0162Gd), null, true);
        if (this.a.isEmpty() || l(c0162Gd) || this.k.a(c0162Gd, this.g)) {
            return;
        }
        if (c0162Gd.i == 18) {
            this.h = true;
        }
        if (!this.h) {
            e(C0408Pq.b(this.c, c0162Gd));
        } else {
            E20 e202 = this.k.m;
            e202.sendMessageDelayed(Message.obtain(e202, 9, this.c), 5000L);
        }
    }

    public final void p() {
        AbstractC1473m3.j(this.k.m);
        Status status = C0408Pq.f87o;
        e(status);
        this.d.a(false, status);
        for (AbstractC2205xA abstractC2205xA : (AbstractC2205xA[]) this.f.keySet().toArray(new AbstractC2205xA[0])) {
            n(new C2197x20(new NU()));
        }
        d(new C0162Gd(4));
        D4 d4 = this.b;
        if (d4.a()) {
            d4.e(new C1818rJ(28, this));
        }
    }
}
