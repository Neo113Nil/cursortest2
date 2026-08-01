package Y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import g.AbstractActivityC0129i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final I f1538a;

    public x(I i) {
        this.f1538a = i;
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
        I i = this.f1538a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, i);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.a.f1287a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z2 = AbstractComponentCallbacksC0055q.class.isAssignableFrom(C.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z2 = false;
            }
            if (z2) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0055q A2 = resourceId != -1 ? i.A(resourceId) : null;
                if (A2 == null && string != null) {
                    U.v vVar = i.f1344c;
                    ArrayList arrayList = (ArrayList) vVar.f1207a;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = (AbstractComponentCallbacksC0055q) arrayList.get(size);
                            if (abstractComponentCallbacksC0055q != null && string.equals(abstractComponentCallbacksC0055q.f1519x)) {
                                A2 = abstractComponentCallbacksC0055q;
                                break;
                            }
                            size--;
                        } else {
                            Iterator it = ((HashMap) vVar.f1208b).values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    A2 = null;
                                    break;
                                }
                                O o2 = (O) it.next();
                                if (o2 != null) {
                                    A2 = o2.f1389c;
                                    if (string.equals(A2.f1519x)) {
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
                    A2.f1508m = true;
                    A2.f1517v = resourceId != 0 ? resourceId : id;
                    A2.f1518w = id;
                    A2.f1519x = string;
                    A2.f1509n = true;
                    A2.f1513r = i;
                    C0058u c0058u = i.f1358t;
                    A2.f1514s = c0058u;
                    AbstractActivityC0129i abstractActivityC0129i = c0058u.f1529b;
                    A2.f1484C = true;
                    if ((c0058u == null ? null : c0058u.f1528a) != null) {
                        A2.f1484C = true;
                    }
                    f2 = i.a(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + A2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (A2.f1509n) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    A2.f1509n = true;
                    A2.f1513r = i;
                    C0058u c0058u2 = i.f1358t;
                    A2.f1514s = c0058u2;
                    AbstractActivityC0129i abstractActivityC0129i2 = c0058u2.f1529b;
                    A2.f1484C = true;
                    if ((c0058u2 == null ? null : c0058u2.f1528a) != null) {
                        A2.f1484C = true;
                    }
                    f2 = i.f(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + A2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                Z.c cVar = Z.d.f1551a;
                Z.d.b(new Z.a(A2, "Attempting to use <fragment> tag to add fragment " + A2 + " to container " + viewGroup));
                Z.d.a(A2).getClass();
                A2.f1485D = viewGroup;
                f2.k();
                f2.j();
                View view2 = A2.f1486E;
                if (view2 == null) {
                    throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (A2.f1486E.getTag() == null) {
                    A2.f1486E.setTag(string);
                }
                A2.f1486E.addOnAttachStateChangeListener(new w(this, f2));
                return A2.f1486E;
            }
        }
        return null;
    }
}
