package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: o.Lo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0303Lo implements LayoutInflater.Factory2 {
    public final AbstractC0588Wo h;

    public LayoutInflaterFactory2C0303Lo(AbstractC0588Wo abstractC0588Wo) {
        this.h = abstractC0588Wo;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co;
        C0995ep g;
        boolean equals = C0251Jo.class.getName().equals(str);
        AbstractC0588Wo abstractC0588Wo = this.h;
        if (equals) {
            return new C0251Jo(context, attributeSet, abstractC0588Wo);
        }
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1820rL.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = AbstractComponentCallbacksC0069Co.class.isAssignableFrom(C0432Qo.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0069Co C = resourceId != -1 ? abstractC0588Wo.C(resourceId) : null;
                    if (C == null && string != null) {
                        C1334k c1334k = abstractC0588Wo.c;
                        ArrayList arrayList = (ArrayList) c1334k.j;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                abstractComponentCallbacksC0069Co = abstractComponentCallbacksC0069Co2;
                                Iterator it = ((HashMap) c1334k.i).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        C = abstractComponentCallbacksC0069Co;
                                        break;
                                    }
                                    C0995ep c0995ep = (C0995ep) it.next();
                                    if (c0995ep != null) {
                                        C = c0995ep.c;
                                        if (string.equals(C.F)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co3 = (AbstractComponentCallbacksC0069Co) arrayList.get(size);
                                abstractComponentCallbacksC0069Co = abstractComponentCallbacksC0069Co2;
                                if (abstractComponentCallbacksC0069Co3 != null && string.equals(abstractComponentCallbacksC0069Co3.F)) {
                                    C = abstractComponentCallbacksC0069Co3;
                                    break;
                                }
                                size--;
                                abstractComponentCallbacksC0069Co2 = abstractComponentCallbacksC0069Co;
                            }
                        }
                    } else {
                        abstractComponentCallbacksC0069Co = null;
                    }
                    if (C == null && id != -1) {
                        C = abstractC0588Wo.C(id);
                    }
                    if (C == null) {
                        C0432Qo G = abstractC0588Wo.G();
                        context.getClassLoader();
                        C = G.a(attributeValue);
                        C.u = true;
                        C.D = resourceId != 0 ? resourceId : id;
                        C.E = id;
                        C.F = string;
                        C.v = true;
                        C.z = abstractC0588Wo;
                        C0173Go c0173Go = abstractC0588Wo.v;
                        C.A = c0173Go;
                        J4 j4 = c0173Go.s;
                        C.K = true;
                        if ((c0173Go == null ? abstractComponentCallbacksC0069Co : c0173Go.r) != null) {
                            C.K = true;
                        }
                        g = abstractC0588Wo.a(C);
                        if (AbstractC0588Wo.J(2)) {
                            Log.v("FragmentManager", "Fragment " + C + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (C.v) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        C.v = true;
                        C.z = abstractC0588Wo;
                        C0173Go c0173Go2 = abstractC0588Wo.v;
                        C.A = c0173Go2;
                        J4 j42 = c0173Go2.s;
                        C.K = true;
                        if ((c0173Go2 == null ? abstractComponentCallbacksC0069Co : c0173Go2.r) != null) {
                            C.K = true;
                        }
                        g = abstractC0588Wo.g(C);
                        if (AbstractC0588Wo.J(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + C + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C1127gp c1127gp = AbstractC1193hp.a;
                    AbstractC1193hp.b(new C0864cp(C, "Attempting to use <fragment> tag to add fragment " + C + " to container " + viewGroup));
                    AbstractC1193hp.a(C).getClass();
                    C.L = viewGroup;
                    g.j();
                    g.i();
                    throw new IllegalStateException(AbstractC1888sN.k("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
