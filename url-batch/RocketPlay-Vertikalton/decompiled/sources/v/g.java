package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f4293a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4294b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4295c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4296e;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f4293a = Float.NaN;
        this.f4294b = Float.NaN;
        this.f4295c = Float.NaN;
        this.d = Float.NaN;
        this.f4296e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f4407j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f4296e);
                this.f4296e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == 2) {
                this.f4294b = obtainStyledAttributes.getDimension(index, this.f4294b);
            } else if (index == 3) {
                this.f4295c = obtainStyledAttributes.getDimension(index, this.f4295c);
            } else if (index == 4) {
                this.f4293a = obtainStyledAttributes.getDimension(index, this.f4293a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
