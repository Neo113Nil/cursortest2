package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class mu0 extends View {
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ ou0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu0(ou0 ou0Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.e = ou0Var;
        this.d = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        ou0 ou0Var = this.e;
        ArrayList arrayList = ou0Var.b;
        Drawable background = this.d.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (ou0Var.e != color) {
            ou0Var.e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((gi0) arrayList.get(size)).b(color);
            }
        }
    }
}
