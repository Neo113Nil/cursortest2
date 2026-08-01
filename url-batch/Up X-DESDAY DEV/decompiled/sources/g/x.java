package g;

import X.AbstractC0039g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class x extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0039g f2348a;

    public x(AbstractC0039g abstractC0039g) {
        this.f2348a = abstractC0039g;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f2348a.h();
    }
}
