package L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f469a;

    /* renamed from: b, reason: collision with root package name */
    public final k f470b;

    /* renamed from: c, reason: collision with root package name */
    public final int f471c;

    public a(int i, k kVar, int i2) {
        this.f469a = i;
        this.f470b = kVar;
        this.f471c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f469a);
        this.f470b.f482a.performAction(this.f471c, bundle);
    }
}
