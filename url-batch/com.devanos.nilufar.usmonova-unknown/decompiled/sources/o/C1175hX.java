package o;

/* renamed from: o.hX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1175hX extends AbstractC0485Sp implements InterfaceC2312yp {
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1175hX(int i, int i2, Object obj) {
        super(i, obj);
        this.j = i2;
    }

    @Override // o.AbstractC2336z9, o.InterfaceC0387Ov
    public final String getName() {
        switch (this.j) {
            case 0:
                return "isStrictSupertype";
            default:
                return "equalTypes";
        }
    }

    @Override // o.AbstractC2336z9
    public final InterfaceC1134gw getOwner() {
        switch (this.j) {
            case 0:
                return UM.a.b(C1241iX.class);
            default:
                return UM.a.b(AE.class);
        }
    }

    @Override // o.AbstractC2336z9
    public final String getSignature() {
        switch (this.j) {
            case 0:
                return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
            default:
                return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                AbstractC1004ey abstractC1004ey = (AbstractC1004ey) obj;
                AbstractC1004ey abstractC1004ey2 = (AbstractC1004ey) obj2;
                AbstractC0048Bt.n(abstractC1004ey, "p0");
                AbstractC0048Bt.n(abstractC1004ey2, "p1");
                ((C1241iX) this.receiver).getClass();
                InterfaceC2341zE.b.getClass();
                AE ae = C2275yE.b;
                return Boolean.valueOf(ae.b(abstractC1004ey, abstractC1004ey2) && !ae.b(abstractC1004ey2, abstractC1004ey));
            default:
                AbstractC1004ey abstractC1004ey3 = (AbstractC1004ey) obj;
                AbstractC1004ey abstractC1004ey4 = (AbstractC1004ey) obj2;
                AbstractC0048Bt.n(abstractC1004ey3, "p0");
                AbstractC0048Bt.n(abstractC1004ey4, "p1");
                return Boolean.valueOf(((AE) this.receiver).a(abstractC1004ey3, abstractC1004ey4));
        }
    }
}
