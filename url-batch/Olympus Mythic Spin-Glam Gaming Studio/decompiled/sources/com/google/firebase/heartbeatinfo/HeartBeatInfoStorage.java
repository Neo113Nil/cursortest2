package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
class HeartBeatInfoStorage {
    private final SharedPreferences firebaseSharedPreferences;

    public HeartBeatInfoStorage(Context context, String str) {
        this.firebaseSharedPreferences = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    synchronized void deleteAllHeartBeats() {
        try {
            SharedPreferences.Editor edit = this.firebaseSharedPreferences.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String formattedDate = getFormattedDate(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(formattedDate)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(formattedDate);
                        i++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized List getAllHeartBeats() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(getFormattedDate(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(HeartBeatResult.create(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            updateGlobalHeartBeat(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private synchronized String getStoredUserAgentString(String str) {
        for (Map.Entry<String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void updateStoredUserAgent(String str, String str2) {
        removeStoredDate(str2);
        HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.firebaseSharedPreferences.edit().putStringSet(str, hashSet).commit();
    }

    private synchronized void removeStoredDate(String str) {
        try {
            String storedUserAgentString = getStoredUserAgentString(str);
            if (storedUserAgentString == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(storedUserAgentString, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.firebaseSharedPreferences.edit().remove(storedUserAgentString).commit();
            } else {
                this.firebaseSharedPreferences.edit().putStringSet(storedUserAgentString, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized String getFormattedDate(long j) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j).toInstant();
            zoneOffset = ZoneOffset.UTC;
            atOffset = instant.atOffset(zoneOffset);
            localDateTime = atOffset.toLocalDateTime();
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(dateTimeFormatter);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    synchronized void storeHeartBeat(long j, String str) {
        String formattedDate = getFormattedDate(j);
        if (this.firebaseSharedPreferences.getString("last-used-date", "").equals(formattedDate)) {
            String storedUserAgentString = getStoredUserAgentString(formattedDate);
            if (storedUserAgentString == null) {
                return;
            }
            if (storedUserAgentString.equals(str)) {
                return;
            }
            updateStoredUserAgent(str, formattedDate);
            return;
        }
        long j2 = this.firebaseSharedPreferences.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            cleanUpStoredHeartBeats();
            j2 = this.firebaseSharedPreferences.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(str, new HashSet()));
        hashSet.add(formattedDate);
        this.firebaseSharedPreferences.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", formattedDate).commit();
    }

    private synchronized void cleanUpStoredHeartBeats() {
        try {
            long j = this.firebaseSharedPreferences.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.firebaseSharedPreferences.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void updateGlobalHeartBeat(long j) {
        this.firebaseSharedPreferences.edit().putLong("fire-global", j).commit();
    }
}
