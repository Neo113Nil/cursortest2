package yads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import androidx.media3.exoplayer.AudioFocusManager$$ExternalSyntheticApiModelOutline6;
import androidx.media3.exoplayer.AudioFocusManager$$ExternalSyntheticApiModelOutline8;

/* loaded from: classes4.dex */
public final class wj {
    public final AudioManager a;
    public final uj b;
    public vj c;
    public int d;
    public int e;
    public float f = 1.0f;

    public wj(Context context, Handler handler, vj vjVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.a = audioManager;
        this.c = vjVar;
        this.b = new uj(this, handler);
        this.d = 0;
    }

    public final int a(boolean z, int i) {
        if (i == 1 || this.e != 1) {
            a();
            return z ? 1 : -1;
        }
        if (!z) {
            return -1;
        }
        if (this.d == 1) {
            return 1;
        }
        if (sb3.a < 26) {
            throw null;
        }
        AudioFocusManager$$ExternalSyntheticApiModelOutline8.m();
        AudioFocusManager$$ExternalSyntheticApiModelOutline6.m(this.e);
        throw null;
    }

    public final void b(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.f == f) {
            return;
        }
        this.f = f;
        vj vjVar = this.c;
        if (vjVar != null) {
            xn0 xn0Var = ((un0) vjVar).a;
            xn0Var.a(1, 2, Float.valueOf(xn0Var.V * xn0Var.w.f));
        }
    }

    public final void a() {
        if (this.d == 0) {
            return;
        }
        if (sb3.a < 26) {
            this.a.abandonAudioFocus(this.b);
        }
        b(0);
    }

    public final void a(int i) {
        vj vjVar = this.c;
        if (vjVar != null) {
            un0 un0Var = (un0) vjVar;
            xn0 xn0Var = un0Var.a;
            xn0Var.q();
            boolean z = xn0Var.b0.l;
            xn0 xn0Var2 = un0Var.a;
            int i2 = 1;
            if (z && i != 1) {
                i2 = 2;
            }
            xn0Var2.a(i, i2, z);
        }
    }
}
