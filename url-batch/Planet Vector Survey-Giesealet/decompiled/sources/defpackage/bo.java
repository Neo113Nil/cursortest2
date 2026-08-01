package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class bo extends fu0 implements qu {
    public final /* synthetic */ int d = 0;
    public gj0 e;
    public gj0 f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ qo0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(gj0 gj0Var, qo0 qo0Var, kj kjVar) {
        super(2, kjVar);
        this.f = gj0Var;
        this.i = qo0Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        qo0 qo0Var = this.i;
        switch (i) {
            case 0:
                bo boVar = new bo(this.f, qo0Var, kjVar);
                boVar.h = obj;
                return boVar;
            default:
                bo boVar2 = new bo(qo0Var, kjVar);
                boVar2.h = obj;
                return boVar2;
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        switch (i) {
            case 0:
                return ((bo) create((mu) obj, (kj) obj2)).invokeSuspend(ky0Var);
            default:
                return ((bo) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:22|23|(1:25)|(0)|27|28|29|(2:35|(2:37|(0)))(2:31|(1:33))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5 A[Catch: CancellationException -> 0x00d5, TryCatch #2 {CancellationException -> 0x00d5, blocks: (B:29:0x00bf, B:31:0x00c5, B:35:0x00d7, B:37:0x00db), top: B:28:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7 A[Catch: CancellationException -> 0x00d5, TryCatch #2 {CancellationException -> 0x00d5, blocks: (B:29:0x00bf, B:31:0x00c5, B:35:0x00d7, B:37:0x00db), top: B:28:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008a -> B:10:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d2 -> B:10:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d9 -> B:10:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e6 -> B:10:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f4 -> B:9:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0140 -> B:62:0x0141). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0144 -> B:63:0x0146). Please report as a decompilation issue!!! */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        mu muVar;
        Object obj2;
        bk bkVar;
        gj0 gj0Var;
        gj0 gj0Var2;
        gj0 gj0Var3;
        bk bkVar2;
        bk bkVar3;
        Object obj3;
        Object e;
        sn snVar;
        Object obj4;
        int i = this.d;
        ck ckVar = ck.d;
        qo0 qo0Var = this.i;
        ky0 ky0Var = ky0.a;
        switch (i) {
            case 0:
                gj0 gj0Var4 = this.f;
                int i2 = this.g;
                if (i2 == 0) {
                    rg0.u(obj);
                    muVar = (mu) this.h;
                    obj2 = gj0Var4.d;
                    if (obj2 instanceof rn) {
                    }
                } else if (i2 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    gj0 gj0Var5 = this.e;
                    muVar = (mu) this.h;
                    rg0.u(obj);
                    sn snVar2 = (sn) obj;
                    gj0Var5.d = snVar2;
                    obj2 = gj0Var4.d;
                    if (!(obj2 instanceof rn) || (obj2 instanceof on)) {
                        break;
                    } else {
                        pn pnVar = obj2 instanceof pn ? (pn) obj2 : null;
                        if (pnVar != null) {
                            muVar.c(pnVar);
                        }
                        eb ebVar = qo0Var.x;
                        if (ebVar != null) {
                            this.h = muVar;
                            this.e = gj0Var4;
                            this.g = 1;
                            obj = ebVar.l(this);
                            if (obj != ckVar) {
                                gj0Var5 = gj0Var4;
                                sn snVar22 = (sn) obj;
                                gj0Var5.d = snVar22;
                                obj2 = gj0Var4.d;
                                if (obj2 instanceof rn) {
                                }
                            }
                        } else {
                            gj0Var5 = gj0Var4;
                            snVar22 = null;
                            gj0Var5.d = snVar22;
                            obj2 = gj0Var4.d;
                            if (obj2 instanceof rn) {
                            }
                        }
                    }
                }
                break;
            default:
                switch (this.g) {
                    case 0:
                        rg0.u(obj);
                        bkVar = (bk) this.h;
                        if (!x40.G(bkVar)) {
                            gj0Var = new gj0();
                            eb ebVar2 = qo0Var.x;
                            if (ebVar2 != null) {
                                this.h = bkVar;
                                this.e = gj0Var;
                                this.f = gj0Var;
                                this.g = 1;
                                obj = ebVar2.l(this);
                                if (obj != ckVar) {
                                    gj0Var2 = gj0Var;
                                    snVar = (sn) obj;
                                    gj0Var.d = snVar;
                                    obj4 = gj0Var2.d;
                                    if (obj4 instanceof qn) {
                                        this.h = bkVar;
                                        this.e = gj0Var2;
                                        this.f = null;
                                        this.g = 2;
                                        if (qo0.n0(qo0Var, (qn) obj4, this) != ckVar) {
                                            gj0Var3 = gj0Var2;
                                            bkVar2 = bkVar;
                                            bo boVar = new bo(gj0Var3, qo0Var, null);
                                            this.h = bkVar2;
                                            this.e = gj0Var3;
                                            this.g = 3;
                                            zo0 zo0Var = qo0Var.F;
                                            e = zo0Var.e(2, new u6(boVar, zo0Var, (kj) null, 10), this);
                                            if (e != ckVar) {
                                                e = ky0Var;
                                            }
                                            if (e == ckVar) {
                                            }
                                            bkVar = bkVar2;
                                            obj3 = gj0Var3.d;
                                            if (obj3 instanceof rn) {
                                                this.h = bkVar;
                                                this.e = null;
                                                this.g = 4;
                                                if (qo0.o0(qo0Var, (rn) obj3, this) == ckVar) {
                                                    break;
                                                }
                                            } else if (obj3 instanceof on) {
                                                this.h = bkVar;
                                                this.e = null;
                                                this.g = 5;
                                                if (qo0.m0(qo0Var, this) == ckVar) {
                                                }
                                            }
                                        }
                                    }
                                    if (!x40.G(bkVar)) {
                                        break;
                                    }
                                }
                            } else {
                                gj0Var2 = gj0Var;
                                snVar = null;
                                gj0Var.d = snVar;
                                obj4 = gj0Var2.d;
                                if (obj4 instanceof qn) {
                                }
                                if (!x40.G(bkVar)) {
                                }
                            }
                        }
                        break;
                    case 1:
                        gj0Var = this.f;
                        gj0Var2 = this.e;
                        bkVar = (bk) this.h;
                        rg0.u(obj);
                        snVar = (sn) obj;
                        gj0Var.d = snVar;
                        obj4 = gj0Var2.d;
                        if (obj4 instanceof qn) {
                        }
                        if (!x40.G(bkVar)) {
                        }
                        break;
                    case 2:
                        gj0Var3 = this.e;
                        bkVar2 = (bk) this.h;
                        rg0.u(obj);
                        bo boVar2 = new bo(gj0Var3, qo0Var, null);
                        this.h = bkVar2;
                        this.e = gj0Var3;
                        this.g = 3;
                        zo0 zo0Var2 = qo0Var.F;
                        e = zo0Var2.e(2, new u6(boVar2, zo0Var2, (kj) null, 10), this);
                        if (e != ckVar) {
                        }
                        if (e == ckVar) {
                        }
                        bkVar = bkVar2;
                        obj3 = gj0Var3.d;
                        if (obj3 instanceof rn) {
                        }
                        if (!x40.G(bkVar)) {
                        }
                        break;
                    case 3:
                        gj0Var3 = this.e;
                        bkVar2 = (bk) this.h;
                        try {
                            rg0.u(obj);
                        } catch (CancellationException unused) {
                            bkVar3 = bkVar2;
                            this.h = bkVar3;
                            this.e = null;
                            this.g = 6;
                            if (qo0.m0(qo0Var, this) == ckVar) {
                                return ckVar;
                            }
                            bkVar = bkVar3;
                            if (!x40.G(bkVar)) {
                            }
                        }
                        bkVar = bkVar2;
                        obj3 = gj0Var3.d;
                        if (obj3 instanceof rn) {
                        }
                        if (!x40.G(bkVar)) {
                        }
                        break;
                    case 4:
                        bkVar3 = (bk) this.h;
                        try {
                            rg0.u(obj);
                        } catch (CancellationException unused2) {
                            this.h = bkVar3;
                            this.e = null;
                            this.g = 6;
                            if (qo0.m0(qo0Var, this) == ckVar) {
                            }
                            bkVar = bkVar3;
                            if (!x40.G(bkVar)) {
                            }
                        }
                        bkVar = bkVar3;
                        if (!x40.G(bkVar)) {
                        }
                        break;
                    case 5:
                        bkVar3 = (bk) this.h;
                        rg0.u(obj);
                        bkVar = bkVar3;
                        if (!x40.G(bkVar)) {
                        }
                        break;
                    case 6:
                        bkVar3 = (bk) this.h;
                        rg0.u(obj);
                        bkVar = bkVar3;
                        if (!x40.G(bkVar)) {
                        }
                        break;
                    default:
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
        }
        return ky0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(qo0 qo0Var, kj kjVar) {
        super(2, kjVar);
        this.i = qo0Var;
    }
}
