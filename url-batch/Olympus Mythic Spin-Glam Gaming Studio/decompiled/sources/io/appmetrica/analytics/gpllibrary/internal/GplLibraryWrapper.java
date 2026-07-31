package io.appmetrica.analytics.gpllibrary.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.concurrent.Executor;

/* loaded from: classes15.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";
    private final FusedLocationProviderClient a;
    private final LocationListener b;
    private final LocationCallback c;
    private final Looper d;
    private final Executor e;
    private final long f;

    public static class ClientProvider {
        private final Context a;

        ClientProvider(Context context) {
            this.a = context;
        }

        final FusedLocationProviderClient a() {
            return LocationServices.getFusedLocationProviderClient(this.a);
        }
    }

    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(@NonNull Context context, @NonNull LocationListener locationListener, @NonNull Looper looper, @NonNull Executor executor, long j) throws Throwable {
        this(new ClientProvider(context), locationListener, looper, executor, j);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void startLocationUpdates(@NonNull Priority priority) throws Throwable {
        FusedLocationProviderClient fusedLocationProviderClient = this.a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f);
        int ordinal = priority.ordinal();
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? 105 : 100 : 102 : 104), this.c, this.d);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() throws Throwable {
        this.a.removeLocationUpdates(this.c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void updateLastKnownLocation() throws Throwable {
        this.a.getLastLocation().addOnSuccessListener(this.e, new GplOnSuccessListener(this.b));
    }

    GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j) {
        this.a = clientProvider.a();
        this.b = locationListener;
        this.d = looper;
        this.e = executor;
        this.f = j;
        this.c = new GplLocationCallback(locationListener);
    }
}
