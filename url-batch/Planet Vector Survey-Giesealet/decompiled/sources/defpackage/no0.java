package defpackage;

import androidx.compose.foundation.gestures.a;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class no0 extends fu0 implements qu {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ qo0 f;
    public /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no0(qo0 qo0Var, long j, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.f = qo0Var;
        this.g = j;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        switch (this.d) {
            case 0:
                return new no0(this.f, this.g, kjVar, 0);
            case 1:
                return new no0(this.f, this.g, kjVar, 1);
            case 2:
                return new no0(this.f, this.g, kjVar, 2);
            default:
                no0 no0Var = new no0(this.f, kjVar);
                no0Var.g = ((ra0) obj).a;
                return no0Var;
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        switch (i) {
            case 0:
                return ((no0) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 1:
                return ((no0) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            case 2:
                return ((no0) create((bk) obj, (kj) obj2)).invokeSuspend(ky0Var);
            default:
                long j = ((ra0) obj).a;
                no0 no0Var = new no0(this.f, (kj) obj2);
                no0Var.g = j;
                return no0Var.invokeSuspend(ky0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c0, code lost:
    
        if (r10 == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c3, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d4, code lost:
    
        if (r10 != r5) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d2, code lost:
    
        if (r10 == r5) goto L52;
     */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object invokeSuspend;
        int i = this.d;
        ky0 ky0Var = ky0.a;
        qo0 qo0Var = this.f;
        ck ckVar = ck.d;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 == 0) {
                    rg0.u(obj);
                    zo0 zo0Var = qo0Var.F;
                    long j = this.g;
                    this.e = 1;
                    long a = zo0Var.d == sc0.e ? mz0.a(j, 0.0f, 0.0f, 1) : mz0.a(j, 0.0f, 0.0f, 2);
                    yo0 yo0Var = new yo0(zo0Var, null);
                    bd0 bd0Var = zo0Var.b;
                    if (bd0Var != null && (zo0Var.a.d() || zo0Var.a.a())) {
                        invokeSuspend = bd0Var.j(a, yo0Var, this);
                        break;
                    } else {
                        yo0 yo0Var2 = new yo0(yo0Var.g, this);
                        yo0Var2.f = a;
                        invokeSuspend = yo0Var2.invokeSuspend(ky0Var);
                        break;
                    }
                } else if (i2 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                    break;
                }
                break;
            case 1:
                int i3 = this.e;
                if (i3 == 0) {
                    rg0.u(obj);
                    zo0 zo0Var2 = qo0Var.F;
                    oo0 oo0Var = new oo0(this.g, null, 0);
                    this.e = 1;
                    if (zo0Var2.e(2, oo0Var, this) == ckVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                    break;
                }
                break;
            case 2:
                int i4 = this.e;
                if (i4 == 0) {
                    rg0.u(obj);
                    zo0 zo0Var3 = qo0Var.F;
                    oo0 oo0Var2 = new oo0(this.g, null, 1);
                    this.e = 1;
                    if (zo0Var3.e(2, oo0Var2, this) == ckVar) {
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
            default:
                int i5 = this.e;
                if (i5 == 0) {
                    rg0.u(obj);
                    long j2 = this.g;
                    zo0 zo0Var4 = qo0Var.F;
                    this.e = 1;
                    Object a2 = a.a(zo0Var4, j2, this);
                    if (a2 == ckVar) {
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
        }
        return ckVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no0(qo0 qo0Var, kj kjVar) {
        super(2, kjVar);
        this.d = 3;
        this.f = qo0Var;
    }
}
