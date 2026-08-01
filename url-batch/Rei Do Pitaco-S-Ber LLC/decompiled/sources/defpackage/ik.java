package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ik implements LayoutInflater.Factory2 {
    public final sk f;

    public ik(sk skVar) {
        this.f = skVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        a f;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        sk skVar = this.f;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, skVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hx.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = dk.class.isAssignableFrom(nk.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    dk A = resourceId != -1 ? skVar.A(resourceId) : null;
                    if (A == null && string != null) {
                        A = skVar.B(string);
                    }
                    if (A == null && id != -1) {
                        A = skVar.A(id);
                    }
                    if (A == null) {
                        nk D = skVar.D();
                        context.getClassLoader();
                        A = D.a(attributeValue);
                        A.r = true;
                        A.A = resourceId != 0 ? resourceId : id;
                        A.B = id;
                        A.C = string;
                        A.s = true;
                        A.w = skVar;
                        fk fkVar = skVar.t;
                        A.x = fkVar;
                        b3 b3Var = fkVar.v;
                        A.H = true;
                        if ((fkVar == null ? null : fkVar.u) != null) {
                            A.H = true;
                        }
                        f = skVar.a(A);
                        if (sk.G(2)) {
                            Log.v("FragmentManager", "Fragment " + A + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (A.s) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        A.s = true;
                        A.w = skVar;
                        fk fkVar2 = skVar.t;
                        A.x = fkVar2;
                        b3 b3Var2 = fkVar2.v;
                        A.H = true;
                        if ((fkVar2 == null ? null : fkVar2.u) != null) {
                            A.H = true;
                        }
                        f = skVar.f(A);
                        if (sk.G(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + A + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    yk ykVar = zk.a;
                    zk.b(new wk(A, "Attempting to use <fragment> tag to add fragment " + A + " to container " + viewGroup));
                    zk.a(A).getClass();
                    A.I = viewGroup;
                    f.k();
                    f.j();
                    View view2 = A.J;
                    if (view2 == null) {
                        l8.h(attributeValue, " did not create a view.", "Fragment ");
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (A.J.getTag() == null) {
                        A.J.setTag(string);
                    }
                    A.J.addOnAttachStateChangeListener(new hk(this, f));
                    return A.J;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
