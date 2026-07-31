package io.bidmachine;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import io.bidmachine.internal.InterfaceC6021p;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
class e {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private volatile String b;

    class a implements OnSuccessListener {
        a() {
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AppSetIdInfo appSetIdInfo) {
            if (appSetIdInfo.getScope() == 2) {
                e.this.b = appSetIdInfo.getId();
            }
        }
    }

    e() {
    }

    public void b(final Context context) {
        if (this.a.compareAndSet(false, true)) {
            p.a().execute(new InterfaceC6021p() { // from class: io.bidmachine.e$$ExternalSyntheticLambda0
                @Override // io.bidmachine.utils.SafeRunnable
                public final void onRun() {
                    e.this.a(context);
                }
            });
        }
    }

    public String a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new a());
    }
}
