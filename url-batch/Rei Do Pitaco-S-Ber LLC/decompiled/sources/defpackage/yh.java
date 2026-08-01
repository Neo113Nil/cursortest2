package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class yh extends a50 {
    public final /* synthetic */ bi f;

    public yh(bi biVar) {
        this.f = biVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f.b().a();
    }

    @Override // defpackage.a50, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f.b().b();
    }
}
