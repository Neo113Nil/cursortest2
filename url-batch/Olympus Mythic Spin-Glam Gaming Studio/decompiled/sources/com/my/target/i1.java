package com.my.target;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.my.target.common.MyTargetConfig;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
final class i1 extends t4 {
    private static final int[] b = m0.a(260, 272, 268, 276, 516, IronSourceError.ERROR_NO_INTERNET_CONNECTION, 532, 528, IronSourceError.ERROR_PLACEMENT_CAPPED, 512, 264, 256, 280);
    private Method a;

    i1() {
        try {
            this.a = BluetoothDevice.class.getMethod("isConnected", null);
        } catch (Throwable unused) {
        }
    }

    private static List a(BluetoothAdapter bluetoothAdapter, Method method) {
        Object invoke;
        ArrayList arrayList = new ArrayList();
        try {
            for (BluetoothDevice bluetoothDevice : bluetoothAdapter.getBondedDevices()) {
                if (Arrays.binarySearch(b, bluetoothDevice.getBluetoothClass().getDeviceClass()) < 0 && (invoke = method.invoke(bluetoothDevice, null)) != null && ((Boolean) invoke).booleanValue()) {
                    String name = bluetoothDevice.getName();
                    if (!TextUtils.isEmpty(name)) {
                        arrayList.add(new String(Base64.encode(name.getBytes(), 2), StandardCharsets.UTF_8));
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    Map a(MyTargetConfig myTargetConfig, Context context) {
        BluetoothAdapter defaultAdapter;
        HashMap hashMap = new HashMap();
        if (this.a != null && t4.a("android.permission.BLUETOOTH", context) && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && defaultAdapter.isEnabled()) {
            List a = a(defaultAdapter, this.a);
            if (!a.isEmpty()) {
                hashMap.put("bdn", m0.a(a));
            }
        }
        return hashMap;
    }
}
