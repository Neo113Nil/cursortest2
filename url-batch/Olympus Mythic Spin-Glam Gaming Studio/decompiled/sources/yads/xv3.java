package yads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class xv3 extends ContentObserver {
    public final Handler a;
    public final Context b;
    public final AudioManager c;
    public final tu3 d;
    public final lw3 e;
    public final AtomicReference f;
    public final AtomicBoolean g;
    public final ExecutorService h;

    public xv3(Handler handler, Context context, tu3 tu3Var, lw3 lw3Var) {
        super(handler);
        this.f = new AtomicReference(Float.valueOf(-1.0f));
        this.g = new AtomicBoolean(false);
        this.h = Executors.newSingleThreadExecutor();
        this.a = handler;
        this.b = context;
        this.c = (AudioManager) context.getSystemService("audio");
        this.d = tu3Var;
        this.e = lw3Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.g.getAndSet(true)) {
            return;
        }
        this.h.submit(new tv3(this));
    }
}
