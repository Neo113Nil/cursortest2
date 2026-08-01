package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Trace;
import android.text.TextPaint;
import android.util.Log;
import android.util.SparseArray;
import com.vectorharbor.planetvectorsurvey.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class t7 implements ig0, u7 {
    public static volatile t7 h;
    public static final Object i = new Object();
    public final /* synthetic */ int d;
    public Object e;
    public Object f;
    public Object g;

    public t7(int i2) {
        this.d = i2;
        switch (i2) {
            case 3:
                this.e = new p01(6);
                this.f = new p01(6);
                this.g = new p01(6);
                break;
            case 8:
                this.e = new AtomicReference(d31.g);
                this.f = new Object();
                break;
            case 10:
                this.e = new WeakHashMap();
                this.f = new WeakHashMap();
                this.g = new WeakHashMap();
                break;
            default:
                this.g = new pg0(15);
                break;
        }
    }

    public static t7 q(Context context) {
        if (h == null) {
            synchronized (i) {
                try {
                    if (h == null) {
                        h = new t7(context);
                    }
                } finally {
                }
            }
        }
        return h;
    }

    public void A(c10 c10Var) {
        ((nc) this.g).d.b = c10Var;
    }

    public void B(long j) {
        ((nc) this.g).d.d = j;
    }

    public void C() {
        a70 a70Var = (a70) this.e;
        String str = (String) this.f;
        List list = (List) a70Var.k(str);
        if (list != null) {
            list.remove((bu) this.g);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        a70Var.m(str, list);
    }

    public void a(p10 p10Var, tz tzVar) {
        p01 p01Var = (p01) this.e;
        p01 p01Var2 = (p01) this.f;
        p01 p01Var3 = (p01) this.g;
        int ordinal = tzVar.ordinal();
        if (ordinal == 0) {
            p01Var.e(p10Var);
            p01Var3.e(p10Var);
            return;
        }
        if (ordinal == 1) {
            p01Var2.e(p10Var);
            p01Var3.e(p10Var);
            return;
        }
        if (ordinal == 2) {
            if (p10Var.j != null) {
                p01Var3.e(p10Var);
                return;
            } else {
                p01Var.e(p10Var);
                return;
            }
        }
        if (ordinal != 3) {
            g8.c();
        } else if (p10Var.j != null) {
            p01Var3.e(p10Var);
        } else {
            p01Var2.e(p10Var);
        }
    }

    @Override // defpackage.u7
    public void b(int i2, Object obj) {
        ((p10) this.g).u(i2, (p10) obj);
    }

    @Override // defpackage.u7
    public void c(Object obj) {
        ((ArrayList) this.f).add(this.g);
        this.g = obj;
    }

    @Override // defpackage.u7
    public void d() {
        m2 m2Var;
        p10 p10Var = (p10) this.g;
        ca0 ca0Var = p10Var.F;
        if (!p10Var.B()) {
            cy.a("onReuse is only expected on attached node");
        }
        p10Var.u = false;
        if (p10Var.N) {
            p10Var.N = false;
        } else {
            t50 t50Var = (su0) p10Var.F.i;
            for (t50 t50Var2 = t50Var; t50Var2 != null; t50Var2 = t50Var2.h) {
                if (t50Var2.q) {
                    t50Var2.e0();
                }
            }
            for (t50 t50Var3 = t50Var; t50Var3 != null; t50Var3 = t50Var3.h) {
                if (t50Var3.q) {
                    t50Var3.g0();
                }
            }
            while (t50Var != null) {
                if (t50Var.q) {
                    t50Var.Y();
                }
                t50Var = t50Var.h;
            }
        }
        int i2 = p10Var.e;
        p10Var.e = op0.a.addAndGet(1);
        dd0 dd0Var = p10Var.p;
        if (dd0Var != null) {
            f3 f3Var = (f3) dd0Var;
            f3Var.m15getLayoutNodes().g(i2);
            f3Var.m15getLayoutNodes().h(p10Var.e, p10Var);
        }
        for (t50 t50Var4 = (t50) ca0Var.j; t50Var4 != null; t50Var4 = t50Var4.i) {
            t50Var4.X();
        }
        ca0Var.j();
        if (ca0Var.h(8)) {
            p10Var.z();
        }
        p10.N(p10Var);
        dd0 dd0Var2 = p10Var.p;
        if (dd0Var2 != null) {
            f3 f3Var2 = (f3) dd0Var2;
            if (f3.j() && (m2Var = f3Var2.H) != null) {
                f3 f3Var3 = m2Var.c;
                p01 p01Var = m2Var.a;
                q60 q60Var = m2Var.g;
                if (q60Var.e(i2)) {
                    p01Var.p(f3Var3, i2, false);
                }
                np0 p = p10Var.p();
                if (p != null && p.d.b(vp0.q)) {
                    q60Var.a(p10Var.e);
                    p01Var.p(f3Var3, p10Var.e, true);
                }
            }
            f3Var2.getRectManager().g(p10Var, true);
        }
    }

    @Override // defpackage.u7
    public /* bridge */ /* synthetic */ void e(int i2, Object obj) {
    }

    @Override // defpackage.u7
    public void f(int i2, int i3, int i4) {
        p10 p10Var = (p10) this.g;
        j3 j3Var = p10Var.l;
        if (i2 == i3) {
            return;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i2 > i3 ? i2 + i5 : i2;
            int i7 = i2 > i3 ? i3 + i5 : (i3 + i4) - 2;
            l70 l70Var = (l70) j3Var.e;
            b bVar = (b) j3Var.f;
            Object j = l70Var.j(i6);
            bVar.a();
            ((l70) j3Var.e).a(i7, (p10) j);
            bVar.a();
        }
        p10Var.H();
        p10Var.A();
        p10Var.x();
    }

    @Override // defpackage.ig0
    public t30 g() {
        LocaleList localeList;
        int size;
        Locale locale;
        localeList = LocaleList.getDefault();
        synchronized (((pg0) this.g)) {
            try {
                t30 t30Var = (t30) this.f;
                if (t30Var != null && localeList == ((LocaleList) this.e)) {
                    return t30Var;
                }
                size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    locale = localeList.get(i2);
                    arrayList.add(new s30(locale));
                }
                t30 t30Var2 = new t30(arrayList);
                this.e = localeList;
                this.f = t30Var2;
                return t30Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.u7
    public void h(int i2, int i3) {
        p10 p10Var = (p10) this.g;
        j3 j3Var = p10Var.l;
        if (i3 < 0) {
            cy.a("count (" + i3 + ") must be greater than 0");
        }
        int i4 = (i3 + i2) - 1;
        if (i2 > i4) {
            return;
        }
        while (true) {
            p10Var.E((p10) ((l70) j3Var.e).d[i4]);
            Object j = ((l70) j3Var.e).j(i4);
            ((b) j3Var.f).a();
            if (i4 == i2) {
                return;
            } else {
                i4--;
            }
        }
    }

    @Override // defpackage.u7
    public void i(qu quVar, Object obj) {
        quVar.invoke(this.g, obj);
    }

    public void j() {
        ((ArrayList) this.f).clear();
        this.g = this.e;
        p10 p10Var = (p10) this.e;
        j3 j3Var = p10Var.l;
        int i2 = ((l70) j3Var.e).f;
        while (true) {
            i2--;
            l70 l70Var = (l70) j3Var.e;
            if (-1 >= i2) {
                l70Var.g();
                ((b) j3Var.f).a();
                return;
            }
            p10Var.E((p10) l70Var.d[i2]);
        }
    }

    public void k(Bundle bundle) {
        HashSet hashSet = (HashSet) this.f;
        String string = ((Context) this.g).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (ay.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    n((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new kf(e);
            }
        }
    }

    @Override // defpackage.u7
    public void l() {
        this.g = ((ArrayList) this.f).remove(r0.size() - 1);
    }

    @Override // defpackage.ig0
    public Locale m(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (nz.l(forLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return forLanguageTag;
    }

    public Object n(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.e;
        if (ch0.i()) {
            try {
                ch0.d(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                ay ayVar = (ay) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = ayVar.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            n(cls2, hashSet);
                        }
                    }
                }
                obj = ayVar.b((Context) this.g);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new kf(th);
            }
        }
        return obj;
    }

    public Object o() {
        long j = rg0.j();
        if (j == lw0.a) {
            return this.g;
        }
        iw0 iw0Var = (iw0) ((AtomicReference) this.e).get();
        int a = iw0Var.a(j);
        if (a >= 0) {
            return iw0Var.c[a];
        }
        return null;
    }

    public kc p() {
        return ((nc) this.g).d.c;
    }

    public long r() {
        return ((nc) this.g).d.d;
    }

    public boolean s(CharSequence charSequence, int i2, int i3, yx0 yx0Var) {
        if ((yx0Var.c & 3) == 0) {
            zk zkVar = (zk) this.g;
            l50 b = yx0Var.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.g).getShort(a + b.d);
            }
            zkVar.getClass();
            ThreadLocal threadLocal = zk.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = zkVar.a;
            String sb2 = sb.toString();
            int i4 = kd0.a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i5 = yx0Var.c & 4;
            yx0Var.c = hasGlyph ? i5 | 2 : i5 | 1;
        }
        return (yx0Var.c & 3) == 2;
    }

    public boolean t() {
        return !(((ls0) ((p01) this.e).e).isEmpty() && ((ls0) ((p01) this.g).e).isEmpty() && ((ls0) ((p01) this.f).e).isEmpty());
    }

    public String toString() {
        switch (this.d) {
            case 6:
                String str = (String) this.g;
                String str2 = (String) this.f;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.e;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean u() {
        if (((bt0) this.e).getValue() != this.g) {
            return true;
        }
        t7 t7Var = (t7) this.f;
        return t7Var != null && t7Var.u();
    }

    public void v() {
        dd0 dd0Var = ((p10) this.e).p;
        if (dd0Var != null) {
            ((f3) dd0Var).w();
        }
    }

    public Object w(CharSequence charSequence, int i2, int i3, int i4, boolean z, np npVar) {
        int i5;
        char c;
        pp ppVar = new pp((n50) ((k2) this.f).f);
        int codePointAt = Character.codePointAt(charSequence, i2);
        int i6 = 0;
        boolean z2 = true;
        int i7 = i2;
        loop0: while (true) {
            i5 = i7;
            while (i7 < i3 && i6 < i4 && z2) {
                SparseArray sparseArray = ppVar.c.a;
                n50 n50Var = sparseArray == null ? null : (n50) sparseArray.get(codePointAt);
                if (ppVar.a == 2) {
                    if (n50Var != null) {
                        ppVar.c = n50Var;
                        ppVar.f++;
                    } else {
                        if (codePointAt == 65038) {
                            ppVar.a();
                        } else if (codePointAt != 65039) {
                            n50 n50Var2 = ppVar.c;
                            if (n50Var2.b != null) {
                                if (ppVar.f != 1) {
                                    ppVar.d = n50Var2;
                                    ppVar.a();
                                } else if (ppVar.b()) {
                                    ppVar.d = ppVar.c;
                                    ppVar.a();
                                } else {
                                    ppVar.a();
                                }
                                c = 3;
                            } else {
                                ppVar.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (n50Var == null) {
                    ppVar.a();
                    c = 1;
                } else {
                    ppVar.a = 2;
                    ppVar.c = n50Var;
                    ppVar.f = 1;
                    c = 2;
                }
                ppVar.e = codePointAt;
                if (c == 1) {
                    i7 = Character.charCount(Character.codePointAt(charSequence, i5)) + i5;
                    if (i7 < i3) {
                        codePointAt = Character.codePointAt(charSequence, i7);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i7;
                    if (charCount < i3) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i7 = charCount;
                } else if (c == 3) {
                    if (z || !s(charSequence, i5, i7, ppVar.d.b)) {
                        z2 = npVar.b(charSequence, i5, i7, ppVar.d.b);
                        i6++;
                    }
                }
            }
        }
        if (ppVar.a == 2 && ppVar.c.b != null && ((ppVar.f > 1 || ppVar.b()) && i6 < i4 && z2 && (z || !s(charSequence, i5, i7, ppVar.c.b)))) {
            npVar.b(charSequence, i5, i7, ppVar.c.b);
        }
        return npVar.a();
    }

    public void x(Object obj) {
        long j = rg0.j();
        if (j == lw0.a) {
            this.g = obj;
            return;
        }
        synchronized (this.f) {
            iw0 iw0Var = (iw0) ((AtomicReference) this.e).get();
            int a = iw0Var.a(j);
            if (a < 0) {
                ((AtomicReference) this.e).set(iw0Var.b(j, obj));
            } else {
                iw0Var.c[a] = obj;
            }
        }
    }

    public void y(kc kcVar) {
        ((nc) this.g).d.c = kcVar;
    }

    public void z(sl slVar) {
        ((nc) this.g).d.a = slVar;
    }

    public /* synthetic */ t7(Object obj, Object obj2, Object obj3, int i2) {
        this.d = i2;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    public t7(Intent intent) {
        this.d = 6;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.e = data;
        this.f = action;
        this.g = type;
    }

    public t7(nc ncVar) {
        this.d = 2;
        this.g = ncVar;
        this.e = new p01(2, this);
    }

    public t7(Context context) {
        this.d = 0;
        this.g = context.getApplicationContext();
        this.f = new HashSet();
        this.e = new HashMap();
    }

    public t7(k2 k2Var, y7 y7Var, zk zkVar, Set set) {
        this.d = 4;
        this.e = y7Var;
        this.f = k2Var;
        this.g = zkVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            w(str, 0, str.length(), 1, true, new op(str, 0));
        }
    }

    public t7(by0 by0Var, t7 t7Var) {
        this.d = 9;
        this.e = by0Var;
        this.f = t7Var;
        this.g = by0Var.d;
    }

    public t7(p10 p10Var) {
        this.d = 11;
        this.e = p10Var;
        this.f = new ArrayList();
        this.g = p10Var;
    }
}
