package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* loaded from: classes6.dex */
public final class hc0 {
    public final jw0 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final zj[] i;

    public hc0(jw0 jw0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, zj[] zjVarArr) {
        this.a = jw0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = zjVarArr;
    }

    public final AudioTrack a(boolean z, nj njVar, int i) {
        try {
            AudioTrack b = b(z, njVar, i);
            int state = b.getState();
            if (state == 1) {
                return b;
            }
            try {
                b.release();
            } catch (Exception unused) {
            }
            throw new dk(state, this.e, this.f, this.h, this.a, this.c == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new dk(0, this.e, this.f, this.h, this.a, this.c == 1, e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final AudioTrack b(boolean z, nj njVar, int i) {
        AudioAttributes audioAttributes;
        AudioAttributes audioAttributes2;
        AudioTrack.Builder offloadedPlayback;
        int i2 = sb3.a;
        int i3 = 0;
        int i4 = 3;
        if (i2 >= 29) {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(this.e).setChannelMask(this.f).setEncoding(this.g).build();
            if (z) {
                audioAttributes2 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                if (njVar.g == null) {
                    njVar.g = new mj(njVar);
                }
                audioAttributes2 = njVar.g.a;
            }
            offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(audioAttributes2).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1);
            return offloadedPlayback.build();
        }
        if (i2 >= 21) {
            if (z) {
                audioAttributes = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                if (njVar.g == null) {
                    njVar.g = new mj(njVar);
                }
                audioAttributes = njVar.g.a;
            }
            return new AudioTrack(audioAttributes, new AudioFormat.Builder().setSampleRate(this.e).setChannelMask(this.f).setEncoding(this.g).build(), this.h, 1, i);
        }
        int i5 = njVar.d;
        if (i5 != 13) {
            switch (i5) {
                case 2:
                    i4 = i3;
                    break;
                case 3:
                    i3 = 8;
                    i4 = i3;
                    break;
                case 4:
                    i3 = 4;
                    i4 = i3;
                    break;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    i3 = 5;
                    i4 = i3;
                    break;
                case 6:
                    i3 = 2;
                    i4 = i3;
                    break;
            }
        } else {
            i4 = 1;
        }
        return i == 0 ? new AudioTrack(i4, this.e, this.f, this.g, this.h, 1) : new AudioTrack(i4, this.e, this.f, this.g, this.h, 1, i);
    }
}
