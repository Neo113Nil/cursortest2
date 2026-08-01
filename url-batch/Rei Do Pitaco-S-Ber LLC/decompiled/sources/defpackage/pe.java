package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class pe extends z3 {
    public boolean c;
    public boolean d;
    public o4 e;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o4 j(Context context) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        o4 o4Var;
        if (this.d) {
            return this.e;
        }
        u20 u20Var = (u20) this.a;
        dk dkVar = u20Var.c;
        boolean z = u20Var.a == 2;
        boolean z2 = this.c;
        bk bkVar = dkVar.M;
        int i2 = bkVar == null ? 0 : bkVar.f;
        if (!z2) {
            if (z) {
                if (bkVar != null) {
                    i = bkVar.b;
                    dkVar.E(0, 0, 0, 0);
                    viewGroup = dkVar.I;
                    o4 o4Var2 = null;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = dkVar.I;
                    if (viewGroup2 != null) {
                    }
                    if (i == 0) {
                    }
                    if (i != 0) {
                    }
                    this.e = o4Var2;
                    this.d = true;
                    return o4Var2;
                }
                i = 0;
                dkVar.E(0, 0, 0, 0);
                viewGroup = dkVar.I;
                o4 o4Var22 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = dkVar.I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.e = o4Var22;
                this.d = true;
                return o4Var22;
            }
            if (bkVar != null) {
                i = bkVar.c;
                dkVar.E(0, 0, 0, 0);
                viewGroup = dkVar.I;
                o4 o4Var222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = dkVar.I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.e = o4Var222;
                this.d = true;
                return o4Var222;
            }
            i = 0;
            dkVar.E(0, 0, 0, 0);
            viewGroup = dkVar.I;
            o4 o4Var2222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = dkVar.I;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.e = o4Var2222;
            this.d = true;
            return o4Var2222;
        }
        if (!z) {
            if (bkVar != null) {
                i = bkVar.e;
                dkVar.E(0, 0, 0, 0);
                viewGroup = dkVar.I;
                o4 o4Var22222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = dkVar.I;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.e = o4Var22222;
                this.d = true;
                return o4Var22222;
            }
            i = 0;
            dkVar.E(0, 0, 0, 0);
            viewGroup = dkVar.I;
            o4 o4Var222222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = dkVar.I;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.e = o4Var222222;
            this.d = true;
            return o4Var222222;
        }
        if (bkVar != null) {
            i = bkVar.d;
            dkVar.E(0, 0, 0, 0);
            viewGroup = dkVar.I;
            o4 o4Var2222222 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                dkVar.I.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = dkVar.I;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i == 0 && i2 != 0) {
                    i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z ? vv.Y(context, android.R.attr.activityOpenEnterAnimation) : vv.Y(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? vv.Y(context, android.R.attr.activityCloseEnterAnimation) : vv.Y(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                }
                if (i != 0) {
                    boolean equals = "anim".equals(context.getResources().getResourceTypeName(i));
                    try {
                        if (equals) {
                            try {
                                loadAnimation = AnimationUtils.loadAnimation(context, i);
                            } catch (Resources.NotFoundException e) {
                                throw e;
                            } catch (RuntimeException unused) {
                            }
                            if (loadAnimation != null) {
                                o4Var = new o4(loadAnimation);
                                o4Var2222222 = o4Var;
                            }
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                        if (loadAnimator != null) {
                            o4Var = new o4(loadAnimator);
                            o4Var2222222 = o4Var;
                        }
                    } catch (RuntimeException e2) {
                        if (equals) {
                            throw e2;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation2 != null) {
                            o4Var2222222 = new o4(loadAnimation2);
                        }
                    }
                }
            }
            this.e = o4Var2222222;
            this.d = true;
            return o4Var2222222;
        }
        i = 0;
        dkVar.E(0, 0, 0, 0);
        viewGroup = dkVar.I;
        o4 o4Var22222222 = null;
        if (viewGroup != null) {
            dkVar.I.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = dkVar.I;
        if (viewGroup2 != null) {
        }
        if (i == 0) {
            i = i2 == 4097 ? i2 != 8194 ? i2 != 8197 ? i2 != 4099 ? i2 != 4100 ? -1 : z ? vv.Y(context, android.R.attr.activityOpenEnterAnimation) : vv.Y(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? vv.Y(context, android.R.attr.activityCloseEnterAnimation) : vv.Y(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i != 0) {
        }
        this.e = o4Var22222222;
        this.d = true;
        return o4Var22222222;
    }
}
