package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: HexFormat.kt */
/* loaded from: classes6.dex */
public abstract class HexFormatKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isCaseSensitive(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Intrinsics.compare((int) charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }
}
