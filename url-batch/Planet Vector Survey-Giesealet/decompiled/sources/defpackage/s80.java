package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class s80 {
    public int A;
    public final ArrayList B;
    public final zq0 C;
    public final Context a;
    public final Activity b;
    public p80 c;
    public Bundle d;
    public Parcelable[] e;
    public boolean f;
    public final h8 g;
    public final et0 h;
    public final et0 i;
    public final pi0 j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public final LinkedHashMap n;
    public o20 o;
    public e80 p;
    public final CopyOnWriteArrayList q;
    public f20 r;
    public final h50 s;
    public final z8 t;
    public final boolean u;
    public final q90 v;
    public final LinkedHashMap w;
    public mu x;
    public b80 y;
    public final LinkedHashMap z;

    public s80(Context context) {
        Object obj;
        context.getClass();
        this.a = context;
        Iterator it = kq0.z(context, o1.F).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.b = (Activity) obj;
        this.g = new h8();
        wp wpVar = wp.d;
        this.h = nk.b(wpVar);
        et0 b = nk.b(wpVar);
        this.i = b;
        this.j = new pi0(b);
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.q = new CopyOnWriteArrayList();
        this.r = f20.e;
        this.s = new h50(1, this);
        this.t = new z8(1, this);
        this.u = true;
        q90 q90Var = new q90();
        this.v = q90Var;
        this.w = new LinkedHashMap();
        this.z = new LinkedHashMap();
        q90Var.a(new r80(q90Var));
        q90Var.a(new p1(this.a));
        this.B = new ArrayList();
        new lu0(new b(9, this));
        this.C = a50.c(2);
    }

    public static m80 e(m80 m80Var, int i, boolean z, m80 m80Var2) {
        p80 p80Var;
        if (m80Var.i == i && (m80Var2 == null || (m80Var.equals(m80Var2) && nz.l(m80Var.e, m80Var2.e)))) {
            return m80Var;
        }
        if (m80Var instanceof p80) {
            p80Var = (p80) m80Var;
        } else {
            p80Var = m80Var.e;
            p80Var.getClass();
        }
        return p80Var.e(i, p80Var, z, m80Var2);
    }

    public static void k(s80 s80Var, String str, c90 c90Var, int i) {
        if ((i & 2) != 0) {
            c90Var = null;
        }
        s80Var.getClass();
        str.getClass();
        if (s80Var.c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + s80Var + '.').toString());
        }
        p80 h = s80Var.h(s80Var.g);
        k80 g = h.g(str, true, h);
        if (g == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + s80Var.c);
        }
        m80 m80Var = g.d;
        Bundle a = m80Var.a(g.e);
        if (a == null) {
            a = new Bundle();
        }
        Intent intent = new Intent();
        int i2 = m80.l;
        String str2 = m80Var.j;
        Uri parse = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        parse.getClass();
        intent.setDataAndType(parse, null);
        intent.setAction(null);
        a.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        s80Var.j(m80Var, a, c90Var);
    }

    public static /* synthetic */ void o(s80 s80Var, y70 y70Var) {
        s80Var.n(y70Var, false, new h8());
    }

    public final void a(m80 m80Var, Bundle bundle, y70 y70Var, List list) {
        Object obj;
        Object obj2;
        m80 m80Var2 = y70Var.e;
        boolean z = m80Var2 instanceof km;
        h8 h8Var = this.g;
        if (!z) {
            while (!h8Var.isEmpty() && (((y70) h8Var.last()).e instanceof km) && m(((y70) h8Var.last()).e.i, true, false)) {
            }
        }
        h8 h8Var2 = new h8();
        boolean z2 = m80Var instanceof p80;
        Context context = this.a;
        Object obj3 = null;
        if (z2) {
            m80 m80Var3 = m80Var2;
            do {
                m80Var3.getClass();
                m80Var3 = m80Var3.e;
                if (m80Var3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (nz.l(((y70) obj2).e, m80Var3)) {
                                break;
                            }
                        }
                    }
                    y70 y70Var2 = (y70) obj2;
                    if (y70Var2 == null) {
                        y70Var2 = y7.g(context, m80Var3, bundle, g(), this.p);
                    }
                    h8Var2.addFirst(y70Var2);
                    if (!h8Var.isEmpty() && ((y70) h8Var.last()).e == m80Var3) {
                        o(this, (y70) h8Var.last());
                    }
                }
                if (m80Var3 == null) {
                    break;
                }
            } while (m80Var3 != m80Var);
        }
        m80 m80Var4 = h8Var2.isEmpty() ? m80Var2 : ((y70) h8Var2.first()).e;
        while (m80Var4 != null && d(m80Var4.i, m80Var4) != m80Var4) {
            m80Var4 = m80Var4.e;
            if (m80Var4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (nz.l(((y70) obj).e, m80Var4)) {
                            break;
                        }
                    }
                }
                y70 y70Var3 = (y70) obj;
                if (y70Var3 == null) {
                    y70Var3 = y7.g(context, m80Var4, m80Var4.a(bundle2), g(), this.p);
                }
                h8Var2.addFirst(y70Var3);
            }
        }
        if (!h8Var2.isEmpty()) {
            m80Var2 = ((y70) h8Var2.first()).e;
        }
        while (!h8Var.isEmpty() && (((y70) h8Var.last()).e instanceof p80)) {
            m80 m80Var5 = ((y70) h8Var.last()).e;
            m80Var5.getClass();
            if (((p80) m80Var5).m.b(m80Var2.i) != null) {
                break;
            } else {
                o(this, (y70) h8Var.last());
            }
        }
        y70 y70Var4 = (y70) (h8Var.isEmpty() ? null : h8Var.e[h8Var.d]);
        if (y70Var4 == null) {
            y70Var4 = (y70) (h8Var2.isEmpty() ? null : h8Var2.e[h8Var2.d]);
        }
        if (!nz.l(y70Var4 != null ? y70Var4.e : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                m80 m80Var6 = ((y70) previous).e;
                p80 p80Var = this.c;
                p80Var.getClass();
                if (nz.l(m80Var6, p80Var)) {
                    obj3 = previous;
                    break;
                }
            }
            y70 y70Var5 = (y70) obj3;
            if (y70Var5 == null) {
                p80 p80Var2 = this.c;
                p80Var2.getClass();
                p80 p80Var3 = this.c;
                p80Var3.getClass();
                y70Var5 = y7.g(context, p80Var2, p80Var3.a(bundle), g(), this.p);
            }
            h8Var2.addFirst(y70Var5);
        }
        Iterator it = h8Var2.iterator();
        while (it.hasNext()) {
            y70 y70Var6 = (y70) it.next();
            Object obj4 = this.w.get(this.v.b(y70Var6.e.d));
            if (obj4 == null) {
                g8.h("NavigatorBackStack for ", m80Var.d, " should already be created");
                return;
            }
            ((a80) obj4).a(y70Var6);
        }
        h8Var.addAll(h8Var2);
        h8Var.addLast(y70Var);
        ArrayList k0 = zd.k0(h8Var2, y70Var);
        int size = k0.size();
        int i = 0;
        while (i < size) {
            Object obj5 = k0.get(i);
            i++;
            y70 y70Var7 = (y70) obj5;
            p80 p80Var4 = y70Var7.e.e;
            if (p80Var4 != null) {
                i(y70Var7, f(p80Var4.i));
            }
        }
    }

    public final boolean b() {
        h8 h8Var;
        while (true) {
            h8Var = this.g;
            if (h8Var.isEmpty() || !(((y70) h8Var.last()).e instanceof p80)) {
                break;
            }
            o(this, (y70) h8Var.last());
        }
        y70 y70Var = (y70) h8Var.f();
        ArrayList arrayList = this.B;
        if (y70Var != null) {
            arrayList.add(y70Var);
        }
        this.A++;
        s();
        int i = this.A - 1;
        this.A = i;
        if (i == 0) {
            ArrayList p0 = zd.p0(arrayList);
            arrayList.clear();
            int size = p0.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = p0.get(i2);
                i2++;
                y70 y70Var2 = (y70) obj;
                Iterator it = this.q.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        g8.q();
                        return false;
                    }
                    m80 m80Var = y70Var2.e;
                    y70Var2.a();
                    throw null;
                }
                this.C.p(y70Var2);
            }
            ArrayList arrayList2 = new ArrayList(h8Var);
            et0 et0Var = this.h;
            et0Var.getClass();
            et0Var.k(null, arrayList2);
            ArrayList p = p();
            et0 et0Var2 = this.i;
            et0Var2.getClass();
            et0Var2.k(null, p);
        }
        return y70Var != null;
    }

    public final boolean c(ArrayList arrayList, m80 m80Var, boolean z, boolean z2) {
        boolean z3;
        cj0 cj0Var = new cj0();
        h8 h8Var = new h8();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z3 = z2;
                break;
            }
            int i2 = i + 1;
            p90 p90Var = (p90) arrayList.get(i);
            cj0 cj0Var2 = new cj0();
            y70 y70Var = (y70) this.g.last();
            z3 = z2;
            this.y = new b80(cj0Var2, cj0Var, this, z3, h8Var);
            p90Var.e(y70Var, z3);
            this.y = null;
            if (!cj0Var2.d) {
                break;
            }
            i = i2;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = this.m;
            if (!z) {
                cr crVar = new cr(new tu0(kq0.z(m80Var, o1.G), new c80(this, 0), 0));
                while (crVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((m80) crVar.next()).i);
                    z70 z70Var = (z70) (h8Var.isEmpty() ? null : h8Var.e[h8Var.d]);
                    linkedHashMap.put(valueOf, z70Var != null ? z70Var.d : null);
                }
            }
            if (!h8Var.isEmpty()) {
                z70 z70Var2 = (z70) h8Var.first();
                int i3 = z70Var2.e;
                String str = z70Var2.d;
                cr crVar2 = new cr(new tu0(kq0.z(d(i3, null), o1.H), new c80(this, 1), 0));
                while (crVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((m80) crVar2.next()).i), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    this.n.put(str, h8Var);
                }
            }
        }
        t();
        return cj0Var.d;
    }

    public final m80 d(int i, m80 m80Var) {
        m80 m80Var2;
        p80 p80Var = this.c;
        if (p80Var == null) {
            return null;
        }
        if (p80Var.i == i) {
            if (m80Var == null) {
                return p80Var;
            }
            if (nz.l(p80Var, m80Var) && m80Var.e == null) {
                return this.c;
            }
        }
        y70 y70Var = (y70) this.g.f();
        if (y70Var == null || (m80Var2 = y70Var.e) == null) {
            m80Var2 = this.c;
            m80Var2.getClass();
        }
        return e(m80Var2, i, false, m80Var);
    }

    public final y70 f(int i) {
        Object obj;
        h8 h8Var = this.g;
        ListIterator listIterator = h8Var.listIterator(h8Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((y70) obj).e.i == i) {
                break;
            }
        }
        y70 y70Var = (y70) obj;
        if (y70Var != null) {
            return y70Var;
        }
        StringBuilder sb = new StringBuilder("No destination with ID ");
        sb.append(i);
        sb.append(" is on the NavController's back stack. The current destination is ");
        y70 y70Var2 = (y70) h8Var.f();
        sb.append(y70Var2 != null ? y70Var2.e : null);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final f20 g() {
        return this.o == null ? f20.f : this.r;
    }

    public final p80 h(h8 h8Var) {
        m80 m80Var;
        y70 y70Var = (y70) h8Var.f();
        if (y70Var == null || (m80Var = y70Var.e) == null) {
            m80Var = this.c;
            m80Var.getClass();
        }
        if (m80Var instanceof p80) {
            return (p80) m80Var;
        }
        p80 p80Var = m80Var.e;
        p80Var.getClass();
        return p80Var;
    }

    public final void i(y70 y70Var, y70 y70Var2) {
        this.k.put(y70Var, y70Var2);
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap.get(y70Var2) == null) {
            linkedHashMap.put(y70Var2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(y70Var2);
        obj.getClass();
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0280, code lost:
    
        if (r9 != null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0283, code lost:
    
        r7.c(r9);
        r7 = r7.b();
        r9 = r7.a;
        r9.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x028f, code lost:
    
        r10 = defpackage.zd.p0((java.util.Collection) r7.e.d.getValue());
        r11 = r10.listIterator(r10.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a9, code lost:
    
        if (r11.hasPrevious() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02b9, code lost:
    
        if (defpackage.nz.l(((defpackage.y70) r11.previous()).i, r5.i) == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02bb, code lost:
    
        r11 = r11.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02c3, code lost:
    
        r10.set(r11, r5);
        r5 = r7.b;
        r5.getClass();
        r5.k(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02cf, code lost:
    
        r9.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02c2, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02c0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02d3, code lost:
    
        r9.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02d6, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01d3, code lost:
    
        if (r28.i == r7.i) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0104, code lost:
    
        r3 = c(r14, r3, r12, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00e8, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00df, code lost:
    
        r3 = (defpackage.y70) r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (r3 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e5, code lost:
    
        r3 = r3.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e9, code lost:
    
        if (r3 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00eb, code lost:
    
        android.util.Log.i("NavController", "Ignoring popBackStack to route " + r13 + " as it was not found on the current back stack");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c5, code lost:
    
        if (r12.equals(r7) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d5, code lost:
    
        r7 = new defpackage.h8();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01da, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e2, code lost:
    
        if ((r5.size() - 1) < r9) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e8, code lost:
    
        if (r5.isEmpty() != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ea, code lost:
    
        r11 = (defpackage.y70) r5.remove(r5.size() - 1);
        r(r11);
        r19 = new defpackage.y70(r11.d, r11.e, r11.e.a(r29), r11.g, r11.h, r11.i, r11.j);
        r19.g = r11.g;
        r10 = r11.n;
        r10.getClass();
        r19.n = r10;
        r19.b();
        r7.addFirst(r19);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0237, code lost:
    
        defpackage.g8.e("List is empty.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x023c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x023d, code lost:
    
        r16 = r3;
        r3 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0247, code lost:
    
        if (r3.hasNext() == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0249, code lost:
    
        r9 = (defpackage.y70) r3.next();
        r10 = r9.e.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0253, code lost:
    
        if (r10 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0255, code lost:
    
        i(r9, f(r10.i));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x025e, code lost:
    
        r5.addLast(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0262, code lost:
    
        r3 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x026a, code lost:
    
        if (r3.hasNext() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x026c, code lost:
    
        r5 = (defpackage.y70) r3.next();
        r7 = r8.b(r5.e.d);
        r9 = r5.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x027c, code lost:
    
        if (r9 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x027f, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6 A[LOOP:1: B:13:0x004c->B:22:0x00d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00df A[EDGE_INSN: B:23:0x00df->B:24:0x00df BREAK  A[LOOP:1: B:13:0x004c->B:22:0x00d6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0313 A[LOOP:2: B:38:0x030d->B:40:0x0313, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(m80 m80Var, Bundle bundle, c90 c90Var) {
        LinkedHashMap linkedHashMap;
        boolean z;
        boolean z2;
        boolean z3;
        ListIterator listIterator;
        int i;
        Iterator it;
        Object obj;
        boolean z4;
        LinkedHashMap linkedHashMap2 = this.w;
        Iterator it2 = linkedHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((a80) it2.next()).d = true;
        }
        cj0 cj0Var = new cj0();
        h8 h8Var = this.g;
        q90 q90Var = this.v;
        if (c90Var != null) {
            boolean z5 = c90Var.e;
            boolean z6 = c90Var.d;
            String str = c90Var.h;
            if (str == null) {
                linkedHashMap = linkedHashMap2;
                int i2 = c90Var.c;
                if (i2 != -1) {
                    z = m(i2, z6, z5);
                }
                z = false;
            } else if (!h8Var.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator2 = h8Var.listIterator(h8Var.a());
                loop1: while (true) {
                    if (!listIterator2.hasPrevious()) {
                        linkedHashMap = linkedHashMap2;
                        obj = null;
                        break;
                    }
                    obj = listIterator2.previous();
                    y70 y70Var = (y70) obj;
                    m80 m80Var2 = y70Var.e;
                    Bundle a = y70Var.a();
                    m80Var2.getClass();
                    str.getClass();
                    if (nz.l(m80Var2.j, str)) {
                        linkedHashMap = linkedHashMap2;
                    } else {
                        k80 c = m80Var2.c(str);
                        linkedHashMap = linkedHashMap2;
                        if (m80Var2.equals(c != null ? c.d : null)) {
                            if (a != null) {
                                Bundle bundle2 = c.e;
                                if (bundle2 != null) {
                                    Set<String> keySet = bundle2.keySet();
                                    keySet.getClass();
                                    Iterator it3 = keySet.iterator();
                                    while (it3.hasNext()) {
                                        String str2 = (String) it3.next();
                                        if (a.containsKey(str2)) {
                                            Iterator it4 = it3;
                                            if (c.d.h.get(str2) != null) {
                                                g8.q();
                                                break loop1;
                                            }
                                            it3 = it4;
                                        }
                                    }
                                }
                            } else {
                                c.getClass();
                            }
                        }
                        z4 = false;
                        if (!z6 || !z4) {
                            arrayList.add(q90Var.b(y70Var.e.d));
                        }
                        if (!z4) {
                            break;
                        } else {
                            linkedHashMap2 = linkedHashMap;
                        }
                    }
                    z4 = true;
                    if (!z6) {
                    }
                    arrayList.add(q90Var.b(y70Var.e.d));
                    if (!z4) {
                    }
                }
                z = false;
            }
            Bundle a2 = m80Var.a(bundle);
            if (c90Var != null && c90Var.b) {
                if (this.m.containsKey(Integer.valueOf(m80Var.i))) {
                    cj0Var.d = q(m80Var.i, a2, c90Var);
                    z2 = z;
                    z3 = false;
                    t();
                    it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((a80) it.next()).d = false;
                    }
                    if (!z2 || cj0Var.d || z3) {
                        b();
                    } else {
                        s();
                        return;
                    }
                }
            }
            if (c90Var != null && c90Var.a) {
                y70 y70Var2 = (y70) h8Var.f();
                listIterator = h8Var.listIterator(h8Var.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    } else if (((y70) listIterator.previous()).e == m80Var) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                if (i != -1) {
                    if (m80Var instanceof p80) {
                        int i3 = p80.q;
                        List A = kq0.A(new tu0(kq0.z((p80) m80Var, j80.g), o1.I, 1));
                        if (h8Var.f - i == A.size()) {
                            List subList = h8Var.subList(i, h8Var.f);
                            ArrayList arrayList2 = new ArrayList(ae.Y(subList, 10));
                            Iterator it5 = subList.iterator();
                            while (it5.hasNext()) {
                                arrayList2.add(Integer.valueOf(((y70) it5.next()).e.i));
                            }
                        }
                    } else if (y70Var2 != null) {
                        m80 m80Var3 = y70Var2.e;
                        if (m80Var3 != null) {
                        }
                    }
                    if (!z3) {
                        y70 g = y7.g(this.a, m80Var, a2, g(), this.p);
                        p90 b = q90Var.b(m80Var.d);
                        List H = px0.H(g);
                        this.x = new wk(cj0Var, this, m80Var, a2);
                        b.d(H, c90Var);
                        this.x = null;
                    }
                    t();
                    it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                    }
                    if (z2) {
                    }
                    b();
                }
            }
            z2 = z;
            z3 = false;
            if (!z3) {
            }
            t();
            it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
            }
            if (z2) {
            }
            b();
        }
        linkedHashMap = linkedHashMap2;
        z = false;
        Bundle a22 = m80Var.a(bundle);
        if (c90Var != null) {
            if (this.m.containsKey(Integer.valueOf(m80Var.i))) {
            }
        }
        if (c90Var != null) {
            y70 y70Var22 = (y70) h8Var.f();
            listIterator = h8Var.listIterator(h8Var.a());
            while (true) {
                if (listIterator.hasPrevious()) {
                }
            }
            if (i != -1) {
            }
        }
        z2 = z;
        z3 = false;
        if (!z3) {
        }
        t();
        it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
        }
        if (z2) {
        }
        b();
    }

    public final void l() {
        h8 h8Var = this.g;
        if (h8Var.isEmpty()) {
            return;
        }
        y70 y70Var = (y70) h8Var.f();
        m80 m80Var = y70Var != null ? y70Var.e : null;
        m80Var.getClass();
        if (m(m80Var.i, true, false)) {
            b();
        }
    }

    public final boolean m(int i, boolean z, boolean z2) {
        m80 m80Var;
        h8 h8Var = this.g;
        if (h8Var.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = zd.m0(h8Var).iterator();
        while (true) {
            if (!it.hasNext()) {
                m80Var = null;
                break;
            }
            m80Var = ((y70) it.next()).e;
            p90 b = this.v.b(m80Var.d);
            if (z || m80Var.i != i) {
                arrayList.add(b);
            }
            if (m80Var.i == i) {
                break;
            }
        }
        if (m80Var != null) {
            return c(arrayList, m80Var, z, z2);
        }
        int i2 = m80.l;
        Log.i("NavController", "Ignoring popBackStack to destination " + a50.u(this.a, i) + " as it was not found on the current back stack");
        return false;
    }

    public final void n(y70 y70Var, boolean z, h8 h8Var) {
        e80 e80Var;
        pi0 pi0Var;
        Set set;
        h8 h8Var2 = this.g;
        y70 y70Var2 = (y70) h8Var2.last();
        if (!nz.l(y70Var2, y70Var)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(y70Var.e);
            m80 m80Var = y70Var2.e;
            sb.append(", which is not the top of the back stack (");
            sb.append(m80Var);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        if (h8Var2.isEmpty()) {
            g8.e("List is empty.");
            return;
        }
        boolean z2 = true;
        h8Var2.remove(h8Var2.size() - 1);
        a80 a80Var = (a80) this.w.get(this.v.b(y70Var2.e.d));
        if ((a80Var == null || (pi0Var = a80Var.f) == null || (set = (Set) pi0Var.d.getValue()) == null || !set.contains(y70Var2)) && !this.l.containsKey(y70Var2)) {
            z2 = false;
        }
        f20 f20Var = y70Var2.k.c;
        f20 f20Var2 = f20.f;
        if (f20Var.compareTo(f20Var2) >= 0) {
            if (z) {
                y70Var2.n = f20Var2;
                y70Var2.b();
                h8Var.addFirst(new z70(y70Var2));
            }
            if (z2) {
                y70Var2.n = f20Var2;
                y70Var2.b();
            } else {
                y70Var2.n = f20.d;
                y70Var2.b();
                r(y70Var2);
            }
        }
        if (z || z2 || (e80Var = this.p) == null) {
            return;
        }
        String str = y70Var2.i;
        str.getClass();
        q01 q01Var = (q01) e80Var.a.remove(str);
        if (q01Var != null) {
            q01Var.a();
        }
    }

    public final ArrayList p() {
        f20 f20Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.w.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            f20Var = f20.g;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((a80) it.next()).f.d.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                y70 y70Var = (y70) obj;
                if (!arrayList.contains(y70Var) && y70Var.n.compareTo(f20Var) < 0) {
                    arrayList2.add(obj);
                }
            }
            ee.a0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            y70 y70Var2 = (y70) next;
            if (!arrayList.contains(y70Var2) && y70Var2.n.compareTo(f20Var) >= 0) {
                arrayList3.add(next);
            }
        }
        ee.a0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!(((y70) obj2).e instanceof p80)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean q(int i, Bundle bundle, c90 c90Var) {
        m80 m80Var;
        y70 y70Var;
        m80 m80Var2;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.m;
        int i2 = 0;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection values = linkedHashMap.values();
        values.getClass();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (nz.l((String) it.next(), str)) {
                it.remove();
            }
        }
        h8 h8Var = (h8) px0.i(this.n).remove(str);
        ArrayList arrayList = new ArrayList();
        y70 y70Var2 = (y70) this.g.f();
        if ((y70Var2 == null || (m80Var = y70Var2.e) == null) && (m80Var = this.c) == null) {
            g8.s("You must call setGraph() before calling getGraph()");
            return false;
        }
        if (h8Var != null) {
            Iterator it2 = h8Var.iterator();
            while (it2.hasNext()) {
                z70 z70Var = (z70) it2.next();
                m80 e = e(m80Var, z70Var.e, true, null);
                Context context = this.a;
                if (e == null) {
                    int i3 = m80.l;
                    g8.p("Restore State failed: destination ", a50.u(context, z70Var.e), " cannot be found from the current destination ", m80Var);
                    return false;
                }
                arrayList.add(z70Var.a(context, e, g(), this.p));
                m80Var = e;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!(((y70) obj).e instanceof p80)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            y70 y70Var3 = (y70) obj2;
            List list = (List) zd.i0(arrayList2);
            if (nz.l((list == null || (y70Var = (y70) zd.h0(list)) == null || (m80Var2 = y70Var.e) == null) ? null : m80Var2.d, y70Var3.e.d)) {
                list.add(y70Var3);
            } else {
                arrayList2.add(new ArrayList(new b8(new y70[]{y70Var3}, true)));
            }
        }
        cj0 cj0Var = new cj0();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj3;
            p90 b = this.v.b(((y70) zd.c0(list2)).e.d);
            this.x = new d80(cj0Var, arrayList, new ej0(), this, bundle);
            b.d(list2, c90Var);
            this.x = null;
        }
        return cj0Var.d;
    }

    public final void r(y70 y70Var) {
        y70Var.getClass();
        y70 y70Var2 = (y70) this.k.remove(y70Var);
        if (y70Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(y70Var2);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            a80 a80Var = (a80) this.w.get(this.v.b(y70Var2.e.d));
            if (a80Var != null) {
                a80Var.b(y70Var2);
            }
            linkedHashMap.remove(y70Var2);
        }
    }

    public final void s() {
        AtomicInteger atomicInteger;
        pi0 pi0Var;
        Set set;
        ArrayList p0 = zd.p0(this.g);
        if (p0.isEmpty()) {
            return;
        }
        m80 m80Var = ((y70) zd.h0(p0)).e;
        ArrayList arrayList = new ArrayList();
        if (m80Var instanceof km) {
            Iterator it = zd.m0(p0).iterator();
            while (it.hasNext()) {
                m80 m80Var2 = ((y70) it.next()).e;
                arrayList.add(m80Var2);
                if (!(m80Var2 instanceof km) && !(m80Var2 instanceof p80)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        Iterator it2 = zd.m0(p0).iterator();
        while (true) {
            int i = 0;
            if (!it2.hasNext()) {
                int size = p0.size();
                while (i < size) {
                    Object obj = p0.get(i);
                    i++;
                    y70 y70Var = (y70) obj;
                    f20 f20Var = (f20) hashMap.get(y70Var);
                    if (f20Var != null) {
                        y70Var.getClass();
                        y70Var.n = f20Var;
                        y70Var.b();
                    } else {
                        y70Var.b();
                    }
                }
                return;
            }
            y70 y70Var2 = (y70) it2.next();
            f20 f20Var2 = y70Var2.n;
            m80 m80Var3 = y70Var2.e;
            f20 f20Var3 = f20.h;
            f20 f20Var4 = f20.g;
            if (m80Var != null && m80Var3.i == m80Var.i) {
                if (f20Var2 != f20Var3) {
                    a80 a80Var = (a80) this.w.get(this.v.b(m80Var3.d));
                    if (nz.l((a80Var == null || (pi0Var = a80Var.f) == null || (set = (Set) pi0Var.d.getValue()) == null) ? null : Boolean.valueOf(set.contains(y70Var2)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.l.get(y70Var2)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(y70Var2, f20Var4);
                    } else {
                        hashMap.put(y70Var2, f20Var3);
                    }
                }
                m80 m80Var4 = (m80) zd.d0(arrayList);
                if (m80Var4 != null && m80Var4.i == m80Var3.i) {
                    if (arrayList.isEmpty()) {
                        g8.e("List is empty.");
                        return;
                    }
                    arrayList.remove(0);
                }
                m80Var = m80Var.e;
            } else if (arrayList.isEmpty() || m80Var3.i != ((m80) zd.c0(arrayList)).i) {
                y70Var2.n = f20.f;
                y70Var2.b();
            } else {
                if (arrayList.isEmpty()) {
                    g8.e("List is empty.");
                    return;
                }
                m80 m80Var5 = (m80) arrayList.remove(0);
                if (f20Var2 == f20Var3) {
                    y70Var2.n = f20Var4;
                    y70Var2.b();
                } else if (f20Var2 != f20Var4) {
                    hashMap.put(y70Var2, f20Var4);
                }
                p80 p80Var = m80Var5.e;
                if (p80Var != null && !arrayList.contains(p80Var)) {
                    arrayList.add(p80Var);
                }
            }
        }
    }

    public final void t() {
        int i;
        boolean z = false;
        if (this.u) {
            h8 h8Var = this.g;
            if (h8Var == null || !h8Var.isEmpty()) {
                Iterator it = h8Var.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!(((y70) it.next()).e instanceof p80) && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            } else {
                i = 0;
            }
            if (i > 1) {
                z = true;
            }
        }
        this.t.d(z);
    }
}
