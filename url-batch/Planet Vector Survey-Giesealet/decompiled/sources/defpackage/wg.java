package defpackage;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wg extends fu0 implements qu {
    public final /* synthetic */ int d;
    public int e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg(Object obj, Object obj2, Object obj3, Object obj4, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                return new wg((zg) this.f, (ScrollCaptureSession) this.g, (Rect) obj3, (Consumer) obj2, kjVar, 0);
            case 1:
                wg wgVar = new wg((dj) this.g, (uy0) obj3, (ta) obj2, kjVar, 1);
                wgVar.f = obj;
                return wgVar;
            case 2:
                wg wgVar2 = new wg((or) this.g, (et0) obj3, (Float) obj2, kjVar, 2);
                wgVar2.f = obj;
                return wgVar2;
            case 3:
                return new wg((at0) this.f, (or) this.g, (et0) obj3, (Float) obj2, kjVar, 3);
            case 4:
                wg wgVar3 = new wg((f70) obj3, (zx) obj2, kjVar);
                wgVar3.g = obj;
                return wgVar3;
            default:
                wg wgVar4 = new wg((jp0) this.g, (y70) obj3, (cx0) obj2, kjVar, 5);
                wgVar4.f = obj;
                return wgVar4;
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        switch (i) {
            case 0:
                return ((wg) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 1:
                return ((wg) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 2:
                return ((wg) create((br0) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 3:
                return ((wg) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 4:
                ((wg) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
                return ck.d;
            default:
                return ((wg) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0179, code lost:
    
        if (defpackage.a50.r(r0, r1, r25) == r8) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0127  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0103 -> B:27:0x00d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0124 -> B:27:0x00d2). Please report as a decompilation issue!!! */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        bk bkVar;
        dj0 dj0Var;
        Object obj2;
        int i = this.d;
        int i2 = 4;
        ky0 ky0Var = ky0.a;
        Object obj3 = this.i;
        ck ckVar = ck.d;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                int i3 = this.e;
                if (i3 == 0) {
                    rg0.u(obj);
                    zg zgVar = (zg) this.f;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.g;
                    Rect rect = (Rect) obj4;
                    fz fzVar = new fz(rect.left, rect.top, rect.right, rect.bottom);
                    this.e = 1;
                    a = zg.a(zgVar, scrollCaptureSession, fzVar, this);
                    if (a == ckVar) {
                        return ckVar;
                    }
                } else {
                    if (i3 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                    a = obj;
                }
                ((Consumer) obj3).accept(ld0.s((fz) a));
                return ky0Var;
            case 1:
                dj djVar = (dj) this.g;
                p01 p01Var = djVar.u;
                int i4 = this.e;
                try {
                    try {
                        if (i4 == 0) {
                            rg0.u(obj);
                            zz w = nk.w(((bk) this.f).f());
                            djVar.z = true;
                            zo0 zo0Var = djVar.s;
                            cj cjVar = new cj((uy0) obj4, djVar, (ta) obj3, w, null, 0);
                            this.e = 1;
                            if (zo0Var.e(1, cjVar, this) == ckVar) {
                                return ckVar;
                            }
                        } else {
                            if (i4 != 1) {
                                g8.s("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rg0.u(obj);
                        }
                        p01Var.t();
                        return ky0Var;
                    } catch (CancellationException e) {
                        throw e;
                    }
                } finally {
                    djVar.z = false;
                    p01Var.f(null);
                    djVar.x = false;
                }
            case 2:
                et0 et0Var = (et0) obj4;
                int i5 = this.e;
                if (i5 == 0) {
                    rg0.u(obj);
                    int ordinal = ((br0) this.f).ordinal();
                    if (ordinal == 0) {
                        or orVar = (or) this.g;
                        this.e = 1;
                        return orVar.a(et0Var, this) == ckVar ? ckVar : ky0Var;
                    }
                    if (ordinal == 1) {
                        return ky0Var;
                    }
                    if (ordinal == 2) {
                        Float f = (Float) obj3;
                        if (f == a50.q) {
                            throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                        }
                        et0Var.k(null, f);
                        return ky0Var;
                    }
                    g8.c();
                } else {
                    if (i5 == 1) {
                        rg0.u(obj);
                        return ky0Var;
                    }
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 3:
                or orVar2 = (or) this.g;
                et0 et0Var2 = (et0) obj4;
                int i6 = this.e;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            rg0.u(obj);
                        } else if (i6 != 3 && i6 != 4) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    rg0.u(obj);
                    return ky0Var;
                }
                rg0.u(obj);
                at0 at0Var = (at0) this.f;
                if (at0Var == cr0.a) {
                    this.e = 1;
                    if (orVar2.a(et0Var2, this) != ckVar) {
                        return ky0Var;
                    }
                } else {
                    kj kjVar = null;
                    if (at0Var == cr0.b) {
                        wt0 h = et0Var2.h();
                        as asVar = new as(2, null);
                        this.e = 2;
                        break;
                    } else {
                        wt0 h2 = et0Var2.h();
                        zs0 zs0Var = new zs0(at0Var, null);
                        int i7 = xr.a;
                        up upVar = up.d;
                        cb cbVar = cb.d;
                        or p = a50.p(a50.p(new ur(new bd(zs0Var, h2, upVar, -2, cbVar), new ti0(2, null, 1))));
                        wg wgVar = new wg(orVar2, et0Var2, (Float) obj3, kjVar, 2);
                        this.e = 4;
                        Object a2 = new bd(new wr(wgVar, null), p, upVar, -2, cbVar).b(upVar, 0, cbVar).a(ka0.d, this);
                        if (a2 != ckVar) {
                            a2 = ky0Var;
                        }
                        if (a2 != ckVar) {
                            a2 = ky0Var;
                        }
                        if (a2 != ckVar) {
                            return ky0Var;
                        }
                    }
                }
                return ckVar;
                this.e = 3;
                if (orVar2.a(et0Var2, this) != ckVar) {
                    return ky0Var;
                }
                return ckVar;
            case 4:
                int i8 = this.e;
                if (i8 == 0) {
                    rg0.u(obj);
                    bkVar = (bk) this.g;
                    dj0Var = new dj0();
                    dj0Var.d = 1.0f;
                } else if (i8 == 1) {
                    dj0 dj0Var2 = (dj0) this.f;
                    bk bkVar2 = (bk) this.g;
                    rg0.u(obj);
                    dj0Var = dj0Var2;
                    bkVar = bkVar2;
                    if (dj0Var.d == 0.0f) {
                        pm0 pm0Var = new pm0(new ds0(new b(5, bkVar), null));
                        yx yxVar = new yx(2, null);
                        this.g = bkVar;
                        this.f = dj0Var;
                        this.e = 2;
                        if (a50.r(pm0Var, yxVar, this) == ckVar) {
                            return ckVar;
                        }
                    }
                } else {
                    if (i8 != 2) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dj0 dj0Var3 = (dj0) this.f;
                    bk bkVar3 = (bk) this.g;
                    rg0.u(obj);
                    dj0Var = dj0Var3;
                    bkVar = bkVar3;
                }
                wk wkVar = new wk((f70) obj4, (zx) obj3, dj0Var, bkVar);
                this.g = bkVar;
                this.f = dj0Var;
                this.e = 1;
                if (getContext().k(b2.B) != null) {
                    g8.q();
                    return null;
                }
                if (x40.D(getContext()).e(wkVar, this) == ckVar) {
                    return ckVar;
                }
                if (dj0Var.d == 0.0f) {
                }
                wk wkVar2 = new wk((f70) obj4, (zx) obj3, dj0Var, bkVar);
                this.g = bkVar;
                this.f = dj0Var;
                this.e = 1;
                if (getContext().k(b2.B) != null) {
                }
            default:
                y70 y70Var = (y70) obj4;
                jp0 jp0Var = (jp0) this.g;
                int i9 = this.e;
                if (i9 != 0) {
                    if (i9 == 1 || i9 == 2) {
                        rg0.u(obj);
                        return ky0Var;
                    }
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rg0.u(obj);
                bk bkVar4 = (bk) this.f;
                ce0 ce0Var = jp0Var.c;
                yd0 yd0Var = jp0Var.h;
                if (nz.l(ce0Var.getValue(), y70Var)) {
                    long longValue = ((Number) ((cx0) obj3).l.getValue()).longValue() / 1000000;
                    float g = yd0Var.g();
                    ox0 Q = nk.Q((int) (yd0Var.g() * longValue), 6, null);
                    v3 v3Var = new v3(bkVar4, jp0Var, y70Var, i2);
                    this.e = 2;
                    if (ze0.c(g, 0.0f, Q, v3Var, this, 4) != ckVar) {
                        return ky0Var;
                    }
                } else {
                    this.e = 1;
                    cx0 cx0Var = jp0Var.e;
                    if (cx0Var == null || (obj2 = s70.a(jp0Var.k, new dp0(cx0Var, jp0Var, y70Var, (kj) null), this)) != ckVar) {
                        obj2 = ky0Var;
                    }
                    if (obj2 != ckVar) {
                        return ky0Var;
                    }
                }
                return ckVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg(Object obj, Object obj2, Object obj3, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(f70 f70Var, zx zxVar, kj kjVar) {
        super(2, kjVar);
        this.d = 4;
        this.h = f70Var;
        this.i = zxVar;
    }
}
