package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class w0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public w0(x80 x80Var, View view) {
        this.a = 7;
        this.b = x80Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.o = false;
                break;
            case 5:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                focusRingDrawable.p = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            case 7:
                ((x80) obj).b();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.o = false;
                break;
            case 1:
                u2 u2Var = (u2) obj;
                ArrayList arrayList = new ArrayList(u2Var.j);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((bs) arrayList.get(i2)).b.t;
                    if (colorStateList != null) {
                        u2Var.setTintList(colorStateList);
                    }
                }
                break;
            case 2:
                hg hgVar = (hg) obj;
                hgVar.p();
                hgVar.r.start();
                break;
            case 3:
                ((ExpandableTransformationBehavior) obj).b = null;
                break;
            case 4:
                aj ajVar = (aj) obj;
                ajVar.r = 0;
                ajVar.m = null;
                break;
            case 5:
            default:
                super.onAnimationEnd(animator);
                break;
            case 6:
                ((z50) obj).m();
                animator.removeListener(this);
                break;
            case 7:
                ((x80) obj).a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                u2 u2Var = (u2) obj;
                ArrayList arrayList = new ArrayList(u2Var.j);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ds dsVar = ((bs) arrayList.get(i2)).b;
                    ColorStateList colorStateList = dsVar.t;
                    if (colorStateList != null) {
                        u2Var.setTint(colorStateList.getColorForState(dsVar.x, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 4:
                aj ajVar = (aj) obj;
                ajVar.s.a(0, false);
                ajVar.r = 2;
                ajVar.m = animator;
                break;
            case 7:
                ((x80) obj).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ w0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
