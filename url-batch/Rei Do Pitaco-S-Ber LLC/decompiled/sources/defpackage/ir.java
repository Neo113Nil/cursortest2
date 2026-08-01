package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ir extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ jr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(jr jrVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = jrVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        jr jrVar = this.c;
        ColorStateList colorStateList2 = jrVar.r;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (jrVar.q != 0 && jrVar.r != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{eb.b(jrVar.r.getColorForState(iArr3, 0), jrVar.q), eb.b(jrVar.r.getColorForState(iArr2, 0), jrVar.q), jrVar.q});
        }
        this.a = colorStateList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            jr jrVar = this.c;
            ColorDrawable colorDrawable = null;
            if (jrVar.getText().toString().contentEquals(textView.getText()) && jrVar.q != 0) {
                ColorDrawable colorDrawable2 = new ColorDrawable(jrVar.q);
                if (this.b != null) {
                    colorDrawable2.setTintList(this.a);
                    RippleDrawable rippleDrawable = new RippleDrawable(this.b, colorDrawable2, null);
                    FocusRingDrawable e = FocusRingDrawable.e(getContext(), rippleDrawable, null);
                    if (e != null) {
                        e.t.x = jrVar.l;
                    }
                    colorDrawable = rippleDrawable;
                } else {
                    colorDrawable = colorDrawable2;
                }
            }
            textView.setBackground(colorDrawable);
        }
        return view2;
    }
}
