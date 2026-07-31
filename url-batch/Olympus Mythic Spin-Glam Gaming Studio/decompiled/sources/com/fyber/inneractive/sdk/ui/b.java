package com.fyber.inneractive.sdk.ui;

import android.view.View;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;

/* loaded from: classes11.dex */
public final class b implements View.OnLayoutChangeListener {
    public final /* synthetic */ FyberAdIdentifierLocal a;

    public b(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.a = fyberAdIdentifierLocal;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.q = this.a.n.getWidth() + r1.n.getWidth();
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.a;
        IFyberAdIdentifier.Corner corner = fyberAdIdentifierLocal.k;
        if (corner == IFyberAdIdentifier.Corner.TOP_LEFT || corner == IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            fyberAdIdentifierLocal.q *= -1.0f;
        }
        fyberAdIdentifierLocal.n.setTranslationX(fyberAdIdentifierLocal.q);
        FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.a;
        if (fyberAdIdentifierLocal2.o) {
            fyberAdIdentifierLocal2.a();
        }
    }
}
