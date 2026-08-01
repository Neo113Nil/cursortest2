package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qk extends fu0 implements qu {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk(Object obj, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.f = obj;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new qk((rk) obj2, kjVar, 0);
            case 1:
                return new qk((xs) obj2, kjVar, 1);
            case 2:
                return new qk((jp0) obj2, kjVar, 2);
            case 3:
                return new qk((ku0) obj2, kjVar, 3);
            default:
                return new qk((oh0) obj2, kjVar, 4);
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        bk bkVar = (bk) obj;
        kj kjVar = (kj) obj2;
        switch (i) {
        }
        return ((qk) create(bkVar, kjVar)).invokeSuspend(ky0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c0, code lost:
    
        if (r14 != r5) goto L57;
     */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.d;
        int i2 = 2;
        ky0 ky0Var = ky0.a;
        Object obj3 = this.f;
        ck ckVar = ck.d;
        ma maVar = null;
        switch (i) {
            case 0:
                int i3 = this.e;
                if (i3 == 0) {
                    rg0.u(obj);
                    ej0 ej0Var = new ej0();
                    ej0 ej0Var2 = new ej0();
                    ej0 ej0Var3 = new ej0();
                    rk rkVar = (rk) obj3;
                    zq0 zq0Var = rkVar.r.a;
                    ad adVar = new ad(ej0Var, ej0Var2, ej0Var3, rkVar, 1);
                    this.e = 1;
                    zq0Var.getClass();
                    zq0.j(zq0Var, adVar, this);
                    break;
                } else if (i3 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                    break;
                }
            case 1:
                int i4 = this.e;
                if (i4 == 0) {
                    rg0.u(obj);
                    xs xsVar = (xs) obj3;
                    this.e = 1;
                    if (xsVar.d.q) {
                        ea0 Z = nz.Z(xsVar);
                        if (xsVar.d.q && (maVar = (ma) yc0.c(xsVar, pa.t)) == null) {
                            maVar = new qa(xsVar);
                        }
                        if (maVar != null) {
                            obj2 = maVar.T(Z, new da0(Z, i2), this);
                            break;
                        }
                    }
                    obj2 = ky0Var;
                    if (obj2 == ckVar) {
                        break;
                    }
                } else if (i4 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                    break;
                }
                break;
            case 2:
                int i5 = this.e;
                if (i5 == 0) {
                    rg0.u(obj);
                    this.e = 1;
                    if (jp0.j((jp0) obj3, this) == ckVar) {
                        break;
                    }
                } else if (i5 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                    break;
                }
                break;
            case 3:
                ku0 ku0Var = (ku0) obj3;
                int i6 = this.e;
                if (i6 == 0) {
                    rg0.u(obj);
                    qu quVar = ku0Var.t;
                    if (quVar != null) {
                        this.e = 1;
                        if (quVar.invoke(ku0Var, this) != ckVar) {
                        }
                    } else {
                        PointerInputEventHandler pointerInputEventHandler = ku0Var.u;
                        this.e = 2;
                        if (pointerInputEventHandler.invoke(ku0Var, this) != ckVar) {
                        }
                    }
                    break;
                } else if (i6 != 1 && i6 != 2) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                    break;
                }
                break;
            default:
                int i7 = this.e;
                if (i7 == 0) {
                    rg0.u(obj);
                    this.e = 1;
                    if (((oh0) obj3).b(this) == ckVar) {
                        break;
                    }
                } else if (i7 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                    break;
                }
                break;
        }
        return ckVar;
    }
}
