package o;

/* renamed from: o.md, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1509md {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1509md(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                C1575nd c1575nd = (C1575nd) this.b;
                c1575nd.x--;
                break;
            default:
                CS cs = (CS) this.b;
                cs.j--;
                break;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((C1575nd) this.b).x++;
                break;
            default:
                ((CS) this.b).j++;
                break;
        }
    }
}
