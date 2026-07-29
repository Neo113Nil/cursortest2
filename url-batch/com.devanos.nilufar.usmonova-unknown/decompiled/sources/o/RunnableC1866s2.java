package o;

import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.database.android.AndroidAppCheckTokenProvider;
import com.google.firebase.database.android.AndroidAuthTokenProvider;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.internal.InternalTokenResult;
import com.google.firebase.messaging.ImageDownload;

/* renamed from: o.s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1866s2 implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ RunnableC1866s2(Object obj, int i, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.h;
        Object obj = this.j;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                AndroidAppCheckTokenProvider.lambda$addTokenChangeListener$3((TokenProvider.TokenChangeListener) obj2, (AppCheckTokenResult) obj);
                return;
            case 1:
                AndroidAuthTokenProvider.lambda$addTokenChangeListener$3((TokenProvider.TokenChangeListener) obj2, (InternalTokenResult) obj);
                return;
            case 2:
                C2000u3.a((ViewOnAttachStateChangeListenerC2132w3) obj2, (LongSparseArray) obj);
                return;
            case 3:
                U4 u4 = (U4) obj2;
                Runnable runnable = (Runnable) obj;
                u4.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    u4.a();
                }
            case 4:
                AbstractActivityC0446Rc abstractActivityC0446Rc = (AbstractActivityC0446Rc) obj2;
                YF yf = (YF) obj;
                AbstractC0048Bt.n(abstractActivityC0446Rc, "this$0");
                AbstractC0048Bt.n(yf, "$dispatcher");
                abstractActivityC0446Rc.getLifecycle().a(new C0161Gc(yf, 0, abstractActivityC0446Rc));
                return;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                ViewGroup viewGroup = (ViewGroup) obj2;
                AbstractC0048Bt.n(viewGroup, "$container");
                viewGroup.endViewTransition(null);
                throw null;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                ((ImageDownload) obj2).lambda$start$0((NU) obj);
                return;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                int i2 = JobInfoSchedulerService.h;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
            default:
                ((M5) obj2).q((Typeface) obj);
                return;
        }
    }
}
