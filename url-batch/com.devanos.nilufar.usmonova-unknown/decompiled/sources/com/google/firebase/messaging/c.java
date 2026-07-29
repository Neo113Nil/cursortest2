package com.google.firebase.messaging;

import android.content.Intent;
import com.google.firebase.messaging.WithinAppServiceConnection;
import java.util.concurrent.ScheduledFuture;
import o.InterfaceC0764bG;
import o.InterfaceC1224iG;
import o.InterfaceC2301ye;
import o.MU;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC1224iG, InterfaceC2301ye, InterfaceC0764bG {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ c(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // o.InterfaceC1224iG
    public void c(Object obj) {
        ((FirebaseMessaging) this.i).lambda$new$3((TopicsSubscriber) obj);
    }

    @Override // o.InterfaceC2301ye
    public Object n(MU mu) {
        String lambda$extractResponseWhenComplete$0;
        lambda$extractResponseWhenComplete$0 = ((GmsRpc) this.i).lambda$extractResponseWhenComplete$0(mu);
        return lambda$extractResponseWhenComplete$0;
    }

    @Override // o.InterfaceC0764bG
    public void onComplete(MU mu) {
        switch (this.h) {
            case 2:
                WakeLockHolder.completeWakefulIntent((Intent) this.i);
                break;
            case 3:
                ((WithinAppServiceConnection.BindRequest) this.i).finish();
                break;
            default:
                ((ScheduledFuture) this.i).cancel(false);
                break;
        }
    }
}
