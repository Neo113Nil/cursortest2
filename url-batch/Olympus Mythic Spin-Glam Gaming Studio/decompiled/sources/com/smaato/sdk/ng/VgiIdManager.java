package com.smaato.sdk.ng;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.BatteryManager;
import android.os.Build;
import android.text.TextUtils;
import com.smaato.sdk.ng.location.NextGenLocationManager;
import com.smaato.sdk.ng.models.IdApp;
import com.smaato.sdk.ng.models.IdBattery;
import com.smaato.sdk.ng.models.IdDevice;
import com.smaato.sdk.ng.models.IdGgl;
import com.smaato.sdk.ng.models.IdLocation;
import com.smaato.sdk.ng.models.IdModel;
import com.smaato.sdk.ng.models.IdOs;
import com.smaato.sdk.ng.models.IdPrivacy;
import com.smaato.sdk.ng.models.IdUser;
import com.smaato.sdk.ng.models.IdUserVendor;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.NGSDKCrypto;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class VgiIdManager {
    private static final String d = "VgiIdManager";
    private final Context a;
    private final SharedPreferences b;
    private final String c;

    public VgiIdManager(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = applicationContext.getSharedPreferences("com.smaato.sdk.ng.vgiid", 0);
        this.c = NextGen.getAppToken();
    }

    private List<IdApp> a(UserDataManager userDataManager, DeviceInfo deviceInfo) {
        ArrayList arrayList = new ArrayList();
        IdApp idApp = new IdApp();
        IdPrivacy idPrivacy = new IdPrivacy();
        idPrivacy.iab_ccpa = userDataManager.getIABUSPrivacyString();
        idPrivacy.tcfv2 = userDataManager.getIABGDPRConsentString();
        idPrivacy.lat = Boolean.valueOf(deviceInfo.limitTracking());
        idApp.bundle_id = NextGen.getBundleId();
        idApp.privacy = idPrivacy;
        arrayList.add(idApp);
        return arrayList;
    }

    public IdModel getVgiIdModel() {
        String string = this.b.getString("VGI_id", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                String decryptString = NGSDKCrypto.decryptString(string, this.c);
                return new IdModel(decryptString != null ? new JSONObject(decryptString) : new JSONObject());
            } catch (Exception e) {
                Logger.e(d, e.getMessage());
                NextGen.reportException(e);
            }
        }
        return null;
    }

    public void init() {
        UserDataManager userDataManager = NextGen.getUserDataManager();
        DeviceInfo deviceInfo = NextGen.getDeviceInfo();
        NextGenLocationManager locationManager = NextGen.getLocationManager();
        IdModel idModel = new IdModel();
        idModel.apps = a(userDataManager, deviceInfo);
        idModel.device = a(deviceInfo);
        idModel.users = a(deviceInfo, locationManager);
        setVgiIdModel(idModel);
    }

    public void setVgiIdModel(IdModel idModel) {
        if (idModel != null) {
            try {
                String encryptString = NGSDKCrypto.encryptString(idModel.toJson().toString(), this.c);
                SharedPreferences.Editor edit = this.b.edit();
                edit.putString("VGI_id", encryptString);
                edit.apply();
            } catch (Exception e) {
                Logger.e(d, e.getMessage());
                NextGen.reportException(e);
            }
        }
    }

    private Boolean b(Context context) {
        BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
        if (batteryManager != null) {
            return Boolean.valueOf(batteryManager.isCharging());
        }
        return null;
    }

    private IdDevice a(DeviceInfo deviceInfo) {
        IdDevice idDevice = new IdDevice();
        idDevice.id = Build.ID;
        IdOs idOs = new IdOs();
        idOs.name = "Android";
        idOs.version = deviceInfo.getOSVersion();
        IdBattery idBattery = new IdBattery();
        long a = a(this.a);
        Long valueOf = Long.valueOf(a);
        if (a != -1) {
            idBattery.capacity = String.valueOf(valueOf);
        }
        idBattery.charging = b(this.a);
        idDevice.os = idOs;
        idDevice.manufacture = Build.MANUFACTURER;
        idDevice.model = Build.MODEL;
        idDevice.brand = Build.BRAND;
        idDevice.battery = idBattery;
        return idDevice;
    }

    private List<IdUser> a(DeviceInfo deviceInfo, NextGenLocationManager nextGenLocationManager) {
        ArrayList arrayList = new ArrayList();
        IdUser idUser = new IdUser();
        IdUserVendor idUserVendor = new IdUserVendor();
        IdGgl idGgl = new IdGgl();
        idGgl.GAID = deviceInfo.getAdvertisingId();
        idUserVendor.GGL = idGgl;
        ArrayList arrayList2 = new ArrayList();
        IdLocation idLocation = new IdLocation();
        if (nextGenLocationManager != null && nextGenLocationManager.getUserLocation() != null) {
            Location userLocation = nextGenLocationManager.getUserLocation();
            Locale locale = Locale.ENGLISH;
            idLocation.lat = String.format(locale, "%.2f", Double.valueOf(userLocation.getLatitude()));
            idLocation.lon = String.format(locale, "%.2f", Double.valueOf(userLocation.getLongitude()));
            idLocation.accuracy = String.valueOf(userLocation.getAccuracy());
            idLocation.ts = String.valueOf(userLocation.getTime());
        }
        arrayList2.add(idLocation);
        idUser.vendors = idUserVendor;
        idUser.locations = arrayList2;
        arrayList.add(idUser);
        return arrayList;
    }

    private long a(Context context) {
        BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
        if (batteryManager == null) {
            return -1L;
        }
        int intProperty = batteryManager.getIntProperty(1);
        int intProperty2 = batteryManager.getIntProperty(4);
        if (intProperty == Integer.MIN_VALUE || intProperty2 == Integer.MIN_VALUE || intProperty2 == 0) {
            return -1L;
        }
        return (intProperty / intProperty2) * 100;
    }
}
