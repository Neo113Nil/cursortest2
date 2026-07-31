package com.smaato.sdk.ng.models;

import android.text.TextUtils;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import java.util.Locale;

/* loaded from: classes5.dex */
public enum ContentInfoIconAction {
    EXPAND(n.e),
    OPEN("open");

    public final String action;

    ContentInfoIconAction(String str) {
        this.action = str;
    }

    public static ContentInfoIconAction fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return EXPAND;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        ContentInfoIconAction contentInfoIconAction = EXPAND;
        if (!lowerCase.equals(contentInfoIconAction.action)) {
            ContentInfoIconAction contentInfoIconAction2 = OPEN;
            if (lowerCase.equals(contentInfoIconAction2.action)) {
                return contentInfoIconAction2;
            }
        }
        return contentInfoIconAction;
    }
}
