package androidx.lifecycle;

import android.os.Looper;
import h0.C0130a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.C0276a;
import n.C0278a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1368a;

    /* renamed from: b, reason: collision with root package name */
    public C0278a f1369b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0070m f1370c;
    public final WeakReference d;

    /* renamed from: e, reason: collision with root package name */
    public int f1371e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1372f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1373g;
    public final ArrayList h;
    public final f1.a i;

    public t(r rVar) {
        new AtomicReference(null);
        this.f1368a = true;
        this.f1369b = new C0278a();
        EnumC0070m enumC0070m = EnumC0070m.f1361b;
        this.f1370c = enumC0070m;
        this.h = new ArrayList();
        this.d = new WeakReference(rVar);
        this.i = new f1.a(enumC0070m);
    }

    public final void a(q qVar) {
        InterfaceC0073p c0062e;
        r rVar;
        ArrayList arrayList = this.h;
        Object obj = null;
        c("addObserver");
        EnumC0070m enumC0070m = this.f1370c;
        EnumC0070m enumC0070m2 = EnumC0070m.f1360a;
        if (enumC0070m != enumC0070m2) {
            enumC0070m2 = EnumC0070m.f1361b;
        }
        s sVar = new s();
        HashMap hashMap = u.f1374a;
        boolean z2 = qVar instanceof InterfaceC0073p;
        boolean z3 = qVar instanceof T.k;
        if (z2 && z3) {
            c0062e = new C0062e((T.k) qVar, r3, (InterfaceC0073p) qVar);
        } else if (z3) {
            c0062e = new C0062e((T.k) qVar, r3, obj);
        } else if (z2) {
            c0062e = (InterfaceC0073p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.b(cls) == 2) {
                Object obj2 = u.f1375b.get(cls);
                X0.e.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                int size = list.size();
                InterfaceC0064g[] interfaceC0064gArr = new InterfaceC0064g[size];
                if (size > 0) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                c0062e = new C0130a(3, interfaceC0064gArr);
            } else {
                c0062e = new C0062e(qVar);
            }
        }
        sVar.f1367b = c0062e;
        sVar.f1366a = enumC0070m2;
        C0278a c0278a = this.f1369b;
        n.c a2 = c0278a.a(qVar);
        if (a2 != null) {
            obj = a2.f3253b;
        } else {
            HashMap hashMap2 = c0278a.f3248e;
            n.c cVar = new n.c(qVar, sVar);
            c0278a.d++;
            n.c cVar2 = c0278a.f3259b;
            if (cVar2 == null) {
                c0278a.f3258a = cVar;
                c0278a.f3259b = cVar;
            } else {
                cVar2.f3254c = cVar;
                cVar.d = cVar2;
                c0278a.f3259b = cVar;
            }
            hashMap2.put(qVar, cVar);
        }
        if (((s) obj) == null && (rVar = (r) this.d.get()) != null) {
            r3 = (this.f1371e != 0 || this.f1372f) ? 1 : 0;
            EnumC0070m b2 = b(qVar);
            this.f1371e++;
            while (sVar.f1366a.compareTo(b2) < 0 && this.f1369b.f3248e.containsKey(qVar)) {
                arrayList.add(sVar.f1366a);
                C0067j c0067j = EnumC0069l.Companion;
                EnumC0070m enumC0070m3 = sVar.f1366a;
                c0067j.getClass();
                EnumC0069l a3 = C0067j.a(enumC0070m3);
                if (a3 == null) {
                    throw new IllegalStateException("no event up from " + sVar.f1366a);
                }
                sVar.a(rVar, a3);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(qVar);
            }
            if (r3 == 0) {
                h();
            }
            this.f1371e--;
        }
    }

    public final EnumC0070m b(q qVar) {
        s sVar;
        HashMap hashMap = this.f1369b.f3248e;
        n.c cVar = hashMap.containsKey(qVar) ? ((n.c) hashMap.get(qVar)).d : null;
        EnumC0070m enumC0070m = (cVar == null || (sVar = (s) cVar.f3253b) == null) ? null : sVar.f1366a;
        ArrayList arrayList = this.h;
        EnumC0070m enumC0070m2 = arrayList.isEmpty() ? null : (EnumC0070m) arrayList.get(arrayList.size() - 1);
        EnumC0070m enumC0070m3 = this.f1370c;
        X0.e.e(enumC0070m3, "state1");
        if (enumC0070m == null || enumC0070m.compareTo(enumC0070m3) >= 0) {
            enumC0070m = enumC0070m3;
        }
        return (enumC0070m2 == null || enumC0070m2.compareTo(enumC0070m) >= 0) ? enumC0070m : enumC0070m2;
    }

    public final void c(String str) {
        if (this.f1368a) {
            ((C0276a) C0276a.l().f3169b).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(EnumC0069l enumC0069l) {
        X0.e.e(enumC0069l, "event");
        c("handleLifecycleEvent");
        e(enumC0069l.a());
    }

    public final void e(EnumC0070m enumC0070m) {
        EnumC0070m enumC0070m2 = this.f1370c;
        if (enumC0070m2 == enumC0070m) {
            return;
        }
        EnumC0070m enumC0070m3 = EnumC0070m.f1361b;
        EnumC0070m enumC0070m4 = EnumC0070m.f1360a;
        if (enumC0070m2 == enumC0070m3 && enumC0070m == enumC0070m4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0070m + ", but was " + this.f1370c + " in component " + this.d.get()).toString());
        }
        this.f1370c = enumC0070m;
        if (this.f1372f || this.f1371e != 0) {
            this.f1373g = true;
            return;
        }
        this.f1372f = true;
        h();
        this.f1372f = false;
        if (this.f1370c == enumC0070m4) {
            this.f1369b = new C0278a();
        }
    }

    public final void f(q qVar) {
        c("removeObserver");
        this.f1369b.b(qVar);
    }

    public final void g() {
        EnumC0070m enumC0070m = EnumC0070m.f1362c;
        c("setCurrentState");
        e(enumC0070m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f1373g = false;
        r0 = r7.f1370c;
        r1 = r7.i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = g1.a.f2367a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2 = f1.a.f2187c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (X0.e.a(r2.get(r1), r0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r2.set(r1, r0);
        r0 = r1.f2188b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if ((r0 & 1) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r0 = r0 + 1;
        r1.f2188b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2 = r1.f2188b;
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
    
        r1.f2188b = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        r1.f2188b = r0 + 2;
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
        r rVar = (r) this.d.get();
        if (rVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0278a c0278a = this.f1369b;
            if (c0278a.d != 0) {
                n.c cVar = c0278a.f3258a;
                X0.e.b(cVar);
                EnumC0070m enumC0070m = ((s) cVar.f3253b).f1366a;
                n.c cVar2 = this.f1369b.f3259b;
                X0.e.b(cVar2);
                EnumC0070m enumC0070m2 = ((s) cVar2.f3253b).f1366a;
                if (enumC0070m == enumC0070m2 && this.f1370c == enumC0070m2) {
                    break;
                }
                this.f1373g = false;
                EnumC0070m enumC0070m3 = this.f1370c;
                n.c cVar3 = this.f1369b.f3258a;
                X0.e.b(cVar3);
                if (enumC0070m3.compareTo(((s) cVar3.f3253b).f1366a) < 0) {
                    C0278a c0278a2 = this.f1369b;
                    n.b bVar = new n.b(c0278a2.f3259b, c0278a2.f3258a, 1);
                    c0278a2.f3260c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f1373g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        X0.e.d(entry, "next()");
                        q qVar = (q) entry.getKey();
                        s sVar = (s) entry.getValue();
                        while (sVar.f1366a.compareTo(this.f1370c) > 0 && !this.f1373g && this.f1369b.f3248e.containsKey(qVar)) {
                            C0067j c0067j = EnumC0069l.Companion;
                            EnumC0070m enumC0070m4 = sVar.f1366a;
                            c0067j.getClass();
                            X0.e.e(enumC0070m4, "state");
                            int ordinal = enumC0070m4.ordinal();
                            EnumC0069l enumC0069l = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0069l.ON_PAUSE : EnumC0069l.ON_STOP : EnumC0069l.ON_DESTROY;
                            if (enumC0069l == null) {
                                throw new IllegalStateException("no event down from " + sVar.f1366a);
                            }
                            this.h.add(enumC0069l.a());
                            sVar.a(rVar, enumC0069l);
                            this.h.remove(r4.size() - 1);
                        }
                    }
                }
                n.c cVar4 = this.f1369b.f3259b;
                if (!this.f1373g && cVar4 != null && this.f1370c.compareTo(((s) cVar4.f3253b).f1366a) > 0) {
                    C0278a c0278a3 = this.f1369b;
                    c0278a3.getClass();
                    n.d dVar = new n.d(c0278a3);
                    c0278a3.f3260c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f1373g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        q qVar2 = (q) entry2.getKey();
                        s sVar2 = (s) entry2.getValue();
                        while (sVar2.f1366a.compareTo(this.f1370c) < 0 && !this.f1373g && this.f1369b.f3248e.containsKey(qVar2)) {
                            this.h.add(sVar2.f1366a);
                            C0067j c0067j2 = EnumC0069l.Companion;
                            EnumC0070m enumC0070m5 = sVar2.f1366a;
                            c0067j2.getClass();
                            EnumC0069l a2 = C0067j.a(enumC0070m5);
                            if (a2 == null) {
                                throw new IllegalStateException("no event up from " + sVar2.f1366a);
                            }
                            sVar2.a(rVar, a2);
                            this.h.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
