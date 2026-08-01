package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class s21 extends ContentObserver {
    public final /* synthetic */ eb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s21(eb ebVar, Handler handler) {
        super(handler);
        this.a = ebVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.r(ky0.a);
    }
}
