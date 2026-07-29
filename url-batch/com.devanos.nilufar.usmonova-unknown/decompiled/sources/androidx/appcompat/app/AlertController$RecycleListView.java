package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import o.AbstractC1886sL;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int h;
    public final int i;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1886sL.t);
        this.i = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.h = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
