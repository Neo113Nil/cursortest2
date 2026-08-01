package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.ionia.reidopitaco.libya.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class tz {
    public static tz g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public e4 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final sz h = new sz(6);

    public static synchronized tz b() {
        tz tzVar;
        synchronized (tz.class) {
            try {
                if (g == null) {
                    g = new tz();
                }
                tzVar = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tzVar;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (tz.class) {
            sz szVar = h;
            szVar.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) szVar.f(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        LayerDrawable layerDrawable;
        Drawable newDrawable;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            rq rqVar = (rq) this.b.get(context);
            layerDrawable = null;
            if (rqVar != null) {
                WeakReference weakReference = (WeakReference) rqVar.b(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        newDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        int e = oo.e(rqVar.g, rqVar.i, j);
                        if (e >= 0) {
                            Object[] objArr = rqVar.h;
                            Object obj = objArr[e];
                            Object obj2 = g8.c;
                            if (obj != obj2) {
                                objArr[e] = obj2;
                                rqVar.f = true;
                            }
                        }
                    }
                }
            }
            newDrawable = null;
        }
        if (newDrawable != null) {
            return newDrawable;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165242)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = e4.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = e4.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = e4.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 == null) {
                    return layerDrawable;
                }
                rq rqVar2 = (rq) this.b.get(context);
                if (rqVar2 == null) {
                    rqVar2 = new rq();
                    this.b.put(context, rqVar2);
                }
                rqVar2.d(j, new WeakReference(constantState2));
                return layerDrawable;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z) {
        Drawable a;
        try {
            if (!this.d) {
                this.d = true;
                Drawable c = c(context, R.drawable.abc_vector_test);
                if (c == null || (!(c instanceof j70) && !"android.graphics.drawable.VectorDrawable".equals(c.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a = a(context, i);
            if (a == null) {
                a = context.getDrawable(i);
            }
            if (a != null) {
                a = g(context, i, z, a);
            }
            if (a != null) {
                vf.a(a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        s20 s20Var;
        Object obj;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (s20Var = (s20) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int d = oo.d(s20Var.h, i, s20Var.f);
            if (d < 0 || (obj = s20Var.g[d]) == vv.g) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            e4 e4Var = this.e;
            if (e4Var != null) {
                colorStateList2 = e4Var.d(context, i);
            }
            if (colorStateList2 != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                s20 s20Var2 = (s20) this.a.get(context);
                if (s20Var2 == null) {
                    s20Var2 = new s20();
                    this.a.put(context, s20Var2);
                }
                s20Var2.a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int round;
        ColorStateList f2 = f(context, i);
        PorterDuff.Mode mode = null;
        if (f2 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(f2);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        e4 e4Var = this.e;
        int i2 = R.attr.colorControlNormal;
        if (e4Var != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c = b50.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = f4.b;
                e4.e(findDrawableByLayerId, c, mode2);
                e4.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), b50.c(context, R.attr.colorControlNormal), mode2);
                e4.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), b50.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b = b50.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = f4.b;
                e4.e(findDrawableByLayerId2, b, mode3);
                e4.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), b50.c(context, R.attr.colorControlActivated), mode3);
                e4.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), b50.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        e4 e4Var2 = this.e;
        boolean z3 = false;
        if (e4Var2 != null) {
            PorterDuff.Mode mode4 = f4.b;
            if (!e4.a((int[]) e4Var2.a, i)) {
                if (e4.a((int[]) e4Var2.c, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean a = e4.a((int[]) e4Var2.d, i);
                    i2 = android.R.attr.colorBackground;
                    if (a) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131165262) {
                        round = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                        if (z2) {
                            Drawable mutate2 = drawable.mutate();
                            mutate2.setColorFilter(f4.c(b50.c(context, i2), mode4));
                            if (round != -1) {
                                mutate2.setAlpha(round);
                            }
                            z3 = true;
                        }
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        z2 = false;
                        i2 = 0;
                        round = -1;
                        if (z2) {
                        }
                    }
                }
            }
            z2 = true;
            round = -1;
            if (z2) {
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
