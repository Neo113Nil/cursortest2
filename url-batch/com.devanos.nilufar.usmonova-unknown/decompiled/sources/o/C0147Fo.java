package o;

/* renamed from: o.Fo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0147Fo implements InterfaceC0895dG {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractActivityC0446Rc b;

    public /* synthetic */ C0147Fo(AbstractActivityC0446Rc abstractActivityC0446Rc, int i) {
        this.a = i;
        this.b = abstractActivityC0446Rc;
    }

    @Override // o.InterfaceC0895dG
    public final void a(AbstractActivityC0446Rc abstractActivityC0446Rc) {
        switch (this.a) {
            case 0:
                C0173Go c0173Go = ((J4) this.b).mFragments.a;
                c0173Go.u.b(c0173Go, c0173Go, null);
                break;
            default:
                AbstractActivityC0446Rc.a(this.b, abstractActivityC0446Rc);
                break;
        }
    }
}
