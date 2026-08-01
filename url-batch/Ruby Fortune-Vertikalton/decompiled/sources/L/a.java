package L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f594a;

    /* renamed from: b, reason: collision with root package name */
    public final j f595b;

    /* renamed from: c, reason: collision with root package name */
    public final int f596c;

    public a(int i, j jVar, int i2) {
        this.f594a = i;
        this.f595b = jVar;
        this.f596c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f594a);
        this.f595b.f608a.performAction(this.f596c, bundle);
    }
}
