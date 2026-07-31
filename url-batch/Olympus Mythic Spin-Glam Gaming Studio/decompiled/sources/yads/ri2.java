package yads;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class ri2 {
    public final kr a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    public ri2(Context context) {
        this.a = new kr(context);
    }

    public final Bitmap a(q31 q31Var) {
        Bitmap bitmap;
        String str = q31Var.c;
        Bitmap bitmap2 = (Bitmap) this.b.get(str);
        if (bitmap2 != null) {
            return bitmap2;
        }
        bb3 bb3Var = k92.d.a(this.a.a).c;
        String str2 = q31Var.c;
        Bitmap a = bb3Var.a(str2);
        if (a != null && a.getWidth() == 1 && a.getHeight() == 1) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a, q31Var.a, q31Var.b, false);
            bb3Var.a(str2, createScaledBitmap);
            bitmap = createScaledBitmap;
        } else {
            bitmap = a;
        }
        if (bitmap == null) {
            return null;
        }
        this.b.put(str, bitmap);
        return bitmap;
    }
}
