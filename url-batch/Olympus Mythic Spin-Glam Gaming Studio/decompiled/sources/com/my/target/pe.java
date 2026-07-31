package com.my.target;

import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.my.target.common.models.qrcta.Position;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public abstract class pe {
    public static Position a(JSONObject jSONObject) {
        int b;
        int a;
        String optString = jSONObject.optString(VastAttributes.HORIZONTAL_POSITION);
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        String optString2 = jSONObject.optString(VastAttributes.VERTICAL_POSITION);
        if (!TextUtils.isEmpty(optString2) && (b = b(optString2)) >= 0 && (a = a(optString)) >= 0) {
            return Position.newPosition(a, b);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int b(String str) {
        boolean z;
        str.getClass();
        switch (str.hashCode()) {
            case -1383228885:
                if (str.equals("bottom")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case -1364013995:
                if (str.equals("center")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case 115029:
                if (str.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
                return 2;
            case true:
                return 1;
            case true:
                return 0;
            default:
                return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int a(String str) {
        boolean z;
        str.getClass();
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case 3317767:
                if (str.equals("left")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case 108511772:
                if (str.equals("right")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
                return 1;
            case true:
                return 0;
            case true:
                return 2;
            default:
                return -1;
        }
    }
}
