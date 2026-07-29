package o;

/* renamed from: o.kJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1357kJ extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ EnumC1423lJ i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1357kJ(EnumC1423lJ enumC1423lJ, int i) {
        super(0);
        this.h = i;
        this.i = enumC1423lJ;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return AbstractC1499mT.j.c(this.i.i);
            default:
                return AbstractC1499mT.j.c(this.i.h);
        }
    }
}
