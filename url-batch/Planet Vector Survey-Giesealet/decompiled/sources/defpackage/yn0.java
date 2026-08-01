package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class yn0 extends l implements dk {
    public final kj g;

    public yn0(kj kjVar, rj rjVar) {
        super(rjVar, true);
        this.g = kjVar;
    }

    @Override // defpackage.g00
    public final boolean O() {
        return true;
    }

    @Override // defpackage.dk
    public final dk getCallerFrame() {
        kj kjVar = this.g;
        if (kjVar instanceof dk) {
            return (dk) kjVar;
        }
        return null;
    }

    @Override // defpackage.g00
    public void w(Object obj) {
        d31.G(d31.B(this.g), nz.X(obj));
    }

    @Override // defpackage.g00
    public void x(Object obj) {
        this.g.resumeWith(nz.X(obj));
    }
}
