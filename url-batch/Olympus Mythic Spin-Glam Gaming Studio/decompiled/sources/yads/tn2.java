package yads;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public final class tn2 {
    public static void a(q72 q72Var, wn2 wn2Var, Bitmap bitmap) {
        wn2Var.setAlpha(0.0f);
        wn2Var.animate().alpha(1.0f).setDuration(700L).withStartAction(new sn2(wn2Var, bitmap)).withEndAction(new rn2(q72Var, wn2Var)).start();
    }
}
