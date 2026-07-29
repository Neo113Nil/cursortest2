package o;

import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: o.dd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0918dd extends ClickableSpan {
    public final AbstractC0692aA h;

    public C0918dd(AbstractC0692aA abstractC0692aA) {
        this.h = abstractC0692aA;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.h.getClass();
    }
}
