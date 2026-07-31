package sg.bigo.ads.cg;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.ai.j;
import sg.bigo.ads.an.l;
import sg.bigo.ads.an.n;

/* loaded from: classes14.dex */
public final class d implements sg.bigo.ads.an.f, l {
    public int a = 3;
    public int b = 2;
    public int c = 12;
    public int d = 3;
    public int e = 3;
    public int f = 10;
    public int g = 5;
    private j h;

    public d(j jVar) {
        this.h = jVar;
    }

    private boolean a(int i) {
        j jVar = this.h;
        sg.bigo.ads.ai.l n = jVar != null ? jVar.n() : null;
        if (n != null) {
            return n.a(i);
        }
        return false;
    }

    @Override // sg.bigo.ads.an.l
    public final int a() {
        return this.a;
    }

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        this.a = n.a(parcel, 3);
        this.b = n.a(parcel, 2);
        this.c = n.a(parcel, 12);
        this.d = n.a(parcel, 3);
        this.e = n.a(parcel, 3);
        this.f = n.a(parcel, 10);
        this.g = n.a(parcel, 5);
    }

    @Override // sg.bigo.ads.an.l
    public final boolean b() {
        return a(13);
    }

    @Override // sg.bigo.ads.an.l
    public final int c() {
        return this.b;
    }

    @Override // sg.bigo.ads.an.l
    public final boolean d() {
        return a(13);
    }

    @Override // sg.bigo.ads.an.l
    public final int e() {
        return this.c;
    }

    @Override // sg.bigo.ads.an.l
    public final boolean f() {
        return a(10);
    }

    @Override // sg.bigo.ads.an.l
    public final int g() {
        return this.d;
    }

    @Override // sg.bigo.ads.an.l
    public final boolean h() {
        return a(11);
    }

    @Override // sg.bigo.ads.an.l
    public final int i() {
        return this.e;
    }

    @Override // sg.bigo.ads.an.l
    public final boolean j() {
        return a(12);
    }

    @Override // sg.bigo.ads.an.l
    public final int k() {
        return this.f;
    }

    @Override // sg.bigo.ads.an.l
    public final boolean l() {
        return a(11);
    }

    @Override // sg.bigo.ads.an.l
    public final int m() {
        return this.g;
    }

    @Override // sg.bigo.ads.an.l
    public final boolean n() {
        return a(12);
    }

    @Override // sg.bigo.ads.an.l
    public final boolean o() {
        return a(18);
    }

    @Override // sg.bigo.ads.an.l
    public final boolean p() {
        return a(13);
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }
}
