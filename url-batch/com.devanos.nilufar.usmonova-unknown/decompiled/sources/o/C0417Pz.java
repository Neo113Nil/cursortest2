package o;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.Pz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417Pz extends AbstractC0106Dz {
    public final boolean b;
    public C0118El c;
    public EnumC0080Cz d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final ET j;

    public C0417Pz(InterfaceC0365Nz interfaceC0365Nz) {
        this.a = new AtomicReference(null);
        this.b = true;
        this.c = new C0118El();
        EnumC0080Cz enumC0080Cz = EnumC0080Cz.i;
        this.d = enumC0080Cz;
        this.i = new ArrayList();
        this.e = new WeakReference(interfaceC0365Nz);
        this.j = AbstractC1305jX.d(enumC0080Cz);
    }

    @Override // o.AbstractC0106Dz
    public final void a(InterfaceC0339Mz interfaceC0339Mz) {
        InterfaceC0288Kz c0113Eg;
        Object obj;
        InterfaceC0365Nz interfaceC0365Nz;
        AbstractC0048Bt.n(interfaceC0339Mz, "observer");
        d("addObserver");
        EnumC0080Cz enumC0080Cz = this.d;
        EnumC0080Cz enumC0080Cz2 = EnumC0080Cz.h;
        if (enumC0080Cz != enumC0080Cz2) {
            enumC0080Cz2 = EnumC0080Cz.i;
        }
        C0391Oz c0391Oz = new C0391Oz();
        HashMap hashMap = AbstractC0443Qz.a;
        boolean z = interfaceC0339Mz instanceof InterfaceC0288Kz;
        boolean z2 = interfaceC0339Mz instanceof InterfaceC0061Cg;
        int i = 2;
        if (z && z2) {
            c0113Eg = new C0113Eg((InterfaceC0061Cg) interfaceC0339Mz, (InterfaceC0288Kz) interfaceC0339Mz);
        } else if (z2) {
            c0113Eg = new C0113Eg((InterfaceC0061Cg) interfaceC0339Mz, (InterfaceC0288Kz) null);
        } else if (z) {
            c0113Eg = (InterfaceC0288Kz) interfaceC0339Mz;
        } else {
            Class<?> cls = interfaceC0339Mz.getClass();
            if (AbstractC0443Qz.b(cls) == 2) {
                Object obj2 = AbstractC0443Qz.b.get(cls);
                AbstractC0048Bt.k(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0443Qz.a((Constructor) list.get(0), interfaceC0339Mz);
                    throw null;
                }
                int size = list.size();
                InterfaceC1522mq[] interfaceC1522mqArr = new InterfaceC1522mq[size];
                if (size > 0) {
                    AbstractC0443Qz.a((Constructor) list.get(0), interfaceC0339Mz);
                    throw null;
                }
                c0113Eg = new C0966eM(i, interfaceC1522mqArr);
            } else {
                c0113Eg = new C0113Eg(interfaceC0339Mz);
            }
        }
        c0391Oz.b = c0113Eg;
        c0391Oz.a = enumC0080Cz2;
        C0118El c0118El = this.c;
        C1890sP j = c0118El.j(interfaceC0339Mz);
        if (j != null) {
            obj = j.i;
        } else {
            HashMap hashMap2 = c0118El.l;
            C1890sP c1890sP = new C1890sP(interfaceC0339Mz, c0391Oz);
            c0118El.k++;
            C1890sP c1890sP2 = c0118El.i;
            if (c1890sP2 == null) {
                c0118El.h = c1890sP;
                c0118El.i = c1890sP;
            } else {
                c1890sP2.j = c1890sP;
                c1890sP.k = c1890sP2;
                c0118El.i = c1890sP;
            }
            hashMap2.put(interfaceC0339Mz, c1890sP);
            obj = null;
        }
        if (((C0391Oz) obj) == null && (interfaceC0365Nz = (InterfaceC0365Nz) this.e.get()) != null) {
            boolean z3 = this.f != 0 || this.g;
            EnumC0080Cz c = c(interfaceC0339Mz);
            this.f++;
            while (c0391Oz.a.compareTo(c) < 0 && this.c.l.containsKey(interfaceC0339Mz)) {
                EnumC0080Cz enumC0080Cz3 = c0391Oz.a;
                ArrayList arrayList = this.i;
                arrayList.add(enumC0080Cz3);
                C2388zz c2388zz = EnumC0054Bz.Companion;
                EnumC0080Cz enumC0080Cz4 = c0391Oz.a;
                c2388zz.getClass();
                AbstractC0048Bt.n(enumC0080Cz4, "state");
                int ordinal = enumC0080Cz4.ordinal();
                EnumC0054Bz enumC0054Bz = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : EnumC0054Bz.ON_RESUME : EnumC0054Bz.ON_START : EnumC0054Bz.ON_CREATE;
                if (enumC0054Bz == null) {
                    throw new IllegalStateException("no event up from " + c0391Oz.a);
                }
                c0391Oz.a(interfaceC0365Nz, enumC0054Bz);
                arrayList.remove(arrayList.size() - 1);
                c = c(interfaceC0339Mz);
            }
            if (!z3) {
                h();
            }
            this.f--;
        }
    }

    @Override // o.AbstractC0106Dz
    public final void b(InterfaceC0339Mz interfaceC0339Mz) {
        AbstractC0048Bt.n(interfaceC0339Mz, "observer");
        d("removeObserver");
        this.c.k(interfaceC0339Mz);
    }

    public final EnumC0080Cz c(InterfaceC0339Mz interfaceC0339Mz) {
        C0391Oz c0391Oz;
        HashMap hashMap = this.c.l;
        C1890sP c1890sP = hashMap.containsKey(interfaceC0339Mz) ? ((C1890sP) hashMap.get(interfaceC0339Mz)).k : null;
        EnumC0080Cz enumC0080Cz = (c1890sP == null || (c0391Oz = (C0391Oz) c1890sP.i) == null) ? null : c0391Oz.a;
        ArrayList arrayList = this.i;
        EnumC0080Cz enumC0080Cz2 = arrayList.isEmpty() ? null : (EnumC0080Cz) arrayList.get(arrayList.size() - 1);
        EnumC0080Cz enumC0080Cz3 = this.d;
        AbstractC0048Bt.n(enumC0080Cz3, "state1");
        if (enumC0080Cz == null || enumC0080Cz.compareTo(enumC0080Cz3) >= 0) {
            enumC0080Cz = enumC0080Cz3;
        }
        return (enumC0080Cz2 == null || enumC0080Cz2.compareTo(enumC0080Cz) >= 0) ? enumC0080Cz : enumC0080Cz2;
    }

    public final void d(String str) {
        if (this.b) {
            A6.H().a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC1888sN.k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0054Bz enumC0054Bz) {
        AbstractC0048Bt.n(enumC0054Bz, "event");
        d("handleLifecycleEvent");
        f(enumC0054Bz.a());
    }

    public final void f(EnumC0080Cz enumC0080Cz) {
        EnumC0080Cz enumC0080Cz2 = this.d;
        if (enumC0080Cz2 == enumC0080Cz) {
            return;
        }
        EnumC0080Cz enumC0080Cz3 = EnumC0080Cz.i;
        EnumC0080Cz enumC0080Cz4 = EnumC0080Cz.h;
        if (enumC0080Cz2 == enumC0080Cz3 && enumC0080Cz == enumC0080Cz4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0080Cz + ", but was " + this.d + " in component " + this.e.get()).toString());
        }
        this.d = enumC0080Cz;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        h();
        this.g = false;
        if (this.d == enumC0080Cz4) {
            this.c = new C0118El();
        }
    }

    public final void g() {
        d("setCurrentState");
        f(EnumC0080Cz.j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r9.h = false;
        r0 = r9.d;
        r1 = r9.j;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r0 = o.AbstractC1052fg.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r1.f(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        InterfaceC0365Nz interfaceC0365Nz = (InterfaceC0365Nz) this.e.get();
        if (interfaceC0365Nz == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0118El c0118El = this.c;
            if (c0118El.k != 0) {
                C1890sP c1890sP = c0118El.h;
                AbstractC0048Bt.k(c1890sP);
                EnumC0080Cz enumC0080Cz = ((C0391Oz) c1890sP.i).a;
                C1890sP c1890sP2 = this.c.i;
                AbstractC0048Bt.k(c1890sP2);
                EnumC0080Cz enumC0080Cz2 = ((C0391Oz) c1890sP2.i).a;
                if (enumC0080Cz == enumC0080Cz2 && this.d == enumC0080Cz2) {
                    break;
                }
                this.h = false;
                EnumC0080Cz enumC0080Cz3 = this.d;
                C1890sP c1890sP3 = this.c.h;
                AbstractC0048Bt.k(c1890sP3);
                if (enumC0080Cz3.compareTo(((C0391Oz) c1890sP3.i).a) < 0) {
                    C0118El c0118El2 = this.c;
                    C1824rP c1824rP = new C1824rP(c0118El2.i, c0118El2.h, 1);
                    c0118El2.j.put(c1824rP, Boolean.FALSE);
                    while (c1824rP.hasNext() && !this.h) {
                        Map.Entry entry = (Map.Entry) c1824rP.next();
                        AbstractC0048Bt.m(entry, "next()");
                        InterfaceC0339Mz interfaceC0339Mz = (InterfaceC0339Mz) entry.getKey();
                        C0391Oz c0391Oz = (C0391Oz) entry.getValue();
                        while (c0391Oz.a.compareTo(this.d) > 0 && !this.h && this.c.l.containsKey(interfaceC0339Mz)) {
                            C2388zz c2388zz = EnumC0054Bz.Companion;
                            EnumC0080Cz enumC0080Cz4 = c0391Oz.a;
                            c2388zz.getClass();
                            EnumC0054Bz a = C2388zz.a(enumC0080Cz4);
                            if (a == null) {
                                throw new IllegalStateException("no event down from " + c0391Oz.a);
                            }
                            this.i.add(a.a());
                            c0391Oz.a(interfaceC0365Nz, a);
                            ArrayList arrayList = this.i;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C1890sP c1890sP4 = this.c.i;
                if (!this.h && c1890sP4 != null && this.d.compareTo(((C0391Oz) c1890sP4.i).a) > 0) {
                    C0118El c0118El3 = this.c;
                    c0118El3.getClass();
                    C1956tP c1956tP = new C1956tP(c0118El3);
                    c0118El3.j.put(c1956tP, Boolean.FALSE);
                    while (c1956tP.hasNext() && !this.h) {
                        Map.Entry entry2 = (Map.Entry) c1956tP.next();
                        InterfaceC0339Mz interfaceC0339Mz2 = (InterfaceC0339Mz) entry2.getKey();
                        C0391Oz c0391Oz2 = (C0391Oz) entry2.getValue();
                        while (c0391Oz2.a.compareTo(this.d) < 0 && !this.h && this.c.l.containsKey(interfaceC0339Mz2)) {
                            this.i.add(c0391Oz2.a);
                            C2388zz c2388zz2 = EnumC0054Bz.Companion;
                            EnumC0080Cz enumC0080Cz5 = c0391Oz2.a;
                            c2388zz2.getClass();
                            AbstractC0048Bt.n(enumC0080Cz5, "state");
                            int ordinal = enumC0080Cz5.ordinal();
                            EnumC0054Bz enumC0054Bz = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : EnumC0054Bz.ON_RESUME : EnumC0054Bz.ON_START : EnumC0054Bz.ON_CREATE;
                            if (enumC0054Bz == null) {
                                throw new IllegalStateException("no event up from " + c0391Oz2.a);
                            }
                            c0391Oz2.a(interfaceC0365Nz, enumC0054Bz);
                            ArrayList arrayList2 = this.i;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
