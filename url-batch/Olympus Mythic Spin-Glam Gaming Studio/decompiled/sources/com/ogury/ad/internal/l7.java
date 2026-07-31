package com.ogury.ad.internal;

import android.content.Context;
import com.ogury.core.internal.datastore.preferences.core.Preferences;
import com.ogury.core.internal.datastore.preferences.core.PreferencesKeys;

/* loaded from: classes8.dex */
public final class l7 {
    public static final y6 b = new y6();
    public static final Preferences.Key c = PreferencesKeys.stringKey("mraid_download_url");
    public static final Preferences.Key d = PreferencesKeys.stringKey("mraid_js");
    public static l7 e;
    public final Context a;

    public l7(Context context) {
        this.a = context;
    }
}
