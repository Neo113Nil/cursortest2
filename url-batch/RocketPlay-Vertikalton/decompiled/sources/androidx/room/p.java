package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class p extends Binder implements l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2079c;

    public p(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2079c = multiInstanceInvalidationService;
        attachInterface(this, l.f2065b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = l.f2065b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        k kVar = null;
        k kVar2 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(k.f2064a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof k)) {
                    j jVar = new j();
                    jVar.f2063c = readStrongBinder;
                    kVar = jVar;
                } else {
                    kVar = (k) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            i1.f.e(kVar, "callback");
            int i3 = 0;
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2079c;
                synchronized (multiInstanceInvalidationService.f2050c) {
                    try {
                        int i4 = multiInstanceInvalidationService.f2048a + 1;
                        multiInstanceInvalidationService.f2048a = i4;
                        if (multiInstanceInvalidationService.f2050c.register(kVar, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.f2049b.put(Integer.valueOf(i4), readString);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.f2048a--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(k.f2064a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof k)) {
                    j jVar2 = new j();
                    jVar2.f2063c = readStrongBinder2;
                    kVar2 = jVar2;
                } else {
                    kVar2 = (k) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            i1.f.e(kVar2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f2079c;
            synchronized (multiInstanceInvalidationService2.f2050c) {
                multiInstanceInvalidationService2.f2050c.unregister(kVar2);
            }
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int readInt2 = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            i1.f.e(createStringArray, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f2079c;
            synchronized (multiInstanceInvalidationService3.f2050c) {
                String str2 = (String) multiInstanceInvalidationService3.f2049b.get(Integer.valueOf(readInt2));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int beginBroadcast = multiInstanceInvalidationService3.f2050c.beginBroadcast();
                    for (int i5 = 0; i5 < beginBroadcast; i5++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService3.f2050c.getBroadcastCookie(i5);
                            i1.f.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.f2049b.get(num);
                            if (readInt2 != intValue && str2.equals(str3)) {
                                try {
                                    ((k) multiInstanceInvalidationService3.f2050c.getBroadcastItem(i5)).a(createStringArray);
                                } catch (RemoteException e2) {
                                    Log.w("ROOM", "Error invoking a remote callback", e2);
                                }
                            }
                        } finally {
                            multiInstanceInvalidationService3.f2050c.finishBroadcast();
                        }
                    }
                }
            }
        }
        return true;
    }
}
