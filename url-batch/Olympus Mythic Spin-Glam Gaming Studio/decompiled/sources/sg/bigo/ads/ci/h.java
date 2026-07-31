package sg.bigo.ads.ci;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.ai.m;
import sg.bigo.ads.an.n;

/* loaded from: classes5.dex */
public final class h implements m, sg.bigo.ads.an.f {
    boolean a = true;
    boolean b = false;
    int c = 0;

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        n.a(parcel, this.a);
        n.a(parcel, this.b);
        parcel.writeInt(this.c);
    }

    @Override // sg.bigo.ads.ai.m
    public final boolean a() {
        return this.a;
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        this.a = n.b(parcel, true);
        this.a = n.b(parcel, false);
        this.c = n.a(parcel, 0);
    }

    @Override // sg.bigo.ads.ai.m
    public final boolean b() {
        return this.b;
    }

    @Override // sg.bigo.ads.ai.m
    public final int c() {
        return this.c;
    }

    @NonNull
    public final String toString() {
        return "{isNativeVideoClickable=" + this.a + ", isNativeVideoClickable=" + this.a + ", clickTriggerType=" + this.c + '}';
    }
}
