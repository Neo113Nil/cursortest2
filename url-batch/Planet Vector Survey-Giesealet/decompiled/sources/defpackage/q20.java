package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class q20 extends g20 {
    public final boolean a;
    public zq b;
    public f20 c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public final et0 i;

    public q20(o20 o20Var, boolean z) {
        new AtomicReference(null);
        this.a = z;
        this.b = new zq();
        f20 f20Var = f20.e;
        this.c = f20Var;
        this.h = new ArrayList();
        this.d = new WeakReference(o20Var);
        this.i = nk.b(f20Var);
    }

    @Override // defpackage.g20
    public final void a(n20 n20Var) {
        m20 flVar;
        p20 p20Var;
        o20 o20Var;
        n20Var.getClass();
        d("addObserver");
        f20 f20Var = this.c;
        f20 f20Var2 = f20.d;
        if (f20Var != f20Var2) {
            f20Var2 = f20.e;
        }
        p20 p20Var2 = new p20();
        HashMap hashMap = s20.a;
        boolean z = n20Var instanceof m20;
        boolean z2 = n20Var instanceof dl;
        int i = 2;
        if (z && z2) {
            flVar = new fl((dl) n20Var, (m20) n20Var);
        } else if (z2) {
            flVar = new fl((dl) n20Var, (m20) null);
        } else if (z) {
            flVar = (m20) n20Var;
        } else {
            Class<?> cls = n20Var.getClass();
            if (s20.b(cls) == 2) {
                Object obj = s20.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    s20.a((Constructor) list.get(0), n20Var);
                    throw null;
                }
                int size = list.size();
                cv[] cvVarArr = new cv[size];
                if (size > 0) {
                    s20.a((Constructor) list.get(0), n20Var);
                    throw null;
                }
                flVar = new yi0(i, cvVarArr);
            } else {
                flVar = new fl(n20Var);
            }
        }
        p20Var2.b = flVar;
        p20Var2.a = f20Var2;
        zq zqVar = this.b;
        rm0 rm0Var = (rm0) zqVar.h.get(n20Var);
        if (rm0Var != null) {
            p20Var = rm0Var.e;
        } else {
            HashMap hashMap2 = zqVar.h;
            rm0 rm0Var2 = new rm0(n20Var, p20Var2);
            zqVar.g++;
            rm0 rm0Var3 = zqVar.e;
            if (rm0Var3 == null) {
                zqVar.d = rm0Var2;
                zqVar.e = rm0Var2;
            } else {
                rm0Var3.f = rm0Var2;
                rm0Var2.g = rm0Var3;
                zqVar.e = rm0Var2;
            }
            hashMap2.put(n20Var, rm0Var2);
            p20Var = null;
        }
        if (p20Var == null && (o20Var = (o20) this.d.get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            f20 c = c(n20Var);
            this.e++;
            while (p20Var2.a.compareTo(c) < 0 && this.b.h.containsKey(n20Var)) {
                f20 f20Var3 = p20Var2.a;
                ArrayList arrayList = this.h;
                arrayList.add(f20Var3);
                c20 c20Var = e20.Companion;
                f20 f20Var4 = p20Var2.a;
                c20Var.getClass();
                f20Var4.getClass();
                int ordinal = f20Var4.ordinal();
                e20 e20Var = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : e20.ON_RESUME : e20.ON_START : e20.ON_CREATE;
                if (e20Var == null) {
                    g8.l(p20Var2.a, "no event up from ");
                    return;
                } else {
                    p20Var2.a(o20Var, e20Var);
                    arrayList.remove(arrayList.size() - 1);
                    c = c(n20Var);
                }
            }
            if (!z3) {
                g();
            }
            this.e--;
        }
    }

    @Override // defpackage.g20
    public final void b(n20 n20Var) {
        n20Var.getClass();
        d("removeObserver");
        zq zqVar = this.b;
        WeakHashMap weakHashMap = zqVar.f;
        HashMap hashMap = zqVar.h;
        rm0 rm0Var = (rm0) hashMap.get(n20Var);
        if (rm0Var != null) {
            zqVar.g--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((tm0) it.next()).a(rm0Var);
                }
            }
            rm0 rm0Var2 = rm0Var.g;
            rm0 rm0Var3 = rm0Var.f;
            if (rm0Var2 != null) {
                rm0Var2.f = rm0Var3;
            } else {
                zqVar.d = rm0Var3;
            }
            rm0 rm0Var4 = rm0Var.f;
            if (rm0Var4 != null) {
                rm0Var4.g = rm0Var2;
            } else {
                zqVar.e = rm0Var2;
            }
            rm0Var.f = null;
            rm0Var.g = null;
        }
        hashMap.remove(n20Var);
    }

    public final f20 c(n20 n20Var) {
        HashMap hashMap = this.b.h;
        rm0 rm0Var = hashMap.containsKey(n20Var) ? ((rm0) hashMap.get(n20Var)).g : null;
        f20 f20Var = rm0Var != null ? rm0Var.e.a : null;
        ArrayList arrayList = this.h;
        f20 f20Var2 = arrayList.isEmpty() ? null : (f20) arrayList.get(arrayList.size() - 1);
        f20 f20Var3 = this.c;
        f20Var3.getClass();
        if (f20Var == null || f20Var.compareTo(f20Var3) >= 0) {
            f20Var = f20Var3;
        }
        return (f20Var2 == null || f20Var2.compareTo(f20Var) >= 0) ? f20Var : f20Var2;
    }

    public final void d(String str) {
        v7 v7Var;
        if (this.a) {
            if (v7.d != null) {
                v7Var = v7.d;
            } else {
                synchronized (v7.class) {
                    try {
                        if (v7.d == null) {
                            v7.d = new v7(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                v7Var = v7.d;
            }
            ((v7) v7Var.c).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            g8.h("Method ", str, " must be called on the main thread");
        }
    }

    public final void e(e20 e20Var) {
        e20Var.getClass();
        d("handleLifecycleEvent");
        f(e20Var.a());
    }

    public final void f(f20 f20Var) {
        if (this.c == f20Var) {
            return;
        }
        o20 o20Var = (o20) this.d.get();
        f20 f20Var2 = this.c;
        f20Var2.getClass();
        f20Var.getClass();
        f20 f20Var3 = f20.e;
        f20 f20Var4 = f20.d;
        if (f20Var2 == f20Var3 && f20Var == f20Var4) {
            throw new IllegalStateException(("State must be at least '" + f20.f + "' to be moved to '" + f20Var + "' in component " + o20Var).toString());
        }
        if (f20Var2 == f20Var4 && f20Var2 != f20Var) {
            throw new IllegalStateException(("State is '" + f20Var4 + "' and cannot be moved to `" + f20Var + "` in component " + o20Var).toString());
        }
        this.c = f20Var;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.c == f20Var4) {
            this.b = new zq();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r11.g = false;
        r11.i.j(r11.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        o20 o20Var = (o20) this.d.get();
        if (o20Var == null) {
            g8.s("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            zq zqVar = this.b;
            if (zqVar.g != 0) {
                rm0 rm0Var = zqVar.d;
                rm0Var.getClass();
                f20 f20Var = rm0Var.e.a;
                rm0 rm0Var2 = this.b.e;
                rm0Var2.getClass();
                f20 f20Var2 = rm0Var2.e.a;
                if (f20Var == f20Var2 && this.c == f20Var2) {
                    break;
                }
                this.g = false;
                f20 f20Var3 = this.c;
                rm0 rm0Var3 = this.b.d;
                rm0Var3.getClass();
                int compareTo = f20Var3.compareTo(rm0Var3.e.a);
                ArrayList arrayList = this.h;
                if (compareTo < 0) {
                    zq zqVar2 = this.b;
                    qm0 qm0Var = new qm0(zqVar2.e, zqVar2.d, 1);
                    zqVar2.f.put(qm0Var, Boolean.FALSE);
                    while (qm0Var.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) qm0Var.next();
                        entry.getClass();
                        n20 n20Var = (n20) entry.getKey();
                        p20 p20Var = (p20) entry.getValue();
                        while (p20Var.a.compareTo(this.c) > 0 && !this.g && this.b.h.containsKey(n20Var)) {
                            c20 c20Var = e20.Companion;
                            f20 f20Var4 = p20Var.a;
                            c20Var.getClass();
                            f20Var4.getClass();
                            int ordinal = f20Var4.ordinal();
                            e20 e20Var = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : e20.ON_PAUSE : e20.ON_STOP : e20.ON_DESTROY;
                            if (e20Var == null) {
                                g8.l(p20Var.a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(e20Var.a());
                                p20Var.a(o20Var, e20Var);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                rm0 rm0Var4 = this.b.e;
                if (!this.g && rm0Var4 != null && this.c.compareTo(rm0Var4.e.a) > 0) {
                    zq zqVar3 = this.b;
                    zqVar3.getClass();
                    sm0 sm0Var = new sm0(zqVar3);
                    zqVar3.f.put(sm0Var, Boolean.FALSE);
                    while (sm0Var.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) sm0Var.next();
                        n20 n20Var2 = (n20) entry2.getKey();
                        p20 p20Var2 = (p20) entry2.getValue();
                        while (p20Var2.a.compareTo(this.c) < 0 && !this.g && this.b.h.containsKey(n20Var2)) {
                            arrayList.add(p20Var2.a);
                            c20 c20Var2 = e20.Companion;
                            f20 f20Var5 = p20Var2.a;
                            c20Var2.getClass();
                            f20Var5.getClass();
                            int ordinal2 = f20Var5.ordinal();
                            e20 e20Var2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : e20.ON_RESUME : e20.ON_START : e20.ON_CREATE;
                            if (e20Var2 == null) {
                                g8.l(p20Var2.a, "no event up from ");
                                return;
                            } else {
                                p20Var2.a(o20Var, e20Var2);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
