package com.google.firebase.database.core;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.connection.ConnectionTokenProvider;
import o.NU;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                ((ConnectionTokenProvider.GetTokenCallback) this.i).onSuccess((String) this.j);
                break;
            case 1:
                ((ConnectionTokenProvider.GetTokenCallback) this.i).onError((String) this.j);
                break;
            default:
                ((NU) this.i).d((DataSnapshot) this.j);
                break;
        }
    }
}
