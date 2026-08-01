package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class gu0 implements PointerInputEventHandler {
    public final /* synthetic */ qu a;

    public gu0(qu quVar) {
        this.a = quVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof gu0)) {
            return false;
        }
        return this.a.equals(((gu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(ah0 ah0Var, kj kjVar) {
        return this.a.invoke(ah0Var, kjVar);
    }
}
