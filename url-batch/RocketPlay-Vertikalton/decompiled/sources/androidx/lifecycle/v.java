package androidx.lifecycle;

import android.os.Looper;
import i0.C0174a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.C0293a;
import n.C0296a;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public AtomicReference f1908a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1909b = true;

    /* renamed from: c, reason: collision with root package name */
    public C0296a f1910c = new C0296a();
    public EnumC0080m d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f1911e;

    /* renamed from: f, reason: collision with root package name */
    public int f1912f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1913g;
    public boolean h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final s1.a f1914j;

    public v(t tVar) {
        EnumC0080m enumC0080m = EnumC0080m.f1897b;
        this.d = enumC0080m;
        this.i = new ArrayList();
        this.f1911e = new WeakReference(tVar);
        this.f1914j = new s1.a(enumC0080m);
    }

    public final void a(InterfaceC0085s interfaceC0085s) {
        r c0072e;
        t tVar;
        ArrayList arrayList = this.i;
        Object obj = null;
        c("addObserver");
        EnumC0080m enumC0080m = this.d;
        EnumC0080m enumC0080m2 = EnumC0080m.f1896a;
        if (enumC0080m != enumC0080m2) {
            enumC0080m2 = EnumC0080m.f1897b;
        }
        u uVar = new u();
        HashMap hashMap = w.f1915a;
        boolean z2 = interfaceC0085s instanceof r;
        boolean z3 = interfaceC0085s instanceof U.k;
        if (z2 && z3) {
            c0072e = new C0072e((U.k) interfaceC0085s, r3, (r) interfaceC0085s);
        } else if (z3) {
            c0072e = new C0072e((U.k) interfaceC0085s, r3, obj);
        } else if (z2) {
            c0072e = (r) interfaceC0085s;
        } else {
            Class<?> cls = interfaceC0085s.getClass();
            if (w.b(cls) == 2) {
                Object obj2 = w.f1916b.get(cls);
                i1.f.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    w.a((Constructor) list.get(0), interfaceC0085s);
                    throw null;
                }
                int size = list.size();
                InterfaceC0074g[] interfaceC0074gArr = new InterfaceC0074g[size];
                if (size > 0) {
                    w.a((Constructor) list.get(0), interfaceC0085s);
                    throw null;
                }
                c0072e = new C0174a(3, interfaceC0074gArr);
            } else {
                c0072e = new C0072e(interfaceC0085s);
            }
        }
        uVar.f1907b = c0072e;
        uVar.f1906a = enumC0080m2;
        C0296a c0296a = this.f1910c;
        n.c a2 = c0296a.a(interfaceC0085s);
        if (a2 != null) {
            obj = a2.f3568b;
        } else {
            HashMap hashMap2 = c0296a.f3563e;
            n.c cVar = new n.c(interfaceC0085s, uVar);
            c0296a.d++;
            n.c cVar2 = c0296a.f3574b;
            if (cVar2 == null) {
                c0296a.f3573a = cVar;
                c0296a.f3574b = cVar;
            } else {
                cVar2.f3569c = cVar;
                cVar.d = cVar2;
                c0296a.f3574b = cVar;
            }
            hashMap2.put(interfaceC0085s, cVar);
        }
        if (((u) obj) == null && (tVar = (t) this.f1911e.get()) != null) {
            r3 = (this.f1912f != 0 || this.f1913g) ? 1 : 0;
            EnumC0080m b2 = b(interfaceC0085s);
            this.f1912f++;
            while (uVar.f1906a.compareTo(b2) < 0 && this.f1910c.f3563e.containsKey(interfaceC0085s)) {
                arrayList.add(uVar.f1906a);
                C0077j c0077j = EnumC0079l.Companion;
                EnumC0080m enumC0080m3 = uVar.f1906a;
                c0077j.getClass();
                EnumC0079l a3 = C0077j.a(enumC0080m3);
                if (a3 == null) {
                    throw new IllegalStateException("no event up from " + uVar.f1906a);
                }
                uVar.a(tVar, a3);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(interfaceC0085s);
            }
            if (r3 == 0) {
                h();
            }
            this.f1912f--;
        }
    }

    public final EnumC0080m b(InterfaceC0085s interfaceC0085s) {
        u uVar;
        HashMap hashMap = this.f1910c.f3563e;
        n.c cVar = hashMap.containsKey(interfaceC0085s) ? ((n.c) hashMap.get(interfaceC0085s)).d : null;
        EnumC0080m enumC0080m = (cVar == null || (uVar = (u) cVar.f3568b) == null) ? null : uVar.f1906a;
        ArrayList arrayList = this.i;
        EnumC0080m enumC0080m2 = arrayList.isEmpty() ? null : (EnumC0080m) arrayList.get(arrayList.size() - 1);
        EnumC0080m enumC0080m3 = this.d;
        i1.f.e(enumC0080m3, "state1");
        if (enumC0080m == null || enumC0080m.compareTo(enumC0080m3) >= 0) {
            enumC0080m = enumC0080m3;
        }
        return (enumC0080m2 == null || enumC0080m2.compareTo(enumC0080m) >= 0) ? enumC0080m : enumC0080m2;
    }

    public final void c(String str) {
        if (this.f1909b) {
            C0293a.w().d.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(EnumC0079l enumC0079l) {
        i1.f.e(enumC0079l, "event");
        c("handleLifecycleEvent");
        e(enumC0079l.a());
    }

    public final void e(EnumC0080m enumC0080m) {
        EnumC0080m enumC0080m2 = this.d;
        if (enumC0080m2 == enumC0080m) {
            return;
        }
        EnumC0080m enumC0080m3 = EnumC0080m.f1897b;
        EnumC0080m enumC0080m4 = EnumC0080m.f1896a;
        if (enumC0080m2 == enumC0080m3 && enumC0080m == enumC0080m4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0080m + ", but was " + this.d + " in component " + this.f1911e.get()).toString());
        }
        this.d = enumC0080m;
        if (this.f1913g || this.f1912f != 0) {
            this.h = true;
            return;
        }
        this.f1913g = true;
        h();
        this.f1913g = false;
        if (this.d == enumC0080m4) {
            this.f1910c = new C0296a();
        }
    }

    public final void f(InterfaceC0085s interfaceC0085s) {
        c("removeObserver");
        this.f1910c.b(interfaceC0085s);
    }

    public final void g() {
        EnumC0080m enumC0080m = EnumC0080m.f1898c;
        c("setCurrentState");
        e(enumC0080m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.h = false;
        r0 = r7.d;
        r1 = r7.f1914j;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = t1.a.f4171a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2 = s1.a.f4117c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (i1.f.a(r2.get(r1), r0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r2.set(r1, r0);
        r0 = r1.f4118b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if ((r0 & 1) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r0 = r0 + 1;
        r1.f4118b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2 = r1.f4118b;
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
    
        r1.f4118b = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        r1.f4118b = r0 + 2;
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
        t tVar = (t) this.f1911e.get();
        if (tVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0296a c0296a = this.f1910c;
            if (c0296a.d != 0) {
                n.c cVar = c0296a.f3573a;
                i1.f.b(cVar);
                EnumC0080m enumC0080m = ((u) cVar.f3568b).f1906a;
                n.c cVar2 = this.f1910c.f3574b;
                i1.f.b(cVar2);
                EnumC0080m enumC0080m2 = ((u) cVar2.f3568b).f1906a;
                if (enumC0080m == enumC0080m2 && this.d == enumC0080m2) {
                    break;
                }
                this.h = false;
                EnumC0080m enumC0080m3 = this.d;
                n.c cVar3 = this.f1910c.f3573a;
                i1.f.b(cVar3);
                if (enumC0080m3.compareTo(((u) cVar3.f3568b).f1906a) < 0) {
                    C0296a c0296a2 = this.f1910c;
                    n.b bVar = new n.b(c0296a2.f3574b, c0296a2.f3573a, 1);
                    c0296a2.f3575c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.h) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        i1.f.d(entry, "next()");
                        InterfaceC0085s interfaceC0085s = (InterfaceC0085s) entry.getKey();
                        u uVar = (u) entry.getValue();
                        while (uVar.f1906a.compareTo(this.d) > 0 && !this.h && this.f1910c.f3563e.containsKey(interfaceC0085s)) {
                            C0077j c0077j = EnumC0079l.Companion;
                            EnumC0080m enumC0080m4 = uVar.f1906a;
                            c0077j.getClass();
                            i1.f.e(enumC0080m4, "state");
                            int ordinal = enumC0080m4.ordinal();
                            EnumC0079l enumC0079l = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0079l.ON_PAUSE : EnumC0079l.ON_STOP : EnumC0079l.ON_DESTROY;
                            if (enumC0079l == null) {
                                throw new IllegalStateException("no event down from " + uVar.f1906a);
                            }
                            this.i.add(enumC0079l.a());
                            uVar.a(tVar, enumC0079l);
                            this.i.remove(r4.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f1910c.f3574b;
                if (!this.h && cVar4 != null && this.d.compareTo(((u) cVar4.f3568b).f1906a) > 0) {
                    C0296a c0296a3 = this.f1910c;
                    c0296a3.getClass();
                    n.d dVar = new n.d(c0296a3);
                    c0296a3.f3575c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        InterfaceC0085s interfaceC0085s2 = (InterfaceC0085s) entry2.getKey();
                        u uVar2 = (u) entry2.getValue();
                        while (uVar2.f1906a.compareTo(this.d) < 0 && !this.h && this.f1910c.f3563e.containsKey(interfaceC0085s2)) {
                            this.i.add(uVar2.f1906a);
                            C0077j c0077j2 = EnumC0079l.Companion;
                            EnumC0080m enumC0080m5 = uVar2.f1906a;
                            c0077j2.getClass();
                            EnumC0079l a2 = C0077j.a(enumC0080m5);
                            if (a2 == null) {
                                throw new IllegalStateException("no event up from " + uVar2.f1906a);
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
