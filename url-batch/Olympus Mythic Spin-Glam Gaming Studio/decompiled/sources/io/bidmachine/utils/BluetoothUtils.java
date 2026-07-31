package io.bidmachine.utils;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Utils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressLint({"MissingPermission"})
/* loaded from: classes11.dex */
public class BluetoothUtils {
    private static final int[] profileArray = {1};
    private static final Map<Integer, BluetoothProfile> proxyMap = new HashMap(1);
    private static final BluetoothProfile.ServiceListener listener = new a();
    private static boolean isRegistered = false;

    class a implements BluetoothProfile.ServiceListener {
        a() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            BluetoothUtils.proxyMap.put(Integer.valueOf(i), bluetoothProfile);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i) {
        }
    }

    @Nullable
    private static Set<String> getConnectedDevices(@NonNull Context context, @Nullable Integer num) {
        if (!Utils.isPermissionGranted(context, "android.permission.BLUETOOTH")) {
            return null;
        }
        try {
            if (BluetoothAdapter.getDefaultAdapter() == null) {
                return null;
            }
            HashSet hashSet = new HashSet();
            try {
                for (Map.Entry<Integer, BluetoothProfile> entry : proxyMap.entrySet()) {
                    if (num == null || entry.getKey().equals(num)) {
                        BluetoothProfile value = entry.getValue();
                        if (value != null) {
                            Iterator<BluetoothDevice> it = value.getConnectedDevices().iterator();
                            while (it.hasNext()) {
                                String name = it.next().getName();
                                if (!TextUtils.isEmpty(name)) {
                                    hashSet.add(name);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return hashSet;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Nullable
    public static Set<String> getConnectedHeadsets(@NonNull Context context) {
        return getConnectedDevices(context, 1);
    }

    @Nullable
    public static Boolean isHeadsetConnected(@NonNull Context context) {
        if (!Utils.isPermissionGranted(context, "android.permission.BLUETOOTH")) {
            return null;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            boolean z = true;
            if ((defaultAdapter != null ? defaultAdapter.getProfileConnectionState(1) : -1) != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void register(@Nullable Context context) {
        BluetoothAdapter defaultAdapter;
        if (context == null || context.getApplicationContext() == null || isRegistered || !Utils.isPermissionGranted(context, "android.permission.BLUETOOTH")) {
            return;
        }
        try {
            defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        } catch (Exception unused) {
        }
        if (defaultAdapter == null) {
            return;
        }
        for (int i : profileArray) {
            defaultAdapter.getProfileProxy(context.getApplicationContext(), listener, i);
        }
        isRegistered = true;
    }
}
