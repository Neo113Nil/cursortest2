package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class oj extends BroadcastReceiver implements Runnable {
    public final pj b;
    public final Handler c;
    public final /* synthetic */ qj d;

    public oj(qj qjVar, Handler handler, pj pjVar) {
        this.d = qjVar;
        this.c = handler;
        this.b = pjVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.c.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.c) {
            ((un0) this.b).a.a(-1, 3, false);
        }
    }
}
