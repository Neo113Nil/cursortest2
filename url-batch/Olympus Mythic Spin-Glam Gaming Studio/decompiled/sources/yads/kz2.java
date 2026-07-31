package yads;

import android.os.ConditionVariable;

/* loaded from: classes4.dex */
public final class kz2 extends Thread {
    public final /* synthetic */ ConditionVariable b;
    public final /* synthetic */ lz2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz2(lz2 lz2Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.c = lz2Var;
        this.b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            this.b.open();
            this.c.b();
            this.c.b.getClass();
        }
    }
}
