package yads;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class pz {
    public static final Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public static final hb2 b(Context context) {
        int i = context.getResources().getConfiguration().orientation;
        return i != 1 ? i != 2 ? hb2.e : hb2.c : hb2.d;
    }
}
