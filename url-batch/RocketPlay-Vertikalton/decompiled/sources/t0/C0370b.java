package t0;

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

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370b {

    /* renamed from: a, reason: collision with root package name */
    public final k f4165a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f4166b = new k();

    public static C0370b a(Context context, int i) {
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

    public static C0370b b(ArrayList arrayList) {
        C0370b c0370b = new C0370b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0370b.f4166b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0369a.f4163b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0369a.f4164c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0369a.d;
            }
            C0371c c0371c = new C0371c();
            c0371c.d = 0;
            c0371c.f4170e = 1;
            c0371c.f4167a = startDelay;
            c0371c.f4168b = duration;
            c0371c.f4169c = interpolator;
            c0371c.d = objectAnimator.getRepeatCount();
            c0371c.f4170e = objectAnimator.getRepeatMode();
            c0370b.f4165a.put(propertyName, c0371c);
        }
        return c0370b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0370b) {
            return this.f4165a.equals(((C0370b) obj).f4165a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4165a.hashCode();
    }

    public final String toString() {
        return "\n" + C0370b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4165a + "}\n";
    }
}
