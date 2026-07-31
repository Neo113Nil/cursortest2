package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class s31 {
    public static boolean a(q31 q31Var, Map map) {
        Bitmap bitmap = (Bitmap) map.get(q31Var.c);
        return (bitmap != null && bitmap.getWidth() > 1 && bitmap.getHeight() > 1) || !q31Var.f;
    }
}
