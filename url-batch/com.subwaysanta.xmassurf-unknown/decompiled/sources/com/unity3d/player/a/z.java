package com.unity3d.player.a;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class z implements Runnable {
    public final /* synthetic */ A a;

    public z(A a) {
        this.a = a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(ViewCompat.MEASURED_STATE_MASK), new BitmapDrawable(this.a.b.getResources(), this.a.b.a)}));
    }
}
