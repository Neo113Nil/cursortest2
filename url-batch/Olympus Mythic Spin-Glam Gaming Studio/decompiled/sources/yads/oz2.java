package yads;

/* loaded from: classes5.dex */
public final class oz2 extends Thread {
    public final /* synthetic */ uz2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz2(uz2 uz2Var) {
        super("ExoPlayer:SimpleDecoder");
        this.b = uz2Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.b.c());
    }
}
