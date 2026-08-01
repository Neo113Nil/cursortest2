package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.ay;
import defpackage.pg0;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements ay {
    @Override // defpackage.ay
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.ay
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new pg0(3);
        }
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: zh0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new ai0(applicationContext, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new pg0(3);
    }
}
