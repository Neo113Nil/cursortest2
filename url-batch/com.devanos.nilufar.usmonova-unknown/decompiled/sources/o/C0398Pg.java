package o;

import android.animation.AnimatorSet;

/* renamed from: o.Pg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398Pg {
    public static final C0398Pg a = new C0398Pg();

    public final void a(AnimatorSet animatorSet) {
        AbstractC0048Bt.n(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j) {
        AbstractC0048Bt.n(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j);
    }
}
