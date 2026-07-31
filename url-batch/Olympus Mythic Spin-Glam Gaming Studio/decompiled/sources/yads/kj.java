package yads;

import android.media.AudioAttributes;
import androidx.annotation.DoNotInline;

/* loaded from: classes4.dex */
public abstract class kj {
    @DoNotInline
    public static void a(AudioAttributes.Builder builder, int i) {
        builder.setAllowedCapturePolicy(i);
    }
}
