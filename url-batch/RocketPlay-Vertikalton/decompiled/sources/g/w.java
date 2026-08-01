package g;

import Y.AbstractC0045g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class w extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0045g f2698a;

    public w(AbstractC0045g abstractC0045g) {
        this.f2698a = abstractC0045g;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f2698a.h();
    }
}
