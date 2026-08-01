package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class c implements x80 {
    public boolean a;
    public int b;
    public final View c;

    public c(FloatingActionButton floatingActionButton) {
        this.a = false;
        this.b = 0;
        this.c = floatingActionButton;
    }

    @Override // defpackage.x80
    public void a() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.k = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    @Override // defpackage.x80
    public void b() {
        this.a = true;
    }

    @Override // defpackage.x80
    public void c() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }

    public c(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
        this.a = false;
    }
}
