package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f4004a;

    /* renamed from: b, reason: collision with root package name */
    public int f4005b;

    /* renamed from: c, reason: collision with root package name */
    public float f4006c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4029g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f4006c = obtainStyledAttributes.getFloat(index, this.f4006c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f4004a);
                this.f4004a = i2;
                this.f4004a = n.d[i2];
            } else if (index == 4) {
                this.f4005b = obtainStyledAttributes.getInt(index, this.f4005b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
