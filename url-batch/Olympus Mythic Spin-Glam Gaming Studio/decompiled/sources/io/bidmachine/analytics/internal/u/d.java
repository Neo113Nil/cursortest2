package io.bidmachine.analytics.internal.u;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.analytics.internal.u.c;
import io.bidmachine.protobuf.EventTypeExtended;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public interface d extends IInterface {

    public static final class a implements d {
        public static final C1765d c = new C1765d(null);
        private static final Lazy d = LazyKt.lazy(c.a);
        private static final b e;
        private static final b f;
        private static final b g;
        private static final b h;
        private static final b i;
        private static final b j;
        private static final b k;
        private static final b l;
        private static final b m;
        private static final b n;
        private static final b o;
        private static final b p;
        private static final b q;
        private static final b r;
        private static final b s;
        private final IBinder a;
        private final Function0 b;

        /* renamed from: io.bidmachine.analytics.internal.u.d$a$a, reason: collision with other inner class name */
        static final class C1764a extends Lambda implements Function0 {
            public static final C1764a a = new C1764a();

            C1764a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Parcel mo4828invoke() {
                return Parcel.obtain();
            }
        }

        public static final class b {
            private final int a;
            private final int b;
            private final int c;
            private final int d;
            private final int e;
            private final int f;
            private final int g;
            private final int h;

            public b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.d = i4;
                this.e = i5;
                this.f = i6;
                this.g = i7;
                this.h = i8;
            }

            public final b a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                return new b(i, i2, i3, i4, i5, i6, i7, i8);
            }

            public final int b() {
                return this.h;
            }

            public final int c() {
                return this.f;
            }

            public final int d() {
                return this.b;
            }

            public final int e() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h;
            }

            public final int f() {
                return this.g;
            }

            public final int g() {
                return this.e;
            }

            public final int h() {
                return this.a;
            }

            public int hashCode() {
                return (((((((((((((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.e)) * 31) + Integer.hashCode(this.f)) * 31) + Integer.hashCode(this.g)) * 31) + Integer.hashCode(this.h);
            }

            public String toString() {
                return super.toString();
            }

            public static /* synthetic */ b a(b bVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Object obj) {
                return bVar.a((i9 & 1) != 0 ? bVar.a : i, (i9 & 2) != 0 ? bVar.b : i2, (i9 & 4) != 0 ? bVar.c : i3, (i9 & 8) != 0 ? bVar.d : i4, (i9 & 16) != 0 ? bVar.e : i5, (i9 & 32) != 0 ? bVar.f : i6, (i9 & 64) != 0 ? bVar.g : i7, (i9 & 128) != 0 ? bVar.h : i8);
            }

            public final int a() {
                return this.d;
            }
        }

        static final class c extends Lambda implements Function0 {
            public static final c a = new c();

            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo4828invoke() {
                return io.bidmachine.analytics.internal.I.g.a("Y29tLmFuZHJvaWQudmVuZGluZy5iaWxsaW5nLklJbkFwcEJpbGxpbmdTZXJ2aWNl");
            }
        }

        /* renamed from: io.bidmachine.analytics.internal.u.d$a$d, reason: collision with other inner class name */
        public static final class C1765d {
            public /* synthetic */ C1765d(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a() {
                return a.f;
            }

            public final b b() {
                return a.g;
            }

            public final b c() {
                return a.h;
            }

            public final b d() {
                return a.i;
            }

            public final b e() {
                return a.j;
            }

            public final b f() {
                return a.k;
            }

            public final b g() {
                return a.l;
            }

            public final b h() {
                return a.m;
            }

            public final b i() {
                return a.n;
            }

            public final b j() {
                return a.o;
            }

            public final b k() {
                return a.p;
            }

            public final b l() {
                return a.q;
            }

            public final b m() {
                return a.r;
            }

            public final b n() {
                return a.s;
            }

            public final b o() {
                return a.e;
            }

            public final String p() {
                return (String) a.d.getValue();
            }

            private C1765d() {
            }

            public final b a(io.bidmachine.analytics.internal.a.f fVar) {
                c.r rVar = io.bidmachine.analytics.internal.u.c.j;
                return fVar.compareTo(rVar.r()) <= 0 ? a() : fVar.compareTo(rVar.s()) <= 0 ? b() : fVar.compareTo(rVar.t()) <= 0 ? c() : fVar.compareTo(rVar.u()) <= 0 ? d() : fVar.compareTo(rVar.v()) <= 0 ? e() : fVar.compareTo(rVar.w()) <= 0 ? f() : fVar.compareTo(rVar.x()) <= 0 ? g() : fVar.compareTo(rVar.y()) <= 0 ? h() : fVar.compareTo(rVar.z()) <= 0 ? i() : fVar.compareTo(rVar.A()) <= 0 ? j() : fVar.compareTo(rVar.B()) <= 0 ? k() : fVar.compareTo(rVar.C()) <= 0 ? l() : fVar.compareTo(rVar.D()) <= 0 ? m() : fVar.compareTo(rVar.E()) <= 0 ? n() : o();
            }
        }

        static {
            b bVar = new b(1, 27, 11, 26, 9, 6, EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE, 20);
            e = bVar;
            b a = b.a(bVar, 0, 17, 0, 9, 0, 0, 0, 17, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, null);
            f = a;
            g = a;
            b a2 = b.a(a, 0, 19, 0, 19, 0, 0, 0, 0, 245, null);
            h = a2;
            i = a2;
            b a3 = b.a(a2, 0, 20, 0, 0, 0, 0, 0, 20, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null);
            j = a3;
            k = a3;
            b a4 = b.a(a3, 0, 21, 0, 0, 0, 0, 0, 0, 253, null);
            l = a4;
            b a5 = b.a(a4, 0, 22, 0, 0, 0, 0, 0, 0, 253, null);
            m = a5;
            n = a5;
            o = a5;
            b a6 = b.a(a5, 0, 23, 0, 0, 0, 0, 0, 0, 253, null);
            p = a6;
            b a7 = b.a(a6, 0, 23, 0, 0, 0, 0, 0, 0, 253, null);
            q = a7;
            b a8 = b.a(a7, 0, 25, 0, 24, 0, 0, 0, 0, 245, null);
            r = a8;
            s = b.a(a8, 0, 27, 0, 26, 0, 0, 0, 0, 245, null);
        }

        public a(IBinder iBinder, Function0 function0) {
            this.a = iBinder;
            this.b = function0;
        }

        private final Parcel q() {
            Parcel parcel = (Parcel) this.b.mo4828invoke();
            parcel.writeInterfaceToken(c.p());
            return parcel;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        @Override // io.bidmachine.analytics.internal.u.d
        public int a(b bVar, String str, String str2) {
            Parcel q2 = q();
            q2.writeInt(bVar.d());
            q2.writeString(str);
            q2.writeString(str2);
            Parcel a = a(bVar.h(), q2);
            int readInt = a.readInt();
            a.recycle();
            return readInt;
        }

        @Override // io.bidmachine.analytics.internal.u.d
        public Bundle b(b bVar, String str, String str2, Bundle bundle) {
            Parcel q2 = q();
            q2.writeInt(bVar.a());
            q2.writeString(str);
            q2.writeString(str2);
            q2.writeString(null);
            a(q2, bundle);
            Parcel a = a(bVar.e(), q2);
            Bundle bundle2 = (Bundle) a(a, Bundle.CREATOR);
            a.recycle();
            return bundle2;
        }

        public /* synthetic */ a(IBinder iBinder, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(iBinder, (i2 & 2) != 0 ? C1764a.a : function0);
        }

        @Override // io.bidmachine.analytics.internal.u.d
        public Bundle a(b bVar, String str, String str2, Bundle bundle) {
            Parcel q2 = q();
            q2.writeInt(bVar.c());
            q2.writeString(str);
            q2.writeString(str2);
            q2.writeString(null);
            a(q2, bundle);
            Parcel a = a(bVar.g(), q2);
            Bundle bundle2 = (Bundle) a(a, Bundle.CREATOR);
            a.recycle();
            return bundle2;
        }

        @Override // io.bidmachine.analytics.internal.u.d
        public Bundle a(b bVar, String str, String str2, Bundle bundle, Bundle bundle2) {
            Parcel q2 = q();
            q2.writeInt(bVar.b());
            q2.writeString(str);
            q2.writeString(str2);
            a(q2, bundle);
            a(q2, bundle2);
            Parcel a = a(bVar.f(), q2);
            Bundle bundle3 = (Bundle) a(a, Bundle.CREATOR);
            a.recycle();
            return bundle3;
        }

        private final void a(Parcel parcel, Parcelable parcelable) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }

        public final Parcel a(int i2, Parcel parcel) {
            Parcel parcel2 = (Parcel) this.b.mo4828invoke();
            try {
                try {
                    this.a.transact(i2, parcel, parcel2, 0);
                    parcel2.readException();
                    return parcel2;
                } catch (RuntimeException e2) {
                    parcel2.recycle();
                    throw e2;
                }
            } finally {
                parcel.recycle();
            }
        }

        private final Parcelable a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() == 0) {
                return null;
            }
            Object createFromParcel = creator.createFromParcel(parcel);
            Intrinsics.checkNotNull(createFromParcel, "null cannot be cast to non-null type android.os.Parcelable");
            return (Parcelable) createFromParcel;
        }
    }

    int a(a.b bVar, String str, String str2);

    Bundle a(a.b bVar, String str, String str2, Bundle bundle);

    Bundle a(a.b bVar, String str, String str2, Bundle bundle, Bundle bundle2);

    Bundle b(a.b bVar, String str, String str2, Bundle bundle);
}
