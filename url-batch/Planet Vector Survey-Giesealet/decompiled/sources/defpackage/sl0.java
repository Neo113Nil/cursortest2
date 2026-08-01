package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class sl0 {
    public static final boolean a = nz.l(Build.DEVICE, "layoutlib");

    public static final kl0 a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof kl0) {
                return (kl0) childAt;
            }
        }
        kl0 kl0Var = new kl0(viewGroup.getContext());
        viewGroup.addView(kl0Var);
        return kl0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup b(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                g8.o("Couldn't find a valid parent for ", view, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                return null;
            }
            view = parent;
        }
        return (ViewGroup) view;
    }
}
