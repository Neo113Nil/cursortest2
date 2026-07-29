package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import o.AbstractC0330Mq;
import o.AbstractC1473m3;
import o.C0019Aq;
import o.C0162Gd;
import o.C0260Jx;
import o.C0300Ll;
import o.C0305Lq;
import o.C0928dn;
import o.C0950e6;
import o.C1274j20;
import o.C1818rJ;
import o.C2329z20;
import o.D4;
import o.F20;
import o.I20;
import o.InterfaceC0356Nq;
import o.InterfaceC0382Oq;
import o.InterfaceC1130gs;
import o.M20;
import o.R2;
import o.R20;
import o.U20;
import o.W20;
import o.X20;
import o.d30;
import o.h30;
import o.m30;
import o.o30;

/* loaded from: classes.dex */
public abstract class a implements D4 {
    public static final C0300Ll[] x = new C0300Ll[0];
    public volatile String a;
    public C0260Jx b;
    public final Context c;
    public final m30 d;
    public final M20 e;
    public final Object f;
    public final Object g;
    public I20 h;
    public C0928dn i;
    public IInterface j;
    public final ArrayList k;
    public U20 l;
    public int m;
    public final C1818rJ n;

    /* renamed from: o, reason: collision with root package name */
    public final C2329z20 f8o;
    public final int p;
    public final String q;
    public volatile String r;
    public C0162Gd s;
    public boolean t;
    public volatile d30 u;
    public final AtomicInteger v;
    public final Set w;

    public a(Context context, Looper looper, int i, C0950e6 c0950e6, InterfaceC0356Nq interfaceC0356Nq, InterfaceC0382Oq interfaceC0382Oq) {
        synchronized (m30.g) {
            try {
                if (m30.h == null) {
                    m30.h = new m30(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m30 m30Var = m30.h;
        Object obj = C0305Lq.b;
        AbstractC1473m3.n(interfaceC0356Nq);
        AbstractC1473m3.n(interfaceC0382Oq);
        C1818rJ c1818rJ = new C1818rJ(29, interfaceC0356Nq);
        C2329z20 c2329z20 = new C2329z20(interfaceC0382Oq);
        String str = (String) c0950e6.j;
        this.a = null;
        this.f = new Object();
        this.g = new Object();
        this.k = new ArrayList();
        this.m = 1;
        this.s = null;
        this.t = false;
        this.u = null;
        this.v = new AtomicInteger(0);
        AbstractC1473m3.o(context, "Context must not be null");
        this.c = context;
        AbstractC1473m3.o(looper, "Looper must not be null");
        AbstractC1473m3.o(m30Var, "Supervisor must not be null");
        this.d = m30Var;
        this.e = new M20(this, looper);
        this.p = i;
        this.n = c1818rJ;
        this.f8o = c2329z20;
        this.q = str;
        Set set = (Set) c0950e6.i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.w = set;
    }

    public static /* bridge */ /* synthetic */ boolean u(a aVar, int i, int i2, IInterface iInterface) {
        synchronized (aVar.f) {
            try {
                if (aVar.m != i) {
                    return false;
                }
                aVar.v(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.D4
    public final boolean a() {
        boolean z;
        synchronized (this.f) {
            z = this.m == 4;
        }
        return z;
    }

    @Override // o.D4
    public final void b(InterfaceC1130gs interfaceC1130gs, Set set) {
        Bundle q = q();
        String str = this.r;
        int i = AbstractC0330Mq.a;
        Scope[] scopeArr = C0019Aq.v;
        Bundle bundle = new Bundle();
        int i2 = this.p;
        C0300Ll[] c0300LlArr = C0019Aq.w;
        C0019Aq c0019Aq = new C0019Aq(6, i2, i, null, null, scopeArr, bundle, null, c0300LlArr, c0300LlArr, true, 0, false, str);
        c0019Aq.k = this.c.getPackageName();
        c0019Aq.n = q;
        if (set != null) {
            c0019Aq.m = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            c0019Aq.f13o = new Account("<<default account>>", "com.google");
            if (interfaceC1130gs != null) {
                c0019Aq.l = ((o30) interfaceC1130gs).a;
            }
        }
        c0019Aq.p = x;
        c0019Aq.q = p();
        try {
            synchronized (this.g) {
                try {
                    I20 i20 = this.h;
                    if (i20 != null) {
                        i20.a(new R20(this, this.v.get()), c0019Aq);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.v.get();
            M20 m20 = this.e;
            m20.sendMessage(m20.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.v.get();
            W20 w20 = new W20(this, 8, null, null);
            M20 m202 = this.e;
            m202.sendMessage(m202.obtainMessage(1, i4, -1, w20));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i42 = this.v.get();
            W20 w202 = new W20(this, 8, null, null);
            M20 m2022 = this.e;
            m2022.sendMessage(m2022.obtainMessage(1, i42, -1, w202));
        }
    }

    @Override // o.D4
    public final Set c() {
        return m() ? this.w : Collections.EMPTY_SET;
    }

    @Override // o.D4
    public final void d(String str) {
        this.a = str;
        l();
    }

    @Override // o.D4
    public final void e(C1818rJ c1818rJ) {
        ((C1274j20) c1818rJ.i).k.m.post(new R2(11, c1818rJ));
    }

    @Override // o.D4
    public final void g(C0928dn c0928dn) {
        this.i = c0928dn;
        v(2, null);
    }

    @Override // o.D4
    public final boolean h() {
        boolean z;
        synchronized (this.f) {
            int i = this.m;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    @Override // o.D4
    public final C0300Ll[] i() {
        d30 d30Var = this.u;
        if (d30Var == null) {
            return null;
        }
        return d30Var.i;
    }

    @Override // o.D4
    public final void j() {
        if (!a() || this.b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // o.D4
    public final String k() {
        return this.a;
    }

    @Override // o.D4
    public final void l() {
        this.v.incrementAndGet();
        synchronized (this.k) {
            try {
                int size = this.k.size();
                for (int i = 0; i < size; i++) {
                    F20 f20 = (F20) this.k.get(i);
                    synchronized (f20) {
                        f20.a = null;
                    }
                }
                this.k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.g) {
            this.h = null;
        }
        v(1, null);
    }

    @Override // o.D4
    public boolean m() {
        return false;
    }

    public abstract IInterface o(IBinder iBinder);

    public abstract C0300Ll[] p();

    public abstract Bundle q();

    public abstract String r();

    public abstract String s();

    public abstract boolean t();

    public final void v(int i, IInterface iInterface) {
        C0260Jx c0260Jx;
        if ((i == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f) {
            try {
                this.m = i;
                this.j = iInterface;
                if (i == 1) {
                    U20 u20 = this.l;
                    if (u20 != null) {
                        m30 m30Var = this.d;
                        String str = (String) this.b.j;
                        AbstractC1473m3.n(str);
                        this.b.getClass();
                        if (this.q == null) {
                            this.c.getClass();
                        }
                        m30Var.a(str, u20, this.b.i);
                        this.l = null;
                    }
                } else if (i == 2 || i == 3) {
                    U20 u202 = this.l;
                    if (u202 != null && (c0260Jx = this.b) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) c0260Jx.j) + " on com.google.android.gms");
                        m30 m30Var2 = this.d;
                        String str2 = (String) this.b.j;
                        AbstractC1473m3.n(str2);
                        this.b.getClass();
                        if (this.q == null) {
                            this.c.getClass();
                        }
                        m30Var2.a(str2, u202, this.b.i);
                        this.v.incrementAndGet();
                    }
                    U20 u203 = new U20(this, this.v.get());
                    this.l = u203;
                    String s = s();
                    boolean t = t();
                    this.b = new C0260Jx(s, t, 4);
                    if (t && f() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.b.j)));
                    }
                    m30 m30Var3 = this.d;
                    String str3 = (String) this.b.j;
                    AbstractC1473m3.n(str3);
                    this.b.getClass();
                    String str4 = this.q;
                    if (str4 == null) {
                        str4 = this.c.getClass().getName();
                    }
                    if (!m30Var3.b(new h30(str3, this.b.i), u203, str4)) {
                        Log.w("GmsClient", "unable to connect to service: " + ((String) this.b.j) + " on com.google.android.gms");
                        int i2 = this.v.get();
                        X20 x20 = new X20(this, 16);
                        M20 m20 = this.e;
                        m20.sendMessage(m20.obtainMessage(7, i2, -1, x20));
                    }
                } else if (i == 4) {
                    AbstractC1473m3.n(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
