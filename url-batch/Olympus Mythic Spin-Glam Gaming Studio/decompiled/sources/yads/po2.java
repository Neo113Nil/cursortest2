package yads;

/* loaded from: classes3.dex */
public final class po2 implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ro2 d;

    public po2(ro2 ro2Var, String str, long j) {
        this.d = ro2Var;
        this.b = str;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.b.a(this.b, this.c);
        ro2 ro2Var = this.d;
        km3 km3Var = ro2Var.b;
        ro2Var.toString();
        km3Var.a();
    }
}
