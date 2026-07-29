package o;

import java.util.Locale;

/* loaded from: classes.dex */
public final class EA {
    public final Locale a;

    public EA(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof EA)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC0048Bt.h(this.a.toLanguageTag(), ((EA) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
