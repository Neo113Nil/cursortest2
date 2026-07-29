package o;

import android.view.KeyCharacterMap;

/* renamed from: o.Ix, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234Ix {
    public int a = 0;

    public Character a(int i) {
        char c = (char) i;
        if ((Integer.MIN_VALUE & i) != 0) {
            int i2 = i & Integer.MAX_VALUE;
            int i3 = this.a;
            if (i3 != 0) {
                this.a = KeyCharacterMap.getDeadChar(i3, i2);
            } else {
                this.a = i2;
            }
        } else {
            int i4 = this.a;
            if (i4 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i4, i);
                if (deadChar > 0) {
                    c = (char) deadChar;
                }
                this.a = 0;
            }
        }
        return Character.valueOf(c);
    }
}
