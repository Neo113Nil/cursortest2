package defpackage;

import android.graphics.Typeface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class k2 implements r8, td0, kz0 {
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public k2(Typeface typeface, m50 m50Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.g = typeface;
        this.d = m50Var;
        this.f = new n50(1024);
        int a = m50Var.a(6);
        if (a != 0) {
            int i5 = a + m50Var.d;
            i = ((ByteBuffer) m50Var.g).getInt(((ByteBuffer) m50Var.g).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.e = new char[i * 2];
        int a2 = m50Var.a(6);
        if (a2 != 0) {
            int i6 = a2 + m50Var.d;
            i2 = ((ByteBuffer) m50Var.g).getInt(((ByteBuffer) m50Var.g).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            yx0 yx0Var = new yx0(this, i7);
            l50 b = yx0Var.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.g).getInt(a3 + b.d) : 0, (char[]) this.e, i7 * 2);
            l50 b2 = yx0Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.d;
                i3 = ((ByteBuffer) b2.g).getInt(((ByteBuffer) b2.g).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                g8.r("invalid metadata codepoint length");
                throw null;
            }
            n50 n50Var = (n50) this.f;
            l50 b3 = yx0Var.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.d;
                i4 = ((ByteBuffer) b3.g).getInt(((ByteBuffer) b3.g).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            n50Var.a(yx0Var, 0, i4 - 1);
        }
    }

    @Override // defpackage.jz0
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.td0
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((sd0) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.td0
    public float c() {
        return ((Number) ((u10) this.f).getValue()).floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r0 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        if (r0 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(long j, long j2, lj ljVar) {
        u90 u90Var;
        int i;
        long j3;
        if (ljVar instanceof u90) {
            u90Var = (u90) ljVar;
            int i2 = u90Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u90Var.f = i2 - Integer.MIN_VALUE;
                u90 u90Var2 = u90Var;
                Object obj = u90Var2.d;
                i = u90Var2.f;
                y90 y90Var = null;
                if (i != 0) {
                    rg0.u(obj);
                    y90 y90Var2 = (y90) this.d;
                    y90 y90Var3 = (y90Var2 == null || !y90Var2.q) ? null : (y90) yc0.d(y90Var2);
                    j3 = 0;
                    ck ckVar = ck.d;
                    if (y90Var3 == null) {
                        y90 y90Var4 = (y90) this.e;
                        if (y90Var4 != null) {
                            u90Var2.f = 1;
                            obj = y90Var4.k0(j, j2, u90Var2);
                        }
                    } else {
                        y90 y90Var5 = (y90) this.d;
                        if (y90Var5 != null && y90Var5.q) {
                            y90Var = (y90) yc0.d(y90Var5);
                        }
                        y90 y90Var6 = y90Var;
                        if (y90Var6 != null) {
                            u90Var2.f = 2;
                            obj = y90Var6.k0(j, j2, u90Var2);
                        }
                    }
                } else if (i == 1) {
                    rg0.u(obj);
                    j3 = ((mz0) obj).a;
                } else {
                    if (i != 2) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                    j3 = ((mz0) obj).a;
                }
                return new mz0(j3);
            }
        }
        u90Var = new u90(this, ljVar);
        u90 u90Var22 = u90Var;
        Object obj2 = u90Var22.d;
        i = u90Var22.f;
        y90 y90Var7 = null;
        if (i != 0) {
        }
        return new mz0(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(long j, lj ljVar) {
        v90 v90Var;
        int i;
        long j2;
        if (ljVar instanceof v90) {
            v90Var = (v90) ljVar;
            int i2 = v90Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v90Var.f = i2 - Integer.MIN_VALUE;
                Object obj = v90Var.d;
                i = v90Var.f;
                y90 y90Var = null;
                if (i != 0) {
                    rg0.u(obj);
                    y90 y90Var2 = (y90) this.d;
                    if (y90Var2 != null && y90Var2.q) {
                        y90Var = (y90) yc0.d(y90Var2);
                    }
                    if (y90Var == null) {
                        j2 = 0;
                        return new mz0(j2);
                    }
                    v90Var.f = 1;
                    obj = y90Var.m0(j, v90Var);
                    ck ckVar = ck.d;
                    if (obj == ckVar) {
                        return ckVar;
                    }
                } else {
                    if (i != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                }
                j2 = ((mz0) obj).a;
                return new mz0(j2);
            }
        }
        v90Var = new v90(this, ljVar);
        Object obj2 = v90Var.d;
        i = v90Var.f;
        y90 y90Var3 = null;
        if (i != 0) {
        }
        j2 = ((mz0) obj2).a;
        return new mz0(j2);
    }

    public i7 f(long j, i7 i7Var, i7 i7Var2) {
        if (((i7) this.f) == null) {
            this.f = i7Var.c();
        }
        i7 i7Var3 = (i7) this.f;
        if (i7Var3 == null) {
            nz.f0("velocityVector");
            throw null;
        }
        int b = i7Var3.b();
        int i = 0;
        while (true) {
            i7 i7Var4 = (i7) this.f;
            if (i >= b) {
                if (i7Var4 != null) {
                    return i7Var4;
                }
                nz.f0("velocityVector");
                throw null;
            }
            if (i7Var4 == null) {
                nz.f0("velocityVector");
                throw null;
            }
            p01 p01Var = (p01) this.d;
            i7Var.getClass();
            long j2 = j / 1000000;
            hr a = ((ir) p01Var.e).a(i7Var2.a(i));
            long j3 = a.c;
            i7Var4.e((((Math.signum(a.a) * t4.a(j3 > 0 ? j2 / j3 : 1.0f).b) * a.b) / j3) * 1000.0f, i);
            i++;
        }
    }

    @Override // defpackage.jz0
    public i7 g(long j, i7 i7Var, i7 i7Var2, i7 i7Var3) {
        if (((i7) this.f) == null) {
            this.f = i7Var3.c();
        }
        i7 i7Var4 = (i7) this.f;
        if (i7Var4 == null) {
            nz.f0("velocityVector");
            throw null;
        }
        int b = i7Var4.b();
        int i = 0;
        while (true) {
            i7 i7Var5 = (i7) this.f;
            if (i >= b) {
                if (i7Var5 != null) {
                    return i7Var5;
                }
                nz.f0("velocityVector");
                throw null;
            }
            if (i7Var5 == null) {
                nz.f0("velocityVector");
                throw null;
            }
            i7Var5.e(((p01) this.d).h(i).d(i7Var.a(i), i7Var2.a(i), i7Var3.a(i), j), i);
            i++;
        }
    }

    public k01 h(ld ldVar, String str) {
        k01 k01Var;
        boolean isInstance;
        k01 a;
        synchronized (((pg0) this.g)) {
            try {
                q01 q01Var = (q01) this.d;
                q01Var.getClass();
                k01Var = (k01) q01Var.a.get(str);
                Class cls = ldVar.a;
                cls.getClass();
                Map map = ld.b;
                map.getClass();
                Integer num = (Integer) map.get(cls);
                if (num != null) {
                    isInstance = px0.F(num.intValue(), k01Var);
                } else {
                    if (cls.isPrimitive()) {
                        cls = nz.E(hj0.a(cls));
                    }
                    isInstance = cls.isInstance(k01Var);
                }
                if (isInstance) {
                    Object obj = (n01) this.e;
                    if (obj instanceof o01) {
                        k01Var.getClass();
                        ((o01) obj).d(k01Var);
                    }
                    k01Var.getClass();
                } else {
                    m60 m60Var = new m60((hk) this.f);
                    m60Var.a.put(p01.f, str);
                    n01 n01Var = (n01) this.e;
                    try {
                        try {
                            a = n01Var.c(ldVar, m60Var);
                        } catch (AbstractMethodError unused) {
                            Class cls2 = ldVar.a;
                            cls2.getClass();
                            a = n01Var.a(cls2);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls3 = ldVar.a;
                        cls3.getClass();
                        a = n01Var.b(cls3, m60Var);
                    }
                    k01Var = a;
                    q01 q01Var2 = (q01) this.d;
                    q01Var2.getClass();
                    k01Var.getClass();
                    k01 k01Var2 = (k01) q01Var2.a.put(str, k01Var);
                    if (k01Var2 != null) {
                        k01Var2.clear$lifecycle_viewmodel();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k01Var;
    }

    @Override // defpackage.jz0
    public i7 j(long j, i7 i7Var, i7 i7Var2, i7 i7Var3) {
        if (((i7) this.e) == null) {
            this.e = i7Var.c();
        }
        i7 i7Var4 = (i7) this.e;
        if (i7Var4 == null) {
            nz.f0("valueVector");
            throw null;
        }
        int b = i7Var4.b();
        int i = 0;
        while (true) {
            i7 i7Var5 = (i7) this.e;
            if (i >= b) {
                if (i7Var5 != null) {
                    return i7Var5;
                }
                nz.f0("valueVector");
                throw null;
            }
            if (i7Var5 == null) {
                nz.f0("valueVector");
                throw null;
            }
            i7Var5.e(((p01) this.d).h(i).c(i7Var.a(i), i7Var2.a(i), i7Var3.a(i), j), i);
            i++;
        }
    }

    @Override // defpackage.jz0
    public i7 k(i7 i7Var, i7 i7Var2, i7 i7Var3) {
        if (((i7) this.g) == null) {
            this.g = i7Var3.c();
        }
        i7 i7Var4 = (i7) this.g;
        if (i7Var4 == null) {
            nz.f0("endVelocityVector");
            throw null;
        }
        int b = i7Var4.b();
        int i = 0;
        while (true) {
            i7 i7Var5 = (i7) this.g;
            if (i >= b) {
                if (i7Var5 != null) {
                    return i7Var5;
                }
                nz.f0("endVelocityVector");
                throw null;
            }
            if (i7Var5 == null) {
                nz.f0("endVelocityVector");
                throw null;
            }
            i7Var5.e(((p01) this.d).h(i).e(i7Var.a(i), i7Var2.a(i), i7Var3.a(i)), i);
            i++;
        }
    }

    @Override // defpackage.jz0
    public long m(i7 i7Var, i7 i7Var2, i7 i7Var3) {
        Iterator it = rg0.v(0, i7Var.b()).iterator();
        long j = 0;
        while (((dz) it).f) {
            int nextInt = ((xy) it).nextInt();
            j = Math.max(j, ((p01) this.d).h(nextInt).b(i7Var.a(nextInt), i7Var2.a(nextInt), i7Var3.a(nextInt)));
        }
        return j;
    }

    public /* synthetic */ k2(Object obj) {
        this.d = obj;
    }

    public k2(lr lrVar) {
        this(new p01(25, lrVar));
    }
}
