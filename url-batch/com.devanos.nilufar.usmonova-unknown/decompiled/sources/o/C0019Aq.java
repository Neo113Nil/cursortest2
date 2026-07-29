package o;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* renamed from: o.Aq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019Aq extends X {
    public static final Parcelable.Creator<C0019Aq> CREATOR = new J1(22);
    public static final Scope[] v = new Scope[0];
    public static final C0300Ll[] w = new C0300Ll[0];
    public final int h;
    public final int i;
    public final int j;
    public String k;
    public IBinder l;
    public Scope[] m;
    public Bundle n;

    /* renamed from: o, reason: collision with root package name */
    public Account f13o;
    public C0300Ll[] p;
    public C0300Ll[] q;
    public final boolean r;
    public final int s;
    public final boolean t;
    public final String u;

    public C0019Aq(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C0300Ll[] c0300LlArr, C0300Ll[] c0300LlArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? v : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        C0300Ll[] c0300LlArr3 = w;
        c0300LlArr = c0300LlArr == null ? c0300LlArr3 : c0300LlArr;
        c0300LlArr2 = c0300LlArr2 == null ? c0300LlArr3 : c0300LlArr2;
        this.h = i;
        this.i = i2;
        this.j = i3;
        if ("com.google.android.gms".equals(str)) {
            this.k = "com.google.android.gms";
        } else {
            this.k = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = AbstractBinderC1009f1.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface o30Var = queryLocalInterface instanceof InterfaceC1130gs ? (InterfaceC1130gs) queryLocalInterface : new o30(iBinder);
                if (o30Var != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = ((o30) o30Var).a();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f13o = account2;
        } else {
            this.l = iBinder;
            this.f13o = account;
        }
        this.m = scopeArr;
        this.n = bundle;
        this.p = c0300LlArr;
        this.q = c0300LlArr2;
        this.r = z;
        this.s = i4;
        this.t = z2;
        this.u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        J1.a(this, parcel, i);
    }
}
