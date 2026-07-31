package yads;

import kotlin.text.StringsKt;

/* loaded from: classes10.dex */
public abstract class el3 {
    public static String a(String str) {
        String obj = StringsKt.trim(str).toString();
        if (obj.length() <= 0) {
            return "";
        }
        return "yma_" + obj;
    }
}
