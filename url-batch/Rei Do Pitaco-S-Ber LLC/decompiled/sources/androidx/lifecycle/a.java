package androidx.lifecycle;

import android.os.Looper;
import defpackage.c6;
import defpackage.dm;
import defpackage.dp;
import defpackage.fp;
import defpackage.gp;
import defpackage.jp;
import defpackage.ke;
import defpackage.kp;
import defpackage.l8;
import defpackage.lp;
import defpackage.m00;
import defpackage.mp;
import defpackage.n00;
import defpackage.np;
import defpackage.o00;
import defpackage.ri;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class a {
    public final boolean a;
    public ri b;
    public gp c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;

    public a(lp lpVar) {
        new AtomicReference();
        this.a = true;
        this.b = new ri();
        this.c = gp.g;
        this.h = new ArrayList();
        this.d = new WeakReference(lpVar);
    }

    public final void a(kp kpVar) {
        jp reflectiveGenericLifecycleObserver;
        Object obj;
        lp lpVar;
        c("addObserver");
        gp gpVar = this.c;
        gp gpVar2 = gp.f;
        if (gpVar != gpVar2) {
            gpVar2 = gp.g;
        }
        mp mpVar = new mp();
        HashMap hashMap = np.a;
        boolean z = kpVar instanceof jp;
        boolean z2 = kpVar instanceof ke;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((ke) kpVar, (jp) kpVar);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((ke) kpVar, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (jp) kpVar;
        } else {
            Class<?> cls = kpVar.getClass();
            if (np.b(cls) == 2) {
                Object obj2 = np.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    np.a((Constructor) list.get(0), kpVar);
                    throw null;
                }
                int size = list.size();
                dm[] dmVarArr = new dm[size];
                if (size > 0) {
                    np.a((Constructor) list.get(0), kpVar);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(dmVarArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(kpVar);
            }
        }
        mpVar.b = reflectiveGenericLifecycleObserver;
        mpVar.a = gpVar2;
        ri riVar = this.b;
        n00 a = riVar.a(kpVar);
        if (a != null) {
            obj = a.g;
        } else {
            HashMap hashMap2 = riVar.j;
            n00 n00Var = new n00(kpVar, mpVar);
            riVar.i++;
            n00 n00Var2 = riVar.g;
            if (n00Var2 == null) {
                riVar.f = n00Var;
                riVar.g = n00Var;
            } else {
                n00Var2.h = n00Var;
                n00Var.i = n00Var2;
                riVar.g = n00Var;
            }
            hashMap2.put(kpVar, n00Var);
            obj = null;
        }
        if (((mp) obj) == null && (lpVar = (lp) this.d.get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            gp b = b(kpVar);
            this.e++;
            while (mpVar.a.compareTo(b) < 0 && this.b.j.containsKey(kpVar)) {
                gp gpVar3 = mpVar.a;
                ArrayList arrayList = this.h;
                arrayList.add(gpVar3);
                dp dpVar = fp.Companion;
                gp gpVar4 = mpVar.a;
                dpVar.getClass();
                gpVar4.getClass();
                int ordinal = gpVar4.ordinal();
                fp fpVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : fp.ON_RESUME : fp.ON_START : fp.ON_CREATE;
                if (fpVar == null) {
                    throw new IllegalStateException("no event up from " + mpVar.a);
                }
                mpVar.a(lpVar, fpVar);
                arrayList.remove(arrayList.size() - 1);
                b = b(kpVar);
            }
            if (!z3) {
                g();
            }
            this.e--;
        }
    }

    public final gp b(kp kpVar) {
        mp mpVar;
        HashMap hashMap = this.b.j;
        n00 n00Var = hashMap.containsKey(kpVar) ? ((n00) hashMap.get(kpVar)).i : null;
        gp gpVar = (n00Var == null || (mpVar = (mp) n00Var.g) == null) ? null : mpVar.a;
        ArrayList arrayList = this.h;
        gp gpVar2 = arrayList.isEmpty() ? null : (gp) arrayList.get(arrayList.size() - 1);
        gp gpVar3 = this.c;
        gpVar3.getClass();
        if (gpVar == null || gpVar.compareTo(gpVar3) >= 0) {
            gpVar = gpVar3;
        }
        return (gpVar2 == null || gpVar2.compareTo(gpVar) >= 0) ? gpVar : gpVar2;
    }

    public final void c(String str) {
        if (this.a) {
            ((c6) c6.e0().u).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            l8.s(str, " must be called on the main thread", "Method ");
        }
    }

    public final void d(fp fpVar) {
        fpVar.getClass();
        c("handleLifecycleEvent");
        e(fpVar.a());
    }

    public final void e(gp gpVar) {
        gp gpVar2 = this.c;
        if (gpVar2 == gpVar) {
            return;
        }
        gp gpVar3 = gp.g;
        gp gpVar4 = gp.f;
        if (gpVar2 == gpVar3 && gpVar == gpVar4) {
            StringBuilder sb = new StringBuilder("no event down from ");
            sb.append(this.c);
            Object obj = this.d.get();
            sb.append(" in component ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.c = gpVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.c == gpVar4) {
            this.b = new ri();
        }
    }

    public final void f(kp kpVar) {
        c("removeObserver");
        this.b.b(kpVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r11.g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        lp lpVar = (lp) this.d.get();
        if (lpVar == null) {
            l8.u("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            ri riVar = this.b;
            if (riVar.i != 0) {
                n00 n00Var = riVar.f;
                n00Var.getClass();
                gp gpVar = ((mp) n00Var.g).a;
                n00 n00Var2 = this.b.g;
                n00Var2.getClass();
                gp gpVar2 = ((mp) n00Var2.g).a;
                if (gpVar == gpVar2 && this.c == gpVar2) {
                    break;
                }
                this.g = false;
                gp gpVar3 = this.c;
                n00 n00Var3 = this.b.f;
                n00Var3.getClass();
                int compareTo = gpVar3.compareTo(((mp) n00Var3.g).a);
                ArrayList arrayList = this.h;
                if (compareTo < 0) {
                    ri riVar2 = this.b;
                    m00 m00Var = new m00(riVar2.g, riVar2.f, 1);
                    riVar2.h.put(m00Var, Boolean.FALSE);
                    while (m00Var.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) m00Var.next();
                        entry.getClass();
                        kp kpVar = (kp) entry.getKey();
                        mp mpVar = (mp) entry.getValue();
                        while (mpVar.a.compareTo(this.c) > 0 && !this.g && this.b.j.containsKey(kpVar)) {
                            dp dpVar = fp.Companion;
                            gp gpVar4 = mpVar.a;
                            dpVar.getClass();
                            gpVar4.getClass();
                            int ordinal = gpVar4.ordinal();
                            fp fpVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : fp.ON_PAUSE : fp.ON_STOP : fp.ON_DESTROY;
                            if (fpVar == null) {
                                throw new IllegalStateException("no event down from " + mpVar.a);
                            }
                            arrayList.add(fpVar.a());
                            mpVar.a(lpVar, fpVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                n00 n00Var4 = this.b.g;
                if (!this.g && n00Var4 != null && this.c.compareTo(((mp) n00Var4.g).a) > 0) {
                    ri riVar3 = this.b;
                    riVar3.getClass();
                    o00 o00Var = new o00(riVar3);
                    riVar3.h.put(o00Var, Boolean.FALSE);
                    while (o00Var.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) o00Var.next();
                        kp kpVar2 = (kp) entry2.getKey();
                        mp mpVar2 = (mp) entry2.getValue();
                        while (mpVar2.a.compareTo(this.c) < 0 && !this.g && this.b.j.containsKey(kpVar2)) {
                            arrayList.add(mpVar2.a);
                            dp dpVar2 = fp.Companion;
                            gp gpVar5 = mpVar2.a;
                            dpVar2.getClass();
                            gpVar5.getClass();
                            int ordinal2 = gpVar5.ordinal();
                            fp fpVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : fp.ON_RESUME : fp.ON_START : fp.ON_CREATE;
                            if (fpVar2 == null) {
                                throw new IllegalStateException("no event up from " + mpVar2.a);
                            }
                            mpVar2.a(lpVar, fpVar2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
