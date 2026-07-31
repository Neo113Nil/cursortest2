package yads;

import android.media.MediaFormat;

/* loaded from: classes5.dex */
public abstract class kl1 {
    public static void a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
