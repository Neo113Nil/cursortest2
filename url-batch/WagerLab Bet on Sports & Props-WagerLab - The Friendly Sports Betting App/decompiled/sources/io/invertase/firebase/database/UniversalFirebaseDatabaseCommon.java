package io.invertase.firebase.database;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Logger;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import io.invertase.firebase.common.UniversalFirebasePreferences;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class UniversalFirebaseDatabaseCommon {
    private static HashMap<String, Boolean> configSettingsLock = new HashMap<>();
    private static HashMap<String, HashMap<String, Object>> emulatorConfigs = new HashMap<>();

    static FirebaseDatabase getDatabaseForApp(String str, String str2) {
        FirebaseDatabase firebaseDatabase;
        if (str2 != null && str2.length() > 0) {
            if (str != null && str.length() > 0) {
                firebaseDatabase = FirebaseDatabase.getInstance(FirebaseApp.getInstance(str), str2);
            } else {
                firebaseDatabase = FirebaseDatabase.getInstance(str2);
            }
        } else {
            firebaseDatabase = FirebaseDatabase.getInstance(FirebaseApp.getInstance(str));
        }
        setDatabaseConfig(firebaseDatabase, str, str2);
        HashMap<String, Object> emulatorConfig = getEmulatorConfig(str, str2);
        if (emulatorConfig != null) {
            firebaseDatabase.useEmulator((String) emulatorConfig.get(DiagnosticsTracker.HOST_KEY), ((Integer) emulatorConfig.get("port")).intValue());
        }
        return firebaseDatabase;
    }

    private static void setDatabaseConfig(FirebaseDatabase firebaseDatabase, String str, String str2) {
        String str3 = str + str2;
        if (configSettingsLock.containsKey(str3)) {
            return;
        }
        UniversalFirebasePreferences sharedInstance = UniversalFirebasePreferences.getSharedInstance();
        try {
            firebaseDatabase.setPersistenceEnabled(sharedInstance.getBooleanValue(UniversalDatabaseStatics.DATABASE_PERSISTENCE_ENABLED, false));
            if (sharedInstance.getBooleanValue(UniversalDatabaseStatics.DATABASE_LOGGING_ENABLED, false)) {
                firebaseDatabase.setLogLevel(Logger.Level.DEBUG);
            } else {
                firebaseDatabase.setLogLevel(Logger.Level.WARN);
            }
            if (sharedInstance.contains(UniversalDatabaseStatics.DATABASE_PERSISTENCE_CACHE_SIZE)) {
                firebaseDatabase.setPersistenceCacheSizeBytes(sharedInstance.getLongValue(UniversalDatabaseStatics.DATABASE_PERSISTENCE_CACHE_SIZE, 10485760L));
            }
        } catch (DatabaseException e) {
            if (!e.getMessage().contains("must be made before any other usage of FirebaseDatabase")) {
                throw e;
            }
        }
        configSettingsLock.put(str3, true);
    }

    static void addEmulatorConfig(String str, String str2, String str3, int i) {
        String str4 = str + str2;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(DiagnosticsTracker.HOST_KEY, str3);
        hashMap.put("port", Integer.valueOf(i));
        emulatorConfigs.put(str4, hashMap);
    }

    private static HashMap<String, Object> getEmulatorConfig(String str, String str2) {
        return emulatorConfigs.get(str + str2);
    }
}
