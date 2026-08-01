package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class kr implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ MaterialButton g;
    public final /* synthetic */ Drawable h;

    public /* synthetic */ kr(MaterialButton materialButton, Drawable drawable, int i) {
        this.f = i;
        this.g = materialButton;
        this.h = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Drawable drawable = this.h;
        MaterialButton materialButton = this.g;
        switch (i) {
            case 0:
                int[] iArr = MaterialButton.S;
                materialButton.setIcon(drawable);
                break;
            default:
                int[] iArr2 = MaterialButton.S;
                materialButton.setIcon(drawable);
                break;
        }
    }
}
