package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class d30 {
    public final Context a;

    public d30(Context context) {
        this.a = pz.a(context);
    }

    public final boolean a() {
        return (this.a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
