package yads;

import java.util.HashSet;

/* loaded from: classes4.dex */
public abstract class go0 {
    public static final HashSet a = new HashSet();
    public static String b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (go0.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }
}
