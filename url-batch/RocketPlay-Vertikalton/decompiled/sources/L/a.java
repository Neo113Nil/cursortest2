package L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f782a;

    /* renamed from: b, reason: collision with root package name */
    public final j f783b;

    /* renamed from: c, reason: collision with root package name */
    public final int f784c;

    public a(int i, j jVar, int i2) {
        this.f782a = i;
        this.f783b = jVar;
        this.f784c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f782a);
        this.f783b.f795a.performAction(this.f784c, bundle);
    }
}
