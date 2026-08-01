package defpackage;

import android.view.View;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fs extends v00 implements mu {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs(int i) {
        super(1);
        this.e = i;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        return Boolean.valueOf(((View) obj).getId() == this.e);
    }
}
