package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import f.a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f1107a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1108b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1944t);
        this.f1108b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1107a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
