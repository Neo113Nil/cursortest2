package O0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import j.C0150c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f615a = {R.attr.theme, com.fortuneodd.shadegrid.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f616b = {com.fortuneodd.shadegrid.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f616b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z2 = (context instanceof C0150c) && ((C0150c) context).f2553a == resourceId;
        if (resourceId == 0 || z2) {
            return context;
        }
        C0150c c0150c = new C0150c(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f615a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0150c.getTheme().applyStyle(resourceId2, true);
        }
        return c0150c;
    }
}
