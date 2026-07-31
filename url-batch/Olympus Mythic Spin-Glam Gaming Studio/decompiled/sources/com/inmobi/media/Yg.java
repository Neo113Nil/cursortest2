package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public abstract class Yg {
    public static Xg a(String content, String markupType) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        int hashCode = markupType.hashCode();
        if (hashCode != -1084172778) {
            if (hashCode != 3213227) {
                if (hashCode == 1236050372 && markupType.equals("htmlUrl")) {
                    return new C3937d8(content);
                }
            } else if (markupType.equals("html")) {
                return new C3911c8(content);
            }
        } else if (markupType.equals("inmobiJson")) {
            return new C4440w9(content);
        }
        throw new IllegalArgumentException("Unsupported markup type: " + markupType);
    }
}
