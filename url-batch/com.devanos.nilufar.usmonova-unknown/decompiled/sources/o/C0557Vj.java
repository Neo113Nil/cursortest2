package o;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: o.Vj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557Vj {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public final Object e;
    public Object f;
    public Object g;

    public C0557Vj() {
        this.a = 1;
        this.e = new C0218Ih(29);
        this.f = new HashMap(0, 0.75f);
        this.g = new LinkedHashSet();
    }

    public Object a(Object obj) {
        synchronized (((C0218Ih) this.e)) {
            Object obj2 = ((HashMap) this.f).get(obj);
            if (obj2 == null) {
                this.d++;
                return null;
            }
            ((LinkedHashSet) this.g).remove(obj);
            ((LinkedHashSet) this.g).add(obj);
            this.c++;
            return obj2;
        }
    }

    public Object b(Object obj, Object obj2) {
        Object put;
        Object obj3;
        Object obj4;
        if (obj == null) {
            throw null;
        }
        synchronized (((C0218Ih) this.e)) {
            try {
                this.b = f() + 1;
                put = ((HashMap) this.f).put(obj, obj2);
                if (put != null) {
                    this.b = f() - 1;
                }
                if (((LinkedHashSet) this.g).contains(obj)) {
                    ((LinkedHashSet) this.g).remove(obj);
                }
                ((LinkedHashSet) this.g).add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        while (true) {
            synchronized (((C0218Ih) this.e)) {
                try {
                    if (f() >= 0) {
                        if (((HashMap) this.f).isEmpty() && f() != 0) {
                            break;
                        }
                        if (((HashMap) this.f).isEmpty() != ((LinkedHashSet) this.g).isEmpty()) {
                            break;
                        }
                        if (f() <= 16 || ((HashMap) this.f).isEmpty()) {
                            obj3 = null;
                            obj4 = null;
                        } else {
                            obj3 = AbstractC0720ac.m0((LinkedHashSet) this.g);
                            obj4 = ((HashMap) this.f).get(obj3);
                            if (obj4 == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            AbstractC1305jX.f((HashMap) this.f).remove(obj3);
                            LinkedHashSet linkedHashSet = (LinkedHashSet) this.g;
                            if ((linkedHashSet instanceof InterfaceC1594nw) && !(linkedHashSet instanceof InterfaceC1660ow)) {
                                AbstractC1305jX.I(linkedHashSet, "kotlin.collections.MutableCollection");
                                throw null;
                            }
                            linkedHashSet.remove(obj3);
                            int f = f();
                            AbstractC0048Bt.k(obj3);
                            this.b = f - 1;
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (obj3 == null && obj4 == null) {
                return put;
            }
            AbstractC0048Bt.k(obj3);
            AbstractC0048Bt.k(obj4);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public Object c(Object obj) {
        Object remove;
        synchronized (((C0218Ih) this.e)) {
            remove = ((HashMap) this.f).remove(obj);
            ((LinkedHashSet) this.g).remove(obj);
            if (remove != null) {
                this.b = f() - 1;
            }
        }
        return remove;
    }

    public void d() {
        this.b = 1;
        this.f = (MC) this.e;
        this.d = 0;
    }

    public boolean e() {
        KC b = ((MC) this.f).b.b();
        int a = b.a(6);
        return !(a == 0 || ((ByteBuffer) b.k).get(a + b.h) == 0) || this.c == 65039;
    }

    public int f() {
        int i;
        synchronized (((C0218Ih) this.e)) {
            i = this.b;
        }
        return i;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                synchronized (((C0218Ih) this.e)) {
                    try {
                        int i = this.c;
                        int i2 = this.d + i;
                        str = "LruCache[maxSize=16,hits=" + this.c + ",misses=" + this.d + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public C0557Vj(MC mc) {
        this.a = 0;
        this.b = 1;
        this.e = mc;
        this.f = mc;
    }
}
