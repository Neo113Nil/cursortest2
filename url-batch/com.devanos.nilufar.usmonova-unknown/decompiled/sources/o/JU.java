package o;

/* loaded from: classes.dex */
public final class JU {
    public final YY a;
    public final C0208Hx b;
    public final Number c;
    public final Number d;
    public final V3 e;
    public final V3 f;
    public final V3 g;
    public long h;

    /* JADX WARN: Type inference failed for: r1v3, types: [o.ny, o.vp] */
    public JU(U3 u3, C0208Hx c0208Hx, Number number, Number number2) {
        this.a = u3.a(c0208Hx);
        this.b = c0208Hx;
        this.c = number2;
        this.d = number;
        ?? r1 = (AbstractC1596ny) c0208Hx.i;
        this.e = (V3) r1.invoke(number);
        this.f = (V3) r1.invoke(number2);
        this.g = ((V3) r1.invoke(number)).c();
        this.h = -1L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TargetBasedAnimation: ");
        sb.append(this.d);
        sb.append(" -> ");
        sb.append(this.c);
        sb.append(",initial velocity: ");
        V3 v3 = this.g;
        sb.append(v3);
        sb.append(", duration: ");
        long j = this.h;
        YY yy = this.a;
        if (j < 0) {
            this.h = yy.a(this.e, this.f, v3);
        }
        sb.append(this.h / 1000000);
        sb.append(" ms,animationSpec: ");
        sb.append(yy);
        return sb.toString();
    }
}
