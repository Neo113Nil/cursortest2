package yads;

import kotlin.text.Regex;

/* loaded from: classes3.dex */
public abstract class r43 {
    public static final String a(String str) {
        return new Regex("[^a-zA-Z0-9._-]").replace(str, "_");
    }
}
