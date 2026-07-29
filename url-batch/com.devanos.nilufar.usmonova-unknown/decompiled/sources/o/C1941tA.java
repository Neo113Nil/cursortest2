package o;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;

/* renamed from: o.tA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1941tA extends BaseInputConnection {
    public final /* synthetic */ C2073vA a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1941tA(View view, C2073vA c2073vA) {
        super(view, true);
        this.a = c2073vA;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.a;
    }
}
