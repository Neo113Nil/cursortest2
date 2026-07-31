package yads;

import android.view.TextureView;

/* loaded from: classes4.dex */
public final class r72 {
    public final zo0 a;

    public r72(zo0 zo0Var) {
        this.a = zo0Var;
    }

    public final void a(q72 q72Var) {
        TextureView textureView = q72Var.b;
        this.a.a(textureView);
        textureView.setVisibility(0);
        q72Var.c.setVisibility(0);
        q72Var.a.setVisibility(0);
    }

    public final void b(q72 q72Var) {
        TextureView textureView = q72Var.b;
        this.a.a((TextureView) null);
        textureView.setVisibility(8);
        q72Var.c.setVisibility(8);
        q72Var.a.setVisibility(8);
    }
}
