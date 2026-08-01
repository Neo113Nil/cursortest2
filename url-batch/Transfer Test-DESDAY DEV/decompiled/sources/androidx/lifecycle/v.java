package androidx.lifecycle;

import android.os.Looper;
import i0.C0138a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.C0251a;
import n.C0253a;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public AtomicReference f1529a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1530b = true;

    /* renamed from: c, reason: collision with root package name */
    public C0253a f1531c = new C0253a();
    public EnumC0072m d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f1532e;

    /* renamed from: f, reason: collision with root package name */
    public int f1533f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1534g;
    public boolean h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final q1.a f1535j;

    public v(t tVar) {
        EnumC0072m enumC0072m = EnumC0072m.f1518b;
        this.d = enumC0072m;
        this.i = new ArrayList();
        this.f1532e = new WeakReference(tVar);
        this.f1535j = new q1.a(enumC0072m);
    }

    public final void a(InterfaceC0077s interfaceC0077s) {
        r c0064e;
        t tVar;
        ArrayList arrayList = this.i;
        Object obj = null;
        c("addObserver");
        EnumC0072m enumC0072m = this.d;
        EnumC0072m enumC0072m2 = EnumC0072m.f1517a;
        if (enumC0072m != enumC0072m2) {
            enumC0072m2 = EnumC0072m.f1518b;
        }
        u uVar = new u();
        HashMap hashMap = w.f1536a;
        boolean z2 = interfaceC0077s instanceof r;
        boolean z3 = interfaceC0077s instanceof U.k;
        if (z2 && z3) {
            c0064e = new C0064e((U.k) interfaceC0077s, r3, (r) interfaceC0077s);
        } else if (z3) {
            c0064e = new C0064e((U.k) interfaceC0077s, r3, obj);
        } else if (z2) {
            c0064e = (r) interfaceC0077s;
        } else {
            Class<?> cls = interfaceC0077s.getClass();
            if (w.c(cls) == 2) {
                Object obj2 = w.f1537b.get(cls);
                g1.f.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    w.a((Constructor) list.get(0), interfaceC0077s);
                    throw null;
                }
                int size = list.size();
                InterfaceC0066g[] interfaceC0066gArr = new InterfaceC0066g[size];
                if (size > 0) {
                    w.a((Constructor) list.get(0), interfaceC0077s);
                    throw null;
                }
                c0064e = new C0138a(3, interfaceC0066gArr);
            } else {
                c0064e = new C0064e(interfaceC0077s);
            }
        }
        uVar.f1528b = c0064e;
        uVar.f1527a = enumC0072m2;
        C0253a c0253a = this.f1531c;
        n.c a2 = c0253a.a(interfaceC0077s);
        if (a2 != null) {
            obj = a2.f3142b;
        } else {
            HashMap hashMap2 = c0253a.f3137e;
            n.c cVar = new n.c(interfaceC0077s, uVar);
            c0253a.d++;
            n.c cVar2 = c0253a.f3148b;
            if (cVar2 == null) {
                c0253a.f3147a = cVar;
                c0253a.f3148b = cVar;
            } else {
                cVar2.f3143c = cVar;
                cVar.d = cVar2;
                c0253a.f3148b = cVar;
            }
            hashMap2.put(interfaceC0077s, cVar);
        }
        if (((u) obj) == null && (tVar = (t) this.f1532e.get()) != null) {
            r3 = (this.f1533f != 0 || this.f1534g) ? 1 : 0;
            EnumC0072m b2 = b(interfaceC0077s);
            this.f1533f++;
            while (uVar.f1527a.compareTo(b2) < 0 && this.f1531c.f3137e.containsKey(interfaceC0077s)) {
                arrayList.add(uVar.f1527a);
                C0069j c0069j = EnumC0071l.Companion;
                EnumC0072m enumC0072m3 = uVar.f1527a;
                c0069j.getClass();
                EnumC0071l a3 = C0069j.a(enumC0072m3);
                if (a3 == null) {
                    throw new IllegalStateException("no event up from " + uVar.f1527a);
                }
                uVar.a(tVar, a3);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(interfaceC0077s);
            }
            if (r3 == 0) {
                h();
            }
            this.f1533f--;
        }
    }

    public final EnumC0072m b(InterfaceC0077s interfaceC0077s) {
        u uVar;
        HashMap hashMap = this.f1531c.f3137e;
        n.c cVar = hashMap.containsKey(interfaceC0077s) ? ((n.c) hashMap.get(interfaceC0077s)).d : null;
        EnumC0072m enumC0072m = (cVar == null || (uVar = (u) cVar.f3142b) == null) ? null : uVar.f1527a;
        ArrayList arrayList = this.i;
        EnumC0072m enumC0072m2 = arrayList.isEmpty() ? null : (EnumC0072m) arrayList.get(arrayList.size() - 1);
        EnumC0072m enumC0072m3 = this.d;
        g1.f.e(enumC0072m3, "state1");
        if (enumC0072m == null || enumC0072m.compareTo(enumC0072m3) >= 0) {
            enumC0072m = enumC0072m3;
        }
        return (enumC0072m2 == null || enumC0072m2.compareTo(enumC0072m) >= 0) ? enumC0072m : enumC0072m2;
    }

    public final void c(String str) {
        if (this.f1530b) {
            C0251a.s().f3121g.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(EnumC0071l enumC0071l) {
        g1.f.e(enumC0071l, "event");
        c("handleLifecycleEvent");
        e(enumC0071l.a());
    }

    public final void e(EnumC0072m enumC0072m) {
        EnumC0072m enumC0072m2 = this.d;
        if (enumC0072m2 == enumC0072m) {
            return;
        }
        EnumC0072m enumC0072m3 = EnumC0072m.f1518b;
        EnumC0072m enumC0072m4 = EnumC0072m.f1517a;
        if (enumC0072m2 == enumC0072m3 && enumC0072m == enumC0072m4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0072m + ", but was " + this.d + " in component " + this.f1532e.get()).toString());
        }
        this.d = enumC0072m;
        if (this.f1534g || this.f1533f != 0) {
            this.h = true;
            return;
        }
        this.f1534g = true;
        h();
        this.f1534g = false;
        if (this.d == enumC0072m4) {
            this.f1531c = new C0253a();
        }
    }

    public final void f(InterfaceC0077s interfaceC0077s) {
        c("removeObserver");
        this.f1531c.b(interfaceC0077s);
    }

    public final void g() {
        EnumC0072m enumC0072m = EnumC0072m.f1519c;
        c("setCurrentState");
        e(enumC0072m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.h = false;
        r0 = r7.d;
        r1 = r7.f1535j;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = r1.a.f3478a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2 = q1.a.f3475c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (g1.f.a(r2.get(r1), r0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r2.set(r1, r0);
        r0 = r1.f3476b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if ((r0 & 1) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r0 = r0 + 1;
        r1.f3476b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2 = r1.f3476b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r2 != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r1.f3476b = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        r1.f3476b = r0 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        t tVar = (t) this.f1532e.get();
        if (tVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0253a c0253a = this.f1531c;
            if (c0253a.d != 0) {
                n.c cVar = c0253a.f3147a;
                g1.f.b(cVar);
                EnumC0072m enumC0072m = ((u) cVar.f3142b).f1527a;
                n.c cVar2 = this.f1531c.f3148b;
                g1.f.b(cVar2);
                EnumC0072m enumC0072m2 = ((u) cVar2.f3142b).f1527a;
                if (enumC0072m == enumC0072m2 && this.d == enumC0072m2) {
                    break;
                }
                this.h = false;
                EnumC0072m enumC0072m3 = this.d;
                n.c cVar3 = this.f1531c.f3147a;
                g1.f.b(cVar3);
                if (enumC0072m3.compareTo(((u) cVar3.f3142b).f1527a) < 0) {
                    C0253a c0253a2 = this.f1531c;
                    n.b bVar = new n.b(c0253a2.f3148b, c0253a2.f3147a, 1);
                    c0253a2.f3149c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.h) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        g1.f.d(entry, "next()");
                        InterfaceC0077s interfaceC0077s = (InterfaceC0077s) entry.getKey();
                        u uVar = (u) entry.getValue();
                        while (uVar.f1527a.compareTo(this.d) > 0 && !this.h && this.f1531c.f3137e.containsKey(interfaceC0077s)) {
                            C0069j c0069j = EnumC0071l.Companion;
                            EnumC0072m enumC0072m4 = uVar.f1527a;
                            c0069j.getClass();
                            g1.f.e(enumC0072m4, "state");
                            int ordinal = enumC0072m4.ordinal();
                            EnumC0071l enumC0071l = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0071l.ON_PAUSE : EnumC0071l.ON_STOP : EnumC0071l.ON_DESTROY;
                            if (enumC0071l == null) {
                                throw new IllegalStateException("no event down from " + uVar.f1527a);
                            }
                            this.i.add(enumC0071l.a());
                            uVar.a(tVar, enumC0071l);
                            this.i.remove(r4.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f1531c.f3148b;
                if (!this.h && cVar4 != null && this.d.compareTo(((u) cVar4.f3142b).f1527a) > 0) {
                    C0253a c0253a3 = this.f1531c;
                    c0253a3.getClass();
                    n.d dVar = new n.d(c0253a3);
                    c0253a3.f3149c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        InterfaceC0077s interfaceC0077s2 = (InterfaceC0077s) entry2.getKey();
                        u uVar2 = (u) entry2.getValue();
                        while (uVar2.f1527a.compareTo(this.d) < 0 && !this.h && this.f1531c.f3137e.containsKey(interfaceC0077s2)) {
                            this.i.add(uVar2.f1527a);
                            C0069j c0069j2 = EnumC0071l.Companion;
                            EnumC0072m enumC0072m5 = uVar2.f1527a;
                            c0069j2.getClass();
                            EnumC0071l a2 = C0069j.a(enumC0072m5);
                            if (a2 == null) {
                                throw new IllegalStateException("no event up from " + uVar2.f1527a);
                            }
                            uVar2.a(tVar, a2);
                            this.i.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
