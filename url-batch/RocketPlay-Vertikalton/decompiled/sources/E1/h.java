package E1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.luckycounter.drinkwater.R;
import java.io.Serializable;
import l.C0279u;
import l.N0;
import l.S0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f314a;

    /* renamed from: b, reason: collision with root package name */
    public Object f315b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f316c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f317e;

    /* renamed from: f, reason: collision with root package name */
    public Object f318f;

    /* JADX WARN: Type inference failed for: r0v3, types: [int[], java.io.Serializable] */
    public h() {
        this.f314a = new int[]{2131165301, 2131165299, 2131165225};
        this.f315b = new int[]{2131165249, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f316c = new int[]{2131165298, 2131165300, 2131165242, R.drawable.abc_text_cursor_material, 2131165295, 2131165296, 2131165297};
        this.d = new int[]{2131165274, R.drawable.abc_cab_background_internal_bg, 2131165273};
        this.f317e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f318f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i) {
        int c2 = S0.c(context, R.attr.colorControlHighlight);
        int b2 = S0.b(context, R.attr.colorButtonNormal);
        int[] iArr = S0.f3365b;
        int[] iArr2 = S0.d;
        int b3 = C.a.b(c2, i);
        return new ColorStateList(new int[][]{iArr, iArr2, S0.f3366c, S0.f3368f}, new int[]{b2, b3, C.a.b(c2, i), i});
    }

    public static LayerDrawable c(N0 n0, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c2 = n0.c(context, R.drawable.abc_star_black_48dp);
        Drawable c3 = n0.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c2 instanceof BitmapDrawable) && c2.getIntrinsicWidth() == dimensionPixelSize && c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c2;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c2.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c3 instanceof BitmapDrawable) && c3.getIntrinsicWidth() == dimensionPixelSize && c3.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c3;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c3.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void e(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C0279u.f3508b;
        }
        mutate.setColorFilter(C0279u.c(i, mode));
    }

    public ColorStateList d(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return F1.d.D(context, R.color.abc_tint_edittext);
        }
        if (i == 2131165291) {
            return F1.d.D(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, S0.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return b(context, S0.c(context, R.attr.colorAccent));
            }
            if (i == 2131165286 || i == R.drawable.abc_spinner_textfield_background_material) {
                return F1.d.D(context, R.color.abc_tint_spinner);
            }
            if (a((int[]) this.f315b, i)) {
                return S0.d(context, R.attr.colorControlNormal);
            }
            if (a((int[]) this.f317e, i)) {
                return F1.d.D(context, R.color.abc_tint_default);
            }
            if (a((int[]) this.f318f, i)) {
                return F1.d.D(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return F1.d.D(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = S0.d(context, R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = S0.f3365b;
            iArr2[0] = S0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = S0.f3367e;
            iArr2[1] = S0.c(context, R.attr.colorControlActivated);
            iArr[2] = S0.f3368f;
            iArr2[2] = S0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = S0.f3365b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = S0.f3367e;
            iArr2[1] = S0.c(context, R.attr.colorControlActivated);
            iArr[2] = S0.f3368f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public h(A1.f fVar) {
        i1.f.e(fVar, "taskRunner");
        this.f314a = fVar;
        this.f318f = j.f319a;
    }
}
