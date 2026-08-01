package q0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import o.k;

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289b {

    /* renamed from: a, reason: collision with root package name */
    public final k f3553a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f3554b = new k();

    public static C0289b a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e2);
            return null;
        }
    }

    public static C0289b b(ArrayList arrayList) {
        C0289b c0289b = new C0289b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0289b.f3554b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0288a.f3551b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0288a.f3552c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0288a.d;
            }
            C0290c c0290c = new C0290c();
            c0290c.d = 0;
            c0290c.f3558e = 1;
            c0290c.f3555a = startDelay;
            c0290c.f3556b = duration;
            c0290c.f3557c = interpolator;
            c0290c.d = objectAnimator.getRepeatCount();
            c0290c.f3558e = objectAnimator.getRepeatMode();
            c0289b.f3553a.put(propertyName, c0290c);
        }
        return c0289b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0289b) {
            return this.f3553a.equals(((C0289b) obj).f3553a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3553a.hashCode();
    }

    public final String toString() {
        return "\n" + C0289b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3553a + "}\n";
    }
}
