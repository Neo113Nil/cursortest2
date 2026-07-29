package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.inject.Provider;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.h = i;
        this.j = obj;
        this.i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                ((OptionalProvider) this.j).set((Provider) this.i);
                break;
            case 1:
                ((LazySet) this.j).add((Provider) this.i);
                break;
            default:
                EventBus.lambda$publish$0((Map.Entry) this.j, (Event) this.i);
                break;
        }
    }
}
