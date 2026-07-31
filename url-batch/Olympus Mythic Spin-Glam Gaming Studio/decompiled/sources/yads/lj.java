package yads;

import android.media.AudioAttributes;
import androidx.annotation.DoNotInline;

/* loaded from: classes3.dex */
public abstract class lj {
    @DoNotInline
    public static void a(AudioAttributes.Builder builder, int i) {
        builder.setSpatializationBehavior(i);
    }
}
