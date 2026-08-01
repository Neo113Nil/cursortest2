package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: v.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326g {

    /* renamed from: a, reason: collision with root package name */
    public final float f3922a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3923b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3924c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3925e;

    public C0326g(Context context, XmlResourceParser xmlResourceParser) {
        this.f3922a = Float.NaN;
        this.f3923b = Float.NaN;
        this.f3924c = Float.NaN;
        this.d = Float.NaN;
        this.f3925e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f4036j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f3925e);
                this.f3925e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == 2) {
                this.f3923b = obtainStyledAttributes.getDimension(index, this.f3923b);
            } else if (index == 3) {
                this.f3924c = obtainStyledAttributes.getDimension(index, this.f3924c);
            } else if (index == 4) {
                this.f3922a = obtainStyledAttributes.getDimension(index, this.f3922a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
