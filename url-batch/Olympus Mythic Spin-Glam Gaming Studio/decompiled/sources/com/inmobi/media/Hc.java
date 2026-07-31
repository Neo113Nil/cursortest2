package com.inmobi.media;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes12.dex */
public final class Hc extends ContentObserver implements InterfaceC4179mc {
    public final String a;
    public final Context b;
    public int c;
    public final /* synthetic */ Jc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hc(Jc jc, String mJsCallbackNamespace, Context context, Handler handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(mJsCallbackNamespace, "mJsCallbackNamespace");
        this.d = jc;
        this.a = mJsCallbackNamespace;
        this.b = context;
        this.c = -1;
    }

    @Override // com.inmobi.media.InterfaceC4179mc
    public final void a() {
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return;
        }
        context.getContentResolver().unregisterContentObserver(this);
    }

    @Override // com.inmobi.media.InterfaceC4179mc
    public final void b() {
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new Gc(this, this.d, z, null), 3, null);
    }
}
