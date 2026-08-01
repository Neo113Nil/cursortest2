package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class lt {
    public static final n40 a = new n40(2);
    public static final rh b = new rh(3);

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (defpackage.rx0.a(r5) == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        r0.add(new defpackage.wt[]{new defpackage.wt(r4, r3.f)});
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a7 a(Context context, List list) {
        ch0.d("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                mt mtVar = (mt) list.get(i);
                if (Build.VERSION.SDK_INT >= 31) {
                    String str = mtVar.e;
                    ze0 ze0Var = rx0.a;
                    Typeface typeface = null;
                    if (str != null && !str.isEmpty()) {
                        Typeface create = Typeface.create(str, 0);
                        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
                        if (create != null && !create.equals(create2)) {
                            typeface = create;
                        }
                    }
                }
                ProviderInfo b2 = b(context.getPackageManager(), mtVar, context.getResources());
                if (b2 == null) {
                    return new a7(2);
                }
                arrayList.add(c(context, mtVar, b2.authority));
            }
            return new a7(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, mt mtVar, Resources resources) {
        rh rhVar = b;
        n40 n40Var = a;
        ch0.d("FontProvider.getProvider");
        try {
            List list = mtVar.d;
            String str = mtVar.a;
            String str2 = mtVar.b;
            if (list == null) {
                list = px0.Q(resources, 0);
            }
            kt ktVar = new kt();
            ktVar.a = str;
            ktVar.b = str2;
            ktVar.c = list;
            ProviderInfo providerInfo = (ProviderInfo) n40Var.a(ktVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, rhVar);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, rhVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    n40Var.b(ktVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125 A[Catch: all -> 0x0145, TRY_ENTER, TryCatch #1 {all -> 0x0145, blocks: (B:3:0x000b, B:5:0x0040, B:54:0x0125, B:55:0x0128, B:73:0x013e, B:74:0x0141, B:75:0x0144, B:76:0x0046, B:8:0x004c, B:22:0x0099, B:24:0x009e, B:26:0x00a4, B:27:0x00cd, B:31:0x00d6, B:33:0x00e3, B:35:0x00ee, B:38:0x0103, B:41:0x010f, B:45:0x011a, B:49:0x00f8, B:68:0x0138, B:69:0x013b), top: B:2:0x000b, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wt[] c(Context context, mt mtVar, String str) {
        ch0.d("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            jt jtVar = Build.VERSION.SDK_INT < 24 ? new jt(context, build, 0) : new jt(context, build, 1);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                ch0.d("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {mtVar.c};
                    switch (jtVar.a) {
                        case 0:
                            ContentProviderClient contentProviderClient = jtVar.b;
                            if (contentProviderClient != null) {
                                try {
                                    cursor = contentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                                } catch (RemoteException e) {
                                    Log.w("FontsProvider", "Unable to query the content provider", e);
                                }
                            }
                            Trace.endSection();
                            if (cursor != null && cursor.getCount() > 0) {
                                int columnIndex = cursor.getColumnIndex("result_code");
                                arrayList = new ArrayList();
                                int columnIndex2 = cursor.getColumnIndex("_id");
                                int columnIndex3 = cursor.getColumnIndex("file_id");
                                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                                int columnIndex5 = cursor.getColumnIndex("font_weight");
                                int columnIndex6 = cursor.getColumnIndex("font_italic");
                                while (cursor.moveToNext()) {
                                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                                    arrayList.add(new wt(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                                }
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            jtVar.a();
                            return (wt[]) arrayList.toArray(new wt[0]);
                        default:
                            ContentProviderClient contentProviderClient2 = jtVar.b;
                            if (contentProviderClient2 != null) {
                                try {
                                    cursor = contentProviderClient2.query(build, strArr, "query = ?", strArr2, null, null);
                                } catch (RemoteException e2) {
                                    Log.w("FontsProvider", "Unable to query the content provider", e2);
                                }
                            }
                            Trace.endSection();
                            if (cursor != null) {
                                int columnIndex7 = cursor.getColumnIndex("result_code");
                                arrayList = new ArrayList();
                                int columnIndex22 = cursor.getColumnIndex("_id");
                                int columnIndex32 = cursor.getColumnIndex("file_id");
                                int columnIndex42 = cursor.getColumnIndex("font_ttc_index");
                                int columnIndex52 = cursor.getColumnIndex("font_weight");
                                int columnIndex62 = cursor.getColumnIndex("font_italic");
                                while (cursor.moveToNext()) {
                                }
                                break;
                            }
                            if (cursor != null) {
                            }
                            jtVar.a();
                            return (wt[]) arrayList.toArray(new wt[0]);
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                jtVar.a();
                throw th;
            }
        } finally {
        }
    }
}
