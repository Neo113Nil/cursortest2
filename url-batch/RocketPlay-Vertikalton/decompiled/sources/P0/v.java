package P0;

import K.T;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f1014a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f1015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f1016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f1016c = wVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        w wVar = this.f1016c;
        ColorStateList colorStateList2 = wVar.f1022l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f1015b = colorStateList;
        if (wVar.f1021k != 0 && wVar.f1022l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{C.a.b(wVar.f1022l.getColorForState(iArr3, 0), wVar.f1021k), C.a.b(wVar.f1022l.getColorForState(iArr2, 0), wVar.f1021k), wVar.f1021k});
        }
        this.f1014a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            w wVar = this.f1016c;
            Drawable drawable = null;
            if (wVar.getText().toString().contentEquals(textView.getText()) && wVar.f1021k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(wVar.f1021k);
                if (this.f1015b != null) {
                    D.a.h(colorDrawable, this.f1014a);
                    drawable = new RippleDrawable(this.f1015b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = T.f633a;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
