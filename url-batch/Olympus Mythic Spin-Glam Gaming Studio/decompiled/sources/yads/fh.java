package yads;

import android.app.ActivityManager;
import android.content.Context;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.SequencesKt;

/* loaded from: classes5.dex */
public final class fh {
    public final Context a;
    public final Lazy b = LazyKt.lazy(new ah(this));

    public fh(Context context) {
        this.a = context;
    }

    public final List a(int i, int i2, long j) {
        List emptyList;
        ActivityManager activityManager = (ActivityManager) this.b.getValue();
        if (activityManager == null) {
            return CollectionsKt.emptyList();
        }
        try {
            emptyList = activityManager.getHistoricalProcessExitReasons(this.a.getPackageName(), 0, i);
        } catch (Throwable unused) {
            emptyList = CollectionsKt.emptyList();
        }
        return SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.filter(SequencesKt.filter(SequencesKt.filter(CollectionsKt.asSequence(emptyList), bh.b), new ch(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(i2))), new dh(j)), new eh(this)));
    }
}
