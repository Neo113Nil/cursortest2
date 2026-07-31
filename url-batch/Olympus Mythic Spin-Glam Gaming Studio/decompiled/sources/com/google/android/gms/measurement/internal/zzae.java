package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes5.dex */
final class zzae extends zzpg {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzae(zzpv zzpvVar) {
        super(zzpvVar);
    }

    private final zzy zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzf(int i, int i2) {
        BitSet bitSet;
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i));
        if (zzyVar == null) {
            return false;
        }
        bitSet = zzyVar.zze;
        return bitSet.get(i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:2|(2:4|(2:6|7)(1:524))(2:525|526))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(14:(7:25|26|27|28|(1:30)(3:499|(1:501)(1:503)|502)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:458|(6:459|460|461|462|463|(1:466)(1:465))|467)|44|(1:46)(6:287|(11:289|290|291|292|293|(1:(4:295|(1:297)|298|299))(1:442)|302|303|(3:398|(6:401|(2:437|438)(2:405|(8:411|412|(4:415|(2:417|418)(1:420)|419|413)|421|422|(4:425|(3:427|428|429)(1:431)|430|423)|432|433)(4:407|408|409|410))|434|435|410|399)|440)|305|306)(1:457)|307|(10:310|(3:314|(4:317|(5:319|320|(1:322)(1:326)|323|324)(1:327)|325|315)|328)|329|(3:333|(4:336|(3:341|342|343)|344|334)|347)|348|(3:350|(6:353|(2:355|(3:357|358|359))(1:362)|360|361|359|351)|363)|364|(3:373|(8:376|(1:378)|379|(1:381)|382|(3:384|385|386)(1:388)|387|374)|389)|390|308)|396|397)|47|(3:181|(6:184|(2:186|(9:192|193|(12:195|196|197|198|199|200|201|202|203|204|(2:(9:206|207|208|209|210|(3:212|213|214)(1:262)|215|216|(1:219)(1:218))|220)(3:266|267|268)|221)(1:284)|222|(4:225|(3:243|244|245)(6:227|228|(2:229|(2:231|(1:233)(2:234|235))(2:241|242))|(1:237)|238|239)|240|223)|246|247|248|191)(1:188))(1:285)|189|190|191|182)|286)|49|(6:51|(3:53|(6:56|(8:58|59|60|61|62|63|64|(3:(9:66|67|68|69|70|(1:72)(1:129)|73|74|(1:77)(1:76))|78|79)(4:136|137|128|79))(1:154)|80|(2:81|(2:83|(3:119|120|121)(8:85|(2:86|(4:88|(3:90|(1:92)(1:115)|93)(1:116)|94|(1:1)(2:98|(1:100)(2:101|102)))(2:117|118))|109|(1:111)(1:113)|112|104|105|106))(0))|122|54)|155)|156|(9:159|160|161|162|163|164|(2:166|167)(1:169)|168|157)|177|178)(2:179|180))(2:507|508))|523|36|37|38|39|40|(0)(0)|44|(0)(0)|47|(0)|49|(0)(0)|(4:(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x09b4, code lost:
    
        if (r13 != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0896, code lost:
    
        if (r13 == null) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x02ee, code lost:
    
        if (r5 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x01bb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x01bc, code lost:
    
        r18 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0229, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x022a, code lost:
    
        r18 = "audience_id";
        r19 = "data";
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0232, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0227, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x022f, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0170, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01aa A[Catch: all -> 0x01b8, SQLiteException -> 0x01bb, TRY_LEAVE, TryCatch #19 {all -> 0x01b8, blocks: (B:40:0x01a4, B:42:0x01aa, B:458:0x01c2, B:459:0x01c7, B:461:0x01d1, B:462:0x01e1, B:463:0x020d, B:476:0x01f0, B:479:0x0200, B:482:0x0206, B:470:0x0233), top: B:39:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x01c2 A[Catch: all -> 0x01b8, SQLiteException -> 0x01bb, TRY_ENTER, TryCatch #19 {all -> 0x01b8, blocks: (B:40:0x01a4, B:42:0x01aa, B:458:0x01c2, B:459:0x01c7, B:461:0x01d1, B:462:0x01e1, B:463:0x020d, B:476:0x01f0, B:479:0x0200, B:482:0x0206, B:470:0x0233), top: B:39:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x079f  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final List zza(String str, List list, List list2, Long l, Long l2, boolean z) {
        int i;
        int i2;
        boolean z2;
        Cursor cursor;
        Map map;
        String str2;
        String str3;
        Cursor cursor2;
        ?? r13;
        String str4;
        ArrayMap arrayMap;
        String str5;
        String str6;
        String str7;
        String str8;
        List<com.google.android.gms.internal.measurement.zzfj> list3;
        String str9;
        ?? r5;
        Cursor cursor3;
        Map map2;
        Iterator it;
        String str10;
        zzz zzzVar;
        Iterator it2;
        String str11;
        long j;
        String str12;
        Iterator it3;
        Map map3;
        Iterator it4;
        Cursor cursor4;
        List list4;
        Iterator it5;
        String str13;
        Map map4;
        String str14;
        com.google.android.gms.internal.measurement.zzfr zzfrVar;
        zzio zzioVar;
        Integer num;
        Cursor cursor5;
        Cursor cursor6;
        List list5;
        ArrayMap arrayMap2;
        Cursor cursor7;
        Cursor cursor8;
        List list6;
        String str15 = "current_results";
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l;
        this.zze = l2;
        Iterator it6 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it6.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzhm) it6.next()).zzh())) {
                z2 = true;
                break;
            }
        }
        com.google.android.gms.internal.measurement.zzpq.zzb();
        zzio zzioVar2 = this.zzu;
        boolean zzx = zzioVar2.zzf().zzx(this.zza, zzgi.zzaE);
        com.google.android.gms.internal.measurement.zzpq.zzb();
        boolean zzx2 = zzioVar2.zzf().zzx(this.zza, zzgi.zzaD);
        if (z2) {
            zzaw zzj = this.zzg.zzj();
            String str16 = this.zza;
            zzj.zzav();
            zzj.zzg();
            Preconditions.checkNotEmpty(str16);
            ContentValues contentValues = new ContentValues();
            ?? r52 = "current_session_count";
            contentValues.put("current_session_count", (Integer) 0);
            try {
                r52 = "events";
                zzj.zzj().update("events", contentValues, "app_id = ?", new String[]{str16});
                cursor = "events";
            } catch (SQLiteException e) {
                zzj.zzu.zzaW().zze().zzc("Error resetting session-scoped event counts. appId", zzhe.zzn(str16), e);
                cursor = r52;
            }
        }
        Map emptyMap = Collections.emptyMap();
        String str17 = "Failed to merge filter. appId";
        String str18 = "Database error querying filters. appId";
        String str19 = "data";
        String str20 = "audience_id";
        try {
            if (zzx2 && zzx) {
                zzaw zzj2 = this.zzg.zzj();
                String str21 = this.zza;
                Preconditions.checkNotEmpty(str21);
                ArrayMap arrayMap3 = new ArrayMap();
                try {
                    try {
                        cursor8 = zzj2.zzj().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str21}, null, null, null);
                        try {
                        } catch (SQLiteException e2) {
                            e = e2;
                            zzj2.zzu.zzaW().zze().zzc("Database error querying filters. appId", zzhe.zzn(str21), e);
                            emptyMap = Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor7 = cursor;
                        if (cursor7 != null) {
                            cursor7.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    cursor8 = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor7 = null;
                    if (cursor7 != null) {
                    }
                    throw th;
                }
                if (cursor8.moveToFirst()) {
                    while (true) {
                        try {
                            com.google.android.gms.internal.measurement.zzfj zzfjVar = (com.google.android.gms.internal.measurement.zzfj) ((com.google.android.gms.internal.measurement.zzfi) zzqa.zzp(com.google.android.gms.internal.measurement.zzfj.zzc(), cursor8.getBlob(i2))).zzba();
                            if (zzfjVar.zzo()) {
                                Integer valueOf = Integer.valueOf(cursor8.getInt(i));
                                List list7 = (List) arrayMap3.get(valueOf);
                                if (list7 == null) {
                                    list6 = new ArrayList();
                                    arrayMap3.put(valueOf, list6);
                                } else {
                                    list6 = list7;
                                }
                                list6.add(zzfjVar);
                            }
                        } catch (IOException e4) {
                            zzj2.zzu.zzaW().zze().zzc("Failed to merge filter. appId", zzhe.zzn(str21), e4);
                        }
                        if (!cursor8.moveToNext()) {
                            break;
                        }
                        i = 0;
                        i2 = 1;
                    }
                    cursor8.close();
                    map = arrayMap3;
                    zzaw zzj3 = this.zzg.zzj();
                    String str22 = this.zza;
                    zzj3.zzav();
                    zzj3.zzg();
                    Preconditions.checkNotEmpty(str22);
                    cursor2 = zzj3.zzj().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str22}, null, null, null);
                    if (cursor2.moveToFirst()) {
                        Map emptyMap2 = Collections.emptyMap();
                        cursor2.close();
                        r13 = emptyMap2;
                        str2 = "audience_id";
                        str3 = "data";
                    } else {
                        ArrayMap arrayMap4 = new ArrayMap();
                        while (true) {
                            int i3 = cursor2.getInt(0);
                            try {
                                arrayMap4.put(Integer.valueOf(i3), (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzib) zzqa.zzp(com.google.android.gms.internal.measurement.zzic.zze(), cursor2.getBlob(1))).zzba());
                                arrayMap2 = arrayMap4;
                                str2 = str20;
                                str3 = str19;
                            } catch (IOException e5) {
                                arrayMap2 = arrayMap4;
                                str2 = str20;
                                try {
                                    str3 = str19;
                                    try {
                                        zzj3.zzu.zzaW().zze().zzd("Failed to merge filter results. appId, audienceId, error", zzhe.zzn(str22), Integer.valueOf(i3), e5);
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        zzj3.zzu.zzaW().zze().zzc("Database error querying filter results. appId", zzhe.zzn(str22), e);
                                        Map emptyMap3 = Collections.emptyMap();
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        r13 = emptyMap3;
                                        if (r13.isEmpty()) {
                                        }
                                        String str23 = "Skipping failed audience ID";
                                        if (!list.isEmpty()) {
                                        }
                                        String str24 = str15;
                                        String str25 = str6;
                                        if (!z) {
                                        }
                                    }
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    str3 = str19;
                                    zzj3.zzu.zzaW().zze().zzc("Database error querying filter results. appId", zzhe.zzn(str22), e);
                                    Map emptyMap32 = Collections.emptyMap();
                                    if (cursor2 != null) {
                                    }
                                    r13 = emptyMap32;
                                    if (r13.isEmpty()) {
                                    }
                                    String str232 = "Skipping failed audience ID";
                                    if (!list.isEmpty()) {
                                    }
                                    String str242 = str15;
                                    String str252 = str6;
                                    if (!z) {
                                    }
                                }
                            }
                            if (!cursor2.moveToNext()) {
                                break;
                            }
                            arrayMap4 = arrayMap2;
                            str20 = str2;
                            str19 = str3;
                        }
                        cursor2.close();
                        r13 = arrayMap2;
                    }
                    if (r13.isEmpty()) {
                        HashSet<Integer> hashSet = new HashSet(r13.keySet());
                        if (z2) {
                            String str26 = this.zza;
                            zzaw zzj4 = this.zzg.zzj();
                            String str27 = this.zza;
                            zzj4.zzav();
                            zzj4.zzg();
                            Preconditions.checkNotEmpty(str27);
                            Map arrayMap5 = new ArrayMap();
                            SQLiteDatabase zzj5 = zzj4.zzj();
                            try {
                                try {
                                    cursor3 = zzj5.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str27, str27});
                                    try {
                                        if (cursor3.moveToFirst()) {
                                            do {
                                                Integer valueOf2 = Integer.valueOf(cursor3.getInt(0));
                                                List list8 = (List) arrayMap5.get(valueOf2);
                                                if (list8 == null) {
                                                    list8 = new ArrayList();
                                                    arrayMap5.put(valueOf2, list8);
                                                }
                                                list8.add(Integer.valueOf(cursor3.getInt(1)));
                                            } while (cursor3.moveToNext());
                                        } else {
                                            arrayMap5 = Collections.emptyMap();
                                        }
                                    } catch (SQLiteException e8) {
                                        e = e8;
                                        zzj4.zzu.zzaW().zze().zzc("Database error querying scoped filters. appId", zzhe.zzn(str27), e);
                                        arrayMap5 = Collections.emptyMap();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r5 = zzj5;
                                    if (r5 != 0) {
                                        r5.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e9) {
                                e = e9;
                                cursor3 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                r5 = 0;
                                if (r5 != 0) {
                                }
                                throw th;
                            }
                            cursor3.close();
                            Preconditions.checkNotEmpty(str26);
                            Preconditions.checkNotNull(r13);
                            ArrayMap arrayMap6 = new ArrayMap();
                            if (!r13.isEmpty()) {
                                Iterator it7 = r13.keySet().iterator();
                                while (it7.hasNext()) {
                                    Integer num2 = (Integer) it7.next();
                                    num2.intValue();
                                    com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) r13.get(num2);
                                    List list9 = (List) arrayMap5.get(num2);
                                    if (list9 == null || list9.isEmpty()) {
                                        map2 = arrayMap5;
                                        it = it7;
                                        str10 = str18;
                                        arrayMap6.put(num2, zzicVar);
                                    } else {
                                        zzpv zzpvVar = this.zzg;
                                        map2 = arrayMap5;
                                        it = it7;
                                        List zzt = zzpvVar.zzA().zzt(zzicVar.zzi(), list9);
                                        if (zzt.isEmpty()) {
                                            arrayMap5 = map2;
                                            it7 = it;
                                        } else {
                                            com.google.android.gms.internal.measurement.zzib zzibVar = (com.google.android.gms.internal.measurement.zzib) zzicVar.zzch();
                                            zzibVar.zzf();
                                            zzibVar.zzb(zzt);
                                            List zzt2 = zzpvVar.zzA().zzt(zzicVar.zzk(), list9);
                                            zzibVar.zzh();
                                            zzibVar.zzd(zzt2);
                                            ArrayList arrayList = new ArrayList();
                                            Iterator it8 = zzicVar.zzh().iterator();
                                            while (it8.hasNext()) {
                                                Iterator it9 = it8;
                                                com.google.android.gms.internal.measurement.zzhk zzhkVar = (com.google.android.gms.internal.measurement.zzhk) it8.next();
                                                String str28 = str18;
                                                if (!list9.contains(Integer.valueOf(zzhkVar.zza()))) {
                                                    arrayList.add(zzhkVar);
                                                }
                                                it8 = it9;
                                                str18 = str28;
                                            }
                                            str10 = str18;
                                            zzibVar.zze();
                                            zzibVar.zza(arrayList);
                                            ArrayList arrayList2 = new ArrayList();
                                            for (com.google.android.gms.internal.measurement.zzie zzieVar : zzicVar.zzj()) {
                                                if (!list9.contains(Integer.valueOf(zzieVar.zzb()))) {
                                                    arrayList2.add(zzieVar);
                                                }
                                            }
                                            zzibVar.zzg();
                                            zzibVar.zzc(arrayList2);
                                            arrayMap6.put(num2, (com.google.android.gms.internal.measurement.zzic) zzibVar.zzba());
                                        }
                                    }
                                    arrayMap5 = map2;
                                    it7 = it;
                                    str18 = str10;
                                }
                            }
                            str4 = str18;
                            arrayMap = arrayMap6;
                        } else {
                            str4 = "Database error querying filters. appId";
                            arrayMap = r13;
                        }
                        Map map5 = r13;
                        for (Integer num3 : hashSet) {
                            num3.intValue();
                            com.google.android.gms.internal.measurement.zzic zzicVar2 = (com.google.android.gms.internal.measurement.zzic) arrayMap.get(num3);
                            BitSet bitSet = new BitSet();
                            BitSet bitSet2 = new BitSet();
                            ArrayMap arrayMap7 = new ArrayMap();
                            if (zzicVar2 != null && zzicVar2.zza() != 0) {
                                for (com.google.android.gms.internal.measurement.zzhk zzhkVar2 : zzicVar2.zzh()) {
                                    if (zzhkVar2.zzh()) {
                                        arrayMap7.put(Integer.valueOf(zzhkVar2.zza()), zzhkVar2.zzg() ? Long.valueOf(zzhkVar2.zzb()) : null);
                                    }
                                }
                            }
                            ArrayMap arrayMap8 = new ArrayMap();
                            if (zzicVar2 != null && zzicVar2.zzc() != 0) {
                                Iterator it10 = zzicVar2.zzj().iterator();
                                while (it10.hasNext()) {
                                    com.google.android.gms.internal.measurement.zzie zzieVar2 = (com.google.android.gms.internal.measurement.zzie) it10.next();
                                    if (zzieVar2.zzi() && zzieVar2.zza() > 0) {
                                        arrayMap8.put(Integer.valueOf(zzieVar2.zzb()), Long.valueOf(zzieVar2.zzc(zzieVar2.zza() - 1)));
                                        arrayMap = arrayMap;
                                        it10 = it10;
                                    }
                                }
                            }
                            ArrayMap arrayMap9 = arrayMap;
                            if (zzicVar2 != null) {
                                int i4 = 0;
                                while (i4 < zzicVar2.zzd() * 64) {
                                    if (zzqa.zzy(zzicVar2.zzk(), i4)) {
                                        str9 = str17;
                                        this.zzu.zzaW().zzj().zzc("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i4));
                                        bitSet2.set(i4);
                                        if (zzqa.zzy(zzicVar2.zzi(), i4)) {
                                            bitSet.set(i4);
                                            i4++;
                                            str17 = str9;
                                        }
                                    } else {
                                        str9 = str17;
                                    }
                                    arrayMap7.remove(Integer.valueOf(i4));
                                    i4++;
                                    str17 = str9;
                                }
                            }
                            String str29 = str17;
                            com.google.android.gms.internal.measurement.zzic zzicVar3 = (com.google.android.gms.internal.measurement.zzic) map5.get(num3);
                            if (zzx2 && zzx && (list3 = (List) map.get(num3)) != null && this.zze != null && this.zzd != null) {
                                for (com.google.android.gms.internal.measurement.zzfj zzfjVar2 : list3) {
                                    int zzb = zzfjVar2.zzb();
                                    long longValue = this.zze.longValue() / 1000;
                                    if (zzfjVar2.zzm()) {
                                        longValue = this.zzd.longValue() / 1000;
                                    }
                                    Integer valueOf3 = Integer.valueOf(zzb);
                                    if (arrayMap7.containsKey(valueOf3)) {
                                        arrayMap7.put(valueOf3, Long.valueOf(longValue));
                                    }
                                    if (arrayMap8.containsKey(valueOf3)) {
                                        arrayMap8.put(valueOf3, Long.valueOf(longValue));
                                    }
                                }
                            }
                            this.zzc.put(num3, new zzy(this, this.zza, zzicVar3, bitSet, bitSet2, arrayMap7, arrayMap8, null));
                            str17 = str29;
                            zzx = zzx;
                            map = map;
                            arrayMap = arrayMap9;
                            str2 = str2;
                            map5 = map5;
                        }
                        str5 = str17;
                        str6 = str2;
                        str7 = str3;
                        str8 = str4;
                    } else {
                        str8 = "Database error querying filters. appId";
                        str5 = "Failed to merge filter. appId";
                        str6 = str2;
                        str7 = str3;
                    }
                    String str2322 = "Skipping failed audience ID";
                    if (!list.isEmpty()) {
                        zzz zzzVar2 = new zzz(this, null);
                        ArrayMap arrayMap10 = new ArrayMap();
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            com.google.android.gms.internal.measurement.zzhm zzhmVar = (com.google.android.gms.internal.measurement.zzhm) it11.next();
                            com.google.android.gms.internal.measurement.zzhm zza = zzzVar2.zza(this.zza, zzhmVar);
                            if (zza != null) {
                                zzpv zzpvVar2 = this.zzg;
                                zzbd zzr = zzpvVar2.zzj().zzr(this.zza, zzhmVar, zza.zzh());
                                zzpvVar2.zzj().zzV(zzr);
                                if (!z) {
                                    long j2 = zzr.zzc;
                                    String zzh = zza.zzh();
                                    Map map6 = (Map) arrayMap10.get(zzh);
                                    if (map6 == null) {
                                        zzaw zzj6 = zzpvVar2.zzj();
                                        String str30 = this.zza;
                                        zzj6.zzav();
                                        zzj6.zzg();
                                        Preconditions.checkNotEmpty(str30);
                                        Preconditions.checkNotEmpty(zzh);
                                        zzzVar = zzzVar2;
                                        ArrayMap arrayMap11 = new ArrayMap();
                                        it2 = it11;
                                        str11 = str15;
                                        str12 = str6;
                                        String str31 = str7;
                                        try {
                                            try {
                                                j = j2;
                                                try {
                                                    Cursor query = zzj6.zzj().query("event_filters", new String[]{str12, str31}, "app_id=? AND event_name=?", new String[]{str30, zzh}, null, null, null);
                                                    try {
                                                        try {
                                                            if (query.moveToFirst()) {
                                                                while (true) {
                                                                    try {
                                                                        com.google.android.gms.internal.measurement.zzfj zzfjVar3 = (com.google.android.gms.internal.measurement.zzfj) ((com.google.android.gms.internal.measurement.zzfi) zzqa.zzp(com.google.android.gms.internal.measurement.zzfj.zzc(), query.getBlob(1))).zzba();
                                                                        Integer valueOf4 = Integer.valueOf(query.getInt(0));
                                                                        List list10 = (List) arrayMap11.get(valueOf4);
                                                                        if (list10 == null) {
                                                                            str7 = str31;
                                                                            try {
                                                                                list4 = new ArrayList();
                                                                                arrayMap11.put(valueOf4, list4);
                                                                            } catch (SQLiteException e10) {
                                                                                e = e10;
                                                                                cursor4 = query;
                                                                                try {
                                                                                    zzj6.zzu.zzaW().zze().zzc(str8, zzhe.zzn(str30), e);
                                                                                    map6 = Collections.emptyMap();
                                                                                    if (cursor4 != null) {
                                                                                        cursor4.close();
                                                                                    }
                                                                                    arrayMap10.put(zzh, map6);
                                                                                    it3 = map6.keySet().iterator();
                                                                                    while (it3.hasNext()) {
                                                                                    }
                                                                                    zzzVar2 = zzzVar;
                                                                                    it11 = it2;
                                                                                    str6 = str12;
                                                                                    str15 = str11;
                                                                                } catch (Throwable th5) {
                                                                                    th = th5;
                                                                                    if (cursor4 != null) {
                                                                                        cursor4.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str7 = str31;
                                                                            list4 = list10;
                                                                        }
                                                                        list4.add(zzfjVar3);
                                                                    } catch (IOException e11) {
                                                                        str7 = str31;
                                                                        zzj6.zzu.zzaW().zze().zzc(str5, zzhe.zzn(str30), e11);
                                                                    }
                                                                    if (!query.moveToNext()) {
                                                                        break;
                                                                    }
                                                                    str31 = str7;
                                                                }
                                                                query.close();
                                                                map6 = arrayMap11;
                                                            } else {
                                                                str7 = str31;
                                                                map6 = Collections.emptyMap();
                                                                query.close();
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            cursor4 = query;
                                                            if (cursor4 != null) {
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (SQLiteException e12) {
                                                        e = e12;
                                                        str7 = str31;
                                                    }
                                                } catch (SQLiteException e13) {
                                                    e = e13;
                                                    str7 = str31;
                                                    cursor4 = null;
                                                    zzj6.zzu.zzaW().zze().zzc(str8, zzhe.zzn(str30), e);
                                                    map6 = Collections.emptyMap();
                                                    if (cursor4 != null) {
                                                    }
                                                    arrayMap10.put(zzh, map6);
                                                    it3 = map6.keySet().iterator();
                                                    while (it3.hasNext()) {
                                                    }
                                                    zzzVar2 = zzzVar;
                                                    it11 = it2;
                                                    str6 = str12;
                                                    str15 = str11;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                cursor4 = null;
                                            }
                                        } catch (SQLiteException e14) {
                                            e = e14;
                                            str7 = str31;
                                            j = j2;
                                        }
                                        arrayMap10.put(zzh, map6);
                                    } else {
                                        zzzVar = zzzVar2;
                                        it2 = it11;
                                        str11 = str15;
                                        j = j2;
                                        str12 = str6;
                                    }
                                    it3 = map6.keySet().iterator();
                                    while (it3.hasNext()) {
                                        Integer num4 = (Integer) it3.next();
                                        int intValue = num4.intValue();
                                        if (this.zzb.contains(num4)) {
                                            this.zzu.zzaW().zzj().zzb("Skipping failed audience ID", num4);
                                        } else {
                                            Iterator it12 = ((List) map6.get(num4)).iterator();
                                            boolean z3 = true;
                                            while (true) {
                                                if (!it12.hasNext()) {
                                                    map3 = map6;
                                                    it4 = it3;
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzfj zzfjVar4 = (com.google.android.gms.internal.measurement.zzfj) it12.next();
                                                zzaa zzaaVar = new zzaa(this, this.zza, intValue, zzfjVar4);
                                                map3 = map6;
                                                it4 = it3;
                                                z3 = zzaaVar.zzd(this.zzd, this.zze, zza, j, zzr, zzf(intValue, zzfjVar4.zzb()));
                                                if (!z3) {
                                                    this.zzb.add(num4);
                                                    break;
                                                }
                                                zzd(num4).zzc(zzaaVar);
                                                map6 = map3;
                                                it3 = it4;
                                            }
                                            if (!z3) {
                                                this.zzb.add(num4);
                                            }
                                            map6 = map3;
                                            it3 = it4;
                                        }
                                    }
                                    zzzVar2 = zzzVar;
                                    it11 = it2;
                                    str6 = str12;
                                    str15 = str11;
                                }
                            }
                        }
                    }
                    String str2422 = str15;
                    String str2522 = str6;
                    if (!z) {
                        return new ArrayList();
                    }
                    if (!list2.isEmpty()) {
                        ArrayMap arrayMap12 = new ArrayMap();
                        Iterator it13 = list2.iterator();
                        while (it13.hasNext()) {
                            com.google.android.gms.internal.measurement.zzio zzioVar3 = (com.google.android.gms.internal.measurement.zzio) it13.next();
                            String zzg = zzioVar3.zzg();
                            Map map7 = (Map) arrayMap12.get(zzg);
                            if (map7 == null) {
                                zzaw zzj7 = this.zzg.zzj();
                                String str32 = this.zza;
                                zzj7.zzav();
                                zzj7.zzg();
                                Preconditions.checkNotEmpty(str32);
                                Preconditions.checkNotEmpty(zzg);
                                ArrayMap arrayMap13 = new ArrayMap();
                                str13 = str7;
                                try {
                                    cursor6 = zzj7.zzj().query("property_filters", new String[]{str2522, str13}, "app_id=? AND property_name=?", new String[]{str32, zzg}, null, null, null);
                                    try {
                                        try {
                                        } catch (Throwable th8) {
                                            th = th8;
                                            cursor5 = cursor6;
                                            if (cursor5 != null) {
                                                cursor5.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e15) {
                                        e = e15;
                                        it5 = it13;
                                    }
                                } catch (SQLiteException e16) {
                                    e = e16;
                                    it5 = it13;
                                    cursor6 = null;
                                } catch (Throwable th9) {
                                    th = th9;
                                    cursor5 = null;
                                }
                                if (cursor6.moveToFirst()) {
                                    while (true) {
                                        try {
                                            com.google.android.gms.internal.measurement.zzfr zzfrVar2 = (com.google.android.gms.internal.measurement.zzfr) ((com.google.android.gms.internal.measurement.zzfq) zzqa.zzp(com.google.android.gms.internal.measurement.zzfr.zzc(), cursor6.getBlob(1))).zzba();
                                            Integer valueOf5 = Integer.valueOf(cursor6.getInt(0));
                                            List list11 = (List) arrayMap13.get(valueOf5);
                                            if (list11 == null) {
                                                list5 = new ArrayList();
                                                arrayMap13.put(valueOf5, list5);
                                            } else {
                                                list5 = list11;
                                            }
                                            list5.add(zzfrVar2);
                                            it5 = it13;
                                        } catch (IOException e17) {
                                            it5 = it13;
                                            try {
                                                zzj7.zzu.zzaW().zze().zzc("Failed to merge filter", zzhe.zzn(str32), e17);
                                            } catch (SQLiteException e18) {
                                                e = e18;
                                                zzj7.zzu.zzaW().zze().zzc(str8, zzhe.zzn(str32), e);
                                                map7 = Collections.emptyMap();
                                            }
                                        }
                                        if (!cursor6.moveToNext()) {
                                            break;
                                        }
                                        it13 = it5;
                                    }
                                    cursor6.close();
                                    map7 = arrayMap13;
                                    arrayMap12.put(zzg, map7);
                                } else {
                                    it5 = it13;
                                    map7 = Collections.emptyMap();
                                    cursor6.close();
                                    arrayMap12.put(zzg, map7);
                                }
                            } else {
                                it5 = it13;
                                str13 = str7;
                            }
                            Iterator it14 = map7.keySet().iterator();
                            while (true) {
                                if (it14.hasNext()) {
                                    Integer num5 = (Integer) it14.next();
                                    int intValue2 = num5.intValue();
                                    if (this.zzb.contains(num5)) {
                                        this.zzu.zzaW().zzj().zzb(str2322, num5);
                                        break;
                                    }
                                    Iterator it15 = ((List) map7.get(num5)).iterator();
                                    boolean z4 = true;
                                    while (true) {
                                        if (!it15.hasNext()) {
                                            map4 = map7;
                                            str14 = str2322;
                                            break;
                                        }
                                        zzfrVar = (com.google.android.gms.internal.measurement.zzfr) it15.next();
                                        zzioVar = this.zzu;
                                        if (Log.isLoggable(zzioVar.zzaW().zzr(), 2)) {
                                            zzhc zzj8 = zzioVar.zzaW().zzj();
                                            if (zzfrVar.zzj()) {
                                                num = Integer.valueOf(zzfrVar.zza());
                                                map4 = map7;
                                            } else {
                                                map4 = map7;
                                                num = null;
                                            }
                                            str14 = str2322;
                                            zzj8.zzd("Evaluating filter. audience, filter, property", num5, num, zzioVar.zzj().zzf(zzfrVar.zze()));
                                            zzioVar.zzaW().zzj().zzb("Filter definition", this.zzg.zzA().zzs(zzfrVar));
                                        } else {
                                            map4 = map7;
                                            str14 = str2322;
                                        }
                                        if (!zzfrVar.zzj() || zzfrVar.zza() > 256) {
                                            break;
                                        }
                                        zzac zzacVar = new zzac(this, this.zza, intValue2, zzfrVar);
                                        z4 = zzacVar.zzd(this.zzd, this.zze, zzioVar3, zzf(intValue2, zzfrVar.zza()));
                                        if (!z4) {
                                            this.zzb.add(num5);
                                            break;
                                        }
                                        zzd(num5).zzc(zzacVar);
                                        map7 = map4;
                                        str2322 = str14;
                                    }
                                    zzioVar.zzaW().zzk().zzc("Invalid property filter ID. appId, id", zzhe.zzn(this.zza), String.valueOf(zzfrVar.zzj() ? Integer.valueOf(zzfrVar.zza()) : null));
                                    this.zzb.add(num5);
                                    map7 = map4;
                                    str2322 = str14;
                                }
                            }
                            it13 = it5;
                            str7 = str13;
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Set<Integer> keySet = this.zzc.keySet();
                    keySet.removeAll(this.zzb);
                    for (Integer num6 : keySet) {
                        int intValue3 = num6.intValue();
                        zzy zzyVar = (zzy) this.zzc.get(num6);
                        Preconditions.checkNotNull(zzyVar);
                        com.google.android.gms.internal.measurement.zzhi zza2 = zzyVar.zza(intValue3);
                        arrayList3.add(zza2);
                        zzaw zzj9 = this.zzg.zzj();
                        String str33 = this.zza;
                        com.google.android.gms.internal.measurement.zzic zzd = zza2.zzd();
                        zzj9.zzav();
                        zzj9.zzg();
                        Preconditions.checkNotEmpty(str33);
                        Preconditions.checkNotNull(zzd);
                        byte[] zzcd = zzd.zzcd();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str33);
                        contentValues2.put(str2522, num6);
                        String str34 = str2422;
                        contentValues2.put(str34, zzcd);
                        try {
                        } catch (SQLiteException e19) {
                            e = e19;
                        }
                        try {
                            if (zzj9.zzj().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                                zzj9.zzu.zzaW().zze().zzb("Failed to insert filter results (got -1). appId", zzhe.zzn(str33));
                            }
                        } catch (SQLiteException e20) {
                            e = e20;
                            zzj9.zzu.zzaW().zze().zzc("Error storing filter results. appId", zzhe.zzn(str33), e);
                            str2422 = str34;
                        }
                        str2422 = str34;
                    }
                    return arrayList3;
                }
                emptyMap = Collections.emptyMap();
                cursor8.close();
            }
            if (cursor2.moveToFirst()) {
            }
            if (r13.isEmpty()) {
            }
            String str23222 = "Skipping failed audience ID";
            if (!list.isEmpty()) {
            }
            String str24222 = str15;
            String str25222 = str6;
            if (!z) {
            }
        } catch (Throwable th10) {
            th = th10;
            Cursor cursor9 = cursor2;
            if (cursor9 != null) {
                cursor9.close();
            }
            throw th;
        }
        map = emptyMap;
        zzaw zzj32 = this.zzg.zzj();
        String str222 = this.zza;
        zzj32.zzav();
        zzj32.zzg();
        Preconditions.checkNotEmpty(str222);
        cursor2 = zzj32.zzj().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str222}, null, null, null);
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
        return false;
    }
}
