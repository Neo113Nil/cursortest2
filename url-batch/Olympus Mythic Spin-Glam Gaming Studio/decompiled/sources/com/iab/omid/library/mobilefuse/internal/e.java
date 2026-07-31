package com.iab.omid.library.mobilefuse.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.mobilefuse.adsession.FriendlyObstructionPurpose;

/* loaded from: classes6.dex */
public class e {
    private final com.iab.omid.library.mobilefuse.weakreference.a a;
    private final String b;
    private final FriendlyObstructionPurpose c;
    private final String d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.a = new com.iab.omid.library.mobilefuse.weakreference.a(view);
        this.b = view.getClass().getCanonicalName();
        this.c = friendlyObstructionPurpose;
        this.d = str;
    }

    public String a() {
        return this.d;
    }

    public FriendlyObstructionPurpose b() {
        return this.c;
    }

    public com.iab.omid.library.mobilefuse.weakreference.a c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }
}
