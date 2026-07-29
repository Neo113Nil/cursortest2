package o;

/* loaded from: classes.dex */
public final class V {
    public static final V c = new V();
    public volatile Thread a;
    public volatile V b;

    public V() {
        W.ATOMIC_HELPER.e(this, Thread.currentThread());
    }
}
