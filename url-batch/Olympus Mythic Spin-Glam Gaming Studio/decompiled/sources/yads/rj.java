package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.annotation.DoNotInline;

/* loaded from: classes4.dex */
public abstract class rj {
    public static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    @DoNotInline
    public static int[] a() {
        boolean isDirectPlaybackSupported;
        i41 i41Var = l41.c;
        h41 h41Var = new h41();
        zm2 zm2Var = sj.e;
        xm2 xm2Var = zm2Var.c;
        if (xm2Var == null) {
            xm2 xm2Var2 = new xm2(zm2Var, new ym2(zm2Var.f, 0, zm2Var.g));
            zm2Var.c = xm2Var2;
            xm2Var = xm2Var2;
        }
        wa3 it = xm2Var.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), a);
            if (isDirectPlaybackSupported) {
                h41Var.a(num);
            }
        }
        h41Var.a((Object) 2);
        return nc1.a(h41Var.a());
    }

    @DoNotInline
    public static int a(int i, int i2) {
        boolean isDirectPlaybackSupported;
        for (int i3 = 8; i3 > 0; i3--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(sb3.a(i3)).build(), a);
            if (isDirectPlaybackSupported) {
                return i3;
            }
        }
        return 0;
    }
}
