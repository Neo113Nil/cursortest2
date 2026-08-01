package Y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final I f1157a;

    public x(I i) {
        this.f1157a = i;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        O f2;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        I i = this.f1157a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, i);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.a.f928a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z2 = AbstractComponentCallbacksC0049q.class.isAssignableFrom(C.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z2 = false;
            }
            if (z2) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0049q A2 = resourceId != -1 ? i.A(resourceId) : null;
                if (A2 == null && string != null) {
                    U.v vVar = i.f963c;
                    ArrayList arrayList = (ArrayList) vVar.f849a;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = (AbstractComponentCallbacksC0049q) arrayList.get(size);
                            if (abstractComponentCallbacksC0049q != null && string.equals(abstractComponentCallbacksC0049q.f1138x)) {
                                A2 = abstractComponentCallbacksC0049q;
                                break;
                            }
                            size--;
                        } else {
                            Iterator it = ((HashMap) vVar.f850b).values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    A2 = null;
                                    break;
                                }
                                O o2 = (O) it.next();
                                if (o2 != null) {
                                    A2 = o2.f1008c;
                                    if (string.equals(A2.f1138x)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (A2 == null && id != -1) {
                    A2 = i.A(id);
                }
                if (A2 == null) {
                    C C2 = i.C();
                    context.getClassLoader();
                    A2 = C2.a(attributeValue);
                    A2.f1127m = true;
                    A2.f1136v = resourceId != 0 ? resourceId : id;
                    A2.f1137w = id;
                    A2.f1138x = string;
                    A2.f1128n = true;
                    A2.f1132r = i;
                    C0052u c0052u = i.f977t;
                    A2.f1133s = c0052u;
                    FragmentActivity fragmentActivity = c0052u.f1148b;
                    A2.f1103C = true;
                    if ((c0052u == null ? null : c0052u.f1147a) != null) {
                        A2.f1103C = true;
                    }
                    f2 = i.a(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + A2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (A2.f1128n) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    A2.f1128n = true;
                    A2.f1132r = i;
                    C0052u c0052u2 = i.f977t;
                    A2.f1133s = c0052u2;
                    FragmentActivity fragmentActivity2 = c0052u2.f1148b;
                    A2.f1103C = true;
                    if ((c0052u2 == null ? null : c0052u2.f1147a) != null) {
                        A2.f1103C = true;
                    }
                    f2 = i.f(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + A2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                Z.c cVar = Z.d.f1173a;
                Z.d.b(new Z.a(A2, "Attempting to use <fragment> tag to add fragment " + A2 + " to container " + viewGroup));
                Z.d.a(A2).getClass();
                A2.f1104D = viewGroup;
                f2.k();
                f2.j();
                View view2 = A2.f1105E;
                if (view2 == null) {
                    throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (A2.f1105E.getTag() == null) {
                    A2.f1105E.setTag(string);
                }
                A2.f1105E.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0054w(this, f2));
                return A2.f1105E;
            }
        }
        return null;
    }
}
