package o;

import android.content.Context;
import android.content.Intent;
import com.google.firebase.database.core.SyncTree;
import com.google.firebase.database.core.view.QuerySpec;
import com.google.firebase.database.snapshot.Node;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import java.util.concurrent.Callable;

/* renamed from: o.Fl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0144Fl implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ CallableC0144Fl(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Integer lambda$startMessagingService$0;
        Node lambda$getServerValue$0;
        switch (this.a) {
            case 0:
                lambda$startMessagingService$0 = FcmBroadcastProcessor.lambda$startMessagingService$0((Context) this.b, (Intent) this.c);
                return lambda$startMessagingService$0;
            default:
                lambda$getServerValue$0 = ((SyncTree) this.b).lambda$getServerValue$0((QuerySpec) this.c);
                return lambda$getServerValue$0;
        }
    }
}
