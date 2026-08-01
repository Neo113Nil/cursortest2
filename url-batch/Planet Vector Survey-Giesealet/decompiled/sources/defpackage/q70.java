package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class q70 extends fu0 implements qu {
    public u70 d;
    public Object e;
    public il f;
    public r70 g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ int j;
    public final /* synthetic */ r70 k;
    public final /* synthetic */ u6 l;
    public final /* synthetic */ il m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q70(int i, r70 r70Var, u6 u6Var, il ilVar, kj kjVar) {
        super(2, kjVar);
        this.j = i;
        this.k = r70Var;
        this.l = u6Var;
        this.m = ilVar;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        q70 q70Var = new q70(this.j, this.k, this.l, this.m, kjVar);
        q70Var.i = obj;
        return q70Var;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((q70) create((bk) obj, (kj) obj2)).invokeSuspend(ky0.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.h9
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q70.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
