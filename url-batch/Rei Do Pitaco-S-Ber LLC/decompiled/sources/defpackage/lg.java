package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import com.ionia.reidopitaco.libya.MainActivity;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class lg implements Runnable {
    public final /* synthetic */ og f;
    public final /* synthetic */ i40 g;
    public final /* synthetic */ i40 h;
    public final /* synthetic */ MainActivity i;
    public final /* synthetic */ View j;

    public /* synthetic */ lg(og ogVar, i40 i40Var, i40 i40Var2, MainActivity mainActivity, View view) {
        this.f = ogVar;
        this.g = i40Var;
        this.h = i40Var2;
        this.i = mainActivity;
        this.j = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.i.getWindow();
        window.getClass();
        i40 i40Var = this.g;
        ol olVar = i40Var.c;
        View view = this.j;
        Resources resources = view.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) olVar.a(resources)).booleanValue();
        i40 i40Var2 = this.h;
        ol olVar2 = i40Var2.c;
        Resources resources2 = view.getResources();
        resources2.getClass();
        this.f.b(i40Var, i40Var2, window, view, booleanValue, ((Boolean) olVar2.a(resources2)).booleanValue());
    }
}
