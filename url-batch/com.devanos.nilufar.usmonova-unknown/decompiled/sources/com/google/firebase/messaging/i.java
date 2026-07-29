package com.google.firebase.messaging;

import com.google.firebase.messaging.WithinAppServiceConnection;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ i(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                ((SharedPreferencesQueue) this.i).syncState();
                break;
            default:
                ((WithinAppServiceConnection.BindRequest) this.i).lambda$arrangeTimeout$0();
                break;
        }
    }
}
