package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ionia.reidopitaco.libya.R;
import java.util.HashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class oi extends z50 {
    public static final String[] H = {"android:visibility:visibility", "android:visibility:parent"};
    public final int G;

    public oi() {
        this.G = 3;
    }

    public static void J(h60 h60Var) {
        View view = h60Var.b;
        int visibility = view.getVisibility();
        HashMap hashMap = h60Var.a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float L(h60 h60Var, float f) {
        Float f2;
        return (h60Var == null || (f2 = (Float) h60Var.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t90 M(h60 h60Var, h60 h60Var2) {
        t90 t90Var = new t90();
        t90Var.a = false;
        t90Var.b = false;
        if (h60Var != null) {
            HashMap hashMap = h60Var.a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                t90Var.c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                t90Var.e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (h60Var2 != null) {
                    HashMap hashMap2 = h60Var2.a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        t90Var.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        t90Var.f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (h60Var == null && h60Var2 != null) {
                            int i = t90Var.c;
                            int i2 = t90Var.d;
                            if (i != i2 || t90Var.e != t90Var.f) {
                                if (i != i2) {
                                    if (i == 0) {
                                        t90Var.b = false;
                                        t90Var.a = true;
                                        return t90Var;
                                    }
                                    if (i2 == 0) {
                                        t90Var.b = true;
                                        t90Var.a = true;
                                        return t90Var;
                                    }
                                } else {
                                    if (t90Var.f == null) {
                                        t90Var.b = false;
                                        t90Var.a = true;
                                        return t90Var;
                                    }
                                    if (t90Var.e == null) {
                                        t90Var.b = true;
                                        t90Var.a = true;
                                        return t90Var;
                                    }
                                }
                            }
                        } else {
                            if (h60Var != null && t90Var.d == 0) {
                                t90Var.b = true;
                                t90Var.a = true;
                                return t90Var;
                            }
                            if (h60Var2 == null && t90Var.c == 0) {
                                t90Var.b = false;
                                t90Var.a = true;
                            }
                        }
                        return t90Var;
                    }
                }
                t90Var.d = -1;
                t90Var.f = null;
                if (h60Var == null) {
                }
                if (h60Var != null) {
                }
                if (h60Var2 == null) {
                    t90Var.b = false;
                    t90Var.a = true;
                }
                return t90Var;
            }
        }
        t90Var.c = -1;
        t90Var.e = null;
        if (h60Var2 != null) {
        }
        t90Var.d = -1;
        t90Var.f = null;
        if (h60Var == null) {
        }
        if (h60Var != null) {
        }
        if (h60Var2 == null) {
        }
        return t90Var;
    }

    public final ObjectAnimator K(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        f90.a.j(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, f90.b, f2);
        ni niVar = new ni(view);
        ofFloat.addListener(niVar);
        p().a(niVar);
        return ofFloat;
    }

    @Override // defpackage.z50
    public final void d(h60 h60Var) {
        J(h60Var);
    }

    @Override // defpackage.z50
    public final void g(h60 h60Var) {
        J(h60Var);
        View view = h60Var.b;
        Float f = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            f = view.getVisibility() == 0 ? Float.valueOf(f90.a.c(view)) : Float.valueOf(0.0f);
        }
        h60Var.a.put("android:fade:transitionAlpha", f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (M(o(r3, false), s(r3, false)).a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01df  */
    @Override // defpackage.z50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(ViewGroup viewGroup, h60 h60Var, h60 h60Var2) {
        boolean z;
        View view;
        int i;
        char c;
        int i2;
        View view2;
        Animator animator;
        View view3;
        boolean z2;
        ViewGroup viewGroup2;
        int i3;
        Bitmap bitmap;
        t90 M = M(h60Var, h60Var2);
        if (M.a && (M.e != null || M.f != null)) {
            boolean z3 = M.b;
            int i4 = this.G;
            int i5 = 1;
            if (!z3) {
                int i6 = M.d;
                if ((i4 & 2) == 2 && h60Var != null) {
                    View view4 = h60Var.b;
                    View view5 = h60Var2 != null ? h60Var2.b : null;
                    View view6 = (View) view4.getTag(R.id.save_overlay_view);
                    if (view6 != null) {
                        i = i6;
                        c = 1;
                        i2 = 0;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view5 == null || view5.getParent() == null) {
                            if (view5 != null) {
                                z = false;
                                view = null;
                                if (z) {
                                    if (view4.getParent() == null) {
                                        i = i6;
                                        c = 1;
                                        i5 = 0;
                                        i2 = 0;
                                        view3 = view;
                                        animator = null;
                                        view6 = view4;
                                    } else if (view4.getParent() instanceof View) {
                                        View view7 = (View) view4.getParent();
                                        animator = null;
                                        i2 = 0;
                                        if (M(s(view7, true), o(view7, true)).a) {
                                            i = i6;
                                            c = 1;
                                            view2 = view;
                                            int id = view7.getId();
                                            if (view7.getParent() == null && id != -1) {
                                                viewGroup.findViewById(id);
                                            }
                                            view6 = view5;
                                            i5 = i2;
                                            view3 = view2;
                                        } else {
                                            boolean z4 = g60.a;
                                            Matrix matrix = new Matrix();
                                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                            n90 n90Var = f90.a;
                                            n90Var.n(view4, matrix);
                                            n90Var.o(viewGroup, matrix);
                                            RectF rectF = new RectF(0.0f, 0.0f, view4.getWidth(), view4.getHeight());
                                            matrix.mapRect(rectF);
                                            int round = Math.round(rectF.left);
                                            int round2 = Math.round(rectF.top);
                                            c = 1;
                                            int round3 = Math.round(rectF.right);
                                            int round4 = Math.round(rectF.bottom);
                                            ImageView imageView = new ImageView(view4.getContext());
                                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                            boolean isAttachedToWindow = view4.isAttachedToWindow();
                                            boolean z5 = viewGroup != null && viewGroup.isAttachedToWindow();
                                            if (isAttachedToWindow) {
                                                z2 = isAttachedToWindow;
                                                viewGroup2 = null;
                                                i3 = 0;
                                            } else if (z5) {
                                                viewGroup2 = (ViewGroup) view4.getParent();
                                                int indexOfChild = viewGroup2.indexOfChild(view4);
                                                z2 = isAttachedToWindow;
                                                viewGroup.getOverlay().add(view4);
                                                i3 = indexOfChild;
                                            } else {
                                                i = i6;
                                                view2 = view;
                                                bitmap = null;
                                                if (bitmap != null) {
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                                imageView.layout(round, round2, round3, round4);
                                                view6 = imageView;
                                                i5 = i2;
                                                view3 = view2;
                                            }
                                            view2 = view;
                                            int round5 = Math.round(rectF.width());
                                            i = i6;
                                            int round6 = Math.round(rectF.height());
                                            if (round5 <= 0 || round6 <= 0) {
                                                bitmap = null;
                                            } else {
                                                float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                                int round7 = Math.round(round5 * min);
                                                int round8 = Math.round(round6 * min);
                                                matrix.postTranslate(-rectF.left, -rectF.top);
                                                matrix.postScale(min, min);
                                                if (g60.a) {
                                                    Picture picture = new Picture();
                                                    Canvas beginRecording = picture.beginRecording(round7, round8);
                                                    beginRecording.concat(matrix);
                                                    view4.draw(beginRecording);
                                                    picture.endRecording();
                                                    bitmap = f60.a(picture);
                                                } else {
                                                    bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                                    Canvas canvas = new Canvas(bitmap);
                                                    canvas.concat(matrix);
                                                    view4.draw(canvas);
                                                }
                                            }
                                            if (!z2) {
                                                viewGroup.getOverlay().remove(view4);
                                                viewGroup2.addView(view4, i3);
                                            }
                                            if (bitmap != null) {
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                            imageView.layout(round, round2, round3, round4);
                                            view6 = imageView;
                                            i5 = i2;
                                            view3 = view2;
                                        }
                                    }
                                }
                                i = i6;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                                view6 = view5;
                                i5 = i2;
                                view3 = view2;
                            }
                        } else if (i6 == 4 || view4 == view5) {
                            z = false;
                            view = view5;
                            view5 = null;
                            if (z) {
                            }
                            i = i6;
                            c = 1;
                            i2 = 0;
                            view2 = view;
                            animator = null;
                            view6 = view5;
                            i5 = i2;
                            view3 = view2;
                        }
                        z = true;
                        view5 = null;
                        view = null;
                        if (z) {
                        }
                        i = i6;
                        c = 1;
                        i2 = 0;
                        view2 = view;
                        animator = null;
                        view6 = view5;
                        i5 = i2;
                        view3 = view2;
                    }
                    if (view6 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        f90.b(view3, i2);
                        n90 n90Var2 = f90.a;
                        n90Var2.getClass();
                        ObjectAnimator K = K(view3, L(h60Var, 1.0f), 0.0f);
                        if (K == null) {
                            n90Var2.j(view3, L(h60Var2, 1.0f));
                        }
                        if (K == null) {
                            f90.b(view3, visibility);
                            return K;
                        }
                        r90 r90Var = new r90(view3, i);
                        K.addListener(r90Var);
                        p().a(r90Var);
                        return K;
                    }
                    if (i5 == 0) {
                        int[] iArr = (int[]) h60Var.a.get("android:visibility:screenLocation");
                        int i7 = iArr[i2];
                        int i8 = iArr[c];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i7 - iArr2[i2]) - view6.getLeft());
                        view6.offsetTopAndBottom((i8 - iArr2[c]) - view6.getTop());
                        viewGroup.getOverlay().add(view6);
                    }
                    n90 n90Var3 = f90.a;
                    n90Var3.getClass();
                    ObjectAnimator K2 = K(view6, L(h60Var, 1.0f), 0.0f);
                    if (K2 == null) {
                        n90Var3.j(view6, L(h60Var2, 1.0f));
                    }
                    if (i5 == 0) {
                        if (K2 == null) {
                            viewGroup.getOverlay().remove(view6);
                            return K2;
                        }
                        view4.setTag(R.id.save_overlay_view, view6);
                        s90 s90Var = new s90(this, viewGroup, view6, view4);
                        K2.addListener(s90Var);
                        K2.addPauseListener(s90Var);
                        p().a(s90Var);
                    }
                    return K2;
                }
            } else if ((i4 & 1) == 1 && h60Var2 != null) {
                View view8 = h60Var2.b;
                if (h60Var == null) {
                    View view9 = (View) view8.getParent();
                }
                f90.a.getClass();
                return K(view8, L(h60Var, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // defpackage.z50
    public final String[] r() {
        return H;
    }

    @Override // defpackage.z50
    public final boolean t(h60 h60Var, h60 h60Var2) {
        if (h60Var == null && h60Var2 == null) {
            return false;
        }
        if (h60Var != null && h60Var2 != null && h60Var2.a.containsKey("android:visibility:visibility") != h60Var.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        t90 M = M(h60Var, h60Var2);
        if (M.a) {
            return M.c == 0 || M.d == 0;
        }
        return false;
    }

    public oi(int i) {
        this();
        this.G = i;
    }
}
