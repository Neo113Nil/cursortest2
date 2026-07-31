package com.my.target;

import com.pubmatic.sdk.common.POBCommonConstants;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class bc {
    public final boolean a;
    private final String b;

    public bc(String str, String str2) {
        str.getClass();
        switch (str) {
            case "vpaidInit":
            case "close":
            case "setOrientationProperties":
            case "setResizeProperties":
            case "vpaidEvent":
            case "playheadEvent":
                this.a = false;
                this.b = str;
                break;
            case "playVideo":
            case "expand":
                this.a = POBCommonConstants.BANNER_PLACEMENT_TYPE.equals(str2);
                this.b = str;
                break;
            case "resize":
            case "createCalendarEvent":
            case "open":
            case "storePicture":
                this.a = true;
                this.b = str;
                break;
            default:
                this.a = false;
                this.b = "";
                break;
        }
    }

    public String toString() {
        return this.b;
    }
}
