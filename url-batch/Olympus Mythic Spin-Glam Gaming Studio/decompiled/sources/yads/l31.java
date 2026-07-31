package yads;

import android.content.Context;
import com.adjust.sdk.Constants;

/* loaded from: classes15.dex */
public final class l31 {
    public final Context a;

    public l31(Context context) {
        this.a = context.getApplicationContext();
    }

    public final String a(int i, int i2) {
        int a = yg0.a(this.a, i);
        int a2 = yg0.a(this.a, i2);
        boolean z = ob1.a;
        return (a >= 320 || a2 >= 240) ? Constants.LARGE : (a >= 160 || a2 >= 160) ? Constants.MEDIUM : Constants.SMALL;
    }
}
