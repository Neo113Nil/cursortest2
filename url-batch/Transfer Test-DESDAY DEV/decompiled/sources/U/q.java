package U;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f834a;

    /* renamed from: b, reason: collision with root package name */
    public final String f835b;

    public /* synthetic */ q(String str, int i) {
        this.f834a = i;
        this.f835b = str;
    }

    @Override // U.p
    public Object b() {
        return this;
    }

    @Override // U.p
    public boolean d(CharSequence charSequence, int i, int i2, y yVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f835b)) {
            return true;
        }
        yVar.f858c = (yVar.f858c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f834a) {
            case 1:
                return "<" + this.f835b + '>';
            default:
                return super.toString();
        }
    }
}
