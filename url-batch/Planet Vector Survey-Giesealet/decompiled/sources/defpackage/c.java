package defpackage;

import android.view.View;
import com.vectorharbor.planetvectorsurvey.R;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class c extends fu0 implements qu {
    public final /* synthetic */ int d;
    public int e;
    public Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new c((r60) this.f, (ow) obj2, kjVar, 0);
            case 1:
                return new c((r60) this.f, (pw) obj2, kjVar, 1);
            case 2:
                c cVar = new c((qd) obj2, kjVar, 2);
                cVar.f = obj;
                return cVar;
            case 3:
                c cVar2 = new c((q4) obj2, kjVar, 3);
                cVar2.f = obj;
                return cVar2;
            case 4:
                return new c((pa) this.f, (c9) obj2, kjVar, 4);
            case 5:
                return new c((r60) this.f, (gs0) obj2, kjVar, 5);
            case 6:
                c cVar3 = new c((vc) obj2, kjVar, 6);
                cVar3.f = obj;
                return cVar3;
            case 7:
                c cVar4 = new c((wc) obj2, kjVar, 7);
                cVar4.f = obj;
                return cVar4;
            case 8:
                return new c((ug) obj2, kjVar, 8);
            case 9:
                return new c((zg) this.f, (Runnable) obj2, kjVar, 9);
            case 10:
                c cVar5 = new c((qo0) obj2, kjVar, 10);
                cVar5.f = obj;
                return cVar5;
            case 11:
                c cVar6 = new c((pl0) obj2, kjVar, 11);
                cVar6.f = obj;
                return cVar6;
            case 12:
                return new c((or) this.f, (vh0) obj2, kjVar, 12);
            case 13:
                return new c((w4) this.f, (c7) obj2, kjVar, 13);
            case 14:
                c cVar7 = new c((pr) obj2, kjVar, 14);
                cVar7.f = obj;
                return cVar7;
            case 15:
                return new c((wi0) this.f, (View) obj2, kjVar, 15);
            default:
                return new c((ct0) this.f, (c60) obj2, kjVar, 16);
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        switch (i) {
            case 0:
                return ((c) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 1:
                return ((c) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 2:
                return ((c) create((ah0) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 3:
                return ((c) create((ah0) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 4:
                return ((c) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 5:
                return ((c) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 6:
                return ((c) create((wh0) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 7:
                return ((c) create((pr) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 8:
                return ((c) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 9:
                return ((c) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 10:
                return ((c) create((ah0) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 11:
                return ((c) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 12:
                return ((c) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 13:
                return ((c) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 14:
                return ((c) create(obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 15:
                return ((c) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            default:
                ((c) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
                return ck.d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        cj0 cj0Var;
        int i = this.d;
        int i2 = 0;
        ky0 ky0Var = ky0.a;
        Object obj2 = this.g;
        ck ckVar = ck.d;
        int i3 = 1;
        char c = 1;
        char c2 = 1;
        ma maVar = null;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                int i4 = this.e;
                if (i4 == 0) {
                    rg0.u(obj);
                    this.e = 1;
                    return ((r60) this.f).a((ow) obj2, this) == ckVar ? ckVar : ky0Var;
                }
                if (i4 == 1) {
                    rg0.u(obj);
                    return ky0Var;
                }
                g8.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i5 = this.e;
                if (i5 == 0) {
                    rg0.u(obj);
                    this.e = 1;
                    return ((r60) this.f).a((pw) obj2, this) == ckVar ? ckVar : ky0Var;
                }
                if (i5 == 1) {
                    rg0.u(obj);
                    return ky0Var;
                }
                g8.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                int i6 = this.e;
                if (i6 != 0) {
                    if (i6 == 1) {
                        rg0.u(obj);
                        return ky0Var;
                    }
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rg0.u(obj);
                ah0 ah0Var = (ah0) this.f;
                qd qdVar = (qd) obj2;
                this.e = 1;
                pd pdVar = new pd(qdVar, null);
                f2 f2Var = new f2(8, qdVar);
                go goVar = yu0.a;
                Object v = x40.v(new cj(ah0Var, pdVar, f2Var, new oh0(ah0Var), null, 4), this);
                if (v != ckVar) {
                    v = ky0Var;
                }
                if (v != ckVar) {
                    v = ky0Var;
                }
                return v == ckVar ? ckVar : ky0Var;
            case 3:
                int i7 = this.e;
                if (i7 != 0) {
                    if (i7 == 1) {
                        rg0.u(obj);
                        return ky0Var;
                    }
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rg0.u(obj);
                ah0 ah0Var2 = (ah0) this.f;
                p4 p4Var = new p4((q4) obj2, null);
                this.e = 1;
                return d31.k(ah0Var2, p4Var, this) == ckVar ? ckVar : ky0Var;
            case 4:
                pa paVar = (pa) this.f;
                int i8 = this.e;
                if (i8 != 0) {
                    if (i8 == 1) {
                        rg0.u(obj);
                        return ky0Var;
                    }
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rg0.u(obj);
                if (!paVar.q) {
                    return ky0Var;
                }
                if (paVar.d.q && (maVar = (ma) yc0.c(paVar, pa.t)) == null) {
                    maVar = new qa(paVar);
                }
                if (maVar == null) {
                    return ky0Var;
                }
                this.e = 1;
                return maVar.T(nz.Z(paVar), (c9) obj2, this) == ckVar ? ckVar : ky0Var;
            case 5:
                int i9 = this.e;
                if (i9 != 0) {
                    if (i9 == 1) {
                        rg0.u(obj);
                        return ky0Var;
                    }
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rg0.u(obj);
                zq0 zq0Var = ((r60) this.f).a;
                kb kbVar = new kb(i2, (gs0) obj2);
                this.e = 1;
                zq0Var.getClass();
                zq0.j(zq0Var, kbVar, this);
                return ckVar;
            case 6:
                int i10 = this.e;
                if (i10 == 0) {
                    rg0.u(obj);
                    wh0 wh0Var = (wh0) this.f;
                    this.e = 1;
                    return ((vc) obj2).d(wh0Var, this) == ckVar ? ckVar : ky0Var;
                }
                if (i10 == 1) {
                    rg0.u(obj);
                    return ky0Var;
                }
                g8.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                int i11 = this.e;
                if (i11 == 0) {
                    rg0.u(obj);
                    pr prVar = (pr) this.f;
                    this.e = 1;
                    return ((wc) obj2).h(prVar, this) == ckVar ? ckVar : ky0Var;
                }
                if (i11 == 1) {
                    rg0.u(obj);
                    return ky0Var;
                }
                g8.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                ug ugVar = (ug) obj2;
                int i12 = this.e;
                if (i12 == 0) {
                    rg0.u(obj);
                    if (!ugVar.a()) {
                        return ky0Var;
                    }
                    cj0 cj0Var2 = new cj0();
                    qu quVar = ugVar.d;
                    eb ebVar = ugVar.e;
                    ebVar.getClass();
                    tr trVar = new tr(new uc(ebVar, c == true ? 1 : 0), new tg(cj0Var2, null));
                    this.f = cj0Var2;
                    this.e = 1;
                    if (quVar.invoke(trVar, this) == ckVar) {
                        return ckVar;
                    }
                    cj0Var = cj0Var2;
                } else {
                    if (i12 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cj0Var = (cj0) this.f;
                    rg0.u(obj);
                }
                if (cj0Var.d) {
                    return ky0Var;
                }
                g8.s("You must collect the progress flow");
                return null;
            case 9:
                zg zgVar = (zg) this.f;
                int i13 = this.e;
                if (i13 == 0) {
                    rg0.u(obj);
                    kj0 kj0Var = zgVar.f;
                    this.e = 1;
                    Object a = kj0Var.a(0.0f - kj0Var.c, this);
                    if (a != ckVar) {
                        a = ky0Var;
                    }
                    if (a == ckVar) {
                        return ckVar;
                    }
                } else {
                    if (i13 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                }
                zgVar.c.a.setValue(Boolean.FALSE);
                ((Runnable) obj2).run();
                return ky0Var;
            case 10:
                int i14 = this.e;
                if (i14 != 0) {
                    if (i14 == 1) {
                        rg0.u(obj);
                        return ky0Var;
                    }
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rg0.u(obj);
                ah0 ah0Var3 = (ah0) this.f;
                pz0 pz0Var = new pz0();
                qo0 qo0Var = (qo0) obj2;
                vn vnVar = new vn(qo0Var, ah0Var3, new xn(i2, qo0Var, pz0Var), new y3(10, pz0Var, qo0Var), new wn(qo0Var, i2), new wn(qo0Var, c2 == true ? 1 : 0), new w3(5, pz0Var, qo0Var), null);
                this.e = 1;
                return x40.v(vnVar, this) == ckVar ? ckVar : ky0Var;
            case 11:
                int i15 = this.e;
                if (i15 != 0) {
                    if (i15 == 1) {
                        rg0.u(obj);
                        return ky0Var;
                    }
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rg0.u(obj);
                bk bkVar = (bk) this.f;
                pl0 pl0Var = (pl0) obj2;
                zq0 zq0Var2 = pl0Var.r.a;
                fn fnVar = new fn(pl0Var, bkVar, 3);
                this.e = 1;
                zq0Var2.getClass();
                zq0.j(zq0Var2, fnVar, this);
                return ckVar;
            case 12:
                int i16 = this.e;
                if (i16 != 0) {
                    if (i16 == 1) {
                        rg0.u(obj);
                        return ky0Var;
                    }
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rg0.u(obj);
                or orVar = (or) this.f;
                cs0 cs0Var = new cs0((vh0) obj2, 1);
                this.e = 1;
                return orVar.a(cs0Var, this) == ckVar ? ckVar : ky0Var;
            case 13:
                int i17 = this.e;
                if (i17 == 0) {
                    rg0.u(obj);
                    this.e = 1;
                    return b6.b((b6) ((w4) this.f).c, new Float(0.0f), (c7) obj2, this) == ckVar ? ckVar : ky0Var;
                }
                if (i17 == 1) {
                    rg0.u(obj);
                    return ky0Var;
                }
                g8.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                int i18 = this.e;
                if (i18 == 0) {
                    rg0.u(obj);
                    Object obj3 = this.f;
                    this.e = 1;
                    return ((pr) obj2).e(obj3, this) == ckVar ? ckVar : ky0Var;
                }
                if (i18 == 1) {
                    rg0.u(obj);
                    return ky0Var;
                }
                g8.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                wi0 wi0Var = (wi0) this.f;
                View view = (View) obj2;
                int i19 = this.e;
                try {
                    if (i19 == 0) {
                        rg0.u(obj);
                        this.e = 1;
                        Object r = a50.r(wi0Var.t, new ti0(2, objArr == true ? 1 : 0, i2), this);
                        if (r != ckVar) {
                            r = ky0Var;
                        }
                        if (r == ckVar) {
                            return ckVar;
                        }
                    } else {
                        if (i19 != 1) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rg0.u(obj);
                    }
                    if (t21.b(view) != wi0Var) {
                        return ky0Var;
                    }
                    view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    return ky0Var;
                } finally {
                    if (t21.b(view) == wi0Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                }
            default:
                int i20 = this.e;
                if (i20 == 0) {
                    rg0.u(obj);
                    ct0 ct0Var = (ct0) this.f;
                    kb kbVar2 = new kb(i3, (c60) obj2);
                    this.e = 1;
                    if (ct0Var.a(kbVar2, this) == ckVar) {
                        return ckVar;
                    }
                } else {
                    if (i20 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rg0.u(obj);
                }
                throw new kf();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.g = obj;
    }
}
