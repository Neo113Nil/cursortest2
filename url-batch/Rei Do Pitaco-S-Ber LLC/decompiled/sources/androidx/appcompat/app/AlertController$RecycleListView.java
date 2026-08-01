package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import defpackage.kx;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int f;
    public final int g;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kx.t);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
