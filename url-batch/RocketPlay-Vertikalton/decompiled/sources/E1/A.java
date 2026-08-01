package E1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final int f281a;

    /* renamed from: b, reason: collision with root package name */
    public final int f282b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f283c;

    public A(Context context, XmlResourceParser xmlResourceParser) {
        this.f283c = new ArrayList();
        this.f282b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), v.r.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f281a = obtainStyledAttributes.getResourceId(index, this.f281a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f282b);
                this.f282b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new v.n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public A() {
        this.f283c = new A[256];
        this.f281a = 0;
        this.f282b = 0;
    }

    public A(int i, int i2) {
        this.f283c = null;
        this.f281a = i;
        int i3 = i2 & 7;
        this.f282b = i3 == 0 ? 8 : i3;
    }
}
