package defpackage;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fd implements CharacterIterator {
    public final CharSequence d;
    public final int e;
    public int f = 0;

    public fd(CharSequence charSequence, int i) {
        this.d = charSequence;
        this.e = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f;
        if (i == this.e) {
            return (char) 65535;
        }
        return this.d.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.e;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.e;
        if (i == 0) {
            this.f = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f = i2;
        return this.d.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f + 1;
        this.f = i;
        int i2 = this.e;
        if (i < i2) {
            return this.d.charAt(i);
        }
        this.f = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f = i2;
        return this.d.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.e || i < 0) {
            g8.r("invalid position");
            return (char) 0;
        }
        this.f = i;
        return current();
    }
}
