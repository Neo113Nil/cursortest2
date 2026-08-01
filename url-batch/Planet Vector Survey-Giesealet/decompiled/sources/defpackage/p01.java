package defpackage;

import android.content.Context;
import android.graphics.Region;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class p01 implements fp, yh0, kz0 {
    public static final pg0 f = new pg0(21);
    public final /* synthetic */ int d;
    public Object e;

    public p01(int i) {
        this.d = i;
        int i2 = 0;
        switch (i) {
            case 6:
                this.e = new ls0(px0.b);
                break;
            case 10:
                this.e = new LinkedHashMap(0, 0.75f, true);
                break;
            case 12:
                this.e = Build.VERSION.SDK_INT >= 28 ? new y7(29) : new pg0(i2);
                break;
            case 13:
                this.e = new b40(10);
                break;
            case 19:
                this.e = new Region();
                break;
            default:
                this.e = new l70(new bj[16]);
                break;
        }
    }

    @Override // defpackage.jz0
    public boolean a() {
        ((k2) this.e).getClass();
        return false;
    }

    @Override // defpackage.yh0
    public void b() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.fp
    public void c(final px0 px0Var) {
        li liVar = new li("EmojiCompatInitializer");
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), liVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: ip
            @Override // java.lang.Runnable
            public final void run() {
                p01 p01Var = p01.this;
                px0 px0Var2 = px0Var;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    ot j = nk.j((Context) p01Var.e);
                    if (j == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    nt ntVar = (nt) j.a;
                    synchronized (ntVar.g) {
                        ntVar.i = threadPoolExecutor2;
                    }
                    j.a.c(new jp(px0Var2, threadPoolExecutor2));
                } catch (Throwable th) {
                    px0Var2.M(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // defpackage.yh0
    public void d(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.e).setResultCode(i);
    }

    public void e(p10 p10Var) {
        if (!p10Var.B()) {
            cy.b("DepthSortedSet.add called on an unattached node");
        }
        ((ls0) this.e).add(p10Var);
    }

    public void f(CancellationException cancellationException) {
        l70 l70Var = (l70) this.e;
        int i = l70Var.f;
        fc[] fcVarArr = new fc[i];
        for (int i2 = 0; i2 < i; i2++) {
            fcVarArr[i2] = ((bj) l70Var.d[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            fcVarArr[i3].j(cancellationException);
        }
        if (l70Var.f == 0) {
            return;
        }
        g8.s("uncancelled requests present");
    }

    @Override // defpackage.jz0
    public i7 g(long j, i7 i7Var, i7 i7Var2, i7 i7Var3) {
        return ((k2) this.e).g(j, i7Var, i7Var2, i7Var3);
    }

    public lr h(int i) {
        switch (this.d) {
            case 23:
                return (mr) ((ArrayList) this.e).get(i);
            case 24:
                return (mr) this.e;
            default:
                return (lr) this.e;
        }
    }

    public k01 i(ld ldVar) {
        String str;
        String u;
        k2 k2Var = (k2) this.e;
        Map map = ld.b;
        Class cls = ldVar.a;
        cls.getClass();
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            str = null;
        } else if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            str = (!componentType.isPrimitive() || (u = mz.u(componentType.getName())) == null) ? null : u.concat("Array");
            if (str == null) {
                str = "kotlin.Array";
            }
        } else {
            String u2 = mz.u(cls.getName());
            str = u2 == null ? cls.getCanonicalName() : u2;
        }
        if (str != null) {
            return k2Var.h(ldVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str));
        }
        g8.r("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.jz0
    public i7 j(long j, i7 i7Var, i7 i7Var2, i7 i7Var3) {
        return ((k2) this.e).j(j, i7Var, i7Var2, i7Var3);
    }

    @Override // defpackage.jz0
    public i7 k(i7 i7Var, i7 i7Var2, i7 i7Var3) {
        return ((k2) this.e).k(i7Var, i7Var2, i7Var3);
    }

    public bt0 l() {
        gp a = gp.a();
        if (a.b() == 1) {
            return new kx(true);
        }
        ce0 o = ud0.o(Boolean.FALSE);
        bl blVar = new bl(o, this);
        a.a.writeLock().lock();
        try {
            if (a.c != 1 && a.c != 2) {
                a.b.add(blVar);
                a.a.writeLock().unlock();
                return o;
            }
            a.d.post(new ep(Arrays.asList(blVar), a.c, null));
            a.a.writeLock().unlock();
            return o;
        } catch (Throwable th) {
            a.a.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.jz0
    public long m(i7 i7Var, i7 i7Var2, i7 i7Var3) {
        return ((k2) this.e).m(i7Var, i7Var2, i7Var3);
    }

    public void n(float f2, float f3, float f4, float f5) {
        t7 t7Var = (t7) this.e;
        kc p = t7Var.p();
        float intBitsToFloat = Float.intBitsToFloat((int) (t7Var.r() >> 32)) - (f4 + f2);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (t7Var.r() & 4294967295L)) - (f5 + f3);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            fy.a("Width and height must be greater than or equal to zero");
        }
        t7Var.B(floatToRawIntBits);
        p.e(f2, f3);
    }

    public long o() {
        switch (this.d) {
            case 5:
                ql qlVar = (ql) this.e;
                long o = qlVar.w.o();
                if (o != 16) {
                    return o;
                }
                jl0 jl0Var = (jl0) mz.A(qlVar, nl0.b);
                if (jl0Var != null) {
                    long j = jl0Var.a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((ge) mz.A(qlVar, aj.a)).a;
            default:
                return ((ql0) this.e).c;
        }
    }

    public void p(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.e).notifyViewVisibilityChanged(view, i, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(long j, long j2, lj ljVar) {
        mo0 mo0Var;
        int i;
        if (ljVar instanceof mo0) {
            mo0Var = (mo0) ljVar;
            int i2 = mo0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mo0Var.g = i2 - Integer.MIN_VALUE;
                Object obj = mo0Var.e;
                i = mo0Var.g;
                if (i != 0) {
                    rg0.u(obj);
                    zo0 zo0Var = (zo0) this.e;
                    mo0Var.d = j2;
                    mo0Var.g = 1;
                    obj = zo0Var.b(j2, mo0Var);
                    ck ckVar = ck.d;
                    if (obj == ckVar) {
                        return ckVar;
                    }
                } else {
                    if (i != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = mo0Var.d;
                    rg0.u(obj);
                }
                return new mz0(mz0.d(j2, ((mz0) obj).a));
            }
        }
        mo0Var = new mo0(this, ljVar);
        Object obj2 = mo0Var.e;
        i = mo0Var.g;
        if (i != 0) {
        }
        return new mz0(mz0.d(j2, ((mz0) obj2).a));
    }

    public j3 r(j3 j3Var, f3 f3Var) {
        Object obj;
        int i;
        long F;
        long j;
        boolean z;
        Object obj2 = nz.i;
        b40 b40Var = (b40) this.e;
        List list = (List) j3Var.e;
        b40 b40Var2 = new b40(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            yg0 yg0Var = (yg0) list.get(i2);
            long j2 = yg0Var.a;
            int p = nz.p(b40Var.e, b40Var.g, j2);
            if (p < 0 || (obj = b40Var.f[p]) == obj2) {
                obj = null;
            }
            xg0 xg0Var = (xg0) obj;
            if (xg0Var == null) {
                i = i2;
                j = yg0Var.b;
                F = yg0Var.d;
                z = false;
            } else {
                long j3 = xg0Var.a;
                boolean z2 = xg0Var.c;
                i = i2;
                F = f3Var.F(xg0Var.b);
                j = j3;
                z = z2;
            }
            long j4 = yg0Var.a;
            List list2 = list;
            int i3 = size;
            b40Var2.b(j4, new wg0(j4, yg0Var.b, yg0Var.d, yg0Var.e, yg0Var.f, j, F, z, yg0Var.g, yg0Var.i, yg0Var.j, yg0Var.k));
            boolean z3 = yg0Var.e;
            if (z3) {
                b40Var.b(j2, new xg0(yg0Var.b, yg0Var.c, z3));
            } else {
                int p2 = nz.p(b40Var.e, b40Var.g, j2);
                if (p2 >= 0) {
                    Object[] objArr = b40Var.f;
                    if (objArr[p2] != obj2) {
                        objArr[p2] = obj2;
                        b40Var.d = true;
                    }
                }
            }
            i2 = i + 1;
            list = list2;
            size = i3;
        }
        return new j3(4, b40Var2, j3Var);
    }

    public boolean s(p10 p10Var) {
        if (!p10Var.B()) {
            cy.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((ls0) this.e).remove(p10Var);
    }

    public void t() {
        l70 l70Var = (l70) this.e;
        int i = 0;
        int i2 = new ez(0, l70Var.f - 1, 1).e;
        if (i2 >= 0) {
            while (true) {
                ((bj) l70Var.d[i]).b.resumeWith(ky0.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        l70Var.g();
    }

    public String toString() {
        switch (this.d) {
            case 6:
                return ((ls0) this.e).toString();
            default:
                return super.toString();
        }
    }

    public void u(float f2, float f3, long j) {
        kc p = ((t7) this.e).p();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        p.e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        p.a(f2, f3);
        p.e(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void v(float f2, float f3) {
        ((t7) this.e).p().e(f2, f3);
    }

    public /* synthetic */ p01(int i, boolean z) {
        this.d = i;
    }

    public p01(sl slVar) {
        this.d = 21;
        this.e = new ir(rs0.a, slVar);
    }

    public /* synthetic */ p01(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    public p01(q01 q01Var, n01 n01Var, hk hkVar) {
        this.d = 0;
        q01Var.getClass();
        hkVar.getClass();
        q01Var.getClass();
        hkVar.getClass();
        k2 k2Var = new k2();
        k2Var.d = q01Var;
        k2Var.e = n01Var;
        k2Var.f = hkVar;
        k2Var.g = new pg0(13);
        this.e = k2Var;
    }

    public p01(long[] jArr) {
        s60 s60Var;
        this.d = 20;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            s60Var = new s60(copyOf.length);
            int i = s60Var.b;
            if (i >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i;
                    long[] jArr2 = s60Var.a;
                    if (jArr2.length < length) {
                        s60Var.a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = s60Var.a;
                    int i2 = s60Var.b;
                    if (i != i2) {
                        p8.S(jArr3, jArr3, copyOf.length + i, i, i2);
                    }
                    p8.S(copyOf, jArr3, i, 0, copyOf.length);
                    s60Var.b += copyOf.length;
                }
            } else {
                g8.m("");
                throw null;
            }
        } else {
            s60Var = new s60(16);
        }
        this.e = s60Var;
    }

    public p01(Context context) {
        this.d = 9;
        this.e = context.getApplicationContext();
    }

    public p01(float f2, i7 i7Var) {
        p01 p01Var;
        this.d = 26;
        if (i7Var != null) {
            p01Var = new p01(i7Var, f2);
        } else {
            p01Var = new p01(f2);
        }
        this.e = new k2(p01Var);
    }

    public p01(i7 i7Var, float f2) {
        this.d = 23;
        ez v = rg0.v(0, i7Var.b());
        ArrayList arrayList = new ArrayList(ae.Y(v, 10));
        Iterator it = v.iterator();
        while (((dz) it).f) {
            arrayList.add(new mr(f2, i7Var.a(((xy) it).nextInt())));
        }
        this.e = arrayList;
    }

    public p01(float f2) {
        this.d = 24;
        this.e = new mr(f2, 0.01f);
    }
}
