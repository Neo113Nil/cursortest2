package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class f40 extends View {
    public final /* synthetic */ ViewGroup f;
    public final /* synthetic */ h40 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(h40 h40Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.g = h40Var;
        this.f = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        h40 h40Var = this.g;
        ArrayList arrayList = h40Var.b;
        Drawable background = this.f.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (h40Var.e != color) {
            h40Var.e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ax) arrayList.get(size)).b(color);
            }
        }
    }
}
