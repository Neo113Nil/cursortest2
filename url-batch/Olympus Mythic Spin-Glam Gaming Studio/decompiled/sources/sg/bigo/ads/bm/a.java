package sg.bigo.ads.bm;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.an.f;
import sg.bigo.ads.common.utils.s;

/* loaded from: classes6.dex */
public final class a implements f {
    private static final long a = s.c.a(1);
    private final Context b;
    private boolean c;
    private double d;
    private double e;
    private String f;
    private String g;
    private String h;
    private long i;

    public a(@NonNull Context context) {
        this(context, (byte) 0);
    }

    private a(@NonNull Context context, byte b) {
        this.c = false;
        this.b = context;
        this.i = 0L;
    }

    public a(@NonNull Context context, @NonNull Parcel parcel) {
        this.c = false;
        this.b = context;
        b(parcel);
    }

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeLong(this.i);
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        this.d = parcel.readDouble();
        this.e = parcel.readDouble();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readLong();
    }

    public final String toString() {
        return "{longitude=" + this.d + ", latitude=" + this.e + ", countryCode='" + this.f + "', state='" + this.g + "', city='" + this.h + "', updateTime='" + this.i + "'}";
    }
}
