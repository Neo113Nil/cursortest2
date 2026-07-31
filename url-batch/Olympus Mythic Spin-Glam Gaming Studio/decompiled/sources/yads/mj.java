package yads;

import android.media.AudioAttributes;

/* loaded from: classes3.dex */
public final class mj {
    public final AudioAttributes a;

    public mj(nj njVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(njVar.b).setFlags(njVar.c).setUsage(njVar.d);
        int i = sb3.a;
        if (i >= 29) {
            kj.a(usage, njVar.e);
        }
        if (i >= 32) {
            lj.a(usage, njVar.f);
        }
        this.a = usage.build();
    }
}
