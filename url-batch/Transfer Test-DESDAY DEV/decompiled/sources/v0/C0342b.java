package v0;

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

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342b {

    /* renamed from: a, reason: collision with root package name */
    public final k f4040a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f4041b = new k();

    public static C0342b a(Context context, int i) {
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

    public static C0342b b(ArrayList arrayList) {
        C0342b c0342b = new C0342b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0342b.f4041b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0341a.f4038b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0341a.f4039c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0341a.d;
            }
            C0343c c0343c = new C0343c();
            c0343c.d = 0;
            c0343c.f4045e = 1;
            c0343c.f4042a = startDelay;
            c0343c.f4043b = duration;
            c0343c.f4044c = interpolator;
            c0343c.d = objectAnimator.getRepeatCount();
            c0343c.f4045e = objectAnimator.getRepeatMode();
            c0342b.f4040a.put(propertyName, c0343c);
        }
        return c0342b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0342b) {
            return this.f4040a.equals(((C0342b) obj).f4040a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4040a.hashCode();
    }

    public final String toString() {
        return "\n" + C0342b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4040a + "}\n";
    }
}
