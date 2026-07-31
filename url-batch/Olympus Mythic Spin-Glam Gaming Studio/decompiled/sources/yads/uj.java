package yads;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes4.dex */
public final class uj implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final /* synthetic */ wj b;

    public uj(wj wjVar, Handler handler) {
        this.b = wjVar;
        this.a = handler;
    }

    public final void a(int i) {
        wj wjVar = this.b;
        if (i == -3 || i == -2) {
            if (i != -2) {
                wjVar.getClass();
                wjVar.b(3);
                return;
            } else {
                wjVar.a(0);
                wjVar.b(2);
                return;
            }
        }
        if (i == -1) {
            wjVar.a(-1);
            wjVar.a();
        } else if (i == 1) {
            wjVar.b(1);
            wjVar.a(1);
        } else {
            wjVar.getClass();
            gh1.d("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.a.post(new Runnable() { // from class: yads.uj$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                uj.this.a(i);
            }
        });
    }
}
