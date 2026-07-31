package io.intercom.android.sdk.blocks.lib;

import androidx.core.view.GravityCompat;
import java.util.Locale;

/* loaded from: classes8.dex */
public enum BlockAlignment {
    LEFT { // from class: io.intercom.android.sdk.blocks.lib.BlockAlignment.1
        @Override // io.intercom.android.sdk.blocks.lib.BlockAlignment
        public int getGravity() {
            return GravityCompat.START;
        }
    },
    CENTER { // from class: io.intercom.android.sdk.blocks.lib.BlockAlignment.2
        @Override // io.intercom.android.sdk.blocks.lib.BlockAlignment
        public int getGravity() {
            return 1;
        }
    },
    RIGHT { // from class: io.intercom.android.sdk.blocks.lib.BlockAlignment.3
        @Override // io.intercom.android.sdk.blocks.lib.BlockAlignment
        public int getGravity() {
            return GravityCompat.END;
        }
    };

    public abstract int getGravity();

    public static BlockAlignment alignValueOf(String str) {
        try {
            return valueOf(str.toUpperCase(Locale.ENGLISH));
        } catch (IllegalArgumentException | NullPointerException unused) {
            return LEFT;
        }
    }
}
