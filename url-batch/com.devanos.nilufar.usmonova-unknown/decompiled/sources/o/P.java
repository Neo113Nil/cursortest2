package o;

/* loaded from: classes.dex */
public final class P {
    public static final P b = new P(new O("Failure occurred while trying to finish a future."));
    public final Throwable a;

    public P(Throwable th) {
        this.a = (Throwable) W.checkNotNull(th);
    }
}
