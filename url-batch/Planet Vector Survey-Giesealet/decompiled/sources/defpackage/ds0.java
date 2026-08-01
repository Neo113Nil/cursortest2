package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import java.util.Set;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ds0 extends fu0 implements qu {
    public final /* synthetic */ int d = 1;
    public int e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds0(ContentResolver contentResolver, Uri uri, s21 s21Var, eb ebVar, Context context, kj kjVar) {
        super(2, kjVar);
        this.h = contentResolver;
        this.i = uri;
        this.j = s21Var;
        this.k = ebVar;
        this.l = context;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                ds0 ds0Var = new ds0((bu) obj2, kjVar);
                ds0Var.k = obj;
                return ds0Var;
            default:
                ds0 ds0Var2 = new ds0((ContentResolver) this.h, (Uri) this.i, (s21) this.j, (eb) this.k, (Context) obj2, kjVar);
                ds0Var2.f = obj;
                return ds0Var2;
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        pr prVar = (pr) obj;
        kj kjVar = (kj) obj2;
        switch (i) {
            case 0:
                ((ds0) create(prVar, kjVar)).invokeSuspend(ky0Var);
                return ck.d;
            default:
                return ((ds0) create(prVar, kjVar)).invokeSuspend(ky0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        if (r5.e(r9, r21) == r7) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0249, code lost:
    
        if (r13.e(r3, r21) == r1) goto L112;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #7 {all -> 0x002a, blocks: (B:9:0x0025, B:11:0x0059, B:17:0x0066, B:19:0x006e, B:27:0x003b, B:30:0x0050), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0278 A[LOOP:0: B:51:0x018c->B:59:0x0278, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0090 -> B:11:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0249 -> B:41:0x024d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x026f -> B:42:0x0173). Please report as a decompilation issue!!! */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        bb0 bb0Var;
        pr prVar;
        b70 b70Var;
        mu hVar;
        tc b;
        or0 u;
        or0 j;
        Object obj2;
        Object obj3;
        Set set;
        boolean z;
        bb0 bb0Var2;
        Object obj4;
        int i;
        int i2;
        Object p;
        Object obj5;
        Object a;
        char c;
        pr prVar2;
        db dbVar;
        Object obj6;
        boolean z2 = false;
        int i3 = 2;
        switch (this.d) {
            case 0:
                ck ckVar = ck.d;
                int i4 = this.e;
                int i5 = 8;
                try {
                    if (i4 == 0) {
                        rg0.u(obj);
                        prVar = (pr) this.k;
                        b70Var = new b70();
                        hVar = new h(8, b70Var);
                        b = x40.b(Integer.MAX_VALUE, null, 6);
                        sh shVar = new sh(5, b);
                        ur0.f(ur0.a);
                        synchronized (ur0.c) {
                            ur0.h = zd.k0(ur0.h, shVar);
                        }
                        bb0Var = new bb0(shVar);
                        u = ur0.k().u(hVar);
                        bu buVar = (bu) this.l;
                        try {
                            j = u.j();
                            try {
                                Object a2 = buVar.a();
                                u.c();
                                this.k = prVar;
                                this.g = b70Var;
                                this.h = hVar;
                                this.i = b;
                                this.j = bb0Var;
                                this.f = a2;
                                this.e = 1;
                                if (prVar.e(a2, this) == ckVar) {
                                    return ckVar;
                                }
                                obj2 = a2;
                            } finally {
                                or0.q(j);
                            }
                        } finally {
                            u.c();
                        }
                    } else if (i4 == 1) {
                        obj2 = this.f;
                        bb0Var = (bb0) this.j;
                        b = (tc) this.i;
                        hVar = (mu) this.h;
                        b70Var = (b70) this.g;
                        prVar = (pr) this.k;
                        rg0.u(obj);
                    } else if (i4 == 2) {
                        obj2 = this.f;
                        bb0Var = (bb0) this.j;
                        b = (tc) this.i;
                        hVar = (mu) this.h;
                        b70Var = (b70) this.g;
                        prVar = (pr) this.k;
                        rg0.u(obj);
                        obj3 = obj;
                        set = (Set) obj3;
                        z = z2;
                        while (true) {
                            if (z) {
                                try {
                                    Object[] objArr = b70Var.b;
                                    long[] jArr = b70Var.a;
                                    int length = jArr.length - i3;
                                    if (length >= 0) {
                                        bb0Var2 = bb0Var;
                                        int i6 = 0;
                                        while (true) {
                                            try {
                                                long j2 = jArr[i6];
                                                obj4 = obj2;
                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                                    int i8 = 0;
                                                    while (i8 < i7) {
                                                        if ((j2 & 255) < 128) {
                                                            i2 = i5;
                                                            if (set.contains(objArr[(i6 << 3) + i8])) {
                                                                i = i2;
                                                            }
                                                        } else {
                                                            i2 = i5;
                                                        }
                                                        j2 >>= i2;
                                                        i8++;
                                                        i5 = i2;
                                                    }
                                                    i = i5;
                                                    if (i7 == i) {
                                                    }
                                                } else {
                                                    i = i5;
                                                }
                                                if (i6 != length) {
                                                    i6++;
                                                    i5 = i;
                                                    obj2 = obj4;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                bb0Var = bb0Var2;
                                                bb0Var.b();
                                                throw th;
                                            }
                                        }
                                    } else {
                                        obj4 = obj2;
                                        i = i5;
                                        bb0Var2 = bb0Var;
                                    }
                                    z = false;
                                    p = b.p();
                                    if (p instanceof dd) {
                                        p = null;
                                    }
                                    set = (Set) p;
                                    if (set != null) {
                                        bb0Var = bb0Var2;
                                        i5 = i;
                                        obj2 = obj4;
                                        i3 = 2;
                                    } else {
                                        if (z) {
                                            b70Var.b();
                                            u = ur0.k().u(hVar);
                                            bu buVar2 = (bu) this.l;
                                            try {
                                                try {
                                                    a = buVar2.a();
                                                    u.c();
                                                    obj5 = obj4;
                                                    if (!nz.l(a, obj5)) {
                                                        this.k = prVar;
                                                        this.g = b70Var;
                                                        this.h = hVar;
                                                        this.i = b;
                                                        bb0Var = bb0Var2;
                                                        this.j = bb0Var;
                                                        this.f = a;
                                                        c = 3;
                                                        this.e = 3;
                                                        break;
                                                    }
                                                } catch (Throwable th2) {
                                                    try {
                                                        throw th2;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        throw th;
                                                    }
                                                }
                                                j = u.j();
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        } else {
                                            obj5 = obj4;
                                        }
                                        bb0Var = bb0Var2;
                                        i5 = i;
                                        i3 = 2;
                                        obj2 = obj5;
                                        z2 = false;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bb0Var2 = bb0Var;
                                }
                            } else {
                                obj4 = obj2;
                                i = i5;
                                bb0Var2 = bb0Var;
                            }
                            z = true;
                            p = b.p();
                            if (p instanceof dd) {
                            }
                            set = (Set) p;
                            if (set != null) {
                            }
                        }
                    } else {
                        if (i4 != 3) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj7 = this.f;
                        bb0Var = (bb0) this.j;
                        b = (tc) this.i;
                        hVar = (mu) this.h;
                        b70Var = (b70) this.g;
                        prVar = (pr) this.k;
                        rg0.u(obj);
                        a = obj7;
                        i = 8;
                        c = 3;
                        i5 = i;
                        z2 = false;
                        i3 = 2;
                        obj2 = a;
                    }
                    this.k = prVar;
                    this.g = b70Var;
                    this.h = hVar;
                    this.i = b;
                    this.j = bb0Var;
                    this.f = obj2;
                    this.e = i3;
                    obj3 = b.l(this);
                    if (obj3 == ckVar) {
                        return ckVar;
                    }
                    set = (Set) obj3;
                    z = z2;
                    while (true) {
                        if (z) {
                        }
                        z = true;
                        p = b.p();
                        if (p instanceof dd) {
                        }
                        set = (Set) p;
                        if (set != null) {
                        }
                        bb0Var = bb0Var2;
                        i5 = i;
                        obj2 = obj4;
                        i3 = 2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    bb0Var.b();
                    throw th;
                }
            default:
                s21 s21Var = (s21) this.j;
                ContentResolver contentResolver = (ContentResolver) this.h;
                ck ckVar2 = ck.d;
                int i9 = this.e;
                try {
                    if (i9 == 0) {
                        rg0.u(obj);
                        prVar2 = (pr) this.f;
                        contentResolver.registerContentObserver((Uri) this.i, false, s21Var);
                        dbVar = new db((eb) this.k);
                    } else if (i9 == 1) {
                        db dbVar2 = (db) this.g;
                        prVar2 = (pr) this.f;
                        rg0.u(obj);
                        dbVar = dbVar2;
                        obj6 = obj;
                        if (!((Boolean) obj6).booleanValue()) {
                            dbVar.c();
                            Float f = new Float(Settings.Global.getFloat(((Context) this.l).getContentResolver(), "animator_duration_scale", 1.0f));
                            this.f = prVar2;
                            this.g = dbVar;
                            this.e = 2;
                            break;
                        } else {
                            contentResolver.unregisterContentObserver(s21Var);
                            return ky0.a;
                        }
                    } else {
                        if (i9 != 2) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        db dbVar3 = (db) this.g;
                        prVar2 = (pr) this.f;
                        rg0.u(obj);
                        dbVar = dbVar3;
                    }
                    this.f = prVar2;
                    this.g = dbVar;
                    this.e = 1;
                    obj6 = dbVar.b(this);
                    if (obj6 == ckVar2) {
                        return ckVar2;
                    }
                    if (!((Boolean) obj6).booleanValue()) {
                    }
                } catch (Throwable th7) {
                    contentResolver.unregisterContentObserver(s21Var);
                    throw th7;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds0(bu buVar, kj kjVar) {
        super(2, kjVar);
        this.l = buVar;
    }
}
