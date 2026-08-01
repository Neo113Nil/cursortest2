package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class vi0 extends fu0 implements ru {
    public List d;
    public List e;
    public List f;
    public b70 g;
    public b70 h;
    public b70 i;
    public Set j;
    public b70 k;
    public int l;
    public /* synthetic */ a60 m;
    public final /* synthetic */ wi0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi0(wi0 wi0Var, kj kjVar) {
        super(3, kjVar);
        this.n = wi0Var;
    }

    public static final void g(wi0 wi0Var, List list, List list2, List list3, b70 b70Var, b70 b70Var2, b70 b70Var3, b70 b70Var4) {
        char c;
        long j;
        long j2;
        synchronized (wi0Var.b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    bi biVar = (bi) list3.get(i);
                    biVar.a();
                    wi0Var.J(biVar);
                }
                list3.clear();
                Object[] objArr = b70Var.b;
                long[] jArr = b70Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    bi biVar2 = (bi) objArr[(i2 << 3) + i4];
                                    biVar2.a();
                                    wi0Var.J(biVar2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                b70Var.b();
                Object[] objArr2 = b70Var2.b;
                long[] jArr2 = b70Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((bi) objArr2[(i5 << 3) + i7]).g();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                b70Var2.b();
                b70Var3.b();
                Object[] objArr3 = b70Var4.b;
                long[] jArr3 = b70Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    bi biVar3 = (bi) objArr3[(i8 << 3) + i10];
                                    biVar3.a();
                                    wi0Var.J(biVar3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                b70Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void h(List list, wi0 wi0Var) {
        list.clear();
        synchronized (wi0Var.b) {
            try {
                ArrayList arrayList = wi0Var.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((i60) arrayList.get(i));
                }
                wi0Var.j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        vi0 vi0Var = new vi0(this.n, (kj) obj3);
        vi0Var.m = (a60) obj2;
        vi0Var.invokeSuspend(ky0.a);
        return ck.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0090 A[DONT_GENERATE] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00e4 -> B:6:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00f2 -> B:7:0x008b). Please report as a decompilation issue!!! */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a60 a60Var;
        b70 b70Var;
        b70 b70Var2;
        List list;
        Set set;
        final List list2;
        b70 b70Var3;
        List list3;
        b70 b70Var4;
        final List list4;
        final b70 b70Var5;
        final List list5;
        final b70 b70Var6;
        ck ckVar = ck.d;
        int i = this.l;
        if (i == 0) {
            rg0.u(obj);
            a60Var = this.m;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i2 = wn0.a;
            b70Var = new b70();
            b70 b70Var7 = new b70();
            b70 b70Var8 = new b70();
            xn0 xn0Var = new xn0(b70Var8);
            b70Var2 = new b70();
            list = arrayList;
            set = xn0Var;
            list2 = arrayList2;
            b70Var3 = b70Var8;
            list3 = arrayList3;
            b70Var4 = b70Var7;
            synchronized (this.n.b) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b70 b70Var9 = this.k;
                set = this.j;
                b70Var3 = this.i;
                b70Var4 = this.h;
                b70Var = this.g;
                list3 = this.f;
                list2 = this.e;
                list = this.d;
                a60 a60Var2 = this.m;
                rg0.u(obj);
                b70Var2 = b70Var9;
                a60Var = a60Var2;
                wi0.s(this.n);
                synchronized (this.n.b) {
                }
                wi0 wi0Var = this.n;
                this.m = a60Var;
                this.d = list;
                this.e = list2;
                this.f = list3;
                this.g = b70Var;
                this.h = b70Var4;
                this.i = b70Var3;
                this.j = set;
                this.k = b70Var2;
                this.l = 1;
                if (wi0.r(wi0Var, this) != ckVar) {
                    List list6 = list;
                    b70Var5 = b70Var;
                    b70Var6 = b70Var2;
                    list4 = list3;
                    list5 = list6;
                    final Set set2 = set;
                    final b70 b70Var10 = b70Var4;
                    final b70 b70Var11 = b70Var3;
                    if (wi0.w(this.n)) {
                        List list7 = list4;
                        b70Var2 = b70Var6;
                        b70Var = b70Var5;
                        list = list5;
                        list3 = list7;
                        b70Var3 = b70Var11;
                        b70Var4 = b70Var10;
                        set = set2;
                        synchronized (this.n.b) {
                        }
                    } else {
                        final wi0 wi0Var2 = this.n;
                        mu muVar = new mu() { // from class: ui0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.mu
                            public final Object c(Object obj2) {
                                boolean z;
                                Object[] objArr;
                                List list8;
                                List list9;
                                long j;
                                List list10;
                                List list11;
                                Object[] objArr2;
                                wi0 wi0Var3 = wi0.this;
                                b70 b70Var12 = b70Var11;
                                b70 b70Var13 = b70Var6;
                                List list12 = list5;
                                List list13 = list2;
                                b70 b70Var14 = b70Var5;
                                List list14 = list4;
                                b70 b70Var15 = b70Var10;
                                Set set3 = set2;
                                long longValue = ((Long) obj2).longValue();
                                if (wi0.t(wi0Var3)) {
                                    Trace.beginSection("Recomposer:animation");
                                    try {
                                        wi0Var3.a.d(longValue);
                                        yc0.m();
                                    } finally {
                                    }
                                }
                                Trace.beginSection("Recomposer:recompose");
                                try {
                                    wi0.w(wi0Var3);
                                    synchronized (wi0Var3.b) {
                                        try {
                                            l70 l70Var = wi0Var3.h;
                                            Object[] objArr3 = l70Var.d;
                                            int i3 = l70Var.f;
                                            z = 0;
                                            for (int i4 = 0; i4 < i3; i4++) {
                                                list12.add((bi) objArr3[i4]);
                                            }
                                            wi0Var3.h.g();
                                        } finally {
                                        }
                                    }
                                    b70Var12.b();
                                    b70Var13.b();
                                    while (true) {
                                        if (list12.isEmpty() && list13.isEmpty()) {
                                            break;
                                        }
                                        try {
                                            int size = list12.size();
                                            for (int i5 = 0; i5 < size; i5++) {
                                                bi biVar = (bi) list12.get(i5);
                                                bi v = wi0.v(wi0Var3, biVar, b70Var12);
                                                if (v != null) {
                                                    list14.add(v);
                                                }
                                                b70Var13.a(biVar);
                                            }
                                            list12.clear();
                                            if (b70Var12.h() || wi0Var3.h.f != 0) {
                                                synchronized (wi0Var3.b) {
                                                    try {
                                                        List D = wi0Var3.D();
                                                        int size2 = D.size();
                                                        for (int i6 = 0; i6 < size2; i6++) {
                                                            bi biVar2 = (bi) D.get(i6);
                                                            if (!b70Var13.c(biVar2) && biVar2.r(set3)) {
                                                                list12.add(biVar2);
                                                            }
                                                        }
                                                        l70 l70Var2 = wi0Var3.h;
                                                        int i7 = l70Var2.f;
                                                        int i8 = 0;
                                                        int i9 = 0;
                                                        while (true) {
                                                            objArr = l70Var2.d;
                                                            if (i8 >= i7) {
                                                                break;
                                                            }
                                                            bi biVar3 = (bi) objArr[i8];
                                                            if (!b70Var13.c(biVar3) && !list12.contains(biVar3)) {
                                                                list12.add(biVar3);
                                                                i9++;
                                                            } else if (i9 > 0) {
                                                                Object[] objArr4 = l70Var2.d;
                                                                objArr4[i8 - i9] = objArr4[i8];
                                                            }
                                                            i8++;
                                                        }
                                                        int i10 = i7 - i9;
                                                        Arrays.fill(objArr, i10, i7, (Object) null);
                                                        l70Var2.f = i10;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (list12.isEmpty()) {
                                                try {
                                                    vi0.h(list13, wi0Var3);
                                                    while (!list13.isEmpty()) {
                                                        List H = wi0Var3.H(list13, b70Var12);
                                                        b70Var14.getClass();
                                                        Iterator it = H.iterator();
                                                        while (it.hasNext()) {
                                                            b70Var14.j(it.next());
                                                        }
                                                        vi0.h(list13, wi0Var3);
                                                    }
                                                } catch (Throwable th) {
                                                    wi0Var3.I(th, null);
                                                    vi0.g(wi0Var3, list12, list13, list14, b70Var14, b70Var15, b70Var12, b70Var13);
                                                }
                                            }
                                            z = 0;
                                        } catch (Throwable th2) {
                                            try {
                                                wi0Var3.I(th2, null);
                                                vi0.g(wi0Var3, list12, list13, list14, b70Var14, b70Var15, b70Var12, b70Var13);
                                            } finally {
                                                list12.clear();
                                            }
                                        }
                                    }
                                    or0 k = ur0.k();
                                    or0 fx0Var = k instanceof e70 ? new fx0((e70) k, null, null, true, false) : new gx0(k, null, true, z);
                                    try {
                                        or0 j2 = fx0Var.j();
                                        try {
                                            if (!list14.isEmpty()) {
                                                try {
                                                    int size3 = list14.size();
                                                    for (int i11 = z; i11 < size3; i11++) {
                                                        b70Var15.a((bi) list14.get(i11));
                                                    }
                                                    int size4 = list14.size();
                                                    for (int i12 = z; i12 < size4; i12++) {
                                                        ((bi) list14.get(i12)).d();
                                                    }
                                                } catch (Throwable th3) {
                                                    try {
                                                        wi0Var3.I(th3, null);
                                                        vi0.g(wi0Var3, list12, list13, list14, b70Var14, b70Var15, b70Var12, b70Var13);
                                                        or0.q(j2);
                                                        return ky0.a;
                                                    } finally {
                                                        list14.clear();
                                                    }
                                                }
                                            }
                                            if (b70Var14.h()) {
                                                try {
                                                    b70Var15.i(b70Var14);
                                                    Object[] objArr5 = b70Var14.b;
                                                    long[] jArr = b70Var14.a;
                                                    j = 128;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i13 = 0;
                                                        while (true) {
                                                            long j3 = jArr[i13];
                                                            list8 = list12;
                                                            list9 = list13;
                                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i14 = 8 - ((~(i13 - length)) >>> 31);
                                                                for (int i15 = 0; i15 < i14; i15++) {
                                                                    if ((j3 & 255) < 128) {
                                                                        try {
                                                                            ((bi) objArr5[(i13 << 3) + i15]).f();
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                            try {
                                                                                wi0Var3.I(th, null);
                                                                                vi0.g(wi0Var3, list8, list9, list14, b70Var14, b70Var15, b70Var12, b70Var13);
                                                                                or0.q(j2);
                                                                                return ky0.a;
                                                                            } finally {
                                                                                b70Var14.b();
                                                                            }
                                                                        }
                                                                    }
                                                                    j3 >>= 8;
                                                                }
                                                                if (i14 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i13 == length) {
                                                                break;
                                                            }
                                                            i13++;
                                                            list12 = list8;
                                                            list13 = list9;
                                                        }
                                                    } else {
                                                        list8 = list12;
                                                        list9 = list13;
                                                    }
                                                    list12 = list8;
                                                    list13 = list9;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    list8 = list12;
                                                    list9 = list13;
                                                }
                                            } else {
                                                j = 128;
                                            }
                                            if (b70Var15.h()) {
                                                try {
                                                    Object[] objArr6 = b70Var15.b;
                                                    long[] jArr2 = b70Var15.a;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        int i16 = 0;
                                                        while (true) {
                                                            long j4 = jArr2[i16];
                                                            list10 = list12;
                                                            list11 = list13;
                                                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                                                int i18 = 0;
                                                                while (i18 < i17) {
                                                                    if ((j4 & 255) < j) {
                                                                        try {
                                                                            ((bi) objArr6[(i16 << 3) + i18]).g();
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            try {
                                                                                wi0Var3.I(th, null);
                                                                                vi0.g(wi0Var3, list10, list11, list14, b70Var14, b70Var15, b70Var12, b70Var13);
                                                                                or0.q(j2);
                                                                                return ky0.a;
                                                                            } finally {
                                                                                b70Var15.b();
                                                                            }
                                                                        }
                                                                    }
                                                                    j4 >>= 8;
                                                                    i18++;
                                                                    objArr6 = objArr6;
                                                                }
                                                                objArr2 = objArr6;
                                                                if (i17 != 8) {
                                                                    break;
                                                                }
                                                            } else {
                                                                objArr2 = objArr6;
                                                            }
                                                            if (i16 == length2) {
                                                                break;
                                                            }
                                                            i16++;
                                                            list12 = list10;
                                                            list13 = list11;
                                                            objArr6 = objArr2;
                                                        }
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    list10 = list12;
                                                    list11 = list13;
                                                }
                                            }
                                            or0.q(j2);
                                            fx0Var.c();
                                            synchronized (wi0Var3.b) {
                                                wi0Var3.A();
                                            }
                                            ur0.k().m();
                                            b70Var13.b();
                                            b70Var12.b();
                                            wi0Var3.p = null;
                                            return ky0.a;
                                        } catch (Throwable th8) {
                                            or0.q(j2);
                                            throw th8;
                                        }
                                    } finally {
                                        fx0Var.c();
                                    }
                                } finally {
                                }
                            }
                        };
                        this.m = a60Var;
                        this.d = list5;
                        this.e = list2;
                        this.f = list4;
                        this.g = b70Var5;
                        this.h = b70Var10;
                        this.i = b70Var11;
                        this.j = set2;
                        this.k = b70Var6;
                        this.l = 2;
                        if (a60Var.e(muVar, this) != ckVar) {
                            List list8 = list4;
                            b70Var2 = b70Var6;
                            b70Var = b70Var5;
                            list = list5;
                            list3 = list8;
                            b70Var3 = b70Var11;
                            b70Var4 = b70Var10;
                            set = set2;
                            wi0.s(this.n);
                            synchronized (this.n.b) {
                            }
                        }
                    }
                }
                return ckVar;
            }
            b70 b70Var12 = this.k;
            set = this.j;
            b70Var3 = this.i;
            b70Var4 = this.h;
            b70 b70Var13 = this.g;
            List list9 = this.f;
            list2 = this.e;
            List list10 = this.d;
            a60 a60Var3 = this.m;
            rg0.u(obj);
            b70Var6 = b70Var12;
            a60Var = a60Var3;
            list4 = list9;
            list5 = list10;
            b70Var5 = b70Var13;
            final Set set22 = set;
            final b70 b70Var102 = b70Var4;
            final b70 b70Var112 = b70Var3;
            if (wi0.w(this.n)) {
            }
        }
    }
}
