package g;

import Y.AbstractC0039g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class v extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0039g f2258a;

    public v(AbstractC0039g abstractC0039g) {
        this.f2258a = abstractC0039g;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f2258a.h();
    }
}
