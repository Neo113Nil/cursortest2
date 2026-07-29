package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.PermissionRequest;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class S extends U {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public S(String webViewName, PermissionRequest request) {
        super(webViewName, "RequestMediaCapturePermission", r11);
        String str;
        Intrinsics.checkNotNullParameter(webViewName, "webViewName");
        Intrinsics.checkNotNullParameter(request, "request");
        String[] resources = request.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "request.resources");
        ArrayList arrayList = new ArrayList(resources.length);
        int length = resources.length;
        int i = 0;
        while (true) {
            str = "";
            if (i >= length) {
                break;
            }
            String str2 = resources[i];
            if (str2 != null) {
                int hashCode = str2.hashCode();
                if (hashCode != -1660821873) {
                    if (hashCode != 968612586) {
                        if (hashCode != 1069496794) {
                            if (hashCode == 1233677653 && str2.equals("android.webkit.resource.MIDI_SYSEX")) {
                                str = "MIDI_SYSEX";
                            }
                        } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                            str = "PROTECTED_MEDIA_ID";
                        }
                    } else if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        str = "AUDIO";
                    }
                } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    str = "VIDEO";
                }
            }
            arrayList.add(str);
            i++;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((String) next).length() > 0) {
                arrayList2.add(next);
            }
        }
        String scheme = request.getOrigin().getScheme();
        Pair pair = TuplesKt.to("protocol", scheme == null ? "" : scheme);
        String host = request.getOrigin().getHost();
        String jSONObject = new JSONObject(MapsKt.mapOf(pair, TuplesKt.to("host", host != null ? host : ""), TuplesKt.to("port", Integer.valueOf(request.getOrigin().getPort())), TuplesKt.to("resources", arrayList2))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "obj.toString()");
    }
}
