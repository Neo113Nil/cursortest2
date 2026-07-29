package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.devanos.nilufar.usmonova.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class VN {
    public static VN g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public C1343k5 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final UN h = new UN(6);

    public static synchronized VN b() {
        VN vn;
        synchronized (VN.class) {
            try {
                if (g == null) {
                    g = new VN();
                }
                vn = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vn;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (VN.class) {
            UN un = h;
            un.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) un.a(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable;
        Object obj;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C1219iB c1219iB = (C1219iB) this.b.get(context);
            drawable = null;
            if (c1219iB != null) {
                int i2 = AbstractC1473m3.i(c1219iB.i, c1219iB.k, j);
                if (i2 < 0 || (obj = c1219iB.j[i2]) == AbstractC0946e20.e) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        c1219iB.d(j);
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165201)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = C1343k5.q(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C1343k5.q(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C1343k5.q(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 != null) {
                    C1219iB c1219iB2 = (C1219iB) this.b.get(context);
                    if (c1219iB2 == null) {
                        c1219iB2 = new C1219iB((Object) null);
                        this.b.put(context, c1219iB2);
                    }
                    c1219iB2.c(j, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
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
                if (c == null || (!(c instanceof WY) && !"android.graphics.drawable.VectorDrawable".equals(c.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a = a(context, i);
            if (a == null) {
                a = AbstractC1774qe.b(context, i);
            }
            if (a != null) {
                a = g(context, i, z, a);
            }
            if (a != null) {
                AbstractC1317jj.a(a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        PS ps;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (ps = (PS) weakHashMap.get(context)) == null) ? null : (ColorStateList) ps.c(i);
        if (colorStateList == null) {
            C1343k5 c1343k5 = this.e;
            if (c1343k5 != null) {
                colorStateList2 = c1343k5.t(context, i);
            }
            if (colorStateList2 != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                PS ps2 = (PS) this.a.get(context);
                if (ps2 == null) {
                    ps2 = new PS(0);
                    this.a.put(context, ps2);
                }
                ps2.a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i, boolean z, Drawable drawable) {
        int i2;
        boolean z2;
        int round;
        PorterDuffColorFilter e;
        ColorStateList f2 = f(context, i);
        PorterDuff.Mode mode = null;
        if (f2 != null) {
            Drawable mutate = drawable.mutate();
            AbstractC1187hj.h(mutate, f2);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                AbstractC1187hj.i(mutate, mode);
            }
            return mutate;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c = CV.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C1409l5.b;
                C1343k5.C(findDrawableByLayerId, c, mode2);
                C1343k5.C(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), CV.c(context, R.attr.colorControlNormal), mode2);
                C1343k5.C(layerDrawable.findDrawableByLayerId(android.R.id.progress), CV.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b = CV.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C1409l5.b;
                C1343k5.C(findDrawableByLayerId2, b, mode3);
                C1343k5.C(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), CV.c(context, R.attr.colorControlActivated), mode3);
                C1343k5.C(layerDrawable2.findDrawableByLayerId(android.R.id.progress), CV.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C1343k5 c1343k5 = this.e;
        boolean z3 = false;
        if (c1343k5 != null) {
            PorterDuff.Mode mode4 = C1409l5.b;
            if (C1343k5.e((int[]) c1343k5.h, i)) {
                i2 = R.attr.colorControlNormal;
            } else if (C1343k5.e((int[]) c1343k5.j, i)) {
                i2 = R.attr.colorControlActivated;
            } else {
                if (C1343k5.e((int[]) c1343k5.k, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == 2131165221) {
                    round = Math.round(40.8f);
                    i2 = 16842800;
                    z2 = true;
                    if (z2) {
                        Drawable mutate2 = drawable.mutate();
                        int c2 = CV.c(context, i2);
                        synchronized (C1409l5.class) {
                            e = e(c2, mode4);
                        }
                        mutate2.setColorFilter(e);
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z3 = true;
                    }
                } else if (i != R.drawable.abc_dialog_material_background) {
                    i2 = 0;
                    z2 = false;
                    round = -1;
                    if (z2) {
                    }
                }
                i2 = 16842801;
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
