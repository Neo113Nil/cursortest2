package yads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class ro2 implements Comparable {
    public final km3 b;
    public final int c;
    public final String d;
    public final int e;
    public final Object f;
    public vp2 g;
    public Integer h;
    public ep2 i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public we0 o;
    public zq p;
    public Object q;
    public en3 r;

    public ro2(int i, String str, vp2 vp2Var) {
        Uri parse;
        String host;
        this.b = km3.c ? new km3() : null;
        this.f = new Object();
        this.j = true;
        int i2 = 0;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.p = null;
        this.c = i;
        this.d = str;
        this.g = vp2Var;
        this.o = new we0();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.e = i2;
    }

    public hm3 a(hm3 hm3Var) {
        return hm3Var;
    }

    public abstract xp2 a(u82 u82Var);

    public abstract void a(Object obj);

    public final void a(String str) {
        if (km3.c) {
            this.b.a(str, Thread.currentThread().getId());
        }
    }

    public final void b(String str) {
        ep2 ep2Var = this.i;
        if (ep2Var != null) {
            synchronized (ep2Var.b) {
                ep2Var.b.remove(this);
            }
            synchronized (ep2Var.j) {
                Iterator it = ep2Var.j.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            ep2Var.a(this, 5);
        }
        if (km3.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new po2(this, str, id));
                return;
            }
            this.b.a(str, id);
            km3 km3Var = this.b;
            toString();
            km3Var.a();
        }
    }

    public byte[] b() {
        return null;
    }

    public final String c() {
        String g = g();
        int i = this.c;
        if (i == 0 || i == -1) {
            return g;
        }
        return Integer.toString(i) + '-' + g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ro2 ro2Var = (ro2) obj;
        int f = f();
        int f2 = ro2Var.f();
        return f == f2 ? this.h.intValue() - ro2Var.h.intValue() : pg0.a(f2) - pg0.a(f);
    }

    public Map d() {
        return Collections.emptyMap();
    }

    public final int e() {
        return this.c;
    }

    public int f() {
        return 2;
    }

    public String g() {
        return this.d;
    }

    public final boolean h() {
        boolean z;
        synchronized (this.f) {
            z = this.l;
        }
        return z;
    }

    public final boolean i() {
        boolean z;
        synchronized (this.f) {
            z = this.k;
        }
        return z;
    }

    public final void j() {
        en3 en3Var;
        synchronized (this.f) {
            en3Var = this.r;
        }
        if (en3Var != null) {
            en3Var.b(this);
        }
    }

    public final String toString() {
        String str = "0x" + Integer.toHexString(this.e);
        StringBuilder sb = new StringBuilder();
        sb.append(i() ? "[X] " : "[ ] ");
        sb.append(g());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        int f = f();
        sb.append(f != 1 ? f != 2 ? f != 3 ? f != 4 ? POBCommonConstants.NULL_VALUE : "IMMEDIATE" : "HIGH" : "NORMAL" : "LOW");
        sb.append(" ");
        sb.append(this.h);
        return sb.toString();
    }

    public final void a(int i) {
        ep2 ep2Var = this.i;
        if (ep2Var != null) {
            ep2Var.a(this, i);
        }
    }

    public void a() {
        synchronized (this.f) {
            this.k = true;
            this.g = null;
        }
    }

    public final void a(en3 en3Var) {
        synchronized (this.f) {
            this.r = en3Var;
        }
    }

    public final void a(xp2 xp2Var) {
        en3 en3Var;
        synchronized (this.f) {
            en3Var = this.r;
        }
        if (en3Var != null) {
            en3Var.a(this, xp2Var);
        }
    }
}
