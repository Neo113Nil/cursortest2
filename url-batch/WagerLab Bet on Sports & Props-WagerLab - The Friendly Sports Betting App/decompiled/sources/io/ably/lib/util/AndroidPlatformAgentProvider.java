package io.ably.lib.util;

import android.os.Build;

/* loaded from: classes7.dex */
public class AndroidPlatformAgentProvider implements PlatformAgentProvider {
    @Override // io.ably.lib.util.PlatformAgentProvider
    public String createPlatformAgent() {
        return "android/" + Build.VERSION.SDK_INT;
    }
}
