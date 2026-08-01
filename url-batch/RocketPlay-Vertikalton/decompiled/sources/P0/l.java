package P0;

import android.text.Editable;

/* loaded from: classes.dex */
public final class l extends G0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f953a;

    public l(p pVar) {
        this.f953a = pVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f953a.b().a();
    }

    @Override // G0.l, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f953a.b().b();
    }
}
