package yads;

import android.view.Surface;
import androidx.annotation.DoNotInline;

/* loaded from: classes3.dex */
public abstract class yh3 {
    @DoNotInline
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            gh1.b("VideoFrameReleaseHelper", gh1.a("Failed to call Surface.setFrameRate", e));
        }
    }
}
