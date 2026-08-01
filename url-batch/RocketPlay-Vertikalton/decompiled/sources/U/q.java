package U;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1192a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1193b;

    public /* synthetic */ q(String str, int i) {
        this.f1192a = i;
        this.f1193b = str;
    }

    @Override // U.p
    public Object b() {
        return this;
    }

    @Override // U.p
    public boolean d(CharSequence charSequence, int i, int i2, y yVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f1193b)) {
            return true;
        }
        yVar.f1216c = (yVar.f1216c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f1192a) {
            case 1:
                return "<" + this.f1193b + '>';
            default:
                return super.toString();
        }
    }
}
