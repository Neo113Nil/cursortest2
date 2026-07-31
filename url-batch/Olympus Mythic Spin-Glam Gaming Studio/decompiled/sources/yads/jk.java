package yads;

import android.media.AudioTrack;

/* loaded from: classes3.dex */
public final class jk {
    public final ik a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public jk(AudioTrack audioTrack) {
        if (sb3.a >= 19) {
            this.a = new ik(audioTrack);
            a();
        } else {
            this.a = null;
            a(3);
        }
    }

    public final void a() {
        if (this.a != null) {
            a(0);
        }
    }

    public final void a(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
            this.d = 10000L;
            return;
        }
        if (i == 1) {
            this.d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.d = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.d = 500000L;
        }
    }
}
