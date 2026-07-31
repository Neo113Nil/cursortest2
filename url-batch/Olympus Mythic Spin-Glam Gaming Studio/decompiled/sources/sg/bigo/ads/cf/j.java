package sg.bigo.ads.cf;

import android.os.Parcel;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import sg.bigo.ads.an.n;

/* loaded from: classes8.dex */
public class j implements sg.bigo.ads.an.f {
    String a;
    public boolean b;
    private String c;

    public j() {
    }

    public j(String str, String str2, boolean z) {
        this.c = str;
        this.a = str2;
        this.b = z;
    }

    @Override // sg.bigo.ads.an.f
    @CallSuper
    public void a(@NonNull Parcel parcel) {
        parcel.writeString(this.c);
        parcel.writeString(this.a);
        n.a(parcel, this.b);
    }

    @Override // sg.bigo.ads.an.f
    @CallSuper
    public void b(@NonNull Parcel parcel) {
        this.c = n.a(parcel, "");
        this.a = n.a(parcel, "");
        this.b = n.b(parcel, false);
    }

    @NonNull
    public String toString() {
        return super.toString();
    }
}
